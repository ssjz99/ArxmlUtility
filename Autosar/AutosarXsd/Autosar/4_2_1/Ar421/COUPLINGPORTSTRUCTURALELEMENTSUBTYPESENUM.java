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
 * <p>COUPLING-PORT-STRUCTURAL-ELEMENT--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="COUPLING-PORT-STRUCTURAL-ELEMENT--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="COUPLING-PORT-FIFO"/>
 *     &lt;enumeration value="COUPLING-PORT-SCHEDULER"/>
 *     &lt;enumeration value="COUPLING-PORT-SHAPER"/>
 *     &lt;enumeration value="COUPLING-PORT-STRUCTURAL-ELEMENT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "COUPLING-PORT-STRUCTURAL-ELEMENT--SUBTYPES-ENUM")
@XmlEnum
public enum COUPLINGPORTSTRUCTURALELEMENTSUBTYPESENUM {

    @XmlEnumValue("COUPLING-PORT-FIFO")
    COUPLING___PORT___FIFO("COUPLING-PORT-FIFO"),
    @XmlEnumValue("COUPLING-PORT-SCHEDULER")
    COUPLING___PORT___SCHEDULER("COUPLING-PORT-SCHEDULER"),
    @XmlEnumValue("COUPLING-PORT-SHAPER")
    COUPLING___PORT___SHAPER("COUPLING-PORT-SHAPER"),
    @XmlEnumValue("COUPLING-PORT-STRUCTURAL-ELEMENT")
    COUPLING___PORT___STRUCTURAL___ELEMENT("COUPLING-PORT-STRUCTURAL-ELEMENT");
    private final String value;

    COUPLINGPORTSTRUCTURALELEMENTSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static COUPLINGPORTSTRUCTURALELEMENTSUBTYPESENUM fromValue(String v) {
        for (COUPLINGPORTSTRUCTURALELEMENTSUBTYPESENUM c: COUPLINGPORTSTRUCTURALELEMENTSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
