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
 * <p>REMOTING-TECHNOLOGY-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="REMOTING-TECHNOLOGY-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AR--CLIENT--SERVER"/>
 *     &lt;enumeration value="SOMEIP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "REMOTING-TECHNOLOGY-ENUM--SIMPLE")
@XmlEnum
public enum REMOTINGTECHNOLOGYENUMSIMPLE {

    @XmlEnumValue("AR--CLIENT--SERVER")
    AR____CLIENT____SERVER("AR--CLIENT--SERVER"),
    SOMEIP("SOMEIP");
    private final String value;

    REMOTINGTECHNOLOGYENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static REMOTINGTECHNOLOGYENUMSIMPLE fromValue(String v) {
        for (REMOTINGTECHNOLOGYENUMSIMPLE c: REMOTINGTECHNOLOGYENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
