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
 * <p>FM-FEATURE-SELECTION-STATE--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="FM-FEATURE-SELECTION-STATE--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DESELECTED"/>
 *     &lt;enumeration value="SELECTED"/>
 *     &lt;enumeration value="UNDECIDED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FM-FEATURE-SELECTION-STATE--SIMPLE")
@XmlEnum
public enum FMFEATURESELECTIONSTATESIMPLE {


    /**
     * The feature is excluded from the selection.
     * 
     */
    DESELECTED,

    /**
     * The feature is included in the selection.
     * 
     */
    SELECTED,

    /**
     * It is not yet decided whether the feature shall be included into or excluded from the selection.
     * 
     */
    UNDECIDED;

    public String value() {
        return name();
    }

    public static FMFEATURESELECTIONSTATESIMPLE fromValue(String v) {
        return valueOf(v);
    }

}
