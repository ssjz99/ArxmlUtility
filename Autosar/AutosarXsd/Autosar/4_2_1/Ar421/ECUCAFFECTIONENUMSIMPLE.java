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
 * <p>ECUC-AFFECTION-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="ECUC-AFFECTION-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LT-AFFECTS-PB"/>
 *     &lt;enumeration value="NO-AFFECT"/>
 *     &lt;enumeration value="PC-AFFECTS-LT"/>
 *     &lt;enumeration value="PC-AFFECTS-LT-AND-PB"/>
 *     &lt;enumeration value="PC-AFFECTS-PB"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ECUC-AFFECTION-ENUM--SIMPLE")
@XmlEnum
public enum ECUCAFFECTIONENUMSIMPLE {


    /**
     * A link time parameter affecting one or several post-build time parameter(s).
     * 
     */
    @XmlEnumValue("LT-AFFECTS-PB")
    LT___AFFECTS___PB("LT-AFFECTS-PB"),

    /**
     * no affect on any other parameter.
     * 
     */
    @XmlEnumValue("NO-AFFECT")
    NO___AFFECT("NO-AFFECT"),

    /**
     * A pre-compile time parameter affecting one or several link time parameter(s).
     * 
     */
    @XmlEnumValue("PC-AFFECTS-LT")
    PC___AFFECTS___LT("PC-AFFECTS-LT"),

    /**
     * A pre-compile time parameter affecting one or several link time and post-build time parameter(s)).
     * 
     */
    @XmlEnumValue("PC-AFFECTS-LT-AND-PB")
    PC___AFFECTS___LT___AND___PB("PC-AFFECTS-LT-AND-PB"),

    /**
     * A pre-compile time parameter affecting one or several post build time parameter(s).
     * 
     */
    @XmlEnumValue("PC-AFFECTS-PB")
    PC___AFFECTS___PB("PC-AFFECTS-PB");
    private final String value;

    ECUCAFFECTIONENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ECUCAFFECTIONENUMSIMPLE fromValue(String v) {
        for (ECUCAFFECTIONENUMSIMPLE c: ECUCAFFECTIONENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
