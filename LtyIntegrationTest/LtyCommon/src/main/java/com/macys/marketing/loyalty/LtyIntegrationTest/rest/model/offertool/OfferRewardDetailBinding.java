package com.macys.marketing.loyalty.LtyIntegrationTest.rest.model.offertool;

import com.fasterxml.jackson.annotation.JsonRootName;

/**
 * The Class OfferRewardDetailBinding.
 * This Object Contains the points information of the offer
 * 
 */
@JsonRootName("offerRewardDetail")
public class OfferRewardDetailBinding {
	
	/** The points. */
	private Double points;
	
	/** The multiplier. */
	private Double multiplier;
	
	/** The txn spend min. */
	private Double txnSpendMin;
	
	/** The txn spend max. */
	private Double txnSpendMax;
	
	/** The dept spend min. */
	private Double deptSpendMin;
	
	/** The dept spend max. */
	private Double deptSpendMax;

	/**
	 * @return the points
	 */
	public Double getPoints() {
		return points;
	}

	/**
	 * @param points the new points
	 */
	public void setPoints(Double points) {
		this.points = points;
	}

	/**
	 * @return the multiplier
	 */
	public Double getMultiplier() {
		return multiplier;
	}

	/**
	 * @param multiplier the new multiplier
	 */
	public void setMultiplier(Double multiplier) {
		this.multiplier = multiplier;
	}

	/**
	 * @return the txn spend min
	 */
	public Double getTxnSpendMin() {
		return txnSpendMin;
	}

	/**
	 * @param txnSpendMin the new txn spend min
	 */
	public void setTxnSpendMin(Double txnSpendMin) {
		this.txnSpendMin = txnSpendMin;
	}

	/**
	 * @return the txn spend max
	 */
	public Double getTxnSpendMax() {
		return txnSpendMax;
	}

	/**
	 * @param txnSpendMax the new txn spend max
	 */
	public void setTxnSpendMax(Double txnSpendMax) {
		this.txnSpendMax = txnSpendMax;
	}

	/**
	 * @return the dept spend min
	 */
	public Double getDeptSpendMin() {
		return deptSpendMin;
	}

	/**
	 * @param deptSpendMin the new dept spend min
	 */
	public void setDeptSpendMin(Double deptSpendMin) {
		this.deptSpendMin = deptSpendMin;
	}

	/**
	 * @return the dept spend max
	 */
	public Double getDeptSpendMax() {
		return deptSpendMax;
	}

	/**
	 * @param deptSpendMax the new dept spend max
	 */
	public void setDeptSpendMax(Double deptSpendMax) {
		this.deptSpendMax = deptSpendMax;
	}

}
