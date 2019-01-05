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
 * <p>ATP-DEFINITION--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="ATP-DEFINITION--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ATP-DEFINITION"/>
 *     &lt;enumeration value="ECUC-ABSTRACT-REFERENCE-DEF"/>
 *     &lt;enumeration value="ECUC-ABSTRACT-STRING-PARAM-DEF"/>
 *     &lt;enumeration value="ECUC-ADD-INFO-PARAM-DEF"/>
 *     &lt;enumeration value="ECUC-BOOLEAN-PARAM-DEF"/>
 *     &lt;enumeration value="ECUC-CHOICE-CONTAINER-DEF"/>
 *     &lt;enumeration value="ECUC-CHOICE-REFERENCE-DEF"/>
 *     &lt;enumeration value="ECUC-COMMON-ATTRIBUTES"/>
 *     &lt;enumeration value="ECUC-CONTAINER-DEF"/>
 *     &lt;enumeration value="ECUC-DEFINITION-ELEMENT"/>
 *     &lt;enumeration value="ECUC-ENUMERATION-PARAM-DEF"/>
 *     &lt;enumeration value="ECUC-FLOAT-PARAM-DEF"/>
 *     &lt;enumeration value="ECUC-FOREIGN-REFERENCE-DEF"/>
 *     &lt;enumeration value="ECUC-FUNCTION-NAME-DEF"/>
 *     &lt;enumeration value="ECUC-INSTANCE-REFERENCE-DEF"/>
 *     &lt;enumeration value="ECUC-INTEGER-PARAM-DEF"/>
 *     &lt;enumeration value="ECUC-LINKER-SYMBOL-DEF"/>
 *     &lt;enumeration value="ECUC-MODULE-DEF"/>
 *     &lt;enumeration value="ECUC-MULTILINE-STRING-PARAM-DEF"/>
 *     &lt;enumeration value="ECUC-PARAM-CONF-CONTAINER-DEF"/>
 *     &lt;enumeration value="ECUC-PARAMETER-DEF"/>
 *     &lt;enumeration value="ECUC-REFERENCE-DEF"/>
 *     &lt;enumeration value="ECUC-STRING-PARAM-DEF"/>
 *     &lt;enumeration value="ECUC-SYMBOLIC-NAME-REFERENCE-DEF"/>
 *     &lt;enumeration value="ECUC-URI-REFERENCE-DEF"/>
 *     &lt;enumeration value="HW-CATEGORY"/>
 *     &lt;enumeration value="POST-BUILD-VARIANT-CRITERION"/>
 *     &lt;enumeration value="SW-SYSTEMCONST"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ATP-DEFINITION--SUBTYPES-ENUM")
@XmlEnum
public enum ATPDEFINITIONSUBTYPESENUM {

    @XmlEnumValue("ATP-DEFINITION")
    ATP___DEFINITION("ATP-DEFINITION"),
    @XmlEnumValue("ECUC-ABSTRACT-REFERENCE-DEF")
    ECUC___ABSTRACT___REFERENCE___DEF("ECUC-ABSTRACT-REFERENCE-DEF"),
    @XmlEnumValue("ECUC-ABSTRACT-STRING-PARAM-DEF")
    ECUC___ABSTRACT___STRING___PARAM___DEF("ECUC-ABSTRACT-STRING-PARAM-DEF"),
    @XmlEnumValue("ECUC-ADD-INFO-PARAM-DEF")
    ECUC___ADD___INFO___PARAM___DEF("ECUC-ADD-INFO-PARAM-DEF"),
    @XmlEnumValue("ECUC-BOOLEAN-PARAM-DEF")
    ECUC___BOOLEAN___PARAM___DEF("ECUC-BOOLEAN-PARAM-DEF"),
    @XmlEnumValue("ECUC-CHOICE-CONTAINER-DEF")
    ECUC___CHOICE___CONTAINER___DEF("ECUC-CHOICE-CONTAINER-DEF"),
    @XmlEnumValue("ECUC-CHOICE-REFERENCE-DEF")
    ECUC___CHOICE___REFERENCE___DEF("ECUC-CHOICE-REFERENCE-DEF"),
    @XmlEnumValue("ECUC-COMMON-ATTRIBUTES")
    ECUC___COMMON___ATTRIBUTES("ECUC-COMMON-ATTRIBUTES"),
    @XmlEnumValue("ECUC-CONTAINER-DEF")
    ECUC___CONTAINER___DEF("ECUC-CONTAINER-DEF"),
    @XmlEnumValue("ECUC-DEFINITION-ELEMENT")
    ECUC___DEFINITION___ELEMENT("ECUC-DEFINITION-ELEMENT"),
    @XmlEnumValue("ECUC-ENUMERATION-PARAM-DEF")
    ECUC___ENUMERATION___PARAM___DEF("ECUC-ENUMERATION-PARAM-DEF"),
    @XmlEnumValue("ECUC-FLOAT-PARAM-DEF")
    ECUC___FLOAT___PARAM___DEF("ECUC-FLOAT-PARAM-DEF"),
    @XmlEnumValue("ECUC-FOREIGN-REFERENCE-DEF")
    ECUC___FOREIGN___REFERENCE___DEF("ECUC-FOREIGN-REFERENCE-DEF"),
    @XmlEnumValue("ECUC-FUNCTION-NAME-DEF")
    ECUC___FUNCTION___NAME___DEF("ECUC-FUNCTION-NAME-DEF"),
    @XmlEnumValue("ECUC-INSTANCE-REFERENCE-DEF")
    ECUC___INSTANCE___REFERENCE___DEF("ECUC-INSTANCE-REFERENCE-DEF"),
    @XmlEnumValue("ECUC-INTEGER-PARAM-DEF")
    ECUC___INTEGER___PARAM___DEF("ECUC-INTEGER-PARAM-DEF"),
    @XmlEnumValue("ECUC-LINKER-SYMBOL-DEF")
    ECUC___LINKER___SYMBOL___DEF("ECUC-LINKER-SYMBOL-DEF"),
    @XmlEnumValue("ECUC-MODULE-DEF")
    ECUC___MODULE___DEF("ECUC-MODULE-DEF"),
    @XmlEnumValue("ECUC-MULTILINE-STRING-PARAM-DEF")
    ECUC___MULTILINE___STRING___PARAM___DEF("ECUC-MULTILINE-STRING-PARAM-DEF"),
    @XmlEnumValue("ECUC-PARAM-CONF-CONTAINER-DEF")
    ECUC___PARAM___CONF___CONTAINER___DEF("ECUC-PARAM-CONF-CONTAINER-DEF"),
    @XmlEnumValue("ECUC-PARAMETER-DEF")
    ECUC___PARAMETER___DEF("ECUC-PARAMETER-DEF"),
    @XmlEnumValue("ECUC-REFERENCE-DEF")
    ECUC___REFERENCE___DEF("ECUC-REFERENCE-DEF"),
    @XmlEnumValue("ECUC-STRING-PARAM-DEF")
    ECUC___STRING___PARAM___DEF("ECUC-STRING-PARAM-DEF"),
    @XmlEnumValue("ECUC-SYMBOLIC-NAME-REFERENCE-DEF")
    ECUC___SYMBOLIC___NAME___REFERENCE___DEF("ECUC-SYMBOLIC-NAME-REFERENCE-DEF"),
    @XmlEnumValue("ECUC-URI-REFERENCE-DEF")
    ECUC___URI___REFERENCE___DEF("ECUC-URI-REFERENCE-DEF"),
    @XmlEnumValue("HW-CATEGORY")
    HW___CATEGORY("HW-CATEGORY"),
    @XmlEnumValue("POST-BUILD-VARIANT-CRITERION")
    POST___BUILD___VARIANT___CRITERION("POST-BUILD-VARIANT-CRITERION"),
    @XmlEnumValue("SW-SYSTEMCONST")
    SW___SYSTEMCONST("SW-SYSTEMCONST");
    private final String value;

    ATPDEFINITIONSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ATPDEFINITIONSUBTYPESENUM fromValue(String v) {
        for (ATPDEFINITIONSUBTYPESENUM c: ATPDEFINITIONSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
