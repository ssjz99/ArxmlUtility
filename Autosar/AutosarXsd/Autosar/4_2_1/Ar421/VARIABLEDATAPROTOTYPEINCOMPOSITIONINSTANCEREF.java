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
 * This meta-class represents the ability to define an InstanceRef to a VariableDataPrototype in the context of a CompositionSwComponentType.
 * 
 * <p>VARIABLE-DATA-PROTOTYPE-IN-COMPOSITION-INSTANCE-REF complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="VARIABLE-DATA-PROTOTYPE-IN-COMPOSITION-INSTANCE-REF">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ATP-INSTANCE-REF"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}VARIABLE-DATA-PROTOTYPE-IN-COMPOSITION-INSTANCE-REF"/>
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
@XmlType(name = "VARIABLE-DATA-PROTOTYPE-IN-COMPOSITION-INSTANCE-REF", propOrder = {
    "contextswcomponentprototyperef",
    "contextportprototyperef",
    "targetvariabledataprototyperef",
    "variationpoint"
})
public class VARIABLEDATAPROTOTYPEINCOMPOSITIONINSTANCEREF {

    @XmlElement(name = "CONTEXT-SW-COMPONENT-PROTOTYPE-REF")
    protected List<VARIABLEDATAPROTOTYPEINCOMPOSITIONINSTANCEREF.CONTEXTSWCOMPONENTPROTOTYPEREF> contextswcomponentprototyperef;
    @XmlElement(name = "CONTEXT-PORT-PROTOTYPE-REF")
    protected VARIABLEDATAPROTOTYPEINCOMPOSITIONINSTANCEREF.CONTEXTPORTPROTOTYPEREF contextportprototyperef;
    @XmlElement(name = "TARGET-VARIABLE-DATA-PROTOTYPE-REF")
    protected VARIABLEDATAPROTOTYPEINCOMPOSITIONINSTANCEREF.TARGETVARIABLEDATAPROTOTYPEREF targetvariabledataprototyperef;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * Gets the value of the contextswcomponentprototyperef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contextswcomponentprototyperef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCONTEXTSWCOMPONENTPROTOTYPEREF().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VARIABLEDATAPROTOTYPEINCOMPOSITIONINSTANCEREF.CONTEXTSWCOMPONENTPROTOTYPEREF }
     * 
     * 
     */
    public List<VARIABLEDATAPROTOTYPEINCOMPOSITIONINSTANCEREF.CONTEXTSWCOMPONENTPROTOTYPEREF> getCONTEXTSWCOMPONENTPROTOTYPEREF() {
        if (contextswcomponentprototyperef == null) {
            contextswcomponentprototyperef = new ArrayList<VARIABLEDATAPROTOTYPEINCOMPOSITIONINSTANCEREF.CONTEXTSWCOMPONENTPROTOTYPEREF>();
        }
        return this.contextswcomponentprototyperef;
    }

    /**
     * ??contextportprototyperef?????
     * 
     * @return
     *     possible object is
     *     {@link VARIABLEDATAPROTOTYPEINCOMPOSITIONINSTANCEREF.CONTEXTPORTPROTOTYPEREF }
     *     
     */
    public VARIABLEDATAPROTOTYPEINCOMPOSITIONINSTANCEREF.CONTEXTPORTPROTOTYPEREF getCONTEXTPORTPROTOTYPEREF() {
        return contextportprototyperef;
    }

    /**
     * ??contextportprototyperef?????
     * 
     * @param value
     *     allowed object is
     *     {@link VARIABLEDATAPROTOTYPEINCOMPOSITIONINSTANCEREF.CONTEXTPORTPROTOTYPEREF }
     *     
     */
    public void setCONTEXTPORTPROTOTYPEREF(VARIABLEDATAPROTOTYPEINCOMPOSITIONINSTANCEREF.CONTEXTPORTPROTOTYPEREF value) {
        this.contextportprototyperef = value;
    }

    /**
     * ??targetvariabledataprototyperef?????
     * 
     * @return
     *     possible object is
     *     {@link VARIABLEDATAPROTOTYPEINCOMPOSITIONINSTANCEREF.TARGETVARIABLEDATAPROTOTYPEREF }
     *     
     */
    public VARIABLEDATAPROTOTYPEINCOMPOSITIONINSTANCEREF.TARGETVARIABLEDATAPROTOTYPEREF getTARGETVARIABLEDATAPROTOTYPEREF() {
        return targetvariabledataprototyperef;
    }

    /**
     * ??targetvariabledataprototyperef?????
     * 
     * @param value
     *     allowed object is
     *     {@link VARIABLEDATAPROTOTYPEINCOMPOSITIONINSTANCEREF.TARGETVARIABLEDATAPROTOTYPEREF }
     *     
     */
    public void setTARGETVARIABLEDATAPROTOTYPEREF(VARIABLEDATAPROTOTYPEINCOMPOSITIONINSTANCEREF.TARGETVARIABLEDATAPROTOTYPEREF value) {
        this.targetvariabledataprototyperef = value;
    }

    /**
     * ??variationpoint?????
     * 
     * @return
     *     possible object is
     *     {@link VARIATIONPOINT }
     *     
     */
    public VARIATIONPOINT getVARIATIONPOINT() {
        return variationpoint;
    }

    /**
     * ??variationpoint?????
     * 
     * @param value
     *     allowed object is
     *     {@link VARIATIONPOINT }
     *     
     */
    public void setVARIATIONPOINT(VARIATIONPOINT value) {
        this.variationpoint = value;
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
    public static class CONTEXTPORTPROTOTYPEREF
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
    public static class CONTEXTSWCOMPONENTPROTOTYPEREF
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}VARIABLE-DATA-PROTOTYPE--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TARGETVARIABLEDATAPROTOTYPEREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected VARIABLEDATAPROTOTYPESUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link VARIABLEDATAPROTOTYPESUBTYPESENUM }
         *     
         */
        public VARIABLEDATAPROTOTYPESUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link VARIABLEDATAPROTOTYPESUBTYPESENUM }
         *     
         */
        public void setDEST(VARIABLEDATAPROTOTYPESUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
