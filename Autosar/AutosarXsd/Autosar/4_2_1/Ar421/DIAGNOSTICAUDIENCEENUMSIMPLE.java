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
 * <p>DIAGNOSTIC-AUDIENCE-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="DIAGNOSTIC-AUDIENCE-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AFTER-SALES"/>
 *     &lt;enumeration value="AFTERMAKET"/>
 *     &lt;enumeration value="AFTERMARKET"/>
 *     &lt;enumeration value="DEVELOPMENT"/>
 *     &lt;enumeration value="MANUFACTURING"/>
 *     &lt;enumeration value="SUPPLIER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DIAGNOSTIC-AUDIENCE-ENUM--SIMPLE")
@XmlEnum
public enum DIAGNOSTICAUDIENCEENUMSIMPLE {


    /**
     * The object is relevant for the OEM after-sales organization.
     * 
     */
    @XmlEnumValue("AFTER-SALES")
    AFTER___SALES("AFTER-SALES"),

    /**
     * The object is for free aftermarket service organizations.
     * 
     */
    AFTERMAKET("AFTERMAKET"),

    /**
     * The object is for free aftermarket service organizations.
     * 
     */
    AFTERMARKET("AFTERMARKET"),

    /**
     * The object is relevant for engineering only.
     * 
     */
    DEVELOPMENT("DEVELOPMENT"),

    /**
     * The object is relevant for manufacturing.
     * 
     */
    MANUFACTURING("MANUFACTURING"),

    /**
     * The object is relevant for the ECU-supplier aftermarket organization.
     * 
     */
    SUPPLIER("SUPPLIER");
    private final String value;

    DIAGNOSTICAUDIENCEENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DIAGNOSTICAUDIENCEENUMSIMPLE fromValue(String v) {
        for (DIAGNOSTICAUDIENCEENUMSIMPLE c: DIAGNOSTICAUDIENCEENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
