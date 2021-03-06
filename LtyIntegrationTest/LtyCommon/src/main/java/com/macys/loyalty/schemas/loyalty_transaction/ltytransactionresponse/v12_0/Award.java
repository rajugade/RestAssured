//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.10.10 at 04:54:49 PM IST 
//


package com.macys.loyalty.schemas.loyalty_transaction.ltytransactionresponse.v12_0;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.macys.loyalty.schemas.loyalty_common.ltycommon.v12_0.AwardCard;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://loyalty.macys.com/schemas/loyalty.common/LtyCommon/v12_0}AwardCard">
 *       &lt;sequence>
 *         &lt;element name="AwardUpdatedFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RewardAmountUsed" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DeltaAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "awardUpdatedFlag",
    "rewardAmountUsed",
    "deltaAmount"
})
@XmlRootElement(name = "Award")
public class Award
    extends AwardCard
{

    @XmlElement(name = "AwardUpdatedFlag")
    protected Boolean awardUpdatedFlag;
    @XmlElement(name = "RewardAmountUsed")
    protected BigDecimal rewardAmountUsed;
    @XmlElement(name = "DeltaAmount")
    protected BigDecimal deltaAmount;

    /**
     * Gets the value of the awardUpdatedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAwardUpdatedFlag() {
        return awardUpdatedFlag;
    }

    /**
     * Sets the value of the awardUpdatedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAwardUpdatedFlag(Boolean value) {
        this.awardUpdatedFlag = value;
    }

    /**
     * Gets the value of the rewardAmountUsed property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRewardAmountUsed() {
        return rewardAmountUsed;
    }

    /**
     * Sets the value of the rewardAmountUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRewardAmountUsed(BigDecimal value) {
        this.rewardAmountUsed = value;
    }

    /**
     * Gets the value of the deltaAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDeltaAmount() {
        return deltaAmount;
    }

    /**
     * Sets the value of the deltaAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDeltaAmount(BigDecimal value) {
        this.deltaAmount = value;
    }

}
