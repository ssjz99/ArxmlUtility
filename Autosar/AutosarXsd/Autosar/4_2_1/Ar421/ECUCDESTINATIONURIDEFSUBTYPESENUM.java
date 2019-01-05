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
 * <p>ECUC-DESTINATION-URI-DEF--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="ECUC-DESTINATION-URI-DEF--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ECUC-DESTINATION-URI-DEF"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ECUC-DESTINATION-URI-DEF--SUBTYPES-ENUM")
@XmlEnum
public enum ECUCDESTINATIONURIDEFSUBTYPESENUM {

    @XmlEnumValue("ECUC-DESTINATION-URI-DEF")
    ECUC___DESTINATION___URI___DEF("ECUC-DESTINATION-URI-DEF");
    private final String value;

    ECUCDESTINATIONURIDEFSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ECUCDESTINATIONURIDEFSUBTYPESENUM fromValue(String v) {
        for (ECUCDESTINATIONURIDEFSUBTYPESENUM c: ECUCDESTINATIONURIDEFSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
