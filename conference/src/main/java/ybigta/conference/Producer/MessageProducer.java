package ybigta.conference.Producer;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.header.Header;
import org.apache.kafka.common.header.internals.RecordHeader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;
import ybigta.conference.Domain.Message;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@Component
@Slf4j
public class MessageProducer {

    @Autowired
    KafkaTemplate<Integer, String> kafkaTemplate;

    @Autowired
    ObjectMapper objectMapper;

    String topic = "ybigta_conference";

    public void sendMessage(Message message) throws JsonProcessingException {
        Integer key = message.getMessageid();
        String value = objectMapper.writeValueAsString(message);
        ProducerRecord<Integer, String> producerRecord = buildProducerRecord(key, value, topic);
        ListenableFuture<SendResult<Integer, String>> listenableFuture = kafkaTemplate.send(producerRecord);
        listenableFuture.addCallback(new ListenableFutureCallback<SendResult<Integer, String>>() {
            @Override
            public void onFailure(Throwable ex) {
                handleFailure(key, value, ex);


            }

            @Override
            public void onSuccess(SendResult<Integer, String> result) {
                handleSuccess(key, value, result);

            }
        });
    }

    private ProducerRecord<Integer, String> buildProducerRecord(Integer key, String value, String topic){

        List<Header> recordHeaders = List.of(new RecordHeader("event-source","scanner".getBytes()));
        return new ProducerRecord<>(topic, null, key, value, recordHeaders);
    }


    public SendResult<Integer, String> sendMessageSynchronous(Message message) throws JsonProcessingException, ExecutionException, InterruptedException, TimeoutException {
        Integer key = message.getMessageid();
        String value= objectMapper.writeValueAsString(message);
        SendResult<Integer, String> sendResult = null;
        try {
            sendResult = kafkaTemplate.sendDefault(key, value).get(1, TimeUnit.SECONDS);
        }catch(ExecutionException | InterruptedException e){
            log.error("Error Sending the Message and the exception is  {}",e.getMessage());
            throw e;
        }catch(Exception e){
            log.error("Exception sending the Message and the exception is {}",e.getMessage());
            throw e;
        }
        return sendResult;
    }


    public void handleSuccess(Integer key, String value, SendResult<Integer, String> result){
        log.info("Message Sent Successfully for the key : {} and the value is {}, partition is {}",key, value, result.getRecordMetadata().partition());
    }
    public void handleFailure(Integer key, String value, Throwable ex){
        log.error("Error Sending the Message and the exception is {}",ex.getMessage());
        try{
            throw ex;
        }catch(Throwable throwable){
            log.error("Error in OnFailure : {}", throwable.getMessage());
        }
    }

}
