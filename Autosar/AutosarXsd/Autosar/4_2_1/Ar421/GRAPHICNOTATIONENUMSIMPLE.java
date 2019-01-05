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
 * <p>GRAPHIC-NOTATION-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="GRAPHIC-NOTATION-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BMP"/>
 *     &lt;enumeration value="EPS"/>
 *     &lt;enumeration value="GIF"/>
 *     &lt;enumeration value="JPG"/>
 *     &lt;enumeration value="PDF"/>
 *     &lt;enumeration value="PNG"/>
 *     &lt;enumeration value="SVG"/>
 *     &lt;enumeration value="TIFF"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GRAPHIC-NOTATION-ENUM--SIMPLE")
@XmlEnum
public enum GRAPHICNOTATIONENUMSIMPLE {


    /**
     * bitmap image
     * 
     */
    BMP,

    /**
     * Encapsulated Postscript
     * 
     */
    EPS,

    /**
     * Graphics Interchange Format
     * 
     */
    GIF,

    /**
     * "Joint Photographic Experts Group"  format
     * 
     */
    JPG,

    /**
     * Portable Document Format
     * 
     */
    PDF,

    /**
     * Portable Network Graphics
     * 
     */
    PNG,

    /**
     * scalable vector graphic
     * 
     */
    SVG,

    /**
     * Tagged Image File Format
     * 
     */
    TIFF;

    public String value() {
        return name();
    }

    public static GRAPHICNOTATIONENUMSIMPLE fromValue(String v) {
        return valueOf(v);
    }

}
