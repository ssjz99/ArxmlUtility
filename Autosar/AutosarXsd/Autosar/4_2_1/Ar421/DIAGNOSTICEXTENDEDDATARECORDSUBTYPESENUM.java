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
 * <p>DIAGNOSTIC-EXTENDED-DATA-RECORD--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="DIAGNOSTIC-EXTENDED-DATA-RECORD--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DIAGNOSTIC-EXTENDED-DATA-RECORD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DIAGNOSTIC-EXTENDED-DATA-RECORD--SUBTYPES-ENUM")
@XmlEnum
public enum DIAGNOSTICEXTENDEDDATARECORDSUBTYPESENUM {

    @XmlEnumValue("DIAGNOSTIC-EXTENDED-DATA-RECORD")
    DIAGNOSTIC___EXTENDED___DATA___RECORD("DIAGNOSTIC-EXTENDED-DATA-RECORD");
    private final String value;

    DIAGNOSTICEXTENDEDDATARECORDSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DIAGNOSTICEXTENDEDDATARECORDSUBTYPESENUM fromValue(String v) {
        for (DIAGNOSTICEXTENDEDDATARECORDSUBTYPESENUM c: DIAGNOSTICEXTENDEDDATARECORDSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
