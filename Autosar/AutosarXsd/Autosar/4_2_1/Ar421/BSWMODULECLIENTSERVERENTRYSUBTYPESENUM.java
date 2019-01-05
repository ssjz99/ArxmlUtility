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
 * <p>BSW-MODULE-CLIENT-SERVER-ENTRY--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="BSW-MODULE-CLIENT-SERVER-ENTRY--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BSW-MODULE-CLIENT-SERVER-ENTRY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BSW-MODULE-CLIENT-SERVER-ENTRY--SUBTYPES-ENUM")
@XmlEnum
public enum BSWMODULECLIENTSERVERENTRYSUBTYPESENUM {

    @XmlEnumValue("BSW-MODULE-CLIENT-SERVER-ENTRY")
    BSW___MODULE___CLIENT___SERVER___ENTRY("BSW-MODULE-CLIENT-SERVER-ENTRY");
    private final String value;

    BSWMODULECLIENTSERVERENTRYSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BSWMODULECLIENTSERVERENTRYSUBTYPESENUM fromValue(String v) {
        for (BSWMODULECLIENTSERVERENTRYSUBTYPESENUM c: BSWMODULECLIENTSERVERENTRYSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
