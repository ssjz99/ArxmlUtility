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
 * Defines the mapping of two particular unequally named Triggers in the given context.
 * 
 * <p>TRIGGER-MAPPING complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="TRIGGER-MAPPING">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}TRIGGER-MAPPING"/>
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
@XmlType(name = "TRIGGER-MAPPING", propOrder = {
    "firsttriggerref",
    "secondtriggerref"
})
public class TRIGGERMAPPING {

    @XmlElement(name = "FIRST-TRIGGER-REF")
    protected TRIGGERMAPPING.FIRSTTRIGGERREF firsttriggerref;
    @XmlElement(name = "SECOND-TRIGGER-REF")
    protected TRIGGERMAPPING.SECONDTRIGGERREF secondtriggerref;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??firsttriggerref?????
     * 
     * @return
     *     possible object is
     *     {@link TRIGGERMAPPING.FIRSTTRIGGERREF }
     *     
     */
    public TRIGGERMAPPING.FIRSTTRIGGERREF getFIRSTTRIGGERREF() {
        return firsttriggerref;
    }

    /**
     * ??firsttriggerref?????
     * 
     * @param value
     *     allowed object is
     *     {@link TRIGGERMAPPING.FIRSTTRIGGERREF }
     *     
     */
    public void setFIRSTTRIGGERREF(TRIGGERMAPPING.FIRSTTRIGGERREF value) {
        this.firsttriggerref = value;
    }

    /**
     * ??secondtriggerref?????
     * 
     * @return
     *     possible object is
     *     {@link TRIGGERMAPPING.SECONDTRIGGERREF }
     *     
     */
    public TRIGGERMAPPING.SECONDTRIGGERREF getSECONDTRIGGERREF() {
        return secondtriggerref;
    }

    /**
     * ??secondtriggerref?????
     * 
     * @param value
     *     allowed object is
     *     {@link TRIGGERMAPPING.SECONDTRIGGERREF }
     *     
     */
    public void setSECONDTRIGGERREF(TRIGGERMAPPING.SECONDTRIGGERREF value) {
        this.secondtriggerref = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}TRIGGER--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class FIRSTTRIGGERREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected TRIGGERSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link TRIGGERSUBTYPESENUM }
         *     
         */
        public TRIGGERSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link TRIGGERSUBTYPESENUM }
         *     
         */
        public void setDEST(TRIGGERSUBTYPESENUM value) {
            this.dest = value;
        }

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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}TRIGGER--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SECONDTRIGGERREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected TRIGGERSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link TRIGGERSUBTYPESENUM }
         *     
         */
        public TRIGGERSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link TRIGGERSUBTYPESENUM }
         *     
         */
        public void setDEST(TRIGGERSUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
