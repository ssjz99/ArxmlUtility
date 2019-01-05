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
 * <p>TD-EVENT-VARIABLE-DATA-PROTOTYPE-TYPE-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="TD-EVENT-VARIABLE-DATA-PROTOTYPE-TYPE-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="VARIABLE-DATA-PROTOTYPE-RECEIVED"/>
 *     &lt;enumeration value="VARIABLE-DATA-PROTOTYPE-SENT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TD-EVENT-VARIABLE-DATA-PROTOTYPE-TYPE-ENUM--SIMPLE")
@XmlEnum
public enum TDEVENTVARIABLEDATAPROTOTYPETYPEENUMSIMPLE {


    /**
     * A point in time where the referenced variable data prototype has been successfully transmitted and is available in the related communication buffer (of the RTE) for the receiving SWC.
     * 
     */
    @XmlEnumValue("VARIABLE-DATA-PROTOTYPE-RECEIVED")
    VARIABLE___DATA___PROTOTYPE___RECEIVED("VARIABLE-DATA-PROTOTYPE-RECEIVED"),

    /**
     * A point in time where the referenced variable data prototype has been successfully sent out by the sending SWC, so that it is available in the related communication buffer (of the RTE) for transmission.
     * 
     */
    @XmlEnumValue("VARIABLE-DATA-PROTOTYPE-SENT")
    VARIABLE___DATA___PROTOTYPE___SENT("VARIABLE-DATA-PROTOTYPE-SENT");
    private final String value;

    TDEVENTVARIABLEDATAPROTOTYPETYPEENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TDEVENTVARIABLEDATAPROTOTYPETYPEENUMSIMPLE fromValue(String v) {
        for (TDEVENTVARIABLEDATAPROTOTYPETYPEENUMSIMPLE c: TDEVENTVARIABLEDATAPROTOTYPETYPEENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
