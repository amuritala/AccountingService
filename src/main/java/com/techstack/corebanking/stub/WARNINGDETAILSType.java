
package com.techstack.corebanking.stub;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WARNINGDETAILSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="WARNINGDETAILSType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="WCODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="WDESC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WARNINGDETAILSType", propOrder = {
    "wcode",
    "wdesc"
})
public class WARNINGDETAILSType {

    @XmlElement(name = "WCODE", required = true)
    protected String wcode;
    @XmlElement(name = "WDESC", required = true)
    protected String wdesc;

    /**
     * Gets the value of the wcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWCODE() {
        return wcode;
    }

    /**
     * Sets the value of the wcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWCODE(String value) {
        this.wcode = value;
    }

    /**
     * Gets the value of the wdesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWDESC() {
        return wdesc;
    }

    /**
     * Sets the value of the wdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWDESC(String value) {
        this.wdesc = value;
    }

}
