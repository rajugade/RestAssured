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
 * the lookup and transaction operations
 */
public class LtyTransactionWrapper extends BasicWrapper{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(LtyTransactionWrapper.class);
	
	public LtyTransactionWrapper() {
		uri = "";
		dynamicMap = new HashMap<String, Map<String, String>>();
		Map<String, String> endPoint = new HashMap<String, String>();
		endPoint.put(END_PONT, PropertyLoader.getLoyaltyTransactionv12Address());
		endPoint.put(RESOURCE_PATH_URL, this.getClass().getClassLoader().getResource("data/json/").toString());
		dynamicMap.put(HOST_DETAILS, endPoint);
		headerParameters = HEADER_PARAMETERS_SOAP;
	}
	
	public Map<String, Object> ltyTransaction(DataTable table, Map<String, String> dynamicReq) {
		LOGGER.info("Start of method :: ltyTransaction");
		
		soapAction =  "/LtyProcessTran";
		dynamicMap.put("DYNAMIC_REQUEST_BODY", dynamicReq);
		
		DataTable actualTable = getDynamicTable(table);
		Map<String, Object> response = null;
		try {
			response = client.invokeService(actualTable, dynamicMap);
		} catch (FileNotFoundException e) {
			LOGGER.error("FileNotFoundException in ltyTransaction: Given Input requestFile/Response File Does not exist {}", e.toString());
			throw new RuntimeException(e.toString());
		}catch (IOException e) {
			LOGGER.error("IOException in ltyTransaction {}", e.toString());
			throw new RuntimeException(e.toString());
		}
		LOGGER.info("End of method :: ltyTransaction");
		
		return response;
	}
	
	/**
	 * @author rmarla
	 * @param table
	 * @param dynamicReq
	 * @return
	 */
	public Map<String, Object> ltyCustServiceReward(DataTable table, Map<String, String> dynamicReq) {
		LOGGER.info("Start of method :: ltyCustServiceReward");
		
		soapAction =  "/LtyCustServiceReward";
		dynamicMap.put("DYNAMIC_REQUEST_BODY", dynamicReq);
		
		DataTable actualTable = getDynamicTable(table);
		Map<String, Object> response = null;
		try {
			response = client.invokeService(actualTable, dynamicMap);
		} catch (FileNotFoundException e) {
			LOGGER.error("FileNotFoundException in ltyCustServiceReward: Given Input requestFile/Response File Does not exist {}", e.toString());
			throw new RuntimeException(e.toString());
		}catch (IOException e) {
			LOGGER.error("IOException in ltyCustServiceReward {}", e.toString());
			throw new RuntimeException(e.toString());
		}
		LOGGER.info("End of method :: ltyCustServiceReward");
		
		return response;
	}

}
