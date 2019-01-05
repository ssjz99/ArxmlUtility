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
 * This represents the values of a compound primitive (CURVE, MAP, VAL_BLK) or an array.
 * 
 * <p>RULE-BASED-VALUE-CONT complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="RULE-BASED-VALUE-CONT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}RULE-BASED-VALUE-CONT"/>
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
@XmlType(name = "RULE-BASED-VALUE-CONT", propOrder = {
    "unitref",
    "swarraysize",
    "rulebasedvalues"
})
public class RULEBASEDVALUECONT {

    @XmlElement(name = "UNIT-REF")
    protected RULEBASEDVALUECONT.UNITREF unitref;
    @XmlElement(name = "SW-ARRAYSIZE")
    protected VALUELIST swarraysize;
    @XmlElement(name = "RULE-BASED-VALUES")
    protected RULEBASEDVALUESPECIFICATION rulebasedvalues;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??unitref?????
     * 
     * @return
     *     possible object is
     *     {@link RULEBASEDVALUECONT.UNITREF }
     *     
     */
    public RULEBASEDVALUECONT.UNITREF getUNITREF() {
        return unitref;
    }

    /**
     * ??unitref?????
     * 
     * @param value
     *     allowed object is
     *     {@link RULEBASEDVALUECONT.UNITREF }
     *     
     */
    public void setUNITREF(RULEBASEDVALUECONT.UNITREF value) {
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
