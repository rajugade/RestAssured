package com.macys.marketing.loyalty.LtyIntegrationTest.rest.model.offertool;

import com.fasterxml.jackson.annotation.JsonRootName;

/**
 * The Class ProductBinding.
 * This Objects contains the product detail information of the offer
 * and it returns the product hierarchy
 * @author Karthik Chigurupati
 * @since 6/12/17
 */
@JsonRootName("product")
public class ProductBinding {

	/** The item count. */
	private long itemCount;
	
	/** The dept. */
	private long dept;
	
	/** The dept class. */
	private long deptClass;
	
	/** The vendor. */
	private long vendor;
	
	/** The mark style. */
	private long markStyle;
	
	/** The gmm ID. */
	private long gmmID;
	
	/** The product division. */
	private long productDivision;

	/**
	 * @return the gmm ID
	 */
	public long getGmmID() {
		return gmmID;
	}

	/**
	 * @param gmmID the new gmm ID
	 */
	public void setGmmID(long gmmID) {
		this.gmmID = gmmID;
	}

	/**
	 * @return the product division
	 */
	public long getProductDivision() {
		return productDivision;
	}

	/**
	 * @param productDivision the new product division
	 */
	public void setProductDivision(long productDivision) {
		this.productDivision = productDivision;
	}

	/**
	 * @return the item count
	 */
	public long getItemCount() {
		return itemCount;
	}

	/**
	 * @param itemCount the new item count
	 */
	public void setItemCount(long itemCount) {
		this.itemCount = itemCount;
	}

	/**
	 * @return the dept
	 */
	public long getDept() {
		return dept;
	}

	/**
	 * @param dept the new dept
	 */
	public void setDept(long dept) {
		this.dept = dept;
	}

	/**
	 * @return the dept class
	 */
	public long getDeptClass() {
		return deptClass;
	}

	/**
	 * @param deptClass the new dept class
	 */
	public void setDeptClass(long deptClass) {
		this.deptClass = deptClass;
	}

	/**
	 * @return the vendor
	 */
	public long getVendor() {
		return vendor;
	}

	/**
	 * @param vendor the new vendor
	 */
	public void setVendor(long vendor) {
		this.vendor = vendor;
	}

	/**
	 * @return the mark style
	 */
	public long getMarkStyle() {
		return markStyle;
	}

	/**
	 * @param markStyle the new mark style
	 */
	public void setMarkStyle(long markStyle) {
		this.markStyle = markStyle;
	}

}
