package com.macys.marketing.loyalty.LtyIntegrationTest.rest.model.offertool;

import com.fasterxml.jackson.annotation.JsonRootName;
import java.sql.Timestamp;

/**
 * This Object Contains header part information of the offer.
 *
 * @author Karthik Chigurupati
 * @since 6/12/17
 */

@JsonRootName("offerHeader")
public class OfferHeaderBinding implements java.io.Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/** The id. */
	private Long id;
	
	/** The offer code. */
	private String offerCode;
	
	/** The division. */
	private String division;
	
	/** The program code. */
	private String programCode;
	
	/** The desc. */
	private String desc;
	
	/** The channel eligible. */
	private String channelEligible;
	
	/** The effective date. */
	private String effectiveDate;
	
	/** The expiration date. */
	private String expirationDate;
	
	/** The offer status. */
	private String offerStatus;
	
	/** The presentment start time. */
	private String presentmentStartTime;
	
	/** The presentment end time. */
	private String presentmentEndTime;
	
	/** The approved by. */
	private String approvedBy;
	
	/** The created by. */
	private String createdBy;
	
	/** The created ts. */
	private Timestamp createdTs;
	
	/** The last update ts. */
	private Timestamp lastUpdateTs;
	
	/** The campaign id. */
	private String campaignId;
	
	/** The campaign description. */
	private String campaignDescription;

	/**
	 * @return the offer code
	 */
	public String getOfferCode() {
		return offerCode;
	}

	/**
	 * @param offerCode the new offer code
	 */
	public void setOfferCode(String offerCode) {
		this.offerCode = offerCode;
	}

	/**
	 * @return the division
	 */
	public String getDivision() {
		return division;
	}

	/**
	 * @param division the new division
	 */
	public void setDivision(String division) {
		this.division = division;
	}

	/**
	 * @return the program code
	 */
	public String getProgramCode() {
		return programCode;
	}

	/**
	 * @param programCode the new program code
	 */
	public void setProgramCode(String programCode) {
		this.programCode = programCode;
	}

	/**
	 * @return the desc
	 */
	public String getDesc() {
		return desc;
	}

	/**
	 * @param desc the new desc
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}

	/**
	 * @return the channel eligible
	 */
	public String getChannelEligible() {
		return channelEligible;
	}

	/**
	 * @param channelEligible the new channel eligible
	 */
	public void setChannelEligible(String channelEligible) {
		this.channelEligible = channelEligible;
	}

	/**
	 * @return the effective date
	 */
	public String getEffectiveDate() {
		return effectiveDate;
	}

	/**
	 * @param effectiveDate the new effective date
	 */
	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	/**
	 * @return the expiration date
	 */
	public String getExpirationDate() {
		return expirationDate;
	}

	/**
	 * @param expirationDate the new expiration date
	 */
	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	/**
	 * @return the offer status
	 */
	public String getOfferStatus() {
		return offerStatus;
	}

	/**
	 * @param offerStatus the new offer status
	 */
	public void setOfferStatus(String offerStatus) {
		this.offerStatus = offerStatus;
	}

	/**
	 * @return the presentment start time
	 */
	public String getPresentmentStartTime() {
		return presentmentStartTime;
	}

	/**
	 * @param presentmentStartTime the new presentment start time
	 */
	public void setPresentmentStartTime(String presentmentStartTime) {
		this.presentmentStartTime = presentmentStartTime;
	}

	/**
	 * @return the presentment end time
	 */
	public String getPresentmentEndTime() {
		return presentmentEndTime;
	}

	/**
	 * @param presentmentEndTime the new presentment end time
	 */
	public void setPresentmentEndTime(String presentmentEndTime) {
		this.presentmentEndTime = presentmentEndTime;
	}

	/**
	 * @return the approved by
	 */
	public String getApprovedBy() {
		return approvedBy;
	}

	/**
	 * @param approvedBy the new approved by
	 */
	public void setApprovedBy(String approvedBy) {
		this.approvedBy = approvedBy;
	}

	/**
	 * @return the created by
	 */
	public String getCreatedBy() {
		return createdBy;
	}

	/**
	 * @param createdBy the new created by
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	/**
	 * @return the last update ts
	 */
	public Timestamp getLastUpdateTs() {
		return lastUpdateTs;
	}

	/**
	 * @param lastUpdateTs the new last update ts
	 */
	public void setLastUpdateTs(Timestamp lastUpdateTs) {
		this.lastUpdateTs = lastUpdateTs;
	}

	/**
	 * @return the created ts
	 */
	public Timestamp getCreatedTs() {
		return createdTs;
	}

	/**
	 * @param createdTs the new created ts
	 */
	public void setCreatedTs(Timestamp createdTs) {
		this.createdTs = createdTs;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the new id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the campaign id
	 */
	public String getCampaignId() {
		return campaignId;
	}

	/**
	 * @param campaignId the new campaign id
	 */
	public void setCampaignId(String campaignId) {
		this.campaignId = campaignId;
	}

	/**
	 * @return the campaign description
	 */
	public String getCampaignDescription() {
		return campaignDescription;
	}

	/**
	 * @param campaignDescription the new campaign description
	 */
	public void setCampaignDescription(String campaignDescription) {
		this.campaignDescription = campaignDescription;
	}

}
