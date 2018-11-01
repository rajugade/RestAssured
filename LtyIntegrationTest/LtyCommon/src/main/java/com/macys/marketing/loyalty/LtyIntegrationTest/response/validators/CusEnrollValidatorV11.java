package com.macys.marketing.loyalty.LtyIntegrationTest.response.validators;

import java.util.List;
import java.util.Map;

import org.assertj.core.api.SoftAssertions;

import com.macys.loyalty.schemas.customer.cuscommon.v11_0.AccountIdentifier;
import com.macys.loyalty.schemas.customer.cuscommon.v11_0.ProgramInfo;
import com.macys.loyalty.schemas.customer.cusresponse.v11_0.CusEnrollResp;
import com.macys.marketing.loyalty.LtyIntegrationTest.util.LtyUtility;

import io.restassured.response.Response;

public class CusEnrollValidatorV11 {

	SoftAssertions softly = new SoftAssertions();

	public void validate(Map<String, Object> CusEnrollRespMap) {
		Response actual = (Response) CusEnrollRespMap.get("ACTUAL_RESPONSE");
		String expected = (String) CusEnrollRespMap.get("EXPECTED_RESPONSE");
		CusEnrollResp actualResponse = (CusEnrollResp) LtyUtility.getObjFromXml(actual.asString(), CusEnrollResp.class);
		CusEnrollResp expectedResponse = (CusEnrollResp) LtyUtility.getObjFromXml(expected, CusEnrollResp.class);
		validateCusEnrollResp(actualResponse, expectedResponse);

	}

	public void validateCusEnrollResp(CusEnrollResp actual, CusEnrollResp expected) {
		if (actual != null && expected != null) {
			if (actual.getCusResp() != null) {
				if (expected.getCusResp() != null) {
					validateCusResp(actual.getCusResp(), expected.getCusResp());
				} else {
					softly.fail("expected.getCusResp() response object is getting as null");
				}
			}
			if (actual.getCustomerIdentifier() != null) {
				if (expected.getCustomerIdentifier() != null) {
					validateCustomerIdentifier(actual.getCustomerIdentifier(), expected.getCustomerIdentifier());
				} else {
					softly.fail("expected.getCustomerIdentifier() response object is getting as null");
				}
			}
			if (actual.getProgramInfo() != null) {
				if (expected.getProgramInfo() != null) {
					validateProgramInfo(actual.getProgramInfo(), expected.getProgramInfo());
				} else {
					softly.fail("expected.getProgramInfo() response object is getting as null");
				}
			}
		} else {
			softly.fail(
					"actual/expected response object is getting as null, actula: " + actual + " expected:" + expected);
		}
		
		softly.assertAll();
	}
	public void validateCusResp(com.macys.loyalty.schemas.customer.macyscommon.v11_0.Response actual, com.macys.loyalty.schemas.customer.macyscommon.v11_0.Response expected) {
		softly.assertThat(actual.getMessage()).as("The CusResp.Message value is: ")
		.isEqualTo(expected.getMessage());
		softly.assertThat(actual.getReturnCode()).as("The CusResp.Message value is: ")
		.isEqualTo(expected.getReturnCode());
	}
	
	public void validateCustomerIdentifier(List<AccountIdentifier> actual, List<AccountIdentifier> expected) {
		if (actual.size() == expected.size()) {
			for (int i = 0; i < actual.size(); i++) {
				softly.assertThat(actual.get(i).getAccountType()).as("The CustomerIdentifier.getAccountType value is: ")
				.isEqualTo(expected.get(i).getAccountType());
				softly.assertThat(actual.get(i).getAccountNumber()).as("The CustomerIdentifier.getAccountNumber value is: ")
				.isEqualTo(expected.get(i).getAccountNumber());
			}
		}
		else {
			softly.fail("List<AccountIdentifier> size of actual and expected are not equal");
		}

	}
	
	public void validateProgramInfo(List<ProgramInfo>  actual, List<ProgramInfo>  expected) {
		
		if (actual.size() == expected.size()) {
			for (int i = 0; i < actual.size(); i++) {
				softly.assertThat(actual.get(i).getAwardValue()).as("The ProgramInfo.AwardValue value is: ")
				.isEqualTo(expected.get(i).getAwardValue());
				softly.assertThat(actual.get(i).getDivision()).as("The ProgramInfo.Division value is: ")
				.isEqualTo(expected.get(i).getDivision());
				softly.assertThat(actual.get(i).getProgramCode()).as("The ProgramInfo.getProgramCode value is: ")
				.isEqualTo(expected.get(i).getProgramCode());
				softly.assertThat(actual.get(i).getRewardCurrency()).as("The ProgramInfo.getRewardCurrency value is: ")
				.isEqualTo(expected.get(i).getRewardCurrency());
				softly.assertThat(actual.get(i).getRewardThresholdForAward()).as("The ProgramInfo.getRewardThresholdForAward value is: ")
				.isEqualTo(expected.get(i).getRewardThresholdForAward());
				softly.assertThat(actual.get(i).getTierName()).as("The ProgramInfo.getTierName value is: ")
				.isEqualTo(expected.get(i).getTierName());
				softly.assertThat(actual.get(i).getProgramAttribute()).as("The ProgramInfo.getProgramAttribute value is: ")
				.isEqualTo(expected.get(i).getProgramAttribute());
			}
			
		}
		else {
			softly.fail("List<ProgramInfo> size of actual and expected are not equal");
		}

	}
	

}
