package com.macys.marketing.loyalty.LtyIntegrationTest.rest.model.offertool;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

/**
 * Name: RewardOfferBinding.java
 * 
 * Project Name: LtyIntegration
 * 
 * Description:
 * This class represents a RewardOfferBinding, which can be used for Create the Offer.
 * This class can also determine the update offer and get the offer.This RewardOfferBinding 
 * Object holds the all the information of Loyalty Offer.
 * 
 * @author Karthik Chigurupati
 * @since 6/12/17
 */
@JsonRootName("rewardOffer")
public class RewardOfferBinding {
	
	/** The offer header. */
	private OfferHeaderBinding offerHeader;
	
	/** The offer reward. */
	private OfferRewardBinding offerReward;
	
	/** The stores. */
	private StoresBinding stores;
	
	/** The product group. */
	private ProductGroupBinding productGroup;
	
	/** The is deferred point. */
	@JsonProperty("isDeferredPoint")
	private boolean isDeferredPoint;
	
	/** The offer reward detail. */
	private OfferRewardDetailBinding offerRewardDetail;
	
	/** The notes. */
	private NotesBinding notes;

	/**
	 * @return the offer reward detail
	 */
	public OfferRewardDetailBinding getOfferRewardDetail() {
		return offerRewardDetail;
	}

	/**
	 * @param offerRewardDetail the new offer reward detail
	 */
	public void setOfferRewardDetail(OfferRewardDetailBinding offerRewardDetail) {
		this.offerRewardDetail = offerRewardDetail;
	}

	/**
	 * @return the offer header
	 */
	public OfferHeaderBinding getOfferHeader() {
		return offerHeader;
	}

	/**
	 * @param offerHeader the new offer header
	 */
	public void setOfferHeader(OfferHeaderBinding offerHeader) {
		this.offerHeader = offerHeader;
	}

	/**
	 * @return the offer reward
	 */
	public OfferRewardBinding getOfferReward() {
		return offerReward;
	}

	/**
	 * @param offerReward the new offer reward
	 */
	public void setOfferReward(OfferRewardBinding offerReward) {
		this.offerReward = offerReward;
	}

	/**
	 * @return the product group
	 */
	public ProductGroupBinding getProductGroup() {
		return productGroup;
	}

	/**
	 * @param productGroup the new product group
	 */
	public void setProductGroup(ProductGroupBinding productGroup) {
		this.productGroup = productGroup;
	}

	/**
	 * @return true, if is deferred point
	 */
	public boolean isDeferredPoint() {
		return isDeferredPoint;
	}

	/**
	 * @param isDeferredPoint the new deferred point
	 */
	public void setDeferredPoint(boolean isDeferredPoint) {
		this.isDeferredPoint = isDeferredPoint;
	}

	/**
	 * @return the stores
	 */
	public StoresBinding getStores() {
		return stores;
	}

	/**
	 * @param stores the new stores
	 */
	public void setStores(StoresBinding stores) {
		this.stores = stores;
	}

	/**
	 * @return the notes
	 */
	public NotesBinding getNotes() {
		return notes;
	}

	/**
	 * @param notes the new notes
	 */
	public void setNotes(NotesBinding notes) {
		this.notes = notes;
	}

}
