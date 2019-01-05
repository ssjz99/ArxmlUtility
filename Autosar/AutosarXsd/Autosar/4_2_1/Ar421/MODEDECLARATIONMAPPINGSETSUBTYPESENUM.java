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
 * <p>MODE-DECLARATION-MAPPING-SET--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="MODE-DECLARATION-MAPPING-SET--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MODE-DECLARATION-MAPPING-SET"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MODE-DECLARATION-MAPPING-SET--SUBTYPES-ENUM")
@XmlEnum
public enum MODEDECLARATIONMAPPINGSETSUBTYPESENUM {

    @XmlEnumValue("MODE-DECLARATION-MAPPING-SET")
    MODE___DECLARATION___MAPPING___SET("MODE-DECLARATION-MAPPING-SET");
    private final String value;

    MODEDECLARATIONMAPPINGSETSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MODEDECLARATIONMAPPINGSETSUBTYPESENUM fromValue(String v) {
        for (MODEDECLARATIONMAPPINGSETSUBTYPESENUM c: MODEDECLARATIONMAPPINGSETSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
