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
 * <p>BSW-INTERNAL-TRIGGERING-POINT--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="BSW-INTERNAL-TRIGGERING-POINT--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BSW-INTERNAL-TRIGGERING-POINT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BSW-INTERNAL-TRIGGERING-POINT--SUBTYPES-ENUM")
@XmlEnum
public enum BSWINTERNALTRIGGERINGPOINTSUBTYPESENUM {

    @XmlEnumValue("BSW-INTERNAL-TRIGGERING-POINT")
    BSW___INTERNAL___TRIGGERING___POINT("BSW-INTERNAL-TRIGGERING-POINT");
    private final String value;

    BSWINTERNALTRIGGERINGPOINTSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BSWINTERNALTRIGGERINGPOINTSUBTYPESENUM fromValue(String v) {
        for (BSWINTERNALTRIGGERINGPOINTSUBTYPESENUM c: BSWINTERNALTRIGGERINGPOINTSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
