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
 * <p>CHAPTER-ENUM-BREAK--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="CHAPTER-ENUM-BREAK--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BREAK"/>
 *     &lt;enumeration value="NO-BREAK"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CHAPTER-ENUM-BREAK--SIMPLE")
@XmlEnum
public enum CHAPTERENUMBREAKSIMPLE {


    /**
     * This indicates the a page break shall be applied before the current block.
     * 
     */
    BREAK("BREAK"),

    /**
     * This indicates that there is no need to force a page break before this block.
     * 
     */
    @XmlEnumValue("NO-BREAK")
    NO___BREAK("NO-BREAK");
    private final String value;

    CHAPTERENUMBREAKSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CHAPTERENUMBREAKSIMPLE fromValue(String v) {
        for (CHAPTERENUMBREAKSIMPLE c: CHAPTERENUMBREAKSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
