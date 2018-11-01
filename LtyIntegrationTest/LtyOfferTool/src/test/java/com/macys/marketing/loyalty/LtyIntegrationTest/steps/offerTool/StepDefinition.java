package com.macys.marketing.loyalty.LtyIntegrationTest.steps.offerTool;

import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.macys.marketing.loyalty.LtyIntegrationTest.response.validators.LtyOfferResponseValidator;
import com.macys.marketing.loyalty.LtyIntegrationTest.rest.model.offertool.OfferResponse;
import com.macys.marketing.loyalty.LtyIntegrationTest.util.CommonUtility;
import com.macys.marketing.loyalty.LtyIntegrationTest.wrapper.OfferServiceWrapper;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.response.Response;

public class StepDefinition {

	private static final Logger LOGGER = LoggerFactory.getLogger(StepDefinition.class);
	OfferServiceWrapper offerService = new OfferServiceWrapper();
	String offerCode = null;
	Map<String, Object> response;
	LtyOfferResponseValidator validator = new LtyOfferResponseValidator();
	String events;
	DataTable CreateOfferTable;

	@Given("^I Create Offer$")
	public void createOffer(DataTable table) {
		LOGGER.info("Start of method :: createOffer");
		CreateOfferTable = table;
		events = CommonUtility.getDataTableMap(table).get("eventType");
		Map<String, String> dynamicReq = new HashMap<String, String>();

		dynamicReq = PopulateRequest(table);

		response = offerService.createOffer(table, dynamicReq);
		if (CommonUtility.getDataTableMap(table).get("eventType") != null) {

			eventTypesMethod();
		}
		if (CommonUtility.getDataTableMap(table).get("offerType") != null) {

			offerTypesMethod(table);
		}
		Response actualResponse = (Response) response.get("ACTUAL_RESPONSE");
		OfferResponse offerResponse = actualResponse.as(OfferResponse.class);
		offerCode = offerResponse.getRewardOffer().getOfferHeader().getOfferCode();

		LOGGER.info("End of method :: createOffer");
	}

	@Then("^I Verify Offer Response$")
	public void validateOffer() {
		LOGGER.info("Start of method :: createOffer");

		validator.validate(response);

		LOGGER.info("End of method :: createOffer");
	}

	@And("^I update offer status$")
	public void approveOffer(DataTable table) {
		LOGGER.info("Start of method :: approveOffer");

		offerService.updateOfferStatus(table, offerCode);

		LOGGER.info("End of method :: approveOffer");
	}

	@And("^I Retrieve offer$")
	public void retrieveOffer(DataTable table) {
		LOGGER.info("Start of method :: approveOffer");

		response = offerService.retrieveOffer(table, offerCode);
		if (events != null) {
			eventTypesMethod();
		}
		if (CommonUtility.getDataTableMap(table).get("offerType") != null) {
			offerTypesMethod(table);
		}
		LOGGER.info("End of method :: approveOffer");
	}

	@And("^I Delete offer$")
	public void deleteOffer(DataTable table) {
		LOGGER.info("Start of method :: approveOffer");

		offerService.deleteOffer(table, offerCode);

		LOGGER.info("End of method :: approveOffer");
	}

	@And("^I retrieve activitylog$")
	public void retrieveActivityLog(DataTable table) {
		LOGGER.info("Start of method :: retrieveActivityLog");

		response = offerService.retrieveActivity(table, offerCode);
		if (events != null) {
			eventTypesMethod();
		}
		if (CommonUtility.getDataTableMap(table).get("offerType") != null) {
			offerTypesMethod(table);
		}
		LOGGER.info("End of method :: retrieveActivityLog");
	}

	@Then("^I Verify Activity Log Response$")
	public void validateActivityLog() {
		LOGGER.info("Start of method :: validateActivityLog");

		validator.validateActivityLog(response);

		LOGGER.info("End of method :: ValidateActivityLog");
	}

	private void eventTypesMethod() {
		String expected = (String) response.get("EXPECTED_RESPONSE");
		expected = expected.replace("eventTypes", events);

		response.put("EXPECTED_RESPONSE", expected);

	}

	/*
	 * Populates the Values in Response File dynamically from the dataTable in
	 * Retrieve offer step
	 */
	private void offerTypesMethod(DataTable table) {
		String expected = (String) response.get("EXPECTED_RESPONSE");
		if (CommonUtility.getDataTableMap(table).get("offerType") != null) {
			expected = expected.replace("offerTypeVal", CommonUtility.getDataTableMap(table).get("offerType"));

			if (CommonUtility.getDataTableMap(table).get("offerType").equals("9")) {
				expected = expected.replace("txnSpendMinVal", CommonUtility.getDataTableMap(table).get("txnSpendMin"));
				expected = expected.replace("txnSpendMaxVal", CommonUtility.getDataTableMap(table).get("txnSpendMax"));
				expected = expected.replace("multiplierVal", "");
				expected = expected.replace("deptSpendMinVal", "");
				expected = expected.replace("deptSpendMaxVal", "");
				expected = expected.replace("pointsVal", CommonUtility.getDataTableMap(table).get("points"));
			}
			if (CommonUtility.getDataTableMap(table).get("offerType").equals("11")) {
				expected = expected.replace("deptSpendMinVal", "");
				expected = expected.replace("multiplierVal", CommonUtility.getDataTableMap(table).get("multiplier"));
				expected = expected.replace("txnSpendMaxVal", CommonUtility.getDataTableMap(table).get("txnSpendMax"));
				expected = expected.replace("txnSpendMinVal", CommonUtility.getDataTableMap(table).get("txnSpendMin"));
				expected = expected.replace("deptSpendMaxVal", "");
				expected = expected.replace("pointsVal", "");
				expected = expected.replace("validInDaysVal", CommonUtility.getDataTableMap(table).get("validInDays"));
				expected = expected.replace("triggerOfferEventPeriodVal",
						CommonUtility.getDataTableMap(table).get("triggerOfferEventPeriod"));
			}

			if (CommonUtility.getDataTableMap(table).get("offerType").equals("12")) {
				expected = expected.replace("multiplierVal", CommonUtility.getDataTableMap(table).get("multiplier"));
				expected = expected.replace("txnSpendMinVal", "");
				expected = expected.replace("deptSpendMinVal", "");
				expected = expected.replace("deptSpendMaxVal", "");
				expected = expected.replace("txnSpendMaxVal", "");
				expected = expected.replace("pointsVal", "");
			}

			if (CommonUtility.getDataTableMap(table).get("offerType").equals("13")) {
				expected = expected.replace("txnSpendMinVal", CommonUtility.getDataTableMap(table).get("txnSpendMin"));
				expected = expected.replace("multiplierVal", CommonUtility.getDataTableMap(table).get("multiplier"));
				expected = expected.replace("deptSpendMinVal", "");
				expected = expected.replace("deptSpendMaxVal", "");
				expected = expected.replace("txnSpendMaxVal", "");
				expected = expected.replace("pointsVal", "");
				expected = expected.replace("validInDaysVal", CommonUtility.getDataTableMap(table).get("validInDays"));
				expected = expected.replace("triggerOfferEventPeriodVal",
						CommonUtility.getDataTableMap(table).get("triggerOfferEventPeriod"));
			}
			if (CommonUtility.getDataTableMap(table).get("offerType").equals("14")) {
				expected = expected.replace("deptSpendMinVal",
						CommonUtility.getDataTableMap(table).get("deptSpendMin"));
				expected = expected.replace("multiplierVal", CommonUtility.getDataTableMap(table).get("multiplier"));
				expected = expected.replace("txnSpendMinVal", "");
				expected = expected.replace("deptSpendMaxVal", "");
				expected = expected.replace("txnSpendMaxVal", "");
				expected = expected.replace("pointsVal", "");
				expected = expected.replace("validInDaysVal", CommonUtility.getDataTableMap(table).get("validInDays"));
				expected = expected.replace("triggerOfferEventPeriodVal",
						CommonUtility.getDataTableMap(table).get("triggerOfferEventPeriod"));
			}

		}

		response.put("EXPECTED_RESPONSE", expected);
	}

	/*
	 * Populates the Values in Request File dynamically from the dataTable in Create
	 * offer step
	 */
	private Map<String, String> PopulateRequest(DataTable table) {
		Map<String, String> dynamicReq = new HashMap<String, String>();
		if (CommonUtility.getDataTableMap(table).get("eventType") != null) {
			dynamicReq.put("eventTypes", CommonUtility.getDataTableMap(table).get("eventType"));
		}

		if (CommonUtility.getDataTableMap(table).get("offerType") != null) {
			dynamicReq.put("offerTypeVal", CommonUtility.getDataTableMap(table).get("offerType"));

			if (CommonUtility.getDataTableMap(table).get("offerType").equals("9")) {
				dynamicReq.put("txnSpendMinVal", CommonUtility.getDataTableMap(table).get("txnSpendMin"));
				dynamicReq.put("txnSpendMaxVal", CommonUtility.getDataTableMap(table).get("txnSpendMax"));
				dynamicReq.put("multiplierVal", "");
				dynamicReq.put("deptSpendMinVal", "");
				dynamicReq.put("deptSpendMaxVal", "");
				dynamicReq.put("pointsVal", CommonUtility.getDataTableMap(table).get("points"));
			}
			if (CommonUtility.getDataTableMap(table).get("offerType").equals("11")) {
				dynamicReq.put("deptSpendMinVal", "");
				dynamicReq.put("multiplierVal", CommonUtility.getDataTableMap(table).get("multiplier"));
				dynamicReq.put("txnSpendMaxVal", CommonUtility.getDataTableMap(table).get("txnSpendMax"));
				dynamicReq.put("txnSpendMinVal", CommonUtility.getDataTableMap(table).get("txnSpendMin"));
				dynamicReq.put("deptSpendMaxVal", "");
				dynamicReq.put("pointsVal", "");
				dynamicReq.put("validInDaysVal", CommonUtility.getDataTableMap(table).get("validInDays"));
				dynamicReq.put("triggerOfferEventPeriodVal",
						CommonUtility.getDataTableMap(table).get("triggerOfferEventPeriod"));
			}
			if (CommonUtility.getDataTableMap(table).get("offerType").equals("12")) {
				dynamicReq.put("multiplierVal", CommonUtility.getDataTableMap(table).get("multiplier"));
				dynamicReq.put("txnSpendMinVal", "");
				dynamicReq.put("txnSpendMaxVal", "");
				dynamicReq.put("deptSpendMinVal", "");
				dynamicReq.put("deptSpendMaxVal", "");
				dynamicReq.put("pointsVal", "");
			}
			if (CommonUtility.getDataTableMap(table).get("offerType").equals("13")) {
				dynamicReq.put("txnSpendMinVal", CommonUtility.getDataTableMap(table).get("txnSpendMin"));
				dynamicReq.put("multiplierVal", CommonUtility.getDataTableMap(table).get("multiplier"));
				dynamicReq.put("txnSpendMaxVal", "");
				dynamicReq.put("deptSpendMinVal", "");
				dynamicReq.put("deptSpendMaxVal", "");
				dynamicReq.put("pointsVal", "");
				dynamicReq.put("validInDaysVal", CommonUtility.getDataTableMap(table).get("validInDays"));
				dynamicReq.put("triggerOfferEventPeriodVal",
						CommonUtility.getDataTableMap(table).get("triggerOfferEventPeriod"));
			}
			if (CommonUtility.getDataTableMap(table).get("offerType").equals("14")) {
				dynamicReq.put("deptSpendMinVal", CommonUtility.getDataTableMap(table).get("deptSpendMin"));
				dynamicReq.put("multiplierVal", CommonUtility.getDataTableMap(table).get("multiplier"));
				dynamicReq.put("txnSpendMaxVal", "");
				dynamicReq.put("txnSpendMinVal", "");
				dynamicReq.put("deptSpendMaxVal", "");
				dynamicReq.put("pointsVal", "");
				dynamicReq.put("validInDaysVal", CommonUtility.getDataTableMap(table).get("validInDays"));
				dynamicReq.put("triggerOfferEventPeriodVal",
						CommonUtility.getDataTableMap(table).get("triggerOfferEventPeriod"));
			}

		}
		return dynamicReq;
	}
}
