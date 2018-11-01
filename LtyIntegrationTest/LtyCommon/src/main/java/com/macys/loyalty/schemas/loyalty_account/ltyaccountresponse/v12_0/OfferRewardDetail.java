//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.10.04 at 05:37:24 PM IST 
//


package com.macys.loyalty.schemas.loyalty_account.ltyaccountresponse.v12_0;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{http://loyalty.macys.com/schemas/loyalty.account/LtyAccountResponse/v12_0}Points" minOccurs="0"/>
 *         &lt;element ref="{http://loyalty.macys.com/schemas/loyalty.account/LtyAccountResponse/v12_0}Multiplier" minOccurs="0"/>
 *         &lt;element ref="{http://loyalty.macys.com/schemas/loyalty.account/LtyAccountResponse/v12_0}TxnSpendMax" minOccurs="0"/>
 *         &lt;element ref="{http://loyalty.macys.com/schemas/loyalty.account/LtyAccountResponse/v12_0}TxnSpendMin" minOccurs="0"/>
 *         &lt;element ref="{http://loyalty.macys.com/schemas/loyalty.account/LtyAccountResponse/v12_0}DeptSpendMax" minOccurs="0"/>
 *         &lt;element ref="{http://loyalty.macys.com/schemas/loyalty.account/LtyAccountResponse/v12_0}DeptSpendMin" minOccurs="0"/>
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
    "points",
    "multiplier",
    "txnSpendMax",
    "txnSpendMin",
    "deptSpendMax",
    "deptSpendMin"
})
@XmlRootElement(name = "OfferRewardDetail")
public class OfferRewardDetail {

    @XmlElement(name = "Points")
    protected BigDecimal points;
    @XmlElement(name = "Multiplier")
    protected BigDecimal multiplier;
    @XmlElement(name = "TxnSpendMax")
    protected BigDecimal txnSpendMax;
    @XmlElement(name = "TxnSpendMin")
    protected BigDecimal txnSpendMin;
    @XmlElement(name = "DeptSpendMax")
    protected BigDecimal deptSpendMax;
    @XmlElement(name = "DeptSpendMin")
    protected BigDecimal deptSpendMin;

    /**
     * Gets the value of the points property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPoints() {
        return points;
    }

    /**
     * Sets the value of the points property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPoints(BigDecimal value) {
        this.points = value;
    }

    /**
     * Gets the value of the multiplier property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMultiplier() {
        return multiplier;
    }

    /**
     * Sets the value of the multiplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMultiplier(BigDecimal value) {
        this.multiplier = value;
    }

    /**
     * Gets the value of the txnSpendMax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTxnSpendMax() {
        return txnSpendMax;
    }

    /**
     * Sets the value of the txnSpendMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTxnSpendMax(BigDecimal value) {
        this.txnSpendMax = value;
    }

    /**
     * Gets the value of the txnSpendMin property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTxnSpendMin() {
        return txnSpendMin;
    }

    /**
     * Sets the value of the txnSpendMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTxnSpendMin(BigDecimal value) {
        this.txnSpendMin = value;
    }

    /**
     * Gets the value of the deptSpendMax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDeptSpendMax() {
        return deptSpendMax;
    }

    /**
     * Sets the value of the deptSpendMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDeptSpendMax(BigDecimal value) {
        this.deptSpendMax = value;
    }

    /**
     * Gets the value of the deptSpendMin property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDeptSpendMin() {
        return deptSpendMin;
    }

    /**
     * Sets the value of the deptSpendMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDeptSpendMin(BigDecimal value) {
        this.deptSpendMin = value;
    }

}
