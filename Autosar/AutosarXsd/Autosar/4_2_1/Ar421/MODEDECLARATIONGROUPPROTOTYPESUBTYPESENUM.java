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
 * <p>MODE-DECLARATION-GROUP-PROTOTYPE--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="MODE-DECLARATION-GROUP-PROTOTYPE--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MODE-DECLARATION-GROUP-PROTOTYPE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MODE-DECLARATION-GROUP-PROTOTYPE--SUBTYPES-ENUM")
@XmlEnum
public enum MODEDECLARATIONGROUPPROTOTYPESUBTYPESENUM {

    @XmlEnumValue("MODE-DECLARATION-GROUP-PROTOTYPE")
    MODE___DECLARATION___GROUP___PROTOTYPE("MODE-DECLARATION-GROUP-PROTOTYPE");
    private final String value;

    MODEDECLARATIONGROUPPROTOTYPESUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MODEDECLARATIONGROUPPROTOTYPESUBTYPESENUM fromValue(String v) {
        for (MODEDECLARATIONGROUPPROTOTYPESUBTYPESENUM c: MODEDECLARATIONGROUPPROTOTYPESUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
