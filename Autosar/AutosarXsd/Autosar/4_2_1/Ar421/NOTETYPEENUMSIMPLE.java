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
 * <p>NOTE-TYPE-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="NOTE-TYPE-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CAUTION"/>
 *     &lt;enumeration value="EXAMPLE"/>
 *     &lt;enumeration value="EXERCISE"/>
 *     &lt;enumeration value="HINT"/>
 *     &lt;enumeration value="INSTRUCTION"/>
 *     &lt;enumeration value="OTHER"/>
 *     &lt;enumeration value="TIP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NOTE-TYPE-ENUM--SIMPLE")
@XmlEnum
public enum NOTETYPEENUMSIMPLE {


    /**
     * This indicates that the note is an alert which shall be considered carefully.
     * 
     */
    CAUTION,

    /**
     * This indicates that the note represents an example, e.g. a code example etc.
     * 
     */
    EXAMPLE,

    /**
     * This indicates that the note represents an exercise for the reader.
     * 
     */
    EXERCISE,

    /**
     * This indicates that the note represents a hint which helps the user for better understanding.
     * 
     */
    HINT,

    /**
     * This indicates that the note represents an instruction, e.g. a step by step procedure.
     * 
     */
    INSTRUCTION,

    /**
     * This indicates that the note is something else. The particular type of the note shall then be specified in the label of the note.
     * 
     */
    OTHER,

    /**
     * This indicates that the note represents which is good to know. It is similar to a hint, but focuses more to good practice than to better understanding.
     * 
     */
    TIP;

    public String value() {
        return name();
    }

    public static NOTETYPEENUMSIMPLE fromValue(String v) {
        return valueOf(v);
    }

}
