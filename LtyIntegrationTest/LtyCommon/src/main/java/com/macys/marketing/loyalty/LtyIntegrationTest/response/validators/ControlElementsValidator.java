package com.macys.marketing.loyalty.LtyIntegrationTest.response.validators;

import java.util.List;
import java.util.Map;

import org.assertj.core.api.SoftAssertions;

import com.macys.marketing.loyalty.LtyIntegrationTest.rest.model.offertool.ControlElements;
import com.macys.marketing.loyalty.LtyIntegrationTest.rest.model.offertool.ControlElementsResponse;
import com.macys.marketing.loyalty.LtyIntegrationTest.rest.model.offertool.RwdOfferToolControllers;
import com.macys.marketing.loyalty.LtyIntegrationTest.util.CommonUtility;

import io.restassured.response.Response;

/**
 * The Class AssertValidator.
 */
public class ControlElementsValidator {

	SoftAssertions softly = new SoftAssertions();

	public void validate(Map<String, Object> response) {
		Response actual = (Response) response.get("ACTUAL_RESPONSE");
		String expected = (String) response.get("EXPECTED_RESPONSE");
		ControlElementsResponse actualResponse = actual.as(ControlElementsResponse.class);
		ControlElementsResponse expectedResponse = (ControlElementsResponse) CommonUtility
				.getObjectFromJsonString(expected, ControlElementsResponse.class);
		validateControlElements(expectedResponse.getControlElements(), actualResponse.getControlElements());
	}

	/**
	 * Validate.
	 *
	 * @param request
	 *            the request
	 * @param response
	 *            the response
	 */
	public void validateControlElements(ControlElements request, ControlElements response) {

		if (response != null) {
			if (response.getOfferToolControllers() != null) {
				validatecontrolElement(request.getOfferToolControllers(), response.getOfferToolControllers());
			} else {
				softly.fail("response.getOfferToolControllers() is getting as null");
			}

		} else {
			softly.fail("response object is getting as null");
		}
		softly.assertAll();

	}

	/**
	 * Validate control elements.
	 *
	 * @param req
	 *            the request
	 * @param res
	 *            the response
	 */
	public void validatecontrolElement(List<RwdOfferToolControllers> requestList,
			List<RwdOfferToolControllers> responseList) {

		if (requestList.size() == responseList.size()) {
			for (int i = 0; i < requestList.size(); i++) {
				softly.assertThat(requestList.get(i).getId()).as("ID is: ").isEqualTo(responseList.get(i).getId());
				softly.assertThat(requestList.get(i).getBrand()).as("Brand is: ")
						.isEqualTo(responseList.get(i).getBrand());
				softly.assertThat(requestList.get(i).getDivision()).as("Division is: ")
						.isEqualTo(responseList.get(i).getDivision());
				softly.assertThat(requestList.get(i).getControlKey()).as("ControlKey is: ")
						.isEqualTo(responseList.get(i).getControlKey());
				softly.assertThat(requestList.get(i).getControlElementValue()).as("Control Element Value is: ")
						.isEqualTo(responseList.get(i).getControlElementValue());
				softly.assertThat(requestList.get(i).getControlGroup()).as("Control Group is: ")
						.isEqualTo(responseList.get(i).getControlGroup());
			}
		} else {
			softly.assertThat(requestList.size()).as("The ControlElements size is: ").isEqualTo(responseList.size());
		}
	}
}