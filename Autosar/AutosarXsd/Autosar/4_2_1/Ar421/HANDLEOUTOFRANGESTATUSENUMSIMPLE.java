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
 * <p>HANDLE-OUT-OF-RANGE-STATUS-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="HANDLE-OUT-OF-RANGE-STATUS-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INDICATE"/>
 *     &lt;enumeration value="SILENT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HANDLE-OUT-OF-RANGE-STATUS-ENUM--SIMPLE")
@XmlEnum
public enum HANDLEOUTOFRANGESTATUSENUMSIMPLE {


    /**
     * The RTE sets the return status to RTE_E_OUT_OF_RANGE if the received value is out of range and the attribute handleOutOfRange is not set to "none" or "invalid".
     * 
     */
    INDICATE,

    /**
     * The RTE sets the return status to RTE_E_OK
     * 
     */
    SILENT;

    public String value() {
        return name();
    }

    public static HANDLEOUTOFRANGESTATUSENUMSIMPLE fromValue(String v) {
        return valueOf(v);
    }

}
