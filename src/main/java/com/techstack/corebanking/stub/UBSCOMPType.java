
package com.techstack.corebanking.stub;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UBSCOMPType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="UBSCOMPType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FCUBS"/>
 *     <enumeration value="FCIS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "UBSCOMPType")
@XmlEnum
public enum UBSCOMPType {

    FCUBS,
    FCIS;

    public String value() {
        return name();
    }

    public static UBSCOMPType fromValue(String v) {
        return valueOf(v);
    }

}
