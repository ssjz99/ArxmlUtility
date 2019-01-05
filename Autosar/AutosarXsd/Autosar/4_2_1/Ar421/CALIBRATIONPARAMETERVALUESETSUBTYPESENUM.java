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
 * <p>CALIBRATION-PARAMETER-VALUE-SET--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="CALIBRATION-PARAMETER-VALUE-SET--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CALIBRATION-PARAMETER-VALUE-SET"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CALIBRATION-PARAMETER-VALUE-SET--SUBTYPES-ENUM")
@XmlEnum
public enum CALIBRATIONPARAMETERVALUESETSUBTYPESENUM {

    @XmlEnumValue("CALIBRATION-PARAMETER-VALUE-SET")
    CALIBRATION___PARAMETER___VALUE___SET("CALIBRATION-PARAMETER-VALUE-SET");
    private final String value;

    CALIBRATIONPARAMETERVALUESETSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CALIBRATIONPARAMETERVALUESETSUBTYPESENUM fromValue(String v) {
        for (CALIBRATIONPARAMETERVALUESETSUBTYPESENUM c: CALIBRATIONPARAMETERVALUESETSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
