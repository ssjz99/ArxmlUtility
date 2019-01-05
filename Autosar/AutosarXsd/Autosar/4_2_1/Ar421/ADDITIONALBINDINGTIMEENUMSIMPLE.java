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
 * <p>ADDITIONAL-BINDING-TIME-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="ADDITIONAL-BINDING-TIME-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BLUEPRINT-DERIVATION-TIME"/>
 *     &lt;enumeration value="POST-BUILD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ADDITIONAL-BINDING-TIME-ENUM--SIMPLE")
@XmlEnum
public enum ADDITIONALBINDINGTIMEENUMSIMPLE {


    /**
     * The point in time when an object is created from a blueprint.
     * 
     */
    @XmlEnumValue("BLUEPRINT-DERIVATION-TIME")
    BLUEPRINT___DERIVATION___TIME("BLUEPRINT-DERIVATION-TIME"),

    /**
     * After the executable has been built.
     * 
     */
    @XmlEnumValue("POST-BUILD")
    POST___BUILD("POST-BUILD");
    private final String value;

    ADDITIONALBINDINGTIMEENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ADDITIONALBINDINGTIMEENUMSIMPLE fromValue(String v) {
        for (ADDITIONALBINDINGTIMEENUMSIMPLE c: ADDITIONALBINDINGTIMEENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
