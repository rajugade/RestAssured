//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.10.04 at 05:37:24 PM IST 
//


package com.macys.loyalty.schemas.loyalty_account.ltyaccountresponse.v12_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.macys.loyalty.schemas.loyalty_common.ltycommon.v12_0.Response;


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
 *         &lt;element ref="{http://loyalty.macys.com/schemas/loyalty.account/LtyAccountResponse/v12_0}LtyLookupOffers"/>
 *         &lt;element ref="{http://loyalty.macys.com/schemas/loyalty.account/LtyAccountResponse/v12_0}OperationResponse"/>
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
    "ltyLookupOffers",
    "operationResponse"
})
@XmlRootElement(name = "LtyLookupOfferInfoResp")
public class LtyLookupOfferInfoResp {

    @XmlElement(name = "LtyLookupOffers", required = true)
    protected LtyLookupOffers ltyLookupOffers;
    @XmlElement(name = "OperationResponse", required = true)
    protected Response operationResponse;

    /**
     * Gets the value of the ltyLookupOffers property.
     * 
     * @return
     *     possible object is
     *     {@link LtyLookupOffers }
     *     
     */
    public LtyLookupOffers getLtyLookupOffers() {
        return ltyLookupOffers;
    }

    /**
     * Sets the value of the ltyLookupOffers property.
     * 
     * @param value
     *     allowed object is
     *     {@link LtyLookupOffers }
     *     
     */
    public void setLtyLookupOffers(LtyLookupOffers value) {
        this.ltyLookupOffers = value;
    }

    /**
     * Gets the value of the operationResponse property.
     * 
     * @return
     *     possible object is
     *     {@link Response }
     *     
     */
    public Response getOperationResponse() {
        return operationResponse;
    }

    /**
     * Sets the value of the operationResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Response }
     *     
     */
    public void setOperationResponse(Response value) {
        this.operationResponse = value;
    }

}
