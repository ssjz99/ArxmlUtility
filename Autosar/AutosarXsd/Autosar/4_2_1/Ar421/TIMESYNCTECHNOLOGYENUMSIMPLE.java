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
 * <p>TIME-SYNC-TECHNOLOGY-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="TIME-SYNC-TECHNOLOGY-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AVB--IEEE-802--1-AS"/>
 *     &lt;enumeration value="NTP--RFC-958"/>
 *     &lt;enumeration value="PTP--IEEE-1588--2002"/>
 *     &lt;enumeration value="PTP--IEEE-1588--2008"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TIME-SYNC-TECHNOLOGY-ENUM--SIMPLE")
@XmlEnum
public enum TIMESYNCTECHNOLOGYENUMSIMPLE {


    /**
     * Ethernet AVB compliant IEEE802.1AS Precision Time Protocol
     * 
     */
    @XmlEnumValue("AVB--IEEE-802--1-AS")
    AVB____IEEE___802____1___AS("AVB--IEEE-802--1-AS"),

    /**
     * Network Time Protocol (NTP)
     * 
     */
    @XmlEnumValue("NTP--RFC-958")
    NTP____RFC___958("NTP--RFC-958"),

    /**
     * Precision Time Protocol (PTP) IEEE 1588-2002
     * 
     */
    @XmlEnumValue("PTP--IEEE-1588--2002")
    PTP____IEEE___1588____2002("PTP--IEEE-1588--2002"),

    /**
     * Precision Time Protocol (PTP) IEEE 1588-2008
     * 
     */
    @XmlEnumValue("PTP--IEEE-1588--2008")
    PTP____IEEE___1588____2008("PTP--IEEE-1588--2008");
    private final String value;

    TIMESYNCTECHNOLOGYENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TIMESYNCTECHNOLOGYENUMSIMPLE fromValue(String v) {
        for (TIMESYNCTECHNOLOGYENUMSIMPLE c: TIMESYNCTECHNOLOGYENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
