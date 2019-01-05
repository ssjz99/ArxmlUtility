//
// ????? JavaTM Architecture for XML Binding (JAXB) ???? v2.2.8-b130911.1802 ???
// ??? <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// ?????????, ??????????????
// ????: 2018.03.12 ?? 11:42:22 PM CET 
//


package Ar421;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>LIN-CHECKSUM-TYPE--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="LIN-CHECKSUM-TYPE--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CLASSIC"/>
 *     &lt;enumeration value="ENHANCED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LIN-CHECKSUM-TYPE--SIMPLE")
@XmlEnum
public enum LINCHECKSUMTYPESIMPLE {


    /**
     * Classic in communication with LIN 1.3 slave nodes
     * 
     */
    CLASSIC,

    /**
     * Enhanced in communication with LIN 2.0 slave nodes.
     * 
     */
    ENHANCED;

    public String value() {
        return name();
    }

    public static LINCHECKSUMTYPESIMPLE fromValue(String v) {
        return valueOf(v);
    }

}
