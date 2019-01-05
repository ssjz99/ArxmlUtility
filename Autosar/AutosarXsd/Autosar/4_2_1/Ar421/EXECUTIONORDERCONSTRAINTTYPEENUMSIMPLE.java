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
 * <p>EXECUTION-ORDER-CONSTRAINT-TYPE-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="EXECUTION-ORDER-CONSTRAINT-TYPE-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="HIERARCHICAL-EOC"/>
 *     &lt;enumeration value="ORDINARY-EOC"/>
 *     &lt;enumeration value="REPETITIVE-EOC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EXECUTION-ORDER-CONSTRAINT-TYPE-ENUM--SIMPLE")
@XmlEnum
public enum EXECUTIONORDERCONSTRAINTTYPEENUMSIMPLE {


    /**
     * Specifies that the Execution Order Constraint specifies a hierarchical execution order constraint.
     * 
     */
    @XmlEnumValue("HIERARCHICAL-EOC")
    HIERARCHICAL___EOC("HIERARCHICAL-EOC"),

    /**
     * Specifies that the Execution Order Constraint specifies an ordinary execution order constraint.
     * 
     */
    @XmlEnumValue("ORDINARY-EOC")
    ORDINARY___EOC("ORDINARY-EOC"),

    /**
     * Specifies that the Execution Order Constraint specifies a repetitive execution order constraint.
     * 
     */
    @XmlEnumValue("REPETITIVE-EOC")
    REPETITIVE___EOC("REPETITIVE-EOC");
    private final String value;

    EXECUTIONORDERCONSTRAINTTYPEENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EXECUTIONORDERCONSTRAINTTYPEENUMSIMPLE fromValue(String v) {
        for (EXECUTIONORDERCONSTRAINTTYPEENUMSIMPLE c: EXECUTIONORDERCONSTRAINTTYPEENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
