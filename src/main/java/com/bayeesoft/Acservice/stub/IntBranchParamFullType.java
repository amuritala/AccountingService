
package com.bayeesoft.Acservice.stub;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IntBranchParam-Full-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="IntBranchParam-Full-Type">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BRANCH1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="BRANCHNAMEA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="BRANCH2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="BRANCHNAMEB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="DUETOBRANCH2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="GLDESCA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="DUEFROMBRANCH2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="GLDESCB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="DUETOBRANCH1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="GLDESCC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="DUEFROMBRANCH1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="GLDESCFRM1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="CNTGLDUETOBRANCH2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="CNTGLDESCA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="CNTGLDUEFROMBRANCH2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="CNTGLDESCB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="CNTGLDUETOBRANCH1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="CNTGLDESCC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="CNTGLDUEFROMBRANCH1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="CNTGLDESCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="DUETOBRANCH2MIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="GRPDESCA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="DUEFROMBRANCH2MIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="GRPDESCB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="DUETOBRANCH1MIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="GRPDESCC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="DUEFROMBRANCH1MIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="GRPDESCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="TRANCCYBRN1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="TRANCCYBRN2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="MAKERID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="MAKERDTSTAMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="CHECKERID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="CHECKERDTSTAMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="MODNO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="AUTHSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="RECSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ONCEAUTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "IntBranchParam-Full-Type", propOrder = {
    "branch1",
    "branchnamea",
    "branch2",
    "branchnameb",
    "duetobranch2",
    "gldesca",
    "duefrombranch2",
    "gldescb",
    "duetobranch1",
    "gldescc",
    "duefrombranch1",
    "gldescfrm1",
    "cntglduetobranch2",
    "cntgldesca",
    "cntglduefrombranch2",
    "cntgldescb",
    "cntglduetobranch1",
    "cntgldescc",
    "cntglduefrombranch1",
    "cntgldescd",
    "duetobranch2MIS",
    "grpdesca",
    "duefrombranch2MIS",
    "grpdescb",
    "duetobranch1MIS",
    "grpdescc",
    "duefrombranch1MIS",
    "grpdescd",
    "tranccybrn1",
    "tranccybrn2",
    "makerid",
    "makerdtstamp",
    "checkerid",
    "checkerdtstamp",
    "modno",
    "authstat",
    "recstat",
    "onceauth",
    "udfdetails"
})
public class IntBranchParamFullType {

    @XmlElement(name = "BRANCH1", required = true)
    protected String branch1;
    @XmlElement(name = "BRANCHNAMEA")
    protected String branchnamea;
    @XmlElement(name = "BRANCH2", required = true)
    protected String branch2;
    @XmlElement(name = "BRANCHNAMEB")
    protected String branchnameb;
    @XmlElement(name = "DUETOBRANCH2", required = true)
    protected String duetobranch2;
    @XmlElement(name = "GLDESCA")
    protected String gldesca;
    @XmlElement(name = "DUEFROMBRANCH2", required = true)
    protected String duefrombranch2;
    @XmlElement(name = "GLDESCB")
    protected String gldescb;
    @XmlElement(name = "DUETOBRANCH1", required = true)
    protected String duetobranch1;
    @XmlElement(name = "GLDESCC")
    protected String gldescc;
    @XmlElement(name = "DUEFROMBRANCH1", required = true)
    protected String duefrombranch1;
    @XmlElement(name = "GLDESCFRM1")
    protected String gldescfrm1;
    @XmlElement(name = "CNTGLDUETOBRANCH2")
    protected String cntglduetobranch2;
    @XmlElement(name = "CNTGLDESCA")
    protected String cntgldesca;
    @XmlElement(name = "CNTGLDUEFROMBRANCH2")
    protected String cntglduefrombranch2;
    @XmlElement(name = "CNTGLDESCB")
    protected String cntgldescb;
    @XmlElement(name = "CNTGLDUETOBRANCH1")
    protected String cntglduetobranch1;
    @XmlElement(name = "CNTGLDESCC")
    protected String cntgldescc;
    @XmlElement(name = "CNTGLDUEFROMBRANCH1")
    protected String cntglduefrombranch1;
    @XmlElement(name = "CNTGLDESCD")
    protected String cntgldescd;
    @XmlElement(name = "DUETOBRANCH2MIS")
    protected String duetobranch2MIS;
    @XmlElement(name = "GRPDESCA")
    protected String grpdesca;
    @XmlElement(name = "DUEFROMBRANCH2MIS")
    protected String duefrombranch2MIS;
    @XmlElement(name = "GRPDESCB")
    protected String grpdescb;
    @XmlElement(name = "DUETOBRANCH1MIS")
    protected String duetobranch1MIS;
    @XmlElement(name = "GRPDESCC")
    protected String grpdescc;
    @XmlElement(name = "DUEFROMBRANCH1MIS")
    protected String duefrombranch1MIS;
    @XmlElement(name = "GRPDESCD")
    protected String grpdescd;
    @XmlElement(name = "TRANCCYBRN1", required = true)
    protected String tranccybrn1;
    @XmlElement(name = "TRANCCYBRN2")
    protected String tranccybrn2;
    @XmlElement(name = "MAKERID")
    protected String makerid;
    @XmlElement(name = "MAKERDTSTAMP")
    protected String makerdtstamp;
    @XmlElement(name = "CHECKERID")
    protected String checkerid;
    @XmlElement(name = "CHECKERDTSTAMP")
    protected String checkerdtstamp;
    @XmlElement(name = "MODNO")
    protected BigDecimal modno;
    @XmlElement(name = "AUTHSTAT")
    protected String authstat;
    @XmlElement(name = "RECSTAT")
    protected String recstat;
    @XmlElement(name = "ONCEAUTH")
    protected String onceauth;
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
     * Gets the value of the branchnamea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBRANCHNAMEA() {
        return branchnamea;
    }

    /**
     * Sets the value of the branchnamea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBRANCHNAMEA(String value) {
        this.branchnamea = value;
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
     * Gets the value of the branchnameb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBRANCHNAMEB() {
        return branchnameb;
    }

    /**
     * Sets the value of the branchnameb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBRANCHNAMEB(String value) {
        this.branchnameb = value;
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
     * Gets the value of the gldesca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGLDESCA() {
        return gldesca;
    }

    /**
     * Sets the value of the gldesca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGLDESCA(String value) {
        this.gldesca = value;
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
     * Gets the value of the gldescb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGLDESCB() {
        return gldescb;
    }

    /**
     * Sets the value of the gldescb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGLDESCB(String value) {
        this.gldescb = value;
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
     * Gets the value of the gldescc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGLDESCC() {
        return gldescc;
    }

    /**
     * Sets the value of the gldescc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGLDESCC(String value) {
        this.gldescc = value;
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
     * Gets the value of the gldescfrm1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGLDESCFRM1() {
        return gldescfrm1;
    }

    /**
     * Sets the value of the gldescfrm1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGLDESCFRM1(String value) {
        this.gldescfrm1 = value;
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
     * Gets the value of the cntgldesca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNTGLDESCA() {
        return cntgldesca;
    }

    /**
     * Sets the value of the cntgldesca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNTGLDESCA(String value) {
        this.cntgldesca = value;
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
     * Gets the value of the cntgldescb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNTGLDESCB() {
        return cntgldescb;
    }

    /**
     * Sets the value of the cntgldescb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNTGLDESCB(String value) {
        this.cntgldescb = value;
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
     * Gets the value of the cntgldescc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNTGLDESCC() {
        return cntgldescc;
    }

    /**
     * Sets the value of the cntgldescc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNTGLDESCC(String value) {
        this.cntgldescc = value;
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
     * Gets the value of the cntgldescd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNTGLDESCD() {
        return cntgldescd;
    }

    /**
     * Sets the value of the cntgldescd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNTGLDESCD(String value) {
        this.cntgldescd = value;
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
     * Gets the value of the grpdesca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGRPDESCA() {
        return grpdesca;
    }

    /**
     * Sets the value of the grpdesca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGRPDESCA(String value) {
        this.grpdesca = value;
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
     * Gets the value of the grpdescb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGRPDESCB() {
        return grpdescb;
    }

    /**
     * Sets the value of the grpdescb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGRPDESCB(String value) {
        this.grpdescb = value;
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
     * Gets the value of the grpdescc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGRPDESCC() {
        return grpdescc;
    }

    /**
     * Sets the value of the grpdescc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGRPDESCC(String value) {
        this.grpdescc = value;
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
     * Gets the value of the grpdescd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGRPDESCD() {
        return grpdescd;
    }

    /**
     * Sets the value of the grpdescd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGRPDESCD(String value) {
        this.grpdescd = value;
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
     * Gets the value of the makerid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAKERID() {
        return makerid;
    }

    /**
     * Sets the value of the makerid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAKERID(String value) {
        this.makerid = value;
    }

    /**
     * Gets the value of the makerdtstamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAKERDTSTAMP() {
        return makerdtstamp;
    }

    /**
     * Sets the value of the makerdtstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAKERDTSTAMP(String value) {
        this.makerdtstamp = value;
    }

    /**
     * Gets the value of the checkerid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHECKERID() {
        return checkerid;
    }

    /**
     * Sets the value of the checkerid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHECKERID(String value) {
        this.checkerid = value;
    }

    /**
     * Gets the value of the checkerdtstamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHECKERDTSTAMP() {
        return checkerdtstamp;
    }

    /**
     * Sets the value of the checkerdtstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHECKERDTSTAMP(String value) {
        this.checkerdtstamp = value;
    }

    /**
     * Gets the value of the modno property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMODNO() {
        return modno;
    }

    /**
     * Sets the value of the modno property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMODNO(BigDecimal value) {
        this.modno = value;
    }

    /**
     * Gets the value of the authstat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUTHSTAT() {
        return authstat;
    }

    /**
     * Sets the value of the authstat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUTHSTAT(String value) {
        this.authstat = value;
    }

    /**
     * Gets the value of the recstat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRECSTAT() {
        return recstat;
    }

    /**
     * Sets the value of the recstat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRECSTAT(String value) {
        this.recstat = value;
    }

    /**
     * Gets the value of the onceauth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getONCEAUTH() {
        return onceauth;
    }

    /**
     * Sets the value of the onceauth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setONCEAUTH(String value) {
        this.onceauth = value;
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
