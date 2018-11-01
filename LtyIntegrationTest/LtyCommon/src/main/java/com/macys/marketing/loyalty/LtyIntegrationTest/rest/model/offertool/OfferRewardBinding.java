package com.macys.marketing.loyalty.LtyIntegrationTest.rest.model.offertool;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonRootName;

/**
 * This Object contains the offer reward information of the offer.
 *
 * @author Karthik Chigurupati
 * @since 6/12/17
 */
@JsonRootName("offerReward")
public class OfferRewardBinding {

	/** The event type. */
	private String eventType;

	/** The event name. */
	private String eventName;

	/** The offer type. */
	private String offerType;

	/** The valid days. */
	private String validDays;

	/** The valid in days. */
	private Long validInDays;

	/** The offer frequency. */
	private Long offerFrequency;

	/** The tier name. */
	private List<String> tierName;

	/** The tender type. */
	private List<String> tenderType;

	/** The price status. */
	private List<String> priceStatus;

	/** The offer rank. */
	private Long offerRank;

	/** The employee exclusion. */
	private boolean employeeExclusion;

	/** The fixed offer combinable. */
	private boolean fixedOfferCombinable;

	/** The is incremental. */
	private Boolean isIncremental;

	/** The is power point. */
	private Boolean isPowerPoint;

	/** The trigger offer event period. */
	private Long triggerOfferEventPeriod;

	/** The psc. */
	private String psc;

	/** The is incrementalAmount. */
	private Double incrementalAmount;

	/** The is isPickaday. */
	private Boolean isPickaday;

	public Boolean getIsPickaday() {
		return isPickaday;
	}

	public void setIsPickaday(Boolean isPickaday) {
		this.isPickaday = isPickaday;
	}

	/**
	 * @return the incrementalAmount
	 */
	public Double getIncrementalAmount() {
		return incrementalAmount;
	}

	/**
	 * @param incrementalAmount
	 *            will display when isIncremental sets to true
	 */
	public void setIncrementalAmount(Double incrementalAmount) {
		this.incrementalAmount = incrementalAmount;
	}

	/**
	 * @return the psc
	 */
	public String getPsc() {
		return psc;
	}

	/**
	 * @param psc
	 *            the new psc
	 */
	public void setPsc(String psc) {
		this.psc = psc;
	}

	/**
	 * @return the event type
	 */
	public String getEventType() {
		return eventType;
	}

	/**
	 * @param eventType
	 *            the new event type
	 */
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	/**
	 * @return the event name
	 */
	public String getEventName() {
		return eventName;
	}

	/**
	 * @param eventName
	 *            the new event name
	 */
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	/**
	 * @return the offer type
	 */
	public String getOfferType() {
		return offerType;
	}

	/**
	 * @param offerType
	 *            the new offer type
	 */
	public void setOfferType(String offerType) {
		this.offerType = offerType;
	}

	/**
	 * @return the valid days
	 */
	public String getValidDays() {
		return validDays;
	}

	public List<String> getTierName() {
		return tierName;
	}

	public void setTierName(List<String> tierName) {
		this.tierName = tierName;
	}

	/**
	 * @param validDays
	 *            the new valid days
	 */
	public void setValidDays(String validDays) {
		this.validDays = validDays;
	}

	/**
	 * @return the valid in days
	 */
	public Long getValidInDays() {
		return validInDays;
	}

	/**
	 * @param validInDays
	 *            the new valid in days
	 */
	public void setValidInDays(Long validInDays) {
		this.validInDays = validInDays;
	}

	/**
	 * @return the offer frequency
	 */
	public Long getOfferFrequency() {
		return offerFrequency;
	}

	/**
	 * @param offerFrequency
	 *            the new offer frequency
	 */
	public void setOfferFrequency(Long offerFrequency) {
		this.offerFrequency = offerFrequency;
	}

	/**
	 * @return the tender type
	 */
	public List<String> getTenderType() {
		return tenderType;
	}

	/**
	 * @param tenderType
	 *            the new tender type
	 */
	public void setTenderType(List<String> tenderType) {
		this.tenderType = tenderType;
	}

	/**
	 * @return the price status
	 */
	public List<String> getPriceStatus() {
		return priceStatus;
	}

	/**
	 * @param priceStatus
	 *            the new price status
	 */
	public void setPriceStatus(List<String> priceStatus) {
		this.priceStatus = priceStatus;
	}

	/**
	 * @return the offer rank
	 */
	public Long getOfferRank() {
		return offerRank;
	}

	/**
	 * @param offerRank
	 *            the new offer rank
	 */
	public void setOfferRank(Long offerRank) {
		this.offerRank = offerRank;
	}

	/**
	 * @return true, if is employee exclusion
	 */
	public boolean isEmployeeExclusion() {
		return employeeExclusion;
	}

	/**
	 * @param employeeExclusion
	 *            the new employee exclusion
	 */
	public void setEmployeeExclusion(boolean employeeExclusion) {
		this.employeeExclusion = employeeExclusion;
	}

	/**
	 * @return true, if is fixed offer combinable
	 */
	public boolean isFixedOfferCombinable() {
		return fixedOfferCombinable;
	}

	/**
	 * @param fixedOfferCombinable
	 *            the new fixed offer combinable
	 */
	public void setFixedOfferCombinable(boolean fixedOfferCombinable) {
		this.fixedOfferCombinable = fixedOfferCombinable;
	}

	/**
	 * @return the checks if is incremental
	 */
	public Boolean getIsIncremental() {
		return isIncremental;
	}

	/**
	 * @param isIncremental
	 *            the new checks if is incremental
	 */
	public void setIsIncremental(Boolean isIncremental) {
		this.isIncremental = isIncremental;
	}

	/**
	 * @return the checks if is power point
	 */
	public Boolean getIsPowerPoint() {
		return isPowerPoint;
	}

	/**
	 * @param isPowerPoint
	 *            the new checks if is power point
	 */
	public void setIsPowerPoint(Boolean isPowerPoint) {
		this.isPowerPoint = isPowerPoint;
	}

	/**
	 * @return the trigger offer event period
	 */
	public Long getTriggerOfferEventPeriod() {
		return triggerOfferEventPeriod;
	}

	/**
	 * @param triggerOfferEventPeriod
	 *            the new trigger offer event period
	 */
	public void setTriggerOfferEventPeriod(Long triggerOfferEventPeriod) {
		this.triggerOfferEventPeriod = triggerOfferEventPeriod;
	}

}
