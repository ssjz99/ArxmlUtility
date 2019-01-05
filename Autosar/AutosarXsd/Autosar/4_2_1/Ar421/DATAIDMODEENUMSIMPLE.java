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
 * <p>DATA-ID-MODE-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="DATA-ID-MODE-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ALL-16-BIT"/>
 *     &lt;enumeration value="ALTERNATING-8-BIT"/>
 *     &lt;enumeration value="LOWER-12-BIT"/>
 *     &lt;enumeration value="LOWER-8-BIT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DATA-ID-MODE-ENUM--SIMPLE")
@XmlEnum
public enum DATAIDMODEENUMSIMPLE {


    /**
     * Two bytes are included in the CRC (double ID configuration).
     * 
     */
    @XmlEnumValue("ALL-16-BIT")
    ALL___16___BIT("ALL-16-BIT"),

    /**
     * One of the two bytes byte is included, alternating high and low byte, depending on parity of the counter (alternating ID configuration). For even counter low byte is included; For odd counters the high byte is included.
     * 
     */
    @XmlEnumValue("ALTERNATING-8-BIT")
    ALTERNATING___8___BIT("ALTERNATING-8-BIT"),

    /**
     * The low byte is included in the implicit CRC calculation, the low nibble of the high byte is transmitted along with the data (i.e. it is explicitly included), the high nibble of the high byte is not used. This is applicable for the IDs up to 12 bits.
     * 
     */
    @XmlEnumValue("LOWER-12-BIT")
    LOWER___12___BIT("LOWER-12-BIT"),

    /**
     * Only low byte is included, high byte is never used. This is applicable if the IDs in a particular system are 8 bits.
     * 
     */
    @XmlEnumValue("LOWER-8-BIT")
    LOWER___8___BIT("LOWER-8-BIT");
    private final String value;

    DATAIDMODEENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DATAIDMODEENUMSIMPLE fromValue(String v) {
        for (DATAIDMODEENUMSIMPLE c: DATAIDMODEENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
