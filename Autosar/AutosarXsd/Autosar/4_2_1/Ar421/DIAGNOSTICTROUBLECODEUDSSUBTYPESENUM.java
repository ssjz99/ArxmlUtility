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
 * <p>DIAGNOSTIC-TROUBLE-CODE-UDS--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="DIAGNOSTIC-TROUBLE-CODE-UDS--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DIAGNOSTIC-TROUBLE-CODE-UDS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DIAGNOSTIC-TROUBLE-CODE-UDS--SUBTYPES-ENUM")
@XmlEnum
public enum DIAGNOSTICTROUBLECODEUDSSUBTYPESENUM {

    @XmlEnumValue("DIAGNOSTIC-TROUBLE-CODE-UDS")
    DIAGNOSTIC___TROUBLE___CODE___UDS("DIAGNOSTIC-TROUBLE-CODE-UDS");
    private final String value;

    DIAGNOSTICTROUBLECODEUDSSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DIAGNOSTICTROUBLECODEUDSSUBTYPESENUM fromValue(String v) {
        for (DIAGNOSTICTROUBLECODEUDSSUBTYPESENUM c: DIAGNOSTICTROUBLECODEUDSSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
