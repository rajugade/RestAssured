package com.macys.mockserver;

import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ImportResource("/config/testConfiguration.xml")
public class ServerContext {

	public static ApplicationContext applicationContext;
	private static Logger logger = LoggerFactory.getLogger(ServerContext.class);

	Properties properties = new Properties();

	public ApplicationContext loadContext() {
		logger.info("********loadContext starting*****");
		applicationContext = new ClassPathXmlApplicationContext("/config/testConfiguration.xml");
		logger.info("********loadContext ending*****");
		return applicationContext;
	}

}
