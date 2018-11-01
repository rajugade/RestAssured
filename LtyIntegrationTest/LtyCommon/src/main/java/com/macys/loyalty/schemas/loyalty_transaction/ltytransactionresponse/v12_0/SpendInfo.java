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
 *         &lt;element name="YTDPropSpend" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="LifeTimePropSpend" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
    "ytdPropSpend",
    "lifeTimePropSpend"
})
@XmlRootElement(name = "SpendInfo")
public class SpendInfo {

    @XmlElement(name = "YTDPropSpend", required = true)
    protected BigDecimal ytdPropSpend;
    @XmlElement(name = "LifeTimePropSpend", required = true)
    protected BigDecimal lifeTimePropSpend;

    /**
     * Gets the value of the ytdPropSpend property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getYTDPropSpend() {
        return ytdPropSpend;
    }

    /**
     * Sets the value of the ytdPropSpend property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setYTDPropSpend(BigDecimal value) {
        this.ytdPropSpend = value;
    }

    /**
     * Gets the value of the lifeTimePropSpend property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLifeTimePropSpend() {
        return lifeTimePropSpend;
    }

    /**
     * Sets the value of the lifeTimePropSpend property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLifeTimePropSpend(BigDecimal value) {
        this.lifeTimePropSpend = value;
    }

}
