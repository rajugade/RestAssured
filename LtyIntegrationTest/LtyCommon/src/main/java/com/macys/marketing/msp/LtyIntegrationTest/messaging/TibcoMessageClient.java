package com.macys.marketing.msp.LtyIntegrationTest.messaging;

import java.util.Queue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;

import com.macys.marketing.msp.LtyIntegrationTest.LtyApplicationContext;
import com.macys.platform.messaging.client.exception.MessagingClientRuntimeException;

/**
 * 
 * @author rmarla
 * This class is for send a message to TIBCO queue and process the message from TIBCO queue
 *
 */
public class TibcoMessageClient {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(TibcoMessageClient.class);
	
	private TibcoMessageClient(){
		
	}
	
	public static Queue<String> processQueue() throws MessagingClientRuntimeException{
		ApplicationContext context = LtyApplicationContext.getInstance().getContext();
		TibcoMessageConsumerImpl tibcoConsumer = (TibcoMessageConsumerImpl)context.getBean(TibcoMessageConsumerImpl.class);
		
		//
		Queue<String> msgQueue = tibcoConsumer.getMessageQueue();
		LOGGER.info("Tibco message queue {}", msgQueue);
		return msgQueue;
	}
	
	public static void sendToQueue(String message)throws MessagingClientRuntimeException{
		ApplicationContext context = LtyApplicationContext.getInstance().getContext();
		TibcoMessageProducer prod = (TibcoMessageProducer)context.getBean(TibcoMessageProducer.class);
		prod.publishLtyOfferMessage(message);
		LOGGER.info("Tibco message publish to queue {}", message);
	}
}
