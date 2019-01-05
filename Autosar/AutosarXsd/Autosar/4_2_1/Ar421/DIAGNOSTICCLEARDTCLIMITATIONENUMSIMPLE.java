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
 * <p>DIAGNOSTIC-CLEAR-DTC-LIMITATION-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="DIAGNOSTIC-CLEAR-DTC-LIMITATION-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ALL-SUPPORTED-DTCS"/>
 *     &lt;enumeration value="CLEAR-ALL-DTCS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DIAGNOSTIC-CLEAR-DTC-LIMITATION-ENUM--SIMPLE")
@XmlEnum
public enum DIAGNOSTICCLEARDTCLIMITATIONENUMSIMPLE {


    /**
     * DEM_ClearDtc API accepts all supported DTC values.
     * 
     */
    @XmlEnumValue("ALL-SUPPORTED-DTCS")
    ALL___SUPPORTED___DTCS("ALL-SUPPORTED-DTCS"),

    /**
     * DEM_ClearDtc API accepts ClearAllDTCs only.
     * 
     */
    @XmlEnumValue("CLEAR-ALL-DTCS")
    CLEAR___ALL___DTCS("CLEAR-ALL-DTCS");
    private final String value;

    DIAGNOSTICCLEARDTCLIMITATIONENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DIAGNOSTICCLEARDTCLIMITATIONENUMSIMPLE fromValue(String v) {
        for (DIAGNOSTICCLEARDTCLIMITATIONENUMSIMPLE c: DIAGNOSTICCLEARDTCLIMITATIONENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
