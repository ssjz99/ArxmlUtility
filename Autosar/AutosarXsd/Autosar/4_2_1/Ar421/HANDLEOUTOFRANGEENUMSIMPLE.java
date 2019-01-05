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
 * <p>HANDLE-OUT-OF-RANGE-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="HANDLE-OUT-OF-RANGE-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DEFAULT"/>
 *     &lt;enumeration value="EXTERNAL-REPLACEMENT"/>
 *     &lt;enumeration value="IGNORE"/>
 *     &lt;enumeration value="INVALID"/>
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="SATURATE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HANDLE-OUT-OF-RANGE-ENUM--SIMPLE")
@XmlEnum
public enum HANDLEOUTOFRANGEENUMSIMPLE {


    /**
     * The RTE will use the initValue if the actual value is out of the specified bounds.
     * 
     */
    DEFAULT("DEFAULT"),

    /**
     * This indicates that the value replacement is sourced from the attribute replaceWith.
     * 
     */
    @XmlEnumValue("EXTERNAL-REPLACEMENT")
    EXTERNAL___REPLACEMENT("EXTERNAL-REPLACEMENT"),

    /**
     * The RTE will ignore any attempt to send or receive the corresponding dataElement if the value is out of the specified range.
     * 
     */
    IGNORE("IGNORE"),

    /**
     * The RTE will use the invalidValue if the value is out of the specified bounds.
     * 
     */
    INVALID("INVALID"),

    /**
     * A range check is not required.
     * 
     */
    NONE("NONE"),

    /**
     * The RTE will saturate the value of the dataElement such that it is limited to the applicable upper bound if it is greater than the upper bound. Consequently, it is limited to the applicable lower bound if the value is less than the lower bound.
     * 
     */
    SATURATE("SATURATE");
    private final String value;

    HANDLEOUTOFRANGEENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HANDLEOUTOFRANGEENUMSIMPLE fromValue(String v) {
        for (HANDLEOUTOFRANGEENUMSIMPLE c: HANDLEOUTOFRANGEENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
