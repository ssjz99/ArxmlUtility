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
 * <p>VALIGN-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="VALIGN-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BOTTOM"/>
 *     &lt;enumeration value="MIDDLE"/>
 *     &lt;enumeration value="TOP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VALIGN-ENUM--SIMPLE")
@XmlEnum
public enum VALIGNENUMSIMPLE {


    /**
     * The contents of the table cell is bottom aligned.
     * 
     */
    BOTTOM,

    /**
     * The contents of the table is vertically centered.
     * 
     */
    MIDDLE,

    /**
     * The contents of the table cell is top aligned.
     * 
     */
    TOP;

    public String value() {
        return name();
    }

    public static VALIGNENUMSIMPLE fromValue(String v) {
        return valueOf(v);
    }

}
