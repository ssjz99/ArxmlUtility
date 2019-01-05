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
 * <p>TD-EVENT-TRIGGER-TYPE-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="TD-EVENT-TRIGGER-TYPE-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TRIGGER-ACTIVATED"/>
 *     &lt;enumeration value="TRIGGER-RELEASED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TD-EVENT-TRIGGER-TYPE-ENUM--SIMPLE")
@XmlEnum
public enum TDEVENTTRIGGERTYPEENUMSIMPLE {


    /**
     * A point in time where the referenced trigger has been successfully released and is activating runnable entities of the receiving SW-C.
     * 
     */
    @XmlEnumValue("TRIGGER-ACTIVATED")
    TRIGGER___ACTIVATED("TRIGGER-ACTIVATED"),

    /**
     * A point in time where the referenced trigger has been successfully released by the emitting SW-C.
     * 
     */
    @XmlEnumValue("TRIGGER-RELEASED")
    TRIGGER___RELEASED("TRIGGER-RELEASED");
    private final String value;

    TDEVENTTRIGGERTYPEENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TDEVENTTRIGGERTYPEENUMSIMPLE fromValue(String v) {
        for (TDEVENTTRIGGERTYPEENUMSIMPLE c: TDEVENTTRIGGERTYPEENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
