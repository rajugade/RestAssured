package com.macys.marketing.loyalty.LtyIntegrationTest.rest.model.offertool;

import com.fasterxml.jackson.annotation.JsonRootName;

/**
 * The Class StoreBinding.
 *
 * @author Karthik Chigurupati
 * @since 6/12/17
 */
@JsonRootName("store")
public class StoreBinding {

	/** The store number. */
	private String storeNumber;
	
	/** The description. */
	private String description;
	
	/**
	 * @return the store number
	 */
	public String getStoreNumber() {
		return storeNumber;
	}
	
	/**
	 * @param storeNumber the new store number
	 */
	public void setStoreNumber(String storeNumber) {
		this.storeNumber = storeNumber;
	}
	
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * @param description the new description
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
