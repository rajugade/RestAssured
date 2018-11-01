package com.macys.marketing.loyalty.LtyIntegrationTest.wrapper;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.macys.marketing.loyalty.LtyIntegrationTest.Client.impl.RestAssuredClientImpl;
import com.macys.marketing.loyalty.LtyIntegrationTest.util.PropertyLoader;
import static com.macys.marketing.loyalty.LtyIntegrationTest.util.WrapperConstants.*;

import cucumber.api.DataTable;

/**
 * The Class OfferServiceWrapper is wrapper for RestClientHelper class, this
 * class contains methods for offer service CRUD operations.
 */
public class ControlElementsWrapper extends BasicWrapper {

	private static final Logger LOGGER = LoggerFactory.getLogger(ControlElementsWrapper.class);

	public ControlElementsWrapper() {
		uri = PropertyLoader.getLoyaltyControlElementsUri();
		dynamicMap = new HashMap<String, Map<String, String>>();
		Map<String, String> endPoint = new HashMap<String, String>();
		endPoint.put(END_PONT, PropertyLoader.getLoyaltyOfferHost());
		endPoint.put(RESOURCE_PATH_URL, this.getClass().getClassLoader().getResource("data/json/").toString());
		dynamicMap.put(HOST_DETAILS, endPoint);
		headerParameters = HEADER_PARAMETERS_REST;
	}

	
	/**
	 * This method is used to get the control elements
	 */
	public Map<String, Object> getControlElements(DataTable table) {
		LOGGER.info("Start of method :: controlElements");

		DataTable actualTable = getDynamicTable(table);
		RestAssuredClientImpl client = new RestAssuredClientImpl();
		Map<String, Object> response = null;
		try {
			response = client.invokeService(actualTable, dynamicMap);
		} catch (FileNotFoundException e) {
			LOGGER.error("FileNotFoundException in getControlElements: Given Input requestFile/Response File Does not exist {}", e.toString());
			throw new RuntimeException(e.toString());
		}catch (IOException e) {
			LOGGER.error("IOException in getControlElements {}", e.toString());
			throw new RuntimeException(e.toString());
		}

		return response;
	}

}
