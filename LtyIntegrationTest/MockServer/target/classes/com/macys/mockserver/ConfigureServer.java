package com.macys.mockserver;

import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.options;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import com.github.tomakehurst.wiremock.WireMockServer;

public class ConfigureServer {

	private static Logger logger = LoggerFactory.getLogger(ConfigureServer.class);
	public static void main(String[] args) throws InterruptedException {

		ServerContext runData = new ServerContext();
		ApplicationContext context = runData.loadContext();

		// Starting Wiremock server
		String host = context.getBean("wireMockHost", String.class);
		Integer port = context.getBean("wireMockPort", Integer.class);
		logger.info("Wire Mock Host: {} WIre Mock Port: {}", host, port);
		if (!host.isEmpty() && port > 0) {
			String testPath = ConfigureServer.class.getClassLoader().getResource("wiremock").getPath();
			logger.info("Wire Mock Test Path: " + testPath);
			WireMockServer wireMockServer = new WireMockServer(options().port(port).bindAddress(host).usingFilesUnderDirectory(testPath));
			wireMockServer.start();
			// System.out.println("WireMock started on host and port:::" + args[0]+"::"+args[1]);
		} else {
			logger.error("Either of Port Number / host address not gievn!!!!!!");
		}

	}
}
