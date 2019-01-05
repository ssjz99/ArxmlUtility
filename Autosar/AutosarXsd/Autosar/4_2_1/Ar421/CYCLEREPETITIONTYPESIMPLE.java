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
 * <p>CYCLE-REPETITION-TYPE--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="CYCLE-REPETITION-TYPE--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CYCLE-REPETITION-1"/>
 *     &lt;enumeration value="CYCLE-REPETITION-10"/>
 *     &lt;enumeration value="CYCLE-REPETITION-16"/>
 *     &lt;enumeration value="CYCLE-REPETITION-2"/>
 *     &lt;enumeration value="CYCLE-REPETITION-20"/>
 *     &lt;enumeration value="CYCLE-REPETITION-32"/>
 *     &lt;enumeration value="CYCLE-REPETITION-4"/>
 *     &lt;enumeration value="CYCLE-REPETITION-40"/>
 *     &lt;enumeration value="CYCLE-REPETITION-5"/>
 *     &lt;enumeration value="CYCLE-REPETITION-50"/>
 *     &lt;enumeration value="CYCLE-REPETITION-64"/>
 *     &lt;enumeration value="CYCLE-REPETITION-8"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CYCLE-REPETITION-TYPE--SIMPLE")
@XmlEnum
public enum CYCLEREPETITIONTYPESIMPLE {


    /**
     * Attribute cycleRepetition value="1"
     * 
     * valid only for FlexRay Protocol 2.1 Rev A
     * 
     */
    @XmlEnumValue("CYCLE-REPETITION-1")
    CYCLE___REPETITION___1("CYCLE-REPETITION-1"),

    /**
     * Attribute cycleRepetition value="10"
     * 
     * to support FlexRay 3.0
     * 
     */
    @XmlEnumValue("CYCLE-REPETITION-10")
    CYCLE___REPETITION___10("CYCLE-REPETITION-10"),

    /**
     * Attribute cycleRepetition value="16"
     * 
     * valid only for FlexRay Protocol 2.1 Rev A
     * 
     */
    @XmlEnumValue("CYCLE-REPETITION-16")
    CYCLE___REPETITION___16("CYCLE-REPETITION-16"),

    /**
     * Attribute cycleRepetition value="2"
     * 
     * valid only for FlexRay Protocol 2.1 Rev A
     * 
     */
    @XmlEnumValue("CYCLE-REPETITION-2")
    CYCLE___REPETITION___2("CYCLE-REPETITION-2"),

    /**
     * Attribute cycleRepetition value="20"
     * 
     * to support FlexRay 3.0
     * 
     */
    @XmlEnumValue("CYCLE-REPETITION-20")
    CYCLE___REPETITION___20("CYCLE-REPETITION-20"),

    /**
     * Attribute cycleRepetition value="32"
     * 
     * valid only for FlexRay Protocol 2.1 Rev A
     * 
     */
    @XmlEnumValue("CYCLE-REPETITION-32")
    CYCLE___REPETITION___32("CYCLE-REPETITION-32"),

    /**
     * Attribute cycleRepetition value="4"
     * 
     * valid only for FlexRay Protocol 2.1 Rev A
     * 
     */
    @XmlEnumValue("CYCLE-REPETITION-4")
    CYCLE___REPETITION___4("CYCLE-REPETITION-4"),

    /**
     * Attribute cycleRepetition value="40"
     * 
     * to support FlexRay 3.0
     * 
     */
    @XmlEnumValue("CYCLE-REPETITION-40")
    CYCLE___REPETITION___40("CYCLE-REPETITION-40"),

    /**
     * Attribute cycleRepetition value="5"
     * 
     * to support FlexRay 3.0
     * 
     */
    @XmlEnumValue("CYCLE-REPETITION-5")
    CYCLE___REPETITION___5("CYCLE-REPETITION-5"),

    /**
     * Attribute cycleRepetition value="50"
     * 
     * to support FlexRay 3.0
     * 
     */
    @XmlEnumValue("CYCLE-REPETITION-50")
    CYCLE___REPETITION___50("CYCLE-REPETITION-50"),

    /**
     * Attribute cycleRepetition value="64"
     * 
     * valid only for FlexRay Protocol 2.1 Rev A
     * 
     */
    @XmlEnumValue("CYCLE-REPETITION-64")
    CYCLE___REPETITION___64("CYCLE-REPETITION-64"),

    /**
     * Attribute cycleRepetition value="8"
     * 
     * valid only for FlexRay Protocol 2.1 Rev A
     * 
     */
    @XmlEnumValue("CYCLE-REPETITION-8")
    CYCLE___REPETITION___8("CYCLE-REPETITION-8");
    private final String value;

    CYCLEREPETITIONTYPESIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CYCLEREPETITIONTYPESIMPLE fromValue(String v) {
        for (CYCLEREPETITIONTYPESIMPLE c: CYCLEREPETITIONTYPESIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
