package com.macys.marketing.loyalty.LtyIntegrationTest.response.validators;


import static com.macys.marketing.loyalty.LtyIntegrationTest.util.WrapperConstants.ACTUAL_RESPONSE;
import static com.macys.marketing.loyalty.LtyIntegrationTest.util.WrapperConstants.EXPECTED_RESPONSE;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;

import com.macys.loyalty.schemas.loyalty_common.ltycommon.v12_0.AccountIdentifier;
import com.macys.loyalty.schemas.loyalty_common.ltycommon.v12_0.BeginBalance;
import com.macys.loyalty.schemas.loyalty_common.ltycommon.v12_0.CusAccountStatusInfo;
import com.macys.loyalty.schemas.loyalty_common.ltycommon.v12_0.Earned;
import com.macys.loyalty.schemas.loyalty_common.ltycommon.v12_0.EndBalance;
import com.macys.loyalty.schemas.loyalty_common.ltycommon.v12_0.NameDetails;
import com.macys.loyalty.schemas.loyalty_common.ltycommon.v12_0.Notification;
import com.macys.loyalty.schemas.loyalty_common.ltycommon.v12_0.Offer;
import com.macys.loyalty.schemas.loyalty_common.ltycommon.v12_0.ProgramInfo;
import com.macys.loyalty.schemas.loyalty_common.ltycommon.v12_0.SpendInfo;
import com.macys.loyalty.schemas.loyalty_common.ltycommon.v12_0.TierInfo;
import com.macys.loyalty.schemas.loyalty_transaction.ltytransactionresponse.v12_0.Award;
import com.macys.loyalty.schemas.loyalty_transaction.ltytransactionresponse.v12_0.AwardAdjustment;
import com.macys.loyalty.schemas.loyalty_transaction.ltytransactionresponse.v12_0.CustomerInfo;
import com.macys.loyalty.schemas.loyalty_transaction.ltytransactionresponse.v12_0.LtyCustServiceRewardResp;
import com.macys.loyalty.schemas.loyalty_transaction.ltytransactionresponse.v12_0.LtyTransactionResp;
import com.macys.loyalty.schemas.loyalty_transaction.ltytransactionresponse.v12_0.Program;
import com.macys.loyalty.schemas.loyalty_transaction.ltytransactionresponse.v12_0.RewardInfo;
import com.macys.marketing.loyalty.LtyIntegrationTest.util.LtyUtility;


import io.restassured.response.Response;

public class LtyTransactionValidator {
	
	SoftAssertions softly = new SoftAssertions();
	
	
	/**
	 * 
	 * validating actual response with expected response
	 */
	public void validate(Map<String, Object> TFSEnrollRespMap) {
		Response actual = (Response)TFSEnrollRespMap.get("ACTUAL_RESPONSE");
		String expected = (String)TFSEnrollRespMap.get("EXPECTED_RESPONSE");
		
		if (actual.statusCode()!= 200)
		Assert.fail("The Transaction serive is returning : "+actual.statusCode()+"Response code, The Response is: /n"+ actual.asString());
		
		LtyTransactionResp actualResponse = (LtyTransactionResp)LtyUtility.getObjFromXml(actual.asString(), LtyTransactionResp.class);
		LtyTransactionResp expectedResponse =(LtyTransactionResp)LtyUtility.getObjFromXml(expected, LtyTransactionResp.class);
		
		validateLtyTransactionResponse(actualResponse, expectedResponse);
		softly.assertAll();
		
	}
   
	public void validate500(Map<String, Object> TFSEnrollRespMap) {
		Response actual = (Response)TFSEnrollRespMap.get("ACTUAL_RESPONSE");
		
		if (actual.statusCode()== 500){
			softly.assertThat(actual.asString()).as("The Fault code is: ")
			.contains("Account not found");
			/*softly.assertThat(actual.asString()).as("For input string: NaN: ")
			.contains("NaN");
			For input string: "NaN"
*/		}
		softly.assertAll();
		
	}
	
	/**To validate the LtyCustServiceRewardResp status Message and Return code
	 * @author rmarla
	 * @param actualResponse
	 * @param expResponse
	 */
	public void validateLtyCustServiceRewardResponse(Map<String, Object> ltyCustServiceRewardMap){
		
		Response actualResponse = (Response) ltyCustServiceRewardMap.get(ACTUAL_RESPONSE);
		
		if(actualResponse.getStatusCode() != 200){
			Assert.fail("The LtyLookupLoyaltyDetail serive is returning : "+actualResponse.statusCode()+"Response code, The Response is: /n"+ actualResponse.asString());
		}
		LtyCustServiceRewardResp ltyCustServiceReward = (LtyCustServiceRewardResp) LtyUtility.getObjFromXml(actualResponse.asString(), LtyCustServiceRewardResp.class);
		
		String expectedResponseStr = (String)ltyCustServiceRewardMap.get(EXPECTED_RESPONSE);
		LtyCustServiceRewardResp expected = (LtyCustServiceRewardResp) LtyUtility.getObjFromXml(expectedResponseStr, LtyCustServiceRewardResp.class);
		
		
		if (expected.getMessage() != null && expected.getReturnCode() != null) {
			
			softly.assertThat(ltyCustServiceReward.getMessage()).as("The LtyCustServiceRewardResp.Message is: ")
			.isEqualTo(expected.getMessage());
			
			softly.assertThat(ltyCustServiceReward.getReturnCode()).as("The LtyCustServiceRewardResp.ReturnCode is: ")
			.isEqualTo(expected.getReturnCode());
		}
		
		softly.assertAll();
	}
	
	public void validateLtyTransactionResponse(LtyTransactionResp actualResponse, LtyTransactionResp expResponse) {
		if (expResponse != null) {

			if (expResponse.getCustomerInfo() != null) {
				validateCustomerInfo(actualResponse.getCustomerInfo(), expResponse.getCustomerInfo());
			}
			if (expResponse.getNotification() != null) {
				validateNotification(actualResponse.getNotification(), expResponse.getNotification());
			}
			if (expResponse.getOffer() != null) {
				validateOffer(actualResponse.getOffer(), expResponse.getOffer());
			}
			if (expResponse.getProgram() != null) {
				validateProgram(actualResponse.getProgram(), expResponse.getProgram());
			}

		} else {
			softly.fail("actualResponse is ::" + actualResponse + "expResponse is ::" + expResponse);
		}
		softly.assertAll();
	}

	private void validateProgram(List<Program> actualResponse, List<Program> expResponse) {
		
		if (actualResponse.size() == expResponse.size()) {
			for (int i = 0; i < actualResponse.size(); i++) {
				/*softly.assertThat(actualResponse.get(i).getRewardsToNextAward())
						.as("The Program.RewardsToNextAward is: ")
						.isEqualTo(expResponse.get(i).getRewardsToNextAward());*/
				if (actualResponse.get(i).getAward() != null && expResponse.get(i).getAward() != null) {
					validateAward(actualResponse.get(i).getAward(), expResponse.get(i).getAward());
				}
				if (actualResponse.get(i).getAwardAdjustment() != null
						&& expResponse.get(i).getAwardAdjustment() != null) {
					validateAwardAdjustment(actualResponse.get(i).getAwardAdjustment(),
							expResponse.get(i).getAwardAdjustment());
				}
				if (actualResponse.get(i).getProgramInfo() != null && expResponse.get(i).getProgramInfo() != null) {
					validateProgramInfo(actualResponse.get(i).getProgramInfo(), expResponse.get(i).getProgramInfo());
				}
				if (actualResponse.get(i).getRewardSummary() != null && expResponse.get(i).getRewardSummary() != null) {
					validategetRewardSummary(actualResponse.get(i).getRewardSummary(),
							expResponse.get(i).getRewardSummary());
				}
			}
		}
		else {
			softly.fail("Program List size mismatch:: actualResponse ProgramList Size is: "+actualResponse.size()+" expected ProgramList Size is:"+expResponse.size());
		}

	}

	private void validategetRewardSummary(Program.RewardSummary actualResponse, Program.RewardSummary expResponse) {

		softly.assertThat(actualResponse.getRewardGroupCode()).as("The RewardSummary.RewardGroupCode is: ")
				.isEqualTo(expResponse.getRewardGroupCode());
		if (actualResponse.getRewardInfo() != null && expResponse.getRewardInfo() != null) {
			validateRewardInfo(actualResponse.getRewardInfo(), expResponse.getRewardInfo());
		}
	}

	private void validateRewardInfo(RewardInfo actualResponse, RewardInfo expResponse) {
		/*softly.assertThat(actualResponse.getLifeTimeRewardEarned()).as("The RewardInfo.LifeTimeRewardEarned is: ")
				.isEqualTo(expResponse.getLifeTimeRewardEarned());*/
		/*softly.assertThat(actualResponse.getYTDRewardEarned()).as("The RewardInfo.YTDRewardEarned is: ")
				.isEqualTo(expResponse.getYTDRewardEarned());*/
		if (actualResponse.getBeginBalance() != null && expResponse.getBeginBalance() != null) {
			validateBeginBalance(actualResponse.getBeginBalance(), expResponse.getBeginBalance());
		}
		if (actualResponse.getEndBalance() != null && expResponse.getEndBalance() != null) {
			validateEndBalance(actualResponse.getEndBalance(), expResponse.getEndBalance());
		}
		if (actualResponse.getEarned() != null && expResponse.getEarned() != null) {
			validateEarned(actualResponse.getEarned(), expResponse.getEarned());
		}

	}

	private void validateEarned(Earned actualResponse, Earned expResponse) {
		softly.assertThat(actualResponse.getBaseReward()).as("The Earned.BaseReward is: ")
				.isEqualTo(expResponse.getBaseReward());
		softly.assertThat(actualResponse.getBonusReward()).as("The Earned.BaseReward is: ")
				.isEqualTo(expResponse.getBonusReward());
		softly.assertThat(actualResponse.getDeferredReward()).as("The Earned.DeferredReward is: ")
				.isEqualTo(expResponse.getDeferredReward());
		softly.assertThat(actualResponse.getNetReward()).as("The Earned.NetReward is: ")
				.isEqualTo(expResponse.getNetReward());
		softly.assertThat(actualResponse.getPendingBaseReward()).as("The Earned.PendingBaseReward is: ")
				.isEqualTo(expResponse.getPendingBaseReward());
		softly.assertThat(actualResponse.getPendingBonusReward()).as("The Earned.PendingBonusReward is: ")
				.isEqualTo(expResponse.getPendingBonusReward());
		softly.assertThat(actualResponse.getPendingDeferredReward()).as("The Earned.PendingDeferredReward is: ")
				.isEqualTo(expResponse.getPendingDeferredReward());
		softly.assertThat(actualResponse.getPendingTotalReward()).as("The Earned.PendingTotalReward is: ")
				.isEqualTo(expResponse.getPendingTotalReward());
		softly.assertThat(actualResponse.getTotalReward()).as("The Earned.TotalReward is: ")
				.isEqualTo(expResponse.getTotalReward());

	}

	private void validateEndBalance(EndBalance actualResponse, EndBalance expResponse) {
		/*softly.assertThat(actualResponse.getAvailableReward()).as("The EndBalance.AvailableReward is: ")
				.isEqualTo(expResponse.getAvailableReward());*/
		softly.assertThat(actualResponse.getDeferredReward()).as("The EndBalance.DeferredReward is: ")
				.isEqualTo(expResponse.getDeferredReward());
		softly.assertThat(actualResponse.getPendingDeferredReward()).as("The EndBalance.PendingDeferredReward is: ")
				.isEqualTo(expResponse.getPendingDeferredReward());

	}

	private void validateBeginBalance(BeginBalance actualResponse, BeginBalance expResponse) {
		/*softly.assertThat(actualResponse.getAvailableReward()).as("The BeginBalance.AvailableReward is: ")
				.isEqualTo(expResponse.getAvailableReward());*/
		softly.assertThat(actualResponse.getDeferredReward()).as("The BeginBalance.DeferredReward is: ")
				.isEqualTo(expResponse.getDeferredReward());
		softly.assertThat(actualResponse.getPendingDeferredReward()).as("The BeginBalance.DeferredReward is: ")
				.isEqualTo(expResponse.getPendingDeferredReward());
		softly.assertThat(actualResponse.getPendingReward()).as("The BeginBalance.PendingReward is: ")
				.isEqualTo(expResponse.getPendingReward());

	}

	private void validateProgramInfo(ProgramInfo actualResponse, ProgramInfo expResponse) {
		softly.assertThat(actualResponse.getAwardValue()).as("The ProgramInfo.AwardValue is: ")
				.isEqualTo(expResponse.getAwardValue());
		softly.assertThat(actualResponse.getProgramCode()).as("The ProgramInfo.ProgramCode is: ")
				.isEqualTo(expResponse.getProgramCode());
		softly.assertThat(actualResponse.getRewardCurrency()).as("The ProgramInfo.RewardCurrency is: ")
				.isEqualTo(expResponse.getRewardCurrency());
		softly.assertThat(actualResponse.getRewardThresholdForAward())
				.as("The ProgramInfo.RewardThresholdForAward is: ").isEqualTo(expResponse.getRewardThresholdForAward());
		if (actualResponse.getProgramAttribute() != null && expResponse.getProgramAttribute() != null) {
			validateProgramAttribute(actualResponse.getProgramAttribute(), expResponse.getProgramAttribute());
		}
	}

	private void validateProgramAttribute(List<ProgramInfo.ProgramAttribute> actualResponse,
			List<ProgramInfo.ProgramAttribute> expResponse) {
		Collections.sort(actualResponse, new Comparator<ProgramInfo.ProgramAttribute>() {
			public int compare(ProgramInfo.ProgramAttribute s1, ProgramInfo.ProgramAttribute s2) {
				return s1.getName().compareToIgnoreCase(s2.getName());
			}
		});
		Collections.sort(expResponse, new Comparator<ProgramInfo.ProgramAttribute>() {
			public int compare(ProgramInfo.ProgramAttribute s1, ProgramInfo.ProgramAttribute s2) {
				return s1.getName().compareToIgnoreCase(s2.getName());
			}
		});

		if (actualResponse.size() == expResponse.size()) {
			for (int i = 0; i < actualResponse.size(); i++) {
				softly.assertThat(actualResponse.get(i).getName()).as("The ProgramAttribute.Name is: ")
						.isEqualTo(expResponse.get(i).getName());
				softly.assertThat(actualResponse.get(i).getType()).as("The ProgramAttribute.Type is: ")
						.isEqualTo(expResponse.get(i).getType());
				softly.assertThat(actualResponse.get(i).getValue()).as("The ProgramAttribute.Value is: ")
						.isEqualTo(expResponse.get(i).getValue());

			}
		}

	}

	private void validateAwardAdjustment(List<AwardAdjustment> actualResponse, List<AwardAdjustment> expResponse) {
		Collections.sort(actualResponse, new Comparator<AwardAdjustment>() {
			public int compare(AwardAdjustment s1, AwardAdjustment s2) {
				return s1.getAwardReference().compareToIgnoreCase(s2.getAwardReference());
			}
		});
		Collections.sort(expResponse, new Comparator<AwardAdjustment>() {
			public int compare(AwardAdjustment s1, AwardAdjustment s2) {
				return s1.getAwardReference().compareToIgnoreCase(s2.getAwardReference());
			}
		});

		if (actualResponse.size() == expResponse.size()) {
			for (int i = 0; i < actualResponse.size(); i++) {
				softly.assertThat(actualResponse.get(i).getAdjustmentAmount())
						.as("The AwardAdjustment.AdjustmentAmount is: ")
						.isEqualTo(expResponse.get(i).getAdjustmentAmount());
				softly.assertThat(actualResponse.get(i).getAwardReference())
						.as("The AwardAdjustment.AwardReference is: ")
						.isEqualTo(expResponse.get(i).getAwardReference());
				softly.assertThat(actualResponse.get(i).getBeginningBalance())
						.as("The AwardAdjustment.BeginningBalance is: ")
						.isEqualTo(expResponse.get(i).getBeginningBalance());
				softly.assertThat(actualResponse.get(i).getEndingBalance()).as("The AwardAdjustment.EndingBalance is: ")
						.isEqualTo(expResponse.get(i).getEndingBalance());
				softly.assertThat(actualResponse.get(i).getExpirationDate().toString())
						.as("The AwardAdjustment.ExpirationDate is: ")
						.isEqualTo(expResponse.get(i).getExpirationDate().toString());
			}
		}
	}

	private void validateAward(List<Award> actualResponse, List<Award> expResponse) {
		Collections.sort(actualResponse, new Comparator<Award>() {
			public int compare(Award s1, Award s2) {
				return s1.getAwardReference().compareToIgnoreCase(s2.getAwardReference());
			}
		});
		Collections.sort(expResponse, new Comparator<Award>() {
			public int compare(Award s1, Award s2) {
				return s1.getAwardReference().compareToIgnoreCase(s2.getAwardReference());
			}
		});

		if (actualResponse.size() == expResponse.size()) {
			for (int i = 0; i < actualResponse.size(); i++) {
				/*softly.assertThat(actualResponse.get(i).getAmount()).as("The Award.Amount is: ")
						.isEqualTo(expResponse.get(i).getAmount());*/
				softly.assertThat(actualResponse.get(i).getAwardReference()).as("The Award.AwardReference is: ")
						.isEqualTo(expResponse.get(i).getAwardReference());
				softly.assertThat(actualResponse.get(i).getAwardType()).as("The Award.AwardType is: ")
						.isEqualTo(expResponse.get(i).getAwardType());
				/*softly.assertThat(actualResponse.get(i).getDeltaAmount()).as("The Award.DeltaAmount is: ")
						.isEqualTo(expResponse.get(i).getDeltaAmount());*/
				/*softly.assertThat(actualResponse.get(i).getRewardAmountUsed()).as("The Award.RewardAmountUsed is: ")
						.isEqualTo(expResponse.get(i).getRewardAmountUsed());*/
				softly.assertThat(actualResponse.get(i).getEffectiveDate().toString())
						.as("The Award.EffectiveDate is: ").isEqualTo(expResponse.get(i).getEffectiveDate().toString());
				softly.assertThat(actualResponse.get(i).getExpirationDate()).as("The Award.ExpirationDate is: ")
						.isEqualTo(expResponse.get(i).getExpirationDate());
				softly.assertThat(actualResponse.get(i).getIssueDate()).as("The Award.IssueDate is: ")
						.isEqualTo(expResponse.get(i).getIssueDate());
			}

		}
	}

	private void validateOffer(List<Offer> actualResponse, List<Offer> expResponse) {
		Collections.sort(actualResponse, new Comparator<Offer>() {
			public int compare(Offer s1, Offer s2) {
				return s1.getPromoCode().compareToIgnoreCase(s2.getPromoCode());
			}
		});
		Collections.sort(expResponse, new Comparator<Offer>() {
			public int compare(Offer s1, Offer s2) {
				return s1.getPromoCode().compareToIgnoreCase(s2.getPromoCode());
			}
		});

		if (actualResponse.size() == expResponse.size()) {
			for (int i = 0; i < actualResponse.size(); i++) {
				softly.assertThat(actualResponse.get(i).getBarCodeNum()).as("The Offer.BarCodeNum is: ")
						.isEqualTo(expResponse.get(i).getBarCodeNum());
				softly.assertThat(actualResponse.get(i).getExclusions()).as("The Offer.Exclusions is: ")
						.isEqualTo(expResponse.get(i).getExclusions());
				softly.assertThat(actualResponse.get(i).getHeaderText1()).as("The Offer.HeaderText1 is: ")
						.isEqualTo(expResponse.get(i).getHeaderText1());
				softly.assertThat(actualResponse.get(i).getHeaderText2()).as("The Offer.HeaderText2 is: ")
						.isEqualTo(expResponse.get(i).getHeaderText2());
				softly.assertThat(actualResponse.get(i).getImageCode()).as("The Offer.ImageCode is: ")
						.isEqualTo(expResponse.get(i).getImageCode());
				softly.assertThat(actualResponse.get(i).getOfferType()).as("The Offer.OfferType is: ")
						.isEqualTo(expResponse.get(i).getOfferType());
				softly.assertThat(actualResponse.get(i).getPromoCode()).as("The Offer.PromoCode is: ")
						.isEqualTo(expResponse.get(i).getPromoCode());
				softly.assertThat(actualResponse.get(i).getEffectiveDate()).as("The Offer.EffectiveDate is: ")
						.isEqualTo(expResponse.get(i).getEffectiveDate());
				softly.assertThat(actualResponse.get(i).getExpirationDate()).as("The Offer.ExpirationDate is: ")
						.isEqualTo(expResponse.get(i).getExpirationDate());
			}
		}

	}

	private void validateNotification(List<Notification> actualResponse, List<Notification> expResponse) {
		Collections.sort(actualResponse, new Comparator<Notification>() {
			public int compare(Notification s1, Notification s2) {
				return s1.getNotificationMode().compareToIgnoreCase(s2.getNotificationMode());
			}
		});
		Collections.sort(expResponse, new Comparator<Notification>() {
			public int compare(Notification s1, Notification s2) {
				return s1.getNotificationMode().compareToIgnoreCase(s2.getNotificationMode());
			}
		});

		if (actualResponse.size() == expResponse.size()) {
			for (int i = 0; i < actualResponse.size(); i++) {
				softly.assertThat(actualResponse.get(i).getNotificationMode())
						.as("The Notification.NotificationMode is: ")
						.isEqualTo(expResponse.get(i).getNotificationMode());
				softly.assertThat(actualResponse.get(i).getNotificationType())
						.as("The Notification.NotificationType is: ")
						.isEqualTo(expResponse.get(i).getNotificationType());
			}

		}
		else {
			softly.fail("Notification size mismatch:: actualResponse NotificationList Size is: "+actualResponse.size()+" expected NotificationList Size is:"+expResponse.size());
		}

	}

	public void validateCustomerInfo(CustomerInfo actualResponse, CustomerInfo expResponse) {

		if(expResponse.getEmail()!=null)
		softly.assertThat(actualResponse.getEmail()).as("The CustomerInfo.Email is: ")
				.isEqualTo(expResponse.getEmail());

		if (actualResponse.getCustomerIdentifier() != null && expResponse.getCustomerIdentifier() != null) {
			validateAccountIdentifier(actualResponse.getCustomerIdentifier(), expResponse.getCustomerIdentifier());
		}
		if (actualResponse.getNameDetails() != null && expResponse.getNameDetails() != null) {
			validateNameDetails(actualResponse.getNameDetails(), expResponse.getNameDetails());
		}
		if (actualResponse.getCusAccountStatusInfo() != null && expResponse.getCusAccountStatusInfo() != null) {
			validateAccountStatusInfo(actualResponse.getCusAccountStatusInfo(), expResponse.getCusAccountStatusInfo());
		}
		if (actualResponse.getSpendInfo() != null && expResponse.getSpendInfo() != null) {
			//validateSpendInfo(actualResponse.getSpendInfo(), expResponse.getSpendInfo());
		}
		if (actualResponse.getTierInfo() != null && expResponse.getTierInfo() != null) {
			//validateTierInfo(actualResponse.getTierInfo(), expResponse.getTierInfo());
		}

	}
	
	//TODO
	@SuppressWarnings("unused")
	private void validateTierInfo(TierInfo actualResponse, TierInfo expResponse) {
		softly.assertThat(actualResponse.getSpendToNextUpgrade()).as("The TierInfo.SpendToNextUpgrade is: ")
				.isEqualTo(expResponse.getSpendToNextUpgrade());
		softly.assertThat(actualResponse.getTierName()).as("The TierInfo.TierName is: ")
				.isEqualTo(expResponse.getTierName());
		if (expResponse.getLastTierUpdateDate() !=null) {
		softly.assertThat(actualResponse.getLastTierUpdateDate().toString())
				.as("The TierInfo.getLastTierUpdateDate is: ")
				.isEqualTo(expResponse.getLastTierUpdateDate().toString());
		}
	}
	
	//TODO
	@SuppressWarnings("unused")
	private void validateSpendInfo(SpendInfo actualResponse, SpendInfo expResponse) {
		softly.assertThat(actualResponse.getYTDPropSpend()).as("The SpendInfo.YTDPropSpend is: ")
				.isEqualTo(expResponse.getYTDPropSpend());
		softly.assertThat(actualResponse.getYTDTotalSpend()).as("The SpendInfo.YTDTotalSpend is: ")
				.isEqualTo(expResponse.getYTDTotalSpend());
	}

	private void validateAccountStatusInfo(CusAccountStatusInfo actualResponse, CusAccountStatusInfo expResponse) {
		softly.assertThat(actualResponse.getAccountStatus()).as("The AccountStatusInfo.AccountStatus is: ")
				.isEqualTo(expResponse.getAccountStatus());
		softly.assertThat(actualResponse.getAccountStatusReason()).as("The AccountStatusInfo.AccountStatusReason is: ")
				.isEqualTo(expResponse.getAccountStatusReason());
	}

	private void validateNameDetails(NameDetails actualResponse, NameDetails expResponse) {
		softly.assertThat(actualResponse.getNameFirst()).as("The NameDetails.NameFirst is: ")
				.isEqualTo(expResponse.getNameFirst());
		softly.assertThat(actualResponse.getNameLast()).as("The NameDetails.NameLast is: ")
				.isEqualTo(expResponse.getNameLast());
		softly.assertThat(actualResponse.getNameMidl()).as("The NameDetails.NameMidl is: ")
				.isEqualTo(expResponse.getNameMidl());
		softly.assertThat(actualResponse.getNamePrefix()).as("The NameDetails.NamePrefix is: ")
				.isEqualTo(expResponse.getNamePrefix());
		softly.assertThat(actualResponse.getNameSuffix()).as("The NameDetails.NameSuffix is: ")
				.isEqualTo(expResponse.getNameSuffix());
	}

	private void validateAccountIdentifier(List<AccountIdentifier> actualResponse,
			List<AccountIdentifier> expResponse) {
		Collections.sort(actualResponse, new Comparator<AccountIdentifier>() {
			public int compare(AccountIdentifier s1, AccountIdentifier s2) {
				return s1.getAccountType().compareToIgnoreCase(s2.getAccountType());
			}
		});
		Collections.sort(expResponse, new Comparator<AccountIdentifier>() {
			public int compare(AccountIdentifier s1, AccountIdentifier s2) {
				return s1.getAccountType().compareToIgnoreCase(s2.getAccountType());
			}
		});

		if (actualResponse.size() == expResponse.size()) {
			for (int i = 0; i < actualResponse.size(); i++) {
				softly.assertThat(actualResponse.get(i).getAccountType()).as("The AccountIdentifier.AccountType is: ")
						.isEqualTo(expResponse.get(i).getAccountType());
				/*softly.assertThat(actualResponse.get(i).getAccountNumber())
						.as("The AccountIdentifier.AccountNumber is: ")
						.isEqualTo(expResponse.get(i).getAccountNumber());*/
			}
		}
	}

}
