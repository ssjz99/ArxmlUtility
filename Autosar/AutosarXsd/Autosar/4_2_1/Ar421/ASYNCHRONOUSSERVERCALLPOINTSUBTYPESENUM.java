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
 * <p>ASYNCHRONOUS-SERVER-CALL-POINT--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="ASYNCHRONOUS-SERVER-CALL-POINT--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ASYNCHRONOUS-SERVER-CALL-POINT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ASYNCHRONOUS-SERVER-CALL-POINT--SUBTYPES-ENUM")
@XmlEnum
public enum ASYNCHRONOUSSERVERCALLPOINTSUBTYPESENUM {

    @XmlEnumValue("ASYNCHRONOUS-SERVER-CALL-POINT")
    ASYNCHRONOUS___SERVER___CALL___POINT("ASYNCHRONOUS-SERVER-CALL-POINT");
    private final String value;

    ASYNCHRONOUSSERVERCALLPOINTSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ASYNCHRONOUSSERVERCALLPOINTSUBTYPESENUM fromValue(String v) {
        for (ASYNCHRONOUSSERVERCALLPOINTSUBTYPESENUM c: ASYNCHRONOUSSERVERCALLPOINTSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}