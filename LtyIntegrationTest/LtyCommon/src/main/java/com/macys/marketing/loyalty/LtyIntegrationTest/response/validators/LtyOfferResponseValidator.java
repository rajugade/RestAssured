package com.macys.marketing.loyalty.LtyIntegrationTest.response.validators;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import org.assertj.core.api.SoftAssertions;

import com.macys.marketing.loyalty.LtyIntegrationTest.rest.model.offertool.LtyActivityLogBinding;
import com.macys.marketing.loyalty.LtyIntegrationTest.rest.model.offertool.NoteBinding;
import com.macys.marketing.loyalty.LtyIntegrationTest.rest.model.offertool.OfferHeaderBinding;
import com.macys.marketing.loyalty.LtyIntegrationTest.rest.model.offertool.OfferResponse;
import com.macys.marketing.loyalty.LtyIntegrationTest.rest.model.offertool.OfferResponseList;
import com.macys.marketing.loyalty.LtyIntegrationTest.rest.model.offertool.OfferRewardBinding;
import com.macys.marketing.loyalty.LtyIntegrationTest.rest.model.offertool.ProductBinding;
import com.macys.marketing.loyalty.LtyIntegrationTest.rest.model.offertool.RewardOfferBinding;
import com.macys.marketing.loyalty.LtyIntegrationTest.rest.model.offertool.StoreBindingDetail;
import com.macys.marketing.loyalty.LtyIntegrationTest.util.CommonUtility;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

/**
 * The Class AssertValidator.
 */
public class LtyOfferResponseValidator {

	SoftAssertions softly = new SoftAssertions();

	public void validate(Map<String, Object> response) {
		Response actual = (Response) response.get("ACTUAL_RESPONSE");
		String expected = (String) response.get("EXPECTED_RESPONSE");
		OfferResponse actualResponse = actual.as(OfferResponse.class);
		OfferResponse expectedResponse = (OfferResponse) CommonUtility.getObjectFromJsonString(expected,
				OfferResponse.class);
		validateOffer(expectedResponse.getRewardOffer(), actualResponse.getRewardOffer());
	}

	/**
	 * Validate get all offers response.
	 *
	 * @param request
	 *            the request
	 * @param response
	 *            the response
	 */
	public void validateGetAllOffersResponse(RewardOfferBinding request, OfferResponseList response) {

		if (response.getOfferHeader() != null) {
			validateOfferHeader(request.getOfferHeader(), response.getOfferHeader());

		} else {
			softly.fail("response.getOfferHeader() is getting as null");
		}

		if (null != response.getOfferReward()) {
			validateOfferReward(request.getOfferReward(), response.getOfferReward());
		} else {

			softly.fail("response.getOfferReward() is getting as null");
		}

	}

	/**
	 * Validate.
	 *
	 * @param request
	 *            the request
	 * @param response
	 *            the response
	 */
	public void validateOffer(RewardOfferBinding request, RewardOfferBinding response) {

		if (response != null) {

			if (response.getOfferHeader() != null) {
				validateOfferHeader(request.getOfferHeader(), response.getOfferHeader());
			} else {
				softly.fail("response.getOfferHeader() is getting as null");
			}

			if (null != response.getOfferReward()) {
				validateOfferReward(request.getOfferReward(), response.getOfferReward());
			} else {

				softly.fail("response.getOfferReward() is getting as null");
			}

			if (null != response.getOfferRewardDetail()) {
				validateOfferRewardDetail(request, response);
			} else {

				softly.fail("response.getOfferRewardDetail() is getting as null");
			}

			if (null != response.getProductGroup()) {
				validateProductGroup(request, response);
			} else {
				softly.fail("response.getProductGroup() is getting as null");
			}

			if (null != response.getStores()) {

				validateStores(request, response);

			} else {
				softly.fail("response.getStores() is getting as null");
			}

			if (response.getNotes() != null) {
				validateNotes(request, response);
			} else {
				softly.fail("response.getNotes() is getting as null");
			}

		} else {
			softly.fail("response object is getting as null");
		}
		softly.assertAll();

	}

	/**
	 * Validate offer header.
	 *
	 * @param request
	 *            the request
	 * @param response
	 *            the response
	 */
	public void validateOfferHeader(OfferHeaderBinding request, OfferHeaderBinding response) {

		softly.assertThat(request.getApprovedBy()).as("The ApprovedBy value is: ").isEqualTo(response.getApprovedBy());
		softly.assertThat(request.getCampaignDescription()).as("The CampaignDescription value is: ")
				.isEqualTo(response.getCampaignDescription());
		softly.assertThat(request.getCampaignId()).as("The CampaignId value is: ").isEqualTo(response.getCampaignId());
		/*
		 * softly.assertThat(request.getOfferHeader().getChannelEligible())
		 * .as("The ChannelEligible value is: ").isEqualTo(response.getOfferHeader().
		 * getChannelEligible());
		 */
		softly.assertThat(request.getCreatedBy()).as("The CreatedBy value is: ").isEqualTo(response.getCreatedBy());
		softly.assertThat(request.getDesc()).as("The Desc value is: ").isEqualTo(response.getDesc());
		softly.assertThat(request.getDivision()).as("The Division value is: ").isEqualTo(response.getDivision());
		softly.assertThat(response.getOfferCode()).as("The OfferCode value is: ").isNotBlank();
		softly.assertThat(request.getOfferStatus()).as("The OfferStatus value is: ")
				.isEqualTo(response.getOfferStatus());
		softly.assertThat(request.getPresentmentEndTime()).as("The PresentmentEndTime value is: ")
				.isEqualTo(response.getPresentmentEndTime());
		softly.assertThat(request.getPresentmentStartTime()).as("The PresentmentStartTime value is: ")
				.isEqualTo(response.getPresentmentStartTime());
		softly.assertThat(request.getProgramCode()).as("The ProgramCode value is: ")
				.isEqualTo(response.getProgramCode());
		softly.assertThat(request.getEffectiveDate()).as("The EffectiveDate value is: ")
				.isEqualTo(response.getEffectiveDate());
		softly.assertThat(request.getExpirationDate()).as("The ExpirationDate value is: ")
				.isEqualTo(response.getExpirationDate());

	}

	/**
	 * Validate offer reward.
	 *
	 * @param request
	 *            the request
	 * @param response
	 *            the response
	 */
	public void validateOfferReward(OfferRewardBinding request, OfferRewardBinding response) {

		/*
		 * softly.assertThat(request.getEventName()).as("The EventName value is: ")
		 * .isEqualTo(response.getEventName());
		 * softly.assertThat(request.getValidInDays()).as("The ValidInDays value is: ")
		 * .isEqualTo(response.getValidInDays());
		 */

		softly.assertThat(request.getEventType()).as("The EventType value is: ").isEqualTo(response.getEventType());
		softly.assertThat(request.getIsIncremental()).as("The IsIncremental value is: ")
				.isEqualTo(response.getIsIncremental());
		softly.assertThat(request.getIsPowerPoint()).as("The IsPowerPoint value is: ")
				.isEqualTo(response.getIsPowerPoint());
		softly.assertThat(request.getOfferFrequency()).as("The OfferFrequency value is: ")
				.isEqualTo(response.getOfferFrequency());

		softly.assertThat(request.getOfferType()).as("The OfferType value is: ").isEqualTo(response.getOfferType());
		softly.assertThat(request.getTierName()).as("The TierName value is: ").isEqualTo(response.getTierName());
		softly.assertThat(request.getTriggerOfferEventPeriod()).as("The TriggerOfferEventPeriod value is: ")
				.isEqualTo(response.getTriggerOfferEventPeriod());
		softly.assertThat(request.getValidDays()).as("The ValidDays value is: ").isEqualTo(response.getValidDays());
		softly.assertThat(request.getPriceStatus()).as("The PriceStatus value is: ")
				.isEqualTo(response.getPriceStatus());
		softly.assertThat(request.getTenderType()).as("The TenderType value is: ").isEqualTo(response.getTenderType());

	}

	/**
	 * Validate offer reward detail.
	 *
	 * @param request
	 *            the request
	 * @param response
	 *            the response
	 */
	public void validateOfferRewardDetail(RewardOfferBinding request, RewardOfferBinding response) {

		softly.assertThat(request.getOfferRewardDetail().getDeptSpendMax()).as("The DeptSpendMax value is: ")
				.isEqualTo(response.getOfferRewardDetail().getDeptSpendMax());
		softly.assertThat(request.getOfferRewardDetail().getDeptSpendMin()).as("The DeptSpendMin value is: ")
				.isEqualTo(response.getOfferRewardDetail().getDeptSpendMin());
		softly.assertThat(request.getOfferRewardDetail().getMultiplier()).as("The Multiplier value is: ")
				.isEqualTo(response.getOfferRewardDetail().getMultiplier());
		softly.assertThat(request.getOfferRewardDetail().getPoints()).as("The Points value is: ")
				.isEqualTo(response.getOfferRewardDetail().getPoints());
		softly.assertThat(request.getOfferRewardDetail().getTxnSpendMax()).as("The TxnSpendMax value is: ")
				.isEqualTo(response.getOfferRewardDetail().getTxnSpendMax());
		softly.assertThat(request.getOfferRewardDetail().getTxnSpendMin()).as("The TxnSpendMin value is: ")
				.isEqualTo(response.getOfferRewardDetail().getTxnSpendMin());

		/*
		 * List<OfferRewardDetailBinding> requestList = request.getOfferRewardDetail();
		 * List<OfferRewardDetailBinding> responseList =
		 * response.getOfferRewardDetail();
		 * 
		 * Collections.sort(requestList, new Comparator<OfferRewardDetailBinding>() {
		 * public int compare(OfferRewardDetailBinding s1, OfferRewardDetailBinding s2)
		 * { return (int) (s1.getPoints() - s2.getPoints()); } });
		 * Collections.sort(responseList, new Comparator<OfferRewardDetailBinding>() {
		 * public int compare(OfferRewardDetailBinding s1, OfferRewardDetailBinding s2)
		 * { return (int) (s1.getPoints() - s2.getPoints()); } });
		 * 
		 * if (requestList.size() == responseList.size()) { for (int i = 0; i <
		 * requestList.size(); i++) {
		 * 
		 * softly.assertThat(requestList.get(i).getDeptSpendMax()).
		 * as("The DeptSpendMax value is: ")
		 * .isEqualTo(responseList.get(i).getDeptSpendMax());
		 * softly.assertThat(requestList.get(i).getDeptSpendMin()).
		 * as("The DeptSpendMin value is: ")
		 * .isEqualTo(responseList.get(i).getDeptSpendMin());
		 * softly.assertThat(requestList.get(i).getMultiplier()).
		 * as("The Multiplier value is: ")
		 * .isEqualTo(responseList.get(i).getMultiplier());
		 * softly.assertThat(requestList.get(i).getPoints()).as("The Points value is: ")
		 * .isEqualTo(responseList.get(i).getPoints());
		 * softly.assertThat(requestList.get(i).getTxnSpendMax()).
		 * as("The TxnSpendMax value is: ")
		 * .isEqualTo(responseList.get(i).getTxnSpendMax());
		 * softly.assertThat(requestList.get(i).getTxnSpendMin()).
		 * as("The TxnSpendMin value is: ")
		 * .isEqualTo(responseList.get(i).getTxnSpendMin()); } } else {
		 * softly.assertThat(requestList.size()).
		 * as("The OfferRewardDetailBindingList size is: ")
		 * .isEqualTo(responseList.size()); }
		 */
	}

	/**
	 * Validate product group.
	 *
	 * @param request
	 *            the request
	 * @param response
	 *            the response
	 */
	public void validateProductGroup(RewardOfferBinding request, RewardOfferBinding response) {

		/*
		 * softly.assertThat(request.getProductGroup().getGroupItemCount())
		 * .as("The GroupItemCount value is: ").isEqualTo(response.getProductGroup().
		 * getGroupItemCount());
		 * softly.assertThat(request.getProductGroup().getRecordGroup())
		 * .as("The RecordGroup value is: ").isEqualTo(response.getProductGroup().
		 * getRecordGroup());
		 */
		List<ProductBinding> requestList = request.getProductGroup().getProduct();
		List<ProductBinding> responseList = response.getProductGroup().getProduct();

		Collections.sort(requestList, new Comparator<ProductBinding>() {
			public int compare(ProductBinding s1, ProductBinding s2) {
				return (int) (s1.getGmmID() - s2.getGmmID());
			}
		});
		Collections.sort(responseList, new Comparator<ProductBinding>() {
			public int compare(ProductBinding s1, ProductBinding s2) {
				return (int) (s1.getGmmID() - s2.getGmmID());
			}
		});

		if (requestList.size() == responseList.size()) {
			for (int i = 0; i < requestList.size(); i++) {
				softly.assertThat(requestList.get(i).getDept()).as("The Dept value is: ")
						.isEqualTo(responseList.get(i).getDept());
				softly.assertThat(requestList.get(i).getDeptClass()).as("The DeptClass value is: ")
						.isEqualTo(responseList.get(i).getDeptClass());
				softly.assertThat(requestList.get(i).getGmmID()).as("The GmmID value is: ")
						.isEqualTo(responseList.get(i).getGmmID());
				softly.assertThat(requestList.get(i).getItemCount()).as("The ItemCount value is: ")
						.isEqualTo(responseList.get(i).getItemCount());
				softly.assertThat(requestList.get(i).getMarkStyle()).as("The MarkStyle value is: ")
						.isEqualTo(responseList.get(i).getMarkStyle());
				softly.assertThat(requestList.get(i).getProductDivision()).as("The ProductDivision value is: ")
						.isEqualTo(responseList.get(i).getProductDivision());
				softly.assertThat(requestList.get(i).getVendor()).as("The Vendor value is: ")
						.isEqualTo(responseList.get(i).getVendor());
			}
		} else {
			softly.assertThat(requestList.size()).as("The ProductBindingList size is: ").isEqualTo(responseList.size());
		}

	}

	/**
	 * Validate stores.
	 *
	 * @param request
	 *            the request
	 * @param response
	 *            the response
	 */
	public void validateStores(RewardOfferBinding request, RewardOfferBinding response) {

		List<StoreBindingDetail> requestList = request.getStores().getStore();
		List<StoreBindingDetail> responseList = response.getStores().getStore();

		Collections.sort(requestList, new Comparator<StoreBindingDetail>() {
			public int compare(StoreBindingDetail s1, StoreBindingDetail s2) {
				return s1.getRegion().compareToIgnoreCase(s2.getRegion());
			}
		});
		Collections.sort(responseList, new Comparator<StoreBindingDetail>() {
			public int compare(StoreBindingDetail s1, StoreBindingDetail s2) {
				return s1.getRegion().compareToIgnoreCase(s2.getRegion());
			}
		});

		if (requestList.size() == responseList.size()) {
			for (int i = 0; i < requestList.size(); i++) {

				softly.assertThat(requestList.get(i).getDistrict()).as("The Store District value is: ")
						.isEqualTo(responseList.get(i).getDistrict());
				softly.assertThat(requestList.get(i).getRegion()).as("The Store Region value is: ")
						.isEqualTo(responseList.get(i).getRegion());
				softly.assertThat(requestList.get(i).getStore()).as("The Store value is: ")
						.isEqualTo(responseList.get(i).getStore());
				softly.assertThat(requestList.get(i).getSubRegion()).as("The Store SubRegion value is: ")
						.isEqualTo(responseList.get(i).getSubRegion());
			}
		} else {
			softly.assertThat(requestList.size()).as("The StoreBindingDetailList size is: ")
					.isEqualTo(responseList.size());
		}
	}

	/**
	 * Validate notes.
	 *
	 * @param request
	 *            the request
	 * @param response
	 *            the response
	 */
	public void validateNotes(RewardOfferBinding request, RewardOfferBinding response) {

		if (request.getNotes() != null) {
			List<NoteBinding> requestList = request.getNotes().getNote();
			List<NoteBinding> responseList = response.getNotes().getNote();

			Collections.sort(requestList, new Comparator<NoteBinding>() {
				public int compare(NoteBinding s1, NoteBinding s2) {
					return s1.getNote().compareToIgnoreCase(s2.getNote());
				}
			});
			Collections.sort(responseList, new Comparator<NoteBinding>() {
				public int compare(NoteBinding s1, NoteBinding s2) {
					return s1.getNote().compareToIgnoreCase(s2.getNote());
				}
			});

			if (requestList.size() == responseList.size()) {
				for (int i = 0; i < requestList.size(); i++) {
					softly.assertThat(requestList.get(i).getNote()).as("The Note value is: ")
							.isEqualTo(responseList.get(i).getNote());
					softly.assertThat(requestList.get(i).getNoteBy()).as("The NoteBy value is: ")
							.isEqualTo(responseList.get(i).getNoteBy());
					/*
					 * softly.assertThat(requestList.get(i).getNoteDt()).as("The NoteDt value is: ")
					 * .isEqualTo(responseList.get(i).getNoteDt());
					 */
				}

			} else {
				// softly.assertThat(requestList.size()).as("The NoteBindingList size is:
				// ").isEqualTo(responseList.size());
			}
		} else {
			softly.assertThat(request.getNotes()).as("The NoteBinding is: ").isEqualTo(request.getNotes());
		}
	}

	/**
	 * Validate update offer response.
	 *
	 * @param jsPath
	 *            the js path
	 * @return the string
	 */
	public String validateUpdateOfferResponse(JsonPath jsPath) {
		SoftAssertions softly = new SoftAssertions();
		softly.assertThat(jsPath.getString("Response.offerCode")).as("The Response.offerCode value is: ").isNotNull();
		softly.assertThat(jsPath.getString("Response.status")).as("The Response.status value is: ").isEqualTo("200");
		softly.assertAll();

		return jsPath.getString("Response.offerCode");
	}

	/*Validates the Activity Log Response From API*/
	public void validateActivityLog(Map<String, Object> response) {
		Response actual = (Response) response.get("ACTUAL_RESPONSE");
		String expected = (String) response.get("EXPECTED_RESPONSE");
		LtyActivityLogBinding actualResponse = actual.as(LtyActivityLogBinding.class);
		LtyActivityLogBinding expectedResponse = (LtyActivityLogBinding) CommonUtility.getObjectFromJsonString(expected,
				LtyActivityLogBinding.class);
		validateActivity(expectedResponse, actualResponse);

	}

	/*Compares the response from the API with the Response file and assets specific fields in API field*/
	public void validateActivity(LtyActivityLogBinding requestList, LtyActivityLogBinding responseList) {
		if (requestList != null) {
			if (requestList.size() == responseList.size()) {
				for (int i = 0; i < requestList.size(); i++) {
					softly.assertThat(requestList.get(i).getAction()).as("The action is: ")
							.isEqualTo(responseList.get(i).getAction());
					softly.assertThat(requestList.get(i).getPreviousStatus()).as("The Previous status is: ")
							.isEqualTo(responseList.get(i).getPreviousStatus());
					softly.assertThat(requestList.get(i).getCurrentStatus()).as("The Current Status is: ")
							.isEqualTo(responseList.get(i).getCurrentStatus());
				}
			} else {
				softly.fail("Activity Log size mismatch:: actualResponse ActivityLog Size is: " + requestList.size()
						+ " expected ActivityLog Size is:" + responseList.size());
			}
			softly.assertAll();
		}
	}

}