//
// ????? JavaTM Architecture for XML Binding (JAXB) ???? v2.2.8-b130911.1802 ???
// ??? <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// ?????????, ??????????????
// ????: 2018.03.12 ?? 11:42:22 PM CET 
//


package Ar421;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TRANSFORMER-CLASS-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="TRANSFORMER-CLASS-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CUSTOM"/>
 *     &lt;enumeration value="SAFETY"/>
 *     &lt;enumeration value="SECURITY"/>
 *     &lt;enumeration value="SERIALIZER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TRANSFORMER-CLASS-ENUM--SIMPLE")
@XmlEnum
public enum TRANSFORMERCLASSENUMSIMPLE {


    /**
     * The transformer is a custom transformer.
     * 
     */
    CUSTOM,

    /**
     * The transformer is a safety transformer.
     * 
     */
    SAFETY,

    /**
     * The transformer is a security transformer.
     * 
     */
    SECURITY,

    /**
     * The transformer is a serializing transformer.
     * 
     */
    SERIALIZER;

    public String value() {
        return name();
    }

    public static TRANSFORMERCLASSENUMSIMPLE fromValue(String v) {
        return valueOf(v);
    }

}
