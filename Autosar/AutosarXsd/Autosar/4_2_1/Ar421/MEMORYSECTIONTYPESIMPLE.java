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
 * <p>MEMORY-SECTION-TYPE--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="MEMORY-SECTION-TYPE--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CALIBRATION-OFFLINE"/>
 *     &lt;enumeration value="CALIBRATION-ONLINE"/>
 *     &lt;enumeration value="CALIBRATION-VARIABLES"/>
 *     &lt;enumeration value="CALPRM"/>
 *     &lt;enumeration value="CODE"/>
 *     &lt;enumeration value="CONFIG-DATA"/>
 *     &lt;enumeration value="CONST"/>
 *     &lt;enumeration value="EXCLUDE-FROM-FLASH"/>
 *     &lt;enumeration value="USER-DEFINED"/>
 *     &lt;enumeration value="VAR"/>
 *     &lt;enumeration value="VAR-FAST"/>
 *     &lt;enumeration value="VAR-NO-INIT"/>
 *     &lt;enumeration value="VAR-POWER-ON-INIT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MEMORY-SECTION-TYPE--SIMPLE")
@XmlEnum
public enum MEMORYSECTIONTYPESIMPLE {


    /**
     * Program data which can only be used for offline calibration.
     * 
     * '''Note''': This value is deprecated and shall be substituted by calPrm.
     * 
     */
    @XmlEnumValue("CALIBRATION-OFFLINE")
    CALIBRATION___OFFLINE("CALIBRATION-OFFLINE"),

    /**
     * Program data which can be used for online calibration.
     * 
     * '''Note''': This value is deprecated and shall be substituted by calPrm.
     * 
     */
    @XmlEnumValue("CALIBRATION-ONLINE")
    CALIBRATION___ONLINE("CALIBRATION-ONLINE"),

    /**
     * This memory section is reserved for "virtual variables" that are computed by an MCD system during a measurement session but do not exist in the ECU memory.
     * 
     */
    @XmlEnumValue("CALIBRATION-VARIABLES")
    CALIBRATION___VARIABLES("CALIBRATION-VARIABLES"),

    /**
     * To be used for calibratable constants of ECU-functions.
     * 
     */
    CALPRM("CALPRM"),

    /**
     * To be used for mapping code to application block, boot block, external flash etc.
     * 
     */
    CODE("CODE"),

    /**
     * Constants with attributes that show that they reside in one segment for module configuration.
     * 
     */
    @XmlEnumValue("CONFIG-DATA")
    CONFIG___DATA("CONFIG-DATA"),

    /**
     * To be used for global or static constants.
     * 
     */
    CONST("CONST"),

    /**
     * This memory section is reserved for "virtual parameters" that are taken for computing the values of so-called dependent parameter of an MCD system. Dependent Parameters that are not at the same time "virtual parameters" are allocated in the ECU memory.
     * 
     * Virtual parameters, on the other hand, are not allocated in the ECU memory. Virtual parameters exist in the ECU Hex file for the purpose of being considered (for computing the values of dependent parameters) during an offline-calibration session.
     * 
     */
    @XmlEnumValue("EXCLUDE-FROM-FLASH")
    EXCLUDE___FROM___FLASH("EXCLUDE-FROM-FLASH"),

    /**
     * No specific categorization of sectionType possible.
     * 
     * '''Note''': This value is deprecated and shall be substituted by var, code, const, calprm, configData, excludeFromFlash and the appropriate values of the orthogonal attributes sectionInitializationPolicy, memoryAllocationKeywordPolicy and option.
     * 
     */
    @XmlEnumValue("USER-DEFINED")
    USER___DEFINED("USER-DEFINED"),

    /**
     * To be used for global or static variables. The expected initialization is specified with the attribute sectionInitializationPolicy.
     * 
     */
    VAR("VAR"),

    /**
     * To be used for all global or static variables that have at least one of the following properties: - accessed bit-wise - frequently used - high number of accesses in source code Some platforms allow the use of bit instructions for variables located in this specific RAM area as well as shorter addressing instructions. This saves code and runtime.
     * 
     * '''Note''': This value is deprecated and shall be substituted by var and the appropriate values of the orthogonal attributes sectionInitializationPolicy, memoryAllocationKeywordPolicy and option.
     * 
     */
    @XmlEnumValue("VAR-FAST")
    VAR___FAST("VAR-FAST"),

    /**
     * To be used for all global or static variables that are never initialized.
     * 
     * '''Note''': This value is deprecated and shall be substituted by var and the appropriate values of the orthogonal attributes sectionInitializationPolicy, memoryAllocationKeywordPolicy and option.
     * 
     */
    @XmlEnumValue("VAR-NO-INIT")
    VAR___NO___INIT("VAR-NO-INIT"),

    /**
     * To be used for all global or static variables that are initialized only after power on reset.
     * 
     * '''Note''': This value is deprecated and shall be substituted by var and the appropriate values of the orthogonal attributes sectionInitializationPolicy, memoryAllocationKeywordPolicy and option.
     * 
     */
    @XmlEnumValue("VAR-POWER-ON-INIT")
    VAR___POWER___ON___INIT("VAR-POWER-ON-INIT");
    private final String value;

    MEMORYSECTIONTYPESIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MEMORYSECTIONTYPESIMPLE fromValue(String v) {
        for (MEMORYSECTIONTYPESIMPLE c: MEMORYSECTIONTYPESIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
