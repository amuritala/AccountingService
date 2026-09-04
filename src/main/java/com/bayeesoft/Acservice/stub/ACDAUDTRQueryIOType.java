
package com.bayeesoft.Acservice.stub;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ACDAUDTR-Query-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ACDAUDTR-Query-IO-Type">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BRANCH_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="CUST_AC_NO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="TRN_FROM_DT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="TRN_TO_DT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="ACTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="CHEQUENO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ACDAUDTR-Query-IO-Type", propOrder = {
    "branchcode",
    "custacno",
    "trnfromdt",
    "trntodt",
    "action",
    "chequeno"
})
public class ACDAUDTRQueryIOType {

    @XmlElement(name = "BRANCH_CODE", required = true)
    protected String branchcode;
    @XmlElement(name = "CUST_AC_NO", required = true)
    protected String custacno;
    @XmlElement(name = "TRN_FROM_DT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar trnfromdt;
    @XmlElement(name = "TRN_TO_DT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar trntodt;
    @XmlElement(name = "ACTION")
    protected String action;
    @XmlElement(name = "CHEQUENO")
    protected String chequeno;

    /**
     * Gets the value of the branchcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBRANCHCODE() {
        return branchcode;
    }

    /**
     * Sets the value of the branchcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBRANCHCODE(String value) {
        this.branchcode = value;
    }

    /**
     * Gets the value of the custacno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSTACNO() {
        return custacno;
    }

    /**
     * Sets the value of the custacno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSTACNO(String value) {
        this.custacno = value;
    }

    /**
     * Gets the value of the trnfromdt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTRNFROMDT() {
        return trnfromdt;
    }

    /**
     * Sets the value of the trnfromdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTRNFROMDT(XMLGregorianCalendar value) {
        this.trnfromdt = value;
    }

    /**
     * Gets the value of the trntodt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTRNTODT() {
        return trntodt;
    }

    /**
     * Sets the value of the trntodt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTRNTODT(XMLGregorianCalendar value) {
        this.trntodt = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACTION() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACTION(String value) {
        this.action = value;
    }

    /**
     * Gets the value of the chequeno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHEQUENO() {
        return chequeno;
    }

    /**
     * Sets the value of the chequeno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHEQUENO(String value) {
        this.chequeno = value;
    }

}
