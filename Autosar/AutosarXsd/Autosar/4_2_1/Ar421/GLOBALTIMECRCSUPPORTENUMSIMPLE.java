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
 * <p>GLOBAL-TIME-CRC-SUPPORT-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="GLOBAL-TIME-CRC-SUPPORT-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CRC-NOT-SUPPORTED"/>
 *     &lt;enumeration value="CRC-SUPPORTED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GLOBAL-TIME-CRC-SUPPORT-ENUM--SIMPLE")
@XmlEnum
public enum GLOBALTIMECRCSUPPORTENUMSIMPLE {


    /**
     * This indicates that CRC is not supported
     * 
     */
    @XmlEnumValue("CRC-NOT-SUPPORTED")
    CRC___NOT___SUPPORTED("CRC-NOT-SUPPORTED"),

    /**
     * This indicates that CRC is supported
     * 
     */
    @XmlEnumValue("CRC-SUPPORTED")
    CRC___SUPPORTED("CRC-SUPPORTED");
    private final String value;

    GLOBALTIMECRCSUPPORTENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GLOBALTIMECRCSUPPORTENUMSIMPLE fromValue(String v) {
        for (GLOBALTIMECRCSUPPORTENUMSIMPLE c: GLOBALTIMECRCSUPPORTENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
