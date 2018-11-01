package com.macys.marketing.loyalty.LtyIntegrationTest.response.validators;

import static com.macys.marketing.loyalty.LtyIntegrationTest.util.WrapperConstants.ACTUAL_RESPONSE;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPConstants;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;

import org.assertj.core.api.SoftAssertions;

import io.restassured.response.Response;

public class LtyTestBedValidator {
	SoftAssertions softly = new SoftAssertions();

	public void validatePresale(Map<String, Object> responseMap) {
		Response response = (Response) responseMap.get(ACTUAL_RESPONSE);
		InputStream inputStream = new ByteArrayInputStream(response.asString().getBytes());
		try {
			SOAPMessage sm = MessageFactory.newInstance(SOAPConstants.SOAP_1_1_PROTOCOL).createMessage(null, inputStream);
			sm.getSOAPBody();

			softly.assertThat(
					sm.getSOAPBody()
							.getElementsByTagNameNS("http://www.tibco.com/schemas/MacysLTY_TestBed/TestBedRes",
									"TestBedResp")
							.item(0).getLastChild().getTextContent())
					.as("The TestBedResp.Message is: ").isEqualTo("SUCCESS");
		}

		catch (IOException | SOAPException e) {
			e.printStackTrace();
		}
		softly.assertAll();
	}

}
