package com.macys.marketing.loyalty.LtyIntegrationTest.steps.tibcoconnectioncheck;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.macys.marketing.msp.LtyIntegrationTest.messaging.TibcoMessageClient;
import com.macys.platform.messaging.client.exception.MessagingClientRuntimeException;

import cucumber.api.java.en.Given;


public class TibcoConnectionCheckSteps {
	private final Logger LOGGER = LoggerFactory.getLogger(TibcoConnectionCheckSteps.class);
	@Given("^Tibco connection check Test$")
	public void tibco_connection_check_Test() throws MessagingClientRuntimeException, InterruptedException {
		 TibcoMessageClient.sendToQueue("test message");
		LOGGER.info("message send to queue");
		
		//Pause the thread for 3sec, as it need to init Tibco messaging service.
		Thread.sleep(3000);
		
		TibcoMessageClient.processQueue();
		LOGGER.info("queue processed");
	}
}
