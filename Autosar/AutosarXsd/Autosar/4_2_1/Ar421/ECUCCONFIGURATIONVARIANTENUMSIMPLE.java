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
 * <p>ECUC-CONFIGURATION-VARIANT-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="ECUC-CONFIGURATION-VARIANT-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PRECONFIGURED-CONFIGURATION"/>
 *     &lt;enumeration value="RECOMMENDED-CONFIGURATION"/>
 *     &lt;enumeration value="VARIANT-LINK-TIME"/>
 *     &lt;enumeration value="VARIANT-POST-BUILD"/>
 *     &lt;enumeration value="VARIANT-POST-BUILD-LOADABLE"/>
 *     &lt;enumeration value="VARIANT-POST-BUILD-SELECTABLE"/>
 *     &lt;enumeration value="VARIANT-PRE-COMPILE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ECUC-CONFIGURATION-VARIANT-ENUM--SIMPLE")
@XmlEnum
public enum ECUCCONFIGURATIONVARIANTENUMSIMPLE {


    /**
     * Preconfigured (i.e. fixed) configuration which cannot be changed.
     * 
     */
    @XmlEnumValue("PRECONFIGURED-CONFIGURATION")
    PRECONFIGURED___CONFIGURATION("PRECONFIGURED-CONFIGURATION"),

    /**
     * Recommended configuration for a module.
     * 
     */
    @XmlEnumValue("RECOMMENDED-CONFIGURATION")
    RECOMMENDED___CONFIGURATION("RECOMMENDED-CONFIGURATION"),

    /**
     * Specifies that the BSW Module implementation may use PreCompileTime and LinkTime configuration parameters.
     * 
     */
    @XmlEnumValue("VARIANT-LINK-TIME")
    VARIANT___LINK___TIME("VARIANT-LINK-TIME"),

    /**
     * Specifies that the BSW Module implementation may use PreCompileTime, LinkTime and PostBuild configuration parameters.
     * 
     */
    @XmlEnumValue("VARIANT-POST-BUILD")
    VARIANT___POST___BUILD("VARIANT-POST-BUILD"),

    /**
     * Specifies that the BSW Module implementation may use PreCompileTime, LinkTime and PostBuild loadable configuration parameters (supported in the VSMD).
     * 
     * This attribute is removed from the specifications and shall not be used.
     * 
     */
    @XmlEnumValue("VARIANT-POST-BUILD-LOADABLE")
    VARIANT___POST___BUILD___LOADABLE("VARIANT-POST-BUILD-LOADABLE"),

    /**
     * Specifies that the BSW Module implementation may use PreCompileTime, LinkTime and PostBuild selectable configuration parameters (supported in the VSMD).
     * 
     * This attribute is removed from the specifications and shall not be used.
     * 
     */
    @XmlEnumValue("VARIANT-POST-BUILD-SELECTABLE")
    VARIANT___POST___BUILD___SELECTABLE("VARIANT-POST-BUILD-SELECTABLE"),

    /**
     * Specifies that the BSW Module implementation uses only PreCompileTime configuration parameters.
     * 
     */
    @XmlEnumValue("VARIANT-PRE-COMPILE")
    VARIANT___PRE___COMPILE("VARIANT-PRE-COMPILE");
    private final String value;

    ECUCCONFIGURATIONVARIANTENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ECUCCONFIGURATIONVARIANTENUMSIMPLE fromValue(String v) {
        for (ECUCCONFIGURATIONVARIANTENUMSIMPLE c: ECUCCONFIGURATIONVARIANTENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
