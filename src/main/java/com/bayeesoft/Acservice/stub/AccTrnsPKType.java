
package com.bayeesoft.Acservice.stub;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccTrns-PK-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AccTrns-PK-Type">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ACCNO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="ACCBRN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="NUMOFTRN" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccTrns-PK-Type", propOrder = {
    "accno",
    "accbrn",
    "numoftrn"
})
public class AccTrnsPKType {

    @XmlElement(name = "ACCNO", required = true)
    protected String accno;
    @XmlElement(name = "ACCBRN", required = true)
    protected String accbrn;
    @XmlElement(name = "NUMOFTRN", required = true)
    protected BigDecimal numoftrn;

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

}
