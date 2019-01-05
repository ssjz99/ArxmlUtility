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
 * <p>MAPPING-SCOPE-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="MAPPING-SCOPE-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MAPPING-SCOPE-CORE"/>
 *     &lt;enumeration value="MAPPING-SCOPE-ECU"/>
 *     &lt;enumeration value="MAPPING-SCOPE-PARTITION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MAPPING-SCOPE-ENUM--SIMPLE")
@XmlEnum
public enum MAPPINGSCOPEENUMSIMPLE {


    /**
     * The mapping constraint applies to different Cores.
     * 
     */
    @XmlEnumValue("MAPPING-SCOPE-CORE")
    MAPPING___SCOPE___CORE("MAPPING-SCOPE-CORE"),

    /**
     * The mapping constraint applies to different Ecus.
     * 
     */
    @XmlEnumValue("MAPPING-SCOPE-ECU")
    MAPPING___SCOPE___ECU("MAPPING-SCOPE-ECU"),

    /**
     * The mapping constraint applies to different Partitions.
     * 
     */
    @XmlEnumValue("MAPPING-SCOPE-PARTITION")
    MAPPING___SCOPE___PARTITION("MAPPING-SCOPE-PARTITION");
    private final String value;

    MAPPINGSCOPEENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MAPPINGSCOPEENUMSIMPLE fromValue(String v) {
        for (MAPPINGSCOPEENUMSIMPLE c: MAPPINGSCOPEENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
