package com.macys.marketing.loyalty.LtyIntegrationTest.Client.impl;

import static io.restassured.RestAssured.expect;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.macys.marketing.loyalty.LtyIntegrationTest.Client.RestAssuredClient;
import com.macys.marketing.loyalty.LtyIntegrationTest.util.PropertyLoader;

import cucumber.api.DataTable;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssuredClientImpl implements RestAssuredClient{

	private Logger LOGGER = LoggerFactory.getLogger(RestAssuredClientImpl.class);
	static Connection conn;
	static String customerEndPoint;
	static String orderEndPoint;
	static String dbURL;
	static String driver;
	static String userName;
	static String password;
	static Properties props;
	static InputStream inputStream;
	static String wiremockUrl;
	static String mockHost;
	static String mockPort;
	static String mocksPath;
	private final String ACCEPT = "Accept";
	private final String APPLICATION_XML = "application/xml";
	private final String APPLICATION_JSON = "application/json";
	public static final String EQUALS_TO = "=";
	public static final String SEMI_COLON = ";";
	public static final String EMPTY_STRING = "";
	public static final String LEFT_BRACE = "{";
	public static final String RIGHT_BRACE = "}";
	public static final String REST_URI = "uri";
	public static final String REQUEST_METHOD = "requestMethod";
	public static final String PATH_PARAMETERS = "pathParameters";
	public static final String QUERY_PARAMETERS = "queryParameters";
	public static final String HEADER_PARAMETERS = "headerParameters";
	public static final String REQUEST_FILE = "requestFile";
	public static final String RESPONSE_FILE = "responseFile";
	public static final String REQUEST_BODY = "requestBody";
	public static final String END_POINT = "endPoint";
	public static final String RESOURCES_PATH_URL = "resourcesPathURL";

	public static final String DYNAMIC_PATH_PARAMETERS = "DYNAMIC_PATH_PARAMETERS";
	public static final String DYNAMIC_REQUEST_BODY = "DYNAMIC_REQUEST_BODY";
	public String expectedResponse = "";
	public String RESPONSE_TYPE = "RESPONSE_TYPE";
	public String responsType = "";
	public String requestMethod = "";
	public String resourcesPathURL = "";
	public String endPoint = "";

	private boolean isRestassuredLogsEnable;
	
	public RestAssuredClientImpl() {
		isRestassuredLogsEnable = PropertyLoader.isRestAssuredLogsEnable();
	}
	/**
	    * This is method will cal REST ASSURED API to invoke the services
	    */
	public Map<String, Object> invokeService(DataTable table, Map<String, Map<String, String>> dynamicMap)
			throws IOException {
		Map<String, Object> map = new HashMap<String, Object>();

		LOGGER.info("*********invokeService is starting*********");
		/**
		  * based on input data(table data) making request builder object
		 */
		
		RequestSpecification requestSpec = getRequestSpecificationBuildData(table, dynamicMap);

		Response response = invokeActualRestServiceAPI(requestSpec);

		map.put("ACTUAL_RESPONSE", response);
		map.put("EXPECTED_RESPONSE", expectedResponse);
		map.put(RESPONSE_TYPE, responsType);
		LOGGER.info("*********invokeService is ending*********");
		return map;
	}
	
	/**
	 * based on Type of request method the concerned rest api method will be invoked by
	 * passing RequestSpecification object which contains all the data to invoke
	 * the service
	 * 
	 */

	private Response invokeActualRestServiceAPI(RequestSpecification requestSpec){
		Response response = null;
		try{
			LOGGER.info("invokeActualRestMethod requestMethod:: {}", requestMethod);
			if (StringUtils.isNotBlank(requestMethod)) {
	
				if (requestMethod.equals(RequestMethod.GET.toString())) {
	
					response = expect().given().spec(requestSpec).when().get();
				} else if (requestMethod.equals(RequestMethod.POST.toString())) {
					response = expect().given().spec(requestSpec).when().post();
				} else if (requestMethod.equals(RequestMethod.PUT.toString())) {
					response = expect().given().spec(requestSpec).when().put();
				} else if (requestMethod.equals(RequestMethod.DELETE.toString())) {
					response = expect().given().spec(requestSpec).when().delete();
				} else if (requestMethod.equals(RequestMethod.PATCH.toString())) {
					response = expect().given().spec(requestSpec).when().patch();
				}
	
			}
		}catch(Exception e){
			LOGGER.error("Exception in invokeActualRestMethod while calling External Service {}", e.toString());
		}
		LOGGER.info("*********invokeActualRestMethod is ending*********");
		return response;
	}
	
	/**
	    * Building request specification builder object by collecting and transforming all
	    * input parameter to make RequestSpecification which is used to invoke the service
	    */

	public RequestSpecification getRequestSpecificationBuildData(DataTable table,
			Map<String, Map<String, String>> dynamicMap) throws IOException {

		Map<String, String> map = new HashMap<String, String>();
		String[] queryParameters = null;
		String[] headerParameters = null;
		String[] pathParameters1 = null;
		Map<String, String> headerParametersMap = new HashMap<String, String>();
		Map<String, String> queryParametersMap = new HashMap<String, String>();
		String requestBody = "";
		expectedResponse = "";
		responsType = APPLICATION_JSON;
		Map<String, String> hostDetails = dynamicMap.get("hostDetails");
		endPoint = hostDetails.get(END_POINT);
		resourcesPathURL = hostDetails.get(RESOURCES_PATH_URL);
		// Map<String,Map<String,String>> dynamicMap = new
		// HashMap<String,Map<String,String>>();

		int tableSize = table.topCells().size();
		for (int i = 0; i < tableSize; i++) {
			map.put(table.getGherkinRows().get(0).getCells().get(i), table.getGherkinRows().get(1).getCells().get(i));
		}

		String uri = map.get(REST_URI);
		requestMethod = map.get(REQUEST_METHOD);
		String requestFile = map.get(REQUEST_FILE);
		String responseFile = map.get(RESPONSE_FILE);
		// String pathParameters = map.get(PATH_PARAMETERS);

		if (StringUtils.isNotBlank(map.get(PATH_PARAMETERS))) {
			pathParameters1 = map.get(PATH_PARAMETERS).split(SEMI_COLON);
		}

		if (StringUtils.isNotBlank(map.get(QUERY_PARAMETERS))) {
			queryParameters = map.get(QUERY_PARAMETERS).split(SEMI_COLON);
		}

		if (StringUtils.isNotBlank(map.get(HEADER_PARAMETERS))) {
			headerParameters = map.get(HEADER_PARAMETERS).split(SEMI_COLON);
		}

		if (pathParameters1 != null && pathParameters1.length > 0) {
			for (String pathParameter : pathParameters1) {
				if (StringUtils.isNotBlank(pathParameter)) {
					String[] subString = pathParameter.split(EQUALS_TO);
					uri = uri.replaceFirst(subString[0], subString[1]);
				}
			}
			uri = uri.replace(LEFT_BRACE, EMPTY_STRING);
			uri = uri.replace(RIGHT_BRACE, EMPTY_STRING);
		}

		LOGGER.info("Final uri:::::: {}", uri);

		if (headerParameters != null && headerParameters.length > 0) {
			for (String header : headerParameters) {
				if (StringUtils.isNotBlank(header)) {
					String[] subString = header.split("=");
					headerParametersMap.put(subString[0], subString[1]);
					if (ACCEPT.equalsIgnoreCase(subString[0])) {
						if (APPLICATION_XML.equalsIgnoreCase(subString[1])) {
							responsType = APPLICATION_XML;
						}
					}
				}
			}

		}

		LOGGER.debug("Headers Map:::::: {}", headerParametersMap);
		if (queryParameters != null && queryParameters.length > 0) {
			for (String queryParameter : queryParameters) {
				if (StringUtils.isNotBlank(queryParameter)) {
					String[] subString = queryParameter.split(EQUALS_TO);
					queryParametersMap.put(subString[0], subString[1]);
				}
			}
		}

		LOGGER.info("**********Request file name********** {}", requestFile);
		if (StringUtils.isNotBlank(requestFile)) {
			requestBody = getRequestBody(requestFile);
		}

		if (dynamicMap != null && dynamicMap.size() > 0) {

			Map<String, String> dynamicPathParameterValuesMap = dynamicMap.get(DYNAMIC_PATH_PARAMETERS);
			Map<String, String> dynamicRequestBodyValuesMap = dynamicMap.get(DYNAMIC_REQUEST_BODY);

			if (StringUtils.isNotBlank(uri)) {
				if (dynamicPathParameterValuesMap != null && dynamicPathParameterValuesMap.size() > 0) {
					uri = updatePathParametersInURI(uri, dynamicPathParameterValuesMap);
				}
			}
			if (StringUtils.isNotBlank(requestBody)) {
				if (dynamicRequestBodyValuesMap != null && dynamicRequestBodyValuesMap.size() > 0) {

					requestBody = updateDynamicRequestBody(requestBody, dynamicRequestBodyValuesMap);
				}
			}
		}
		if (StringUtils.isNotBlank(responseFile)) {
			expectedResponse = getRequestBody(responseFile);
		}

		LOGGER.info("**********Final Final API:::********** {}{}", endPoint, uri);
		
		RequestSpecBuilder builder = new RequestSpecBuilder();
		LOGGER.debug("builder:::::::::: {}", builder);
		builder.setBaseUri(endPoint + uri);
		builder.addHeaders(headerParametersMap);
		builder.addQueryParams(queryParametersMap);
		
		if (StringUtils.isNotBlank(requestBody)) {
			builder.setBody(requestBody);
		}
		
		//Enable/Disable restassured logs
		if(isRestassuredLogsEnable){
			builder.addFilter(new ResponseLoggingFilter(LogDetail.ALL));
			builder.addFilter(new RequestLoggingFilter(LogDetail.ALL));
		}
		
		builder.setRelaxedHTTPSValidation();
		
		RequestSpecification requestSpec = builder.build();
		
		return requestSpec;
	}

	private String getRequestBody(String requestFile) throws FileNotFoundException, IOException {

		File file = null;
		String body = "";

		try{
			LOGGER.info("*********getRequestBody starting**************");
			if (StringUtils.isNotBlank(requestFile)) {
				requestFile = resourcesPathURL + requestFile;
				URL url = new URL(requestFile);
				file = new File(url.toURI());
				body = FileUtils.readFileToString(file);
			}
		}catch(FileNotFoundException e){
			LOGGER.error("Request file not found {}", requestFile);
			throw new FileNotFoundException();
		}catch(IOException e){
			LOGGER.error("exception in getRequestBody {}", e.toString());
			throw new IOException();
		} catch (URISyntaxException e) {
			LOGGER.error("exception in getRequestBody {}", e.toString());
			//Do not throw any exception for URISyntaxException, Just show error log
		}
		LOGGER.info("*********getRequestBody ending**************");
		return body;
	}

	private String updateDynamicRequestBody(String requestBody, Map<String, String> dynamicRequestBodyValuesMap) {
		LOGGER.info("**********updateDynamicRequestBody starting**********");
		for (Map.Entry<String, String> entry : dynamicRequestBodyValuesMap.entrySet()) {
			if (requestBody.contains(entry.getKey())) {
				requestBody = requestBody.replace(entry.getKey(), entry.getValue());
			}
		}
		LOGGER.debug("**********updateDynamicRequestBody ending********** {}", requestBody);
		return requestBody;
	}

	private String updatePathParametersInURI(String uri, Map<String, String> pathParametersMap) {
		LOGGER.info("**********updatePathParametersInURI**********starting");
		for (Map.Entry<String, String> entry : pathParametersMap.entrySet()) {
			if (uri.contains(entry.getKey())) {
				uri = uri.replaceAll(entry.getKey(), entry.getValue());
			}
		}
		LOGGER.info("Final URI::::::::::: {}", uri);
		LOGGER.info("**********updatePathParametersInURI**********ending");
		return uri;
	}

	public String responseContentType() {

		return RESPONSE_TYPE;
	}

}
