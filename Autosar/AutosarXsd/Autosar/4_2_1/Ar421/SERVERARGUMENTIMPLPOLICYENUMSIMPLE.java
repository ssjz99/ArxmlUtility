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
 * <p>SERVER-ARGUMENT-IMPL-POLICY-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="SERVER-ARGUMENT-IMPL-POLICY-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="USE-ARGUMENT-TYPE"/>
 *     &lt;enumeration value="USE-ARRAY-BASE-TYPE"/>
 *     &lt;enumeration value="USE-VOID"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SERVER-ARGUMENT-IMPL-POLICY-ENUM--SIMPLE")
@XmlEnum
public enum SERVERARGUMENTIMPLPOLICYENUMSIMPLE {


    /**
     * The argument type of the RunnableEntity is derived from the AutosarDataType of the ArgumentPrototype.
     * 
     */
    @XmlEnumValue("USE-ARGUMENT-TYPE")
    USE___ARGUMENT___TYPE("USE-ARGUMENT-TYPE"),

    /**
     * The argument type of the RunnableEntity is derived from the AutosarDataType of the elements of the array that corresponds to the ArgumentPrototype. This represents the base type of the array in C.
     * 
     */
    @XmlEnumValue("USE-ARRAY-BASE-TYPE")
    USE___ARRAY___BASE___TYPE("USE-ARRAY-BASE-TYPE"),

    /**
     * The argument type of the RunnableEntity is void.
     * 
     */
    @XmlEnumValue("USE-VOID")
    USE___VOID("USE-VOID");
    private final String value;

    SERVERARGUMENTIMPLPOLICYENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SERVERARGUMENTIMPLPOLICYENUMSIMPLE fromValue(String v) {
        for (SERVERARGUMENTIMPLPOLICYENUMSIMPLE c: SERVERARGUMENTIMPLPOLICYENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
