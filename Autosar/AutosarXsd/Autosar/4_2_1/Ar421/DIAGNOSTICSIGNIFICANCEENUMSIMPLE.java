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
 * <p>DIAGNOSTIC-SIGNIFICANCE-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="DIAGNOSTIC-SIGNIFICANCE-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FAULT"/>
 *     &lt;enumeration value="OCCURENCE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DIAGNOSTIC-SIGNIFICANCE-ENUM--SIMPLE")
@XmlEnum
public enum DIAGNOSTICSIGNIFICANCEENUMSIMPLE {


    /**
     * Failure, which affects the component/ECU itself.
     * 
     */
    FAULT,

    /**
     * Issue, which indicates additional information concerning insufficient system behavior.
     * 
     */
    OCCURENCE;

    public String value() {
        return name();
    }

    public static DIAGNOSTICSIGNIFICANCEENUMSIMPLE fromValue(String v) {
        return valueOf(v);
    }

}