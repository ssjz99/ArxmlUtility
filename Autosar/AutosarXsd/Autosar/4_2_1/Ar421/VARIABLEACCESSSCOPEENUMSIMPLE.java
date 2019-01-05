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
 * <p>VARIABLE-ACCESS-SCOPE-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="VARIABLE-ACCESS-SCOPE-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="COMMUNICATION-INTER-ECU"/>
 *     &lt;enumeration value="COMMUNICATION-INTRA-PARTITION"/>
 *     &lt;enumeration value="INTER-PARTITION-INTRA-ECU"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VARIABLE-ACCESS-SCOPE-ENUM--SIMPLE")
@XmlEnum
public enum VARIABLEACCESSSCOPEENUMSIMPLE {


    /**
     * This case is foreseen to express that the corresponding communication shall be considered inter-ECU, i.e. it will cross the ECU boundary. This is considered the default case.
     * 
     */
    @XmlEnumValue("COMMUNICATION-INTER-ECU")
    COMMUNICATION___INTER___ECU("COMMUNICATION-INTER-ECU"),

    /**
     * This case is foreseen to express that the corresponding communication shall '''not''' cross the boundary of a partition.
     * 
     */
    @XmlEnumValue("COMMUNICATION-INTRA-PARTITION")
    COMMUNICATION___INTRA___PARTITION("COMMUNICATION-INTRA-PARTITION"),

    /**
     * In this case the communication shall cross the boundaries of partitions within one ECU but it shall not cross the boundaries of the ECU itself.
     * 
     */
    @XmlEnumValue("INTER-PARTITION-INTRA-ECU")
    INTER___PARTITION___INTRA___ECU("INTER-PARTITION-INTRA-ECU");
    private final String value;

    VARIABLEACCESSSCOPEENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VARIABLEACCESSSCOPEENUMSIMPLE fromValue(String v) {
        for (VARIABLEACCESSSCOPEENUMSIMPLE c: VARIABLEACCESSSCOPEENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
