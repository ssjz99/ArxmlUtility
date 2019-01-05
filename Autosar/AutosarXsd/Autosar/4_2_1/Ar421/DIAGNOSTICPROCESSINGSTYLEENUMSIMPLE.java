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
 * <p>DIAGNOSTIC-PROCESSING-STYLE-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="DIAGNOSTIC-PROCESSING-STYLE-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PROCESSING-STYLE-ASYNCHRONOUS"/>
 *     &lt;enumeration value="PROCESSING-STYLE-SYNCHRONOUS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DIAGNOSTIC-PROCESSING-STYLE-ENUM--SIMPLE")
@XmlEnum
public enum DIAGNOSTICPROCESSINGSTYLEENUMSIMPLE {


    /**
     * The software-component processes the request in background but still the DCM has to issue the call again to eventually obtain the result of the request.
     * 
     */
    @XmlEnumValue("PROCESSING-STYLE-ASYNCHRONOUS")
    PROCESSING___STYLE___ASYNCHRONOUS("PROCESSING-STYLE-ASYNCHRONOUS"),

    /**
     * The software-component is superposed to react synchronously on the request.
     * 
     */
    @XmlEnumValue("PROCESSING-STYLE-SYNCHRONOUS")
    PROCESSING___STYLE___SYNCHRONOUS("PROCESSING-STYLE-SYNCHRONOUS");
    private final String value;

    DIAGNOSTICPROCESSINGSTYLEENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DIAGNOSTICPROCESSINGSTYLEENUMSIMPLE fromValue(String v) {
        for (DIAGNOSTICPROCESSINGSTYLEENUMSIMPLE c: DIAGNOSTICPROCESSINGSTYLEENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
