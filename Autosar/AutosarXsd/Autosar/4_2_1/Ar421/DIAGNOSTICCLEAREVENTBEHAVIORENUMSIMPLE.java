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
 * <p>DIAGNOSTIC-CLEAR-EVENT-BEHAVIOR-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="DIAGNOSTIC-CLEAR-EVENT-BEHAVIOR-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO-STATUS-BYTE-CHANGE"/>
 *     &lt;enumeration value="ONLY-THIS-CYCLE-AND-READINESS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DIAGNOSTIC-CLEAR-EVENT-BEHAVIOR-ENUM--SIMPLE")
@XmlEnum
public enum DIAGNOSTICCLEAREVENTBEHAVIORENUMSIMPLE {


    /**
     * The event status byte keeps unchanged.
     * 
     */
    @XmlEnumValue("NO-STATUS-BYTE-CHANGE")
    NO___STATUS___BYTE___CHANGE("NO-STATUS-BYTE-CHANGE"),

    /**
     * The OperationCycle and readiness bits of the event status byte are reset.
     * 
     */
    @XmlEnumValue("ONLY-THIS-CYCLE-AND-READINESS")
    ONLY___THIS___CYCLE___AND___READINESS("ONLY-THIS-CYCLE-AND-READINESS");
    private final String value;

    DIAGNOSTICCLEAREVENTBEHAVIORENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DIAGNOSTICCLEAREVENTBEHAVIORENUMSIMPLE fromValue(String v) {
        for (DIAGNOSTICCLEAREVENTBEHAVIORENUMSIMPLE c: DIAGNOSTICCLEAREVENTBEHAVIORENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
