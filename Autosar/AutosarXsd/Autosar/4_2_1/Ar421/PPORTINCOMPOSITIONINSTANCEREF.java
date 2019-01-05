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
 * <p>P-PORT-IN-COMPOSITION-INSTANCE-REF complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="P-PORT-IN-COMPOSITION-INSTANCE-REF">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ATP-INSTANCE-REF"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}PORT-IN-COMPOSITION-TYPE-INSTANCE-REF"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}P-PORT-IN-COMPOSITION-INSTANCE-REF"/>
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
@XmlType(name = "P-PORT-IN-COMPOSITION-INSTANCE-REF", propOrder = {
    "contextcomponentref",
    "targetpportref"
})
public class PPORTINCOMPOSITIONINSTANCEREF {

    @XmlElement(name = "CONTEXT-COMPONENT-REF")
    protected PPORTINCOMPOSITIONINSTANCEREF.CONTEXTCOMPONENTREF contextcomponentref;
    @XmlElement(name = "TARGET-P-PORT-REF")
    protected PPORTINCOMPOSITIONINSTANCEREF.TARGETPPORTREF targetpportref;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??contextcomponentref?????
     * 
     * @return
     *     possible object is
     *     {@link PPORTINCOMPOSITIONINSTANCEREF.CONTEXTCOMPONENTREF }
     *     
     */
    public PPORTINCOMPOSITIONINSTANCEREF.CONTEXTCOMPONENTREF getCONTEXTCOMPONENTREF() {
        return contextcomponentref;
    }

    /**
     * ??contextcomponentref?????
     * 
     * @param value
     *     allowed object is
     *     {@link PPORTINCOMPOSITIONINSTANCEREF.CONTEXTCOMPONENTREF }
     *     
     */
    public void setCONTEXTCOMPONENTREF(PPORTINCOMPOSITIONINSTANCEREF.CONTEXTCOMPONENTREF value) {
        this.contextcomponentref = value;
    }

    /**
     * ??targetpportref?????
     * 
     * @return
     *     possible object is
     *     {@link PPORTINCOMPOSITIONINSTANCEREF.TARGETPPORTREF }
     *     
     */
    public PPORTINCOMPOSITIONINSTANCEREF.TARGETPPORTREF getTARGETPPORTREF() {
        return targetpportref;
    }

    /**
     * ??targetpportref?????
     * 
     * @param value
     *     allowed object is
     *     {@link PPORTINCOMPOSITIONINSTANCEREF.TARGETPPORTREF }
     *     
     */
    public void setTARGETPPORTREF(PPORTINCOMPOSITIONINSTANCEREF.TARGETPPORTREF value) {
        this.targetpportref = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}ABSTRACT-PROVIDED-PORT-PROTOTYPE--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TARGETPPORTREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected ABSTRACTPROVIDEDPORTPROTOTYPESUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link ABSTRACTPROVIDEDPORTPROTOTYPESUBTYPESENUM }
         *     
         */
        public ABSTRACTPROVIDEDPORTPROTOTYPESUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link ABSTRACTPROVIDEDPORTPROTOTYPESUBTYPESENUM }
         *     
         */
        public void setDEST(ABSTRACTPROVIDEDPORTPROTOTYPESUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
