package com.macys.marketing.loyalty.LtyIntegrationTest.rest.model.offertool;

import java.util.ArrayList;

/**
 * The Class OfferResponseList.
 * This class contains the list of the offer responses
 */
public class OfferResponseList extends ArrayList<OfferResponseList>{
	
	private static final long serialVersionUID = 1L;

	/** The offer header. */
	private OfferHeaderBinding offerHeader;
	
	/** The offer reward. */
	private OfferRewardBinding offerReward;
	
	/** The stores. */
	private StoresBinding stores;
	
	/** The product group. */
	private ProductGroupBinding productGroup;
	
	/** The is deferred point. */
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
	public void setOfferRewardDetail(
			OfferRewardDetailBinding offerRewardDetail) {
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
