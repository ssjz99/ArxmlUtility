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
 * <p>GRAPHIC-FIT-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="GRAPHIC-FIT-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AS-IS"/>
 *     &lt;enumeration value="FIT-TO-PAGE"/>
 *     &lt;enumeration value="FIT-TO-TEXT"/>
 *     &lt;enumeration value="LIMIT-TO-PAGE"/>
 *     &lt;enumeration value="LIMIT-TO-TEXT"/>
 *     &lt;enumeration value="ROTATE-180"/>
 *     &lt;enumeration value="ROTATE-180-LIMIT-TO-TEXT"/>
 *     &lt;enumeration value="ROTATE-90-CCW"/>
 *     &lt;enumeration value="ROTATE-90-CCW-FIT-TO-TEXT"/>
 *     &lt;enumeration value="ROTATE-90-CCW-LIMIT-TO-TEXT"/>
 *     &lt;enumeration value="ROTATE-90-CW"/>
 *     &lt;enumeration value="ROTATE-90-CW-FIT-TO-TEXT"/>
 *     &lt;enumeration value="ROTATE-90-CW-LIMIT-TO-TEXT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GRAPHIC-FIT-ENUM--SIMPLE")
@XmlEnum
public enum GRAPHICFITENUMSIMPLE {


    /**
     * This indicates that the image shall be incorporated as is without scaling, rotation etc.
     * 
     */
    @XmlEnumValue("AS-IS")
    AS___IS("AS-IS"),

    /**
     * Fit to the page
     * 
     */
    @XmlEnumValue("FIT-TO-PAGE")
    FIT___TO___PAGE("FIT-TO-PAGE"),

    /**
     * fit to the text containing the graphic.
     * 
     */
    @XmlEnumValue("FIT-TO-TEXT")
    FIT___TO___TEXT("FIT-TO-TEXT"),

    /**
     * This indicates that the width of the graphic shall be limited to the '''page width'''. The image shall not be scaled down but cropped.
     * 
     */
    @XmlEnumValue("LIMIT-TO-PAGE")
    LIMIT___TO___PAGE("LIMIT-TO-PAGE"),

    /**
     * This indicates that the width of the graphic shall be limited to the width of the current '''text flow'''. The image shall not be scaled down but cropped.
     * 
     */
    @XmlEnumValue("LIMIT-TO-TEXT")
    LIMIT___TO___TEXT("LIMIT-TO-TEXT"),

    /**
     * Rotate 180 degree
     * 
     */
    @XmlEnumValue("ROTATE-180")
    ROTATE___180("ROTATE-180"),

    /**
     * Rotate 180 degree
     * 
     */
    @XmlEnumValue("ROTATE-180-LIMIT-TO-TEXT")
    ROTATE___180___LIMIT___TO___TEXT("ROTATE-180-LIMIT-TO-TEXT"),

    /**
     * Rotate 90 degree counter clockwise
     * 
     */
    @XmlEnumValue("ROTATE-90-CCW")
    ROTATE___90___CCW("ROTATE-90-CCW"),

    /**
     * Rotate by 90 degree counter clock wise and then fit to text
     * 
     */
    @XmlEnumValue("ROTATE-90-CCW-FIT-TO-TEXT")
    ROTATE___90___CCW___FIT___TO___TEXT("ROTATE-90-CCW-FIT-TO-TEXT"),

    /**
     * Rotate by 90 degree counter clock wise and then fit to text
     * 
     */
    @XmlEnumValue("ROTATE-90-CCW-LIMIT-TO-TEXT")
    ROTATE___90___CCW___LIMIT___TO___TEXT("ROTATE-90-CCW-LIMIT-TO-TEXT"),

    /**
     * Rotate 90 degree clockwise
     * 
     */
    @XmlEnumValue("ROTATE-90-CW")
    ROTATE___90___CW("ROTATE-90-CW"),

    /**
     * Rotate by 90 degree and then fit to text
     * 
     */
    @XmlEnumValue("ROTATE-90-CW-FIT-TO-TEXT")
    ROTATE___90___CW___FIT___TO___TEXT("ROTATE-90-CW-FIT-TO-TEXT"),

    /**
     * Rotate by 90 degree and then fit to text
     * 
     */
    @XmlEnumValue("ROTATE-90-CW-LIMIT-TO-TEXT")
    ROTATE___90___CW___LIMIT___TO___TEXT("ROTATE-90-CW-LIMIT-TO-TEXT");
    private final String value;

    GRAPHICFITENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GRAPHICFITENUMSIMPLE fromValue(String v) {
        for (GRAPHICFITENUMSIMPLE c: GRAPHICFITENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
