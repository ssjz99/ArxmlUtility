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
 * <p>REENTRANCY-LEVEL-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="REENTRANCY-LEVEL-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MULTICORE-REENTRANT"/>
 *     &lt;enumeration value="NON-REENTRANT"/>
 *     &lt;enumeration value="SINGLE-CORE-REENTRANT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "REENTRANCY-LEVEL-ENUM--SIMPLE")
@XmlEnum
public enum REENTRANCYLEVELENUMSIMPLE {


    /**
     * Unlimited concurrent execution of this entity is possible, including preemption and parallel execution on multi core systems.
     * 
     */
    @XmlEnumValue("MULTICORE-REENTRANT")
    MULTICORE___REENTRANT("MULTICORE-REENTRANT"),

    /**
     * Concurrent execution of this entity is not possible.
     * 
     */
    @XmlEnumValue("NON-REENTRANT")
    NON___REENTRANT("NON-REENTRANT"),

    /**
     * Pseudo-concurrent execution (i.e. preemption) of this entity is possible on single core systems.
     * 
     */
    @XmlEnumValue("SINGLE-CORE-REENTRANT")
    SINGLE___CORE___REENTRANT("SINGLE-CORE-REENTRANT");
    private final String value;

    REENTRANCYLEVELENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static REENTRANCYLEVELENUMSIMPLE fromValue(String v) {
        for (REENTRANCYLEVELENUMSIMPLE c: REENTRANCYLEVELENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
