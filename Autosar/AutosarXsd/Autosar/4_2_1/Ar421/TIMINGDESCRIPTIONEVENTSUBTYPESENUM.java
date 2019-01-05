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
 * <p>TIMING-DESCRIPTION-EVENT--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="TIMING-DESCRIPTION-EVENT--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TD-EVENT-BSW"/>
 *     &lt;enumeration value="TD-EVENT-BSW-INTERNAL-BEHAVIOR"/>
 *     &lt;enumeration value="TD-EVENT-BSW-MODE-DECLARATION"/>
 *     &lt;enumeration value="TD-EVENT-BSW-MODULE"/>
 *     &lt;enumeration value="TD-EVENT-COM"/>
 *     &lt;enumeration value="TD-EVENT-COMPLEX"/>
 *     &lt;enumeration value="TD-EVENT-CYCLE-START"/>
 *     &lt;enumeration value="TD-EVENT-FR-CLUSTER-CYCLE-START"/>
 *     &lt;enumeration value="TD-EVENT-FRAME"/>
 *     &lt;enumeration value="TD-EVENT-I-PDU"/>
 *     &lt;enumeration value="TD-EVENT-I-SIGNAL"/>
 *     &lt;enumeration value="TD-EVENT-MODE-DECLARATION"/>
 *     &lt;enumeration value="TD-EVENT-OPERATION"/>
 *     &lt;enumeration value="TD-EVENT-SWC"/>
 *     &lt;enumeration value="TD-EVENT-SWC-INTERNAL-BEHAVIOR"/>
 *     &lt;enumeration value="TD-EVENT-SWC-INTERNAL-BEHAVIOR-REFERENCE"/>
 *     &lt;enumeration value="TD-EVENT-TT-CAN-CYCLE-START"/>
 *     &lt;enumeration value="TD-EVENT-TRIGGER"/>
 *     &lt;enumeration value="TD-EVENT-VARIABLE-DATA-PROTOTYPE"/>
 *     &lt;enumeration value="TD-EVENT-VFB"/>
 *     &lt;enumeration value="TD-EVENT-VFB-PORT"/>
 *     &lt;enumeration value="TD-EVENT-VFB-REFERENCE"/>
 *     &lt;enumeration value="TIMING-DESCRIPTION-EVENT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TIMING-DESCRIPTION-EVENT--SUBTYPES-ENUM")
@XmlEnum
public enum TIMINGDESCRIPTIONEVENTSUBTYPESENUM {

    @XmlEnumValue("TD-EVENT-BSW")
    TD___EVENT___BSW("TD-EVENT-BSW"),
    @XmlEnumValue("TD-EVENT-BSW-INTERNAL-BEHAVIOR")
    TD___EVENT___BSW___INTERNAL___BEHAVIOR("TD-EVENT-BSW-INTERNAL-BEHAVIOR"),
    @XmlEnumValue("TD-EVENT-BSW-MODE-DECLARATION")
    TD___EVENT___BSW___MODE___DECLARATION("TD-EVENT-BSW-MODE-DECLARATION"),
    @XmlEnumValue("TD-EVENT-BSW-MODULE")
    TD___EVENT___BSW___MODULE("TD-EVENT-BSW-MODULE"),
    @XmlEnumValue("TD-EVENT-COM")
    TD___EVENT___COM("TD-EVENT-COM"),
    @XmlEnumValue("TD-EVENT-COMPLEX")
    TD___EVENT___COMPLEX("TD-EVENT-COMPLEX"),
    @XmlEnumValue("TD-EVENT-CYCLE-START")
    TD___EVENT___CYCLE___START("TD-EVENT-CYCLE-START"),
    @XmlEnumValue("TD-EVENT-FR-CLUSTER-CYCLE-START")
    TD___EVENT___FR___CLUSTER___CYCLE___START("TD-EVENT-FR-CLUSTER-CYCLE-START"),
    @XmlEnumValue("TD-EVENT-FRAME")
    TD___EVENT___FRAME("TD-EVENT-FRAME"),
    @XmlEnumValue("TD-EVENT-I-PDU")
    TD___EVENT___I___PDU("TD-EVENT-I-PDU"),
    @XmlEnumValue("TD-EVENT-I-SIGNAL")
    TD___EVENT___I___SIGNAL("TD-EVENT-I-SIGNAL"),
    @XmlEnumValue("TD-EVENT-MODE-DECLARATION")
    TD___EVENT___MODE___DECLARATION("TD-EVENT-MODE-DECLARATION"),
    @XmlEnumValue("TD-EVENT-OPERATION")
    TD___EVENT___OPERATION("TD-EVENT-OPERATION"),
    @XmlEnumValue("TD-EVENT-SWC")
    TD___EVENT___SWC("TD-EVENT-SWC"),
    @XmlEnumValue("TD-EVENT-SWC-INTERNAL-BEHAVIOR")
    TD___EVENT___SWC___INTERNAL___BEHAVIOR("TD-EVENT-SWC-INTERNAL-BEHAVIOR"),
    @XmlEnumValue("TD-EVENT-SWC-INTERNAL-BEHAVIOR-REFERENCE")
    TD___EVENT___SWC___INTERNAL___BEHAVIOR___REFERENCE("TD-EVENT-SWC-INTERNAL-BEHAVIOR-REFERENCE"),
    @XmlEnumValue("TD-EVENT-TT-CAN-CYCLE-START")
    TD___EVENT___TT___CAN___CYCLE___START("TD-EVENT-TT-CAN-CYCLE-START"),
    @XmlEnumValue("TD-EVENT-TRIGGER")
    TD___EVENT___TRIGGER("TD-EVENT-TRIGGER"),
    @XmlEnumValue("TD-EVENT-VARIABLE-DATA-PROTOTYPE")
    TD___EVENT___VARIABLE___DATA___PROTOTYPE("TD-EVENT-VARIABLE-DATA-PROTOTYPE"),
    @XmlEnumValue("TD-EVENT-VFB")
    TD___EVENT___VFB("TD-EVENT-VFB"),
    @XmlEnumValue("TD-EVENT-VFB-PORT")
    TD___EVENT___VFB___PORT("TD-EVENT-VFB-PORT"),
    @XmlEnumValue("TD-EVENT-VFB-REFERENCE")
    TD___EVENT___VFB___REFERENCE("TD-EVENT-VFB-REFERENCE"),
    @XmlEnumValue("TIMING-DESCRIPTION-EVENT")
    TIMING___DESCRIPTION___EVENT("TIMING-DESCRIPTION-EVENT");
    private final String value;

    TIMINGDESCRIPTIONEVENTSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TIMINGDESCRIPTIONEVENTSUBTYPESENUM fromValue(String v) {
        for (TIMINGDESCRIPTIONEVENTSUBTYPESENUM c: TIMINGDESCRIPTIONEVENTSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
