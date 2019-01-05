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
 * <p>AUTOSAR-DATA-TYPE--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="AUTOSAR-DATA-TYPE--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="APPLICATION-ARRAY-DATA-TYPE"/>
 *     &lt;enumeration value="APPLICATION-COMPOSITE-DATA-TYPE"/>
 *     &lt;enumeration value="APPLICATION-DATA-TYPE"/>
 *     &lt;enumeration value="APPLICATION-PRIMITIVE-DATA-TYPE"/>
 *     &lt;enumeration value="APPLICATION-RECORD-DATA-TYPE"/>
 *     &lt;enumeration value="AUTOSAR-DATA-TYPE"/>
 *     &lt;enumeration value="IMPLEMENTATION-DATA-TYPE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AUTOSAR-DATA-TYPE--SUBTYPES-ENUM")
@XmlEnum
public enum AUTOSARDATATYPESUBTYPESENUM {

    @XmlEnumValue("APPLICATION-ARRAY-DATA-TYPE")
    APPLICATION___ARRAY___DATA___TYPE("APPLICATION-ARRAY-DATA-TYPE"),
    @XmlEnumValue("APPLICATION-COMPOSITE-DATA-TYPE")
    APPLICATION___COMPOSITE___DATA___TYPE("APPLICATION-COMPOSITE-DATA-TYPE"),
    @XmlEnumValue("APPLICATION-DATA-TYPE")
    APPLICATION___DATA___TYPE("APPLICATION-DATA-TYPE"),
    @XmlEnumValue("APPLICATION-PRIMITIVE-DATA-TYPE")
    APPLICATION___PRIMITIVE___DATA___TYPE("APPLICATION-PRIMITIVE-DATA-TYPE"),
    @XmlEnumValue("APPLICATION-RECORD-DATA-TYPE")
    APPLICATION___RECORD___DATA___TYPE("APPLICATION-RECORD-DATA-TYPE"),
    @XmlEnumValue("AUTOSAR-DATA-TYPE")
    AUTOSAR___DATA___TYPE("AUTOSAR-DATA-TYPE"),
    @XmlEnumValue("IMPLEMENTATION-DATA-TYPE")
    IMPLEMENTATION___DATA___TYPE("IMPLEMENTATION-DATA-TYPE");
    private final String value;

    AUTOSARDATATYPESUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AUTOSARDATATYPESUBTYPESENUM fromValue(String v) {
        for (AUTOSARDATATYPESUBTYPESENUM c: AUTOSARDATATYPESUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
