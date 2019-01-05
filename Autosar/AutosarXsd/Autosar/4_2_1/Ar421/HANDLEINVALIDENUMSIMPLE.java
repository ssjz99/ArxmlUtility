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
 * <p>HANDLE-INVALID-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="HANDLE-INVALID-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DONT-INVALIDATE"/>
 *     &lt;enumeration value="EXTERNAL-REPLACEMENT"/>
 *     &lt;enumeration value="KEEP"/>
 *     &lt;enumeration value="REPLACE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HANDLE-INVALID-ENUM--SIMPLE")
@XmlEnum
public enum HANDLEINVALIDENUMSIMPLE {


    /**
     * Invalidation is switched off.
     * 
     */
    @XmlEnumValue("DONT-INVALIDATE")
    DONT___INVALIDATE("DONT-INVALIDATE"),

    /**
     * Replace a received invalidValue. The replacement value is sourced from the externalReplacement.
     * 
     */
    @XmlEnumValue("EXTERNAL-REPLACEMENT")
    EXTERNAL___REPLACEMENT("EXTERNAL-REPLACEMENT"),

    /**
     * The application software is supposed to  handle signal invalidation on RTE API level either by DataReceiveErrorEvent or check of error code on read access.
     * 
     */
    KEEP("KEEP"),

    /**
     * Replace a received invalidValue. The replacement value is specified by the initValue.
     * 
     */
    REPLACE("REPLACE");
    private final String value;

    HANDLEINVALIDENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HANDLEINVALIDENUMSIMPLE fromValue(String v) {
        for (HANDLEINVALIDENUMSIMPLE c: HANDLEINVALIDENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
