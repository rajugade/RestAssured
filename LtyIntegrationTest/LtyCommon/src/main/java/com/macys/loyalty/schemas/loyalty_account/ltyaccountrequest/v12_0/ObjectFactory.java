//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.10.04 at 05:36:04 PM IST 
//


package com.macys.loyalty.schemas.loyalty_account.ltyaccountrequest.v12_0;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import com.macys.loyalty.schemas.loyalty_common.ltycommon.v12_0.AwardCard;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.macys.loyalty.schemas.loyalty_account.ltyaccountrequest.v12_0 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SttTime_QNAME = new QName("http://loyalty.macys.com/schemas/loyalty.account/LtyAccountRequest/v12_0", "SttTime");
    private final static QName _StoreSpecificReq_QNAME = new QName("http://loyalty.macys.com/schemas/loyalty.account/LtyAccountRequest/v12_0", "StoreSpecificReq");
    private final static QName _AwardCard_QNAME = new QName("http://loyalty.macys.com/schemas/loyalty.account/LtyAccountRequest/v12_0", "AwardCard");
    private final static QName _ReqOrigin_QNAME = new QName("http://loyalty.macys.com/schemas/loyalty.account/LtyAccountRequest/v12_0", "ReqOrigin");
    private final static QName _ReqOffer_QNAME = new QName("http://loyalty.macys.com/schemas/loyalty.account/LtyAccountRequest/v12_0", "ReqOffer");
    private final static QName _OfferCode_QNAME = new QName("http://loyalty.macys.com/schemas/loyalty.account/LtyAccountRequest/v12_0", "OfferCode");
    private final static QName _ExpirationDate_QNAME = new QName("http://loyalty.macys.com/schemas/loyalty.account/LtyAccountRequest/v12_0", "ExpirationDate");
    private final static QName _MediaDate_QNAME = new QName("http://loyalty.macys.com/schemas/loyalty.account/LtyAccountRequest/v12_0", "MediaDate");
    private final static QName _TransactionKey_QNAME = new QName("http://loyalty.macys.com/schemas/loyalty.account/LtyAccountRequest/v12_0", "TransactionKey");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.macys.loyalty.schemas.loyalty_account.ltyaccountrequest.v12_0
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LtyUpdtInfoReq }
     * 
     */
    public LtyUpdtInfoReq createLtyUpdtInfoReq() {
        return new LtyUpdtInfoReq();
    }

    /**
     * Create an instance of {@link LtyLookupTransactionReq }
     * 
     */
    public LtyLookupTransactionReq createLtyLookupTransactionReq() {
        return new LtyLookupTransactionReq();
    }

    /**
     * Create an instance of {@link LtyUpdtInfoReq.PADInfo }
     * 
     */
    public LtyUpdtInfoReq.PADInfo createLtyUpdtInfoReqPADInfo() {
        return new LtyUpdtInfoReq.PADInfo();
    }

    /**
     * Create an instance of {@link LtyLookupOfferListReq }
     * 
     */
    public LtyLookupOfferListReq createLtyLookupOfferListReq() {
        return new LtyLookupOfferListReq();
    }

    /**
     * Create an instance of {@link LtyPADLookupReq }
     * 
     */
    public LtyPADLookupReq createLtyPADLookupReq() {
        return new LtyPADLookupReq();
    }

    /**
     * Create an instance of {@link LtyProgramStatusUpdateReq }
     * 
     */
    public LtyProgramStatusUpdateReq createLtyProgramStatusUpdateReq() {
        return new LtyProgramStatusUpdateReq();
    }

    /**
     * Create an instance of {@link CustomerInfo }
     * 
     */
    public CustomerInfo createCustomerInfo() {
        return new CustomerInfo();
    }

    /**
     * Create an instance of {@link ProgramStatusUpdate }
     * 
     */
    public ProgramStatusUpdate createProgramStatusUpdate() {
        return new ProgramStatusUpdate();
    }

    /**
     * Create an instance of {@link LtyLookupProgramOverrideReq }
     * 
     */
    public LtyLookupProgramOverrideReq createLtyLookupProgramOverrideReq() {
        return new LtyLookupProgramOverrideReq();
    }

    /**
     * Create an instance of {@link LtyLookupLoyaltyCusInfoReq }
     * 
     */
    public LtyLookupLoyaltyCusInfoReq createLtyLookupLoyaltyCusInfoReq() {
        return new LtyLookupLoyaltyCusInfoReq();
    }

    /**
     * Create an instance of {@link LtyLookupOfferInfoReq }
     * 
     */
    public LtyLookupOfferInfoReq createLtyLookupOfferInfoReq() {
        return new LtyLookupOfferInfoReq();
    }

    /**
     * Create an instance of {@link LtyUpdtInfoReq.AwardInfo }
     * 
     */
    public LtyUpdtInfoReq.AwardInfo createLtyUpdtInfoReqAwardInfo() {
        return new LtyUpdtInfoReq.AwardInfo();
    }

    /**
     * Create an instance of {@link LtyLookupLoyaltyDetailReq }
     * 
     */
    public LtyLookupLoyaltyDetailReq createLtyLookupLoyaltyDetailReq() {
        return new LtyLookupLoyaltyDetailReq();
    }

    /**
     * Create an instance of {@link LtyLookupLoyaltySummaryReq }
     * 
     */
    public LtyLookupLoyaltySummaryReq createLtyLookupLoyaltySummaryReq() {
        return new LtyLookupLoyaltySummaryReq();
    }

    /**
     * Create an instance of {@link LtyLookupTransactionReq.TransactionIdentifier }
     * 
     */
    public LtyLookupTransactionReq.TransactionIdentifier createLtyLookupTransactionReqTransactionIdentifier() {
        return new LtyLookupTransactionReq.TransactionIdentifier();
    }

    /**
     * Create an instance of {@link LtyUpdtInfoReq.PADInfo.OfferInfo }
     * 
     */
    public LtyUpdtInfoReq.PADInfo.OfferInfo createLtyUpdtInfoReqPADInfoOfferInfo() {
        return new LtyUpdtInfoReq.PADInfo.OfferInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loyalty.macys.com/schemas/loyalty.account/LtyAccountRequest/v12_0", name = "SttTime")
    public JAXBElement<XMLGregorianCalendar> createSttTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SttTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loyalty.macys.com/schemas/loyalty.account/LtyAccountRequest/v12_0", name = "StoreSpecificReq")
    public JAXBElement<Boolean> createStoreSpecificReq(Boolean value) {
        return new JAXBElement<Boolean>(_StoreSpecificReq_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AwardCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loyalty.macys.com/schemas/loyalty.account/LtyAccountRequest/v12_0", name = "AwardCard")
    public JAXBElement<AwardCard> createAwardCard(AwardCard value) {
        return new JAXBElement<AwardCard>(_AwardCard_QNAME, AwardCard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loyalty.macys.com/schemas/loyalty.account/LtyAccountRequest/v12_0", name = "ReqOrigin")
    public JAXBElement<String> createReqOrigin(String value) {
        return new JAXBElement<String>(_ReqOrigin_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loyalty.macys.com/schemas/loyalty.account/LtyAccountRequest/v12_0", name = "ReqOffer")
    public JAXBElement<Long> createReqOffer(Long value) {
        return new JAXBElement<Long>(_ReqOffer_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loyalty.macys.com/schemas/loyalty.account/LtyAccountRequest/v12_0", name = "OfferCode")
    public JAXBElement<String> createOfferCode(String value) {
        return new JAXBElement<String>(_OfferCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loyalty.macys.com/schemas/loyalty.account/LtyAccountRequest/v12_0", name = "ExpirationDate")
    public JAXBElement<String> createExpirationDate(String value) {
        return new JAXBElement<String>(_ExpirationDate_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loyalty.macys.com/schemas/loyalty.account/LtyAccountRequest/v12_0", name = "MediaDate")
    public JAXBElement<XMLGregorianCalendar> createMediaDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MediaDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loyalty.macys.com/schemas/loyalty.account/LtyAccountRequest/v12_0", name = "TransactionKey")
    public JAXBElement<Long> createTransactionKey(Long value) {
        return new JAXBElement<Long>(_TransactionKey_QNAME, Long.class, null, value);
    }

}