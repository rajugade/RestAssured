//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.10.10 at 04:53:00 PM IST 
//


package com.macys.loyalty.schemas.loyalty_transaction.ltytransactionrequest.v12_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.macys.loyalty.schemas.loyalty_common.ltycommon.v12_0.Stt;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://loyalty.macys.com/schemas/loyalty.common/LtyCommon/v12_0}AddedByApp"/>
 *         &lt;element ref="{http://loyalty.macys.com/schemas/loyalty.common/LtyCommon/v12_0}FulfillmentChannel"/>
 *         &lt;element ref="{http://loyalty.macys.com/schemas/loyalty.common/LtyCommon/v12_0}TransactionType"/>
 *         &lt;element ref="{http://loyalty.macys.com/schemas/loyalty.common/LtyCommon/v12_0}AssociateId" minOccurs="0"/>
 *         &lt;element ref="{http://loyalty.macys.com/schemas/loyalty.common/LtyCommon/v12_0}PresaleEffectiveDate" minOccurs="0"/>
 *         &lt;element ref="{http://loyalty.macys.com/schemas/loyalty.transaction/LtyTransactionRequest/v12_0}SttInfo"/>
 *         &lt;element ref="{http://loyalty.macys.com/schemas/loyalty.transaction/LtyTransactionRequest/v12_0}PostVoidSttInfo" minOccurs="0"/>
 *         &lt;element ref="{http://loyalty.macys.com/schemas/loyalty.common/LtyCommon/v12_0}ReservationNum" minOccurs="0"/>
 *         &lt;element ref="{http://loyalty.macys.com/schemas/loyalty.common/LtyCommon/v12_0}SalescheckNum" minOccurs="0"/>
 *         &lt;element ref="{http://loyalty.macys.com/schemas/loyalty.common/LtyCommon/v12_0}OrderNum" minOccurs="0"/>
 *         &lt;element ref="{http://loyalty.macys.com/schemas/loyalty.common/LtyCommon/v12_0}Email" minOccurs="0"/>
 *         &lt;element ref="{http://loyalty.macys.com/schemas/loyalty.transaction/LtyTransactionRequest/v12_0}OrderTimestamp"/>
 *         &lt;element ref="{http://loyalty.macys.com/schemas/loyalty.transaction/LtyTransactionRequest/v12_0}ProcessTimestamp"/>
 *         &lt;element ref="{http://loyalty.macys.com/schemas/loyalty.transaction/LtyTransactionRequest/v12_0}OfflineRetryFlag"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "addedByApp",
    "fulfillmentChannel",
    "transactionType",
    "associateId",
    "presaleEffectiveDate",
    "sttInfo",
    "postVoidSttInfo",
    "reservationNum",
    "salescheckNum",
    "orderNum",
    "email",
    "orderTimestamp",
    "processTimestamp",
    "offlineRetryFlag"
})
@XmlRootElement(name = "TransactionHeader")
public class TransactionHeader {

    @XmlElement(name = "AddedByApp", namespace = "http://loyalty.macys.com/schemas/loyalty.common/LtyCommon/v12_0", required = true)
    protected String addedByApp;
    @XmlElement(name = "FulfillmentChannel", namespace = "http://loyalty.macys.com/schemas/loyalty.common/LtyCommon/v12_0", required = true)
    protected String fulfillmentChannel;
    @XmlElement(name = "TransactionType", namespace = "http://loyalty.macys.com/schemas/loyalty.common/LtyCommon/v12_0", required = true)
    protected String transactionType;
    @XmlElement(name = "AssociateId", namespace = "http://loyalty.macys.com/schemas/loyalty.common/LtyCommon/v12_0")
    protected String associateId;
    @XmlElement(name = "PresaleEffectiveDate", namespace = "http://loyalty.macys.com/schemas/loyalty.common/LtyCommon/v12_0")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar presaleEffectiveDate;
    @XmlElement(name = "SttInfo", required = true)
    protected Stt sttInfo;
    @XmlElement(name = "PostVoidSttInfo")
    protected Stt postVoidSttInfo;
    @XmlElement(name = "ReservationNum", namespace = "http://loyalty.macys.com/schemas/loyalty.common/LtyCommon/v12_0")
    protected Long reservationNum;
    @XmlElement(name = "SalescheckNum", namespace = "http://loyalty.macys.com/schemas/loyalty.common/LtyCommon/v12_0")
    protected Long salescheckNum;
    @XmlElement(name = "OrderNum", namespace = "http://loyalty.macys.com/schemas/loyalty.common/LtyCommon/v12_0")
    protected String orderNum;
    @XmlElement(name = "Email", namespace = "http://loyalty.macys.com/schemas/loyalty.common/LtyCommon/v12_0")
    protected String email;
    @XmlElement(name = "OrderTimestamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar orderTimestamp;
    @XmlElement(name = "ProcessTimestamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar processTimestamp;
    @XmlElement(name = "OfflineRetryFlag")
    protected boolean offlineRetryFlag;

    /**
     * Gets the value of the addedByApp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddedByApp() {
        return addedByApp;
    }

    /**
     * Sets the value of the addedByApp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddedByApp(String value) {
        this.addedByApp = value;
    }

    /**
     * Gets the value of the fulfillmentChannel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFulfillmentChannel() {
        return fulfillmentChannel;
    }

    /**
     * Sets the value of the fulfillmentChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFulfillmentChannel(String value) {
        this.fulfillmentChannel = value;
    }

    /**
     * PURCHASE - Purchase, in-store/on-line
     * POST_VOID - Post void transaction
     * RETURN - Return Transactions (only return lines)
     * PS_ISSUE - Pre-sale issuance
     * PW_ISSUE - PowerPoint issuance (indicates that the PowerPoints have been released)
     * SPECIAL_ORDER - Special Order
     * SPECIAL_ORDERPICKUP - Pick-up of special order
     * OC - No new records will be created. This was pre-foundation DOTCOM purchases
     * SC - FedFil Shipment confirmations
     * RC - FedFil Reservation Closed (No shipments left)
     * SHIP_CONFIRM - RDS shipment confirmation
     * CSREWARD - Customer Service Reward
     * TRANSFER - OOS transactions.
     * AWARD_PURGE - Award Purge (Loyalty internal � used for marking rewards as awarded). This can be ignored.
     * REWARD_EXPIRE - Reward Expiry (Loyalty internal � used for marking rewards as expired). This can be ignored. 
     * ANNUAL_UPDATE - Annual update (Loyalty internal � generated as part of resetting YTD values) . This can be ignored.
     * BALANCE_UPDATE - Balance Updates (Loyalty internal � Used to make updates to a customer balance during operational data fixes). This can be ignored
     * BTY_REDEEM - Beauty redemptions � Deprecated, and no new records will be created.
     * SPECIAL_EVENT - Loyalty internal receipts created when a special event transaction is created (CC_ENROLL, LTY_ENROLL, etc.)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the value of the transactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionType(String value) {
        this.transactionType = value;
    }

    /**
     * Gets the value of the associateId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssociateId() {
        return associateId;
    }

    /**
     * Sets the value of the associateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssociateId(String value) {
        this.associateId = value;
    }

    /**
     * PresaleEffectiveDate: The date on which the presale purchase becomes financial.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPresaleEffectiveDate() {
        return presaleEffectiveDate;
    }

    /**
     * Sets the value of the presaleEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPresaleEffectiveDate(XMLGregorianCalendar value) {
        this.presaleEffectiveDate = value;
    }

    /**
     * SttInfo: Store, Terminal and Transaction number
     * 
     * @return
     *     possible object is
     *     {@link Stt }
     *     
     */
    public Stt getSttInfo() {
        return sttInfo;
    }

    /**
     * Sets the value of the sttInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Stt }
     *     
     */
    public void setSttInfo(Stt value) {
        this.sttInfo = value;
    }

    /**
     * PostVoidStt: STT used to post-void the transaction
     * 
     * @return
     *     possible object is
     *     {@link Stt }
     *     
     */
    public Stt getPostVoidSttInfo() {
        return postVoidSttInfo;
    }

    /**
     * Sets the value of the postVoidSttInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Stt }
     *     
     */
    public void setPostVoidSttInfo(Stt value) {
        this.postVoidSttInfo = value;
    }

    /**
     * ReservationNum: The reservation number for FIL or RDS fulfillment channel
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReservationNum() {
        return reservationNum;
    }

    /**
     * Sets the value of the reservationNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReservationNum(Long value) {
        this.reservationNum = value;
    }

    /**
     * Gets the value of the salescheckNum property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSalescheckNum() {
        return salescheckNum;
    }

    /**
     * Sets the value of the salescheckNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSalescheckNum(Long value) {
        this.salescheckNum = value;
    }

    /**
     * OrderNum: The Online order number used for the purchase.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderNum() {
        return orderNum;
    }

    /**
     * Sets the value of the orderNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderNum(String value) {
        this.orderNum = value;
    }

    /**
     * Email: Email address of the Loyalty Customer
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the orderTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrderTimestamp() {
        return orderTimestamp;
    }

    /**
     * Sets the value of the orderTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrderTimestamp(XMLGregorianCalendar value) {
        this.orderTimestamp = value;
    }

    /**
     * Gets the value of the processTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProcessTimestamp() {
        return processTimestamp;
    }

    /**
     * Sets the value of the processTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProcessTimestamp(XMLGregorianCalendar value) {
        this.processTimestamp = value;
    }

    /**
     * OfflineRetryFlag: The transaction is an offline transaction, where customer is not waiting for immediate response.
     * 
     */
    public boolean isOfflineRetryFlag() {
        return offlineRetryFlag;
    }

    /**
     * Sets the value of the offlineRetryFlag property.
     * 
     */
    public void setOfflineRetryFlag(boolean value) {
        this.offlineRetryFlag = value;
    }

}
