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
 * <p>DIAGNOSTIC-DYNAMIC-DATA-IDENTIFIER--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="DIAGNOSTIC-DYNAMIC-DATA-IDENTIFIER--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DIAGNOSTIC-DYNAMIC-DATA-IDENTIFIER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DIAGNOSTIC-DYNAMIC-DATA-IDENTIFIER--SUBTYPES-ENUM")
@XmlEnum
public enum DIAGNOSTICDYNAMICDATAIDENTIFIERSUBTYPESENUM {

    @XmlEnumValue("DIAGNOSTIC-DYNAMIC-DATA-IDENTIFIER")
    DIAGNOSTIC___DYNAMIC___DATA___IDENTIFIER("DIAGNOSTIC-DYNAMIC-DATA-IDENTIFIER");
    private final String value;

    DIAGNOSTICDYNAMICDATAIDENTIFIERSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DIAGNOSTICDYNAMICDATAIDENTIFIERSUBTYPESENUM fromValue(String v) {
        for (DIAGNOSTICDYNAMICDATAIDENTIFIERSUBTYPESENUM c: DIAGNOSTICDYNAMICDATAIDENTIFIERSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
