package com.macys.marketing.loyalty.LtyIntegrationTest.steps.ltyTransaction;

import static com.macys.marketing.loyalty.LtyIntegrationTest.util.WrapperConstants.A;
import static com.macys.marketing.loyalty.LtyIntegrationTest.util.WrapperConstants.ACTUAL_RESPONSE;
import static com.macys.marketing.loyalty.LtyIntegrationTest.util.WrapperConstants.DynamicAccountNumber;
import static com.macys.marketing.loyalty.LtyIntegrationTest.util.WrapperConstants.DynamicReferenceId;
import static com.macys.marketing.loyalty.LtyIntegrationTest.util.WrapperConstants.DynamicTenderType;
import static com.macys.marketing.loyalty.LtyIntegrationTest.util.WrapperConstants.L;
import static com.macys.marketing.loyalty.LtyIntegrationTest.util.WrapperConstants.P;
import static com.macys.marketing.loyalty.LtyIntegrationTest.util.WrapperConstants.SIXFOUR;
import static com.macys.marketing.loyalty.LtyIntegrationTest.util.WrapperConstants.SIXTHREE;
import static com.macys.marketing.loyalty.LtyIntegrationTest.util.WrapperConstants.TWOTHREE;
import static com.macys.marketing.loyalty.LtyIntegrationTest.util.WrapperConstants.TWOSIX;
import static com.macys.marketing.loyalty.LtyIntegrationTest.util.WrapperConstants.FOURSEVEN;
import static com.macys.marketing.loyalty.LtyIntegrationTest.util.WrapperConstants.ZERO;
import static com.macys.marketing.loyalty.LtyIntegrationTest.util.WrapperConstants.FIVE;
import static com.macys.marketing.loyalty.LtyIntegrationTest.util.WrapperConstants.THREE;
import static com.macys.marketing.loyalty.LtyIntegrationTest.util.WrapperConstants.SEVENPOINTFIVE;
import static com.macys.marketing.loyalty.LtyIntegrationTest.util.WrapperConstants.MINUSSEVENPOINTFIVE;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.macys.loyalty.schemas.customer.cuscommon.v11_0.AccountIdentifier;
import com.macys.loyalty.schemas.customer.cusresponse.v11_0.CusEnrollResp;
import com.macys.loyalty.schemas.customer.cusresponse.v11_0.CusLookupResp;
import com.macys.marketing.loyalty.LtyIntegrationTest.response.validators.CusLookupRespValidator;
import com.macys.marketing.loyalty.LtyIntegrationTest.response.validators.LtyLookupLoyaltyDetailRespValidator;
import com.macys.marketing.loyalty.LtyIntegrationTest.response.validators.LtyTestBedValidator;
import com.macys.marketing.loyalty.LtyIntegrationTest.response.validators.LtyTransactionValidator;
import com.macys.marketing.loyalty.LtyIntegrationTest.util.CommonUtility;
import com.macys.marketing.loyalty.LtyIntegrationTest.util.LtyUtility;
import com.macys.marketing.loyalty.LtyIntegrationTest.util.WrapperConstants;
import com.macys.marketing.loyalty.LtyIntegrationTest.wrapper.LtyCustomerWapperV11;
import com.macys.marketing.loyalty.LtyIntegrationTest.wrapper.LtyLookUpWrapper;
import com.macys.marketing.loyalty.LtyIntegrationTest.wrapper.LtyTestBedWrapper;
import com.macys.marketing.loyalty.LtyIntegrationTest.wrapper.LtyTransactionWrapper;
import com.macys.marketing.msp.LtyIntegrationTest.messaging.TibcoMessageClient;
import com.macys.platform.messaging.client.exception.MessagingClientRuntimeException;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.response.Response;

public class LtyTransactionSteps {
	private static final Logger LOGGER = LoggerFactory.getLogger(LtyTransactionSteps.class);
	LtyTransactionWrapper transaction = new LtyTransactionWrapper();
	LtyCustomerWapperV11 enroll = new LtyCustomerWapperV11();
	LtyTransactionValidator validator = new LtyTransactionValidator();
	CusLookupRespValidator cusLookUp = new CusLookupRespValidator();
	LtyTestBedWrapper testBed = new LtyTestBedWrapper();
	LtyTestBedValidator testBedValidator=new LtyTestBedValidator();
	LtyLookUpWrapper lookUp = new LtyLookUpWrapper();
	
	//LtyLookupLoyaltyDetail
	LtyLookupLoyaltyDetailRespValidator ltyLookupLoyaltyDetailValidator = new LtyLookupLoyaltyDetailRespValidator();
	
	//LtyCustServiceReward
	Map<String, Object> ltyCustServiceRewardMap;
	
	Map<String, Object> cusEnrollRespMap;
	CusEnrollResp cusEnrollResp;
	Map<String, Object> cusLookUpRespMap;
	CusLookupResp cusLookUpResp;
	Map<String, Object> TFSEnrollRespMap;
	String expectedPoints;
	String tibcoRequest = null;
	String prevStt = null;
	String salesTrans = null;
	String orderNum = null;
	String reservationNum = null;
	public static final String DYNAMIC_REQUEST_BODY = "DYNAMIC_REQUEST_BODY";
	
	@Given("^I Enroll Customer Prior to.*$")
	public void i_Enroll_Customer(DataTable table) {
		LOGGER.info("Start of method :: i_Enroll_Customer");
		/**
		 * invoking LtyCustomerWapperV11 wrapper by passing table 
		 */
		Map<String, String> dynamicReqBody = new HashMap<String, String>();
		String randomNumber = LtyUtility.getRandomNumber(4);
		dynamicReqBody.put("SalesTransNumValue", randomNumber);
		dynamicReqBody.put("PhoneValue", LtyUtility.getRandomNumber(3) + "-" + randomNumber);
		dynamicReqBody.put("EmailValue", LtyUtility.getRandomNumber(6));
		dynamicReqBody.put("AccountNumberValue", LtyUtility.getRandomNumber(6));

		String acctType = CommonUtility.getDataTableMap(table).get("AccountType");
		if (acctType != null) {
			if (acctType.equals("A")) {
				dynamicReqBody.put("accType", "A");
				dynamicReqBody.put("accNum", "377481711AccountNumberValue");
			} else {
				dynamicReqBody.put("accType", "P");
				dynamicReqBody.put("accNum", "6035342209AccountNumberValue");
			}
		}

		cusEnrollRespMap = enroll.cusEnroll(table,dynamicReqBody);
		Response actualResponse = (Response) cusEnrollRespMap.get(ACTUAL_RESPONSE);
		if (actualResponse.statusCode() == 200) {
			cusEnrollResp = (CusEnrollResp) LtyUtility.getObjFromXml(actualResponse.asString(), CusEnrollResp.class);
		}
		else {
		LOGGER.error("Customer Enrollment failed", actualResponse.asString());
		LOGGER.error("LtyTransactionSteps.i_Enroll_Customer():::", actualResponse.asString());
		throw new RuntimeException(actualResponse.asString());
		}
		
		LOGGER.info("End of method :: i_Enroll_Customer");
	}
	
	@Then("^I LookUp Customer by.*$")
	public void i_LookUp_Customer(DataTable table) {
		LOGGER.info("Start of method :: i_LookUp_Customer");
		/**
		 * invoking LtyCustomerWapperV11 wrapper by passing table 
		 */
		cusLookUpRespMap = enroll.CusLookupByAccountNumber(table, cusEnrollResp.getCustomerIdentifier().get(0).getAccountNumber().getValue());
		Response actualResponse = (Response) cusLookUpRespMap.get(ACTUAL_RESPONSE);
		cusLookUpResp = (CusLookupResp) LtyUtility.getObjFromXml(actualResponse.asString(), CusLookupResp.class);
		
			cusLookUp.validate(cusLookUpRespMap);
		
		
		LOGGER.info("End of method :: i_LookUp_Customer");
	}
	
	/**
	 * This method is to accommodate dollar value to customer
	 * @author rmarla
	 * @param table
	 */
	@Then("^I Perform LtyCustServiceReward$")
	public void i_perform_LtyCustServiceReward(DataTable table) {
		LOGGER.info("Start of method :: i_perform_LtyCustServiceReward");
		
		Map<String, String> dynamicReq = new HashMap<String, String>();
		
		//adjustAmount = CommonUtility.getDataTableMap(table).get("AdjustAmount");
		//dynamicReq.put("DynamicAdjustmentAmount", adjustAmount);
		dynamicReq.put("DynamicDate", CommonUtility.currentDate());
		
		for (AccountIdentifier identifier : cusLookUpResp.getCustomer().get(0).getCusInfo().getCustomerIdentifier()) {
			if (identifier.getAccountType().equals(L))
				dynamicReq.put(DynamicAccountNumber, identifier.getAccountNumber().getValue());
			if (identifier.getAccountType().equals(A)) {
				dynamicReq.put(DynamicTenderType, SIXFOUR);
				dynamicReq.put(DynamicReferenceId, identifier.getAccountNumber().getValue());
			}
		}
		
		ltyCustServiceRewardMap = transaction.ltyCustServiceReward(table, dynamicReq);
		validator.validateLtyCustServiceRewardResponse(ltyCustServiceRewardMap);
		
		LOGGER.info("End of method :: i_perform_LtyCustServiceReward");
	}
	
	
	/**
	 * This method is to validate adjust dollar value to customer account for TFS/P2P
	 * @author rmarla
	 * @param table
	 */
	@Then("^I Validate Loyalty Detail$")
	public void i_Validate_Loyalty_Detail(DataTable table) throws Throwable{
		LOGGER.info("Start of method :: validate_loyalty_detail");
		
		Map<String, String> dynamicReq = new HashMap<String, String>();
		dynamicReq.put("SalesTransValue", LtyUtility.getRandomNumber(4));
		dynamicReq.put("DynamicDate", CommonUtility.currentDate());
		
		for (AccountIdentifier identifier : cusLookUpResp.getCustomer().get(0).getCusInfo().getCustomerIdentifier()) {
			if (identifier.getAccountType().equals(L))
				dynamicReq.put(DynamicAccountNumber, identifier.getAccountNumber().getValue());
			if (identifier.getAccountType().equals(A)) {
				dynamicReq.put(DynamicTenderType, SIXFOUR);
				dynamicReq.put(DynamicReferenceId, identifier.getAccountNumber().getValue());
			}
		}
		
		Map<String, Object> lookupLoyaltyDetailMap = lookUp.lookupLoyaltyDetail(table, dynamicReq);
		ltyLookupLoyaltyDetailValidator.validateLtyLookupLoyaltyDetail(lookupLoyaltyDetailMap);
		
		LOGGER.info("End of method :: validate_loyalty_detail");
	}
	
	
	@Then("^I LookUp Customer by Account Number To Verify TFS$")
	public void i_LookUp_Customer_Verify_TFS(DataTable table) {
		LOGGER.info("Start of method :: i_LookUp_Customer");
		/**
		 * invoking LtyCustomerWapperV11 wrapper by passing table 
		 */
		cusLookUpRespMap = enroll.CusLookupByAccountNumber(table, cusEnrollResp.getCustomerIdentifier().get(0).getAccountNumber().getValue());
		Response actualResponse = (Response) cusLookUpRespMap.get(ACTUAL_RESPONSE);
		cusLookUpResp = (CusLookupResp) LtyUtility.getObjFromXml(actualResponse.asString(), CusLookupResp.class);
		LOGGER.info("End of method :: i_LookUp_Customer");
	}

	@Given("^I Perform PROP Transaction for.*$")
	public void i_Perform_TFS_enrollment_Prop(DataTable table) {

		Map<String, String> dynamicReq = new HashMap<String, String>();
		
		prevStt=salesTrans;
		
		if(prevStt !=null){ 
			dynamicReq.put("prevStt", prevStt);
		}
		
		salesTrans = LtyUtility.getRandomNumber(4).toString();
		reservationNum = salesTrans;
		orderNum = salesTrans;
		dynamicReq.put("DynamicReservation", salesTrans);
		dynamicReq.put("DynamicOrderNum", salesTrans);
		dynamicReq.put("SalesTransValue", salesTrans);
		dynamicReq.put("DynamicTimeStamp", CommonUtility.currentTimeStamp());
		dynamicReq.put("DynamicDate", CommonUtility.currentDate());
		expectedPoints = CommonUtility.getDataTableMap(table).get("PointsExpected");
		if(CommonUtility.getDataTableMap(table).get("DynamicClass")!=null) {
			dynamicReq.put("DynamicClass", CommonUtility.getDataTableMap(table).get("DynamicClass"));
		}else {
			dynamicReq.put("DynamicClass", "03");
		}
		
		
		for (AccountIdentifier identifier : cusLookUpResp.getCustomer().get(0).getCusInfo().getCustomerIdentifier()) {
			if (identifier.getAccountType().equals(L))
				dynamicReq.put(DynamicAccountNumber, identifier.getAccountNumber().getValue());
			if (identifier.getAccountType().equals(P)) {
				dynamicReq.put(DynamicTenderType, SIXTHREE);
				dynamicReq.put(DynamicReferenceId, identifier.getAccountNumber().getValue());
			}
			if (CommonUtility.getDataTableMap(table).get("TenderType") != null) {
				dynamicReq=dynamicTenders(table, dynamicReq, identifier);

			}
		}
		if (CommonUtility.getDataTableMap(table).get("DynamicDepts") != null)
			dynamicReq=dynamicDep(table, dynamicReq);
		
		TFSEnrollRespMap = transaction.ltyTransaction(table, dynamicReq);
	}
	
	/**
	 * @author rmarla
	 * @param table
	 */
	
	//send to dot com
	@Given("^I Perform TFS enrollment for Prop with DotCom$")
	public void i_Perform_TFS_enrollment_Prop_with_dotcom(DataTable table) throws MessagingClientRuntimeException, InterruptedException {
		LOGGER.info("start sending message to DOT COM {}", table);
		Map<String, String> dynamicReq = new HashMap<String, String>();
		dynamicReq.put("SalesTransValue", LtyUtility.getRandomNumber(4));
		
		String requestFileRootPath = this.getClass().getClassLoader().getResource("data/json/").toString();
		String requestFileName = CommonUtility.getDataTableMap(table).get(WrapperConstants.REQUEST_FILE);
		
		StringBuilder sb = new StringBuilder();
		sb.append(requestFileRootPath).append(WrapperConstants.SLASH).append(requestFileName);
		
		LOGGER.info("requestFileName {}", sb.toString());
		
		String requestFileContent = null;
		try {
			requestFileContent = CommonUtility.getRequestBodies(sb.toString());
		} catch (FileNotFoundException e) {
			LOGGER.error("Exception in i_Perform_TFS_enrollment_Prop_with_dotcom {}", e);
		} catch (IOException e) {
			LOGGER.error("Exception in i_Perform_TFS_enrollment_Prop_with_dotcom {}", e);
		}
		
		LOGGER.info("cusLookUpResp {}", cusLookUpResp);
		for (AccountIdentifier identifier : cusLookUpResp.getCustomer().get(0).getCusInfo().getCustomerIdentifier()) {
			LOGGER.info("identifier.getAccountType() {}", identifier.getAccountType());
			if (identifier.getAccountType().equals("L"))
				dynamicReq.put("DynamicAccountNumber", identifier.getAccountNumber().getValue());
			if (identifier.getAccountType().equals("P"))
				dynamicReq.put("DynamicReferenceId", identifier.getAccountNumber().getValue());
		}
		
		String requestBody = CommonUtility.updateDynamicRequestBody(requestFileContent, dynamicReq);
		
		tibcoRequest = requestBody;
		LOGGER.info("tibcoRequest-> {}", tibcoRequest);
		
		TibcoMessageClient.sendToQueue(tibcoRequest);
		LOGGER.info("Message sent to queue");
	}
	
	@Then("^I wait for (\\d+).*$")
	public void i_wait_some_time(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			LOGGER.error("LtyTransactionSteps.i_wait_some_time():::", e);
				throw new RuntimeException();
		}
	}
	
	@Given("^I Perform IRN Transaction for.*$")
	public void i_Perform_TFS_enrollment_IRN(DataTable table) {
		Map<String, String> dynamicReq = new HashMap<String, String>();
		
		prevStt=salesTrans;
		
		if(prevStt !=null){ 
			dynamicReq.put("prevStt", prevStt);
		}
		
		salesTrans = LtyUtility.getRandomNumber(4).toString();
		
		
		dynamicReq.put("SalesTransValue", salesTrans);
		dynamicReq.put("DynamicTimeStamp", CommonUtility.currentTimeStamp());
		dynamicReq.put("DynamicDate", CommonUtility.currentDate());
		expectedPoints = CommonUtility.getDataTableMap(table).get("PointsExpected");
		
		
		if(CommonUtility.getDataTableMap(table).get("DynamicClass")!=null) {
			dynamicReq.put("DynamicClass", CommonUtility.getDataTableMap(table).get("DynamicClass"));
		}else {
			dynamicReq.put("DynamicClass", THREE);
		}
		
		for (AccountIdentifier identifier : cusLookUpResp.getCustomer().get(0).getCusInfo().getCustomerIdentifier()) {
			if (identifier.getAccountType().equals(L))
				dynamicReq.put(DynamicAccountNumber, identifier.getAccountNumber().getValue());
			if (identifier.getAccountType().equals(A)) {
				dynamicReq.put(DynamicTenderType, SIXFOUR);
				dynamicReq.put(DynamicReferenceId, identifier.getAccountNumber().getValue());
			}
			if (CommonUtility.getDataTableMap(table).get("TenderType") != null) {
				dynamicReq=dynamicTenders(table, dynamicReq, identifier);

			}
		}
		if (CommonUtility.getDataTableMap(table).get("DynamicDepts") != null)
			dynamicReq=dynamicDep(table, dynamicReq);
		
		TFSEnrollRespMap = transaction.ltyTransaction(table, dynamicReq);
	}
	
	@Then("^I Validate *.*transaction response$")
	public void i_Verify_TFS_enrollment() {
		/**
		 * Below if block is used to dynamically changing values of response for
		 * Accumulate_Card_Value scenarios
		 */
		if (expectedPoints != null) {
			if (FIVE.equals(expectedPoints)) {
				String expected = (String) TFSEnrollRespMap.get("EXPECTED_RESPONSE");
				expected = expected.replace(SEVENPOINTFIVE, expectedPoints);
				TFSEnrollRespMap.put("EXPECTED_RESPONSE", expected);
			}
			if (ZERO.equals(expectedPoints)) {
				String expected = (String) TFSEnrollRespMap.get("EXPECTED_RESPONSE");
				expected = expected.replace(SEVENPOINTFIVE, expectedPoints);
				expected = expected.replace(MINUSSEVENPOINTFIVE, expectedPoints);
				TFSEnrollRespMap.put("EXPECTED_RESPONSE", expected);
			}
		}
		validator.validate(TFSEnrollRespMap);
	}
	
	@And("I Perform PresaleIssuance")
	public void i_Perform_PresaleIssuance(DataTable table) {
		
		Map<String, String> dynamicReq = new HashMap<String, String>();
		
		prevStt=salesTrans;
		if(prevStt !=null){ 
			dynamicReq.put("prevStt", prevStt);
		}
		dynamicReq.put("DynamicTimeStamp", CommonUtility.currentTimeStamp());
		
		Map<String, Object> presaleIssuance = testBed.presaleIssuance(table, dynamicReq);
		testBedValidator.validatePresale(presaleIssuance);
	}
	
	@And("I Perform FedFilOrder.*")
	public void i_Perform_FedFilOrder(DataTable table) {
		
		Map<String, String> dynamicReq = new HashMap<String, String>();
		
		dynamicReq.put("DynamicReservation", reservationNum);
		dynamicReq.put("DynamicOrderNum", orderNum);
		dynamicReq.put("DynamicTimeStamp", CommonUtility.currentTimeStamp());
		for (AccountIdentifier identifier : cusLookUpResp.getCustomer().get(0).getCusInfo().getCustomerIdentifier()) {
			if (identifier.getAccountType().equals(L))
				dynamicReq.put(DynamicAccountNumber, identifier.getAccountNumber().getValue());
			if (identifier.getAccountType().equals(P)) {
				dynamicReq.put(DynamicTenderType, SIXTHREE);
				dynamicReq.put(DynamicReferenceId, identifier.getAccountNumber().getValue());
			}
			
		}
		
		
		testBed.fedfilOrder(table, dynamicReq);
	}
	
	@Then("^I Verify *.* enrollment for negative scenarios$")
	public void i_Verify_TFS_enrollment_for_negative_scenarios() throws Throwable {

		validator.validate500(TFSEnrollRespMap);
	}

	// Randomly changing the DEPT values of requests
	private Map<String, String> dynamicDep(DataTable table, Map<String, String> dynamicReq) {
		if (CommonUtility.getDataTableMap(table).get("DynamicDepts") != null) {
			String string = CommonUtility.getDataTableMap(table).get("DynamicDepts");
			String[] parts = string.split(",");
			String part1 = parts[0];
			String part2 = parts[1];
			dynamicReq.put("Dept1", part1);
			dynamicReq.put("Dept2", part2);
		}
		return dynamicReq;

	}
   private Map<String, String> dynamicTenders(DataTable table, Map<String, String> dynamicReq,AccountIdentifier identifier) {
	   if (TWOTHREE.equals(CommonUtility.getDataTableMap(table).get("TenderType"))) {
			dynamicReq.put("dynamictendertypes", TWOTHREE);
			dynamicReq.put("dynamicreferenceids", identifier.getAccountNumber().getValue());
		}
		if (TWOSIX.equals(CommonUtility.getDataTableMap(table).get("TenderType"))) {
			dynamicReq.put("dynamictendertypes", TWOSIX);
			dynamicReq.put("dynamicreferenceids", "");
		}
		if (FOURSEVEN.equals(CommonUtility.getDataTableMap(table).get("TenderType"))) {
			dynamicReq.put("dynamictendertypes", FOURSEVEN);
			dynamicReq.put("dynamicreferenceids", "");
		}
		return dynamicReq;
}
}
