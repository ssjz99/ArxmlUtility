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
 * <p>APPLICATION-COMPOSITE-ELEMENT-DATA-PROTOTYPE--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="APPLICATION-COMPOSITE-ELEMENT-DATA-PROTOTYPE--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="APPLICATION-ARRAY-ELEMENT"/>
 *     &lt;enumeration value="APPLICATION-COMPOSITE-ELEMENT-DATA-PROTOTYPE"/>
 *     &lt;enumeration value="APPLICATION-RECORD-ELEMENT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "APPLICATION-COMPOSITE-ELEMENT-DATA-PROTOTYPE--SUBTYPES-ENUM")
@XmlEnum
public enum APPLICATIONCOMPOSITEELEMENTDATAPROTOTYPESUBTYPESENUM {

    @XmlEnumValue("APPLICATION-ARRAY-ELEMENT")
    APPLICATION___ARRAY___ELEMENT("APPLICATION-ARRAY-ELEMENT"),
    @XmlEnumValue("APPLICATION-COMPOSITE-ELEMENT-DATA-PROTOTYPE")
    APPLICATION___COMPOSITE___ELEMENT___DATA___PROTOTYPE("APPLICATION-COMPOSITE-ELEMENT-DATA-PROTOTYPE"),
    @XmlEnumValue("APPLICATION-RECORD-ELEMENT")
    APPLICATION___RECORD___ELEMENT("APPLICATION-RECORD-ELEMENT");
    private final String value;

    APPLICATIONCOMPOSITEELEMENTDATAPROTOTYPESUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static APPLICATIONCOMPOSITEELEMENTDATAPROTOTYPESUBTYPESENUM fromValue(String v) {
        for (APPLICATIONCOMPOSITEELEMENTDATAPROTOTYPESUBTYPESENUM c: APPLICATIONCOMPOSITEELEMENTDATAPROTOTYPESUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
