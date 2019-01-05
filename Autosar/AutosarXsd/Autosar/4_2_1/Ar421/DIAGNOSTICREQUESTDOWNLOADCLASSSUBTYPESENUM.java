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
 * <p>DIAGNOSTIC-REQUEST-DOWNLOAD-CLASS--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="DIAGNOSTIC-REQUEST-DOWNLOAD-CLASS--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DIAGNOSTIC-REQUEST-DOWNLOAD-CLASS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DIAGNOSTIC-REQUEST-DOWNLOAD-CLASS--SUBTYPES-ENUM")
@XmlEnum
public enum DIAGNOSTICREQUESTDOWNLOADCLASSSUBTYPESENUM {

    @XmlEnumValue("DIAGNOSTIC-REQUEST-DOWNLOAD-CLASS")
    DIAGNOSTIC___REQUEST___DOWNLOAD___CLASS("DIAGNOSTIC-REQUEST-DOWNLOAD-CLASS");
    private final String value;

    DIAGNOSTICREQUESTDOWNLOADCLASSSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DIAGNOSTICREQUESTDOWNLOADCLASSSUBTYPESENUM fromValue(String v) {
        for (DIAGNOSTICREQUESTDOWNLOADCLASSSUBTYPESENUM c: DIAGNOSTICREQUESTDOWNLOADCLASSSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
