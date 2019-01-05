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
 * <p>EXECUTABLE-ENTITY--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="EXECUTABLE-ENTITY--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BSW-CALLED-ENTITY"/>
 *     &lt;enumeration value="BSW-INTERRUPT-ENTITY"/>
 *     &lt;enumeration value="BSW-MODULE-ENTITY"/>
 *     &lt;enumeration value="BSW-SCHEDULABLE-ENTITY"/>
 *     &lt;enumeration value="EXECUTABLE-ENTITY"/>
 *     &lt;enumeration value="RUNNABLE-ENTITY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EXECUTABLE-ENTITY--SUBTYPES-ENUM")
@XmlEnum
public enum EXECUTABLEENTITYSUBTYPESENUM {

    @XmlEnumValue("BSW-CALLED-ENTITY")
    BSW___CALLED___ENTITY("BSW-CALLED-ENTITY"),
    @XmlEnumValue("BSW-INTERRUPT-ENTITY")
    BSW___INTERRUPT___ENTITY("BSW-INTERRUPT-ENTITY"),
    @XmlEnumValue("BSW-MODULE-ENTITY")
    BSW___MODULE___ENTITY("BSW-MODULE-ENTITY"),
    @XmlEnumValue("BSW-SCHEDULABLE-ENTITY")
    BSW___SCHEDULABLE___ENTITY("BSW-SCHEDULABLE-ENTITY"),
    @XmlEnumValue("EXECUTABLE-ENTITY")
    EXECUTABLE___ENTITY("EXECUTABLE-ENTITY"),
    @XmlEnumValue("RUNNABLE-ENTITY")
    RUNNABLE___ENTITY("RUNNABLE-ENTITY");
    private final String value;

    EXECUTABLEENTITYSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EXECUTABLEENTITYSUBTYPESENUM fromValue(String v) {
        for (EXECUTABLEENTITYSUBTYPESENUM c: EXECUTABLEENTITYSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
