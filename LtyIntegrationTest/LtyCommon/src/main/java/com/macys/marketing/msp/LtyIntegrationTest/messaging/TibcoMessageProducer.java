package com.macys.marketing.msp.LtyIntegrationTest.messaging;

import com.macys.platform.messaging.client.exception.MessagingClientRuntimeException;

/**
 * 
 * @author vpula
 *
 */
public interface TibcoMessageProducer {

	public void publishLtyOfferMessage(String payload) throws MessagingClientRuntimeException;

}
