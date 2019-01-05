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
 * <p>INTERNAL-TRIGGERING-POINT--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="INTERNAL-TRIGGERING-POINT--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INTERNAL-TRIGGERING-POINT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "INTERNAL-TRIGGERING-POINT--SUBTYPES-ENUM")
@XmlEnum
public enum INTERNALTRIGGERINGPOINTSUBTYPESENUM {

    @XmlEnumValue("INTERNAL-TRIGGERING-POINT")
    INTERNAL___TRIGGERING___POINT("INTERNAL-TRIGGERING-POINT");
    private final String value;

    INTERNALTRIGGERINGPOINTSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static INTERNALTRIGGERINGPOINTSUBTYPESENUM fromValue(String v) {
        for (INTERNALTRIGGERINGPOINTSUBTYPESENUM c: INTERNALTRIGGERINGPOINTSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
