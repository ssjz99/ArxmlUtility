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
 * <p>MAPPING-DIRECTION-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="MAPPING-DIRECTION-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BIDIRECTIONAL"/>
 *     &lt;enumeration value="FIRST-TO-SECOND"/>
 *     &lt;enumeration value="SECOND-TO-FIRST"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MAPPING-DIRECTION-ENUM--SIMPLE")
@XmlEnum
public enum MAPPINGDIRECTIONENUMSIMPLE {


    /**
     * The TextTableMapping is applicable in both directions.
     * 
     */
    BIDIRECTIONAL("BIDIRECTIONAL"),

    /**
     * The TextTableMapping is applicable in the direction from firstDataPrototype / firstOperationArgument referring into the PortInterface of the PPortPrototype to secondDataPrototype / secondOperationArgument referring into the PortInterface of the RPortPrototype.
     * 
     */
    @XmlEnumValue("FIRST-TO-SECOND")
    FIRST___TO___SECOND("FIRST-TO-SECOND"),

    /**
     * The TextTableMapping is applicable in the direction from secondDataPrototype / secondOperationArgument referring into the PortInterface of the PPortPrototype to firstDataPrototype / firstOperationArgument referring into the PortInterface of the RPortPrototype.
     * 
     */
    @XmlEnumValue("SECOND-TO-FIRST")
    SECOND___TO___FIRST("SECOND-TO-FIRST");
    private final String value;

    MAPPINGDIRECTIONENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MAPPINGDIRECTIONENUMSIMPLE fromValue(String v) {
        for (MAPPINGDIRECTIONENUMSIMPLE c: MAPPINGDIRECTIONENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
