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
 * <p>MEMORY-ALLOCATION-KEYWORD-POLICY-TYPE--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="MEMORY-ALLOCATION-KEYWORD-POLICY-TYPE--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ADDR-METHOD-SHORT-NAME"/>
 *     &lt;enumeration value="ADDR-METHOD-SHORT-NAME-AND-ALIGNMENT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MEMORY-ALLOCATION-KEYWORD-POLICY-TYPE--SIMPLE")
@XmlEnum
public enum MEMORYALLOCATIONKEYWORDPOLICYTYPESIMPLE {


    /**
     * The MemorySection shortNames of referring MemorySections and therefore the belonging Memory Allocation Keywords in the code are build with the shortName of the SwAddrMethod. This is the default value if the attribute does not exist.
     * 
     */
    @XmlEnumValue("ADDR-METHOD-SHORT-NAME")
    ADDR___METHOD___SHORT___NAME("ADDR-METHOD-SHORT-NAME"),

    /**
     * The MemorySection shortNames of referring MemorySections and therefore the belonging Memory Allocation Keywords in the code are build with the shortName of the SwAddrMethod and a variable alignment postfix.
     * 
     * Thereby the alignment postfix needs to be consistent with the alignment attribute of the related MemorySection.
     * 
     */
    @XmlEnumValue("ADDR-METHOD-SHORT-NAME-AND-ALIGNMENT")
    ADDR___METHOD___SHORT___NAME___AND___ALIGNMENT("ADDR-METHOD-SHORT-NAME-AND-ALIGNMENT");
    private final String value;

    MEMORYALLOCATIONKEYWORDPOLICYTYPESIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MEMORYALLOCATIONKEYWORDPOLICYTYPESIMPLE fromValue(String v) {
        for (MEMORYALLOCATIONKEYWORDPOLICYTYPESIMPLE c: MEMORYALLOCATIONKEYWORDPOLICYTYPESIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
