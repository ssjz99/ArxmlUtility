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
 * <p>CONTAINER-I-PDU-HEADER-TYPE-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="CONTAINER-I-PDU-HEADER-TYPE-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LONG-HEADER"/>
 *     &lt;enumeration value="SHORT-HEADER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CONTAINER-I-PDU-HEADER-TYPE-ENUM--SIMPLE")
@XmlEnum
public enum CONTAINERIPDUHEADERTYPEENUMSIMPLE {


    /**
     * Header size is 64 bit:
     * * Header Id 32 bit
     * * Dlc 32 bit
     * 
     */
    @XmlEnumValue("LONG-HEADER")
    LONG___HEADER("LONG-HEADER"),

    /**
     * Header size is 32 bit:
     * * Header Id 24 bit
     * * Dlc 8 bit.
     * 
     */
    @XmlEnumValue("SHORT-HEADER")
    SHORT___HEADER("SHORT-HEADER");
    private final String value;

    CONTAINERIPDUHEADERTYPEENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CONTAINERIPDUHEADERTYPEENUMSIMPLE fromValue(String v) {
        for (CONTAINERIPDUHEADERTYPEENUMSIMPLE c: CONTAINERIPDUHEADERTYPEENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
