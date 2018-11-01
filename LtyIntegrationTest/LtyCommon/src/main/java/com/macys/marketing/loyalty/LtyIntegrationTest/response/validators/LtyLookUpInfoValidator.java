package com.macys.marketing.loyalty.LtyIntegrationTest.response.validators;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.assertj.core.api.SoftAssertions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.macys.loyalty.schemas.loyalty_account.ltyaccountresponse.v12_0.LtyLookupOfferInfoResp;
import com.macys.loyalty.schemas.loyalty_account.ltyaccountresponse.v12_0.LtyLookupOffers;
import com.macys.loyalty.schemas.loyalty_account.ltyaccountresponse.v12_0.OfferDeptInfo;
import com.macys.loyalty.schemas.loyalty_account.ltyaccountresponse.v12_0.OfferFrequency;
import com.macys.loyalty.schemas.loyalty_account.ltyaccountresponse.v12_0.OfferRewardSpend;
import com.macys.loyalty.schemas.loyalty_common.ltycommon.v12_0.Response;


public class LtyLookUpInfoValidator {
	private static final Logger LOGGER = LoggerFactory.getLogger(LtyLookUpInfoValidator.class);
	SoftAssertions softly = new SoftAssertions();

	public void validateLtyLookUpInfo(LtyLookupOfferInfoResp actualResponse, LtyLookupOfferInfoResp expResponse) {
		LOGGER.info("In validateLtyLookUpInfo method");
		if (expResponse.getLtyLookupOffers() != null) {
			if (actualResponse.getLtyLookupOffers() != null) {
				validateLtyLookupOffers(actualResponse.getLtyLookupOffers(), expResponse.getLtyLookupOffers());
			} else {
				softly.fail("actualResponse.getLtyLookupOffers() is ::" + actualResponse.getLtyLookupOffers()
						+ "expResponse.getLtyLookupOffers() is ::" + expResponse.getLtyLookupOffers());
			}
		}

		if (expResponse.getOperationResponse() != null) {
			if (actualResponse.getOperationResponse() != null) {
				validateOperationResponse(actualResponse.getOperationResponse(), expResponse.getOperationResponse());
			} else {
				softly.fail("actualResponse.getOperationResponse() is ::" + actualResponse.getOperationResponse());
			}

		}
		softly.assertAll();
	}

	private void validateOperationResponse(Response actualResponse, Response expResponse) {
		LOGGER.info("In validateOperationResponse method");
		softly.assertThat(actualResponse.getMessage()).as("The OperationResponse.Message value is: ")
				.isEqualTo(expResponse.getMessage());
		softly.assertThat(actualResponse.getReturnCode()).as("The OperationResponse.ReturnCode value is: ")
				.isEqualTo(expResponse.getReturnCode());

	}

	public void validateLtyLookupOffers(LtyLookupOffers actualResponse, LtyLookupOffers expResponse) {
		LOGGER.info("In validateLtyLookupOffers method");
		softly.assertThat(actualResponse.getDivision()).as("The Division value is: ")
				.isEqualTo(expResponse.getDivision());

		softly.assertThat(actualResponse.getEventType()).as("The EventType value is: ")
				.isEqualTo(expResponse.getEventType());
		softly.assertThat(actualResponse.getOfferCode()).as("The OfferCode value is: ").isNotEmpty();
		softly.assertThat(actualResponse.getOfferDesc()).as("The OfferDesc value is: ")
				.isEqualTo(expResponse.getOfferDesc());
		softly.assertThat(actualResponse.getOfferMode()).as("The OfferMode value is: ")
				.isEqualTo(expResponse.getOfferMode());
		softly.assertThat(actualResponse.getOfferRank()).as("The OfferRank value is: ")
				.isEqualTo(expResponse.getOfferRank());
		softly.assertThat(actualResponse.getOfferType()).as("The OfferType value is: ")
				.isEqualTo(expResponse.getOfferType());
		softly.assertThat(actualResponse.getPresentmentEndTime()).as("The PresentmentEndTime value is: ")
				.isEqualTo(expResponse.getPresentmentEndTime());
		softly.assertThat(actualResponse.getPresentmentStartTime()).as("The PresentmentStartTime value is: ")
				.isEqualTo(expResponse.getPresentmentStartTime());
		softly.assertThat(actualResponse.getProgramCode()).as("The ProgramCode value is: ")
				.isEqualTo(expResponse.getProgramCode());
		softly.assertThat(actualResponse.getTenderType()).as("The TenderType value is: ")
				.isEqualTo(expResponse.getTenderType());
		softly.assertThat(actualResponse.getTierCode()).as("The TierCode value is: ")
				.isEqualTo(expResponse.getTierCode());
		softly.assertThat(actualResponse.getEffectiveDate().toString()).as("The EffectiveDate value is: ")
				.isEqualTo(expResponse.getEffectiveDate().toString());
		softly.assertThat(actualResponse.getExpiryDate().toString()).as("The ExpiryDate value is: ")
				.isEqualTo(expResponse.getExpiryDate().toString());
		softly.assertThat(actualResponse.getStore()).as("The Store value is:").isEqualTo(expResponse.getStore());
		softly.assertThat(actualResponse.getPriceStatus()).as("The PriceStatus value is: ")
				.isEqualTo(expResponse.getPriceStatus());

		validateOfferDeptInfo(actualResponse.getOfferDeptInfo(), expResponse.getOfferDeptInfo());
		validateOfferFrequency(actualResponse.getOfferFrequency(), expResponse.getOfferFrequency());
		validateOfferRewardSpend(actualResponse.getOfferRewardSpend(), expResponse.getOfferRewardSpend());
	}

	private void validateOfferDeptInfo(List<OfferDeptInfo> actualResponse, List<OfferDeptInfo> expResponse) {
		if (expResponse != null) {
			if (actualResponse != null) {
				Collections.sort(actualResponse, new Comparator<OfferDeptInfo>() {
					public int compare(OfferDeptInfo s1, OfferDeptInfo s2) {
						return s1.getMarkStyle().toString().compareToIgnoreCase(s2.getMarkStyle().toString());
					}
				});
				Collections.sort(expResponse, new Comparator<OfferDeptInfo>() {
					public int compare(OfferDeptInfo s1, OfferDeptInfo s2) {
						return s1.getMarkStyle().toString().compareToIgnoreCase(s2.getMarkStyle().toString());
					}
				});
				if (actualResponse.size() == expResponse.size()) {
					for (int i = 0; i < actualResponse.size(); i++) {
						softly.assertThat(actualResponse.get(i).getClazz()).as("The OfferDeptInfo Clazz is: ")
								.isEqualTo(expResponse.get(i).getClazz());
						softly.assertThat(actualResponse.get(i).getDept()).as("The OfferDeptInfo Dept is: ")
								.isEqualTo(expResponse.get(i).getDept());
						softly.assertThat(actualResponse.get(i).getGroupItemCount()).as("The GroupItemCount Dept is: ")
								.isEqualTo(expResponse.get(i).getGroupItemCount());
						softly.assertThat(actualResponse.get(i).getMarkStyle()).as("The GroupItemCount MarkStyle is: ")
								.isEqualTo(expResponse.get(i).getMarkStyle());
						softly.assertThat(actualResponse.get(i).getRecordGroupSeq())
								.as("The GroupItemCount RecordGroupSeq is: ")
								.isEqualTo(expResponse.get(i).getRecordGroupSeq());
						softly.assertThat(actualResponse.get(i).getVendor()).as("The GroupItemCount Vendor is: ")
								.isEqualTo(expResponse.get(i).getVendor());

					}
				} else {
					softly.assertThat(actualResponse.size()).as("The OfferDeptInfoList size is: ")
							.isEqualTo(expResponse.size());
				}
			}
		}

	}

	private void validateOfferFrequency(OfferFrequency actualResponse, OfferFrequency expResponse) {
		LOGGER.info("In validateOfferFrequency method");
		
		if (expResponse != null) {
			if (actualResponse != null) {
				softly.assertThat(actualResponse.getCount()).as("The OfferFrequency Count is: ")
						.isEqualTo(expResponse.getCount());
				softly.assertThat(actualResponse.getPeriod()).as("The Period Count is: ")
						.isEqualTo(expResponse.getPeriod());
			}

			else {
				softly.fail("actualResponse.getOfferFrequency() is ::" + actualResponse);
			}

		}
	}

	private void validateOfferRewardSpend(List<OfferRewardSpend> actualResponse, List<OfferRewardSpend> expResponse) {
		LOGGER.info("In validateOfferRewardSpend method");
		if (expResponse != null) {
			if (actualResponse != null) {
				Collections.sort(actualResponse, new Comparator<OfferRewardSpend>() {
					public int compare(OfferRewardSpend s1, OfferRewardSpend s2) {
						return s1.getPoints().toString().compareToIgnoreCase(s2.getPoints().toString());
					}
				});
				Collections.sort(expResponse, new Comparator<OfferRewardSpend>() {
					public int compare(OfferRewardSpend s1, OfferRewardSpend s2) {
						return s1.getPoints().toString().compareToIgnoreCase(s2.getPoints().toString());
					}
				});

				if (actualResponse.size() == expResponse.size()) {
					for (int i = 0; i < actualResponse.size(); i++) {
						softly.assertThat(actualResponse.get(i).getDeptSpendMax())
								.as("The OfferRewardSpend SpendMax is: ")
								.isEqualTo(expResponse.get(i).getDeptSpendMax());
						softly.assertThat(actualResponse.get(i).getDeptSpendMin())
								.as("The OfferRewardSpend DeptSpendMin is: ")
								.isEqualTo(expResponse.get(i).getDeptSpendMin());
						softly.assertThat(actualResponse.get(i).getMultiplier())
								.as("The OfferRewardSpend Multiplier is: ")
								.isEqualTo(expResponse.get(i).getMultiplier());
						softly.assertThat(actualResponse.get(i).getPoints()).as("The OfferRewardSpend Points is: ")
								.isEqualTo(expResponse.get(i).getPoints());
						softly.assertThat(actualResponse.get(i).getTxnSpendMax())
								.as("The OfferRewardSpend TxnSpendMax is: ")
								.isEqualTo(expResponse.get(i).getTxnSpendMax());
						softly.assertThat(actualResponse.get(i).getTxnSpendMin()).as("The TxnSpendMin Points is: ")
								.isEqualTo(expResponse.get(i).getTxnSpendMin());
					}
				} else {
					softly.assertThat(actualResponse.size()).as("The OfferRewardSpendList size is: ")
							.isEqualTo(expResponse.size());
				}
			} else {
				softly.fail("actualResponse.getOfferRewardSpend() is ::"
						+ actualResponse);
			}
		}

	}

}
