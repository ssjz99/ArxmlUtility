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
 * <p>TRACEABLE--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="TRACEABLE--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AGE-CONSTRAINT"/>
 *     &lt;enumeration value="ARBITRARY-EVENT-TRIGGERING"/>
 *     &lt;enumeration value="BURST-PATTERN-EVENT-TRIGGERING"/>
 *     &lt;enumeration value="CONCRETE-PATTERN-EVENT-TRIGGERING"/>
 *     &lt;enumeration value="EVENT-TRIGGERING-CONSTRAINT"/>
 *     &lt;enumeration value="EXECUTION-ORDER-CONSTRAINT"/>
 *     &lt;enumeration value="EXECUTION-TIME-CONSTRAINT"/>
 *     &lt;enumeration value="LATENCY-TIMING-CONSTRAINT"/>
 *     &lt;enumeration value="OFFSET-TIMING-CONSTRAINT"/>
 *     &lt;enumeration value="PERIODIC-EVENT-TRIGGERING"/>
 *     &lt;enumeration value="SPORADIC-EVENT-TRIGGERING"/>
 *     &lt;enumeration value="STRUCTURED-REQ"/>
 *     &lt;enumeration value="SYNCHRONIZATION-TIMING-CONSTRAINT"/>
 *     &lt;enumeration value="TIMING-CONSTRAINT"/>
 *     &lt;enumeration value="TRACEABLE"/>
 *     &lt;enumeration value="TRACEABLE-TEXT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TRACEABLE--SUBTYPES-ENUM")
@XmlEnum
public enum TRACEABLESUBTYPESENUM {

    @XmlEnumValue("AGE-CONSTRAINT")
    AGE___CONSTRAINT("AGE-CONSTRAINT"),
    @XmlEnumValue("ARBITRARY-EVENT-TRIGGERING")
    ARBITRARY___EVENT___TRIGGERING("ARBITRARY-EVENT-TRIGGERING"),
    @XmlEnumValue("BURST-PATTERN-EVENT-TRIGGERING")
    BURST___PATTERN___EVENT___TRIGGERING("BURST-PATTERN-EVENT-TRIGGERING"),
    @XmlEnumValue("CONCRETE-PATTERN-EVENT-TRIGGERING")
    CONCRETE___PATTERN___EVENT___TRIGGERING("CONCRETE-PATTERN-EVENT-TRIGGERING"),
    @XmlEnumValue("EVENT-TRIGGERING-CONSTRAINT")
    EVENT___TRIGGERING___CONSTRAINT("EVENT-TRIGGERING-CONSTRAINT"),
    @XmlEnumValue("EXECUTION-ORDER-CONSTRAINT")
    EXECUTION___ORDER___CONSTRAINT("EXECUTION-ORDER-CONSTRAINT"),
    @XmlEnumValue("EXECUTION-TIME-CONSTRAINT")
    EXECUTION___TIME___CONSTRAINT("EXECUTION-TIME-CONSTRAINT"),
    @XmlEnumValue("LATENCY-TIMING-CONSTRAINT")
    LATENCY___TIMING___CONSTRAINT("LATENCY-TIMING-CONSTRAINT"),
    @XmlEnumValue("OFFSET-TIMING-CONSTRAINT")
    OFFSET___TIMING___CONSTRAINT("OFFSET-TIMING-CONSTRAINT"),
    @XmlEnumValue("PERIODIC-EVENT-TRIGGERING")
    PERIODIC___EVENT___TRIGGERING("PERIODIC-EVENT-TRIGGERING"),
    @XmlEnumValue("SPORADIC-EVENT-TRIGGERING")
    SPORADIC___EVENT___TRIGGERING("SPORADIC-EVENT-TRIGGERING"),
    @XmlEnumValue("STRUCTURED-REQ")
    STRUCTURED___REQ("STRUCTURED-REQ"),
    @XmlEnumValue("SYNCHRONIZATION-TIMING-CONSTRAINT")
    SYNCHRONIZATION___TIMING___CONSTRAINT("SYNCHRONIZATION-TIMING-CONSTRAINT"),
    @XmlEnumValue("TIMING-CONSTRAINT")
    TIMING___CONSTRAINT("TIMING-CONSTRAINT"),
    TRACEABLE("TRACEABLE"),
    @XmlEnumValue("TRACEABLE-TEXT")
    TRACEABLE___TEXT("TRACEABLE-TEXT");
    private final String value;

    TRACEABLESUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TRACEABLESUBTYPESENUM fromValue(String v) {
        for (TRACEABLESUBTYPESENUM c: TRACEABLESUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
