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
 * <p>ECUC-CONFIGURATION-CLASS-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="ECUC-CONFIGURATION-CLASS-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LINK"/>
 *     &lt;enumeration value="POST-BUILD"/>
 *     &lt;enumeration value="PRE-COMPILE"/>
 *     &lt;enumeration value="PUBLISHED-INFORMATION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ECUC-CONFIGURATION-CLASS-ENUM--SIMPLE")
@XmlEnum
public enum ECUCCONFIGURATIONCLASSENUMSIMPLE {


    /**
     * Link Time: parts of configuration are delivered from another object code file
     * 
     */
    LINK("LINK"),

    /**
     * PostBuildTime: after compilation a configuration parameter can be changed.
     * 
     */
    @XmlEnumValue("POST-BUILD")
    POST___BUILD("POST-BUILD"),

    /**
     * PreCompile Time: after compilation a configuration parameter can not be changed any more.
     * 
     */
    @XmlEnumValue("PRE-COMPILE")
    PRE___COMPILE("PRE-COMPILE"),

    /**
     * PublishedInformation is used to specify the fact that certain 
     * information is fixed even before the pre-compile stage.
     * 
     */
    @XmlEnumValue("PUBLISHED-INFORMATION")
    PUBLISHED___INFORMATION("PUBLISHED-INFORMATION");
    private final String value;

    ECUCCONFIGURATIONCLASSENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ECUCCONFIGURATIONCLASSENUMSIMPLE fromValue(String v) {
        for (ECUCCONFIGURATIONCLASSENUMSIMPLE c: ECUCCONFIGURATIONCLASSENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
