
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
 * <p>Java class for MultiJrnlAuth-Full-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MultiJrnlAuth-Full-Type">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="REFERENCE_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="BATCH_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="BOOK_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="BRANCH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="TOTAL_DR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="TOTAL_CR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="MAKER_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Csvw-Contract-Ovd--Auth" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="REFERENCE_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   <element name="EVENT_SEQ_NO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   <element name="OVD_SEQ_NO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   <element name="CONFIRMED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   <element name="AUTHBY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   <element name="AUTHDTSTAMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   <element name="OVDREMARKS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   <element name="REMARKS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   <element name="OVDSTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   <element name="ERRCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   <element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "MultiJrnlAuth-Full-Type", propOrder = {
    "referenceno",
    "batchno",
    "bookdate",
    "branch",
    "ccy",
    "totaldr",
    "totalcr",
    "makerid",
    "csvwContractOvdAuth"
})
public class MultiJrnlAuthFullType {

    @XmlElement(name = "REFERENCE_NO")
    protected String referenceno;
    @XmlElement(name = "BATCH_NO")
    protected String batchno;
    @XmlElement(name = "BOOK_DATE")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar bookdate;
    @XmlElement(name = "BRANCH")
    protected String branch;
    @XmlElement(name = "CCY")
    protected String ccy;
    @XmlElement(name = "TOTAL_DR")
    protected BigDecimal totaldr;
    @XmlElement(name = "TOTAL_CR")
    protected BigDecimal totalcr;
    @XmlElement(name = "MAKER_ID")
    protected String makerid;
    @XmlElement(name = "Csvw-Contract-Ovd--Auth")
    protected List<MultiJrnlAuthFullType.CsvwContractOvdAuth> csvwContractOvdAuth;

    /**
     * Gets the value of the referenceno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREFERENCENO() {
        return referenceno;
    }

    /**
     * Sets the value of the referenceno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREFERENCENO(String value) {
        this.referenceno = value;
    }

    /**
     * Gets the value of the batchno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBATCHNO() {
        return batchno;
    }

    /**
     * Sets the value of the batchno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBATCHNO(String value) {
        this.batchno = value;
    }

    /**
     * Gets the value of the bookdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBOOKDATE() {
        return bookdate;
    }

    /**
     * Sets the value of the bookdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBOOKDATE(XMLGregorianCalendar value) {
        this.bookdate = value;
    }

    /**
     * Gets the value of the branch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBRANCH() {
        return branch;
    }

    /**
     * Sets the value of the branch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBRANCH(String value) {
        this.branch = value;
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
     * Gets the value of the totaldr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTOTALDR() {
        return totaldr;
    }

    /**
     * Sets the value of the totaldr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTOTALDR(BigDecimal value) {
        this.totaldr = value;
    }

    /**
     * Gets the value of the totalcr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTOTALCR() {
        return totalcr;
    }

    /**
     * Sets the value of the totalcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTOTALCR(BigDecimal value) {
        this.totalcr = value;
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
     * Gets the value of the csvwContractOvdAuth property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the csvwContractOvdAuth property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCsvwContractOvdAuth().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MultiJrnlAuthFullType.CsvwContractOvdAuth }
     * 
     * 
     * @return
     *     The value of the csvwContractOvdAuth property.
     */
    public List<MultiJrnlAuthFullType.CsvwContractOvdAuth> getCsvwContractOvdAuth() {
        if (csvwContractOvdAuth == null) {
            csvwContractOvdAuth = new ArrayList<>();
        }
        return this.csvwContractOvdAuth;
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
     *         <element name="REFERENCE_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         <element name="EVENT_SEQ_NO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         <element name="OVD_SEQ_NO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         <element name="CONFIRMED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         <element name="AUTHBY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         <element name="AUTHDTSTAMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         <element name="OVDREMARKS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         <element name="REMARKS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         <element name="OVDSTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         <element name="ERRCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         <element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "referenceno",
        "eventseqno",
        "ovdseqno",
        "confirmed",
        "authby",
        "authdtstamp",
        "ovdremarks",
        "remarks",
        "ovdstatus",
        "errcode",
        "status"
    })
    public static class CsvwContractOvdAuth {

        @XmlElement(name = "REFERENCE_NO")
        protected String referenceno;
        @XmlElement(name = "EVENT_SEQ_NO")
        protected BigDecimal eventseqno;
        @XmlElement(name = "OVD_SEQ_NO")
        protected BigDecimal ovdseqno;
        @XmlElement(name = "CONFIRMED")
        protected String confirmed;
        @XmlElement(name = "AUTHBY")
        protected String authby;
        @XmlElement(name = "AUTHDTSTAMP")
        protected String authdtstamp;
        @XmlElement(name = "OVDREMARKS")
        protected String ovdremarks;
        @XmlElement(name = "REMARKS")
        protected String remarks;
        @XmlElement(name = "OVDSTATUS")
        protected String ovdstatus;
        @XmlElement(name = "ERRCODE")
        protected String errcode;
        @XmlElement(name = "STATUS")
        protected String status;

        /**
         * Gets the value of the referenceno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREFERENCENO() {
            return referenceno;
        }

        /**
         * Sets the value of the referenceno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREFERENCENO(String value) {
            this.referenceno = value;
        }

        /**
         * Gets the value of the eventseqno property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getEVENTSEQNO() {
            return eventseqno;
        }

        /**
         * Sets the value of the eventseqno property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setEVENTSEQNO(BigDecimal value) {
            this.eventseqno = value;
        }

        /**
         * Gets the value of the ovdseqno property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getOVDSEQNO() {
            return ovdseqno;
        }

        /**
         * Sets the value of the ovdseqno property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setOVDSEQNO(BigDecimal value) {
            this.ovdseqno = value;
        }

        /**
         * Gets the value of the confirmed property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCONFIRMED() {
            return confirmed;
        }

        /**
         * Sets the value of the confirmed property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCONFIRMED(String value) {
            this.confirmed = value;
        }

        /**
         * Gets the value of the authby property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAUTHBY() {
            return authby;
        }

        /**
         * Sets the value of the authby property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAUTHBY(String value) {
            this.authby = value;
        }

        /**
         * Gets the value of the authdtstamp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAUTHDTSTAMP() {
            return authdtstamp;
        }

        /**
         * Sets the value of the authdtstamp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAUTHDTSTAMP(String value) {
            this.authdtstamp = value;
        }

        /**
         * Gets the value of the ovdremarks property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOVDREMARKS() {
            return ovdremarks;
        }

        /**
         * Sets the value of the ovdremarks property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOVDREMARKS(String value) {
            this.ovdremarks = value;
        }

        /**
         * Gets the value of the remarks property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREMARKS() {
            return remarks;
        }

        /**
         * Sets the value of the remarks property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREMARKS(String value) {
            this.remarks = value;
        }

        /**
         * Gets the value of the ovdstatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOVDSTATUS() {
            return ovdstatus;
        }

        /**
         * Sets the value of the ovdstatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOVDSTATUS(String value) {
            this.ovdstatus = value;
        }

        /**
         * Gets the value of the errcode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getERRCODE() {
            return errcode;
        }

        /**
         * Sets the value of the errcode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setERRCODE(String value) {
            this.errcode = value;
        }

        /**
         * Gets the value of the status property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSTATUS() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSTATUS(String value) {
            this.status = value;
        }

    }

}
