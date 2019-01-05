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
 * <p>BINDING-TIME-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="BINDING-TIME-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CODE-GENERATION-TIME"/>
 *     &lt;enumeration value="LINK-TIME"/>
 *     &lt;enumeration value="PRE-COMPILE-TIME"/>
 *     &lt;enumeration value="SYSTEM-DESIGN-TIME"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BINDING-TIME-ENUM--SIMPLE")
@XmlEnum
public enum BINDINGTIMEENUMSIMPLE {


    /**
     * * Coding by hand, based on requirements document.
     * * Tool based code generation, e.g. from a model.
     * * The model may contain variants.
     * * Only code for the selected variant(s) is actually generated.
     * 
     */
    @XmlEnumValue("CODE-GENERATION-TIME")
    CODE___GENERATION___TIME("CODE-GENERATION-TIME"),

    /**
     * Configure what is included in object code, and what is omitted
     * Based on which variant(s) are selected
     * E.g. for modules that are delivered as object code (as opposed to those that are delivered as source code)
     * 
     */
    @XmlEnumValue("LINK-TIME")
    LINK___TIME("LINK-TIME"),

    /**
     * This is typically the C-Preprocessor.
     * Exclude parts of the code from the compilation process, e.g.,
     * because they are not required for the selected variant,
     * because they are incompatible with the selected variant,
     * because they require resources that are not present in the selected variant.
     * Object code is only generated for the selected variant(s).
     * The code that is excluded at this stage code will not be available at later stages.
     * 
     */
    @XmlEnumValue("PRE-COMPILE-TIME")
    PRE___COMPILE___TIME("PRE-COMPILE-TIME"),

    /**
     * * Designing the VFB.
     * * Software Component types (PortInterfaces).
     * * SWC Prototypes and the Connections between SWCprototypes.
     * * Designing the Topology
     * * ECUs and interconnecting Networks
     * * Designing the Communication Matrix and Data Mapping
     * 
     */
    @XmlEnumValue("SYSTEM-DESIGN-TIME")
    SYSTEM___DESIGN___TIME("SYSTEM-DESIGN-TIME");
    private final String value;

    BINDINGTIMEENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BINDINGTIMEENUMSIMPLE fromValue(String v) {
        for (BINDINGTIMEENUMSIMPLE c: BINDINGTIMEENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
