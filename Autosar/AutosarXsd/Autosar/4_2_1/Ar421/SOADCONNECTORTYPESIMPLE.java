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
 * <p>SO-AD-CONNECTOR-TYPE--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="SO-AD-CONNECTOR-TYPE--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DO-IP"/>
 *     &lt;enumeration value="PDU-R"/>
 *     &lt;enumeration value="UDP-NM"/>
 *     &lt;enumeration value="XCP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SO-AD-CONNECTOR-TYPE--SIMPLE")
@XmlEnum
public enum SOADCONNECTORTYPESIMPLE {


    /**
     * Diagnosis over IP
     * 
     */
    @XmlEnumValue("DO-IP")
    DO___IP("DO-IP"),

    /**
     * Pdu Router
     * 
     */
    @XmlEnumValue("PDU-R")
    PDU___R("PDU-R"),

    /**
     * Udp Nm
     * 
     */
    @XmlEnumValue("UDP-NM")
    UDP___NM("UDP-NM"),

    /**
     * Universal Measurement and Calibration Protocol
     * 
     */
    XCP("XCP");
    private final String value;

    SOADCONNECTORTYPESIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SOADCONNECTORTYPESIMPLE fromValue(String v) {
        for (SOADCONNECTORTYPESIMPLE c: SOADCONNECTORTYPESIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
