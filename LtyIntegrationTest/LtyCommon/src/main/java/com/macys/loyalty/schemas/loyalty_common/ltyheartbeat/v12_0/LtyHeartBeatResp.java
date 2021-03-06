//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.10.04 at 05:31:17 PM IST 
//


package com.macys.loyalty.schemas.loyalty_common.ltyheartbeat.v12_0;

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
 *         &lt;element ref="{http://loyalty.macys.com/schemas/loyalty.common/LtyHeartBeat/v12_0}HeartBeatStatusAttribute" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://loyalty.macys.com/schemas/loyalty.common/LtyHeartBeat/v12_0}ResponseID"/>
 *         &lt;element ref="{http://loyalty.macys.com/schemas/loyalty.common/LtyHeartBeat/v12_0}RequestID"/>
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
    "heartBeatStatusAttribute",
    "responseID",
    "requestID"
})
@XmlRootElement(name = "LtyHeartBeatResp")
public class LtyHeartBeatResp {

    @XmlElement(name = "HeartBeatStatusAttribute")
    protected List<HeartBeatStatusAttribute> heartBeatStatusAttribute;
    @XmlElement(name = "ResponseID", required = true)
    protected String responseID;
    @XmlElement(name = "RequestID", required = true)
    protected String requestID;

    /**
     * Gets the value of the heartBeatStatusAttribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the heartBeatStatusAttribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHeartBeatStatusAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HeartBeatStatusAttribute }
     * 
     * 
     */
    public List<HeartBeatStatusAttribute> getHeartBeatStatusAttribute() {
        if (heartBeatStatusAttribute == null) {
            heartBeatStatusAttribute = new ArrayList<HeartBeatStatusAttribute>();
        }
        return this.heartBeatStatusAttribute;
    }

    /**
     * Gets the value of the responseID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseID() {
        return responseID;
    }

    /**
     * Sets the value of the responseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseID(String value) {
        this.responseID = value;
    }

    /**
     * Gets the value of the requestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestID() {
        return requestID;
    }

    /**
     * Sets the value of the requestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestID(String value) {
        this.requestID = value;
    }

}
