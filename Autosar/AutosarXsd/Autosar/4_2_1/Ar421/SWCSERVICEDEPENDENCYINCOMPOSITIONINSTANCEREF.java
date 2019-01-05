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
 * <p>SWC-SERVICE-DEPENDENCY-IN-COMPOSITION-INSTANCE-REF complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="SWC-SERVICE-DEPENDENCY-IN-COMPOSITION-INSTANCE-REF">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ATP-INSTANCE-REF"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}SWC-SERVICE-DEPENDENCY-IN-COMPOSITION-INSTANCE-REF"/>
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
@XmlType(name = "SWC-SERVICE-DEPENDENCY-IN-COMPOSITION-INSTANCE-REF", propOrder = {
    "baseref",
    "rootcontextref",
    "contextswcomponentprototyperef",
    "targetswcservicedependencyref"
})
public class SWCSERVICEDEPENDENCYINCOMPOSITIONINSTANCEREF {

    @XmlElement(name = "BASE-REF")
    protected SWCSERVICEDEPENDENCYINCOMPOSITIONINSTANCEREF.BASEREF baseref;
    @XmlElement(name = "ROOT-CONTEXT-REF")
    protected SWCSERVICEDEPENDENCYINCOMPOSITIONINSTANCEREF.ROOTCONTEXTREF rootcontextref;
    @XmlElement(name = "CONTEXT-SW-COMPONENT-PROTOTYPE-REF")
    protected List<SWCSERVICEDEPENDENCYINCOMPOSITIONINSTANCEREF.CONTEXTSWCOMPONENTPROTOTYPEREF> contextswcomponentprototyperef;
    @XmlElement(name = "TARGET-SWC-SERVICE-DEPENDENCY-REF")
    protected SWCSERVICEDEPENDENCYINCOMPOSITIONINSTANCEREF.TARGETSWCSERVICEDEPENDENCYREF targetswcservicedependencyref;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??baseref?????
     * 
     * @return
     *     possible object is
     *     {@link SWCSERVICEDEPENDENCYINCOMPOSITIONINSTANCEREF.BASEREF }
     *     
     */
    public SWCSERVICEDEPENDENCYINCOMPOSITIONINSTANCEREF.BASEREF getBASEREF() {
        return baseref;
    }

    /**
     * ??baseref?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWCSERVICEDEPENDENCYINCOMPOSITIONINSTANCEREF.BASEREF }
     *     
     */
    public void setBASEREF(SWCSERVICEDEPENDENCYINCOMPOSITIONINSTANCEREF.BASEREF value) {
        this.baseref = value;
    }

    /**
     * ??rootcontextref?????
     * 
     * @return
     *     possible object is
     *     {@link SWCSERVICEDEPENDENCYINCOMPOSITIONINSTANCEREF.ROOTCONTEXTREF }
     *     
     */
    public SWCSERVICEDEPENDENCYINCOMPOSITIONINSTANCEREF.ROOTCONTEXTREF getROOTCONTEXTREF() {
        return rootcontextref;
    }

    /**
     * ??rootcontextref?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWCSERVICEDEPENDENCYINCOMPOSITIONINSTANCEREF.ROOTCONTEXTREF }
     *     
     */
    public void setROOTCONTEXTREF(SWCSERVICEDEPENDENCYINCOMPOSITIONINSTANCEREF.ROOTCONTEXTREF value) {
        this.rootcontextref = value;
    }

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
     * {@link SWCSERVICEDEPENDENCYINCOMPOSITIONINSTANCEREF.CONTEXTSWCOMPONENTPROTOTYPEREF }
     * 
     * 
     */
    public List<SWCSERVICEDEPENDENCYINCOMPOSITIONINSTANCEREF.CONTEXTSWCOMPONENTPROTOTYPEREF> getCONTEXTSWCOMPONENTPROTOTYPEREF() {
        if (contextswcomponentprototyperef == null) {
            contextswcomponentprototyperef = new ArrayList<SWCSERVICEDEPENDENCYINCOMPOSITIONINSTANCEREF.CONTEXTSWCOMPONENTPROTOTYPEREF>();
        }
        return this.contextswcomponentprototyperef;
    }

    /**
     * ??targetswcservicedependencyref?????
     * 
     * @return
     *     possible object is
     *     {@link SWCSERVICEDEPENDENCYINCOMPOSITIONINSTANCEREF.TARGETSWCSERVICEDEPENDENCYREF }
     *     
     */
    public SWCSERVICEDEPENDENCYINCOMPOSITIONINSTANCEREF.TARGETSWCSERVICEDEPENDENCYREF getTARGETSWCSERVICEDEPENDENCYREF() {
        return targetswcservicedependencyref;
    }

    /**
     * ??targetswcservicedependencyref?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWCSERVICEDEPENDENCYINCOMPOSITIONINSTANCEREF.TARGETSWCSERVICEDEPENDENCYREF }
     *     
     */
    public void setTARGETSWCSERVICEDEPENDENCYREF(SWCSERVICEDEPENDENCYINCOMPOSITIONINSTANCEREF.TARGETSWCSERVICEDEPENDENCYREF value) {
        this.targetswcservicedependencyref = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}COMPOSITION-SW-COMPONENT-TYPE--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class BASEREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected COMPOSITIONSWCOMPONENTTYPESUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link COMPOSITIONSWCOMPONENTTYPESUBTYPESENUM }
         *     
         */
        public COMPOSITIONSWCOMPONENTTYPESUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link COMPOSITIONSWCOMPONENTTYPESUBTYPESENUM }
         *     
         */
        public void setDEST(COMPOSITIONSWCOMPONENTTYPESUBTYPESENUM value) {
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
    public static class ROOTCONTEXTREF
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}SWC-SERVICE-DEPENDENCY--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TARGETSWCSERVICEDEPENDENCYREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected SWCSERVICEDEPENDENCYSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link SWCSERVICEDEPENDENCYSUBTYPESENUM }
         *     
         */
        public SWCSERVICEDEPENDENCYSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link SWCSERVICEDEPENDENCYSUBTYPESENUM }
         *     
         */
        public void setDEST(SWCSERVICEDEPENDENCYSUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
