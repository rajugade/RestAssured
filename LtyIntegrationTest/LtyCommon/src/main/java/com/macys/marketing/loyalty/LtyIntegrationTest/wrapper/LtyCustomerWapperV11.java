package com.macys.marketing.loyalty.LtyIntegrationTest.wrapper;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.macys.marketing.loyalty.LtyIntegrationTest.util.CommonUtility;
import com.macys.marketing.loyalty.LtyIntegrationTest.util.LtyUtility;
import com.macys.marketing.loyalty.LtyIntegrationTest.util.PropertyLoader;

import static com.macys.marketing.loyalty.LtyIntegrationTest.util.WrapperConstants.*;

import cucumber.api.DataTable;

public class LtyCustomerWapperV11 extends BasicWrapper {

	private static final Logger LOGGER = LoggerFactory.getLogger(LtyCustomerWapperV11.class);

	public String requestFileNmae;

	public LtyCustomerWapperV11() {
		dynamicMap = new HashMap<String, Map<String, String>>();
		Map<String, String> endPoint = new HashMap<String, String>();
		//url or complete endpoint
		endPoint.put(END_PONT, PropertyLoader.getLoyaltyCustomerv11Address());
		//input and output location
		endPoint.put(RESOURCE_PATH_URL, this.getClass().getClassLoader().getResource("data/json/").toString());
		dynamicMap.put(HOST_DETAILS, endPoint);
		headerParameters = HEADER_PARAMETERS_SOAP;
		uri = "";
	}

	/**
	 * This is method will enroll the customer based on the input parameters in
	 * DataTable which is passed from concerned feature file.Some input
	 * parameters are generating randomly to pass dynamic values
	 */
	public Map<String, Object> cusEnroll(DataTable table,Map<String, String> dynamicReqBody) {
		LOGGER.info("Start of method :: lookupOfferInfo");
		soapAction = "/CusEnroll";
		requestFileNmae = CommonUtility.getDataTableMap(table).get("requestFile");
		
		dynamicMap.put("DYNAMIC_REQUEST_BODY", dynamicReqBody);

		DataTable actualTable = getDynamicTable(table);
		Map<String, Object> response = null;
		try {
			response = client.invokeService(actualTable, dynamicMap);
		} catch (FileNotFoundException e) {
			LOGGER.error("FileNotFoundException in cusEnroll: Given Input requestFile/Response File Does not exist {}",
					e.toString());
			throw new RuntimeException(e.toString());
		} catch (IOException e) {
			LOGGER.error("IOException: in cusEnroll {}", e.toString());
			throw new RuntimeException(e.toString());
		}
		LOGGER.info("End of method :: lookupOfferInfo");

		return response;
	}

	public Map<String, Object> CusLookupByAccountNumber(DataTable table, String accountNumber) {

		LOGGER.info("Start of method :: lookupOfferInfo");
		soapAction = "/CusLookupByAcctNbr";
		Map<String, String> dynamicReq = new HashMap<String, String>();
		dynamicReq.put("DynamicAccountNumber", accountNumber);
		dynamicMap.put("DYNAMIC_REQUEST_BODY", dynamicReq);

		DataTable actualTable = getDynamicTable(table);
		Map<String, Object> response = null;
		try {
			response = client.invokeService(actualTable, dynamicMap);
		} catch (FileNotFoundException e) {
			LOGGER.error(
					"FileNotFoundException in CusLookupByAccountNumber: Given Input requestFile/Response File Does not exist {}",
					e.toString());
			throw new RuntimeException(e.toString());
		} catch (IOException e) {
			LOGGER.error("IOException in CusLookupByAccountNumber {}", e.toString());
			throw new RuntimeException(e.toString());
		}
		LOGGER.info("End of method :: lookupOfferInfo");

		return response;

	}

	/**
	 * These method is used to lookup customer by zipcode which we are passing
	 * from step definition
	 * 
	 * @param table
	 * @param zipcode
	 * @return
	 */
	public Map<String, Object> CusLookupByZipCode(DataTable table, String zipcode) {

		LOGGER.info("Start of method :: lookupOfferInfo by ZipCode");
		soapAction = "/CusLookupByAddrZip";
		Map<String, String> dynamicReq = new HashMap<String, String>();

		/*
		 * dynamicReq = dynamicMap.get(HOST_DETAILS); String resourceURL =
		 * dynamicReq.get("resourcesPathURL"); resourceURL = resourceURL +
		 * requestFileNmae; try { String reqquestBody =
		 * CommonUtility.getRequestBodies(resourceURL); zipcode =
		 * reqquestBody.substring(reqquestBody.indexOf("<v112:PostalCd>") + 15,
		 * reqquestBody.indexOf("</v112:PostalCd>")); dynamicReq.put("ZipCode",
		 * zipcode);
		 * 
		 * } catch (FileNotFoundException e1) { e1.printStackTrace(); } catch
		 * (IOException e1) { e1.printStackTrace(); }
		 */
		
		dynamicReq.put("ZipCode", zipcode);
		dynamicMap.put("DYNAMIC_REQUEST_BODY", dynamicReq);

		DataTable actualTable = getDynamicTable(table);
		Map<String, Object> response = null;
		try {
			response = client.invokeService(actualTable, dynamicMap);
		} catch (FileNotFoundException e) {
			LOGGER.error(
					"FileNotFoundException in CusLookupByZipCode: Given Input requestFile/Response File Does not exist {}",
					e.toString());
			throw new RuntimeException(e.toString());
		} catch (IOException e) {
			LOGGER.error("IOException in CusLookupByZipCode {}", e.toString());
			throw new RuntimeException(e.toString());
		}
		LOGGER.info("End of method :: lookupOfferInfo by zipcode");

		return response;

	}

	/**
	 * These method is used to lookup customer by Name which we are passing in
	 * request during customer enrollment
	 * 
	 * @param table
	 * @param firstName
	 * @param lastName
	 * @return
	 */
	public Map<String, Object> CusLookupByName(DataTable table, Map<String, String> dynamicReq) {

		LOGGER.info("Start of method :: lookupOfferInfo by Name");
		soapAction = "/CusLookupByName";
		dynamicMap.put("DYNAMIC_REQUEST_BODY", dynamicReq);

		DataTable actualTable = getDynamicTable(table);
		Map<String, Object> response = null;
		try {
			response = client.invokeService(actualTable, dynamicMap);
		} catch (FileNotFoundException e) {
			LOGGER.error(
					"FileNotFoundException in CusLookupByName: Given Input requestFile/Response File Does not exist {}",
					e.toString());
			throw new RuntimeException(e.toString());
		} catch (IOException e) {
			LOGGER.error("IOException in CusLookupByName {}", e.toString());
			throw new RuntimeException(e.toString());
		}
		LOGGER.info("End of method :: lookupOfferInfo by Name");

		return response;

	}

	/**
	 * These method is used to lookup customer by phone which we are dynamically
	 * generating during customer enrollment.
	 * 
	 * @param table
	 * @param Phone
	 * @return
	 */
	public Map<String, Object> CusLookupByPhone(DataTable table, String Phone) {

		LOGGER.info("Start of method :: lookupOfferInfo by Phone");
		soapAction = "/CusLookupByPhone";
		Map<String, String> dynamicReq = new HashMap<String, String>();
		Map<String, String> map = dynamicMap.get("DYNAMIC_REQUEST_BODY");
		
		dynamicReq.put("PhoneNum", Phone);
		dynamicMap.put("DYNAMIC_REQUEST_BODY", dynamicReq);

		DataTable actualTable = getDynamicTable(table);
		Map<String, Object> response = null;
		try {
			response = client.invokeService(actualTable, dynamicMap);
		} catch (FileNotFoundException e) {
			LOGGER.error(
					"FileNotFoundException in CusLookupByPhone: Given Input requestFile/Response File Does not exist {}",
					e.toString());
			throw new RuntimeException(e.toString());
		} catch (IOException e) {
			LOGGER.error("IOException in CusLookupByPhone {}", e.toString());
			throw new RuntimeException(e.toString());
		}
		LOGGER.info("End of method :: lookupOfferInfo by Phone");

		return response;

	}

	/**
	 * This method is used to create notes for the enrolled loyalty id.
	 * 
	 * @param table
	 * @param acctNumber
	 * @return
	 */
	public Map<String, Object> CusNotesMaint(DataTable table, String acctNumber) {

		LOGGER.info("Start of method :: lookupOfferInfo cusNotesMaint");
		soapAction = "/CusNotesMaint";
		Map<String, String> dynamicReq = new HashMap<String, String>();
		dynamicReq.put("DynamicAccountNumber", acctNumber);
		dynamicMap.put("DYNAMIC_REQUEST_BODY", dynamicReq);

		DataTable actualTable = getDynamicTable(table);
		Map<String, Object> response = null;
		try {
			response = client.invokeService(actualTable, dynamicMap);
		} catch (FileNotFoundException e) {
			LOGGER.error(
					"FileNotFoundException in CusNotesMaint: Given Input requestFile/Response File Does not exist {}",
					e.toString());
			throw new RuntimeException(e.toString());
		} catch (IOException e) {
			LOGGER.error("IOException in CusNotesMaint {}", e.toString());
			throw new RuntimeException(e.toString());
		}
		LOGGER.info("End of method :: lookupOfferInfo cusNotesMaint");

		return response;

	}

	/**
	 * This method is used to Tier update for a loyalty id.
	 * 
	 * @param table
	 * @param acctNumber
	 * @return
	 */
	public Map<String, Object> CusAcctMaint(DataTable table, String acctNumber) {

		LOGGER.info("Start of method :: lookupOfferInfo CusAcctMaint");
		soapAction = "/CusAcctMaint";
		Map<String, String> dynamicReq = new HashMap<String, String>();
		dynamicReq.put("DynamicAccountNumber", acctNumber);
		dynamicMap.put("DYNAMIC_REQUEST_BODY", dynamicReq);

		DataTable actualTable = getDynamicTable(table);
		Map<String, Object> response = null;
		try {
			response = client.invokeService(actualTable, dynamicMap);
		} catch (FileNotFoundException e) {
			LOGGER.error(
					"FileNotFoundException in CusAcctMaint: Given Input requestFile/Response File Does not exist {}",
					e.toString());
			throw new RuntimeException(e.toString());
		} catch (IOException e) {
			LOGGER.error("IOException in CusAcctMaint {}", e.toString());
			throw new RuntimeException(e.toString());
		}
		LOGGER.info("End of method :: lookupOfferInfo CusAcctMaint");

		return response;

	}

	/**
	 * This method is used to update customer details
	 * 
	 * @param table
	 * @param acctNumber
	 * @return
	 */
	public Map<String, Object> CusInfoMaint(DataTable table, String acctNumber, String Phone) {

		LOGGER.info("Start of method :: lookupOfferInfo CusInfoMaint");
		soapAction = "/CustInfoMaint";
		Map<String, String> dynamicReq = new HashMap<String, String>();
		
		dynamicReq.put("PhoneNum", Phone);
		dynamicReq.put("DynamicAccountNumber", acctNumber);
		dynamicMap.put("DYNAMIC_REQUEST_BODY", dynamicReq);

		DataTable actualTable = getDynamicTable(table);
		Map<String, Object> response = null;
		try {
			response = client.invokeService(actualTable, dynamicMap);
		} catch (FileNotFoundException e) {
			LOGGER.error(
					"FileNotFoundException in CusInfoMaint: Given Input requestFile/Response File Does not exist {}",
					e.toString());
			throw new RuntimeException(e.toString());
		} catch (IOException e) {
			LOGGER.error("IOException in CusInfoMaint {}", e.toString());
			throw new RuntimeException(e.toString());
		}
		LOGGER.info("End of method :: lookupOfferInfo CusInfoMaint");

		return response;

	}

}