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
 *         &lt;element ref="{http://loyalty.macys.com/schemas/loyalty.common/LtyCommon/v12_0}CustomerIdentifier"/>
 *         &lt;element ref="{http://loyalty.macys.com/schemas/loyalty.common/LtyCommon/v12_0}TierCode"/>
 *         &lt;element ref="{http://loyalty.macys.com/schemas/loyalty.account/LtyAccountResponse/v12_0}PADAvailability" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://loyalty.macys.com/schemas/loyalty.common/LtyCommon/v12_0}Division"/>
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
    "tierCode",
    "padAvailability",
    "division"
})
@XmlRootElement(name = "LtyPADLookupResp")
public class LtyPADLookupResp {

    @XmlElement(name = "CustomerIdentifier", namespace = "http://loyalty.macys.com/schemas/loyalty.common/LtyCommon/v12_0", required = true)
    protected AccountIdentifier customerIdentifier;
    @XmlElement(name = "TierCode", namespace = "http://loyalty.macys.com/schemas/loyalty.common/LtyCommon/v12_0", required = true)
    protected String tierCode;
    @XmlElement(name = "PADAvailability")
    protected List<PADAvailability> padAvailability;
    @XmlElement(name = "Division", namespace = "http://loyalty.macys.com/schemas/loyalty.common/LtyCommon/v12_0")
    protected short division;

    /**
     * Gets the value of the customerIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentifier }
     *     
     */
    public AccountIdentifier getCustomerIdentifier() {
        return customerIdentifier;
    }

    /**
     * Sets the value of the customerIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentifier }
     *     
     */
    public void setCustomerIdentifier(AccountIdentifier value) {
        this.customerIdentifier = value;
    }

    /**
     * TierCode: The tier of the Loyalty Customer. Bloomingdale: BLMT001, BLMT002, BLMT003.  Macys: PREMIER_ELITE, ELITE, PREFFERED
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTierCode() {
        return tierCode;
    }

    /**
     * Sets the value of the tierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTierCode(String value) {
        this.tierCode = value;
    }

    /**
     * Gets the value of the padAvailability property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the padAvailability property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPADAvailability().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PADAvailability }
     * 
     * 
     */
    public List<PADAvailability> getPADAvailability() {
        if (padAvailability == null) {
            padAvailability = new ArrayList<PADAvailability>();
        }
        return this.padAvailability;
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

}
