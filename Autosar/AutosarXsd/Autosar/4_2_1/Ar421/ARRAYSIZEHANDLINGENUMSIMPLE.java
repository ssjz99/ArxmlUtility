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
 * <p>ARRAY-SIZE-HANDLING-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="ARRAY-SIZE-HANDLING-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ALL-INDICES-DIFFERENT-ARRAY-SIZE"/>
 *     &lt;enumeration value="ALL-INDICES-SAME-ARRAY-SIZE"/>
 *     &lt;enumeration value="INHERITED-FROM-ARRAY-ELEMENT-TYPE-SIZE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ARRAY-SIZE-HANDLING-ENUM--SIMPLE")
@XmlEnum
public enum ARRAYSIZEHANDLINGENUMSIMPLE {


    /**
     * All elements of the variable size array may have different sizes.
     * 
     */
    @XmlEnumValue("ALL-INDICES-DIFFERENT-ARRAY-SIZE")
    ALL___INDICES___DIFFERENT___ARRAY___SIZE("ALL-INDICES-DIFFERENT-ARRAY-SIZE"),

    /**
     * All elements of the variable size array have the same size.
     * 
     */
    @XmlEnumValue("ALL-INDICES-SAME-ARRAY-SIZE")
    ALL___INDICES___SAME___ARRAY___SIZE("ALL-INDICES-SAME-ARRAY-SIZE"),

    /**
     * All size of the variable size array is determined by the size of the size of the contained array elements.
     * 
     */
    @XmlEnumValue("INHERITED-FROM-ARRAY-ELEMENT-TYPE-SIZE")
    INHERITED___FROM___ARRAY___ELEMENT___TYPE___SIZE("INHERITED-FROM-ARRAY-ELEMENT-TYPE-SIZE");
    private final String value;

    ARRAYSIZEHANDLINGENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ARRAYSIZEHANDLINGENUMSIMPLE fromValue(String v) {
        for (ARRAYSIZEHANDLINGENUMSIMPLE c: ARRAYSIZEHANDLINGENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
