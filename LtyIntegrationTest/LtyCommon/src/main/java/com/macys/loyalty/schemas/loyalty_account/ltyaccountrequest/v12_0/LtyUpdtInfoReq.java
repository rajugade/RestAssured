//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.10.04 at 05:36:04 PM IST 
//


package com.macys.loyalty.schemas.loyalty_account.ltyaccountrequest.v12_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.macys.loyalty.schemas.loyalty_common.ltycommon.v12_0.AccountIdentifier;
import com.macys.loyalty.schemas.loyalty_common.ltycommon.v12_0.AwardCard;
import com.macys.loyalty.schemas.loyalty_common.ltycommon.v12_0.CommunicationHeader;
import com.macys.loyalty.schemas.loyalty_common.ltycommon.v12_0.Stt;


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
 *         &lt;element ref="{http://loyalty.macys.com/schemas/loyalty.common/LtyCommon/v12_0}CustomerIdentifier"/>
 *         &lt;element name="AwardInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://loyalty.macys.com/schemas/loyalty.account/LtyAccountRequest/v12_0}AwardCard"/>
 *                   &lt;element ref="{http://loyalty.macys.com/schemas/loyalty.account/LtyAccountRequest/v12_0}MediaDate" minOccurs="0"/>
 *                   &lt;element ref="{http://loyalty.macys.com/schemas/loyalty.common/LtyCommon/v12_0}Stt"/>
 *                   &lt;element ref="{http://loyalty.macys.com/schemas/loyalty.account/LtyAccountRequest/v12_0}SttTime"/>
 *                   &lt;element ref="{http://loyalty.macys.com/schemas/loyalty.account/LtyAccountRequest/v12_0}ReqOrigin" minOccurs="0"/>
 *                   &lt;element ref="{http://loyalty.macys.com/schemas/loyalty.common/LtyCommon/v12_0}StateCd"/>
 *                   &lt;element ref="{http://loyalty.macys.com/schemas/loyalty.account/LtyAccountRequest/v12_0}ReqOffer" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PADInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RequestType">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="ADD"/>
 *                         &lt;enumeration value="REMOVE"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="OfferInfo" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="OfferCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="RequestedDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "customerIdentifier",
    "awardInfo",
    "padInfo"
})
@XmlRootElement(name = "LtyUpdtInfoReq")
public class LtyUpdtInfoReq {

    @XmlElement(name = "CommunicationHeader", namespace = "http://loyalty.macys.com/schemas/loyalty.common/LtyCommon/v12_0", required = true)
    protected CommunicationHeader communicationHeader;
    @XmlElement(name = "CustomerIdentifier", namespace = "http://loyalty.macys.com/schemas/loyalty.common/LtyCommon/v12_0", required = true)
    protected AccountIdentifier customerIdentifier;
    @XmlElement(name = "AwardInfo")
    protected LtyUpdtInfoReq.AwardInfo awardInfo;
    @XmlElement(name = "PADInfo")
    protected LtyUpdtInfoReq.PADInfo padInfo;

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
     * Gets the value of the awardInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LtyUpdtInfoReq.AwardInfo }
     *     
     */
    public LtyUpdtInfoReq.AwardInfo getAwardInfo() {
        return awardInfo;
    }

    /**
     * Sets the value of the awardInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LtyUpdtInfoReq.AwardInfo }
     *     
     */
    public void setAwardInfo(LtyUpdtInfoReq.AwardInfo value) {
        this.awardInfo = value;
    }

    /**
     * Gets the value of the padInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LtyUpdtInfoReq.PADInfo }
     *     
     */
    public LtyUpdtInfoReq.PADInfo getPADInfo() {
        return padInfo;
    }

    /**
     * Sets the value of the padInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LtyUpdtInfoReq.PADInfo }
     *     
     */
    public void setPADInfo(LtyUpdtInfoReq.PADInfo value) {
        this.padInfo = value;
    }


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
     *         &lt;element ref="{http://loyalty.macys.com/schemas/loyalty.account/LtyAccountRequest/v12_0}AwardCard"/>
     *         &lt;element ref="{http://loyalty.macys.com/schemas/loyalty.account/LtyAccountRequest/v12_0}MediaDate" minOccurs="0"/>
     *         &lt;element ref="{http://loyalty.macys.com/schemas/loyalty.common/LtyCommon/v12_0}Stt"/>
     *         &lt;element ref="{http://loyalty.macys.com/schemas/loyalty.account/LtyAccountRequest/v12_0}SttTime"/>
     *         &lt;element ref="{http://loyalty.macys.com/schemas/loyalty.account/LtyAccountRequest/v12_0}ReqOrigin" minOccurs="0"/>
     *         &lt;element ref="{http://loyalty.macys.com/schemas/loyalty.common/LtyCommon/v12_0}StateCd"/>
     *         &lt;element ref="{http://loyalty.macys.com/schemas/loyalty.account/LtyAccountRequest/v12_0}ReqOffer" minOccurs="0"/>
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
        "awardCard",
        "mediaDate",
        "stt",
        "sttTime",
        "reqOrigin",
        "stateCd",
        "reqOffer"
    })
    public static class AwardInfo {

        @XmlElement(name = "AwardCard", required = true)
        protected AwardCard awardCard;
        @XmlElement(name = "MediaDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar mediaDate;
        @XmlElement(name = "Stt", namespace = "http://loyalty.macys.com/schemas/loyalty.common/LtyCommon/v12_0", required = true)
        protected Stt stt;
        @XmlElement(name = "SttTime", required = true)
        @XmlSchemaType(name = "time")
        protected XMLGregorianCalendar sttTime;
        @XmlElement(name = "ReqOrigin")
        protected String reqOrigin;
        @XmlElement(name = "StateCd", namespace = "http://loyalty.macys.com/schemas/loyalty.common/LtyCommon/v12_0", required = true)
        protected String stateCd;
        @XmlElement(name = "ReqOffer")
        protected Long reqOffer;

        /**
         * Gets the value of the awardCard property.
         * 
         * @return
         *     possible object is
         *     {@link AwardCard }
         *     
         */
        public AwardCard getAwardCard() {
            return awardCard;
        }

        /**
         * Sets the value of the awardCard property.
         * 
         * @param value
         *     allowed object is
         *     {@link AwardCard }
         *     
         */
        public void setAwardCard(AwardCard value) {
            this.awardCard = value;
        }

        /**
         * Gets the value of the mediaDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getMediaDate() {
            return mediaDate;
        }

        /**
         * Sets the value of the mediaDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setMediaDate(XMLGregorianCalendar value) {
            this.mediaDate = value;
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
         * Gets the value of the sttTime property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getSttTime() {
            return sttTime;
        }

        /**
         * Sets the value of the sttTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setSttTime(XMLGregorianCalendar value) {
            this.sttTime = value;
        }

        /**
         * Gets the value of the reqOrigin property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReqOrigin() {
            return reqOrigin;
        }

        /**
         * Sets the value of the reqOrigin property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReqOrigin(String value) {
            this.reqOrigin = value;
        }

        /**
         * StateCd: The state of province of the Loyalty Customer
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStateCd() {
            return stateCd;
        }

        /**
         * Sets the value of the stateCd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStateCd(String value) {
            this.stateCd = value;
        }

        /**
         * Gets the value of the reqOffer property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getReqOffer() {
            return reqOffer;
        }

        /**
         * Sets the value of the reqOffer property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setReqOffer(Long value) {
            this.reqOffer = value;
        }

    }


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
     *         &lt;element name="RequestType">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="ADD"/>
     *               &lt;enumeration value="REMOVE"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="OfferInfo" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="OfferCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="RequestedDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "requestType",
        "offerInfo"
    })
    public static class PADInfo {

        @XmlElement(name = "RequestType", required = true)
        protected String requestType;
        @XmlElement(name = "OfferInfo")
        protected List<LtyUpdtInfoReq.PADInfo.OfferInfo> offerInfo;

        /**
         * Gets the value of the requestType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRequestType() {
            return requestType;
        }

        /**
         * Sets the value of the requestType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRequestType(String value) {
            this.requestType = value;
        }

        /**
         * Gets the value of the offerInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the offerInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOfferInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LtyUpdtInfoReq.PADInfo.OfferInfo }
         * 
         * 
         */
        public List<LtyUpdtInfoReq.PADInfo.OfferInfo> getOfferInfo() {
            if (offerInfo == null) {
                offerInfo = new ArrayList<LtyUpdtInfoReq.PADInfo.OfferInfo>();
            }
            return this.offerInfo;
        }


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
         *         &lt;element name="OfferCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="RequestedDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
            "offerCode",
            "requestedDate"
        })
        public static class OfferInfo {

            @XmlElement(name = "OfferCode", required = true)
            protected String offerCode;
            @XmlElement(name = "RequestedDate", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar requestedDate;

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

            /**
             * Gets the value of the requestedDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getRequestedDate() {
                return requestedDate;
            }

            /**
             * Sets the value of the requestedDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setRequestedDate(XMLGregorianCalendar value) {
                this.requestedDate = value;
            }

        }

    }

}