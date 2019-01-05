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
 * <p>NV-BLOCK-NEEDS-WRITING-PRIORITY-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="NV-BLOCK-NEEDS-WRITING-PRIORITY-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="HIGH"/>
 *     &lt;enumeration value="LOW"/>
 *     &lt;enumeration value="MEDIUM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NV-BLOCK-NEEDS-WRITING-PRIORITY-ENUM--SIMPLE")
@XmlEnum
public enum NVBLOCKNEEDSWRITINGPRIORITYENUMSIMPLE {


    /**
     * Writing priority is high.
     * 
     */
    HIGH,

    /**
     * Writing priority is low.
     * 
     */
    LOW,

    /**
     * Writing priority is medium.
     * 
     */
    MEDIUM;

    public String value() {
        return name();
    }

    public static NVBLOCKNEEDSWRITINGPRIORITYENUMSIMPLE fromValue(String v) {
        return valueOf(v);
    }

}
