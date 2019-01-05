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
 * <p>DIAGNOSTIC-READ-DATA-BY-PERIODIC-ID-CLASS--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="DIAGNOSTIC-READ-DATA-BY-PERIODIC-ID-CLASS--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DIAGNOSTIC-READ-DATA-BY-PERIODIC-ID-CLASS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DIAGNOSTIC-READ-DATA-BY-PERIODIC-ID-CLASS--SUBTYPES-ENUM")
@XmlEnum
public enum DIAGNOSTICREADDATABYPERIODICIDCLASSSUBTYPESENUM {

    @XmlEnumValue("DIAGNOSTIC-READ-DATA-BY-PERIODIC-ID-CLASS")
    DIAGNOSTIC___READ___DATA___BY___PERIODIC___ID___CLASS("DIAGNOSTIC-READ-DATA-BY-PERIODIC-ID-CLASS");
    private final String value;

    DIAGNOSTICREADDATABYPERIODICIDCLASSSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DIAGNOSTICREADDATABYPERIODICIDCLASSSUBTYPESENUM fromValue(String v) {
        for (DIAGNOSTICREADDATABYPERIODICIDCLASSSUBTYPESENUM c: DIAGNOSTICREADDATABYPERIODICIDCLASSSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
