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
 * <p>TD-EVENT-SWC-INTERNAL-BEHAVIOR-TYPE-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="TD-EVENT-SWC-INTERNAL-BEHAVIOR-TYPE-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RUNNABLE-ENTITY-ACTIVATED"/>
 *     &lt;enumeration value="RUNNABLE-ENTITY-STARTED"/>
 *     &lt;enumeration value="RUNNABLE-ENTITY-TERMINATED"/>
 *     &lt;enumeration value="RUNNABLE-ENTITY-VARIABLE-ACCESS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TD-EVENT-SWC-INTERNAL-BEHAVIOR-TYPE-ENUM--SIMPLE")
@XmlEnum
public enum TDEVENTSWCINTERNALBEHAVIORTYPEENUMSIMPLE {


    /**
     * A point in time where the associated RunnableEntity has been activated, which means that it has entered the state "to be started".
     * 
     */
    @XmlEnumValue("RUNNABLE-ENTITY-ACTIVATED")
    RUNNABLE___ENTITY___ACTIVATED("RUNNABLE-ENTITY-ACTIVATED"),

    /**
     * A point in time where the associated RunnableEntity has entered the state "started" after its activation.
     * 
     */
    @XmlEnumValue("RUNNABLE-ENTITY-STARTED")
    RUNNABLE___ENTITY___STARTED("RUNNABLE-ENTITY-STARTED"),

    /**
     * A point in time where the associated RunnableEntity has terminated and entered the state "suspended".
     * 
     */
    @XmlEnumValue("RUNNABLE-ENTITY-TERMINATED")
    RUNNABLE___ENTITY___TERMINATED("RUNNABLE-ENTITY-TERMINATED"),

    /**
     * A point in time where the associated variable is accessed.
     * 
     */
    @XmlEnumValue("RUNNABLE-ENTITY-VARIABLE-ACCESS")
    RUNNABLE___ENTITY___VARIABLE___ACCESS("RUNNABLE-ENTITY-VARIABLE-ACCESS");
    private final String value;

    TDEVENTSWCINTERNALBEHAVIORTYPEENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TDEVENTSWCINTERNALBEHAVIORTYPEENUMSIMPLE fromValue(String v) {
        for (TDEVENTSWCINTERNALBEHAVIORTYPEENUMSIMPLE c: TDEVENTSWCINTERNALBEHAVIORTYPEENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
