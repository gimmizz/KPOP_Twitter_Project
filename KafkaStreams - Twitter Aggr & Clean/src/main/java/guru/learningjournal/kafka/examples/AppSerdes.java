package guru.learningjournal.kafka.examples;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serdes;

import java.util.HashMap;
import java.util.Map;

public class AppSerdes extends Serdes {
    static final class TwitterSerde extends Serdes.WrapperSerde<Twitter>{
        TwitterSerde(){
            super(new JsonSerializer<>(), new JsonDeserializer<>());
        }
    }

    public static Serde<Twitter> Twitter(){
        TwitterSerde serde = new TwitterSerde();

        Map<String, Object> serdeConfigs = new HashMap<>();
        serdeConfigs.put(JsonDeserializer.VALUE_CLASS_NAME_CONFIG, Twitter.class);
        serde.configure(serdeConfigs,false);
        return serde;
    }


    static final class TwitterCleanSerde extends Serdes.WrapperSerde<TwitterClean>{
        TwitterCleanSerde(){
            super(new JsonSerializer<>(), new JsonDeserializer<>());
        }
    }

    public static Serde<TwitterClean> TwitterClean(){
        TwitterCleanSerde serde = new TwitterCleanSerde();

        Map<String, Object> serdeConfigs = new HashMap<>();
        serdeConfigs.put(JsonDeserializer.VALUE_CLASS_NAME_CONFIG, Twitter.class);

        serde.configure(serdeConfigs,false);
        return serde;
    }

}
