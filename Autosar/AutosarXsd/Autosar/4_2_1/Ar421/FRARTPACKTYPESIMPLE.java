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
 * <p>FR-AR-TP-ACK-TYPE--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="FR-AR-TP-ACK-TYPE--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACK-WITH-RT"/>
 *     &lt;enumeration value="ACK-WITHOUT-RT"/>
 *     &lt;enumeration value="NO-ACK"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FR-AR-TP-ACK-TYPE--SIMPLE")
@XmlEnum
public enum FRARTPACKTYPESIMPLE {


    /**
     * Acknowledgement with retry.
     * 
     */
    @XmlEnumValue("ACK-WITH-RT")
    ACK___WITH___RT("ACK-WITH-RT"),

    /**
     * Acknowledgement without retry.
     * 
     */
    @XmlEnumValue("ACK-WITHOUT-RT")
    ACK___WITHOUT___RT("ACK-WITHOUT-RT"),

    /**
     * No acknowledgement.
     * 
     */
    @XmlEnumValue("NO-ACK")
    NO___ACK("NO-ACK");
    private final String value;

    FRARTPACKTYPESIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FRARTPACKTYPESIMPLE fromValue(String v) {
        for (FRARTPACKTYPESIMPLE c: FRARTPACKTYPESIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
