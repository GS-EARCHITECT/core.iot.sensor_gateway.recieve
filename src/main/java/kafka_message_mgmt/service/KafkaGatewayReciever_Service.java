package kafka_message_mgmt.service;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;

import kafka_message_mgmt.model.GatewayAssetReading;

@Service("kafkaGatewayRecieverServ")
public class KafkaGatewayReciever_Service 
{
	private static final Logger logger = LoggerFactory.getLogger(KafkaGatewayReciever_Service.class);

	@Value("${topic.name.iotreadingproducer}")
	private String topicmyProducer;

	@Autowired
	private KafkaTemplate<String, GatewayAssetReading> kafkaTemplateRequest;

	@KafkaListener(topics = "${topic.name.iotreadingpconsumer}", groupId = "group_id", concurrency = "5")
	public void consume(ConsumerRecord<String, GatewayAssetReading> payload) 
	{
		logger.info("Ad No :" + payload.value().getAssetSeqNo());
		ListenableFuture<SendResult<String, GatewayAssetReading>> future = kafkaTemplateRequest.send(topicmyProducer,payload.value());
		
		future.addCallback(new ListenableFutureCallback<SendResult<String, GatewayAssetReading>>() 
		{

			@Override
			public void onSuccess(final SendResult<String, GatewayAssetReading> message) 
			{
				logger.info("Ad No :" + message.getProducerRecord().value().getAssetSeqNo());
				// logger.info("updated schedule for ruleline :" +
				// message.getProducerRecord().value().getReferenceSeqNo());
			}

			@Override
			public void onFailure(final Throwable throwable) {
				logger.error("unable to send message= ", throwable);
			}
		});

	}
}