package com.macys.marketing.loyalty.LtyIntegrationTest.util;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Random;
import java.util.stream.Collectors;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

/**
 * The Class LtyUtility.
 */
public class LtyUtility {
	private static final Logger LOGGER = LoggerFactory.getLogger(LtyUtility.class);

	/**
	 * Gets data from the service in object formate
	 *
	 * @param requestFile
	 * @param offerCode
	 * @return the LTYlookUp xml
	 */
	public static String getLTYLookUPxml(String requestFile, String offerCode) {
		String content = null;
		SOAPMessage message = getSoapMessage(requestFile);

		NodeList list;
		try {
			list = message.getSOAPBody().getElementsByTagNameNS(
					"http://loyalty.macys.com/schemas/loyalty.account/LtyAccountRequest/v12_0", "OfferCode");
			for (int i = 0; i < list.getLength(); i++) {
				list.item(i).setTextContent(offerCode);
			}
		} catch (DOMException | SOAPException e) {
			LOGGER.error("LtyUtility.getLTYLookUPxml()::: {}", e);
			throw new RuntimeException();
		}

		content = soapMessageToString(message);
		return content;
	}



	/**
	 * Gets the soap message.
	 *
	 * @param requestFile
	 * @return the soap message
	 */
	public static SOAPMessage getSoapMessage(String requestFile) {
		URL url = null;
		String content = null;
		SOAPMessage message = null;
		BufferedReader br = null;

		try {
			url = new URL(LtyUtility.class.getClassLoader().getResource("data/json/").toString() + requestFile);
			br = new BufferedReader(new FileReader(url.getFile()));
			content = br.lines().collect(Collectors.joining("\n"));
			message = MessageFactory.newInstance().createMessage(null, new ByteArrayInputStream(content.getBytes()));
		} catch (SOAPException | IOException e) {

		} finally {
			try {
				br.close();
			} catch (IOException e) {
				LOGGER.error("LtyUtility.getSoapMessage()::: {}", e);
				throw new RuntimeException();
			}
		}

		return message;
	}

	/**
	 * Soap message to string.
	 *
	 * @param message
	 *            the message
	 * @return the string
	 */
	public static String soapMessageToString(SOAPMessage message) {
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		try {
			message.writeTo(out);
		} catch (SOAPException | IOException e) {
			LOGGER.error("LtyUtility.soapMessageToString()::: {}", e);
			throw new RuntimeException();
		}
		String content = new String(out.toByteArray());

		return content;
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
			LOGGER.error("LtyUtility.unmarshall()::: {}", e);
			throw new RuntimeException();
		}

		return infoResp;
	}

	/**
	 * Gets the random number.
	 *
	 * @return the random number
	 */
	public static String getRandomNumber(int charLength) {
		return String.valueOf(charLength < 1 ? 0 : new Random()
                .nextInt((9 * (int) Math.pow(10, charLength - 1)) - 1)
                + (int) Math.pow(10, charLength - 1));
	}

	public static <T> Object getObjFromXml(String requestXml, Class<T> objType) {
		Object requiredObj = null;
		try {
			Unmarshaller jaxbUnmarshaller = JAXBContext.newInstance(objType).createUnmarshaller();
			requiredObj = (Object) LtyUtility.unmarshall(jaxbUnmarshaller, requestXml);
		} catch (JAXBException e) {
			LOGGER.error("LtyUtility.getObjFromXml()::: {}", e);
			throw new RuntimeException();
		}
		return requiredObj;
	}

}
