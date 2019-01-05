//
// ????? JavaTM Architecture for XML Binding (JAXB) ???? v2.2.8-b130911.1802 ???
// ??? <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// ?????????, ??????????????
// ????: 2018.03.12 ?? 11:42:22 PM CET 
//


package Ar421;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TRIGGER-IN-SYSTEM-INSTANCE-REF complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="TRIGGER-IN-SYSTEM-INSTANCE-REF">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ATP-INSTANCE-REF"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}TRIGGER-IN-SYSTEM-INSTANCE-REF"/>
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
@XmlType(name = "TRIGGER-IN-SYSTEM-INSTANCE-REF", propOrder = {
    "contextcompositionref",
    "contextcomponentref",
    "contextportref",
    "targettriggerref"
})
public class TRIGGERINSYSTEMINSTANCEREF {

    @XmlElement(name = "CONTEXT-COMPOSITION-REF")
    protected TRIGGERINSYSTEMINSTANCEREF.CONTEXTCOMPOSITIONREF contextcompositionref;
    @XmlElement(name = "CONTEXT-COMPONENT-REF")
    protected List<TRIGGERINSYSTEMINSTANCEREF.CONTEXTCOMPONENTREF> contextcomponentref;
    @XmlElement(name = "CONTEXT-PORT-REF")
    protected TRIGGERINSYSTEMINSTANCEREF.CONTEXTPORTREF contextportref;
    @XmlElement(name = "TARGET-TRIGGER-REF")
    protected TRIGGERINSYSTEMINSTANCEREF.TARGETTRIGGERREF targettriggerref;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??contextcompositionref?????
     * 
     * @return
     *     possible object is
     *     {@link TRIGGERINSYSTEMINSTANCEREF.CONTEXTCOMPOSITIONREF }
     *     
     */
    public TRIGGERINSYSTEMINSTANCEREF.CONTEXTCOMPOSITIONREF getCONTEXTCOMPOSITIONREF() {
        return contextcompositionref;
    }

    /**
     * ??contextcompositionref?????
     * 
     * @param value
     *     allowed object is
     *     {@link TRIGGERINSYSTEMINSTANCEREF.CONTEXTCOMPOSITIONREF }
     *     
     */
    public void setCONTEXTCOMPOSITIONREF(TRIGGERINSYSTEMINSTANCEREF.CONTEXTCOMPOSITIONREF value) {
        this.contextcompositionref = value;
    }

    /**
     * Gets the value of the contextcomponentref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contextcomponentref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCONTEXTCOMPONENTREF().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TRIGGERINSYSTEMINSTANCEREF.CONTEXTCOMPONENTREF }
     * 
     * 
     */
    public List<TRIGGERINSYSTEMINSTANCEREF.CONTEXTCOMPONENTREF> getCONTEXTCOMPONENTREF() {
        if (contextcomponentref == null) {
            contextcomponentref = new ArrayList<TRIGGERINSYSTEMINSTANCEREF.CONTEXTCOMPONENTREF>();
        }
        return this.contextcomponentref;
    }

    /**
     * ??contextportref?????
     * 
     * @return
     *     possible object is
     *     {@link TRIGGERINSYSTEMINSTANCEREF.CONTEXTPORTREF }
     *     
     */
    public TRIGGERINSYSTEMINSTANCEREF.CONTEXTPORTREF getCONTEXTPORTREF() {
        return contextportref;
    }

    /**
     * ??contextportref?????
     * 
     * @param value
     *     allowed object is
     *     {@link TRIGGERINSYSTEMINSTANCEREF.CONTEXTPORTREF }
     *     
     */
    public void setCONTEXTPORTREF(TRIGGERINSYSTEMINSTANCEREF.CONTEXTPORTREF value) {
        this.contextportref = value;
    }

    /**
     * ??targettriggerref?????
     * 
     * @return
     *     possible object is
     *     {@link TRIGGERINSYSTEMINSTANCEREF.TARGETTRIGGERREF }
     *     
     */
    public TRIGGERINSYSTEMINSTANCEREF.TARGETTRIGGERREF getTARGETTRIGGERREF() {
        return targettriggerref;
    }

    /**
     * ??targettriggerref?????
     * 
     * @param value
     *     allowed object is
     *     {@link TRIGGERINSYSTEMINSTANCEREF.TARGETTRIGGERREF }
     *     
     */
    public void setTARGETTRIGGERREF(TRIGGERINSYSTEMINSTANCEREF.TARGETTRIGGERREF value) {
        this.targettriggerref = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}SW-COMPONENT-PROTOTYPE--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CONTEXTCOMPONENTREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected SWCOMPONENTPROTOTYPESUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link SWCOMPONENTPROTOTYPESUBTYPESENUM }
         *     
         */
        public SWCOMPONENTPROTOTYPESUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link SWCOMPONENTPROTOTYPESUBTYPESENUM }
         *     
         */
        public void setDEST(SWCOMPONENTPROTOTYPESUBTYPESENUM value) {
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}ROOT-SW-COMPOSITION-PROTOTYPE--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CONTEXTCOMPOSITIONREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected ROOTSWCOMPOSITIONPROTOTYPESUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link ROOTSWCOMPOSITIONPROTOTYPESUBTYPESENUM }
         *     
         */
        public ROOTSWCOMPOSITIONPROTOTYPESUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link ROOTSWCOMPOSITIONPROTOTYPESUBTYPESENUM }
         *     
         */
        public void setDEST(ROOTSWCOMPOSITIONPROTOTYPESUBTYPESENUM value) {
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}PORT-PROTOTYPE--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CONTEXTPORTREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected PORTPROTOTYPESUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link PORTPROTOTYPESUBTYPESENUM }
         *     
         */
        public PORTPROTOTYPESUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link PORTPROTOTYPESUBTYPESENUM }
         *     
         */
        public void setDEST(PORTPROTOTYPESUBTYPESENUM value) {
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
    public static class TARGETTRIGGERREF
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
