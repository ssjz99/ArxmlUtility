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
 * <p>CAN-TP-ADDRESSING-FORMAT-TYPE--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="CAN-TP-ADDRESSING-FORMAT-TYPE--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EXTENDED"/>
 *     &lt;enumeration value="MIXED"/>
 *     &lt;enumeration value="MIXED-29-BIT"/>
 *     &lt;enumeration value="NORMALFIXED"/>
 *     &lt;enumeration value="STANDARD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CAN-TP-ADDRESSING-FORMAT-TYPE--SIMPLE")
@XmlEnum
public enum CANTPADDRESSINGFORMATTYPESIMPLE {


    /**
     * To use extended addressing format.
     * 
     */
    EXTENDED("EXTENDED"),

    /**
     * To use mixed 11bit addressing format.
     * 
     */
    MIXED("MIXED"),

    /**
     * To use mixed 29bit addressing format
     * 
     */
    @XmlEnumValue("MIXED-29-BIT")
    MIXED___29___BIT("MIXED-29-BIT"),

    /**
     * To use normal fixed addressing format
     * 
     */
    NORMALFIXED("NORMALFIXED"),

    /**
     * To use normal addressing format.
     * 
     */
    STANDARD("STANDARD");
    private final String value;

    CANTPADDRESSINGFORMATTYPESIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CANTPADDRESSINGFORMATTYPESIMPLE fromValue(String v) {
        for (CANTPADDRESSINGFORMATTYPESIMPLE c: CANTPADDRESSINGFORMATTYPESIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
