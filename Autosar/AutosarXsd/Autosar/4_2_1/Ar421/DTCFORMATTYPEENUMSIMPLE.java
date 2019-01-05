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
 * <p>DTC-FORMAT-TYPE-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="DTC-FORMAT-TYPE-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="J-1939"/>
 *     &lt;enumeration value="OBD"/>
 *     &lt;enumeration value="UDS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DTC-FORMAT-TYPE-ENUM--SIMPLE")
@XmlEnum
public enum DTCFORMATTYPEENUMSIMPLE {


    /**
     * Defines the J1939 DTC format.
     * 
     */
    @XmlEnumValue("J-1939")
    J___1939("J-1939"),

    /**
     * Defines the OBD DTC format.
     * 
     */
    OBD("OBD"),

    /**
     * Defines the UDS DTC format.
     * 
     */
    UDS("UDS");
    private final String value;

    DTCFORMATTYPEENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DTCFORMATTYPEENUMSIMPLE fromValue(String v) {
        for (DTCFORMATTYPEENUMSIMPLE c: DTCFORMATTYPEENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
