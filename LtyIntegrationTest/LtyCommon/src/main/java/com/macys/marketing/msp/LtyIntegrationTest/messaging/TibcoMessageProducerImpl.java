package com.macys.marketing.msp.LtyIntegrationTest.messaging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.macys.platform.messaging.client.exception.MessagingClientRuntimeException;
import com.macys.platform.messaging.client.tibco.producer.TibcoEmsProducer;


/**
 * 
 * @author vpula
 * This Spring component is for publish message to Tibco Queue
 *
 */
@Component
public class TibcoMessageProducerImpl implements TibcoMessageProducer {
	private Logger log = LoggerFactory.getLogger(TibcoMessageProducerImpl.class);

	private TibcoEmsProducer ltyMessageProducer;

	@Autowired
	public void setLtyMessageProducer(TibcoEmsProducer ltyMessageProducer) {
		this.ltyMessageProducer = ltyMessageProducer;
	}

	@Override
	public void publishLtyOfferMessage(String payload) throws MessagingClientRuntimeException{

		log.info("START ::LtyOfferMessageSender.publishLtyOfferMessage() ");

		try {
			
			log.info("Payload sent to the queue :: {}", payload);
			this.ltyMessageProducer.sendMessage(payload, null);
		
		} catch (MessagingClientRuntimeException emsEx) {
			log.error("MessagingClientRuntimeException While publishLtyOfferMessageToQueue :message::{},messageclientRuntimeException:: {}",emsEx);
			throw new MessagingClientRuntimeException();
		}
		log.info("END ::LtyOfferMessageSender.publishLtyOfferMessage()");

	}

	

}
