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
 * <p>ITEM-LABEL-POS-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="ITEM-LABEL-POS-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NEWLINE"/>
 *     &lt;enumeration value="NEWLINE-IF-NECESSARY"/>
 *     &lt;enumeration value="NO-NEWLINE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ITEM-LABEL-POS-ENUM--SIMPLE")
@XmlEnum
public enum ITEMLABELPOSENUMSIMPLE {


    /**
     * The label is renders in a new line.
     * 
     */
    NEWLINE("NEWLINE"),

    /**
     * The label is rendered in a new line if it is longer than the indentation.
     * 
     */
    @XmlEnumValue("NEWLINE-IF-NECESSARY")
    NEWLINE___IF___NECESSARY("NEWLINE-IF-NECESSARY"),

    /**
     * The label is rendered in one line with the item even if it is longer than the indentation.
     * 
     */
    @XmlEnumValue("NO-NEWLINE")
    NO___NEWLINE("NO-NEWLINE");
    private final String value;

    ITEMLABELPOSENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ITEMLABELPOSENUMSIMPLE fromValue(String v) {
        for (ITEMLABELPOSENUMSIMPLE c: ITEMLABELPOSENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
