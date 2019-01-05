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
 * <p>ORIENT-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="ORIENT-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LAND"/>
 *     &lt;enumeration value="PORT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ORIENT-ENUM--SIMPLE")
@XmlEnum
public enum ORIENTENUMSIMPLE {


    /**
     * This indicates that the table is rendered in landscape which results in turning the table 90 degree clockwise.
     * 
     */
    LAND,

    /**
     * This indicates that the table is rendered in portrait, which is the regular text flow.
     * 
     */
    PORT;

    public String value() {
        return name();
    }

    public static ORIENTENUMSIMPLE fromValue(String v) {
        return valueOf(v);
    }

}
