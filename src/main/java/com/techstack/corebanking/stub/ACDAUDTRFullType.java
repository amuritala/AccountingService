
package com.techstack.corebanking.stub;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ACDAUDTR-Full-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ACDAUDTR-Full-Type">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BRANCH_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="CUST_AC_NO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="ACCOUNT_CLASS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ACC_STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="AC_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="TRN_FROM_DT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="TRN_TO_DT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="ACTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="TRN_REF_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="CHEQUENO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Acvw-All-Acentries-Desc" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="AC_BRANCH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   <element name="AC_CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   <element name="DRCR_IND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   <element name="FCYAMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   <element name="LCY_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   <element name="TRN_DT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   <element name="VALUE_DT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   <element name="TRNINITDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   <element name="RELATEDACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   <element name="BRNSAUTHSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   <element name="USER_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   <element name="TRN_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   <element name="EVENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   <element name="AC_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Acvw-All-Acentries-Desc--Accr" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="AC_BRANCH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   <element name="DRCR_IND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   <element name="FCYAMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   <element name="LCY_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   <element name="VALUE_DT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   <element name="TRNINITDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   <element name="RELATEDACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   <element name="BRNSAUTHSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   <element name="USER_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   <element name="TRN_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   <element name="EVENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   <element name="AC_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   <element name="TRN_DT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Actb-Entries-Handoff" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="AC_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   <element name="TRN_DT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   <element name="DRCR_IND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   <element name="TXN_INIT_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   <element name="USER_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   <element name="RELATED_ACCOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   <element name="AC_BRANCH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   <element name="LCY_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   <element name="FCY_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   <element name="AUTH_STAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   <element name="EVENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   <element name="VALUE_DT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ACDAUDTR-Full-Type", propOrder = {
    "branchcode",
    "custacno",
    "accountclass",
    "accstatus",
    "ccy",
    "description",
    "acdesc",
    "trnfromdt",
    "trntodt",
    "action",
    "trnrefno",
    "chequeno",
    "acvwAllAcentriesDesc",
    "acvwAllAcentriesDescAccr",
    "actbEntriesHandoff"
})
public class ACDAUDTRFullType {

    @XmlElement(name = "BRANCH_CODE", required = true)
    protected String branchcode;
    @XmlElement(name = "CUST_AC_NO", required = true)
    protected String custacno;
    @XmlElement(name = "ACCOUNT_CLASS")
    protected String accountclass;
    @XmlElement(name = "ACC_STATUS")
    protected String accstatus;
    @XmlElement(name = "CCY")
    protected String ccy;
    @XmlElement(name = "DESCRIPTION")
    protected String description;
    @XmlElement(name = "AC_DESC")
    protected String acdesc;
    @XmlElement(name = "TRN_FROM_DT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar trnfromdt;
    @XmlElement(name = "TRN_TO_DT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar trntodt;
    @XmlElement(name = "ACTION")
    protected String action;
    @XmlElement(name = "TRN_REF_NO")
    protected String trnrefno;
    @XmlElement(name = "CHEQUENO")
    protected String chequeno;
    @XmlElement(name = "Acvw-All-Acentries-Desc")
    protected List<ACDAUDTRFullType.AcvwAllAcentriesDesc> acvwAllAcentriesDesc;
    @XmlElement(name = "Acvw-All-Acentries-Desc--Accr")
    protected List<ACDAUDTRFullType.AcvwAllAcentriesDescAccr> acvwAllAcentriesDescAccr;
    @XmlElement(name = "Actb-Entries-Handoff")
    protected List<ACDAUDTRFullType.ActbEntriesHandoff> actbEntriesHandoff;

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
     * Gets the value of the accountclass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCOUNTCLASS() {
        return accountclass;
    }

    /**
     * Sets the value of the accountclass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCOUNTCLASS(String value) {
        this.accountclass = value;
    }

    /**
     * Gets the value of the accstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCSTATUS() {
        return accstatus;
    }

    /**
     * Sets the value of the accstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCSTATUS(String value) {
        this.accstatus = value;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCY() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCY(String value) {
        this.ccy = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCRIPTION() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCRIPTION(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the acdesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACDESC() {
        return acdesc;
    }

    /**
     * Sets the value of the acdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACDESC(String value) {
        this.acdesc = value;
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
     * Gets the value of the trnrefno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRNREFNO() {
        return trnrefno;
    }

    /**
     * Sets the value of the trnrefno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRNREFNO(String value) {
        this.trnrefno = value;
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

    /**
     * Gets the value of the acvwAllAcentriesDesc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the acvwAllAcentriesDesc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcvwAllAcentriesDesc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ACDAUDTRFullType.AcvwAllAcentriesDesc }
     * 
     * 
     * @return
     *     The value of the acvwAllAcentriesDesc property.
     */
    public List<ACDAUDTRFullType.AcvwAllAcentriesDesc> getAcvwAllAcentriesDesc() {
        if (acvwAllAcentriesDesc == null) {
            acvwAllAcentriesDesc = new ArrayList<>();
        }
        return this.acvwAllAcentriesDesc;
    }

    /**
     * Gets the value of the acvwAllAcentriesDescAccr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the acvwAllAcentriesDescAccr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcvwAllAcentriesDescAccr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ACDAUDTRFullType.AcvwAllAcentriesDescAccr }
     * 
     * 
     * @return
     *     The value of the acvwAllAcentriesDescAccr property.
     */
    public List<ACDAUDTRFullType.AcvwAllAcentriesDescAccr> getAcvwAllAcentriesDescAccr() {
        if (acvwAllAcentriesDescAccr == null) {
            acvwAllAcentriesDescAccr = new ArrayList<>();
        }
        return this.acvwAllAcentriesDescAccr;
    }

    /**
     * Gets the value of the actbEntriesHandoff property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the actbEntriesHandoff property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActbEntriesHandoff().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ACDAUDTRFullType.ActbEntriesHandoff }
     * 
     * 
     * @return
     *     The value of the actbEntriesHandoff property.
     */
    public List<ACDAUDTRFullType.ActbEntriesHandoff> getActbEntriesHandoff() {
        if (actbEntriesHandoff == null) {
            actbEntriesHandoff = new ArrayList<>();
        }
        return this.actbEntriesHandoff;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <element name="AC_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         <element name="TRN_DT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         <element name="DRCR_IND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         <element name="TXN_INIT_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         <element name="USER_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         <element name="RELATED_ACCOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         <element name="AC_BRANCH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         <element name="LCY_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         <element name="FCY_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         <element name="AUTH_STAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         <element name="EVENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         <element name="VALUE_DT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *       </sequence>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "acno",
        "trndt",
        "drcrind",
        "txninitdate",
        "userid",
        "relatedaccount",
        "acbranch",
        "lcyamount",
        "fcyamount",
        "authstat",
        "event",
        "valuedt"
    })
    public static class ActbEntriesHandoff {

        @XmlElement(name = "AC_NO")
        protected String acno;
        @XmlElement(name = "TRN_DT")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar trndt;
        @XmlElement(name = "DRCR_IND")
        protected String drcrind;
        @XmlElement(name = "TXN_INIT_DATE")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar txninitdate;
        @XmlElement(name = "USER_ID")
        protected String userid;
        @XmlElement(name = "RELATED_ACCOUNT")
        protected String relatedaccount;
        @XmlElement(name = "AC_BRANCH")
        protected String acbranch;
        @XmlElement(name = "LCY_AMOUNT")
        protected BigDecimal lcyamount;
        @XmlElement(name = "FCY_AMOUNT")
        protected BigDecimal fcyamount;
        @XmlElement(name = "AUTH_STAT")
        protected String authstat;
        @XmlElement(name = "EVENT")
        protected String event;
        @XmlElement(name = "VALUE_DT")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar valuedt;

        /**
         * Gets the value of the acno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACNO() {
            return acno;
        }

        /**
         * Sets the value of the acno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACNO(String value) {
            this.acno = value;
        }

        /**
         * Gets the value of the trndt property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getTRNDT() {
            return trndt;
        }

        /**
         * Sets the value of the trndt property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setTRNDT(XMLGregorianCalendar value) {
            this.trndt = value;
        }

        /**
         * Gets the value of the drcrind property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDRCRIND() {
            return drcrind;
        }

        /**
         * Sets the value of the drcrind property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDRCRIND(String value) {
            this.drcrind = value;
        }

        /**
         * Gets the value of the txninitdate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getTXNINITDATE() {
            return txninitdate;
        }

        /**
         * Sets the value of the txninitdate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setTXNINITDATE(XMLGregorianCalendar value) {
            this.txninitdate = value;
        }

        /**
         * Gets the value of the userid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUSERID() {
            return userid;
        }

        /**
         * Sets the value of the userid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUSERID(String value) {
            this.userid = value;
        }

        /**
         * Gets the value of the relatedaccount property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRELATEDACCOUNT() {
            return relatedaccount;
        }

        /**
         * Sets the value of the relatedaccount property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRELATEDACCOUNT(String value) {
            this.relatedaccount = value;
        }

        /**
         * Gets the value of the acbranch property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACBRANCH() {
            return acbranch;
        }

        /**
         * Sets the value of the acbranch property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACBRANCH(String value) {
            this.acbranch = value;
        }

        /**
         * Gets the value of the lcyamount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getLCYAMOUNT() {
            return lcyamount;
        }

        /**
         * Sets the value of the lcyamount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setLCYAMOUNT(BigDecimal value) {
            this.lcyamount = value;
        }

        /**
         * Gets the value of the fcyamount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getFCYAMOUNT() {
            return fcyamount;
        }

        /**
         * Sets the value of the fcyamount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setFCYAMOUNT(BigDecimal value) {
            this.fcyamount = value;
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
         * Gets the value of the event property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEVENT() {
            return event;
        }

        /**
         * Sets the value of the event property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEVENT(String value) {
            this.event = value;
        }

        /**
         * Gets the value of the valuedt property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getVALUEDT() {
            return valuedt;
        }

        /**
         * Sets the value of the valuedt property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setVALUEDT(XMLGregorianCalendar value) {
            this.valuedt = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <element name="AC_BRANCH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         <element name="AC_CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         <element name="DRCR_IND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         <element name="FCYAMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         <element name="LCY_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         <element name="TRN_DT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         <element name="VALUE_DT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         <element name="TRNINITDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         <element name="RELATEDACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         <element name="BRNSAUTHSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         <element name="USER_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         <element name="TRN_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         <element name="EVENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         <element name="AC_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       </sequence>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "acbranch",
        "acccy",
        "drcrind",
        "fcyamount",
        "lcyamount",
        "trndt",
        "valuedt",
        "trninitdt",
        "relatedacc",
        "brnsauthstat",
        "userid",
        "trndesc",
        "event",
        "acno"
    })
    public static class AcvwAllAcentriesDesc {

        @XmlElement(name = "AC_BRANCH")
        protected String acbranch;
        @XmlElement(name = "AC_CCY")
        protected String acccy;
        @XmlElement(name = "DRCR_IND")
        protected String drcrind;
        @XmlElement(name = "FCYAMOUNT")
        protected BigDecimal fcyamount;
        @XmlElement(name = "LCY_AMOUNT")
        protected BigDecimal lcyamount;
        @XmlElement(name = "TRN_DT")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar trndt;
        @XmlElement(name = "VALUE_DT")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar valuedt;
        @XmlElement(name = "TRNINITDT")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar trninitdt;
        @XmlElement(name = "RELATEDACC")
        protected String relatedacc;
        @XmlElement(name = "BRNSAUTHSTAT")
        protected String brnsauthstat;
        @XmlElement(name = "USER_ID")
        protected String userid;
        @XmlElement(name = "TRN_DESC")
        protected String trndesc;
        @XmlElement(name = "EVENT")
        protected String event;
        @XmlElement(name = "AC_NO")
        protected String acno;

        /**
         * Gets the value of the acbranch property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACBRANCH() {
            return acbranch;
        }

        /**
         * Sets the value of the acbranch property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACBRANCH(String value) {
            this.acbranch = value;
        }

        /**
         * Gets the value of the acccy property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACCCY() {
            return acccy;
        }

        /**
         * Sets the value of the acccy property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACCCY(String value) {
            this.acccy = value;
        }

        /**
         * Gets the value of the drcrind property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDRCRIND() {
            return drcrind;
        }

        /**
         * Sets the value of the drcrind property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDRCRIND(String value) {
            this.drcrind = value;
        }

        /**
         * Gets the value of the fcyamount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getFCYAMOUNT() {
            return fcyamount;
        }

        /**
         * Sets the value of the fcyamount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setFCYAMOUNT(BigDecimal value) {
            this.fcyamount = value;
        }

        /**
         * Gets the value of the lcyamount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getLCYAMOUNT() {
            return lcyamount;
        }

        /**
         * Sets the value of the lcyamount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setLCYAMOUNT(BigDecimal value) {
            this.lcyamount = value;
        }

        /**
         * Gets the value of the trndt property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getTRNDT() {
            return trndt;
        }

        /**
         * Sets the value of the trndt property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setTRNDT(XMLGregorianCalendar value) {
            this.trndt = value;
        }

        /**
         * Gets the value of the valuedt property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getVALUEDT() {
            return valuedt;
        }

        /**
         * Sets the value of the valuedt property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setVALUEDT(XMLGregorianCalendar value) {
            this.valuedt = value;
        }

        /**
         * Gets the value of the trninitdt property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getTRNINITDT() {
            return trninitdt;
        }

        /**
         * Sets the value of the trninitdt property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setTRNINITDT(XMLGregorianCalendar value) {
            this.trninitdt = value;
        }

        /**
         * Gets the value of the relatedacc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRELATEDACC() {
            return relatedacc;
        }

        /**
         * Sets the value of the relatedacc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRELATEDACC(String value) {
            this.relatedacc = value;
        }

        /**
         * Gets the value of the brnsauthstat property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBRNSAUTHSTAT() {
            return brnsauthstat;
        }

        /**
         * Sets the value of the brnsauthstat property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBRNSAUTHSTAT(String value) {
            this.brnsauthstat = value;
        }

        /**
         * Gets the value of the userid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUSERID() {
            return userid;
        }

        /**
         * Sets the value of the userid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUSERID(String value) {
            this.userid = value;
        }

        /**
         * Gets the value of the trndesc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTRNDESC() {
            return trndesc;
        }

        /**
         * Sets the value of the trndesc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTRNDESC(String value) {
            this.trndesc = value;
        }

        /**
         * Gets the value of the event property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEVENT() {
            return event;
        }

        /**
         * Sets the value of the event property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEVENT(String value) {
            this.event = value;
        }

        /**
         * Gets the value of the acno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACNO() {
            return acno;
        }

        /**
         * Sets the value of the acno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACNO(String value) {
            this.acno = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <element name="AC_BRANCH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         <element name="DRCR_IND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         <element name="FCYAMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         <element name="LCY_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         <element name="VALUE_DT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         <element name="TRNINITDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         <element name="RELATEDACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         <element name="BRNSAUTHSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         <element name="USER_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         <element name="TRN_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         <element name="EVENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         <element name="AC_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         <element name="TRN_DT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *       </sequence>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "acbranch",
        "drcrind",
        "fcyamount",
        "lcyamount",
        "valuedt",
        "trninitdt",
        "relatedacc",
        "brnsauthstat",
        "userid",
        "trndesc",
        "event",
        "acno",
        "trndt"
    })
    public static class AcvwAllAcentriesDescAccr {

        @XmlElement(name = "AC_BRANCH")
        protected String acbranch;
        @XmlElement(name = "DRCR_IND")
        protected String drcrind;
        @XmlElement(name = "FCYAMOUNT")
        protected BigDecimal fcyamount;
        @XmlElement(name = "LCY_AMOUNT")
        protected BigDecimal lcyamount;
        @XmlElement(name = "VALUE_DT")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar valuedt;
        @XmlElement(name = "TRNINITDT")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar trninitdt;
        @XmlElement(name = "RELATEDACC")
        protected String relatedacc;
        @XmlElement(name = "BRNSAUTHSTAT")
        protected String brnsauthstat;
        @XmlElement(name = "USER_ID")
        protected String userid;
        @XmlElement(name = "TRN_DESC")
        protected String trndesc;
        @XmlElement(name = "EVENT")
        protected String event;
        @XmlElement(name = "AC_NO")
        protected String acno;
        @XmlElement(name = "TRN_DT")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar trndt;

        /**
         * Gets the value of the acbranch property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACBRANCH() {
            return acbranch;
        }

        /**
         * Sets the value of the acbranch property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACBRANCH(String value) {
            this.acbranch = value;
        }

        /**
         * Gets the value of the drcrind property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDRCRIND() {
            return drcrind;
        }

        /**
         * Sets the value of the drcrind property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDRCRIND(String value) {
            this.drcrind = value;
        }

        /**
         * Gets the value of the fcyamount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getFCYAMOUNT() {
            return fcyamount;
        }

        /**
         * Sets the value of the fcyamount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setFCYAMOUNT(BigDecimal value) {
            this.fcyamount = value;
        }

        /**
         * Gets the value of the lcyamount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getLCYAMOUNT() {
            return lcyamount;
        }

        /**
         * Sets the value of the lcyamount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setLCYAMOUNT(BigDecimal value) {
            this.lcyamount = value;
        }

        /**
         * Gets the value of the valuedt property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getVALUEDT() {
            return valuedt;
        }

        /**
         * Sets the value of the valuedt property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setVALUEDT(XMLGregorianCalendar value) {
            this.valuedt = value;
        }

        /**
         * Gets the value of the trninitdt property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getTRNINITDT() {
            return trninitdt;
        }

        /**
         * Sets the value of the trninitdt property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setTRNINITDT(XMLGregorianCalendar value) {
            this.trninitdt = value;
        }

        /**
         * Gets the value of the relatedacc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRELATEDACC() {
            return relatedacc;
        }

        /**
         * Sets the value of the relatedacc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRELATEDACC(String value) {
            this.relatedacc = value;
        }

        /**
         * Gets the value of the brnsauthstat property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBRNSAUTHSTAT() {
            return brnsauthstat;
        }

        /**
         * Sets the value of the brnsauthstat property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBRNSAUTHSTAT(String value) {
            this.brnsauthstat = value;
        }

        /**
         * Gets the value of the userid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUSERID() {
            return userid;
        }

        /**
         * Sets the value of the userid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUSERID(String value) {
            this.userid = value;
        }

        /**
         * Gets the value of the trndesc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTRNDESC() {
            return trndesc;
        }

        /**
         * Sets the value of the trndesc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTRNDESC(String value) {
            this.trndesc = value;
        }

        /**
         * Gets the value of the event property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEVENT() {
            return event;
        }

        /**
         * Sets the value of the event property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEVENT(String value) {
            this.event = value;
        }

        /**
         * Gets the value of the acno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACNO() {
            return acno;
        }

        /**
         * Sets the value of the acno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACNO(String value) {
            this.acno = value;
        }

        /**
         * Gets the value of the trndt property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getTRNDT() {
            return trndt;
        }

        /**
         * Sets the value of the trndt property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setTRNDT(XMLGregorianCalendar value) {
            this.trndt = value;
        }

    }

}
