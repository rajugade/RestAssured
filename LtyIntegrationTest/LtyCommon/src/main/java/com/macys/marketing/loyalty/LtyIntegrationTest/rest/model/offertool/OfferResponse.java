package com.macys.marketing.loyalty.LtyIntegrationTest.rest.model.offertool;

/**
 * The Class OfferResponse.
 * This Object holds rewardOffer data
 */
public class OfferResponse {
	
	/** The reward offer. */
	private RewardOfferBinding rewardOffer;

	/**
	 * @return the reward offer
	 */
	public RewardOfferBinding getRewardOffer() {
		return rewardOffer;
	}

	/**
	 * @param rewardOffer the new reward offer
	 */
	public void setRewardOffer(RewardOfferBinding rewardOffer) {
		this.rewardOffer = rewardOffer;
	}

}
