package com.macys.marketing.loyalty.LtyIntegrationTest.response.validators;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;

import com.macys.loyalty.schemas.customer.cusresponse.v11_0.CusLookupResp;
import com.macys.loyalty.schemas.customer.cusresponse.v11_0.CusResp;
import com.macys.loyalty.schemas.customer.cusresponse.v11_0.Notification;
import com.macys.marketing.loyalty.LtyIntegrationTest.util.LtyUtility;
import com.macys.loyalty.schemas.customer.cusresponse.v11_0.AcctProgramInfo;

import io.restassured.response.Response;

public class CusLookupRespValidator {

	SoftAssertions softly = new SoftAssertions();
	public String cuspMessage;

	public void validate(Map<String, Object> CusEnrollRespMap) {
		Response actual = (Response) CusEnrollRespMap.get("ACTUAL_RESPONSE");
		String expected = (String) CusEnrollRespMap.get("EXPECTED_RESPONSE");

		if (actual.statusCode() != 200)
			Assert.fail("The Status Code of the Response is:" + actual.statusCode());
		if(expected!=""){
			CusLookupResp actualResponse = (CusLookupResp) LtyUtility.getObjFromXml(actual.asString(), CusLookupResp.class);
			CusLookupResp expectedResponse = (CusLookupResp) LtyUtility.getObjFromXml(expected, CusLookupResp.class);

			validateCusLookupResp(actualResponse, expectedResponse);
		}

	}

	public void validateCusLookupResp(CusLookupResp actual, CusLookupResp expected) {

		if (expected.getCusResp() != null) {
			validateCusResp(actual.getCusResp(), expected.getCusResp());

		}
		if (expected.getCustomer() != null) {
			if (expected.getCustomer().get(0).getAcctProgramInfo() != null) {
				validateAcctProgramInfo(actual.getCustomer().get(0).getAcctProgramInfo(),
						expected.getCustomer().get(0).getAcctProgramInfo());
				validateNotification(actual.getCustomer().get(0).getNotification(), expected.getCustomer().get(0).getNotification());
				
			}
		}
		softly.assertAll();
	}

	public void validateCusResp(com.macys.loyalty.schemas.customer.macyscommon.v11_0.Response actual,
			com.macys.loyalty.schemas.customer.macyscommon.v11_0.Response expected) {

		softly.assertThat(actual.getMessage()).as("The CusLookupResp.CusResp.Message is: ")
				.isEqualTo(expected.getMessage());
		softly.assertThat(actual.getReturnCode()).as("The CusLookupResp.CusResp.ReturnCode is: ")
				.isEqualTo(expected.getReturnCode());
	}

	public void validateAcctProgramInfo(List<AcctProgramInfo> actual, List<AcctProgramInfo> expected) {
		if (actual.size() == expected.size()) {
			
			Collections.sort(actual, (AcctProgramInfo p1, AcctProgramInfo p2)->{
				return p1.getProgramCode().compareToIgnoreCase(p2.getProgramCode());
			});
			Collections.sort(expected, (AcctProgramInfo p1, AcctProgramInfo p2)->{
				return p1.getProgramCode().compareToIgnoreCase(p2.getProgramCode());
			});

			for (int i = 0; i < actual.size(); i++) {
				String progCode = actual.get(i).getProgramCode();
				softly.assertThat(actual.get(i).getPriorAward()).as("The CusLookupResp.AcctProgramInfo.PriorAward of Program code "+progCode+" is: ")
						.isEqualTo(expected.get(i).getPriorAward());
				softly.assertThat(actual.get(i).getProgramAwardValue())
						.as("The CusLookupResp.AcctProgramInfo.getProgramAwardValue of Program code "+progCode+" is: ")
						.isEqualTo(expected.get(i).getProgramAwardValue());
				softly.assertThat(actual.get(i).getProgramCode())
						.as("The CusLookupResp.AcctProgramInfo.getProgramCode of Program code "+progCode+" is: ")
						.isEqualTo(expected.get(i).getProgramCode());
				softly.assertThat(actual.get(i).getProgramYear())
						.as("The CusLookupResp.AcctProgramInfo.getProgramYear of Program code "+progCode+" is: ")
						.isEqualTo(expected.get(i).getProgramYear());
				softly.assertThat(actual.get(i).getRewardCurrency())
						.as("The CusLookupResp.AcctProgramInfo.getRewardCurrency of Program code "+progCode+" is: ")
						.isEqualTo(expected.get(i).getRewardCurrency());
				softly.assertThat(actual.get(i).getRewardThresholdForAward())
						.as("The CusLookupResp.AcctProgramInfo.getRewardThresholdForAward of Program code "+progCode+" is: ")
						.isEqualTo(expected.get(i).getRewardThresholdForAward());
				// TODO
				/*
				 * softly.assertThat(actual.get(i).getTierName()).as(
				 * "The CusLookupResp.AcctProgramInfo.getTierName is: ")
				 * .isEqualTo(expected.get(i).getTierName());
				 * softly.assertThat(actual.get(i).getEnrollmentDate()) .as(
				 * "The CusLookupResp.AcctProgramInfo.getEnrollmentDate is: ")
				 * .isEqualTo(expected.get(i).getEnrollmentDate());
				 */
				softly.assertThat(actual.get(i).isIsProgramActive())
						.as("The CusLookupResp.AcctProgramInfo.IsProgramActive of Program code "+progCode+" is: ")
						.isEqualTo(expected.get(i).isIsProgramActive());
				softly.assertThat(actual.get(i).isIsEnrolled()).as("The CusLookupResp.AcctProgramInfo.IsEnrolled of Program code "+progCode+" is: ")
						.isEqualTo(expected.get(i).isIsEnrolled());
				softly.assertThat(actual.get(i).isIsEligible()).as("The CusLookupResp.AcctProgramInfo.IsEligible of Program code "+progCode+" is: ")
						.isEqualTo(expected.get(i).isIsEligible());
			}

		} else {
			softly.fail("actual CusLookupResp.AcctProgramInfo size() is ::" + actual.size()
					+ "expected CusLookupResp.AcctProgramInfo size() is ::" + expected.size());
		}
	}
	
	public void validateNotification(List<Notification> actual, List<Notification> expected) {
		if (actual.size() == expected.size()) {
			for (int i = 0; i < actual.size(); i++) {
				softly.assertThat(actual.get(i).getName()).as("The CusLookupResp.Notification.Name is: ")
				.isEqualTo(expected.get(i).getName());
				softly.assertThat(actual.get(i).getValue()).as("The CusLookupResp.Notification.Value is: ")
				.isEqualTo(expected.get(i).getValue());
			}
		}
		else {
			softly.fail("actual CusLookupResp.Notification size() is ::" + actual.size()
					+ "expected CusLookupResp.Notification size() is ::" + expected.size());
		}
		
	}

	public void validateCusResps(Map<String, Object> CusLookUpRespMap) {
		Response actual = (Response) CusLookUpRespMap.get("ACTUAL_RESPONSE");
		String expected = (String) CusLookUpRespMap.get("EXPECTED_RESPONSE");
		if (actual.statusCode() != 200)
			Assert.fail("The Status Code of the Response is:" + actual.statusCode());
		
		CusResp actualResponse = (CusResp) LtyUtility.getObjFromXml(actual.asString(), CusResp.class);
		CusResp expectedResponse = (CusResp) LtyUtility.getObjFromXml(expected, CusResp.class);
		expectedResponse.setMessage(cuspMessage);
		softly.assertThat(actualResponse.getMessage()).as("The CusResp.Message is: ").isEqualTo(expectedResponse.getMessage());
		softly.assertThat(actualResponse.getReturnCode()).as("The CusResp.ReturnCode is: ").isEqualTo(expectedResponse.getReturnCode());
		softly.assertAll();
	}
	
	
	/**
	 * These method is to validate negative scenarios for cusEnroll and cusLookups
	 * 
	 * @param CusLookUpRespMap
	 */
	public void validate500(Map<String, Object> CusLookUpRespMap) {
		Response actual = (Response) CusLookUpRespMap.get("ACTUAL_RESPONSE");

		if (actual.statusCode() == 500) {
			softly.assertThat(actual.asString()).as("The Fault code is: ").contains(cuspMessage);
		}
		softly.assertAll();

	}
}
