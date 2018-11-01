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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="TierName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LastTierUpdateDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="SpendToNextUpgrade" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
    "tierName",
    "lastTierUpdateDate",
    "spendToNextUpgrade"
})
@XmlRootElement(name = "TierInfo")
public class TierInfo {

    @XmlElement(name = "TierName", required = true)
    protected String tierName;
    @XmlElement(name = "LastTierUpdateDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastTierUpdateDate;
    @XmlElement(name = "SpendToNextUpgrade", required = true)
    protected BigDecimal spendToNextUpgrade;

    /**
     * Gets the value of the tierName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTierName() {
        return tierName;
    }

    /**
     * Sets the value of the tierName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTierName(String value) {
        this.tierName = value;
    }

    /**
     * Gets the value of the lastTierUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastTierUpdateDate() {
        return lastTierUpdateDate;
    }

    /**
     * Sets the value of the lastTierUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastTierUpdateDate(XMLGregorianCalendar value) {
        this.lastTierUpdateDate = value;
    }

    /**
     * Gets the value of the spendToNextUpgrade property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSpendToNextUpgrade() {
        return spendToNextUpgrade;
    }

    /**
     * Sets the value of the spendToNextUpgrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSpendToNextUpgrade(BigDecimal value) {
        this.spendToNextUpgrade = value;
    }

}
