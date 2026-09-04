
package com.bayeesoft.Acservice.stub;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IntBranchParam-PK-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="IntBranchParam-PK-Type">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BRANCH1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="BRANCH2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntBranchParam-PK-Type", propOrder = {
    "branch1",
    "branch2"
})
public class IntBranchParamPKType {

    @XmlElement(name = "BRANCH1")
    protected String branch1;
    @XmlElement(name = "BRANCH2")
    protected String branch2;

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

}
