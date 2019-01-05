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
 * <p>FLEXRAY-CHANNEL-NAME--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="FLEXRAY-CHANNEL-NAME--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CHANNEL-A"/>
 *     &lt;enumeration value="CHANNEL-B"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FLEXRAY-CHANNEL-NAME--SIMPLE")
@XmlEnum
public enum FLEXRAYCHANNELNAMESIMPLE {


    /**
     * Channel A
     * 
     */
    @XmlEnumValue("CHANNEL-A")
    CHANNEL___A("CHANNEL-A"),

    /**
     * Channel B
     * 
     */
    @XmlEnumValue("CHANNEL-B")
    CHANNEL___B("CHANNEL-B");
    private final String value;

    FLEXRAYCHANNELNAMESIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FLEXRAYCHANNELNAMESIMPLE fromValue(String v) {
        for (FLEXRAYCHANNELNAMESIMPLE c: FLEXRAYCHANNELNAMESIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
