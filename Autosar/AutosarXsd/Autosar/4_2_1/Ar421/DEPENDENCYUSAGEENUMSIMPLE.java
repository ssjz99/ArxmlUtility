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
 * <p>DEPENDENCY-USAGE-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="DEPENDENCY-USAGE-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BUILD"/>
 *     &lt;enumeration value="CODEGENERATION"/>
 *     &lt;enumeration value="COMPILE"/>
 *     &lt;enumeration value="EXECUTE"/>
 *     &lt;enumeration value="LINK"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DEPENDENCY-USAGE-ENUM--SIMPLE")
@XmlEnum
public enum DEPENDENCYUSAGEENUMSIMPLE {


    /**
     * The object referred by the dependency is required during the build process.
     * 
     */
    BUILD,

    /**
     * The object referred by the dependency is required during code generation
     * 
     */
    CODEGENERATION,

    /**
     * The object referred by the dependency is required during compilation.
     * 
     */
    COMPILE,

    /**
     * The object referred by the dependency is required at execution time.
     * 
     */
    EXECUTE,

    /**
     * The object referred by the dependency is required during linking.
     * 
     */
    LINK;

    public String value() {
        return name();
    }

    public static DEPENDENCYUSAGEENUMSIMPLE fromValue(String v) {
        return valueOf(v);
    }

}
