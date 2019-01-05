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
 * <p>SW-IMPL-POLICY-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="SW-IMPL-POLICY-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CONST"/>
 *     &lt;enumeration value="FIXED"/>
 *     &lt;enumeration value="MEASUREMENT-POINT"/>
 *     &lt;enumeration value="QUEUED"/>
 *     &lt;enumeration value="STANDARD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SW-IMPL-POLICY-ENUM--SIMPLE")
@XmlEnum
public enum SWIMPLPOLICYENUMSIMPLE {


    /**
     * forced implementation such that the  running software within the ECU  shall not modify it. For example implemented with the "const" modifier in C.  This can be applied for parameters (not for those in NVRAM) as well as argument  data prototypes.
     * 
     */
    CONST("CONST"),

    /**
     * This data element is fixed. In particular this indicates, that it  might also be implemented  e.g. as in place data, (#DEFINE).
     * 
     */
    FIXED("FIXED"),

    /**
     * The data element is created for measurement purposes only.  The data element is never read directly within the ECU software. In contrast to  a "standard" data element in an unconnected provide port is, this unconnection  is guaranteed for  measurementPoint data elements.
     * 
     */
    @XmlEnumValue("MEASUREMENT-POINT")
    MEASUREMENT___POINT("MEASUREMENT-POINT"),

    /**
     * The content of the data element is queued and the data element has 'event' semantics, i.e. data elements are stored in a queue and all data  elements are processed in 'first in first out' order. 
     * The queuing is intended to be implemented by RTE Generator.
     * This value is not applicable for parameters.
     * 
     */
    QUEUED("QUEUED"),

    /**
     * This is applicable for all kinds of data elements. For variable  data prototypes the 'last is best' semantics applies. For parameter there is no  specific implementation directive.
     * 
     */
    STANDARD("STANDARD");
    private final String value;

    SWIMPLPOLICYENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SWIMPLPOLICYENUMSIMPLE fromValue(String v) {
        for (SWIMPLPOLICYENUMSIMPLE c: SWIMPLPOLICYENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
