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
 * <p>DIAGNOSTIC-CONNECTED-INDICATOR-BEHAVIOR-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="DIAGNOSTIC-CONNECTED-INDICATOR-BEHAVIOR-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BLINK-MODE"/>
 *     &lt;enumeration value="BLINK-OR-CONTINUOUS-ON-MODE"/>
 *     &lt;enumeration value="CONTINUOUS-ON-MODE"/>
 *     &lt;enumeration value="FAST-FLASHING-MODE"/>
 *     &lt;enumeration value="SLOW-FLASHING-MODE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DIAGNOSTIC-CONNECTED-INDICATOR-BEHAVIOR-ENUM--SIMPLE")
@XmlEnum
public enum DIAGNOSTICCONNECTEDINDICATORBEHAVIORENUMSIMPLE {


    /**
     * The indicator blinks when the event has status FAILED.
     * 
     */
    @XmlEnumValue("BLINK-MODE")
    BLINK___MODE("BLINK-MODE"),

    /**
     * The indicator is active and blinks when the event has status FAILED.
     * 
     */
    @XmlEnumValue("BLINK-OR-CONTINUOUS-ON-MODE")
    BLINK___OR___CONTINUOUS___ON___MODE("BLINK-OR-CONTINUOUS-ON-MODE"),

    /**
     * The indicator is active when the event has status FAILED.
     * 
     */
    @XmlEnumValue("CONTINUOUS-ON-MODE")
    CONTINUOUS___ON___MODE("CONTINUOUS-ON-MODE"),

    /**
     * Flash Indicator Lamp should be set to "Fast Flash".
     * 
     */
    @XmlEnumValue("FAST-FLASHING-MODE")
    FAST___FLASHING___MODE("FAST-FLASHING-MODE"),

    /**
     * Flash Indicator Lamp should be set to "Slow Flash".
     * 
     */
    @XmlEnumValue("SLOW-FLASHING-MODE")
    SLOW___FLASHING___MODE("SLOW-FLASHING-MODE");
    private final String value;

    DIAGNOSTICCONNECTEDINDICATORBEHAVIORENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DIAGNOSTICCONNECTEDINDICATORBEHAVIORENUMSIMPLE fromValue(String v) {
        for (DIAGNOSTICCONNECTEDINDICATORBEHAVIORENUMSIMPLE c: DIAGNOSTICCONNECTEDINDICATORBEHAVIORENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
