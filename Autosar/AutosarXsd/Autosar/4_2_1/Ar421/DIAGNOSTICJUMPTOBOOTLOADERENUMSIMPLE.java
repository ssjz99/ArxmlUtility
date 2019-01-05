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
 * <p>DIAGNOSTIC-JUMP-TO-BOOT-LOADER-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="DIAGNOSTIC-JUMP-TO-BOOT-LOADER-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO-BOOT"/>
 *     &lt;enumeration value="OEM-BOOT"/>
 *     &lt;enumeration value="SYSTEM-SUPPLIER-BOOT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DIAGNOSTIC-JUMP-TO-BOOT-LOADER-ENUM--SIMPLE")
@XmlEnum
public enum DIAGNOSTICJUMPTOBOOTLOADERENUMSIMPLE {


    /**
     * This diagnostic session doesn't allow to jump to Bootloader.
     * 
     */
    @XmlEnumValue("NO-BOOT")
    NO___BOOT("NO-BOOT"),

    /**
     * This diagnostic session allows to jump to OEM Bootloader.
     * 
     */
    @XmlEnumValue("OEM-BOOT")
    OEM___BOOT("OEM-BOOT"),

    /**
     * This diagnostic session allows to jump to System Supplier Bootloader.
     * 
     */
    @XmlEnumValue("SYSTEM-SUPPLIER-BOOT")
    SYSTEM___SUPPLIER___BOOT("SYSTEM-SUPPLIER-BOOT");
    private final String value;

    DIAGNOSTICJUMPTOBOOTLOADERENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DIAGNOSTICJUMPTOBOOTLOADERENUMSIMPLE fromValue(String v) {
        for (DIAGNOSTICJUMPTOBOOTLOADERENUMSIMPLE c: DIAGNOSTICJUMPTOBOOTLOADERENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
