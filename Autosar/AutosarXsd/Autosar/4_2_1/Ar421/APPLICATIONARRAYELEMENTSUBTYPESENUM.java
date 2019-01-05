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
 * <p>APPLICATION-ARRAY-ELEMENT--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="APPLICATION-ARRAY-ELEMENT--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="APPLICATION-ARRAY-ELEMENT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "APPLICATION-ARRAY-ELEMENT--SUBTYPES-ENUM")
@XmlEnum
public enum APPLICATIONARRAYELEMENTSUBTYPESENUM {

    @XmlEnumValue("APPLICATION-ARRAY-ELEMENT")
    APPLICATION___ARRAY___ELEMENT("APPLICATION-ARRAY-ELEMENT");
    private final String value;

    APPLICATIONARRAYELEMENTSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static APPLICATIONARRAYELEMENTSUBTYPESENUM fromValue(String v) {
        for (APPLICATIONARRAYELEMENTSUBTYPESENUM c: APPLICATIONARRAYELEMENTSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
