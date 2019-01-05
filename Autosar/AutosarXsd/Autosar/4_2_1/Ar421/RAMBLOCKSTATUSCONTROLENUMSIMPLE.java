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
 * <p>RAM-BLOCK-STATUS-CONTROL-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="RAM-BLOCK-STATUS-CONTROL-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="API"/>
 *     &lt;enumeration value="NV-RAM-MANAGER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RAM-BLOCK-STATUS-CONTROL-ENUM--SIMPLE")
@XmlEnum
public enum RAMBLOCKSTATUSCONTROLENUMSIMPLE {


    /**
     * The ramBlock status is controlled via service interface by usage of the SetRamBlockStatus operation.
     * 
     */
    API("API"),

    /**
     * The ramBlock status is controlled exclusively by the Nv Ram Manager.
     * 
     */
    @XmlEnumValue("NV-RAM-MANAGER")
    NV___RAM___MANAGER("NV-RAM-MANAGER");
    private final String value;

    RAMBLOCKSTATUSCONTROLENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RAMBLOCKSTATUSCONTROLENUMSIMPLE fromValue(String v) {
        for (RAMBLOCKSTATUSCONTROLENUMSIMPLE c: RAMBLOCKSTATUSCONTROLENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
