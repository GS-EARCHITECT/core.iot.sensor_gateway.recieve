package kafka_message_mgmt.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Map;

import org.apache.kafka.common.errors.SerializationException;
import org.apache.kafka.common.serialization.Deserializer;

public class GatewayAssetReadingDeSerializer implements Deserializer<GatewayAssetReading> 
{
    
	 private ObjectMapper objectMapper = new ObjectMapper();

	    @Override
	    public void configure(Map<String, ?> configs, boolean isKey) {
	    }

	    @Override
	    public GatewayAssetReading deserialize(String topic, byte[] data) 
	    {
	        try {
	            if (data == null){
	                System.out.println("Null received at deserializing");
	                return null;
	            }
	            System.out.println("Deserializing...");
	            return objectMapper.readValue(new String(data, "UTF-8"), GatewayAssetReading.class);
	        } catch (Exception e) {
	            throw new SerializationException("Error when deserializing byte[] to MessageDto");
	        }
	    }
	    
	    @Override
	    public void close() {
	    }
}