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
 * <p>NM-NODE--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="NM-NODE--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CAN-NM-NODE"/>
 *     &lt;enumeration value="FLEXRAY-NM-NODE"/>
 *     &lt;enumeration value="J-1939-NM-NODE"/>
 *     &lt;enumeration value="NM-NODE"/>
 *     &lt;enumeration value="UDP-NM-NODE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NM-NODE--SUBTYPES-ENUM")
@XmlEnum
public enum NMNODESUBTYPESENUM {

    @XmlEnumValue("CAN-NM-NODE")
    CAN___NM___NODE("CAN-NM-NODE"),
    @XmlEnumValue("FLEXRAY-NM-NODE")
    FLEXRAY___NM___NODE("FLEXRAY-NM-NODE"),
    @XmlEnumValue("J-1939-NM-NODE")
    J___1939___NM___NODE("J-1939-NM-NODE"),
    @XmlEnumValue("NM-NODE")
    NM___NODE("NM-NODE"),
    @XmlEnumValue("UDP-NM-NODE")
    UDP___NM___NODE("UDP-NM-NODE");
    private final String value;

    NMNODESUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NMNODESUBTYPESENUM fromValue(String v) {
        for (NMNODESUBTYPESENUM c: NMNODESUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
