//
// ????? JavaTM Architecture for XML Binding (JAXB) ???? v2.2.8-b130911.1802 ???
// ??? <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// ?????????, ??????????????
// ????: 2018.03.12 ?? 11:42:22 PM CET 
//


package Ar421;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GENERAL-PURPOSE-PDU--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="GENERAL-PURPOSE-PDU--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GENERAL-PURPOSE-PDU"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GENERAL-PURPOSE-PDU--SUBTYPES-ENUM")
@XmlEnum
public enum GENERALPURPOSEPDUSUBTYPESENUM {

    @XmlEnumValue("GENERAL-PURPOSE-PDU")
    GENERAL___PURPOSE___PDU("GENERAL-PURPOSE-PDU");
    private final String value;

    GENERALPURPOSEPDUSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GENERALPURPOSEPDUSUBTYPESENUM fromValue(String v) {
        for (GENERALPURPOSEPDUSUBTYPESENUM c: GENERALPURPOSEPDUSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}