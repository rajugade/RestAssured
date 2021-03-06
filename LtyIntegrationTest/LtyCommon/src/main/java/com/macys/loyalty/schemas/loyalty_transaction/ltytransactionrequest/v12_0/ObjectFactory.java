//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.10.10 at 04:53:00 PM IST 
//


package com.macys.loyalty.schemas.loyalty_transaction.ltytransactionrequest.v12_0;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import com.macys.loyalty.schemas.loyalty_common.ltycommon.v12_0.Advisory;
import com.macys.loyalty.schemas.loyalty_common.ltycommon.v12_0.LineItem;
import com.macys.loyalty.schemas.loyalty_common.ltycommon.v12_0.RewardAdjustment;
import com.macys.loyalty.schemas.loyalty_common.ltycommon.v12_0.Stt;
import com.macys.loyalty.schemas.loyalty_common.ltycommon.v12_0.Tender;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.macys.loyalty.schemas.loyalty_transaction.ltytransactionrequest.v12_0 package. 
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

    private final static QName _LineItem_QNAME = new QName("http://loyalty.macys.com/schemas/loyalty.transaction/LtyTransactionRequest/v12_0", "LineItem");
    private final static QName _Tender_QNAME = new QName("http://loyalty.macys.com/schemas/loyalty.transaction/LtyTransactionRequest/v12_0", "Tender");
    private final static QName _PostVoidSttInfo_QNAME = new QName("http://loyalty.macys.com/schemas/loyalty.transaction/LtyTransactionRequest/v12_0", "PostVoidSttInfo");
    private final static QName _Advisory_QNAME = new QName("http://loyalty.macys.com/schemas/loyalty.transaction/LtyTransactionRequest/v12_0", "Advisory");
    private final static QName _OrderTimestamp_QNAME = new QName("http://loyalty.macys.com/schemas/loyalty.transaction/LtyTransactionRequest/v12_0", "OrderTimestamp");
    private final static QName _SttDate_QNAME = new QName("http://loyalty.macys.com/schemas/loyalty.transaction/LtyTransactionRequest/v12_0", "SttDate");
    private final static QName _SttInfo_QNAME = new QName("http://loyalty.macys.com/schemas/loyalty.transaction/LtyTransactionRequest/v12_0", "SttInfo");
    private final static QName _ProcessTimestamp_QNAME = new QName("http://loyalty.macys.com/schemas/loyalty.transaction/LtyTransactionRequest/v12_0", "ProcessTimestamp");
    private final static QName _OfflineRetryFlag_QNAME = new QName("http://loyalty.macys.com/schemas/loyalty.transaction/LtyTransactionRequest/v12_0", "OfflineRetryFlag");
    private final static QName _RewardAdjustment_QNAME = new QName("http://loyalty.macys.com/schemas/loyalty.transaction/LtyTransactionRequest/v12_0", "RewardAdjustment");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.macys.loyalty.schemas.loyalty_transaction.ltytransactionrequest.v12_0
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Program }
     * 
     */
    public Program createProgram() {
        return new Program();
    }

    /**
     * Create an instance of {@link Adjustment }
     * 
     */
    public Adjustment createAdjustment() {
        return new Adjustment();
    }

    /**
     * Create an instance of {@link AwardAdjustment }
     * 
     */
    public AwardAdjustment createAwardAdjustment() {
        return new AwardAdjustment();
    }

    /**
     * Create an instance of {@link ChargeLineItem }
     * 
     */
    public ChargeLineItem createChargeLineItem() {
        return new ChargeLineItem();
    }

    /**
     * Create an instance of {@link TransactionHeader }
     * 
     */
    public TransactionHeader createTransactionHeader() {
        return new TransactionHeader();
    }

    /**
     * Create an instance of {@link LtyTransactionReq }
     * 
     */
    public LtyTransactionReq createLtyTransactionReq() {
        return new LtyTransactionReq();
    }

    /**
     * Create an instance of {@link IcmRdsTransactionReq }
     * 
     */
    public IcmRdsTransactionReq createIcmRdsTransactionReq() {
        return new IcmRdsTransactionReq();
    }

    /**
     * Create an instance of {@link LtyCustServiceRewardReq }
     * 
     */
    public LtyCustServiceRewardReq createLtyCustServiceRewardReq() {
        return new LtyCustServiceRewardReq();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loyalty.macys.com/schemas/loyalty.transaction/LtyTransactionRequest/v12_0", name = "LineItem")
    public JAXBElement<LineItem> createLineItem(LineItem value) {
        return new JAXBElement<LineItem>(_LineItem_QNAME, LineItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tender }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loyalty.macys.com/schemas/loyalty.transaction/LtyTransactionRequest/v12_0", name = "Tender")
    public JAXBElement<Tender> createTender(Tender value) {
        return new JAXBElement<Tender>(_Tender_QNAME, Tender.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Stt }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loyalty.macys.com/schemas/loyalty.transaction/LtyTransactionRequest/v12_0", name = "PostVoidSttInfo")
    public JAXBElement<Stt> createPostVoidSttInfo(Stt value) {
        return new JAXBElement<Stt>(_PostVoidSttInfo_QNAME, Stt.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Advisory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loyalty.macys.com/schemas/loyalty.transaction/LtyTransactionRequest/v12_0", name = "Advisory")
    public JAXBElement<Advisory> createAdvisory(Advisory value) {
        return new JAXBElement<Advisory>(_Advisory_QNAME, Advisory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loyalty.macys.com/schemas/loyalty.transaction/LtyTransactionRequest/v12_0", name = "OrderTimestamp")
    public JAXBElement<XMLGregorianCalendar> createOrderTimestamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OrderTimestamp_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loyalty.macys.com/schemas/loyalty.transaction/LtyTransactionRequest/v12_0", name = "SttDate")
    public JAXBElement<XMLGregorianCalendar> createSttDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SttDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Stt }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loyalty.macys.com/schemas/loyalty.transaction/LtyTransactionRequest/v12_0", name = "SttInfo")
    public JAXBElement<Stt> createSttInfo(Stt value) {
        return new JAXBElement<Stt>(_SttInfo_QNAME, Stt.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loyalty.macys.com/schemas/loyalty.transaction/LtyTransactionRequest/v12_0", name = "ProcessTimestamp")
    public JAXBElement<XMLGregorianCalendar> createProcessTimestamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProcessTimestamp_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loyalty.macys.com/schemas/loyalty.transaction/LtyTransactionRequest/v12_0", name = "OfflineRetryFlag")
    public JAXBElement<Boolean> createOfflineRetryFlag(Boolean value) {
        return new JAXBElement<Boolean>(_OfflineRetryFlag_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RewardAdjustment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loyalty.macys.com/schemas/loyalty.transaction/LtyTransactionRequest/v12_0", name = "RewardAdjustment")
    public JAXBElement<RewardAdjustment> createRewardAdjustment(RewardAdjustment value) {
        return new JAXBElement<RewardAdjustment>(_RewardAdjustment_QNAME, RewardAdjustment.class, null, value);
    }

}
