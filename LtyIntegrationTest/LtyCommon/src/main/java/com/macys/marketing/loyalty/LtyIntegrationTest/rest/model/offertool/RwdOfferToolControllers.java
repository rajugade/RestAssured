package com.macys.marketing.loyalty.LtyIntegrationTest.rest.model.offertool;

import java.io.Serializable;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("controlelement")
public class RwdOfferToolControllers implements Serializable {

	private static final long serialVersionUID = 1L;
	private BigDecimal id;
	private String brand;
	private int division;
	private int controlKey;
	private String controlElementValue;
	private String controlGroup;
	private String ltyControlGroup;

	public BigDecimal getId() {
		return id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getDivision() {
		return division;
	}

	public void setDivision(int division) {
		this.division = division;
	}

	public String getControlElementValue() {
		return controlElementValue;
	}

	public void setControlElementValue(String controlElementValue) {
		this.controlElementValue = controlElementValue;
	}

	public int getControlKey() {
		return controlKey;
	}

	public void setControlKey(int controlKey) {
		this.controlKey = controlKey;
	}

	public String getControlGroup() {
		return controlGroup;
	}

	public void setControlGroup(String controlGroup) {
		this.controlGroup = controlGroup;
	}

	public String getLtyControlGroup() {
		return ltyControlGroup;
	}

	public void setLtyControlGroup(String ltyControlGroup) {
		this.ltyControlGroup = ltyControlGroup;
	}

}
