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
 * <p>RX-ACCEPT-CONTAINED-I-PDU-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="RX-ACCEPT-CONTAINED-I-PDU-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACCEPT-ALL"/>
 *     &lt;enumeration value="ACCEPT-CONFIGURED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RX-ACCEPT-CONTAINED-I-PDU-ENUM--SIMPLE")
@XmlEnum
public enum RXACCEPTCONTAINEDIPDUENUMSIMPLE {


    /**
     * No fixed set of containedIPdus is defined, any known containedIPdu (based on headerId) shall be expected within this ContainerIPdu.
     * 
     */
    @XmlEnumValue("ACCEPT-ALL")
    ACCEPT___ALL("ACCEPT-ALL"),

    /**
     * A fixed set of containedIPdus is defined. Only these assigned containedIPdus are expected in this ContainerIPdu. If a not assigned containedIPdu is received within this ContainerIPdu this containedIPdu is discarded.
     * 
     */
    @XmlEnumValue("ACCEPT-CONFIGURED")
    ACCEPT___CONFIGURED("ACCEPT-CONFIGURED");
    private final String value;

    RXACCEPTCONTAINEDIPDUENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RXACCEPTCONTAINEDIPDUENUMSIMPLE fromValue(String v) {
        for (RXACCEPTCONTAINEDIPDUENUMSIMPLE c: RXACCEPTCONTAINEDIPDUENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
