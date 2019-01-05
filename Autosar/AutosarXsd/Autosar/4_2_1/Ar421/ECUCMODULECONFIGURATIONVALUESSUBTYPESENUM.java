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
 * <p>ECUC-MODULE-CONFIGURATION-VALUES--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="ECUC-MODULE-CONFIGURATION-VALUES--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ECUC-MODULE-CONFIGURATION-VALUES"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ECUC-MODULE-CONFIGURATION-VALUES--SUBTYPES-ENUM")
@XmlEnum
public enum ECUCMODULECONFIGURATIONVALUESSUBTYPESENUM {

    @XmlEnumValue("ECUC-MODULE-CONFIGURATION-VALUES")
    ECUC___MODULE___CONFIGURATION___VALUES("ECUC-MODULE-CONFIGURATION-VALUES");
    private final String value;

    ECUCMODULECONFIGURATIONVALUESSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ECUCMODULECONFIGURATIONVALUESSUBTYPESENUM fromValue(String v) {
        for (ECUCMODULECONFIGURATIONVALUESSUBTYPESENUM c: ECUCMODULECONFIGURATIONVALUESSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
