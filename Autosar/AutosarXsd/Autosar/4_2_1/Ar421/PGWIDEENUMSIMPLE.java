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
 * <p>PGWIDE-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="PGWIDE-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO-PGWIDE"/>
 *     &lt;enumeration value="PGWIDE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PGWIDE-ENUM--SIMPLE")
@XmlEnum
public enum PGWIDEENUMSIMPLE {


    /**
     * This indicates that the table shall be fit in the current text flow.
     * 
     */
    @XmlEnumValue("NO-PGWIDE")
    NO___PGWIDE("NO-PGWIDE"),

    /**
     * This indicates that the table may use the entire page width. This is in particular important in case of so called "side-head layouts" but also if the table is in a list or in a note.
     * 
     */
    PGWIDE("PGWIDE");
    private final String value;

    PGWIDEENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PGWIDEENUMSIMPLE fromValue(String v) {
        for (PGWIDEENUMSIMPLE c: PGWIDEENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
