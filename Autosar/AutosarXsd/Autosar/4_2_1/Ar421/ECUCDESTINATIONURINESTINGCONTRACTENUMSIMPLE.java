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
 * <p>ECUC-DESTINATION-URI-NESTING-CONTRACT-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="ECUC-DESTINATION-URI-NESTING-CONTRACT-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LEAF-OF-TARGET-CONTAINER"/>
 *     &lt;enumeration value="TARGET-CONTAINER"/>
 *     &lt;enumeration value="VERTEX-OF-TARGET-CONTAINER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ECUC-DESTINATION-URI-NESTING-CONTRACT-ENUM--SIMPLE")
@XmlEnum
public enum ECUCDESTINATIONURINESTINGCONTRACTENUMSIMPLE {


    /**
     * EcucDestinationUriPolicy describes elements (subContainers, Parameters, References) that are directly owned by the target container.
     * 
     */
    @XmlEnumValue("LEAF-OF-TARGET-CONTAINER")
    LEAF___OF___TARGET___CONTAINER("LEAF-OF-TARGET-CONTAINER"),

    /**
     * EcucDestinationUriPolicy describes the target container of EcucUriReferenceDef.
     * 
     */
    @XmlEnumValue("TARGET-CONTAINER")
    TARGET___CONTAINER("TARGET-CONTAINER"),

    /**
     * EcucDestinationUriPolicy describes elements (subContainers, Parameters, References) of the target container which can be defined in arbitrary nested subContainer structure.
     * 
     */
    @XmlEnumValue("VERTEX-OF-TARGET-CONTAINER")
    VERTEX___OF___TARGET___CONTAINER("VERTEX-OF-TARGET-CONTAINER");
    private final String value;

    ECUCDESTINATIONURINESTINGCONTRACTENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ECUCDESTINATIONURINESTINGCONTRACTENUMSIMPLE fromValue(String v) {
        for (ECUCDESTINATIONURINESTINGCONTRACTENUMSIMPLE c: ECUCDESTINATIONURINESTINGCONTRACTENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
