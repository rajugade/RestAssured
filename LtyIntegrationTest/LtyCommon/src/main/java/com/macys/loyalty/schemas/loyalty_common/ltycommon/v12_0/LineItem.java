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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.macys.loyalty.schemas.loyalty_account.ltyaccountresponse.v12_0.TransactionLine;


/**
 * <p>Java class for LineItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LineItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SeqNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ItemOperationType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OriginalSeqNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element ref="{http://loyalty.macys.com/schemas/loyalty.common/LtyCommon/v12_0}Division"/>
 *         &lt;element name="RdsSku" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UPC" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CRL" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element ref="{http://loyalty.macys.com/schemas/loyalty.common/LtyCommon/v12_0}Dept" minOccurs="0"/>
 *         &lt;element ref="{http://loyalty.macys.com/schemas/loyalty.common/LtyCommon/v12_0}Class" minOccurs="0"/>
 *         &lt;element ref="{http://loyalty.macys.com/schemas/loyalty.common/LtyCommon/v12_0}Vendor" minOccurs="0"/>
 *         &lt;element ref="{http://loyalty.macys.com/schemas/loyalty.common/LtyCommon/v12_0}MarkStyle" minOccurs="0"/>
 *         &lt;element name="PriceStatus" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;enumeration value="0"/>
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="2"/>
 *               &lt;enumeration value="3"/>
 *               &lt;enumeration value="4"/>
 *               &lt;enumeration value="5"/>
 *               &lt;enumeration value="6"/>
 *               &lt;enumeration value="7"/>
 *               &lt;enumeration value="10"/>
 *               &lt;enumeration value="11"/>
 *               &lt;enumeration value="12"/>
 *               &lt;enumeration value="13"/>
 *               &lt;enumeration value="14"/>
 *               &lt;enumeration value="15"/>
 *               &lt;enumeration value="16"/>
 *               &lt;enumeration value="17"/>
 *               &lt;enumeration value="18"/>
 *               &lt;enumeration value="50"/>
 *               &lt;enumeration value="90"/>
 *               &lt;enumeration value="95"/>
 *               &lt;enumeration value="99"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OriginalRetailPrice">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="14"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PriceSold">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="14"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ItemDesc" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="25"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RegistryNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://loyalty.macys.com/schemas/loyalty.common/LtyCommon/v12_0}ShipmentNum" minOccurs="0"/>
 *         &lt;element name="IsBackOrder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OriginalSttInfo" type="{http://loyalty.macys.com/schemas/loyalty.common/LtyCommon/v12_0}Stt" minOccurs="0"/>
 *         &lt;element name="OrigReservationNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineItem", propOrder = {
    "seqNum",
    "itemOperationType",
    "originalSeqNum",
    "division",
    "rdsSku",
    "upc",
    "crl",
    "dept",
    "clazz",
    "vendor",
    "markStyle",
    "priceStatus",
    "originalRetailPrice",
    "priceSold",
    "quantity",
    "itemDesc",
    "registryNum",
    "shipmentNum",
    "isBackOrder",
    "originalSttInfo",
    "origReservationNum"
})
@XmlSeeAlso({
    TransactionLine.class
})
public class LineItem {

    @XmlElement(name = "SeqNum")
    protected int seqNum;
    @XmlElement(name = "ItemOperationType", required = true)
    protected String itemOperationType;
    @XmlElement(name = "OriginalSeqNum")
    protected Integer originalSeqNum;
    @XmlElement(name = "Division")
    protected short division;
    @XmlElement(name = "RdsSku")
    protected Integer rdsSku;
    @XmlElement(name = "UPC")
    protected Long upc;
    @XmlElement(name = "CRL")
    protected Long crl;
    @XmlElement(name = "Dept")
    protected Short dept;
    @XmlElement(name = "Class")
    protected Short clazz;
    @XmlElement(name = "Vendor")
    protected Short vendor;
    @XmlElement(name = "MarkStyle")
    protected Integer markStyle;
    @XmlElement(name = "PriceStatus")
    protected Short priceStatus;
    @XmlElement(name = "OriginalRetailPrice", required = true)
    protected BigDecimal originalRetailPrice;
    @XmlElement(name = "PriceSold", required = true)
    protected BigDecimal priceSold;
    @XmlElement(name = "Quantity")
    protected int quantity;
    @XmlElement(name = "ItemDesc")
    protected String itemDesc;
    @XmlElement(name = "RegistryNum")
    protected String registryNum;
    @XmlElement(name = "ShipmentNum")
    protected Integer shipmentNum;
    @XmlElement(name = "IsBackOrder")
    protected Boolean isBackOrder;
    @XmlElement(name = "OriginalSttInfo")
    protected Stt originalSttInfo;
    @XmlElement(name = "OrigReservationNum")
    protected Long origReservationNum;

    /**
     * Gets the value of the seqNum property.
     * 
     */
    public int getSeqNum() {
        return seqNum;
    }

    /**
     * Sets the value of the seqNum property.
     * 
     */
    public void setSeqNum(int value) {
        this.seqNum = value;
    }

    /**
     * Gets the value of the itemOperationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemOperationType() {
        return itemOperationType;
    }

    /**
     * Sets the value of the itemOperationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemOperationType(String value) {
        this.itemOperationType = value;
    }

    /**
     * Gets the value of the originalSeqNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOriginalSeqNum() {
        return originalSeqNum;
    }

    /**
     * Sets the value of the originalSeqNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOriginalSeqNum(Integer value) {
        this.originalSeqNum = value;
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

    /**
     * Gets the value of the rdsSku property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRdsSku() {
        return rdsSku;
    }

    /**
     * Sets the value of the rdsSku property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRdsSku(Integer value) {
        this.rdsSku = value;
    }

    /**
     * Gets the value of the upc property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUPC() {
        return upc;
    }

    /**
     * Sets the value of the upc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUPC(Long value) {
        this.upc = value;
    }

    /**
     * Gets the value of the crl property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCRL() {
        return crl;
    }

    /**
     * Sets the value of the crl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCRL(Long value) {
        this.crl = value;
    }

    /**
     * Dept: The department code of the merchandise.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getDept() {
        return dept;
    }

    /**
     * Sets the value of the dept property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setDept(Short value) {
        this.dept = value;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setClazz(Short value) {
        this.clazz = value;
    }

    /**
     * Vendor: Vendor code for an item purchased.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getVendor() {
        return vendor;
    }

    /**
     * Sets the value of the vendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setVendor(Short value) {
        this.vendor = value;
    }

    /**
     * Markstyle: The markstyle of an item purchased.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMarkStyle() {
        return markStyle;
    }

    /**
     * Sets the value of the markStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMarkStyle(Integer value) {
        this.markStyle = value;
    }

    /**
     * Gets the value of the priceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getPriceStatus() {
        return priceStatus;
    }

    /**
     * Sets the value of the priceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setPriceStatus(Short value) {
        this.priceStatus = value;
    }

    /**
     * Gets the value of the originalRetailPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOriginalRetailPrice() {
        return originalRetailPrice;
    }

    /**
     * Sets the value of the originalRetailPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOriginalRetailPrice(BigDecimal value) {
        this.originalRetailPrice = value;
    }

    /**
     * Gets the value of the priceSold property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriceSold() {
        return priceSold;
    }

    /**
     * Sets the value of the priceSold property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriceSold(BigDecimal value) {
        this.priceSold = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     */
    public void setQuantity(int value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the itemDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemDesc() {
        return itemDesc;
    }

    /**
     * Sets the value of the itemDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemDesc(String value) {
        this.itemDesc = value;
    }

    /**
     * Gets the value of the registryNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistryNum() {
        return registryNum;
    }

    /**
     * Sets the value of the registryNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistryNum(String value) {
        this.registryNum = value;
    }

    /**
     * Gets the value of the shipmentNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getShipmentNum() {
        return shipmentNum;
    }

    /**
     * Sets the value of the shipmentNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setShipmentNum(Integer value) {
        this.shipmentNum = value;
    }

    /**
     * Gets the value of the isBackOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsBackOrder() {
        return isBackOrder;
    }

    /**
     * Sets the value of the isBackOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsBackOrder(Boolean value) {
        this.isBackOrder = value;
    }

    /**
     * Gets the value of the originalSttInfo property.
     * 
     * @return
     *     possible object is
     *     {@link Stt }
     *     
     */
    public Stt getOriginalSttInfo() {
        return originalSttInfo;
    }

    /**
     * Sets the value of the originalSttInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Stt }
     *     
     */
    public void setOriginalSttInfo(Stt value) {
        this.originalSttInfo = value;
    }

    /**
     * Gets the value of the origReservationNum property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOrigReservationNum() {
        return origReservationNum;
    }

    /**
     * Sets the value of the origReservationNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOrigReservationNum(Long value) {
        this.origReservationNum = value;
    }

}