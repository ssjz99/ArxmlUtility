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
 * <p>GLOBAL-TIME-CRC-VALIDATION-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="GLOBAL-TIME-CRC-VALIDATION-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CRC-IGNORED"/>
 *     &lt;enumeration value="CRC-NOT-VALIDATED"/>
 *     &lt;enumeration value="CRC-VALIDATED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GLOBAL-TIME-CRC-VALIDATION-ENUM--SIMPLE")
@XmlEnum
public enum GLOBALTIMECRCVALIDATIONENUMSIMPLE {


    /**
     * The CRC is supposed to be ignored
     * 
     */
    @XmlEnumValue("CRC-IGNORED")
    CRC___IGNORED("CRC-IGNORED"),

    /**
     * The CRC is supposed to be present but not supposed to be validated.
     * 
     */
    @XmlEnumValue("CRC-NOT-VALIDATED")
    CRC___NOT___VALIDATED("CRC-NOT-VALIDATED"),

    /**
     * This CRC is supposed to be validated.
     * 
     */
    @XmlEnumValue("CRC-VALIDATED")
    CRC___VALIDATED("CRC-VALIDATED");
    private final String value;

    GLOBALTIMECRCVALIDATIONENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GLOBALTIMECRCVALIDATIONENUMSIMPLE fromValue(String v) {
        for (GLOBALTIMECRCVALIDATIONENUMSIMPLE c: GLOBALTIMECRCVALIDATIONENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
