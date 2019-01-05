//
// ????? JavaTM Architecture for XML Binding (JAXB) ???? v2.2.8-b130911.1802 ???
// ??? <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// ?????????, ??????????????
// ????: 2018.03.12 ?? 11:42:22 PM CET 
//


package Ar421;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * An Identifier is a string with a number of constraints on its appearance, satisfying the requirements typical programming languages define for their Identifiers.
 * 
 * This datatype represents a string, that can be used as a c-Identifier.
 * 
 * It needs to start with a letter, may consist of letters, digits and underscore. It shall not have two consecutive underscores (to support subsequent name mangling based on "__").
 * 
 * <p>IDENTIFIER complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="IDENTIFIER">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://autosar.org/schema/r4.0>IDENTIFIER--SIMPLE">
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}IDENTIFIER"/>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IDENTIFIER", propOrder = {
    "value"
})
public class IDENTIFIER {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "NAME-PATTERN")
    protected String namepattern;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??value?????
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * ??value?????
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * ??namepattern?????
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAMEPATTERN() {
        return namepattern;
    }

    /**
     * ??namepattern?????
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAMEPATTERN(String value) {
        this.namepattern = value;
    }

    /**
     * ??s?????
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getS() {
        return s;
    }

    /**
     * ??s?????
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setS(String value) {
        this.s = value;
    }

    /**
     * ??t?????
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getT() {
        return t;
    }

    /**
     * ??t?????
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setT(String value) {
        this.t = value;
    }

}
