package com.macys.marketing.loyalty.LtyIntegrationTest.wrapper;

import static com.macys.marketing.loyalty.LtyIntegrationTest.util.WrapperConstants.END_PONT;
import static com.macys.marketing.loyalty.LtyIntegrationTest.util.WrapperConstants.HEADER_PARAMETERS_SOAP;
import static com.macys.marketing.loyalty.LtyIntegrationTest.util.WrapperConstants.HOST_DETAILS;
import static com.macys.marketing.loyalty.LtyIntegrationTest.util.WrapperConstants.RESOURCE_PATH_URL;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.macys.marketing.loyalty.LtyIntegrationTest.util.PropertyLoader;

import cucumber.api.DataTable;

/**
 * This Class is used perform 
 * the TestBed operations
 */
public class LtyTestBedWrapper extends BasicWrapper{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(LtyTestBedWrapper.class);
	
	public LtyTestBedWrapper() {
		uri = "";
		dynamicMap = new HashMap<String, Map<String, String>>();
		Map<String, String> endPoint = new HashMap<String, String>();
		endPoint.put(END_PONT, PropertyLoader.getLTYTestBedAddress());
		endPoint.put(RESOURCE_PATH_URL, this.getClass().getClassLoader().getResource("data/json/").toString());
		dynamicMap.put(HOST_DETAILS, endPoint);
		headerParameters = HEADER_PARAMETERS_SOAP;
	}
	
	public Map<String, Object> invoke(DataTable table, Map<String, String> dynamicReq) {
		LOGGER.info("Start of method :: LtyTestBedWrapper.invoke()");
				
		dynamicMap.put("DYNAMIC_REQUEST_BODY", dynamicReq);
		
		DataTable actualTable = getDynamicTable(table);
		Map<String, Object> response = null;
		try {
			response = client.invokeService(actualTable, dynamicMap);
		} catch (FileNotFoundException e) {
			LOGGER.error("FileNotFoundException in LtyTestBedWrapper.invoke(): Given Input requestFile/Response File Does not exist {}", e.toString());
			throw new RuntimeException(e.toString());
		}catch (IOException e) {
			LOGGER.error("IOException in ltyTransaction {}", e.toString());
			throw new RuntimeException(e.toString());
		}
		LOGGER.info("Start of method :: LtyTestBedWrapper.invoke()");
		
		return response;
	}
	
	public Map<String, Object> presaleIssuance(DataTable table, Map<String, String> dynamicReq) {
		LOGGER.info("Start of method :: presaleIssuance");
		soapAction = "/PresaleIssuance";
		
		Map<String, Object> response =invoke(table, dynamicReq);
		LOGGER.info("Start of method :: presaleIssuance");
		
		return response;
	}
	
	public Map<String, Object> fedfilOrder(DataTable table, Map<String, String> dynamicReq) {
		LOGGER.info("Start of method :: fedfilOrder");
		soapAction = "/FedfilOrder";
		
		Map<String, Object> response =invoke(table, dynamicReq);
		LOGGER.info("Start of method :: fedfilOrder");
		
		return response;
	}
	
	

}
