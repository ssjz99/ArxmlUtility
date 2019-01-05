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
 * <p>APPLICATION-RECORD-ELEMENT--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="APPLICATION-RECORD-ELEMENT--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="APPLICATION-RECORD-ELEMENT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "APPLICATION-RECORD-ELEMENT--SUBTYPES-ENUM")
@XmlEnum
public enum APPLICATIONRECORDELEMENTSUBTYPESENUM {

    @XmlEnumValue("APPLICATION-RECORD-ELEMENT")
    APPLICATION___RECORD___ELEMENT("APPLICATION-RECORD-ELEMENT");
    private final String value;

    APPLICATIONRECORDELEMENTSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static APPLICATIONRECORDELEMENTSUBTYPESENUM fromValue(String v) {
        for (APPLICATIONRECORDELEMENTSUBTYPESENUM c: APPLICATIONRECORDELEMENTSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
