package com.macys.marketing.loyalty.LtyIntegrationTest.wrapper;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.macys.marketing.loyalty.LtyIntegrationTest.util.PropertyLoader;

import cucumber.api.DataTable;
import static com.macys.marketing.loyalty.LtyIntegrationTest.util.WrapperConstants.*;

/**
 * This Class is used perform 
 * the lookup and transaction operations
 */
public class LtyLookUpWrapper extends BasicWrapper {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(LtyLookUpWrapper.class);
	
	public LtyLookUpWrapper() {
		uri = "";
		dynamicMap = new HashMap<String, Map<String, String>>();
		Map<String, String> endPoint = new HashMap<String, String>();
		endPoint.put(END_PONT, PropertyLoader.getLoyaltyAccountv12Address());
		endPoint.put(RESOURCE_PATH_URL, this.getClass().getClassLoader().getResource("data/json/").toString());
		dynamicMap.put(HOST_DETAILS, endPoint);
		headerParameters = HEADER_PARAMETERS_SOAP;
	}
	
	/**
	 * To send LtyLookupLoyaltyDetail service to environment
	 * @author rmarla
	 */
	public Map<String, Object> lookupLoyaltyDetail(DataTable table, Map<String, String> dynamucRequest){
		LOGGER.info("Start of method :: lookupLoyaltyDetail");
		
		soapAction = "/LtyLookupLoyaltyDetail";
		dynamicMap.put("DYNAMIC_REQUEST_BODY", dynamucRequest);
		
		DataTable actualTable = getDynamicTable(table);
		Map<String, Object> response = null;
		try {
			response = client.invokeService(actualTable, dynamicMap);
		} catch (FileNotFoundException e) {
			LOGGER.error("FileNotFoundException in lookupLoyaltyDetail: Given Input requestFile/Response File Does not exist {}", e.toString());
			throw new RuntimeException(e.toString());
		}catch (IOException e) {
			LOGGER.error("IOException in lookupLoyaltyDetail {}", e.toString());
			throw new RuntimeException(e.toString());
		}
		
		LOGGER.info("Start of method :: lookupLoyaltyDetail");
		
		return response;
	}
	
	/**
	 * This lookupOfferInfo is used for 
	 * check our offer in loyalty business engine
	 * updated or not using offer request and offercode 
	 *
	 * @param DataTable
	 * @return Map<String, Object>
	 */
	public Map<String, Object> lookupOfferInfo(DataTable table, String offerCode) {
		LOGGER.info("Start of method :: lookupOfferInfo");
		soapAction= "/Services/LTY_Account_v11.serviceagent//LtyLookupOfferInfo";
		Map<String, String> offerCodeMap = new HashMap<String, String>();
		offerCodeMap.put("OfferCodeValue", offerCode);
		dynamicMap.put("DYNAMIC_REQUEST_BODY", offerCodeMap);
		
		DataTable actualTable = getDynamicTable(table);
		Map<String, Object> response = null;
		try {
			response = client.invokeService(actualTable, dynamicMap);
		} catch (FileNotFoundException e) {
			LOGGER.error("FileNotFoundException in lookupOfferInfo: Given Input requestFile/Response File Does not exist {}", e.toString());
			throw new RuntimeException(e.toString());
		}catch (IOException e) {
			LOGGER.error("IOException in lookupOfferInfo {}", e.toString());
			throw new RuntimeException(e.toString());
		}
		
		
		//String responseFile = requestFile.replaceAll("Request", "Response");
		//String requestXml = LtyUtility.getLTYLookUPxml(responseFile, offerCode);
		//LtyLookupOfferInfoResp expResponse = LtyUtility.getLookUpObj(requestXml);
		//lookUpValidate.validateLtyLookUpInfo(actualResponse, expResponse);
		LOGGER.info("Start of method :: lookupOfferInfo");
		
		return response;
	}

}
