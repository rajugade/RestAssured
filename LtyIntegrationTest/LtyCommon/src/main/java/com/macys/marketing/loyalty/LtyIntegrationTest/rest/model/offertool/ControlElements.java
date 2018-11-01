package com.macys.marketing.loyalty.LtyIntegrationTest.rest.model.offertool;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;


@JsonRootName("controlElements")
public class ControlElements {

	@JsonProperty("controlElement")
	private List<RwdOfferToolControllers> offerToolControllers;

	public List<RwdOfferToolControllers> getOfferToolControllers() {
		return offerToolControllers;
	}

	public void setOfferToolControllers(List<RwdOfferToolControllers> offerToolControllers) {
		this.offerToolControllers = offerToolControllers;
	}

}
