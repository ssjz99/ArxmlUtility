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
 * <p>DIAGNOSTIC-ENABLE-CONDITION--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="DIAGNOSTIC-ENABLE-CONDITION--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DIAGNOSTIC-ENABLE-CONDITION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DIAGNOSTIC-ENABLE-CONDITION--SUBTYPES-ENUM")
@XmlEnum
public enum DIAGNOSTICENABLECONDITIONSUBTYPESENUM {

    @XmlEnumValue("DIAGNOSTIC-ENABLE-CONDITION")
    DIAGNOSTIC___ENABLE___CONDITION("DIAGNOSTIC-ENABLE-CONDITION");
    private final String value;

    DIAGNOSTICENABLECONDITIONSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DIAGNOSTICENABLECONDITIONSUBTYPESENUM fromValue(String v) {
        for (DIAGNOSTICENABLECONDITIONSUBTYPESENUM c: DIAGNOSTICENABLECONDITIONSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}