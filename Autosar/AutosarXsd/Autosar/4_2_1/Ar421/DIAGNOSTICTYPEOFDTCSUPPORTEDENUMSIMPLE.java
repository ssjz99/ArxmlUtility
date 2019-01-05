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
 * <p>DIAGNOSTIC-TYPE-OF-DTC-SUPPORTED-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="DIAGNOSTIC-TYPE-OF-DTC-SUPPORTED-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ISO-11992--4"/>
 *     &lt;enumeration value="ISO-14229--1"/>
 *     &lt;enumeration value="ISO-15031--6"/>
 *     &lt;enumeration value="SAE-J-1939--73"/>
 *     &lt;enumeration value="SAE-J-2012--DA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DIAGNOSTIC-TYPE-OF-DTC-SUPPORTED-ENUM--SIMPLE")
@XmlEnum
public enum DIAGNOSTICTYPEOFDTCSUPPORTEDENUMSIMPLE {


    /**
     * ISO11992-4 DTC format
     * 
     */
    @XmlEnumValue("ISO-11992--4")
    ISO___11992____4("ISO-11992--4"),

    /**
     * ISO14229-1 DTC format (3 byte format)
     * 
     */
    @XmlEnumValue("ISO-14229--1")
    ISO___14229____1("ISO-14229--1"),

    /**
     * ISO15031-6 DTC format (2 byte format)
     * 
     */
    @XmlEnumValue("ISO-15031--6")
    ISO___15031____6("ISO-15031--6"),

    /**
     * SAEJ1939-73 DTC format
     * 
     */
    @XmlEnumValue("SAE-J-1939--73")
    SAE___J___1939____73("SAE-J-1939--73"),

    /**
     * SAE_J2012-DA_DTCFormat_00 (3 byte format)
     * 
     */
    @XmlEnumValue("SAE-J-2012--DA")
    SAE___J___2012____DA("SAE-J-2012--DA");
    private final String value;

    DIAGNOSTICTYPEOFDTCSUPPORTEDENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DIAGNOSTICTYPEOFDTCSUPPORTEDENUMSIMPLE fromValue(String v) {
        for (DIAGNOSTICTYPEOFDTCSUPPORTEDENUMSIMPLE c: DIAGNOSTICTYPEOFDTCSUPPORTEDENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
