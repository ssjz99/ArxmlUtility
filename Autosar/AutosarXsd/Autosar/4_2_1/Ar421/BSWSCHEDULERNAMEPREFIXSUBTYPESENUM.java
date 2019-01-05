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
 * <p>BSW-SCHEDULER-NAME-PREFIX--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="BSW-SCHEDULER-NAME-PREFIX--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BSW-SCHEDULER-NAME-PREFIX"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BSW-SCHEDULER-NAME-PREFIX--SUBTYPES-ENUM")
@XmlEnum
public enum BSWSCHEDULERNAMEPREFIXSUBTYPESENUM {

    @XmlEnumValue("BSW-SCHEDULER-NAME-PREFIX")
    BSW___SCHEDULER___NAME___PREFIX("BSW-SCHEDULER-NAME-PREFIX");
    private final String value;

    BSWSCHEDULERNAMEPREFIXSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BSWSCHEDULERNAMEPREFIXSUBTYPESENUM fromValue(String v) {
        for (BSWSCHEDULERNAMEPREFIXSUBTYPESENUM c: BSWSCHEDULERNAMEPREFIXSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
