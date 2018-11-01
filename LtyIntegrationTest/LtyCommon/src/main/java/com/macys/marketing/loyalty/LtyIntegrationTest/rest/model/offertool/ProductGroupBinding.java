package com.macys.marketing.loyalty.LtyIntegrationTest.rest.model.offertool;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonRootName;

/**
 * This object contains the product information of the of the offer.
 *
 * @author Karthik Chigurupati
 * @since 6/12/17
 */
@JsonRootName("productGroup")
public class ProductGroupBinding {
  
	/** The record group. */
	private int recordGroup;
	
	/** The group item count. */
	private int groupItemCount;
	
	/** The product. */
	private List<ProductBinding> product;
	
	/**
	 * @return the record group
	 */
	public int getRecordGroup() {
		return recordGroup;
	}
	
	/**
	 * @param recordGroup the new record group
	 */
	public void setRecordGroup(int recordGroup) {
		this.recordGroup = recordGroup;
	}
	
	/**
	 * @return the group item count
	 */
	public int getGroupItemCount() {
		return groupItemCount;
	}
	
	/**
	 * @param groupItemCount the new group item count
	 */
	public void setGroupItemCount(int groupItemCount) {
		this.groupItemCount = groupItemCount;
	}
	
	/**
	 * @return the product
	 */
	public List<ProductBinding> getProduct() {
		return product;
	}
	
	/**
	 * @param product the new product
	 */
	public void setProduct(List<ProductBinding> product) {
		this.product = product;
	}
	
	
}
