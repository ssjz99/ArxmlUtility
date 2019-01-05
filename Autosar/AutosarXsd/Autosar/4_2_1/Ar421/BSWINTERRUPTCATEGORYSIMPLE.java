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
 * <p>BSW-INTERRUPT-CATEGORY--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="BSW-INTERRUPT-CATEGORY--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CAT-1"/>
 *     &lt;enumeration value="CAT-2"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BSW-INTERRUPT-CATEGORY--SIMPLE")
@XmlEnum
public enum BSWINTERRUPTCATEGORYSIMPLE {


    /**
     * Cat1 interrupt routines are not controlled by the OS and are only allowed to make a very limited selection of OS calls to enable and disable all interrupts. The BswInterruptEntity  is implemented by the interrupt service routine, which is directly called from the interrupt vector (not via the OS).
     * 
     */
    @XmlEnumValue("CAT-1")
    CAT___1("CAT-1"),

    /**
     * Cat2 interrupt routines are controlled by the OS and they are allowed to make OS calls. The BswInterruptEntity  is implemented by the interrupt handler, which is called from the OS.
     * 
     */
    @XmlEnumValue("CAT-2")
    CAT___2("CAT-2");
    private final String value;

    BSWINTERRUPTCATEGORYSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BSWINTERRUPTCATEGORYSIMPLE fromValue(String v) {
        for (BSWINTERRUPTCATEGORYSIMPLE c: BSWINTERRUPTCATEGORYSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
