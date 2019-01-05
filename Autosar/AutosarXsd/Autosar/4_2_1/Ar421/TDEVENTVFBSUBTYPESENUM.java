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
 * <p>TD-EVENT-VFB--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="TD-EVENT-VFB--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TD-EVENT-MODE-DECLARATION"/>
 *     &lt;enumeration value="TD-EVENT-OPERATION"/>
 *     &lt;enumeration value="TD-EVENT-TRIGGER"/>
 *     &lt;enumeration value="TD-EVENT-VARIABLE-DATA-PROTOTYPE"/>
 *     &lt;enumeration value="TD-EVENT-VFB"/>
 *     &lt;enumeration value="TD-EVENT-VFB-PORT"/>
 *     &lt;enumeration value="TD-EVENT-VFB-REFERENCE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TD-EVENT-VFB--SUBTYPES-ENUM")
@XmlEnum
public enum TDEVENTVFBSUBTYPESENUM {

    @XmlEnumValue("TD-EVENT-MODE-DECLARATION")
    TD___EVENT___MODE___DECLARATION("TD-EVENT-MODE-DECLARATION"),
    @XmlEnumValue("TD-EVENT-OPERATION")
    TD___EVENT___OPERATION("TD-EVENT-OPERATION"),
    @XmlEnumValue("TD-EVENT-TRIGGER")
    TD___EVENT___TRIGGER("TD-EVENT-TRIGGER"),
    @XmlEnumValue("TD-EVENT-VARIABLE-DATA-PROTOTYPE")
    TD___EVENT___VARIABLE___DATA___PROTOTYPE("TD-EVENT-VARIABLE-DATA-PROTOTYPE"),
    @XmlEnumValue("TD-EVENT-VFB")
    TD___EVENT___VFB("TD-EVENT-VFB"),
    @XmlEnumValue("TD-EVENT-VFB-PORT")
    TD___EVENT___VFB___PORT("TD-EVENT-VFB-PORT"),
    @XmlEnumValue("TD-EVENT-VFB-REFERENCE")
    TD___EVENT___VFB___REFERENCE("TD-EVENT-VFB-REFERENCE");
    private final String value;

    TDEVENTVFBSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TDEVENTVFBSUBTYPESENUM fromValue(String v) {
        for (TDEVENTVFBSUBTYPESENUM c: TDEVENTVFBSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
