package com.macys.marketing.loyalty.LtyIntegrationTest.util;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;


import cucumber.api.DataTable;

public class CommonUtility {
	private static final Logger LOGGER = LoggerFactory.getLogger(CommonUtility.class);
	
	public static Map<String, String> getDataTableMap(DataTable table) {
		Map<String, String> map = new HashMap<String, String>();
		for (int i = 0; i < table.topCells().size(); i++) {
			map.put(table.getGherkinRows().get(0).getCells().get(i), table.getGherkinRows().get(1).getCells().get(i));
		}
		return map;
	}
	
	public static <T> Object getObjectFromJsonString(String response , Class<T> valueType) {
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(SerializationFeature.WRAP_ROOT_VALUE, true);
		mapper.setSerializationInclusion(Include.NON_NULL);
		mapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss"));
		
		Object object = null;
		try {
			object = mapper.readValue(response, valueType);
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return object;
	}
	
	/**
	 * converting xml to object
	 *
	 * @param jaxbUnmarshaller
	 * @param response
	 * @return the object
	 */
	public static Object unmarshall(Unmarshaller jaxbUnmarshaller, String response) {

		SOAPMessage message;
		Object infoResp = null;
		try {
			message = MessageFactory.newInstance().createMessage(null, new ByteArrayInputStream(response.getBytes()));
			Document doc = message.getSOAPBody().extractContentAsDocument();
			infoResp = jaxbUnmarshaller.unmarshal(doc);
		} catch (IOException | SOAPException | JAXBException e) {
			LOGGER.error("CommonUtility.unmarshall()::: {}", e);
			throw new RuntimeException();
		}

		return infoResp;
	}
	
	public static <T> Object getObjectFromXmlString(String requestXml, Class<T> valueType) {
		Object responseObj = null;
		try {
			Unmarshaller jaxbUnmarshaller = JAXBContext.newInstance(valueType).createUnmarshaller();
			responseObj = (Object) LtyUtility.unmarshall(jaxbUnmarshaller, requestXml);
		} catch (JAXBException e) {
			LOGGER.error("CommonUtility.getObjectFromXmlString()::: {}", e);
			throw new RuntimeException();
		}
			return  responseObj;
	}
	/**
	 * @author rmarla
	 */
	public static String updateDynamicRequestBody(String requestBody, Map<String, String> dynamicRequestBodyValuesMap) {
		LOGGER.info("**********updateDynamicRequestBody starting********** {}", dynamicRequestBodyValuesMap);
		for (Map.Entry<String, String> entry : dynamicRequestBodyValuesMap.entrySet()) {
			if (requestBody.contains(entry.getKey())) {
				requestBody = requestBody.replace(entry.getKey(), entry.getValue());
			}
		}
		LOGGER.debug("**********updateDynamicRequestBody ending********** {}", requestBody);
		return requestBody;
	}
	public static String getRequestBodies(String requestFile) throws FileNotFoundException, IOException {

		File file = null;
		String body = "";

		try {
			LOGGER.info("*********getRequestBody starting**************");
			if (StringUtils.isNotBlank(requestFile)) {

				URL url = new URL(requestFile);
				file = new File(url.toURI());
				body = FileUtils.readFileToString(file);
			}
		} catch (FileNotFoundException e) {
			LOGGER.error("Request file not found {}", requestFile);
			throw new FileNotFoundException();
		} catch (IOException e) {
			LOGGER.error("exception in getRequestBody {}", e.toString());
			throw new IOException();
		} catch (URISyntaxException e) {
			LOGGER.error("exception in getRequestBody {}", e.toString());
			// Do not throw any exception for URISyntaxException, Just show
			// error log
		}
		LOGGER.info("***************getRequestBody ending***************");
		return body;
	}
	
	public static String currentTimeStamp() {
		return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").format(System.currentTimeMillis());
	}

	public static String currentDate() {
		return new SimpleDateFormat("yyyy-MM-dd").format(System.currentTimeMillis());
	}

}
