
package com.bayeesoft.Acservice.stub;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MsgStatType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="MsgStatType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SUCCESS"/>
 *     <enumeration value="WARNING"/>
 *     <enumeration value="FAILURE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "MsgStatType")
@XmlEnum
public enum MsgStatType {

    SUCCESS,
    WARNING,
    FAILURE;

    public String value() {
        return name();
    }

    public static MsgStatType fromValue(String v) {
        return valueOf(v);
    }

}
