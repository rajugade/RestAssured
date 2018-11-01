package com.macys.marketing.loyalty.LtyIntegrationTest.steps.dbConnectionCheck;

import java.sql.Connection;
//import org.springframework.jdbc.core.JdbcTemplate;

import org.assertj.core.api.SoftAssertions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.macys.marketing.loyalty.LtyIntegrationTest.DataSource.DataSourceManager;

import cucumber.api.java.en.Given;

public class DBConnectionCheckSteps {
	private static final Logger LOGGER = LoggerFactory.getLogger(DBConnectionCheckSteps.class);
	SoftAssertions softly = new SoftAssertions();
	DataSourceManager dataSourceManager = new DataSourceManager();
	Connection connection;
	// JdbcTemplate jdbcTemplate;

	@Given("^DataBase connection check Test$")
	public void database_connection_check_Test() throws Throwable {

		connection = dataSourceManager.getDataSource();

		LOGGER.info("connection........... {}", connection.toString());

		softly.assertThat(connection).isNotNull();
		softly.assertAll();
	}

}
