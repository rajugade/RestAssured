//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.10.04 at 05:36:04 PM IST 
//


package com.macys.loyalty.schemas.loyalty_account.ltyaccountrequest.v12_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
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
 *         &lt;element ref="{http://loyalty.macys.com/schemas/loyalty.account/LtyAccountRequest/v12_0}OfferCode"/>
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
    "offerCode"
})
@XmlRootElement(name = "LtyLookupOfferInfoReq")
public class LtyLookupOfferInfoReq {

    @XmlElement(name = "CommunicationHeader", namespace = "http://loyalty.macys.com/schemas/loyalty.common/LtyCommon/v12_0", required = true)
    protected CommunicationHeader communicationHeader;
    @XmlElement(name = "OfferCode", required = true)
    protected String offerCode;

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
     * Gets the value of the offerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferCode() {
        return offerCode;
    }

    /**
     * Sets the value of the offerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferCode(String value) {
        this.offerCode = value;
    }

}