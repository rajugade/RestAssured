package com.macys.marketing.loyalty.LtyIntegrationTest.util;

/**
 * This class is used to load the all properties from all properties files
 * 
 */
public class PropertyLoader {
	
	public static String getEnvironment(){
		return PropertyConfigManger.getEnv();
	}
	
	public static String getLoyaltyOfferHost() {
		return PropertyConfigManger.getProperty("loyalty.offer.host");
	}
	
	public static String getLoyaltyOdsDatasourceName(){
		return PropertyConfigManger.getProperty("loyalty.ods.datasource.name");
	}
	public static String getLoyaltyOdsDatasourceDriverClassName(){
		return PropertyConfigManger.getProperty("loyalty.ods.datasource.driverClassName");
	}
	public static String getLoyaltyOdsDatasourceUrl(){
		return PropertyConfigManger.getProperty("loyalty.ods.datasource.url");
	}
	public static String getLoyaltyOdsDatasourceUsername(){
		return PropertyConfigManger.getProperty("loyalty.ods.datasource.username");
	}
	public static String getLoyaltyOdsDatasourcePassword(){
		return PropertyConfigManger.getProperty("loyalty.ods.datasource.password");
	}
	public static int getLoyaltyOdsDatasourcePoolSize(){
		return Integer.parseInt(PropertyConfigManger.getProperty("loyalty.ods.datasource.maxPoolSize"));
	}
	public static String getLoyaltyOffertoolDatasourceName(){
		return PropertyConfigManger.getProperty("loyalty.offertool.datasource.name");
	}
	public static String getLoyaltyOffertoolDatasourceDriverClassName(){
		return PropertyConfigManger.getProperty("loyalty.offertool.datasource.driverClassName");
	}
	public static String getLoyaltyOffertoolDatasourceUrl(){
		return PropertyConfigManger.getProperty("loyalty.offertool.datasource.url");
	}
	public static String getLoyaltyOffertoolDatasourceUsername(){
		return PropertyConfigManger.getProperty("loyalty.offertool.datasource.username");
	}
	public static String getLoyaltyOffertoolDatasourcePassword(){
		return PropertyConfigManger.getProperty("loyalty.offertool.datasource.password");
	}
	public static int getLoyaltyOffertoolDatasourcePoolSize(){
		return Integer.parseInt(PropertyConfigManger.getProperty("loyalty.offertool.datasource.maxPoolSize"));
	}

	public static String getTibcoURL() {
		return PropertyConfigManger.getProperty("TIBCO_EMS_SSL_URL");
	}
	public static String getSslUsername() {
		return PropertyConfigManger.getProperty("tibco.ems.ssl.username");
	}
	public static String getSslPassword() {
		return PropertyConfigManger.getProperty("tibco.ems.ssl.password");
	}
	public static String getSslIdentityPath() {
		return PropertyConfigManger.getProperty("tibco.ems.ssl.identity.path");
	}
	public static String getPrivatekeyPassword() {
		return PropertyConfigManger.getProperty("tibco.ems.ssl.privatekey.password");
	}
	public static String getCertificatePath() {
		return PropertyConfigManger.getProperty("tibco.ems.ssl.certificate.path");
	}
	public static String getTrustedencodingPath() {
		return PropertyConfigManger.getProperty("tibco.ems.ssl.trustedencoding.path");
	}
	public static String getOffertoolupdatQueue() {
		return PropertyConfigManger.getProperty("loyalty.offertoolupdate.queue.name");
	}
	public static String getLoyaltyOfferUri() {
		return PropertyConfigManger.getProperty("loyalty.offer.uri");
	}
	public static String getLoyaltyControlElementsUri() {
		return PropertyConfigManger.getProperty("loyalty.offer.controls.uri");
	}
	public static String getLoyaltyAccountv12Address() {
		return PropertyConfigManger.getProperty("loyalty.LTYAccountv12.address");
	}
	public static boolean isRestAssuredLogsEnable() {
		return Boolean.parseBoolean(PropertyConfigManger.getProperty("restassured.logs.enable"));
	}
	public static String getLoyaltyTransactionv12Address() {
		return PropertyConfigManger.getProperty("loyalty.LTYTransactionv12.address");
	}
	public static String getLoyaltyCustomerv11Address() {
		return PropertyConfigManger.getProperty("loyalty.LTYCustomerv11.address");
	}
	public static String getLTYTestBedAddress() {
		return PropertyConfigManger.getProperty("loyalty.LTYTestBed.address");
	}
	public static String getLoyaltyActivityLogUri() {
		return PropertyConfigManger.getProperty("loyalty.offer.activitylog.uri");
	}
}
