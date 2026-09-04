
package com.bayeesoft.Acservice.stub;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IntBranchParam-Modify-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="IntBranchParam-Modify-IO-Type">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BRANCH1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="BRANCH2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="DUETOBRANCH2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="DUEFROMBRANCH2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="DUETOBRANCH1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="DUEFROMBRANCH1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="CNTGLDUETOBRANCH2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="CNTGLDUEFROMBRANCH2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="CNTGLDUETOBRANCH1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="CNTGLDUEFROMBRANCH1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="DUETOBRANCH2MIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="DUEFROMBRANCH2MIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="DUETOBRANCH1MIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="DUEFROMBRANCH1MIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="TRANCCYBRN1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="TRANCCYBRN2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="MODNO" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         <element name="UDFDETAILS" type="{http://fcubs.ofss.com/service/FCUBSACService}UDFDETAILSType" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntBranchParam-Modify-IO-Type", propOrder = {
    "branch1",
    "branch2",
    "duetobranch2",
    "duefrombranch2",
    "duetobranch1",
    "duefrombranch1",
    "cntglduetobranch2",
    "cntglduefrombranch2",
    "cntglduetobranch1",
    "cntglduefrombranch1",
    "duetobranch2MIS",
    "duefrombranch2MIS",
    "duetobranch1MIS",
    "duefrombranch1MIS",
    "tranccybrn1",
    "tranccybrn2",
    "modno",
    "udfdetails"
})
public class IntBranchParamModifyIOType {

    @XmlElement(name = "BRANCH1", required = true)
    protected String branch1;
    @XmlElement(name = "BRANCH2", required = true)
    protected String branch2;
    @XmlElement(name = "DUETOBRANCH2", required = true)
    protected String duetobranch2;
    @XmlElement(name = "DUEFROMBRANCH2", required = true)
    protected String duefrombranch2;
    @XmlElement(name = "DUETOBRANCH1", required = true)
    protected String duetobranch1;
    @XmlElement(name = "DUEFROMBRANCH1", required = true)
    protected String duefrombranch1;
    @XmlElement(name = "CNTGLDUETOBRANCH2")
    protected String cntglduetobranch2;
    @XmlElement(name = "CNTGLDUEFROMBRANCH2")
    protected String cntglduefrombranch2;
    @XmlElement(name = "CNTGLDUETOBRANCH1")
    protected String cntglduetobranch1;
    @XmlElement(name = "CNTGLDUEFROMBRANCH1")
    protected String cntglduefrombranch1;
    @XmlElement(name = "DUETOBRANCH2MIS")
    protected String duetobranch2MIS;
    @XmlElement(name = "DUEFROMBRANCH2MIS")
    protected String duefrombranch2MIS;
    @XmlElement(name = "DUETOBRANCH1MIS")
    protected String duetobranch1MIS;
    @XmlElement(name = "DUEFROMBRANCH1MIS")
    protected String duefrombranch1MIS;
    @XmlElement(name = "TRANCCYBRN1", required = true)
    protected String tranccybrn1;
    @XmlElement(name = "TRANCCYBRN2")
    protected String tranccybrn2;
    @XmlElement(name = "MODNO")
    protected BigInteger modno;
    @XmlElement(name = "UDFDETAILS")
    protected List<UDFDETAILSType> udfdetails;

    /**
     * Gets the value of the branch1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBRANCH1() {
        return branch1;
    }

    /**
     * Sets the value of the branch1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBRANCH1(String value) {
        this.branch1 = value;
    }

    /**
     * Gets the value of the branch2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBRANCH2() {
        return branch2;
    }

    /**
     * Sets the value of the branch2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBRANCH2(String value) {
        this.branch2 = value;
    }

    /**
     * Gets the value of the duetobranch2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDUETOBRANCH2() {
        return duetobranch2;
    }

    /**
     * Sets the value of the duetobranch2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDUETOBRANCH2(String value) {
        this.duetobranch2 = value;
    }

    /**
     * Gets the value of the duefrombranch2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDUEFROMBRANCH2() {
        return duefrombranch2;
    }

    /**
     * Sets the value of the duefrombranch2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDUEFROMBRANCH2(String value) {
        this.duefrombranch2 = value;
    }

    /**
     * Gets the value of the duetobranch1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDUETOBRANCH1() {
        return duetobranch1;
    }

    /**
     * Sets the value of the duetobranch1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDUETOBRANCH1(String value) {
        this.duetobranch1 = value;
    }

    /**
     * Gets the value of the duefrombranch1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDUEFROMBRANCH1() {
        return duefrombranch1;
    }

    /**
     * Sets the value of the duefrombranch1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDUEFROMBRANCH1(String value) {
        this.duefrombranch1 = value;
    }

    /**
     * Gets the value of the cntglduetobranch2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNTGLDUETOBRANCH2() {
        return cntglduetobranch2;
    }

    /**
     * Sets the value of the cntglduetobranch2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNTGLDUETOBRANCH2(String value) {
        this.cntglduetobranch2 = value;
    }

    /**
     * Gets the value of the cntglduefrombranch2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNTGLDUEFROMBRANCH2() {
        return cntglduefrombranch2;
    }

    /**
     * Sets the value of the cntglduefrombranch2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNTGLDUEFROMBRANCH2(String value) {
        this.cntglduefrombranch2 = value;
    }

    /**
     * Gets the value of the cntglduetobranch1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNTGLDUETOBRANCH1() {
        return cntglduetobranch1;
    }

    /**
     * Sets the value of the cntglduetobranch1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNTGLDUETOBRANCH1(String value) {
        this.cntglduetobranch1 = value;
    }

    /**
     * Gets the value of the cntglduefrombranch1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNTGLDUEFROMBRANCH1() {
        return cntglduefrombranch1;
    }

    /**
     * Sets the value of the cntglduefrombranch1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNTGLDUEFROMBRANCH1(String value) {
        this.cntglduefrombranch1 = value;
    }

    /**
     * Gets the value of the duetobranch2MIS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDUETOBRANCH2MIS() {
        return duetobranch2MIS;
    }

    /**
     * Sets the value of the duetobranch2MIS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDUETOBRANCH2MIS(String value) {
        this.duetobranch2MIS = value;
    }

    /**
     * Gets the value of the duefrombranch2MIS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDUEFROMBRANCH2MIS() {
        return duefrombranch2MIS;
    }

    /**
     * Sets the value of the duefrombranch2MIS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDUEFROMBRANCH2MIS(String value) {
        this.duefrombranch2MIS = value;
    }

    /**
     * Gets the value of the duetobranch1MIS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDUETOBRANCH1MIS() {
        return duetobranch1MIS;
    }

    /**
     * Sets the value of the duetobranch1MIS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDUETOBRANCH1MIS(String value) {
        this.duetobranch1MIS = value;
    }

    /**
     * Gets the value of the duefrombranch1MIS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDUEFROMBRANCH1MIS() {
        return duefrombranch1MIS;
    }

    /**
     * Sets the value of the duefrombranch1MIS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDUEFROMBRANCH1MIS(String value) {
        this.duefrombranch1MIS = value;
    }

    /**
     * Gets the value of the tranccybrn1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRANCCYBRN1() {
        return tranccybrn1;
    }

    /**
     * Sets the value of the tranccybrn1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRANCCYBRN1(String value) {
        this.tranccybrn1 = value;
    }

    /**
     * Gets the value of the tranccybrn2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRANCCYBRN2() {
        return tranccybrn2;
    }

    /**
     * Sets the value of the tranccybrn2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRANCCYBRN2(String value) {
        this.tranccybrn2 = value;
    }

    /**
     * Gets the value of the modno property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMODNO() {
        return modno;
    }

    /**
     * Sets the value of the modno property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMODNO(BigInteger value) {
        this.modno = value;
    }

    /**
     * Gets the value of the udfdetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the udfdetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUDFDETAILS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UDFDETAILSType }
     * 
     * 
     * @return
     *     The value of the udfdetails property.
     */
    public List<UDFDETAILSType> getUDFDETAILS() {
        if (udfdetails == null) {
            udfdetails = new ArrayList<>();
        }
        return this.udfdetails;
    }

}
