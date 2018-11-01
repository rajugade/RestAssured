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
 *         &lt;element ref="{http://loyalty.macys.com/schemas/loyalty.common/LtyCommon/v12_0}Division"/>
 *         &lt;element ref="{http://loyalty.macys.com/schemas/loyalty.common/LtyCommon/v12_0}SourceApp"/>
 *         &lt;element name="DeviceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeviceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeviceChannel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://loyalty.macys.com/schemas/loyalty.common/LtyCommon/v12_0}Stt" minOccurs="0"/>
 *         &lt;element name="ReservationNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element ref="{http://loyalty.macys.com/schemas/loyalty.common/LtyCommon/v12_0}AssociateId" minOccurs="0"/>
 *         &lt;element ref="{http://loyalty.macys.com/schemas/loyalty.common/LtyCommon/v12_0}LTYVersion"/>
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
    "division",
    "sourceApp",
    "deviceId",
    "deviceType",
    "deviceChannel",
    "stt",
    "reservationNumber",
    "associateId",
    "ltyVersion"
})
@XmlRootElement(name = "CommunicationHeader")
public class CommunicationHeader {

    @XmlElement(name = "Division")
    protected short division;
    @XmlElement(name = "SourceApp", required = true)
    protected String sourceApp;
    @XmlElement(name = "DeviceId")
    protected String deviceId;
    @XmlElement(name = "DeviceType")
    protected String deviceType;
    @XmlElement(name = "DeviceChannel", required = true)
    protected String deviceChannel;
    @XmlElement(name = "Stt")
    protected Stt stt;
    @XmlElement(name = "ReservationNumber")
    protected Long reservationNumber;
    @XmlElement(name = "AssociateId")
    protected String associateId;
    @XmlElement(name = "LTYVersion", required = true)
    protected BigDecimal ltyVersion;

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

    /**
     * Gets the value of the sourceApp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceApp() {
        return sourceApp;
    }

    /**
     * Sets the value of the sourceApp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceApp(String value) {
        this.sourceApp = value;
    }

    /**
     * Gets the value of the deviceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * Sets the value of the deviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceId(String value) {
        this.deviceId = value;
    }

    /**
     * Gets the value of the deviceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceType() {
        return deviceType;
    }

    /**
     * Sets the value of the deviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceType(String value) {
        this.deviceType = value;
    }

    /**
     * Gets the value of the deviceChannel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceChannel() {
        return deviceChannel;
    }

    /**
     * Sets the value of the deviceChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceChannel(String value) {
        this.deviceChannel = value;
    }

    /**
     * Gets the value of the stt property.
     * 
     * @return
     *     possible object is
     *     {@link Stt }
     *     
     */
    public Stt getStt() {
        return stt;
    }

    /**
     * Sets the value of the stt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Stt }
     *     
     */
    public void setStt(Stt value) {
        this.stt = value;
    }

    /**
     * Gets the value of the reservationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReservationNumber() {
        return reservationNumber;
    }

    /**
     * Sets the value of the reservationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReservationNumber(Long value) {
        this.reservationNumber = value;
    }

    /**
     * Gets the value of the associateId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssociateId() {
        return associateId;
    }

    /**
     * Sets the value of the associateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssociateId(String value) {
        this.associateId = value;
    }

    /**
     * Gets the value of the ltyVersion property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLTYVersion() {
        return ltyVersion;
    }

    /**
     * Sets the value of the ltyVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLTYVersion(BigDecimal value) {
        this.ltyVersion = value;
    }

}