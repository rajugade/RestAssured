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
 *         &lt;element name="Year" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EligibleDays" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="ScheduledDays" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="UsedDays" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element ref="{http://loyalty.macys.com/schemas/loyalty.account/LtyAccountResponse/v12_0}PADScheduledDays" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://loyalty.macys.com/schemas/loyalty.account/LtyAccountResponse/v12_0}PADOffer" maxOccurs="unbounded" minOccurs="0"/>
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
    "year",
    "eligibleDays",
    "scheduledDays",
    "usedDays",
    "padScheduledDays",
    "padOffer"
})
@XmlRootElement(name = "PADAvailability")
public class PADAvailability {

    @XmlElement(name = "Year")
    protected int year;
    @XmlElement(name = "EligibleDays")
    protected short eligibleDays;
    @XmlElement(name = "ScheduledDays")
    protected short scheduledDays;
    @XmlElement(name = "UsedDays")
    protected short usedDays;
    @XmlElement(name = "PADScheduledDays")
    protected List<PADScheduledDays> padScheduledDays;
    @XmlElement(name = "PADOffer")
    protected List<PADOffer> padOffer;

    /**
     * Gets the value of the year property.
     * 
     */
    public int getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     */
    public void setYear(int value) {
        this.year = value;
    }

    /**
     * Gets the value of the eligibleDays property.
     * 
     */
    public short getEligibleDays() {
        return eligibleDays;
    }

    /**
     * Sets the value of the eligibleDays property.
     * 
     */
    public void setEligibleDays(short value) {
        this.eligibleDays = value;
    }

    /**
     * Gets the value of the scheduledDays property.
     * 
     */
    public short getScheduledDays() {
        return scheduledDays;
    }

    /**
     * Sets the value of the scheduledDays property.
     * 
     */
    public void setScheduledDays(short value) {
        this.scheduledDays = value;
    }

    /**
     * Gets the value of the usedDays property.
     * 
     */
    public short getUsedDays() {
        return usedDays;
    }

    /**
     * Sets the value of the usedDays property.
     * 
     */
    public void setUsedDays(short value) {
        this.usedDays = value;
    }

    /**
     * Gets the value of the padScheduledDays property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the padScheduledDays property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPADScheduledDays().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PADScheduledDays }
     * 
     * 
     */
    public List<PADScheduledDays> getPADScheduledDays() {
        if (padScheduledDays == null) {
            padScheduledDays = new ArrayList<PADScheduledDays>();
        }
        return this.padScheduledDays;
    }

    /**
     * Gets the value of the padOffer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the padOffer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPADOffer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PADOffer }
     * 
     * 
     */
    public List<PADOffer> getPADOffer() {
        if (padOffer == null) {
            padOffer = new ArrayList<PADOffer>();
        }
        return this.padOffer;
    }

}