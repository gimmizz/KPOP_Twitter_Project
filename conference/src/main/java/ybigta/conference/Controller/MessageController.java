package ybigta.conference.Controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.handler.MessagingAdviceBean;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ybigta.conference.Domain.Message;
import ybigta.conference.Producer.MessageProducer;

@RestController
@Slf4j
public class MessageController {

    @Autowired
    MessageProducer messageProducer;

    @PostMapping("/board")
    public ResponseEntity<Message> postMessage(@RequestBody Message message) throws JsonProcessingException {
        log.info("Before Sending Message");
        messageProducer.sendMessage(message);
        log.info("Message Send Gooood");

        return ResponseEntity.status(HttpStatus.CREATED).body(message);



    }



}
