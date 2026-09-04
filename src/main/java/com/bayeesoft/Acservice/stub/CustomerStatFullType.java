
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
 * <p>Java class for CustomerStat-Full-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CustomerStat-Full-Type">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CUSTOMER_NO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="CUSTOMER_ACC_NO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="CURRENCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="CUSTOMER_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="BRANCH_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="SIMPLE_AVG_BALANCE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="MIN_BAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="MAX_BAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="NO_DR_TRANSACTIONS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="NO_CR_TRANSACTIONS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="DR_AVG" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="CR_AVG" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="NO_RET_CHEQUES" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="DAYS_IN_DEBIT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="DAYS_IN_CREDIT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="TOT_BAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="NO_OVERDRAFT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="DR_AVG_MONTHLY" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="CR_AVG_MONTHLY" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="MONTHLY_AVG" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="Monthly" maxOccurs="unbounded">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   <element name="SIMPLE_AVG_BAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   <element name="MIN_BAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   <element name="MAX_BAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   <element name="NO_DR_TRANSACTIONS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   <element name="NO_CR_TRANSACTION" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   <element name="CLOSING_BAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   <element name="DR_INT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   <element name="NSF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   <element name="CHG_TR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   <element name="DB_CHK_RTD" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   <element name="VISA_DB" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   <element name="LAST_DEBIT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   <element name="LAST_CREDIT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   <element name="LAST_OVERDRAFT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   <element name="DAYS_IN_DEBIT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   <element name="DR_AVG_MONTHLY" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   <element name="DAYS_XOD" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   <element name="MONTHLY_AVG" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   <element name="NO_OVERDRAFT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   <element name="DAYS_IN_CREDIT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   <element name="CR_AVG_MONTHLY" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   <element name="CUSTOMER_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   <element name="CUST_AC_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   <element name="CUSTOMER_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   <element name="BRANCH_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   <element name="TOT_BAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   <element name="DR_AVG" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   <element name="CR_AVG" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   <element name="XOD_AVG" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   <element name="RUN_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   <element name="NO_RET_CHEQUES" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
@XmlType(name = "CustomerStat-Full-Type", propOrder = {
    "customerno",
    "customeraccno",
    "currency",
    "customername",
    "branchcode",
    "simpleavgbalance",
    "minbal",
    "maxbal",
    "nodrtransactions",
    "nocrtransactions",
    "dravg",
    "cravg",
    "noretcheques",
    "daysindebit",
    "daysincredit",
    "totbal",
    "nooverdraft",
    "dravgmonthly",
    "cravgmonthly",
    "monthlyavg",
    "monthly"
})
public class CustomerStatFullType {

    @XmlElement(name = "CUSTOMER_NO", required = true)
    protected String customerno;
    @XmlElement(name = "CUSTOMER_ACC_NO", required = true)
    protected String customeraccno;
    @XmlElement(name = "CURRENCY")
    protected String currency;
    @XmlElement(name = "CUSTOMER_NAME")
    protected String customername;
    @XmlElement(name = "BRANCH_CODE", required = true)
    protected String branchcode;
    @XmlElement(name = "SIMPLE_AVG_BALANCE")
    protected BigDecimal simpleavgbalance;
    @XmlElement(name = "MIN_BAL")
    protected BigDecimal minbal;
    @XmlElement(name = "MAX_BAL")
    protected BigDecimal maxbal;
    @XmlElement(name = "NO_DR_TRANSACTIONS")
    protected BigDecimal nodrtransactions;
    @XmlElement(name = "NO_CR_TRANSACTIONS")
    protected BigDecimal nocrtransactions;
    @XmlElement(name = "DR_AVG")
    protected BigDecimal dravg;
    @XmlElement(name = "CR_AVG")
    protected BigDecimal cravg;
    @XmlElement(name = "NO_RET_CHEQUES")
    protected BigDecimal noretcheques;
    @XmlElement(name = "DAYS_IN_DEBIT")
    protected BigDecimal daysindebit;
    @XmlElement(name = "DAYS_IN_CREDIT")
    protected BigDecimal daysincredit;
    @XmlElement(name = "TOT_BAL")
    protected BigDecimal totbal;
    @XmlElement(name = "NO_OVERDRAFT")
    protected BigDecimal nooverdraft;
    @XmlElement(name = "DR_AVG_MONTHLY")
    protected BigDecimal dravgmonthly;
    @XmlElement(name = "CR_AVG_MONTHLY")
    protected BigDecimal cravgmonthly;
    @XmlElement(name = "MONTHLY_AVG")
    protected BigDecimal monthlyavg;
    @XmlElement(name = "Monthly", required = true)
    protected List<CustomerStatFullType.Monthly> monthly;

    /**
     * Gets the value of the customerno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSTOMERNO() {
        return customerno;
    }

    /**
     * Sets the value of the customerno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSTOMERNO(String value) {
        this.customerno = value;
    }

    /**
     * Gets the value of the customeraccno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSTOMERACCNO() {
        return customeraccno;
    }

    /**
     * Sets the value of the customeraccno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSTOMERACCNO(String value) {
        this.customeraccno = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCURRENCY() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCURRENCY(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the customername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSTOMERNAME() {
        return customername;
    }

    /**
     * Sets the value of the customername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSTOMERNAME(String value) {
        this.customername = value;
    }

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
     * Gets the value of the simpleavgbalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSIMPLEAVGBALANCE() {
        return simpleavgbalance;
    }

    /**
     * Sets the value of the simpleavgbalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSIMPLEAVGBALANCE(BigDecimal value) {
        this.simpleavgbalance = value;
    }

    /**
     * Gets the value of the minbal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMINBAL() {
        return minbal;
    }

    /**
     * Sets the value of the minbal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMINBAL(BigDecimal value) {
        this.minbal = value;
    }

    /**
     * Gets the value of the maxbal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMAXBAL() {
        return maxbal;
    }

    /**
     * Sets the value of the maxbal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMAXBAL(BigDecimal value) {
        this.maxbal = value;
    }

    /**
     * Gets the value of the nodrtransactions property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNODRTRANSACTIONS() {
        return nodrtransactions;
    }

    /**
     * Sets the value of the nodrtransactions property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNODRTRANSACTIONS(BigDecimal value) {
        this.nodrtransactions = value;
    }

    /**
     * Gets the value of the nocrtransactions property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNOCRTRANSACTIONS() {
        return nocrtransactions;
    }

    /**
     * Sets the value of the nocrtransactions property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNOCRTRANSACTIONS(BigDecimal value) {
        this.nocrtransactions = value;
    }

    /**
     * Gets the value of the dravg property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDRAVG() {
        return dravg;
    }

    /**
     * Sets the value of the dravg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDRAVG(BigDecimal value) {
        this.dravg = value;
    }

    /**
     * Gets the value of the cravg property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCRAVG() {
        return cravg;
    }

    /**
     * Sets the value of the cravg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCRAVG(BigDecimal value) {
        this.cravg = value;
    }

    /**
     * Gets the value of the noretcheques property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNORETCHEQUES() {
        return noretcheques;
    }

    /**
     * Sets the value of the noretcheques property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNORETCHEQUES(BigDecimal value) {
        this.noretcheques = value;
    }

    /**
     * Gets the value of the daysindebit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDAYSINDEBIT() {
        return daysindebit;
    }

    /**
     * Sets the value of the daysindebit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDAYSINDEBIT(BigDecimal value) {
        this.daysindebit = value;
    }

    /**
     * Gets the value of the daysincredit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDAYSINCREDIT() {
        return daysincredit;
    }

    /**
     * Sets the value of the daysincredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDAYSINCREDIT(BigDecimal value) {
        this.daysincredit = value;
    }

    /**
     * Gets the value of the totbal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTOTBAL() {
        return totbal;
    }

    /**
     * Sets the value of the totbal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTOTBAL(BigDecimal value) {
        this.totbal = value;
    }

    /**
     * Gets the value of the nooverdraft property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNOOVERDRAFT() {
        return nooverdraft;
    }

    /**
     * Sets the value of the nooverdraft property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNOOVERDRAFT(BigDecimal value) {
        this.nooverdraft = value;
    }

    /**
     * Gets the value of the dravgmonthly property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDRAVGMONTHLY() {
        return dravgmonthly;
    }

    /**
     * Sets the value of the dravgmonthly property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDRAVGMONTHLY(BigDecimal value) {
        this.dravgmonthly = value;
    }

    /**
     * Gets the value of the cravgmonthly property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCRAVGMONTHLY() {
        return cravgmonthly;
    }

    /**
     * Sets the value of the cravgmonthly property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCRAVGMONTHLY(BigDecimal value) {
        this.cravgmonthly = value;
    }

    /**
     * Gets the value of the monthlyavg property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMONTHLYAVG() {
        return monthlyavg;
    }

    /**
     * Sets the value of the monthlyavg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMONTHLYAVG(BigDecimal value) {
        this.monthlyavg = value;
    }

    /**
     * Gets the value of the monthly property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the monthly property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMonthly().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerStatFullType.Monthly }
     * 
     * 
     * @return
     *     The value of the monthly property.
     */
    public List<CustomerStatFullType.Monthly> getMonthly() {
        if (monthly == null) {
            monthly = new ArrayList<>();
        }
        return this.monthly;
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
     *         <element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         <element name="SIMPLE_AVG_BAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         <element name="MIN_BAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         <element name="MAX_BAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         <element name="NO_DR_TRANSACTIONS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         <element name="NO_CR_TRANSACTION" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         <element name="CLOSING_BAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         <element name="DR_INT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         <element name="NSF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         <element name="CHG_TR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         <element name="DB_CHK_RTD" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         <element name="VISA_DB" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         <element name="LAST_DEBIT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         <element name="LAST_CREDIT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         <element name="LAST_OVERDRAFT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         <element name="DAYS_IN_DEBIT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         <element name="DR_AVG_MONTHLY" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         <element name="DAYS_XOD" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         <element name="MONTHLY_AVG" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         <element name="NO_OVERDRAFT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         <element name="DAYS_IN_CREDIT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         <element name="CR_AVG_MONTHLY" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         <element name="CUSTOMER_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         <element name="CUST_AC_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         <element name="CUSTOMER_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         <element name="BRANCH_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         <element name="TOT_BAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         <element name="DR_AVG" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         <element name="CR_AVG" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         <element name="XOD_AVG" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         <element name="RUN_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         <element name="NO_RET_CHEQUES" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
        "ccy",
        "simpleavgbal",
        "minbal",
        "maxbal",
        "nodrtransactions",
        "nocrtransaction",
        "closingbal",
        "drint",
        "nsf",
        "chgtr",
        "dbchkrtd",
        "visadb",
        "lastdebit",
        "lastcredit",
        "lastoverdraft",
        "daysindebit",
        "dravgmonthly",
        "daysxod",
        "monthlyavg",
        "nooverdraft",
        "daysincredit",
        "cravgmonthly",
        "customerno",
        "custacno",
        "customername",
        "branchcode",
        "totbal",
        "dravg",
        "cravg",
        "xodavg",
        "rundate",
        "noretcheques"
    })
    public static class Monthly {

        @XmlElement(name = "CCY")
        protected String ccy;
        @XmlElement(name = "SIMPLE_AVG_BAL")
        protected BigDecimal simpleavgbal;
        @XmlElement(name = "MIN_BAL")
        protected BigDecimal minbal;
        @XmlElement(name = "MAX_BAL")
        protected BigDecimal maxbal;
        @XmlElement(name = "NO_DR_TRANSACTIONS")
        protected BigDecimal nodrtransactions;
        @XmlElement(name = "NO_CR_TRANSACTION")
        protected BigDecimal nocrtransaction;
        @XmlElement(name = "CLOSING_BAL")
        protected BigDecimal closingbal;
        @XmlElement(name = "DR_INT")
        protected BigDecimal drint;
        @XmlElement(name = "NSF")
        protected String nsf;
        @XmlElement(name = "CHG_TR")
        protected BigDecimal chgtr;
        @XmlElement(name = "DB_CHK_RTD")
        protected BigDecimal dbchkrtd;
        @XmlElement(name = "VISA_DB")
        protected BigDecimal visadb;
        @XmlElement(name = "LAST_DEBIT")
        protected BigDecimal lastdebit;
        @XmlElement(name = "LAST_CREDIT")
        protected BigDecimal lastcredit;
        @XmlElement(name = "LAST_OVERDRAFT")
        protected BigDecimal lastoverdraft;
        @XmlElement(name = "DAYS_IN_DEBIT")
        protected BigDecimal daysindebit;
        @XmlElement(name = "DR_AVG_MONTHLY")
        protected BigDecimal dravgmonthly;
        @XmlElement(name = "DAYS_XOD")
        protected BigDecimal daysxod;
        @XmlElement(name = "MONTHLY_AVG")
        protected BigDecimal monthlyavg;
        @XmlElement(name = "NO_OVERDRAFT")
        protected BigDecimal nooverdraft;
        @XmlElement(name = "DAYS_IN_CREDIT")
        protected BigDecimal daysincredit;
        @XmlElement(name = "CR_AVG_MONTHLY")
        protected BigDecimal cravgmonthly;
        @XmlElement(name = "CUSTOMER_NO")
        protected String customerno;
        @XmlElement(name = "CUST_AC_NO")
        protected String custacno;
        @XmlElement(name = "CUSTOMER_NAME")
        protected String customername;
        @XmlElement(name = "BRANCH_CODE")
        protected String branchcode;
        @XmlElement(name = "TOT_BAL")
        protected BigDecimal totbal;
        @XmlElement(name = "DR_AVG")
        protected BigDecimal dravg;
        @XmlElement(name = "CR_AVG")
        protected BigDecimal cravg;
        @XmlElement(name = "XOD_AVG")
        protected BigDecimal xodavg;
        @XmlElement(name = "RUN_DATE")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar rundate;
        @XmlElement(name = "NO_RET_CHEQUES")
        protected BigDecimal noretcheques;

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
         * Gets the value of the simpleavgbal property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getSIMPLEAVGBAL() {
            return simpleavgbal;
        }

        /**
         * Sets the value of the simpleavgbal property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setSIMPLEAVGBAL(BigDecimal value) {
            this.simpleavgbal = value;
        }

        /**
         * Gets the value of the minbal property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMINBAL() {
            return minbal;
        }

        /**
         * Sets the value of the minbal property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setMINBAL(BigDecimal value) {
            this.minbal = value;
        }

        /**
         * Gets the value of the maxbal property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMAXBAL() {
            return maxbal;
        }

        /**
         * Sets the value of the maxbal property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setMAXBAL(BigDecimal value) {
            this.maxbal = value;
        }

        /**
         * Gets the value of the nodrtransactions property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getNODRTRANSACTIONS() {
            return nodrtransactions;
        }

        /**
         * Sets the value of the nodrtransactions property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setNODRTRANSACTIONS(BigDecimal value) {
            this.nodrtransactions = value;
        }

        /**
         * Gets the value of the nocrtransaction property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getNOCRTRANSACTION() {
            return nocrtransaction;
        }

        /**
         * Sets the value of the nocrtransaction property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setNOCRTRANSACTION(BigDecimal value) {
            this.nocrtransaction = value;
        }

        /**
         * Gets the value of the closingbal property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getCLOSINGBAL() {
            return closingbal;
        }

        /**
         * Sets the value of the closingbal property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setCLOSINGBAL(BigDecimal value) {
            this.closingbal = value;
        }

        /**
         * Gets the value of the drint property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getDRINT() {
            return drint;
        }

        /**
         * Sets the value of the drint property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setDRINT(BigDecimal value) {
            this.drint = value;
        }

        /**
         * Gets the value of the nsf property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNSF() {
            return nsf;
        }

        /**
         * Sets the value of the nsf property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNSF(String value) {
            this.nsf = value;
        }

        /**
         * Gets the value of the chgtr property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getCHGTR() {
            return chgtr;
        }

        /**
         * Sets the value of the chgtr property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setCHGTR(BigDecimal value) {
            this.chgtr = value;
        }

        /**
         * Gets the value of the dbchkrtd property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getDBCHKRTD() {
            return dbchkrtd;
        }

        /**
         * Sets the value of the dbchkrtd property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setDBCHKRTD(BigDecimal value) {
            this.dbchkrtd = value;
        }

        /**
         * Gets the value of the visadb property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getVISADB() {
            return visadb;
        }

        /**
         * Sets the value of the visadb property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setVISADB(BigDecimal value) {
            this.visadb = value;
        }

        /**
         * Gets the value of the lastdebit property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getLASTDEBIT() {
            return lastdebit;
        }

        /**
         * Sets the value of the lastdebit property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setLASTDEBIT(BigDecimal value) {
            this.lastdebit = value;
        }

        /**
         * Gets the value of the lastcredit property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getLASTCREDIT() {
            return lastcredit;
        }

        /**
         * Sets the value of the lastcredit property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setLASTCREDIT(BigDecimal value) {
            this.lastcredit = value;
        }

        /**
         * Gets the value of the lastoverdraft property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getLASTOVERDRAFT() {
            return lastoverdraft;
        }

        /**
         * Sets the value of the lastoverdraft property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setLASTOVERDRAFT(BigDecimal value) {
            this.lastoverdraft = value;
        }

        /**
         * Gets the value of the daysindebit property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getDAYSINDEBIT() {
            return daysindebit;
        }

        /**
         * Sets the value of the daysindebit property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setDAYSINDEBIT(BigDecimal value) {
            this.daysindebit = value;
        }

        /**
         * Gets the value of the dravgmonthly property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getDRAVGMONTHLY() {
            return dravgmonthly;
        }

        /**
         * Sets the value of the dravgmonthly property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setDRAVGMONTHLY(BigDecimal value) {
            this.dravgmonthly = value;
        }

        /**
         * Gets the value of the daysxod property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getDAYSXOD() {
            return daysxod;
        }

        /**
         * Sets the value of the daysxod property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setDAYSXOD(BigDecimal value) {
            this.daysxod = value;
        }

        /**
         * Gets the value of the monthlyavg property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMONTHLYAVG() {
            return monthlyavg;
        }

        /**
         * Sets the value of the monthlyavg property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setMONTHLYAVG(BigDecimal value) {
            this.monthlyavg = value;
        }

        /**
         * Gets the value of the nooverdraft property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getNOOVERDRAFT() {
            return nooverdraft;
        }

        /**
         * Sets the value of the nooverdraft property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setNOOVERDRAFT(BigDecimal value) {
            this.nooverdraft = value;
        }

        /**
         * Gets the value of the daysincredit property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getDAYSINCREDIT() {
            return daysincredit;
        }

        /**
         * Sets the value of the daysincredit property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setDAYSINCREDIT(BigDecimal value) {
            this.daysincredit = value;
        }

        /**
         * Gets the value of the cravgmonthly property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getCRAVGMONTHLY() {
            return cravgmonthly;
        }

        /**
         * Sets the value of the cravgmonthly property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setCRAVGMONTHLY(BigDecimal value) {
            this.cravgmonthly = value;
        }

        /**
         * Gets the value of the customerno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCUSTOMERNO() {
            return customerno;
        }

        /**
         * Sets the value of the customerno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCUSTOMERNO(String value) {
            this.customerno = value;
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
         * Gets the value of the customername property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCUSTOMERNAME() {
            return customername;
        }

        /**
         * Sets the value of the customername property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCUSTOMERNAME(String value) {
            this.customername = value;
        }

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
         * Gets the value of the totbal property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTOTBAL() {
            return totbal;
        }

        /**
         * Sets the value of the totbal property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTOTBAL(BigDecimal value) {
            this.totbal = value;
        }

        /**
         * Gets the value of the dravg property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getDRAVG() {
            return dravg;
        }

        /**
         * Sets the value of the dravg property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setDRAVG(BigDecimal value) {
            this.dravg = value;
        }

        /**
         * Gets the value of the cravg property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getCRAVG() {
            return cravg;
        }

        /**
         * Sets the value of the cravg property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setCRAVG(BigDecimal value) {
            this.cravg = value;
        }

        /**
         * Gets the value of the xodavg property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getXODAVG() {
            return xodavg;
        }

        /**
         * Sets the value of the xodavg property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setXODAVG(BigDecimal value) {
            this.xodavg = value;
        }

        /**
         * Gets the value of the rundate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getRUNDATE() {
            return rundate;
        }

        /**
         * Sets the value of the rundate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setRUNDATE(XMLGregorianCalendar value) {
            this.rundate = value;
        }

        /**
         * Gets the value of the noretcheques property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getNORETCHEQUES() {
            return noretcheques;
        }

        /**
         * Sets the value of the noretcheques property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setNORETCHEQUES(BigDecimal value) {
            this.noretcheques = value;
        }

    }

}
