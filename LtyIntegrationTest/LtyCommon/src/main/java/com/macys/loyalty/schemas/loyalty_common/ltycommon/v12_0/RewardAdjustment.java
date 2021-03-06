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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RewardAdjustment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RewardAdjustment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdjustmentAmount">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="14"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AdjustmentDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="AdjustmentDesc">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="25"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
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
@XmlType(name = "RewardAdjustment", propOrder = {
    "adjustmentAmount",
    "adjustmentDate",
    "adjustmentDesc"
})
public class RewardAdjustment {

    @XmlElement(name = "AdjustmentAmount", required = true)
    protected BigDecimal adjustmentAmount;
    @XmlElement(name = "AdjustmentDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar adjustmentDate;
    @XmlElement(name = "AdjustmentDesc", required = true)
    protected String adjustmentDesc;

    /**
     * Gets the value of the adjustmentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAdjustmentAmount() {
        return adjustmentAmount;
    }

    /**
     * Sets the value of the adjustmentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAdjustmentAmount(BigDecimal value) {
        this.adjustmentAmount = value;
    }

    /**
     * Gets the value of the adjustmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAdjustmentDate() {
        return adjustmentDate;
    }

    /**
     * Sets the value of the adjustmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAdjustmentDate(XMLGregorianCalendar value) {
        this.adjustmentDate = value;
    }

    /**
     * Gets the value of the adjustmentDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjustmentDesc() {
        return adjustmentDesc;
    }

    /**
     * Sets the value of the adjustmentDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjustmentDesc(String value) {
        this.adjustmentDesc = value;
    }

}
