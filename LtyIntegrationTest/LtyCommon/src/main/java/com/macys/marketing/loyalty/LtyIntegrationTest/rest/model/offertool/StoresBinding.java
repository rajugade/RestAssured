package com.macys.marketing.loyalty.LtyIntegrationTest.rest.model.offertool;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonRootName;

/**
 * This Object contains the list stores informtion of the offer
 * @author Karthik Chigurupati
 * @since 6/12/17
 */
@JsonRootName("stores")
public class StoresBinding implements Serializable {

	private static final long serialVersionUID = 1L;
	private List<StoreBindingDetail> store;

	public List<StoreBindingDetail> getStore() {
		return store;
	}

	public void setStore(List<StoreBindingDetail> store) {
		this.store = store;
	}

}
