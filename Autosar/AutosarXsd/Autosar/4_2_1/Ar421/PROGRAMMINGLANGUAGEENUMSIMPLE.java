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
 * <p>PROGRAMMINGLANGUAGE-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="PROGRAMMINGLANGUAGE-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="CPP"/>
 *     &lt;enumeration value="JAVA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PROGRAMMINGLANGUAGE-ENUM--SIMPLE")
@XmlEnum
public enum PROGRAMMINGLANGUAGEENUMSIMPLE {


    /**
     * C language
     * 
     */
    C,

    /**
     * C++ language
     * 
     */
    CPP,

    /**
     * Java language
     * 
     */
    JAVA;

    public String value() {
        return name();
    }

    public static PROGRAMMINGLANGUAGEENUMSIMPLE fromValue(String v) {
        return valueOf(v);
    }

}
