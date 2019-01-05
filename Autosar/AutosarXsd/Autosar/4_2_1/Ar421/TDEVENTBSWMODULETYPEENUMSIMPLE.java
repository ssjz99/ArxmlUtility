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
 * <p>TD-EVENT-BSW-MODULE-TYPE-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="TD-EVENT-BSW-MODULE-TYPE-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BSW-M-ENTRY-CALL-RETURNED"/>
 *     &lt;enumeration value="BSW-M-ENTRY-CALLED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TD-EVENT-BSW-MODULE-TYPE-ENUM--SIMPLE")
@XmlEnum
public enum TDEVENTBSWMODULETYPEENUMSIMPLE {


    /**
     * A point in time where the call of the associated BswModuleEntry has returned.
     * 
     */
    @XmlEnumValue("BSW-M-ENTRY-CALL-RETURNED")
    BSW___M___ENTRY___CALL___RETURNED("BSW-M-ENTRY-CALL-RETURNED"),

    /**
     * A point in time where the associated BswModuleEntry has been called.
     * 
     */
    @XmlEnumValue("BSW-M-ENTRY-CALLED")
    BSW___M___ENTRY___CALLED("BSW-M-ENTRY-CALLED");
    private final String value;

    TDEVENTBSWMODULETYPEENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TDEVENTBSWMODULETYPEENUMSIMPLE fromValue(String v) {
        for (TDEVENTBSWMODULETYPEENUMSIMPLE c: TDEVENTBSWMODULETYPEENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
