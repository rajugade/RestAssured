package com.macys.marketing.loyalty.LtyIntegrationTest.steps.ltyLookUp;

import static com.macys.marketing.loyalty.LtyIntegrationTest.util.WrapperConstants.HOST_DETAILS;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.macys.loyalty.schemas.customer.cusresponse.v11_0.CusEnrollResp;
import com.macys.loyalty.schemas.customer.cusresponse.v11_0.CusLookupResp;
import com.macys.loyalty.schemas.customer.cusresponse.v11_0.CusResp;
import com.macys.marketing.loyalty.LtyIntegrationTest.response.validators.CusLookupRespValidator;
import com.macys.marketing.loyalty.LtyIntegrationTest.util.CommonUtility;
import com.macys.marketing.loyalty.LtyIntegrationTest.util.LtyUtility;
import com.macys.marketing.loyalty.LtyIntegrationTest.util.WrapperConstants;
import com.macys.marketing.loyalty.LtyIntegrationTest.wrapper.LtyCustomerWapperV11;
import com.macys.marketing.msp.LtyIntegrationTest.messaging.TibcoMessageClient;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.response.Response;

public class CustomerEnrollSteps {
	private static final Logger LOGGER = LoggerFactory.getLogger(CustomerEnrollSteps.class);
	LtyCustomerWapperV11 enroll = new LtyCustomerWapperV11();
	CusLookupRespValidator cusLookUp = new CusLookupRespValidator();

	Map<String, Object> cusEnrollRespMap;
	CusEnrollResp cusEnrollResp;
	Map<String, Object> cusLookUpRespMap;
	CusLookupResp cusLookUpResp;
    String phoneNumber,accountNumber;
    Queue<String> processQueue;

	@Given("^I Enroll Customer with.*$")
	public void i_Enroll_Customer(DataTable table) {
		LOGGER.info("Start of method :: i_Enroll_Customer");
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
		if(CommonUtility.getDataTableMap(table).get("Email")!= null)
			dynamicReqBody.put("<v112:Email>Upgrade"+dynamicReqBody.get("EmailValue")+"@gmail.com</v112:Email>","<v112:Email></v112:Email>" );
			
		if(CommonUtility.getDataTableMap(table).get("AddedByApp")!= null)
			dynamicReqBody.put("ChannelType",CommonUtility.getDataTableMap(table).get("AddedByApp") );

			
		cusEnrollRespMap = enroll.cusEnroll(table,dynamicReqBody);
		Response actualResponse = (Response) cusEnrollRespMap.get("ACTUAL_RESPONSE");
		if (actualResponse.statusCode() == 200) {
			cusEnrollResp = (CusEnrollResp) LtyUtility.getObjFromXml(actualResponse.asString(), CusEnrollResp.class);
		} else {
			LOGGER.error("Customer Enrollment failed", actualResponse.asString());
			throw new RuntimeException(actualResponse.asString());
		}
		phoneNumber = dynamicReqBody.get("PhoneValue");
		accountNumber = dynamicReqBody.get("AccountNumberValue");

		LOGGER.info("End of method :: i_Enroll_Customer");
	}

	@And("^I CusLookUp by Account Number$")
	public void i_LookUp_Customer(DataTable table) throws Throwable{
		LOGGER.info("Start of method :: i_LookUp_Customer");

		String accountNumber = cusEnrollResp.getCustomerIdentifier().get(0).getAccountNumber().getValue();
		
		String scenario = CommonUtility.getDataTableMap(table).get("Scenario");
		if(WrapperConstants.SCENARIO_NEGATIVE.equals(scenario)){
			String wrongAccNumber = accountNumber.replace(accountNumber.charAt(0), '_');
			LOGGER.info("account number {}, wrong account number {}", accountNumber, wrongAccNumber);
			accountNumber = wrongAccNumber;
		}
		cusLookUpRespMap = enroll.CusLookupByAccountNumber(table, accountNumber);
		Response actualResponse = (Response) cusLookUpRespMap.get("ACTUAL_RESPONSE");
		
		if(WrapperConstants.SCENARIO_NEGATIVE.equals(scenario)){
			cusLookUp.cuspMessage = "INVALID LOYALTY ID";
			cusLookUp.validate500(cusLookUpRespMap);
		}else{
			cusLookUpResp = (CusLookupResp) LtyUtility.getObjFromXml(actualResponse.asString(), CusLookupResp.class);
			String expResp = (String) cusLookUpRespMap.get("EXPECTED_RESPONSE");
	
			if (!expResp.equals(""))
				cusLookUp.validate(cusLookUpRespMap);
		}

		LOGGER.info("End of method :: i_LookUp_Customer");
	}

	@And("^I CusLookUp by ZipCode$")
	public void i_CusLookUp_by_ZipCode(DataTable table) throws Throwable {
		LOGGER.info("Start of method :: i_LookUp_Customer by ZipCode");
		
		String zipcode = "30022";
		String scenario = CommonUtility.getDataTableMap(table).get("Scenario");
		if(WrapperConstants.SCENARIO_NEGATIVE.equals(scenario)){
			String wrongZipcode = zipcode.substring(1);
			LOGGER.info("zipcode {}, wrong zipcode {}", zipcode, wrongZipcode);
			zipcode = wrongZipcode;
		}
		cusLookUpRespMap = enroll.CusLookupByZipCode(table, zipcode);
		Response actualResponse = (Response) cusLookUpRespMap.get("ACTUAL_RESPONSE");
		
		if(WrapperConstants.SCENARIO_NEGATIVE.equals(scenario)){
			cusLookUp.cuspMessage = "Address/ZIP not found";
			cusLookUp.validate500(cusLookUpRespMap);
		}else{
			cusLookUpResp = (CusLookupResp) LtyUtility.getObjFromXml(actualResponse.asString(), CusLookupResp.class);
			String expResp = (String) cusLookUpRespMap.get("EXPECTED_RESPONSE");
	
			if (!expResp.equals(""))
				cusLookUp.validate(cusLookUpRespMap);
		}

		LOGGER.info("End of method :: i_LookUp_Customer by ZipCode");
	}

	@And("^I CusLookUp by Name$")
	public void i_CusLookUp_by_Name(DataTable table) throws Throwable {
		LOGGER.info("Start of method :: i_LookUp_Customer by Name");
		
		
		Map<String, String> dynamicReq = enroll.dynamicMap.get(HOST_DETAILS);
		String resourceURL = dynamicReq.get("resourcesPathURL");
		resourceURL = resourceURL + enroll.requestFileNmae;
		
		String scenario = CommonUtility.getDataTableMap(table).get("Scenario");
		
		try {
			String reqquestBody = CommonUtility.getRequestBodies(resourceURL);
			String firstName = reqquestBody.substring(reqquestBody.indexOf("<v112:NameFirst>") + 16,
					reqquestBody.indexOf("</v112:NameFirst>"));
			String lastName = reqquestBody.substring(reqquestBody.indexOf("<v112:NameLast>") + 15,
					reqquestBody.indexOf("</v112:NameLast>"));
			
			
			if(WrapperConstants.SCENARIO_NEGATIVE.equals(scenario)){
				String nameType = CommonUtility.getDataTableMap(table).get("NameType");
				if(WrapperConstants.NAME_TYPE_FIRSTNAME.equals(nameType)){
					String wrongFirstName = "WBTWRONGFN";
					LOGGER.info("FirstName {}, wrong FirstName {}", lastName, wrongFirstName);
					dynamicReq.put("FrstName", wrongFirstName);
					dynamicReq.put("LastName", lastName);
				}else if(WrapperConstants.NAME_TYPE_LASTNAME.equals(nameType)){
					String wrongLastName = "WBTWRONGLN";
					LOGGER.info("LastName {}, wrong LastName {}", lastName, wrongLastName);
					dynamicReq.put("LastName", wrongLastName);
					dynamicReq.put("FrstName", firstName);
				}
			}else{
				dynamicReq.put("FrstName", firstName);
				dynamicReq.put("LastName", lastName);
			}
			
		}catch (FileNotFoundException e) {
			LOGGER.error(
					"FileNotFoundException in CusLookupByZipCode: Given Input requestFile/Response File Does not exist {}",
					e.toString());
			throw new RuntimeException(e.toString());
		} catch (IOException e) {
			LOGGER.error("IOException in CusLookupByZipCode {}", e.toString());
			throw new RuntimeException(e.toString());
		}
		cusLookUpRespMap = enroll.CusLookupByName(table, dynamicReq);
		Response actualResponse = (Response) cusLookUpRespMap.get("ACTUAL_RESPONSE");
		if(WrapperConstants.SCENARIO_NEGATIVE.equals(scenario)){
			LOGGER.info("Negative scenario");
		}else{
			cusLookUpResp = (CusLookupResp) LtyUtility.getObjFromXml(actualResponse.asString(), CusLookupResp.class);
			String expResp = (String) cusLookUpRespMap.get("EXPECTED_RESPONSE");

			if (!expResp.equals(""))
				cusLookUp.validate(cusLookUpRespMap);
		}

		LOGGER.info("End of method :: i_LookUp_Customer by Name");

	}

	@And("^I CusLookUp by Phone$")
	public void i_CusLookUp_by_Phone(DataTable table) throws Throwable {
		LOGGER.info("Start of method :: i_LookUp_Customer by Phone");
		
		Map<String, String> map = enroll.dynamicMap.get("DYNAMIC_REQUEST_BODY");
		
		String Phone = map.get("PhoneNum");
		String scenario = CommonUtility.getDataTableMap(table).get("Scenario");
		if(WrapperConstants.SCENARIO_NEGATIVE.equals(scenario)){
			Phone = "456-7890";
		}
		
		cusLookUpRespMap = enroll.CusLookupByPhone(table, Phone);
		Response actualResponse = (Response) cusLookUpRespMap.get("ACTUAL_RESPONSE");
		
		if(WrapperConstants.SCENARIO_NEGATIVE.equals(scenario)){
			cusLookUp.cuspMessage = "Phone not found";
			cusLookUp.validate500(cusLookUpRespMap);
		}else{
			cusLookUpResp = (CusLookupResp) LtyUtility.getObjFromXml(actualResponse.asString(), CusLookupResp.class);
			String expResp = (String) cusLookUpRespMap.get("EXPECTED_RESPONSE");
	
			if (!expResp.equals(""))
				cusLookUp.validate(cusLookUpRespMap);

		}
		
		LOGGER.info("End of method :: i_LookUp_Customer by Phone");
	}

	@And("^I do CusNotesMaint$")
	public void i_do_CusNotesMaint(DataTable table) throws Throwable {
		String accountNumber = cusEnrollResp.getCustomerIdentifier().get(0).getAccountNumber().getValue();
		cusLookUpRespMap = enroll.CusNotesMaint(table, accountNumber);
		
		String scenario = CommonUtility.getDataTableMap(table).get("Scenario");
		if(WrapperConstants.SCENARIO_NEGATIVE.equals(scenario)){
			cusLookUp.cuspMessage = "Enter Priority from 0 thru 9";
			cusLookUp.validate500(cusLookUpRespMap);
		}else{
			Response actual = (Response) cusLookUpRespMap.get("ACTUAL_RESPONSE");
			String expected = (String) cusLookUpRespMap.get("EXPECTED_RESPONSE");
			CusResp actualResponse = (CusResp) LtyUtility.getObjFromXml(actual.asString(), CusResp.class);
			CusResp expectedResponse = (CusResp) LtyUtility.getObjFromXml(expected, CusResp.class);
			cusLookUp.cuspMessage = "NOTE CREATED SUCCESSFULLY";
			if (!expectedResponse.equals(""))
				cusLookUp.validateCusResps(cusLookUpRespMap);
		}
		LOGGER.info("End of method :: i_LookUp_Customer cusNotesMaint");
	}

	@And("^I do CusAcctMaint$")
	public void i_do_CusAcctMaint(DataTable table) throws Throwable {
		LOGGER.info("Start of method :: i_LookUp_Customer cusAcctMaint");

		cusLookUpRespMap = enroll.CusAcctMaint(table,
				cusEnrollResp.getCustomerIdentifier().get(0).getAccountNumber().getValue());
		String scenario = CommonUtility.getDataTableMap(table).get("Scenario");
		if(WrapperConstants.SCENARIO_NEGATIVE.equals(scenario)){
			cusLookUp.cuspMessage = "Invalid Tier Name";
			cusLookUp.validate500(cusLookUpRespMap);
		}else{
			Response actual = (Response) cusLookUpRespMap.get("ACTUAL_RESPONSE");
			String expected = (String) cusLookUpRespMap.get("EXPECTED_RESPONSE");
			CusResp actualResponse = (CusResp) LtyUtility.getObjFromXml(actual.asString(), CusResp.class);
			CusResp expectedResponse = (CusResp) LtyUtility.getObjFromXml(expected, CusResp.class);
			cusLookUp.cuspMessage = "Success";
			if (!expectedResponse.equals(""))
				cusLookUp.validateCusResps(cusLookUpRespMap);
		}
		LOGGER.info("End of method :: i_LookUp_Customer cusAcctMaint");
	}

	@Then("^I do CusInfoMaint$")
	public void i_do_CusInfoMaint(DataTable table) throws Throwable {
		LOGGER.info("Start of method :: i_LookUp_Customer CusInfoMaint");

		
		Map<String, String> map = enroll.dynamicMap.get("DYNAMIC_REQUEST_BODY");
		String Phone = map.get("PhoneValue");
		String scenario = CommonUtility.getDataTableMap(table).get("Scenario");
		if(WrapperConstants.SCENARIO_NEGATIVE.equals(scenario)){
			Phone =  "ABC-DEFG";
		}
		String accountNumber = cusEnrollResp.getCustomerIdentifier().get(0).getAccountNumber().getValue();
		cusLookUpRespMap = enroll.CusInfoMaint(table, accountNumber, Phone);
		
		if(WrapperConstants.SCENARIO_NEGATIVE.equals(scenario)){
			//cusLookUp.cuspMessage = "PHONE ALREADY EXISTS";
			cusLookUp.cuspMessage = "is not a valid";
			cusLookUp.validate500(cusLookUpRespMap);
		}else{
			Response actual = (Response) cusLookUpRespMap.get("ACTUAL_RESPONSE");
			String expected = (String) cusLookUpRespMap.get("EXPECTED_RESPONSE");
			CusResp actualResponse = (CusResp) LtyUtility.getObjFromXml(actual.asString(), CusResp.class);
			CusResp expectedResponse = (CusResp) LtyUtility.getObjFromXml(expected, CusResp.class);
			cusLookUp.cuspMessage = "CUSTOMER UPDATE SUCCESSFUL";
			if (!expectedResponse.equals(""))
				cusLookUp.validateCusResps(cusLookUpRespMap);

		}
		
		
		LOGGER.info("End of method :: i_LookUp_Customer CusInfoMaint");
	}
	@And("^I try to enroll Customer.*$")
	public void i_try_to_enroll_Customer(DataTable table) throws Throwable {
		LOGGER.info("Start of method :: i_try_to_enroll_Customer");
		String expMessage = CommonUtility.getDataTableMap(table).get("Negative");
		cusLookUp.cuspMessage = expMessage;
		Map<String, String> dynamicReqBody = new HashMap<String, String>();
		String randomNumber = LtyUtility.getRandomNumber(4);
		dynamicReqBody.put("SalesTransNumValue", randomNumber);
		dynamicReqBody.put("PhoneValue", LtyUtility.getRandomNumber(3) + "-" + randomNumber);
		dynamicReqBody.put("EmailValue", LtyUtility.getRandomNumber(6));
		dynamicReqBody.put("AccountNumberValue", LtyUtility.getRandomNumber(6));
		if (CommonUtility.getDataTableMap(table).get("Negative") != null) {
			// Negative scenarios of LtyCustomerLookUp cusEnroll
			if ("System Exception".equals(CommonUtility.getDataTableMap(table).get("Negative")))
				dynamicReqBody.put("AccountNumberValue", accountNumber);
			if ("ZIP CODE MUST BE NUMERIC".equals(CommonUtility.getDataTableMap(table).get("Negative")))
				dynamicReqBody.put("30024", "30");
			if ("PHONE ALREADY EXISTS".equals(CommonUtility.getDataTableMap(table).get("Negative")))
				dynamicReqBody.put("PhoneValue", phoneNumber);
			if("Name information is missing".equals(CommonUtility.getDataTableMap(table).get("Negative")))
				dynamicReqBody.put("<v112:NameFirst>MCY</v112:NameFirst>","<v112:NameFirst></v112:NameFirst>" );
		}

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
		cusLookUp.validate500(cusEnrollRespMap);
		LOGGER.info("End of method :: i_try_to_enroll_Customer");
	}
	
	@Then("^Tibco connection check Tests$")
	   public void tibco_connection_check_Tests() throws Throwable {
		   Response actualResponse = (Response) cusEnrollRespMap.get("ACTUAL_RESPONSE");
		   TibcoMessageClient.sendToQueue(actualResponse.asString());
		   LOGGER.info("enroll response message send to topic");

		   //Pause the thread for 3sec, as it need to init Tibco messaging service.
		   Thread.sleep(3000);

		    processQueue = TibcoMessageClient.processQueue();
		   // cusLookUpRespMap.put("EXPECTED_RESPONSE", processQueue);
		   // cusLookUp.validate(cusLookUpRespMap);
		   LOGGER.info("Topic processed");
	   }

}


