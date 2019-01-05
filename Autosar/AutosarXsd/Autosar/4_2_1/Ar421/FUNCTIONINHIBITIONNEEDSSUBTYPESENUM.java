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
 * <p>FUNCTION-INHIBITION-NEEDS--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="FUNCTION-INHIBITION-NEEDS--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FUNCTION-INHIBITION-NEEDS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FUNCTION-INHIBITION-NEEDS--SUBTYPES-ENUM")
@XmlEnum
public enum FUNCTIONINHIBITIONNEEDSSUBTYPESENUM {

    @XmlEnumValue("FUNCTION-INHIBITION-NEEDS")
    FUNCTION___INHIBITION___NEEDS("FUNCTION-INHIBITION-NEEDS");
    private final String value;

    FUNCTIONINHIBITIONNEEDSSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FUNCTIONINHIBITIONNEEDSSUBTYPESENUM fromValue(String v) {
        for (FUNCTIONINHIBITIONNEEDSSUBTYPESENUM c: FUNCTIONINHIBITIONNEEDSSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
