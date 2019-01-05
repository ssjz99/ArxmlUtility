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
 * <p>DIAGNOSTIC-DYNAMICALLY-DEFINE-DATA-IDENTIFIER-CLASS--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="DIAGNOSTIC-DYNAMICALLY-DEFINE-DATA-IDENTIFIER-CLASS--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DIAGNOSTIC-DYNAMICALLY-DEFINE-DATA-IDENTIFIER-CLASS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DIAGNOSTIC-DYNAMICALLY-DEFINE-DATA-IDENTIFIER-CLASS--SUBTYPES-ENUM")
@XmlEnum
public enum DIAGNOSTICDYNAMICALLYDEFINEDATAIDENTIFIERCLASSSUBTYPESENUM {

    @XmlEnumValue("DIAGNOSTIC-DYNAMICALLY-DEFINE-DATA-IDENTIFIER-CLASS")
    DIAGNOSTIC___DYNAMICALLY___DEFINE___DATA___IDENTIFIER___CLASS("DIAGNOSTIC-DYNAMICALLY-DEFINE-DATA-IDENTIFIER-CLASS");
    private final String value;

    DIAGNOSTICDYNAMICALLYDEFINEDATAIDENTIFIERCLASSSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DIAGNOSTICDYNAMICALLYDEFINEDATAIDENTIFIERCLASSSUBTYPESENUM fromValue(String v) {
        for (DIAGNOSTICDYNAMICALLYDEFINEDATAIDENTIFIERCLASSSUBTYPESENUM c: DIAGNOSTICDYNAMICALLYDEFINEDATAIDENTIFIERCLASSSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
