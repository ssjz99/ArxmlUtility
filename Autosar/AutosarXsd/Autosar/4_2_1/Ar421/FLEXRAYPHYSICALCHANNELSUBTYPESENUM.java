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
 * <p>FLEXRAY-PHYSICAL-CHANNEL--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="FLEXRAY-PHYSICAL-CHANNEL--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FLEXRAY-PHYSICAL-CHANNEL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FLEXRAY-PHYSICAL-CHANNEL--SUBTYPES-ENUM")
@XmlEnum
public enum FLEXRAYPHYSICALCHANNELSUBTYPESENUM {

    @XmlEnumValue("FLEXRAY-PHYSICAL-CHANNEL")
    FLEXRAY___PHYSICAL___CHANNEL("FLEXRAY-PHYSICAL-CHANNEL");
    private final String value;

    FLEXRAYPHYSICALCHANNELSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FLEXRAYPHYSICALCHANNELSUBTYPESENUM fromValue(String v) {
        for (FLEXRAYPHYSICALCHANNELSUBTYPESENUM c: FLEXRAYPHYSICALCHANNELSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
