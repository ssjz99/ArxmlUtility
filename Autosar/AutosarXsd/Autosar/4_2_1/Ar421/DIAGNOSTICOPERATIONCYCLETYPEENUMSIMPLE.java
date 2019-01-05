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
 * <p>DIAGNOSTIC-OPERATION-CYCLE-TYPE-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="DIAGNOSTIC-OPERATION-CYCLE-TYPE-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IGNITION"/>
 *     &lt;enumeration value="OBD-DRIVING-CYCLE"/>
 *     &lt;enumeration value="OTHER"/>
 *     &lt;enumeration value="POWER"/>
 *     &lt;enumeration value="TIME"/>
 *     &lt;enumeration value="WARMUP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DIAGNOSTIC-OPERATION-CYCLE-TYPE-ENUM--SIMPLE")
@XmlEnum
public enum DIAGNOSTICOPERATIONCYCLETYPEENUMSIMPLE {


    /**
     * Ignition ON / OFF cycle
     * 
     */
    IGNITION("IGNITION"),

    /**
     * OBD Driving cycle
     * 
     */
    @XmlEnumValue("OBD-DRIVING-CYCLE")
    OBD___DRIVING___CYCLE("OBD-DRIVING-CYCLE"),

    /**
     * further operation cycle
     * 
     */
    OTHER("OTHER"),

    /**
     * Power ON / OFF cycle
     * 
     */
    POWER("POWER"),

    /**
     * Time based operation cycle
     * 
     */
    TIME("TIME"),

    /**
     * OBD Warm up cycle
     * 
     */
    WARMUP("WARMUP");
    private final String value;

    DIAGNOSTICOPERATIONCYCLETYPEENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DIAGNOSTICOPERATIONCYCLETYPEENUMSIMPLE fromValue(String v) {
        for (DIAGNOSTICOPERATIONCYCLETYPEENUMSIMPLE c: DIAGNOSTICOPERATIONCYCLETYPEENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
