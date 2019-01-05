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
 * <p>DIAGNOSTIC-ENABLE-CONDITION-GROUP--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="DIAGNOSTIC-ENABLE-CONDITION-GROUP--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DIAGNOSTIC-ENABLE-CONDITION-GROUP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DIAGNOSTIC-ENABLE-CONDITION-GROUP--SUBTYPES-ENUM")
@XmlEnum
public enum DIAGNOSTICENABLECONDITIONGROUPSUBTYPESENUM {

    @XmlEnumValue("DIAGNOSTIC-ENABLE-CONDITION-GROUP")
    DIAGNOSTIC___ENABLE___CONDITION___GROUP("DIAGNOSTIC-ENABLE-CONDITION-GROUP");
    private final String value;

    DIAGNOSTICENABLECONDITIONGROUPSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DIAGNOSTICENABLECONDITIONGROUPSUBTYPESENUM fromValue(String v) {
        for (DIAGNOSTICENABLECONDITIONGROUPSUBTYPESENUM c: DIAGNOSTICENABLECONDITIONGROUPSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
