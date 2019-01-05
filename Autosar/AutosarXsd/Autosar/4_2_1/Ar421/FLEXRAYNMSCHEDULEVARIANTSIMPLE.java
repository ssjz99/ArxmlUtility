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
 * <p>FLEXRAY-NM-SCHEDULE-VARIANT--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="FLEXRAY-NM-SCHEDULE-VARIANT--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SCHEDULE-VARIANT-1"/>
 *     &lt;enumeration value="SCHEDULE-VARIANT-2"/>
 *     &lt;enumeration value="SCHEDULE-VARIANT-3"/>
 *     &lt;enumeration value="SCHEDULE-VARIANT-4"/>
 *     &lt;enumeration value="SCHEDULE-VARIANT-5"/>
 *     &lt;enumeration value="SCHEDULE-VARIANT-6"/>
 *     &lt;enumeration value="SCHEDULE-VARIANT-7"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FLEXRAY-NM-SCHEDULE-VARIANT--SIMPLE")
@XmlEnum
public enum FLEXRAYNMSCHEDULEVARIANTSIMPLE {


    /**
     * NM-Vote and NM Data transmitted within one PDU in static segment. The NM-Vote has to be realized as separate bit within the PDU.
     * 
     */
    @XmlEnumValue("SCHEDULE-VARIANT-1")
    SCHEDULE___VARIANT___1("SCHEDULE-VARIANT-1"),

    /**
     * NM-Vote and NM-Data transmitted within one PDU in dynamic segment. The presence (or non-presence) of the PDU corresponds to the NM-Vote
     * 
     */
    @XmlEnumValue("SCHEDULE-VARIANT-2")
    SCHEDULE___VARIANT___2("SCHEDULE-VARIANT-2"),

    /**
     * NM-Vote and NM-Data are transmitted in the static segment in separate PDUs. This alternative is not recommended => Alternative 1 should be used instead.
     * 
     */
    @XmlEnumValue("SCHEDULE-VARIANT-3")
    SCHEDULE___VARIANT___3("SCHEDULE-VARIANT-3"),

    /**
     * NM-Vote transmitted in static and NM-Data transmitted in dynamic segment.
     * 
     */
    @XmlEnumValue("SCHEDULE-VARIANT-4")
    SCHEDULE___VARIANT___4("SCHEDULE-VARIANT-4"),

    /**
     * NM-Vote is transmitted in dynamic and NM-Data is transmitted in static segment. This alternative is not recommended => Variants 2 or 6 should be used instead.
     * 
     */
    @XmlEnumValue("SCHEDULE-VARIANT-5")
    SCHEDULE___VARIANT___5("SCHEDULE-VARIANT-5"),

    /**
     * NM-Vote and NM-Data are transmitted in dynamic segment in separate PDUs.
     * 
     */
    @XmlEnumValue("SCHEDULE-VARIANT-6")
    SCHEDULE___VARIANT___6("SCHEDULE-VARIANT-6"),

    /**
     * NM-Vote and a copy of the CBV are transmitted in the static segment (using the FlexRay NM Vector support) and NM-Data is transmitted in the dynamic segment
     * 
     */
    @XmlEnumValue("SCHEDULE-VARIANT-7")
    SCHEDULE___VARIANT___7("SCHEDULE-VARIANT-7");
    private final String value;

    FLEXRAYNMSCHEDULEVARIANTSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FLEXRAYNMSCHEDULEVARIANTSIMPLE fromValue(String v) {
        for (FLEXRAYNMSCHEDULEVARIANTSIMPLE c: FLEXRAYNMSCHEDULEVARIANTSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
