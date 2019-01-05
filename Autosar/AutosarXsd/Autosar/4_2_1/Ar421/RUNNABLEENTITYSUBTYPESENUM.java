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
 * <p>RUNNABLE-ENTITY--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="RUNNABLE-ENTITY--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RUNNABLE-ENTITY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RUNNABLE-ENTITY--SUBTYPES-ENUM")
@XmlEnum
public enum RUNNABLEENTITYSUBTYPESENUM {

    @XmlEnumValue("RUNNABLE-ENTITY")
    RUNNABLE___ENTITY("RUNNABLE-ENTITY");
    private final String value;

    RUNNABLEENTITYSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RUNNABLEENTITYSUBTYPESENUM fromValue(String v) {
        for (RUNNABLEENTITYSUBTYPESENUM c: RUNNABLEENTITYSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
