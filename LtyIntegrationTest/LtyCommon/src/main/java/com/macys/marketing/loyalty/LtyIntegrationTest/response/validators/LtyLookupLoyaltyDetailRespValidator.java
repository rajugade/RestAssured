package com.macys.marketing.loyalty.LtyIntegrationTest.response.validators;


import static com.macys.marketing.loyalty.LtyIntegrationTest.util.WrapperConstants.ACTUAL_RESPONSE;
import static com.macys.marketing.loyalty.LtyIntegrationTest.util.WrapperConstants.EXPECTED_RESPONSE;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.macys.loyalty.schemas.loyalty.account.ltyaccountresponse.v12_0.LtyLookupLoyaltyDetailResp;
import com.macys.loyalty.schemas.loyalty.account.ltyaccountresponse.v12_0.ProgramDetail;
import com.macys.marketing.loyalty.LtyIntegrationTest.util.LtyUtility;
import com.macys.marketing.loyalty.LtyIntegrationTest.util.WrapperConstants;

import io.restassured.response.Response;

public class LtyLookupLoyaltyDetailRespValidator {
	private final Logger LOGGER = LoggerFactory.getLogger(LtyLookupLoyaltyDetailRespValidator.class);
	SoftAssertions softly = new SoftAssertions();
	public String cuspMessage;

	/**
	 * To validate adjustment of accommodated dollar value to TFS/P2P program
	 * @author rmarla
	 * @param lookupLoyaltyDetailMap
	 */
	public void validateLtyLookupLoyaltyDetail(Map<String, Object> lookupLoyaltyDetailMap) {
		
		Response response = (Response) lookupLoyaltyDetailMap.get(ACTUAL_RESPONSE);
		
		if (response.statusCode() != 200)
			Assert.fail("The LtyLookupLoyaltyDetail serive is returning : "+response.statusCode()+"Response code, The Response is: /n"+ response.asString());
		
		LtyLookupLoyaltyDetailResp ltyLookupLoyaltyDetail = (LtyLookupLoyaltyDetailResp) LtyUtility.getObjFromXml(response.asString(), LtyLookupLoyaltyDetailResp.class);
		
		String expectedResponseStr = (String)lookupLoyaltyDetailMap.get(EXPECTED_RESPONSE);
		LtyLookupLoyaltyDetailResp expectedResponse = (LtyLookupLoyaltyDetailResp) LtyUtility.getObjFromXml(expectedResponseStr, LtyLookupLoyaltyDetailResp.class);
		
		
		
		if (expectedResponse.getLtyLookupLoyaltyDetail() != null) {
			validate(ltyLookupLoyaltyDetail, expectedResponse);
		}
		
		softly.assertAll();
	}
	
	public void validate(LtyLookupLoyaltyDetailResp actual,
			LtyLookupLoyaltyDetailResp expected) {

		//Validate OperationResponse Message and ReturnCode
		softly.assertThat(actual.getOperationResponse().getMessage()).as("The LtyLookupLoyaltyDetailResp.OperationResponse.Message is: ")
				.isEqualTo(expected.getOperationResponse().getMessage());
		softly.assertThat(actual.getOperationResponse().getReturnCode()).as("The LtyLookupLoyaltyDetailResp.OperationResponse.ReturnCode is: ")
				.isEqualTo(expected.getOperationResponse().getReturnCode());
		
		//Validate Reward
		ProgramDetail actualProg = null;
		List<ProgramDetail>  progDetail = actual.getLtyLookupLoyaltyDetail().getProgramDetail();
		for(ProgramDetail pd : progDetail){
			if(WrapperConstants.PROGRAMM_TFS.equals(pd.getRewardSummary().getRewardGroupCode())){
				actualProg = pd;
				break;
			}
		}
		ProgramDetail expectedProg = null;
		List<ProgramDetail>  expectedProgDetail = expected.getLtyLookupLoyaltyDetail().getProgramDetail();
		for(ProgramDetail pd : expectedProgDetail){
			if(WrapperConstants.PROGRAMM_TFS.equals(pd.getRewardSummary().getRewardGroupCode())){
				expectedProg = pd;
				break;
			}
		}
		
		if(actualProg != null && expectedProg != null){
			validateTfsProgramDetail(actualProg, expectedProg);
		}
		
	}
	
	/**
	 * To validate available reward of TFS Programm
	 * @param actual
	 * @param expected
	 */
	public void validateTfsProgramDetail(ProgramDetail actual, ProgramDetail expected){
		LOGGER.info("validateTfsProgramDetail {} = {}", 
				actual.getRewardSummary().getCurrentBalance().getAvailableReward(),
				expected.getRewardSummary().getCurrentBalance().getAvailableReward());
		softly.assertThat(actual.getRewardSummary().getCurrentBalance().getAvailableReward()).as("The LtyLookupLoyaltyDetailResp.ProgramDetail.ns0:RewardSummary.CurrentBalance.AvailableReward is: ")
		.isEqualTo(expected.getRewardSummary().getCurrentBalance().getAvailableReward());
	}
	
	
	public void verifyLookupLoyaltyDetail(LtyLookupLoyaltyDetailResp beforeAdjust, LtyLookupLoyaltyDetailResp afterAdjust, double adjustAmount){
		if(afterAdjust != null){
			double prevBalance = 0.0;
			List<ProgramDetail>  progDetail = beforeAdjust.getLtyLookupLoyaltyDetail().getProgramDetail();
			for(ProgramDetail pd : progDetail){
				if("TFS".equals(pd.getRewardSummary().getRewardGroupCode())){
					BigDecimal availReward = pd.getRewardSummary().getCurrentBalance().getAvailableReward();
					prevBalance = availReward.doubleValue();
					break;
				}
			}
			LOGGER.info("verifyLookupLoyaltyDetail prevBalance {}", prevBalance);
			
			double currentBalance = 0.0;
			List<ProgramDetail>  currentProgDetail = afterAdjust.getLtyLookupLoyaltyDetail().getProgramDetail();
			for(ProgramDetail pd : currentProgDetail){
				if("TFS".equals(pd.getRewardSummary().getRewardGroupCode())){
					BigDecimal availReward = pd.getRewardSummary().getCurrentBalance().getAvailableReward();
					currentBalance = availReward.doubleValue();
					break;
				}
			}
			LOGGER.info("verifyLookupLoyaltyDetail currentBalance {}", currentBalance);
			if(prevBalance + adjustAmount == currentBalance){
				//Amount added successfully
				softly.assertThat(currentBalance).as("The LtyLookupLoyaltyDetailResp.CurrentBalance is: ")
				.isEqualTo(prevBalance + adjustAmount);
				
				LOGGER.info("veryfied balance updation {}+{}={}",prevBalance, adjustAmount, currentBalance);
		
			}
		}
		
	}

}
