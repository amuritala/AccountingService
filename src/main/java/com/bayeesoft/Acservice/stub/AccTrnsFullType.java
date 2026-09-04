
package com.bayeesoft.Acservice.stub;

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
 * <p>Java class for AccTrns-Full-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AccTrns-Full-Type">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="NUMOFTRN" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         <element name="ACCNO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="ACCBRN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="BRNDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ACCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Acc-Transaction" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="REFNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   <element name="ACBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   <element name="ACNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   <element name="ACCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   <element name="DRBRIND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   <element name="TRNCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   <element name="FCYAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   <element name="LCYAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   <element name="TRNDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   <element name="VALDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   <element name="TXNINITDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   <element name="INSTRCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   <element name="MOD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   <element name="FINCYCLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   <element name="BRNDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   <element name="MODDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "AccTrns-Full-Type", propOrder = {
    "numoftrn",
    "accno",
    "accbrn",
    "brndesc",
    "acccy",
    "accTransaction"
})
public class AccTrnsFullType {

    @XmlElement(name = "NUMOFTRN", required = true)
    protected BigDecimal numoftrn;
    @XmlElement(name = "ACCNO", required = true)
    protected String accno;
    @XmlElement(name = "ACCBRN", required = true)
    protected String accbrn;
    @XmlElement(name = "BRNDESC")
    protected String brndesc;
    @XmlElement(name = "ACCCY")
    protected String acccy;
    @XmlElement(name = "Acc-Transaction")
    protected List<AccTrnsFullType.AccTransaction> accTransaction;

    /**
     * Gets the value of the numoftrn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNUMOFTRN() {
        return numoftrn;
    }

    /**
     * Sets the value of the numoftrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNUMOFTRN(BigDecimal value) {
        this.numoftrn = value;
    }

    /**
     * Gets the value of the accno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCNO() {
        return accno;
    }

    /**
     * Sets the value of the accno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCNO(String value) {
        this.accno = value;
    }

    /**
     * Gets the value of the accbrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCBRN() {
        return accbrn;
    }

    /**
     * Sets the value of the accbrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCBRN(String value) {
        this.accbrn = value;
    }

    /**
     * Gets the value of the brndesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBRNDESC() {
        return brndesc;
    }

    /**
     * Sets the value of the brndesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBRNDESC(String value) {
        this.brndesc = value;
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
     * Gets the value of the accTransaction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the accTransaction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccTransaction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccTrnsFullType.AccTransaction }
     * 
     * 
     * @return
     *     The value of the accTransaction property.
     */
    public List<AccTrnsFullType.AccTransaction> getAccTransaction() {
        if (accTransaction == null) {
            accTransaction = new ArrayList<>();
        }
        return this.accTransaction;
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
     *         <element name="REFNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         <element name="ACBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         <element name="ACNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         <element name="ACCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         <element name="DRBRIND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         <element name="TRNCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         <element name="FCYAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         <element name="LCYAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         <element name="TRNDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         <element name="VALDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         <element name="TXNINITDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         <element name="INSTRCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         <element name="MOD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         <element name="FINCYCLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         <element name="BRNDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         <element name="MODDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "refno",
        "acbrn",
        "acno",
        "acccy",
        "drbrind",
        "trncd",
        "fcyamt",
        "lcyamt",
        "trndt",
        "valdt",
        "txninitdt",
        "instrcd",
        "mod",
        "fincycle",
        "brndesc",
        "moddesc"
    })
    public static class AccTransaction {

        @XmlElement(name = "REFNO")
        protected String refno;
        @XmlElement(name = "ACBRN")
        protected String acbrn;
        @XmlElement(name = "ACNO")
        protected String acno;
        @XmlElement(name = "ACCCY")
        protected String acccy;
        @XmlElement(name = "DRBRIND")
        protected String drbrind;
        @XmlElement(name = "TRNCD")
        protected String trncd;
        @XmlElement(name = "FCYAMT")
        protected BigDecimal fcyamt;
        @XmlElement(name = "LCYAMT")
        protected BigDecimal lcyamt;
        @XmlElement(name = "TRNDT")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar trndt;
        @XmlElement(name = "VALDT")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar valdt;
        @XmlElement(name = "TXNINITDT")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar txninitdt;
        @XmlElement(name = "INSTRCD")
        protected String instrcd;
        @XmlElement(name = "MOD")
        protected String mod;
        @XmlElement(name = "FINCYCLE")
        protected String fincycle;
        @XmlElement(name = "BRNDESC")
        protected String brndesc;
        @XmlElement(name = "MODDESC")
        protected String moddesc;

        /**
         * Gets the value of the refno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREFNO() {
            return refno;
        }

        /**
         * Sets the value of the refno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREFNO(String value) {
            this.refno = value;
        }

        /**
         * Gets the value of the acbrn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACBRN() {
            return acbrn;
        }

        /**
         * Sets the value of the acbrn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACBRN(String value) {
            this.acbrn = value;
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
         * Gets the value of the drbrind property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDRBRIND() {
            return drbrind;
        }

        /**
         * Sets the value of the drbrind property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDRBRIND(String value) {
            this.drbrind = value;
        }

        /**
         * Gets the value of the trncd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTRNCD() {
            return trncd;
        }

        /**
         * Sets the value of the trncd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTRNCD(String value) {
            this.trncd = value;
        }

        /**
         * Gets the value of the fcyamt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getFCYAMT() {
            return fcyamt;
        }

        /**
         * Sets the value of the fcyamt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setFCYAMT(BigDecimal value) {
            this.fcyamt = value;
        }

        /**
         * Gets the value of the lcyamt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getLCYAMT() {
            return lcyamt;
        }

        /**
         * Sets the value of the lcyamt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setLCYAMT(BigDecimal value) {
            this.lcyamt = value;
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
         * Gets the value of the valdt property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getVALDT() {
            return valdt;
        }

        /**
         * Sets the value of the valdt property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setVALDT(XMLGregorianCalendar value) {
            this.valdt = value;
        }

        /**
         * Gets the value of the txninitdt property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getTXNINITDT() {
            return txninitdt;
        }

        /**
         * Sets the value of the txninitdt property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setTXNINITDT(XMLGregorianCalendar value) {
            this.txninitdt = value;
        }

        /**
         * Gets the value of the instrcd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINSTRCD() {
            return instrcd;
        }

        /**
         * Sets the value of the instrcd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINSTRCD(String value) {
            this.instrcd = value;
        }

        /**
         * Gets the value of the mod property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMOD() {
            return mod;
        }

        /**
         * Sets the value of the mod property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMOD(String value) {
            this.mod = value;
        }

        /**
         * Gets the value of the fincycle property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFINCYCLE() {
            return fincycle;
        }

        /**
         * Sets the value of the fincycle property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFINCYCLE(String value) {
            this.fincycle = value;
        }

        /**
         * Gets the value of the brndesc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBRNDESC() {
            return brndesc;
        }

        /**
         * Sets the value of the brndesc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBRNDESC(String value) {
            this.brndesc = value;
        }

        /**
         * Gets the value of the moddesc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMODDESC() {
            return moddesc;
        }

        /**
         * Sets the value of the moddesc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMODDESC(String value) {
            this.moddesc = value;
        }

    }

}
