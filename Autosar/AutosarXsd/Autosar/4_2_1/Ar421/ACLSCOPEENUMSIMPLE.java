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
 * <p>ACL-SCOPE-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="ACL-SCOPE-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DEPENDANT"/>
 *     &lt;enumeration value="DESCENDANT"/>
 *     &lt;enumeration value="EXPLICIT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ACL-SCOPE-ENUM--SIMPLE")
@XmlEnum
public enum ACLSCOPEENUMSIMPLE {


    /**
     * This specifies that the AclPermission applies to dependant (in particular referenced) operations / objects as well. Note that this includes the descendant ones.
     * 
     */
    DEPENDANT,

    /**
     * This specifies that the AclPermission applies to descendant  operations / objects as well.
     * 
     */
    DESCENDANT,

    /**
     * This is indicates that the AclPermission applies to explicit objects / operations only.
     * 
     */
    EXPLICIT;

    public String value() {
        return name();
    }

    public static ACLSCOPEENUMSIMPLE fromValue(String v) {
        return valueOf(v);
    }

}
