package main;

import java.util.HashMap;
import java.util.Map;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;

import kafka_message_mgmt.model.GatewayAssetReading;

@Configuration
public class GatewayIOConfig 
{

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, GatewayAssetReading> kafkaListenerContainerFactory() {
        ConcurrentKafkaListenerContainerFactory<String, GatewayAssetReading> factory = new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(consumerFactory("group_id"));
        return factory;
    }

    public ConsumerFactory<String, GatewayAssetReading> consumerFactory(String groupId) {
        Map<String, Object> props = new HashMap<>();
        
        // required consumer factory properties

        return new DefaultKafkaConsumerFactory<>(props);
    }
}
