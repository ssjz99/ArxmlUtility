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
 * <p>DIAGNOSTIC-DATA-IDENTIFIER-SET--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="DIAGNOSTIC-DATA-IDENTIFIER-SET--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DIAGNOSTIC-DATA-IDENTIFIER-SET"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DIAGNOSTIC-DATA-IDENTIFIER-SET--SUBTYPES-ENUM")
@XmlEnum
public enum DIAGNOSTICDATAIDENTIFIERSETSUBTYPESENUM {

    @XmlEnumValue("DIAGNOSTIC-DATA-IDENTIFIER-SET")
    DIAGNOSTIC___DATA___IDENTIFIER___SET("DIAGNOSTIC-DATA-IDENTIFIER-SET");
    private final String value;

    DIAGNOSTICDATAIDENTIFIERSETSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DIAGNOSTICDATAIDENTIFIERSETSUBTYPESENUM fromValue(String v) {
        for (DIAGNOSTICDATAIDENTIFIERSETSUBTYPESENUM c: DIAGNOSTICDATAIDENTIFIERSETSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
