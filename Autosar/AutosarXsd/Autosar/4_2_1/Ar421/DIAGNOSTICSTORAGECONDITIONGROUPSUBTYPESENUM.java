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
 * <p>DIAGNOSTIC-STORAGE-CONDITION-GROUP--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="DIAGNOSTIC-STORAGE-CONDITION-GROUP--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DIAGNOSTIC-STORAGE-CONDITION-GROUP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DIAGNOSTIC-STORAGE-CONDITION-GROUP--SUBTYPES-ENUM")
@XmlEnum
public enum DIAGNOSTICSTORAGECONDITIONGROUPSUBTYPESENUM {

    @XmlEnumValue("DIAGNOSTIC-STORAGE-CONDITION-GROUP")
    DIAGNOSTIC___STORAGE___CONDITION___GROUP("DIAGNOSTIC-STORAGE-CONDITION-GROUP");
    private final String value;

    DIAGNOSTICSTORAGECONDITIONGROUPSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DIAGNOSTICSTORAGECONDITIONGROUPSUBTYPESENUM fromValue(String v) {
        for (DIAGNOSTICSTORAGECONDITIONGROUPSUBTYPESENUM c: DIAGNOSTICSTORAGECONDITIONGROUPSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
