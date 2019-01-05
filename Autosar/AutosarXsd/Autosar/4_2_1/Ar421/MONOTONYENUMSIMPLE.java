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
 * <p>MONOTONY-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="MONOTONY-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DECREASING"/>
 *     &lt;enumeration value="INCREASING"/>
 *     &lt;enumeration value="MONOTONOUS"/>
 *     &lt;enumeration value="NO-MONOTONY"/>
 *     &lt;enumeration value="STRICT-MONOTONOUS"/>
 *     &lt;enumeration value="STRICTLY-DECREASING"/>
 *     &lt;enumeration value="STRICTLY-INCREASING"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MONOTONY-ENUM--SIMPLE")
@XmlEnum
public enum MONOTONYENUMSIMPLE {


    /**
     * This indicates that the related curve needs to be monotony decreasing.
     * 
     */
    DECREASING("DECREASING"),

    /**
     * This indicates that the related curve needs to be monotony increasing.
     * 
     */
    INCREASING("INCREASING"),

    /**
     * This indicates that the values shall be monotonously decreasing or increasing, depending on the trend set by the first values of the series.
     * 
     */
    MONOTONOUS("MONOTONOUS"),

    /**
     * This indicates that the related curve needs not to be monotony.
     * 
     */
    @XmlEnumValue("NO-MONOTONY")
    NO___MONOTONY("NO-MONOTONY"),

    /**
     * This indicates that the values shall be strict monotonously decreasing or increasing, depending on the trend set by the first values of the series.
     * 
     */
    @XmlEnumValue("STRICT-MONOTONOUS")
    STRICT___MONOTONOUS("STRICT-MONOTONOUS"),

    /**
     * This indicates that the related curve needs to be strictly monotony decreasing.
     * 
     */
    @XmlEnumValue("STRICTLY-DECREASING")
    STRICTLY___DECREASING("STRICTLY-DECREASING"),

    /**
     * This indicates that the related curve needs to be strictly monotony increasing.
     * 
     */
    @XmlEnumValue("STRICTLY-INCREASING")
    STRICTLY___INCREASING("STRICTLY-INCREASING");
    private final String value;

    MONOTONYENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MONOTONYENUMSIMPLE fromValue(String v) {
        for (MONOTONYENUMSIMPLE c: MONOTONYENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
