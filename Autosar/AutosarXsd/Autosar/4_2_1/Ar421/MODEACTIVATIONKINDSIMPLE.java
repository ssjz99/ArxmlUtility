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
 * <p>MODE-ACTIVATION-KIND--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="MODE-ACTIVATION-KIND--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ON-ENTRY"/>
 *     &lt;enumeration value="ON-EXIT"/>
 *     &lt;enumeration value="ON-TRANSITION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MODE-ACTIVATION-KIND--SIMPLE")
@XmlEnum
public enum MODEACTIVATIONKINDSIMPLE {


    /**
     * On entering the referred mode.
     * 
     */
    @XmlEnumValue("ON-ENTRY")
    ON___ENTRY("ON-ENTRY"),

    /**
     * On exiting the referred mode.
     * 
     */
    @XmlEnumValue("ON-EXIT")
    ON___EXIT("ON-EXIT"),

    /**
     * On transition of the 1st referred mode to the 2nd referred mode.
     * 
     */
    @XmlEnumValue("ON-TRANSITION")
    ON___TRANSITION("ON-TRANSITION");
    private final String value;

    MODEACTIVATIONKINDSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MODEACTIVATIONKINDSIMPLE fromValue(String v) {
        for (MODEACTIVATIONKINDSIMPLE c: MODEACTIVATIONKINDSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
