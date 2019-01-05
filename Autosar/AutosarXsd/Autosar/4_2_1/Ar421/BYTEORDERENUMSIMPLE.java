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
 * <p>BYTE-ORDER-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="BYTE-ORDER-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MOST-SIGNIFICANT-BYTE-FIRST"/>
 *     &lt;enumeration value="MOST-SIGNIFICANT-BYTE-LAST"/>
 *     &lt;enumeration value="OPAQUE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BYTE-ORDER-ENUM--SIMPLE")
@XmlEnum
public enum BYTEORDERENUMSIMPLE {


    /**
     * Most significant byte shall come at the lowest address (also known as BigEndian or as Motorola-Format)
     * 
     */
    @XmlEnumValue("MOST-SIGNIFICANT-BYTE-FIRST")
    MOST___SIGNIFICANT___BYTE___FIRST("MOST-SIGNIFICANT-BYTE-FIRST"),

    /**
     * Most significant byte shall come highest address (also known as LittleEndian or as Intel-Format)
     * 
     */
    @XmlEnumValue("MOST-SIGNIFICANT-BYTE-LAST")
    MOST___SIGNIFICANT___BYTE___LAST("MOST-SIGNIFICANT-BYTE-LAST"),

    /**
     * For opaque data endianness conversion has to be configured to Opaque. See AUTOSAR COM Specification for more details.
     * 
     */
    OPAQUE("OPAQUE");
    private final String value;

    BYTEORDERENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BYTEORDERENUMSIMPLE fromValue(String v) {
        for (BYTEORDERENUMSIMPLE c: BYTEORDERENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
