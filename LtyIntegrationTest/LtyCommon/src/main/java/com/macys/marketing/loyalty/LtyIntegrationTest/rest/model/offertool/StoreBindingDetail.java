package com.macys.marketing.loyalty.LtyIntegrationTest.rest.model.offertool;

/**
 * The Class StoreBindingDetail.
 * This Object contains the region,subRegion,district details of the offer 
 */
public class StoreBindingDetail {

	/** The region. */
	private String region;
	
	/** The sub region. */
	private String subRegion;
	
	/** The district. */
	private String district;
	
	/** The store. */
	private String store;

	/**
	 * @return the region
	 */
	public String getRegion() {
		return region;
	}

	/**
	 * @param region the new region
	 */
	public void setRegion(String region) {
		this.region = region;
	}

	/**
	 * @return the sub region
	 */
	public String getSubRegion() {
		return subRegion;
	}

	/**
	 * @param subRegion the new sub region
	 */
	public void setSubRegion(String subRegion) {
		this.subRegion = subRegion;
	}

	/**
	 * @return the district
	 */
	public String getDistrict() {
		return district;
	}

	/**
	 * @param district the new district
	 */
	public void setDistrict(String district) {
		this.district = district;
	}

	/**
	 * @return the store
	 */
	public String getStore() {
		return store;
	}

	/**
	 * @param store the new store
	 */
	public void setStore(String store) {
		this.store = store;
	}

	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof StoreBindingDetail)) {
			return false;
		}

		StoreBindingDetail store = (StoreBindingDetail) obj;

		return this.getStore().equals(store.getStore());
	}

}
