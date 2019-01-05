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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This represents the values for the axis of a compound primitive (curve, map).
 * 
 * For standard and fix axes,  SwAxisCont contains the values of the axis directly. 
 * 
 * The axis values of SwAxisCont with the category CURVE_AXIS, COM_AXIS, RES_AXIS are for display only. For editing and processing, only the values in the related GroupAxis are binding.
 * 
 * <p>RULE-BASED-AXIS-CONT complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="RULE-BASED-AXIS-CONT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}RULE-BASED-AXIS-CONT"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RULE-BASED-AXIS-CONT", propOrder = {
    "category",
    "unitref",
    "swarraysize",
    "swaxisindex",
    "rulebasedvalues"
})
public class RULEBASEDAXISCONT {

    @XmlElement(name = "CATEGORY")
    protected CALPRMAXISCATEGORYENUM category;
    @XmlElement(name = "UNIT-REF")
    protected RULEBASEDAXISCONT.UNITREF unitref;
    @XmlElement(name = "SW-ARRAYSIZE")
    protected VALUELIST swarraysize;
    @XmlElement(name = "SW-AXIS-INDEX")
    protected AXISINDEXTYPE swaxisindex;
    @XmlElement(name = "RULE-BASED-VALUES")
    protected RULEBASEDVALUESPECIFICATION rulebasedvalues;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??category?????
     * 
     * @return
     *     possible object is
     *     {@link CALPRMAXISCATEGORYENUM }
     *     
     */
    public CALPRMAXISCATEGORYENUM getCATEGORY() {
        return category;
    }

    /**
     * ??category?????
     * 
     * @param value
     *     allowed object is
     *     {@link CALPRMAXISCATEGORYENUM }
     *     
     */
    public void setCATEGORY(CALPRMAXISCATEGORYENUM value) {
        this.category = value;
    }

    /**
     * ??unitref?????
     * 
     * @return
     *     possible object is
     *     {@link RULEBASEDAXISCONT.UNITREF }
     *     
     */
    public RULEBASEDAXISCONT.UNITREF getUNITREF() {
        return unitref;
    }

    /**
     * ??unitref?????
     * 
     * @param value
     *     allowed object is
     *     {@link RULEBASEDAXISCONT.UNITREF }
     *     
     */
    public void setUNITREF(RULEBASEDAXISCONT.UNITREF value) {
        this.unitref = value;
    }

    /**
     * ??swarraysize?????
     * 
     * @return
     *     possible object is
     *     {@link VALUELIST }
     *     
     */
    public VALUELIST getSWARRAYSIZE() {
        return swarraysize;
    }

    /**
     * ??swarraysize?????
     * 
     * @param value
     *     allowed object is
     *     {@link VALUELIST }
     *     
     */
    public void setSWARRAYSIZE(VALUELIST value) {
        this.swarraysize = value;
    }

    /**
     * ??swaxisindex?????
     * 
     * @return
     *     possible object is
     *     {@link AXISINDEXTYPE }
     *     
     */
    public AXISINDEXTYPE getSWAXISINDEX() {
        return swaxisindex;
    }

    /**
     * ??swaxisindex?????
     * 
     * @param value
     *     allowed object is
     *     {@link AXISINDEXTYPE }
     *     
     */
    public void setSWAXISINDEX(AXISINDEXTYPE value) {
        this.swaxisindex = value;
    }

    /**
     * ??rulebasedvalues?????
     * 
     * @return
     *     possible object is
     *     {@link RULEBASEDVALUESPECIFICATION }
     *     
     */
    public RULEBASEDVALUESPECIFICATION getRULEBASEDVALUES() {
        return rulebasedvalues;
    }

    /**
     * ??rulebasedvalues?????
     * 
     * @param value
     *     allowed object is
     *     {@link RULEBASEDVALUESPECIFICATION }
     *     
     */
    public void setRULEBASEDVALUES(RULEBASEDVALUESPECIFICATION value) {
        this.rulebasedvalues = value;
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


    /**
     * <p>anonymous complex type? Java ??
     * 
     * <p>????????????????????
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}UNIT--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class UNITREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected UNITSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link UNITSUBTYPESENUM }
         *     
         */
        public UNITSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link UNITSUBTYPESENUM }
         *     
         */
        public void setDEST(UNITSUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
