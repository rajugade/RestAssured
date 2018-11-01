//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.10.04 at 05:37:24 PM IST 
//


package com.macys.loyalty.schemas.loyalty_common.ltycommon.v12_0;

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
 *         &lt;element ref="{http://loyalty.macys.com/schemas/loyalty.common/LtyCommon/v12_0}BaseReward"/>
 *         &lt;element ref="{http://loyalty.macys.com/schemas/loyalty.common/LtyCommon/v12_0}BonusReward"/>
 *         &lt;element ref="{http://loyalty.macys.com/schemas/loyalty.common/LtyCommon/v12_0}DeferredReward"/>
 *         &lt;element ref="{http://loyalty.macys.com/schemas/loyalty.common/LtyCommon/v12_0}TotalReward"/>
 *         &lt;element ref="{http://loyalty.macys.com/schemas/loyalty.common/LtyCommon/v12_0}PendingBaseReward"/>
 *         &lt;element ref="{http://loyalty.macys.com/schemas/loyalty.common/LtyCommon/v12_0}PendingBonusReward"/>
 *         &lt;element ref="{http://loyalty.macys.com/schemas/loyalty.common/LtyCommon/v12_0}PendingDeferredReward"/>
 *         &lt;element ref="{http://loyalty.macys.com/schemas/loyalty.common/LtyCommon/v12_0}PendingTotalReward"/>
 *         &lt;element ref="{http://loyalty.macys.com/schemas/loyalty.common/LtyCommon/v12_0}NetReward" minOccurs="0"/>
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
    "baseReward",
    "bonusReward",
    "deferredReward",
    "totalReward",
    "pendingBaseReward",
    "pendingBonusReward",
    "pendingDeferredReward",
    "pendingTotalReward",
    "netReward"
})
@XmlRootElement(name = "Earned")
public class Earned {

    @XmlElement(name = "BaseReward", required = true)
    protected BigDecimal baseReward;
    @XmlElement(name = "BonusReward", required = true)
    protected BigDecimal bonusReward;
    @XmlElement(name = "DeferredReward", required = true)
    protected BigDecimal deferredReward;
    @XmlElement(name = "TotalReward", required = true)
    protected BigDecimal totalReward;
    @XmlElement(name = "PendingBaseReward", required = true)
    protected BigDecimal pendingBaseReward;
    @XmlElement(name = "PendingBonusReward", required = true)
    protected BigDecimal pendingBonusReward;
    @XmlElement(name = "PendingDeferredReward", required = true)
    protected BigDecimal pendingDeferredReward;
    @XmlElement(name = "PendingTotalReward", required = true)
    protected BigDecimal pendingTotalReward;
    @XmlElement(name = "NetReward")
    protected BigDecimal netReward;

    /**
     * Gets the value of the baseReward property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBaseReward() {
        return baseReward;
    }

    /**
     * Sets the value of the baseReward property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBaseReward(BigDecimal value) {
        this.baseReward = value;
    }

    /**
     * Gets the value of the bonusReward property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBonusReward() {
        return bonusReward;
    }

    /**
     * Sets the value of the bonusReward property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBonusReward(BigDecimal value) {
        this.bonusReward = value;
    }

    /**
     * Gets the value of the deferredReward property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDeferredReward() {
        return deferredReward;
    }

    /**
     * Sets the value of the deferredReward property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDeferredReward(BigDecimal value) {
        this.deferredReward = value;
    }

    /**
     * Gets the value of the totalReward property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalReward() {
        return totalReward;
    }

    /**
     * Sets the value of the totalReward property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalReward(BigDecimal value) {
        this.totalReward = value;
    }

    /**
     * Gets the value of the pendingBaseReward property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPendingBaseReward() {
        return pendingBaseReward;
    }

    /**
     * Sets the value of the pendingBaseReward property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPendingBaseReward(BigDecimal value) {
        this.pendingBaseReward = value;
    }

    /**
     * Gets the value of the pendingBonusReward property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPendingBonusReward() {
        return pendingBonusReward;
    }

    /**
     * Sets the value of the pendingBonusReward property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPendingBonusReward(BigDecimal value) {
        this.pendingBonusReward = value;
    }

    /**
     * Gets the value of the pendingDeferredReward property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPendingDeferredReward() {
        return pendingDeferredReward;
    }

    /**
     * Sets the value of the pendingDeferredReward property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPendingDeferredReward(BigDecimal value) {
        this.pendingDeferredReward = value;
    }

    /**
     * Gets the value of the pendingTotalReward property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPendingTotalReward() {
        return pendingTotalReward;
    }

    /**
     * Sets the value of the pendingTotalReward property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPendingTotalReward(BigDecimal value) {
        this.pendingTotalReward = value;
    }

    /**
     * Gets the value of the netReward property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetReward() {
        return netReward;
    }

    /**
     * Sets the value of the netReward property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNetReward(BigDecimal value) {
        this.netReward = value;
    }

}
