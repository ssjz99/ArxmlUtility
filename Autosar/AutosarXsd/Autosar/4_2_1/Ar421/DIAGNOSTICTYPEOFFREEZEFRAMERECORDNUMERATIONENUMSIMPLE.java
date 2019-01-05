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
 * <p>DIAGNOSTIC-TYPE-OF-FREEZE-FRAME-RECORD-NUMERATION-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="DIAGNOSTIC-TYPE-OF-FREEZE-FRAME-RECORD-NUMERATION-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CALCULATED"/>
 *     &lt;enumeration value="CONFIGURED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DIAGNOSTIC-TYPE-OF-FREEZE-FRAME-RECORD-NUMERATION-ENUM--SIMPLE")
@XmlEnum
public enum DIAGNOSTICTYPEOFFREEZEFRAMERECORDNUMERATIONENUMSIMPLE {


    /**
     * Freeze frame records will be numbered consecutive starting by 1 in their chronological order.
     * 
     */
    CALCULATED,

    /**
     * Freeze frame records will be numbered based on the given configuration in their chronological order.
     * 
     */
    CONFIGURED;

    public String value() {
        return name();
    }

    public static DIAGNOSTICTYPEOFFREEZEFRAMERECORDNUMERATIONENUMSIMPLE fromValue(String v) {
        return valueOf(v);
    }

}
