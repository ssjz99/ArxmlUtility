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
 * <p>RESUME-POSITION--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="RESUME-POSITION--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CONTINUE-AT-IT-POSITION"/>
 *     &lt;enumeration value="START-FROM-BEGINNING"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RESUME-POSITION--SIMPLE")
@XmlEnum
public enum RESUMEPOSITIONSIMPLE {


    /**
     * Continue at IT Point.
     * 
     */
    @XmlEnumValue("CONTINUE-AT-IT-POSITION")
    CONTINUE___AT___IT___POSITION("CONTINUE-AT-IT-POSITION"),

    /**
     * Start from the beginning
     * 
     */
    @XmlEnumValue("START-FROM-BEGINNING")
    START___FROM___BEGINNING("START-FROM-BEGINNING");
    private final String value;

    RESUMEPOSITIONSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RESUMEPOSITIONSIMPLE fromValue(String v) {
        for (RESUMEPOSITIONSIMPLE c: RESUMEPOSITIONSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
