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
 * <p>CAN-TP-CHANNEL-MODE-TYPE--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="CAN-TP-CHANNEL-MODE-TYPE--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FULL-DUPLEX-MODE"/>
 *     &lt;enumeration value="HALF-DUPLEX-MODE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CAN-TP-CHANNEL-MODE-TYPE--SIMPLE")
@XmlEnum
public enum CANTPCHANNELMODETYPESIMPLE {


    /**
     * full duplex channel mode
     * 
     */
    @XmlEnumValue("FULL-DUPLEX-MODE")
    FULL___DUPLEX___MODE("FULL-DUPLEX-MODE"),

    /**
     * half duplex channel mode
     * 
     */
    @XmlEnumValue("HALF-DUPLEX-MODE")
    HALF___DUPLEX___MODE("HALF-DUPLEX-MODE");
    private final String value;

    CANTPCHANNELMODETYPESIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CANTPCHANNELMODETYPESIMPLE fromValue(String v) {
        for (CANTPCHANNELMODETYPESIMPLE c: CANTPCHANNELMODETYPESIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
