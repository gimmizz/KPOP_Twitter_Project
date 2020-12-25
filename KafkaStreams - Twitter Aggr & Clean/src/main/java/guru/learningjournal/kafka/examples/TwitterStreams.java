package guru.learningjournal.kafka.examples;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.connect.json.JsonConverter;
import org.apache.kafka.connect.json.JsonDeserializer;
import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.Topology;
import org.apache.kafka.streams.kstream.Consumed;
import org.apache.kafka.streams.kstream.KStream;
import org.apache.kafka.streams.kstream.Produced;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

public class TwitterStreams {
    private static final Logger logger= LogManager.getLogger();

    public static void main(String[] args) {
        Properties props = new Properties();
        props.put(StreamsConfig.APPLICATION_ID_CONFIG, AppConfigs.applicationID);
        props.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, AppConfigs.bootstrapServers);
        //props.put(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG, AppSerdes.String().getClass());
        //props.put(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG, AppSerdes.Twitter().getClass());

        StreamsBuilder builder = new StreamsBuilder();
        List<String> topiclist = new ArrayList<>(Arrays.asList(AppConfigs.topicName2,AppConfigs.topicName, AppConfigs.topicName3, AppConfigs.topicName7));
        KStream<String, Twitter> KS0 = builder.stream(topiclist,
                Consumed.with(AppSerdes.String(), AppSerdes.Twitter()));

        KStream KS1 = KS0.mapValues(twitter -> Cleaner.getNotification(twitter));
        //KS0.foreach((k,v)-> System.out.println("k : "+k +" v : "+v));
        KS1.to(AppConfigs.topicName_final, Produced.with(AppSerdes.String(), AppSerdes.TwitterClean()));

        ///kStream.foreach((k,v)-> System.out.println("Addattribute = "+v.getAdditionalProperties()));

        Topology topology = builder.build();
        KafkaStreams streams = new KafkaStreams(topology, props);
        streams.start();

        Runtime.getRuntime().addShutdownHook(new Thread(() ->{
                logger.info("Shutting down");
        streams.close();
        }));
    }

}
