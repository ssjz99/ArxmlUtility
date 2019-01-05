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
 * <p>ATP-PROTOTYPE--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="ATP-PROTOTYPE--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ABSTRACT-PROVIDED-PORT-PROTOTYPE"/>
 *     &lt;enumeration value="ABSTRACT-REQUIRED-PORT-PROTOTYPE"/>
 *     &lt;enumeration value="APPLICATION-ARRAY-ELEMENT"/>
 *     &lt;enumeration value="APPLICATION-COMPOSITE-ELEMENT-DATA-PROTOTYPE"/>
 *     &lt;enumeration value="APPLICATION-RECORD-ELEMENT"/>
 *     &lt;enumeration value="ARGUMENT-DATA-PROTOTYPE"/>
 *     &lt;enumeration value="ATP-PROTOTYPE"/>
 *     &lt;enumeration value="AUTOSAR-DATA-PROTOTYPE"/>
 *     &lt;enumeration value="DATA-PROTOTYPE"/>
 *     &lt;enumeration value="MODE-DECLARATION-GROUP-PROTOTYPE"/>
 *     &lt;enumeration value="P-PORT-PROTOTYPE"/>
 *     &lt;enumeration value="PR-PORT-PROTOTYPE"/>
 *     &lt;enumeration value="PARAMETER-DATA-PROTOTYPE"/>
 *     &lt;enumeration value="PORT-PROTOTYPE"/>
 *     &lt;enumeration value="R-PORT-PROTOTYPE"/>
 *     &lt;enumeration value="ROOT-SW-COMPOSITION-PROTOTYPE"/>
 *     &lt;enumeration value="SW-COMPONENT-PROTOTYPE"/>
 *     &lt;enumeration value="VARIABLE-DATA-PROTOTYPE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ATP-PROTOTYPE--SUBTYPES-ENUM")
@XmlEnum
public enum ATPPROTOTYPESUBTYPESENUM {

    @XmlEnumValue("ABSTRACT-PROVIDED-PORT-PROTOTYPE")
    ABSTRACT___PROVIDED___PORT___PROTOTYPE("ABSTRACT-PROVIDED-PORT-PROTOTYPE"),
    @XmlEnumValue("ABSTRACT-REQUIRED-PORT-PROTOTYPE")
    ABSTRACT___REQUIRED___PORT___PROTOTYPE("ABSTRACT-REQUIRED-PORT-PROTOTYPE"),
    @XmlEnumValue("APPLICATION-ARRAY-ELEMENT")
    APPLICATION___ARRAY___ELEMENT("APPLICATION-ARRAY-ELEMENT"),
    @XmlEnumValue("APPLICATION-COMPOSITE-ELEMENT-DATA-PROTOTYPE")
    APPLICATION___COMPOSITE___ELEMENT___DATA___PROTOTYPE("APPLICATION-COMPOSITE-ELEMENT-DATA-PROTOTYPE"),
    @XmlEnumValue("APPLICATION-RECORD-ELEMENT")
    APPLICATION___RECORD___ELEMENT("APPLICATION-RECORD-ELEMENT"),
    @XmlEnumValue("ARGUMENT-DATA-PROTOTYPE")
    ARGUMENT___DATA___PROTOTYPE("ARGUMENT-DATA-PROTOTYPE"),
    @XmlEnumValue("ATP-PROTOTYPE")
    ATP___PROTOTYPE("ATP-PROTOTYPE"),
    @XmlEnumValue("AUTOSAR-DATA-PROTOTYPE")
    AUTOSAR___DATA___PROTOTYPE("AUTOSAR-DATA-PROTOTYPE"),
    @XmlEnumValue("DATA-PROTOTYPE")
    DATA___PROTOTYPE("DATA-PROTOTYPE"),
    @XmlEnumValue("MODE-DECLARATION-GROUP-PROTOTYPE")
    MODE___DECLARATION___GROUP___PROTOTYPE("MODE-DECLARATION-GROUP-PROTOTYPE"),
    @XmlEnumValue("P-PORT-PROTOTYPE")
    P___PORT___PROTOTYPE("P-PORT-PROTOTYPE"),
    @XmlEnumValue("PR-PORT-PROTOTYPE")
    PR___PORT___PROTOTYPE("PR-PORT-PROTOTYPE"),
    @XmlEnumValue("PARAMETER-DATA-PROTOTYPE")
    PARAMETER___DATA___PROTOTYPE("PARAMETER-DATA-PROTOTYPE"),
    @XmlEnumValue("PORT-PROTOTYPE")
    PORT___PROTOTYPE("PORT-PROTOTYPE"),
    @XmlEnumValue("R-PORT-PROTOTYPE")
    R___PORT___PROTOTYPE("R-PORT-PROTOTYPE"),
    @XmlEnumValue("ROOT-SW-COMPOSITION-PROTOTYPE")
    ROOT___SW___COMPOSITION___PROTOTYPE("ROOT-SW-COMPOSITION-PROTOTYPE"),
    @XmlEnumValue("SW-COMPONENT-PROTOTYPE")
    SW___COMPONENT___PROTOTYPE("SW-COMPONENT-PROTOTYPE"),
    @XmlEnumValue("VARIABLE-DATA-PROTOTYPE")
    VARIABLE___DATA___PROTOTYPE("VARIABLE-DATA-PROTOTYPE");
    private final String value;

    ATPPROTOTYPESUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ATPPROTOTYPESUBTYPESENUM fromValue(String v) {
        for (ATPPROTOTYPESUBTYPESENUM c: ATPPROTOTYPESUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
