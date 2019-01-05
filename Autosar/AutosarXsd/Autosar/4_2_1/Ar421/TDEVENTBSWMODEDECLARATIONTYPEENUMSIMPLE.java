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
 * <p>TD-EVENT-BSW-MODE-DECLARATION-TYPE-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="TD-EVENT-BSW-MODE-DECLARATION-TYPE-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MODE-DECLARATION-REQUESTED"/>
 *     &lt;enumeration value="MODE-DECLARATION-SWITCH-COMPLETED"/>
 *     &lt;enumeration value="MODE-DECLARATION-SWITCH-INITIATED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TD-EVENT-BSW-MODE-DECLARATION-TYPE-ENUM--SIMPLE")
@XmlEnum
public enum TDEVENTBSWMODEDECLARATIONTYPEENUMSIMPLE {


    /**
     * A point in time where the associated ModeDeclarationGroupPrototype has been requested.
     * 
     */
    @XmlEnumValue("MODE-DECLARATION-REQUESTED")
    MODE___DECLARATION___REQUESTED("MODE-DECLARATION-REQUESTED"),

    /**
     * A point in time where the switch to the associated ModeDeclarationGroupPrototype has been completed.
     * 
     */
    @XmlEnumValue("MODE-DECLARATION-SWITCH-COMPLETED")
    MODE___DECLARATION___SWITCH___COMPLETED("MODE-DECLARATION-SWITCH-COMPLETED"),

    /**
     * A point in time where the switch to the associated ModeDeclarationGroupPrototype has been initiated by the BswM.
     * 
     */
    @XmlEnumValue("MODE-DECLARATION-SWITCH-INITIATED")
    MODE___DECLARATION___SWITCH___INITIATED("MODE-DECLARATION-SWITCH-INITIATED");
    private final String value;

    TDEVENTBSWMODEDECLARATIONTYPEENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TDEVENTBSWMODEDECLARATIONTYPEENUMSIMPLE fromValue(String v) {
        for (TDEVENTBSWMODEDECLARATIONTYPEENUMSIMPLE c: TDEVENTBSWMODEDECLARATIONTYPEENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
