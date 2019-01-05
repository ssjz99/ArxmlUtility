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
 * <p>DATA-FILTER-TYPE-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="DATA-FILTER-TYPE-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ALWAYS"/>
 *     &lt;enumeration value="MASKED-NEW-DIFFERS-MASKED-OLD"/>
 *     &lt;enumeration value="MASKED-NEW-DIFFERS-X"/>
 *     &lt;enumeration value="MASKED-NEW-EQUALS-X"/>
 *     &lt;enumeration value="NEVER"/>
 *     &lt;enumeration value="NEW-IS-OUTSIDE"/>
 *     &lt;enumeration value="NEW-IS-WITHIN"/>
 *     &lt;enumeration value="ONE-EVERY-N"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DATA-FILTER-TYPE-ENUM--SIMPLE")
@XmlEnum
public enum DATAFILTERTYPEENUMSIMPLE {


    /**
     * No filtering is performed so that the message always passes.
     * 
     */
    ALWAYS("ALWAYS"),

    /**
     * Pass messages where the masked value has changed.
     * 
     * (new_value&mask) !=(old_value&mask)
     * new_value: current value of the message
     * old_value: last value of the message (initialized with the initial value of the message, updated with new_value if the new message value is not filtered out)
     * 
     */
    @XmlEnumValue("MASKED-NEW-DIFFERS-MASKED-OLD")
    MASKED___NEW___DIFFERS___MASKED___OLD("MASKED-NEW-DIFFERS-MASKED-OLD"),

    /**
     * Pass messages whose masked value is not equal to a specific value x
     * 
     * (new_value&mask) != x
     * new_value: current value of the message
     * 
     */
    @XmlEnumValue("MASKED-NEW-DIFFERS-X")
    MASKED___NEW___DIFFERS___X("MASKED-NEW-DIFFERS-X"),

    /**
     * Pass messages whose masked value is equal to a specific value x
     * 
     * (new_value&amp;mask) == x
     * new_value: current value of the message
     * 
     */
    @XmlEnumValue("MASKED-NEW-EQUALS-X")
    MASKED___NEW___EQUALS___X("MASKED-NEW-EQUALS-X"),

    /**
     * The filter removes all messages.
     * 
     */
    NEVER("NEVER"),

    /**
     * Pass a message if its value is outside a predefined boundary.
     * 
     * (min > new_value) OR (new_value > max)
     * 
     */
    @XmlEnumValue("NEW-IS-OUTSIDE")
    NEW___IS___OUTSIDE("NEW-IS-OUTSIDE"),

    /**
     * Pass a message if its value is within a predefined boundary.
     * 
     * min <= new_value <= max
     * 
     */
    @XmlEnumValue("NEW-IS-WITHIN")
    NEW___IS___WITHIN("NEW-IS-WITHIN"),

    /**
     * Pass a message once every N message occurrences.
     * Algorithm: occurrence % period == offset
     * Start: occurrence = 0.
     * Each time the message is received or transmitted, occurrence is incremented by 1 after filtering.
     * Length of occurrence is 8 bit (minimum).
     * 
     */
    @XmlEnumValue("ONE-EVERY-N")
    ONE___EVERY___N("ONE-EVERY-N");
    private final String value;

    DATAFILTERTYPEENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DATAFILTERTYPEENUMSIMPLE fromValue(String v) {
        for (DATAFILTERTYPEENUMSIMPLE c: DATAFILTERTYPEENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
