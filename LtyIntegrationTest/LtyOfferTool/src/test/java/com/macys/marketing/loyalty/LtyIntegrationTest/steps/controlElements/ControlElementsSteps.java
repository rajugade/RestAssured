package com.macys.marketing.loyalty.LtyIntegrationTest.steps.controlElements;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.macys.marketing.loyalty.LtyIntegrationTest.response.validators.ControlElementsValidator;
import com.macys.marketing.loyalty.LtyIntegrationTest.rest.model.offertool.ControlElementsResponse;
import com.macys.marketing.loyalty.LtyIntegrationTest.wrapper.ControlElementsWrapper;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.response.Response;

public class ControlElementsSteps {
	private static final Logger LOGGER = LoggerFactory.getLogger(ControlElementsSteps.class);
	Map<String, Object> response;
	ControlElementsWrapper controlelements = new ControlElementsWrapper();
	ControlElementsResponse controlElements;
	ControlElementsValidator validator = new ControlElementsValidator();
	@Given("^I invoke getcontrolelements api$")
	public void getControlElements(DataTable table) {
		LOGGER.info("Start of method :: controlElements");
		
		response =controlelements.getControlElements(table);
		
		Response actualResponse = (Response) response.get("ACTUAL_RESPONSE");
		
		controlElements = actualResponse.as(ControlElementsResponse.class);
		LOGGER.info("End of method :: controlElements");
	}
	
	@Then("^I Verify Control Elements API Response$")
	public void validateControlElements() {
		LOGGER.info("Start of method :: validateControlElements");

		validator.validate(response);

		LOGGER.info("End of method :: createOffer");
	}
}
