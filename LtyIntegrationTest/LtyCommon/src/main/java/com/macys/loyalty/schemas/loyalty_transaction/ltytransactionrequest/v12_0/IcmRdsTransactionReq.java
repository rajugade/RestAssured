//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.10.10 at 04:53:00 PM IST 
//


package com.macys.loyalty.schemas.loyalty_transaction.ltytransactionrequest.v12_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.macys.loyalty.schemas.loyalty_common.ltycommon.v12_0.AccountIdentifier;
import com.macys.loyalty.schemas.loyalty_common.ltycommon.v12_0.CommunicationHeader;


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
 *         &lt;element ref="{http://loyalty.macys.com/schemas/loyalty.common/LtyCommon/v12_0}CommunicationHeader"/>
 *         &lt;element ref="{http://loyalty.macys.com/schemas/loyalty.common/LtyCommon/v12_0}CustomerIdentifier" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://loyalty.macys.com/schemas/loyalty.common/LtyCommon/v12_0}ReservationNum"/>
 *         &lt;element ref="{http://loyalty.macys.com/schemas/loyalty.common/LtyCommon/v12_0}SalescheckNum" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://loyalty.macys.com/schemas/loyalty.common/LtyCommon/v12_0}AddedByApp"/>
 *         &lt;element name="Store" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://loyalty.macys.com/schemas/loyalty.transaction/LtyTransactionRequest/v12_0}SttDate" minOccurs="0"/>
 *         &lt;element ref="{http://loyalty.macys.com/schemas/loyalty.common/LtyCommon/v12_0}Division"/>
 *         &lt;element ref="{http://loyalty.macys.com/schemas/loyalty.common/LtyCommon/v12_0}TransactionType"/>
 *         &lt;element ref="{http://loyalty.macys.com/schemas/loyalty.common/LtyCommon/v12_0}TimeStamp"/>
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
    "communicationHeader",
    "customerIdentifier",
    "reservationNum",
    "salescheckNum",
    "addedByApp",
    "store",
    "sttDate",
    "division",
    "transactionType",
    "timeStamp"
})
@XmlRootElement(name = "IcmRdsTransactionReq")
public class IcmRdsTransactionReq {

    @XmlElement(name = "CommunicationHeader", namespace = "http://loyalty.macys.com/schemas/loyalty.common/LtyCommon/v12_0", required = true)
    protected CommunicationHeader communicationHeader;
    @XmlElement(name = "CustomerIdentifier", namespace = "http://loyalty.macys.com/schemas/loyalty.common/LtyCommon/v12_0", required = true)
    protected List<AccountIdentifier> customerIdentifier;
    @XmlElement(name = "ReservationNum", namespace = "http://loyalty.macys.com/schemas/loyalty.common/LtyCommon/v12_0")
    protected long reservationNum;
    @XmlElement(name = "SalescheckNum", namespace = "http://loyalty.macys.com/schemas/loyalty.common/LtyCommon/v12_0", type = Long.class)
    protected List<Long> salescheckNum;
    @XmlElement(name = "AddedByApp", namespace = "http://loyalty.macys.com/schemas/loyalty.common/LtyCommon/v12_0", required = true)
    protected String addedByApp;
    @XmlElement(name = "Store", required = true)
    protected String store;
    @XmlElement(name = "SttDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar sttDate;
    @XmlElement(name = "Division", namespace = "http://loyalty.macys.com/schemas/loyalty.common/LtyCommon/v12_0")
    protected short division;
    @XmlElement(name = "TransactionType", namespace = "http://loyalty.macys.com/schemas/loyalty.common/LtyCommon/v12_0", required = true)
    protected String transactionType;
    @XmlElement(name = "TimeStamp", namespace = "http://loyalty.macys.com/schemas/loyalty.common/LtyCommon/v12_0", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;

    /**
     * Gets the value of the communicationHeader property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationHeader }
     *     
     */
    public CommunicationHeader getCommunicationHeader() {
        return communicationHeader;
    }

    /**
     * Sets the value of the communicationHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationHeader }
     *     
     */
    public void setCommunicationHeader(CommunicationHeader value) {
        this.communicationHeader = value;
    }

    /**
     * Gets the value of the customerIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountIdentifier }
     * 
     * 
     */
    public List<AccountIdentifier> getCustomerIdentifier() {
        if (customerIdentifier == null) {
            customerIdentifier = new ArrayList<AccountIdentifier>();
        }
        return this.customerIdentifier;
    }

    /**
     * ReservationNum: The reservation number for FIL or RDS fulfillment channel
     * 
     */
    public long getReservationNum() {
        return reservationNum;
    }

    /**
     * Sets the value of the reservationNum property.
     * 
     */
    public void setReservationNum(long value) {
        this.reservationNum = value;
    }

    /**
     * Gets the value of the salescheckNum property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salescheckNum property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalescheckNum().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getSalescheckNum() {
        if (salescheckNum == null) {
            salescheckNum = new ArrayList<Long>();
        }
        return this.salescheckNum;
    }

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
     * Gets the value of the store property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStore() {
        return store;
    }

    /**
     * Sets the value of the store property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStore(String value) {
        this.store = value;
    }

    /**
     * SttDate: Date of the transaction
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSttDate() {
        return sttDate;
    }

    /**
     * Sets the value of the sttDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSttDate(XMLGregorianCalendar value) {
        this.sttDate = value;
    }

    /**
     * Gets the value of the division property.
     * 
     */
    public short getDivision() {
        return division;
    }

    /**
     * Sets the value of the division property.
     * 
     */
    public void setDivision(short value) {
        this.division = value;
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
     * Gets the value of the timeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeStamp(XMLGregorianCalendar value) {
        this.timeStamp = value;
    }

}
