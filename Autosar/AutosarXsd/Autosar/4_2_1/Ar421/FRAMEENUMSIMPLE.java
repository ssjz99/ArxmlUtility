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
 * <p>FRAME-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="FRAME-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ALL"/>
 *     &lt;enumeration value="BOTTOM"/>
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="SIDES"/>
 *     &lt;enumeration value="TOP"/>
 *     &lt;enumeration value="TOPBOT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FRAME-ENUM--SIMPLE")
@XmlEnum
public enum FRAMEENUMSIMPLE {


    /**
     * Borders all around the table
     * 
     */
    ALL,

    /**
     * Border at the bottom of the table
     * 
     */
    BOTTOM,

    /**
     * No borders around the table
     * 
     */
    NONE,

    /**
     * Borders at the sides of the table
     * 
     */
    SIDES,

    /**
     * Border at the top of the table
     * 
     */
    TOP,

    /**
     * Borders at the top and bottom of  the table
     * 
     */
    TOPBOT;

    public String value() {
        return name();
    }

    public static FRAMEENUMSIMPLE fromValue(String v) {
        return valueOf(v);
    }

}
