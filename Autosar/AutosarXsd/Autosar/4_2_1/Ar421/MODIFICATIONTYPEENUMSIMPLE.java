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
 * <p>MODIFICATION-TYPE-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="MODIFICATION-TYPE-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CONTENT-RELATED"/>
 *     &lt;enumeration value="DOC-RELATED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MODIFICATION-TYPE-ENUM--SIMPLE")
@XmlEnum
public enum MODIFICATIONTYPEENUMSIMPLE {


    /**
     * The attribute contentRelated expresses, that a substantial change of the content was performed in the object. Usually this means e.g. that the derived artifacts need to be regenerated (e.g. code generation).
     * 
     */
    @XmlEnumValue("CONTENT-RELATED")
    CONTENT___RELATED("CONTENT-RELATED"),

    /**
     * The attribute docRelated expresses, that a change was applied to the documentation or other informal aspects of the object. Usually this means e.g. that not all derived artifacts need to be regenerated (e.g. code generation).
     * 
     */
    @XmlEnumValue("DOC-RELATED")
    DOC___RELATED("DOC-RELATED");
    private final String value;

    MODIFICATIONTYPEENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MODIFICATIONTYPEENUMSIMPLE fromValue(String v) {
        for (MODIFICATIONTYPEENUMSIMPLE c: MODIFICATIONTYPEENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
