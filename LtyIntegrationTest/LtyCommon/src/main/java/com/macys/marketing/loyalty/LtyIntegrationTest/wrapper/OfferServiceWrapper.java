package com.macys.marketing.loyalty.LtyIntegrationTest.wrapper;

import static com.macys.marketing.loyalty.LtyIntegrationTest.util.WrapperConstants.END_PONT;
import static com.macys.marketing.loyalty.LtyIntegrationTest.util.WrapperConstants.HEADER_PARAMETERS_REST;
import static com.macys.marketing.loyalty.LtyIntegrationTest.util.WrapperConstants.HEADER_PARAMS;
import static com.macys.marketing.loyalty.LtyIntegrationTest.util.WrapperConstants.HOST_DETAILS;
import static com.macys.marketing.loyalty.LtyIntegrationTest.util.WrapperConstants.PATH_PARAMETERS;
import static com.macys.marketing.loyalty.LtyIntegrationTest.util.WrapperConstants.REQUEST_FILE;
import static com.macys.marketing.loyalty.LtyIntegrationTest.util.WrapperConstants.REQUEST_METHOD;
import static com.macys.marketing.loyalty.LtyIntegrationTest.util.WrapperConstants.RESOURCE_PATH_URL;
import static com.macys.marketing.loyalty.LtyIntegrationTest.util.WrapperConstants.RESPONSE_FILE;
import static com.macys.marketing.loyalty.LtyIntegrationTest.util.WrapperConstants.URI;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.macys.marketing.loyalty.LtyIntegrationTest.Client.impl.RestAssuredClientImpl;
import com.macys.marketing.loyalty.LtyIntegrationTest.util.CommonUtility;
import com.macys.marketing.loyalty.LtyIntegrationTest.util.PropertyLoader;

import cucumber.api.DataTable;

/**
 * The Class OfferServiceWrapper is wrapper for RestClientHelper class, this
 * class contains methods for offer service CRUD operations.
 */
public class OfferServiceWrapper extends BasicWrapper {

	private static final Logger LOGGER = LoggerFactory.getLogger(OfferServiceWrapper.class);

	public OfferServiceWrapper() {
		uri = PropertyLoader.getLoyaltyOfferUri();
		dynamicMap = new HashMap<String, Map<String, String>>();
		Map<String, String> endPoint = new HashMap<String, String>();
		endPoint.put(END_PONT, PropertyLoader.getLoyaltyOfferHost());
		endPoint.put(RESOURCE_PATH_URL, this.getClass().getClassLoader().getResource("data/json/").toString());
		dynamicMap.put(HOST_DETAILS, endPoint);
		headerParameters = HEADER_PARAMETERS_REST;
	}

	@Override
	public DataTable getDynamicTable(DataTable table) {
		List<List<String>> tableData = new ArrayList<List<String>>();
		List<String> column = new ArrayList<String>();
		List<String> columnValue = new ArrayList<String>();
		String requestFile = CommonUtility.getDataTableMap(table).get(REQUEST_FILE);
		String responseFile = CommonUtility.getDataTableMap(table).get(RESPONSE_FILE);
		String requestMethod = CommonUtility.getDataTableMap(table).get(REQUEST_METHOD);
		String pathParameters = CommonUtility.getDataTableMap(table).get(PATH_PARAMETERS);
		column.add(URI);
		if (requestMethod.equals("GET") || requestMethod.equals("DELETE")) {
			columnValue.add(uri + "/{offerCode}");
		} else {
			columnValue.add(uri);
		}

		column.add(HEADER_PARAMS);
		columnValue.add(headerParameters);

		column.add(REQUEST_METHOD);
		columnValue.add(requestMethod);
		if (requestFile != null) {
			column.add(REQUEST_FILE);
			columnValue.add(requestFile);
		}
		if (responseFile != null) {
			column.add(RESPONSE_FILE);
			columnValue.add(responseFile);
		}
		if (pathParameters != null) {
			column.add(PATH_PARAMETERS);
			columnValue.add(pathParameters);
		}

		tableData.add(column);
		tableData.add(columnValue);
		DataTable actualTable = DataTable.create(tableData);

		return actualTable;
	}

	/**
	 * This method is used to to create the offer.
	 *
	 * @param requestFile
	 *            the request file
	 * @return the string
	 */
	public Map<String, Object> createOffer(DataTable table, Map<String, String> dynamicReq) {
		LOGGER.info("Start of method :: createOffer");
		dynamicMap.put("DYNAMIC_REQUEST_BODY", dynamicReq);
		//DataTable actualTable = getDynamicTable(table);
		DataTable actualTable = getDynamicTableFromList();
		RestAssuredClientImpl client = new RestAssuredClientImpl();
		Map<String, Object> response = null;
		try {
			response = client.invokeService(actualTable, dynamicMap);
		}catch (FileNotFoundException e) {
			LOGGER.error("FileNotFoundException: in createOffer, Given Input requestFile/Response File Does not exist {}", e.toString());
			throw new RuntimeException(e.toString());
		} catch (IOException e) {
			LOGGER.error("IOException: in createOffer {}", e.toString());
			throw new RuntimeException(e.toString());
		}
			
		return response;
	}

	/**
	 * This method is used to Approve the offer.
	 *
	 */
	public void updateOfferStatus(DataTable table, String offerCode) {
		LOGGER.info("Start of method :: updateOfferStatus");
		uri = PropertyLoader.getLoyaltyOfferUri();
		DataTable actualTable = getDynamicTable(table);

		Map<String, String> dynamicReq = new HashMap<String, String>();
		dynamicReq.put("offrCode", offerCode);
		dynamicReq.put("DRAFT", CommonUtility.getDataTableMap(table).get("offerStatus"));
		dynamicMap.put("DYNAMIC_REQUEST_BODY", dynamicReq);
		try {
			client.invokeService(actualTable, dynamicMap);
		} catch (FileNotFoundException e) {
			LOGGER.error("FileNotFoundException in updateOfferStatus: Given Input requestFile/Response File Does not exist {}", e.toString());
			throw new RuntimeException(e.toString());
		}catch (IOException e) {
			LOGGER.error("IOException in updateOfferStatus {}", e.toString());
			throw new RuntimeException(e.toString());
		}
		LOGGER.info("End of method :: updateOfferStatus");
	}

	/**
	 * This method is used to testGetOfferById.
	 *
	 */
	public Map<String, Object> retrieveOffer(DataTable table, String offerCode) {
		LOGGER.info("Start of method :: retrieveOffer");
		uri = PropertyLoader.getLoyaltyOfferUri();
		Map<String, String> dynamicReq = new HashMap<String, String>();
		dynamicReq.put("offerCode", offerCode);
		dynamicMap.put("DYNAMIC_PATH_PARAMETERS", dynamicReq);
		DataTable actualTable = getDynamicTable(table);
		Map<String, Object> response = null;
		try {
			response = client.invokeService(actualTable, dynamicMap);
		} catch (FileNotFoundException e) {
			LOGGER.error("FileNotFoundException in retrieveOffer: Given Input requestFile/Response File Does not exist {}", e.toString());
			throw new RuntimeException(e.toString());
		}catch (IOException e) {
			LOGGER.error("IOException in retrieveOffer {}", e.toString());
			throw new RuntimeException(e.toString());
		}
		LOGGER.info("End of method :: retrieveOffer");
		return response;
	}

	/**
	 * This method is used to to Delete the offer.
	 *
	 * @param String
	 *            offerCode
	 * @return void
	 */
	public void deleteOffer(DataTable table, String offerCode) {
		LOGGER.info("Start of method :: deleteOffer");
		uri = PropertyLoader.getLoyaltyOfferUri();
		Map<String, String> dynamicReq = new HashMap<String, String>();
		dynamicReq.put("offerCode", offerCode);
		dynamicMap.put("DYNAMIC_PATH_PARAMETERS", dynamicReq);
		DataTable actualTable = getDynamicTable(table);

		try {
			client.invokeService(actualTable, dynamicMap);
		} catch (FileNotFoundException e) {
			LOGGER.error("FileNotFoundException in deleteOffer: Given Input requestFile/Response File Does not exist {}", e.toString());
			throw new RuntimeException(e.toString());
		}catch (IOException e) {
			LOGGER.error("IOException in deleteOffer {}", e.toString());
			throw new RuntimeException(e.toString());
		}
		LOGGER.info("End of method :: deleteOffer");
	}
	public Map<String, Object> retrieveActivity(DataTable table, String offerCode) {
		LOGGER.info("Start of method :: retrieveActivity");
		uri = PropertyLoader.getLoyaltyActivityLogUri();
		Map<String, String> dynamicReq = new HashMap<String, String>();
		dynamicReq.put("offerCode", offerCode);
		dynamicMap.put("DYNAMIC_PATH_PARAMETERS", dynamicReq);
		DataTable actualTable = getDynamicTable(table);
		Map<String, Object> response = null;
		try {
			response = client.invokeService(actualTable, dynamicMap);
		} catch (FileNotFoundException e) {
			LOGGER.error("FileNotFoundException in retrieveOffer: Given Input requestFile/Response File Does not exist {}", e.toString());
			throw new RuntimeException(e.toString());
		}catch (IOException e) {
			LOGGER.error("IOException in retrieveActivityLog {}", e.toString());
			throw new RuntimeException(e.toString());
		}
		LOGGER.info("End of method :: retrieveActivity");
		return response;
	}

	
	public Map<String, Object> hitExternalService() {
		LOGGER.info("Start of method :: createOffer");
		//Map<String, String> dynamicReq = null;
		//dynamicMap.put("DYNAMIC_REQUEST_BODY", dynamicReq);
		//DataTable actualTable = getDynamicTable(table);
		DataTable actualTable = getDynamicTableFromList();
		RestAssuredClientImpl client = new RestAssuredClientImpl();
		Map<String, Object> response = null;
		try {
			response = client.invokeService(actualTable, dynamicMap);
		}catch (FileNotFoundException e) {
			LOGGER.error("FileNotFoundException: in createOffer, Given Input requestFile/Response File Does not exist {}", e.toString());
			throw new RuntimeException(e.toString());
		} catch (IOException e) {
			LOGGER.error("IOException: in createOffer {}", e.toString());
			throw new RuntimeException(e.toString());
		}
			
		return response;
	}
	
	
	public DataTable getDynamicTableFromList() {
		List<List<String>> tableData = new ArrayList<List<String>>();
		List<String> column = new ArrayList<String>();
		List<String> columnValue = new ArrayList<String>();
		String requestFile = "Request_hitService.json";
		String responseFile = "Request_CreateOffer_Scenario1.json";
		String requestMethod = "POST";
		String pathParameters = "";
		column.add(URI);
		if (requestMethod.equals("GET") || requestMethod.equals("DELETE")) {
			columnValue.add(uri + "/{offerCode}");
		} else {
			columnValue.add(uri);
		}

		column.add(HEADER_PARAMS);
		columnValue.add(headerParameters);

		column.add(REQUEST_METHOD);
		columnValue.add(requestMethod);
		if (requestFile != null) {
			column.add(REQUEST_FILE);
			columnValue.add(requestFile);
		}
		if (responseFile != null) {
			column.add(RESPONSE_FILE);
			columnValue.add(responseFile);
		}
		if (pathParameters != null) {
			column.add(PATH_PARAMETERS);
			columnValue.add(pathParameters);
		}

		tableData.add(column);
		tableData.add(columnValue);
		DataTable actualTable = DataTable.create(tableData);

		return actualTable;
	}
	
	
	
	
}
