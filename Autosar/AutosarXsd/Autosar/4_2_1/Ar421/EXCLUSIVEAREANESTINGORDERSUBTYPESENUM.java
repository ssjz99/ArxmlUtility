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
 * <p>EXCLUSIVE-AREA-NESTING-ORDER--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="EXCLUSIVE-AREA-NESTING-ORDER--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EXCLUSIVE-AREA-NESTING-ORDER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EXCLUSIVE-AREA-NESTING-ORDER--SUBTYPES-ENUM")
@XmlEnum
public enum EXCLUSIVEAREANESTINGORDERSUBTYPESENUM {

    @XmlEnumValue("EXCLUSIVE-AREA-NESTING-ORDER")
    EXCLUSIVE___AREA___NESTING___ORDER("EXCLUSIVE-AREA-NESTING-ORDER");
    private final String value;

    EXCLUSIVEAREANESTINGORDERSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EXCLUSIVEAREANESTINGORDERSUBTYPESENUM fromValue(String v) {
        for (EXCLUSIVEAREANESTINGORDERSUBTYPESENUM c: EXCLUSIVEAREANESTINGORDERSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
