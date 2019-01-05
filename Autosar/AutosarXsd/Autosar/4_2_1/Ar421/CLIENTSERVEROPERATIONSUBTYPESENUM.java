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
 * <p>CLIENT-SERVER-OPERATION--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="CLIENT-SERVER-OPERATION--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CLIENT-SERVER-OPERATION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CLIENT-SERVER-OPERATION--SUBTYPES-ENUM")
@XmlEnum
public enum CLIENTSERVEROPERATIONSUBTYPESENUM {

    @XmlEnumValue("CLIENT-SERVER-OPERATION")
    CLIENT___SERVER___OPERATION("CLIENT-SERVER-OPERATION");
    private final String value;

    CLIENTSERVEROPERATIONSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CLIENTSERVEROPERATIONSUBTYPESENUM fromValue(String v) {
        for (CLIENTSERVEROPERATIONSUBTYPESENUM c: CLIENTSERVEROPERATIONSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
