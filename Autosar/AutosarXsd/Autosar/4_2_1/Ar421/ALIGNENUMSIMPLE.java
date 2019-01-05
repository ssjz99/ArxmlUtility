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
 * <p>ALIGN-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="ALIGN-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CENTER"/>
 *     &lt;enumeration value="JUSTIFY"/>
 *     &lt;enumeration value="LEFT"/>
 *     &lt;enumeration value="RIGHT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ALIGN-ENUM--SIMPLE")
@XmlEnum
public enum ALIGNENUMSIMPLE {


    /**
     * The content of the table is horizontally centered.
     * 
     */
    CENTER,

    /**
     * This indicates that the content of table cell shall be justified (rendered as a block where white-space is expanded such that all lines are filled up).
     * 
     */
    JUSTIFY,

    /**
     * This indicates that the content of a table cell is left justified.
     * 
     */
    LEFT,

    /**
     * This indicates that the content of a table cell is left justified.
     * 
     */
    RIGHT;

    public String value() {
        return name();
    }

    public static ALIGNENUMSIMPLE fromValue(String v) {
        return valueOf(v);
    }

}
