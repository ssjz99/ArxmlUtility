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
 * <p>DIAGNOSTIC-MEMORY-IDENTIFIER--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="DIAGNOSTIC-MEMORY-IDENTIFIER--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DIAGNOSTIC-MEMORY-IDENTIFIER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DIAGNOSTIC-MEMORY-IDENTIFIER--SUBTYPES-ENUM")
@XmlEnum
public enum DIAGNOSTICMEMORYIDENTIFIERSUBTYPESENUM {

    @XmlEnumValue("DIAGNOSTIC-MEMORY-IDENTIFIER")
    DIAGNOSTIC___MEMORY___IDENTIFIER("DIAGNOSTIC-MEMORY-IDENTIFIER");
    private final String value;

    DIAGNOSTICMEMORYIDENTIFIERSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DIAGNOSTICMEMORYIDENTIFIERSUBTYPESENUM fromValue(String v) {
        for (DIAGNOSTICMEMORYIDENTIFIERSUBTYPESENUM c: DIAGNOSTICMEMORYIDENTIFIERSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
