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
 * <p>OPERATION-IN-SYSTEM-INSTANCE-REF complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="OPERATION-IN-SYSTEM-INSTANCE-REF">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ATP-INSTANCE-REF"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}OPERATION-IN-SYSTEM-INSTANCE-REF"/>
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
@XmlType(name = "OPERATION-IN-SYSTEM-INSTANCE-REF", propOrder = {
    "contextcompositionref",
    "contextcomponentref",
    "contextportref",
    "targetoperationref"
})
public class OPERATIONINSYSTEMINSTANCEREF {

    @XmlElement(name = "CONTEXT-COMPOSITION-REF")
    protected OPERATIONINSYSTEMINSTANCEREF.CONTEXTCOMPOSITIONREF contextcompositionref;
    @XmlElement(name = "CONTEXT-COMPONENT-REF")
    protected List<OPERATIONINSYSTEMINSTANCEREF.CONTEXTCOMPONENTREF> contextcomponentref;
    @XmlElement(name = "CONTEXT-PORT-REF")
    protected OPERATIONINSYSTEMINSTANCEREF.CONTEXTPORTREF contextportref;
    @XmlElement(name = "TARGET-OPERATION-REF")
    protected OPERATIONINSYSTEMINSTANCEREF.TARGETOPERATIONREF targetoperationref;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??contextcompositionref?????
     * 
     * @return
     *     possible object is
     *     {@link OPERATIONINSYSTEMINSTANCEREF.CONTEXTCOMPOSITIONREF }
     *     
     */
    public OPERATIONINSYSTEMINSTANCEREF.CONTEXTCOMPOSITIONREF getCONTEXTCOMPOSITIONREF() {
        return contextcompositionref;
    }

    /**
     * ??contextcompositionref?????
     * 
     * @param value
     *     allowed object is
     *     {@link OPERATIONINSYSTEMINSTANCEREF.CONTEXTCOMPOSITIONREF }
     *     
     */
    public void setCONTEXTCOMPOSITIONREF(OPERATIONINSYSTEMINSTANCEREF.CONTEXTCOMPOSITIONREF value) {
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
     * {@link OPERATIONINSYSTEMINSTANCEREF.CONTEXTCOMPONENTREF }
     * 
     * 
     */
    public List<OPERATIONINSYSTEMINSTANCEREF.CONTEXTCOMPONENTREF> getCONTEXTCOMPONENTREF() {
        if (contextcomponentref == null) {
            contextcomponentref = new ArrayList<OPERATIONINSYSTEMINSTANCEREF.CONTEXTCOMPONENTREF>();
        }
        return this.contextcomponentref;
    }

    /**
     * ??contextportref?????
     * 
     * @return
     *     possible object is
     *     {@link OPERATIONINSYSTEMINSTANCEREF.CONTEXTPORTREF }
     *     
     */
    public OPERATIONINSYSTEMINSTANCEREF.CONTEXTPORTREF getCONTEXTPORTREF() {
        return contextportref;
    }

    /**
     * ??contextportref?????
     * 
     * @param value
     *     allowed object is
     *     {@link OPERATIONINSYSTEMINSTANCEREF.CONTEXTPORTREF }
     *     
     */
    public void setCONTEXTPORTREF(OPERATIONINSYSTEMINSTANCEREF.CONTEXTPORTREF value) {
        this.contextportref = value;
    }

    /**
     * ??targetoperationref?????
     * 
     * @return
     *     possible object is
     *     {@link OPERATIONINSYSTEMINSTANCEREF.TARGETOPERATIONREF }
     *     
     */
    public OPERATIONINSYSTEMINSTANCEREF.TARGETOPERATIONREF getTARGETOPERATIONREF() {
        return targetoperationref;
    }

    /**
     * ??targetoperationref?????
     * 
     * @param value
     *     allowed object is
     *     {@link OPERATIONINSYSTEMINSTANCEREF.TARGETOPERATIONREF }
     *     
     */
    public void setTARGETOPERATIONREF(OPERATIONINSYSTEMINSTANCEREF.TARGETOPERATIONREF value) {
        this.targetoperationref = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}CLIENT-SERVER-OPERATION--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TARGETOPERATIONREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected CLIENTSERVEROPERATIONSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link CLIENTSERVEROPERATIONSUBTYPESENUM }
         *     
         */
        public CLIENTSERVEROPERATIONSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link CLIENTSERVEROPERATIONSUBTYPESENUM }
         *     
         */
        public void setDEST(CLIENTSERVEROPERATIONSUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
