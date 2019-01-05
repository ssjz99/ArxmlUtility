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
 * <p>AUTO-COLLECT-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="AUTO-COLLECT-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="REF-ALL"/>
 *     &lt;enumeration value="REF-NON-STANDARD"/>
 *     &lt;enumeration value="REF-NONE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AUTO-COLLECT-ENUM--SIMPLE")
@XmlEnum
public enum AUTOCOLLECTENUMSIMPLE {


    /**
     * All objects being referenced (recursively) from the objects mentioned directly in the collection are also considered as part of the collection.
     * 
     */
    @XmlEnumValue("REF-ALL")
    REF___ALL("REF-ALL"),

    /**
     * This indicates that non standard objects ([TPS_GST_00088]) referenced (recursively) by the objects mentioned directly in the collection are also considered to be part of the collection.
     * 
     */
    @XmlEnumValue("REF-NON-STANDARD")
    REF___NON___STANDARD("REF-NON-STANDARD"),

    /**
     * This indicates that only those objects mentioned directly in the collection are part of the collection. No other objects are considered further.
     * 
     */
    @XmlEnumValue("REF-NONE")
    REF___NONE("REF-NONE");
    private final String value;

    AUTOCOLLECTENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AUTOCOLLECTENUMSIMPLE fromValue(String v) {
        for (AUTOCOLLECTENUMSIMPLE c: AUTOCOLLECTENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
