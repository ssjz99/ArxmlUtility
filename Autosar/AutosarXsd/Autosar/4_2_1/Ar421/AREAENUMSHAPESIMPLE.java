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
 * <p>AREA-ENUM-SHAPE--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="AREA-ENUM-SHAPE--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CIRCLE"/>
 *     &lt;enumeration value="DEFAULT"/>
 *     &lt;enumeration value="POLY"/>
 *     &lt;enumeration value="RECT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AREA-ENUM-SHAPE--SIMPLE")
@XmlEnum
public enum AREAENUMSHAPESIMPLE {


    /**
     * The shape is a circle.
     * 
     */
    CIRCLE,

    /**
     * This specifies the fact that the area covers the rest of the figure.
     * 
     */
    DEFAULT,

    /**
     * The area is specified as polygon.
     * 
     */
    POLY,

    /**
     * The shape is specified as rectangle.
     * 
     */
    RECT;

    public String value() {
        return name();
    }

    public static AREAENUMSHAPESIMPLE fromValue(String v) {
        return valueOf(v);
    }

}
