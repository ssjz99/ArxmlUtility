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
 * <p>DIAGNOSTIC-STORAGE-CONDITION--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="DIAGNOSTIC-STORAGE-CONDITION--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DIAGNOSTIC-STORAGE-CONDITION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DIAGNOSTIC-STORAGE-CONDITION--SUBTYPES-ENUM")
@XmlEnum
public enum DIAGNOSTICSTORAGECONDITIONSUBTYPESENUM {

    @XmlEnumValue("DIAGNOSTIC-STORAGE-CONDITION")
    DIAGNOSTIC___STORAGE___CONDITION("DIAGNOSTIC-STORAGE-CONDITION");
    private final String value;

    DIAGNOSTICSTORAGECONDITIONSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DIAGNOSTICSTORAGECONDITIONSUBTYPESENUM fromValue(String v) {
        for (DIAGNOSTICSTORAGECONDITIONSUBTYPESENUM c: DIAGNOSTICSTORAGECONDITIONSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
