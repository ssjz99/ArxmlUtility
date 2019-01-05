//
// ????? JavaTM Architecture for XML Binding (JAXB) ???? v2.2.8-b130911.1802 ???
// ??? <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// ?????????, ??????????????
// ????: 2018.03.12 ?? 11:42:22 PM CET 
//


package Ar421;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DIAGNOSTIC-DEBOUNCE-BEHAVIOR-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="DIAGNOSTIC-DEBOUNCE-BEHAVIOR-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FREEZE"/>
 *     &lt;enumeration value="RESET"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DIAGNOSTIC-DEBOUNCE-BEHAVIOR-ENUM--SIMPLE")
@XmlEnum
public enum DIAGNOSTICDEBOUNCEBEHAVIORENUMSIMPLE {


    /**
     * The event debounce counter will be frozen with the current value and will not change while a related enable condition is not fulfilled or ControlDTCSetting of the related event is disabled. After all related enable conditions are fulfilled and ControlDTCSetting of the related event is enabled again, the event qualification will continue with the next report of the event (i.e. SetEventStatus).
     * 
     */
    FREEZE,

    /**
     * The event debounce counter will be reset to initial value if a related enable condition is not fulfilled or
     * ControlDTCSetting of the related event is disabled. The qualification of the event will be restarted with the next valid event report.
     * 
     */
    RESET;

    public String value() {
        return name();
    }

    public static DIAGNOSTICDEBOUNCEBEHAVIORENUMSIMPLE fromValue(String v) {
        return valueOf(v);
    }

}
