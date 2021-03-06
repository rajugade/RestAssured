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
import com.macys.loyalty.schemas.loyalty_common.ltycommon.v12_0.AwardSummary;


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
 *         &lt;element ref="{http://loyalty.macys.com/schemas/loyalty.account/LtyAccountResponse/v12_0}AwardSummary" minOccurs="0"/>
 *         &lt;element ref="{http://loyalty.macys.com/schemas/loyalty.account/LtyAccountResponse/v12_0}AwardCards" maxOccurs="unbounded" minOccurs="0"/>
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
    "awardSummary",
    "awardCards"
})
@XmlRootElement(name = "Award")
public class Award {

    @XmlElement(name = "AwardSummary")
    protected AwardSummary awardSummary;
    @XmlElement(name = "AwardCards")
    protected List<AwardCards> awardCards;

    /**
     * Gets the value of the awardSummary property.
     * 
     * @return
     *     possible object is
     *     {@link AwardSummary }
     *     
     */
    public AwardSummary getAwardSummary() {
        return awardSummary;
    }

    /**
     * Sets the value of the awardSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link AwardSummary }
     *     
     */
    public void setAwardSummary(AwardSummary value) {
        this.awardSummary = value;
    }

    /**
     * Gets the value of the awardCards property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the awardCards property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAwardCards().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AwardCards }
     * 
     * 
     */
    public List<AwardCards> getAwardCards() {
        if (awardCards == null) {
            awardCards = new ArrayList<AwardCards>();
        }
        return this.awardCards;
    }

}
