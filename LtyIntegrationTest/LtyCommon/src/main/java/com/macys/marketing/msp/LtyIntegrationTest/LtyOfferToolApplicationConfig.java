package com.macys.marketing.msp.LtyIntegrationTest;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * 
 * @author rmarla
 * Configuration class for loading Spring context file, Tibco config files
 *
 */
@Configuration
//@EnableAutoConfiguration
@ComponentScan(basePackages = { "com.macys.marketing.loyalty.messaging", 
								"com.macys.marketing.msp.LtyIntegrationTest",
								"com.macys.marketing.loyalty.LtyIntegrationTest.DataSource"})
@ImportResource(value = { 
		"classpath:ltyOffer.messaging.config.xml",
		"classpath:META-INF/spring/tibco-ssl-connection-config.xml",
		"classpath:META-INF/spring/messaging-client-config.xml"
		})
public class LtyOfferToolApplicationConfig{
	
	
}
