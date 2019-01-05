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
 * <p>SCALE-CONSTR-VALIDITY-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="SCALE-CONSTR-VALIDITY-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NOT-AVAILABLE"/>
 *     &lt;enumeration value="NOT-DEFINED"/>
 *     &lt;enumeration value="NOT-VALID"/>
 *     &lt;enumeration value="VALID"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SCALE-CONSTR-VALIDITY-ENUM--SIMPLE")
@XmlEnum
public enum SCALECONSTRVALIDITYENUMSIMPLE {


    /**
     * Currently invalid area
     * The value usually is presented by the ECU but can currently not be performed
     * due to e.g. initialization or temporary problems. Please note, that this behavior
     * appears during runtime and cannot be handled while data is edited.
     * 
     */
    @XmlEnumValue("NOT-AVAILABLE")
    NOT___AVAILABLE("NOT-AVAILABLE"),

    /**
     * Indicates an area which is marked in a specification (e.g. as reserved)
     * Shall usually not be set by the ECU but is used by a tester to verify correct ECU.
     * 
     */
    @XmlEnumValue("NOT-DEFINED")
    NOT___DEFINED("NOT-DEFINED"),

    /**
     * The ECU cannot process the requested data.
     * 
     */
    @XmlEnumValue("NOT-VALID")
    NOT___VALID("NOT-VALID"),

    /**
     * Current value is within a valid range and can be presented to user as is.
     * 
     */
    VALID("VALID");
    private final String value;

    SCALECONSTRVALIDITYENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SCALECONSTRVALIDITYENUMSIMPLE fromValue(String v) {
        for (SCALECONSTRVALIDITYENUMSIMPLE c: SCALECONSTRVALIDITYENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
