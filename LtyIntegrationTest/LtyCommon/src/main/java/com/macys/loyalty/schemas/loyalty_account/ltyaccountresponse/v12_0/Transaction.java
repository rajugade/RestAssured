//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.10.04 at 05:37:24 PM IST 
//


package com.macys.loyalty.schemas.loyalty_account.ltyaccountresponse.v12_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.macys.loyalty.schemas.loyalty_common.ltycommon.v12_0.AccountIdentifier;
import com.macys.loyalty.schemas.loyalty_common.ltycommon.v12_0.Tender;
import com.macys.loyalty.schemas.loyalty_common.ltycommon.v12_0.TransactionAdvisory;


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
 *         &lt;element ref="{http://loyalty.macys.com/schemas/loyalty.common/LtyCommon/v12_0}CustomerIdentifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://loyalty.macys.com/schemas/loyalty.account/LtyAccountResponse/v12_0}TransactionHeader"/>
 *         &lt;element ref="{http://loyalty.macys.com/schemas/loyalty.account/LtyAccountResponse/v12_0}TransactionTender" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://loyalty.macys.com/schemas/loyalty.account/LtyAccountResponse/v12_0}TransactionLine" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://loyalty.macys.com/schemas/loyalty.account/LtyAccountResponse/v12_0}AwardActivity" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://loyalty.macys.com/schemas/loyalty.common/LtyCommon/v12_0}TransactionAdvisory" maxOccurs="unbounded" minOccurs="0"/>
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
    "customerIdentifier",
    "transactionHeader",
    "transactionTender",
    "transactionLine",
    "awardActivity",
    "transactionAdvisory"
})
@XmlRootElement(name = "Transaction")
public class Transaction {

    @XmlElement(name = "CustomerIdentifier", namespace = "http://loyalty.macys.com/schemas/loyalty.common/LtyCommon/v12_0")
    protected List<AccountIdentifier> customerIdentifier;
    @XmlElement(name = "TransactionHeader", required = true)
    protected TransactionHeader transactionHeader;
    @XmlElement(name = "TransactionTender")
    protected List<Tender> transactionTender;
    @XmlElement(name = "TransactionLine")
    protected List<TransactionLine> transactionLine;
    @XmlElement(name = "AwardActivity")
    protected List<AwardActivity> awardActivity;
    @XmlElement(name = "TransactionAdvisory", namespace = "http://loyalty.macys.com/schemas/loyalty.common/LtyCommon/v12_0")
    protected List<TransactionAdvisory> transactionAdvisory;

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
     * Gets the value of the transactionHeader property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionHeader }
     *     
     */
    public TransactionHeader getTransactionHeader() {
        return transactionHeader;
    }

    /**
     * Sets the value of the transactionHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionHeader }
     *     
     */
    public void setTransactionHeader(TransactionHeader value) {
        this.transactionHeader = value;
    }

    /**
     * Gets the value of the transactionTender property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transactionTender property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransactionTender().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tender }
     * 
     * 
     */
    public List<Tender> getTransactionTender() {
        if (transactionTender == null) {
            transactionTender = new ArrayList<Tender>();
        }
        return this.transactionTender;
    }

    /**
     * Gets the value of the transactionLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transactionLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransactionLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionLine }
     * 
     * 
     */
    public List<TransactionLine> getTransactionLine() {
        if (transactionLine == null) {
            transactionLine = new ArrayList<TransactionLine>();
        }
        return this.transactionLine;
    }

    /**
     * Gets the value of the awardActivity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the awardActivity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAwardActivity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AwardActivity }
     * 
     * 
     */
    public List<AwardActivity> getAwardActivity() {
        if (awardActivity == null) {
            awardActivity = new ArrayList<AwardActivity>();
        }
        return this.awardActivity;
    }

    /**
     * Gets the value of the transactionAdvisory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transactionAdvisory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransactionAdvisory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionAdvisory }
     * 
     * 
     */
    public List<TransactionAdvisory> getTransactionAdvisory() {
        if (transactionAdvisory == null) {
            transactionAdvisory = new ArrayList<TransactionAdvisory>();
        }
        return this.transactionAdvisory;
    }

}
