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
 * <p>FLOAT-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="FLOAT-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FLOAT"/>
 *     &lt;enumeration value="NO-FLOAT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FLOAT-ENUM--SIMPLE")
@XmlEnum
public enum FLOATENUMSIMPLE {


    /**
     * This indicates that a page formatter is allowed to float the table to optimize the pagination. This is for example supported by TeX.
     * 
     */
    FLOAT("FLOAT"),

    /**
     * This indicates that a page formatter is not allowed to float the object to optimize the pagination.
     * 
     */
    @XmlEnumValue("NO-FLOAT")
    NO___FLOAT("NO-FLOAT");
    private final String value;

    FLOATENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FLOATENUMSIMPLE fromValue(String v) {
        for (FLOATENUMSIMPLE c: FLOATENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
