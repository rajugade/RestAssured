package com.macys.marketing.loyalty.LtyIntegrationTest.rest.model.offertool;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("activityLog")
public class LtyActivityLogBinding extends ArrayList<LtyActivityLogBinding> implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	
	private String action;
	private String previousStatus;
	private String currentStatus;
	private String userName;
	private String lastUpdateTs;

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getPreviousStatus() {
		return previousStatus;
	}

	public void setPreviousStatus(String previousStatus) {
		this.previousStatus = previousStatus;
	}

	public String getCurrentStatus() {
		return currentStatus;
	}

	public void setCurrentStatus(String currentStatus) {
		this.currentStatus = currentStatus;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getLastUpdateTs() {
		return lastUpdateTs;
	}

	public void setLastUpdateTs(String lastUpdateTs) {
		this.lastUpdateTs = lastUpdateTs;
	}

	@Override
	public String toString() {
		return "ActivityLogBinding [action=" + action + ", previousStatus=" + previousStatus + ", currentStatus="
				+ currentStatus + ", userName=" + userName + ", lastUpdateTs=" + lastUpdateTs + "]";
	}

	

}
