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
 * <p>DIAGNOSTIC-WRITE-DATA-BY-IDENTIFIER-CLASS--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="DIAGNOSTIC-WRITE-DATA-BY-IDENTIFIER-CLASS--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DIAGNOSTIC-WRITE-DATA-BY-IDENTIFIER-CLASS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DIAGNOSTIC-WRITE-DATA-BY-IDENTIFIER-CLASS--SUBTYPES-ENUM")
@XmlEnum
public enum DIAGNOSTICWRITEDATABYIDENTIFIERCLASSSUBTYPESENUM {

    @XmlEnumValue("DIAGNOSTIC-WRITE-DATA-BY-IDENTIFIER-CLASS")
    DIAGNOSTIC___WRITE___DATA___BY___IDENTIFIER___CLASS("DIAGNOSTIC-WRITE-DATA-BY-IDENTIFIER-CLASS");
    private final String value;

    DIAGNOSTICWRITEDATABYIDENTIFIERCLASSSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DIAGNOSTICWRITEDATABYIDENTIFIERCLASSSUBTYPESENUM fromValue(String v) {
        for (DIAGNOSTICWRITEDATABYIDENTIFIERCLASSSUBTYPESENUM c: DIAGNOSTICWRITEDATABYIDENTIFIERCLASSSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}