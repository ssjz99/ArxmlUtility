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
 * <p>ARRAY-SIZE-SEMANTICS-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="ARRAY-SIZE-SEMANTICS-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FIXED-SIZE"/>
 *     &lt;enumeration value="VARIABLE-SIZE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ARRAY-SIZE-SEMANTICS-ENUM--SIMPLE")
@XmlEnum
public enum ARRAYSIZESEMANTICSENUMSIMPLE {


    /**
     * This means that the ApplicationArrayDataType will always have a fixed number of elements.
     * 
     */
    @XmlEnumValue("FIXED-SIZE")
    FIXED___SIZE("FIXED-SIZE"),

    /**
     * This implies that the actual number of elements in the ApplicationArrayDataType might vary at run-time. The value of arraySize represents the maximum number of elements in the array.
     * 
     */
    @XmlEnumValue("VARIABLE-SIZE")
    VARIABLE___SIZE("VARIABLE-SIZE");
    private final String value;

    ARRAYSIZESEMANTICSENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ARRAYSIZESEMANTICSENUMSIMPLE fromValue(String v) {
        for (ARRAYSIZESEMANTICSENUMSIMPLE c: ARRAYSIZESEMANTICSENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
