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
 * <p>VARIABLE-IN-COMPONENT-INSTANCE-REF complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="VARIABLE-IN-COMPONENT-INSTANCE-REF">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ATP-INSTANCE-REF"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}VARIABLE-IN-COMPONENT-INSTANCE-REF"/>
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
@XmlType(name = "VARIABLE-IN-COMPONENT-INSTANCE-REF", propOrder = {
    "contextcomponentref",
    "contextportprototyperef",
    "rootvariabledataprototyperef",
    "contextdataprototyperef",
    "targetdataprotoyperef"
})
public class VARIABLEINCOMPONENTINSTANCEREF {

    @XmlElement(name = "CONTEXT-COMPONENT-REF")
    protected List<VARIABLEINCOMPONENTINSTANCEREF.CONTEXTCOMPONENTREF> contextcomponentref;
    @XmlElement(name = "CONTEXT-PORT-PROTOTYPE-REF")
    protected VARIABLEINCOMPONENTINSTANCEREF.CONTEXTPORTPROTOTYPEREF contextportprototyperef;
    @XmlElement(name = "ROOT-VARIABLE-DATA-PROTOTYPE-REF")
    protected VARIABLEINCOMPONENTINSTANCEREF.ROOTVARIABLEDATAPROTOTYPEREF rootvariabledataprototyperef;
    @XmlElement(name = "CONTEXT-DATA-PROTOTYPE-REF")
    protected List<VARIABLEINCOMPONENTINSTANCEREF.CONTEXTDATAPROTOTYPEREF> contextdataprototyperef;
    @XmlElement(name = "TARGET-DATA-PROTOYPE-REF")
    protected VARIABLEINCOMPONENTINSTANCEREF.TARGETDATAPROTOYPEREF targetdataprotoyperef;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

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
     * {@link VARIABLEINCOMPONENTINSTANCEREF.CONTEXTCOMPONENTREF }
     * 
     * 
     */
    public List<VARIABLEINCOMPONENTINSTANCEREF.CONTEXTCOMPONENTREF> getCONTEXTCOMPONENTREF() {
        if (contextcomponentref == null) {
            contextcomponentref = new ArrayList<VARIABLEINCOMPONENTINSTANCEREF.CONTEXTCOMPONENTREF>();
        }
        return this.contextcomponentref;
    }

    /**
     * ??contextportprototyperef?????
     * 
     * @return
     *     possible object is
     *     {@link VARIABLEINCOMPONENTINSTANCEREF.CONTEXTPORTPROTOTYPEREF }
     *     
     */
    public VARIABLEINCOMPONENTINSTANCEREF.CONTEXTPORTPROTOTYPEREF getCONTEXTPORTPROTOTYPEREF() {
        return contextportprototyperef;
    }

    /**
     * ??contextportprototyperef?????
     * 
     * @param value
     *     allowed object is
     *     {@link VARIABLEINCOMPONENTINSTANCEREF.CONTEXTPORTPROTOTYPEREF }
     *     
     */
    public void setCONTEXTPORTPROTOTYPEREF(VARIABLEINCOMPONENTINSTANCEREF.CONTEXTPORTPROTOTYPEREF value) {
        this.contextportprototyperef = value;
    }

    /**
     * ??rootvariabledataprototyperef?????
     * 
     * @return
     *     possible object is
     *     {@link VARIABLEINCOMPONENTINSTANCEREF.ROOTVARIABLEDATAPROTOTYPEREF }
     *     
     */
    public VARIABLEINCOMPONENTINSTANCEREF.ROOTVARIABLEDATAPROTOTYPEREF getROOTVARIABLEDATAPROTOTYPEREF() {
        return rootvariabledataprototyperef;
    }

    /**
     * ??rootvariabledataprototyperef?????
     * 
     * @param value
     *     allowed object is
     *     {@link VARIABLEINCOMPONENTINSTANCEREF.ROOTVARIABLEDATAPROTOTYPEREF }
     *     
     */
    public void setROOTVARIABLEDATAPROTOTYPEREF(VARIABLEINCOMPONENTINSTANCEREF.ROOTVARIABLEDATAPROTOTYPEREF value) {
        this.rootvariabledataprototyperef = value;
    }

    /**
     * Gets the value of the contextdataprototyperef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contextdataprototyperef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCONTEXTDATAPROTOTYPEREF().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VARIABLEINCOMPONENTINSTANCEREF.CONTEXTDATAPROTOTYPEREF }
     * 
     * 
     */
    public List<VARIABLEINCOMPONENTINSTANCEREF.CONTEXTDATAPROTOTYPEREF> getCONTEXTDATAPROTOTYPEREF() {
        if (contextdataprototyperef == null) {
            contextdataprototyperef = new ArrayList<VARIABLEINCOMPONENTINSTANCEREF.CONTEXTDATAPROTOTYPEREF>();
        }
        return this.contextdataprototyperef;
    }

    /**
     * ??targetdataprotoyperef?????
     * 
     * @return
     *     possible object is
     *     {@link VARIABLEINCOMPONENTINSTANCEREF.TARGETDATAPROTOYPEREF }
     *     
     */
    public VARIABLEINCOMPONENTINSTANCEREF.TARGETDATAPROTOYPEREF getTARGETDATAPROTOYPEREF() {
        return targetdataprotoyperef;
    }

    /**
     * ??targetdataprotoyperef?????
     * 
     * @param value
     *     allowed object is
     *     {@link VARIABLEINCOMPONENTINSTANCEREF.TARGETDATAPROTOYPEREF }
     *     
     */
    public void setTARGETDATAPROTOYPEREF(VARIABLEINCOMPONENTINSTANCEREF.TARGETDATAPROTOYPEREF value) {
        this.targetdataprotoyperef = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}APPLICATION-COMPOSITE-ELEMENT-DATA-PROTOTYPE--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CONTEXTDATAPROTOTYPEREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected APPLICATIONCOMPOSITEELEMENTDATAPROTOTYPESUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link APPLICATIONCOMPOSITEELEMENTDATAPROTOTYPESUBTYPESENUM }
         *     
         */
        public APPLICATIONCOMPOSITEELEMENTDATAPROTOTYPESUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link APPLICATIONCOMPOSITEELEMENTDATAPROTOTYPESUBTYPESENUM }
         *     
         */
        public void setDEST(APPLICATIONCOMPOSITEELEMENTDATAPROTOTYPESUBTYPESENUM value) {
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
    public static class ROOTVARIABLEDATAPROTOTYPEREF
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


    /**
     * <p>anonymous complex type? Java ??
     * 
     * <p>????????????????????
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}DATA-PROTOTYPE--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TARGETDATAPROTOYPEREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected DATAPROTOTYPESUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link DATAPROTOTYPESUBTYPESENUM }
         *     
         */
        public DATAPROTOTYPESUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link DATAPROTOTYPESUBTYPESENUM }
         *     
         */
        public void setDEST(DATAPROTOTYPESUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
