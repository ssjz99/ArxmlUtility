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
 * <p>TD-EVENT-BSW-INTERNAL-BEHAVIOR-TYPE-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="TD-EVENT-BSW-INTERNAL-BEHAVIOR-TYPE-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BSW-MODULE-ENTITY-ACTIVATED"/>
 *     &lt;enumeration value="BSW-MODULE-ENTITY-STARTED"/>
 *     &lt;enumeration value="BSW-MODULE-ENTITY-TERMINATED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TD-EVENT-BSW-INTERNAL-BEHAVIOR-TYPE-ENUM--SIMPLE")
@XmlEnum
public enum TDEVENTBSWINTERNALBEHAVIORTYPEENUMSIMPLE {


    /**
     * A point in time where the associated BswModuleEntity has been activated, which means that it has entered the state "to be started".
     * 
     */
    @XmlEnumValue("BSW-MODULE-ENTITY-ACTIVATED")
    BSW___MODULE___ENTITY___ACTIVATED("BSW-MODULE-ENTITY-ACTIVATED"),

    /**
     * A point in time where the associated BswModuleEntity has entered the state "started" after its activation.
     * 
     */
    @XmlEnumValue("BSW-MODULE-ENTITY-STARTED")
    BSW___MODULE___ENTITY___STARTED("BSW-MODULE-ENTITY-STARTED"),

    /**
     * A point in time where the associated BswModuleEntity has terminated and entered the state "suspended"
     * 
     */
    @XmlEnumValue("BSW-MODULE-ENTITY-TERMINATED")
    BSW___MODULE___ENTITY___TERMINATED("BSW-MODULE-ENTITY-TERMINATED");
    private final String value;

    TDEVENTBSWINTERNALBEHAVIORTYPEENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TDEVENTBSWINTERNALBEHAVIORTYPEENUMSIMPLE fromValue(String v) {
        for (TDEVENTBSWINTERNALBEHAVIORTYPEENUMSIMPLE c: TDEVENTBSWINTERNALBEHAVIORTYPEENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
