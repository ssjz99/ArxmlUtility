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
 * <p>RUNNABLE-ENTITY-GROUP--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="RUNNABLE-ENTITY-GROUP--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RUNNABLE-ENTITY-GROUP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RUNNABLE-ENTITY-GROUP--SUBTYPES-ENUM")
@XmlEnum
public enum RUNNABLEENTITYGROUPSUBTYPESENUM {

    @XmlEnumValue("RUNNABLE-ENTITY-GROUP")
    RUNNABLE___ENTITY___GROUP("RUNNABLE-ENTITY-GROUP");
    private final String value;

    RUNNABLEENTITYGROUPSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RUNNABLEENTITYGROUPSUBTYPESENUM fromValue(String v) {
        for (RUNNABLEENTITYGROUPSUBTYPESENUM c: RUNNABLEENTITYGROUPSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
