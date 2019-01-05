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
 * <p>DATA-TRANSFORMATION-ERROR-HANDLING-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="DATA-TRANSFORMATION-ERROR-HANDLING-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO-TRANSFORMER-ERROR-HANDLING"/>
 *     &lt;enumeration value="TRANSFORMER-ERROR-HANDLING"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DATA-TRANSFORMATION-ERROR-HANDLING-ENUM--SIMPLE")
@XmlEnum
public enum DATATRANSFORMATIONERRORHANDLINGENUMSIMPLE {


    /**
     * A runnable does not handle transformer errors.
     * 
     */
    @XmlEnumValue("NO-TRANSFORMER-ERROR-HANDLING")
    NO___TRANSFORMER___ERROR___HANDLING("NO-TRANSFORMER-ERROR-HANDLING"),

    /**
     * The runnable implements the handling of transformer errors.
     * 
     */
    @XmlEnumValue("TRANSFORMER-ERROR-HANDLING")
    TRANSFORMER___ERROR___HANDLING("TRANSFORMER-ERROR-HANDLING");
    private final String value;

    DATATRANSFORMATIONERRORHANDLINGENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DATATRANSFORMATIONERRORHANDLINGENUMSIMPLE fromValue(String v) {
        for (DATATRANSFORMATIONERRORHANDLINGENUMSIMPLE c: DATATRANSFORMATIONERRORHANDLINGENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
