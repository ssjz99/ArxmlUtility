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
 * <p>OPERATION-ARGUMENT-IN-COMPONENT-INSTANCE-REF complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="OPERATION-ARGUMENT-IN-COMPONENT-INSTANCE-REF">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ATP-INSTANCE-REF"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}OPERATION-ARGUMENT-IN-COMPONENT-INSTANCE-REF"/>
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
@XmlType(name = "OPERATION-ARGUMENT-IN-COMPONENT-INSTANCE-REF", propOrder = {
    "baseref",
    "contextcomponentref",
    "contextportprototyperef",
    "contextoperationref",
    "rootargumentdataprototyperef",
    "contextdataprototyperef",
    "targetdataprototyperef"
})
public class OPERATIONARGUMENTINCOMPONENTINSTANCEREF {

    @XmlElement(name = "BASE-REF")
    protected OPERATIONARGUMENTINCOMPONENTINSTANCEREF.BASEREF baseref;
    @XmlElement(name = "CONTEXT-COMPONENT-REF")
    protected List<OPERATIONARGUMENTINCOMPONENTINSTANCEREF.CONTEXTCOMPONENTREF> contextcomponentref;
    @XmlElement(name = "CONTEXT-PORT-PROTOTYPE-REF")
    protected OPERATIONARGUMENTINCOMPONENTINSTANCEREF.CONTEXTPORTPROTOTYPEREF contextportprototyperef;
    @XmlElement(name = "CONTEXT-OPERATION-REF")
    protected OPERATIONARGUMENTINCOMPONENTINSTANCEREF.CONTEXTOPERATIONREF contextoperationref;
    @XmlElement(name = "ROOT-ARGUMENT-DATA-PROTOTYPE-REF")
    protected OPERATIONARGUMENTINCOMPONENTINSTANCEREF.ROOTARGUMENTDATAPROTOTYPEREF rootargumentdataprototyperef;
    @XmlElement(name = "CONTEXT-DATA-PROTOTYPE-REF")
    protected List<OPERATIONARGUMENTINCOMPONENTINSTANCEREF.CONTEXTDATAPROTOTYPEREF> contextdataprototyperef;
    @XmlElement(name = "TARGET-DATA-PROTOTYPE-REF")
    protected OPERATIONARGUMENTINCOMPONENTINSTANCEREF.TARGETDATAPROTOTYPEREF targetdataprototyperef;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??baseref?????
     * 
     * @return
     *     possible object is
     *     {@link OPERATIONARGUMENTINCOMPONENTINSTANCEREF.BASEREF }
     *     
     */
    public OPERATIONARGUMENTINCOMPONENTINSTANCEREF.BASEREF getBASEREF() {
        return baseref;
    }

    /**
     * ??baseref?????
     * 
     * @param value
     *     allowed object is
     *     {@link OPERATIONARGUMENTINCOMPONENTINSTANCEREF.BASEREF }
     *     
     */
    public void setBASEREF(OPERATIONARGUMENTINCOMPONENTINSTANCEREF.BASEREF value) {
        this.baseref = value;
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
     * {@link OPERATIONARGUMENTINCOMPONENTINSTANCEREF.CONTEXTCOMPONENTREF }
     * 
     * 
     */
    public List<OPERATIONARGUMENTINCOMPONENTINSTANCEREF.CONTEXTCOMPONENTREF> getCONTEXTCOMPONENTREF() {
        if (contextcomponentref == null) {
            contextcomponentref = new ArrayList<OPERATIONARGUMENTINCOMPONENTINSTANCEREF.CONTEXTCOMPONENTREF>();
        }
        return this.contextcomponentref;
    }

    /**
     * ??contextportprototyperef?????
     * 
     * @return
     *     possible object is
     *     {@link OPERATIONARGUMENTINCOMPONENTINSTANCEREF.CONTEXTPORTPROTOTYPEREF }
     *     
     */
    public OPERATIONARGUMENTINCOMPONENTINSTANCEREF.CONTEXTPORTPROTOTYPEREF getCONTEXTPORTPROTOTYPEREF() {
        return contextportprototyperef;
    }

    /**
     * ??contextportprototyperef?????
     * 
     * @param value
     *     allowed object is
     *     {@link OPERATIONARGUMENTINCOMPONENTINSTANCEREF.CONTEXTPORTPROTOTYPEREF }
     *     
     */
    public void setCONTEXTPORTPROTOTYPEREF(OPERATIONARGUMENTINCOMPONENTINSTANCEREF.CONTEXTPORTPROTOTYPEREF value) {
        this.contextportprototyperef = value;
    }

    /**
     * ??contextoperationref?????
     * 
     * @return
     *     possible object is
     *     {@link OPERATIONARGUMENTINCOMPONENTINSTANCEREF.CONTEXTOPERATIONREF }
     *     
     */
    public OPERATIONARGUMENTINCOMPONENTINSTANCEREF.CONTEXTOPERATIONREF getCONTEXTOPERATIONREF() {
        return contextoperationref;
    }

    /**
     * ??contextoperationref?????
     * 
     * @param value
     *     allowed object is
     *     {@link OPERATIONARGUMENTINCOMPONENTINSTANCEREF.CONTEXTOPERATIONREF }
     *     
     */
    public void setCONTEXTOPERATIONREF(OPERATIONARGUMENTINCOMPONENTINSTANCEREF.CONTEXTOPERATIONREF value) {
        this.contextoperationref = value;
    }

    /**
     * ??rootargumentdataprototyperef?????
     * 
     * @return
     *     possible object is
     *     {@link OPERATIONARGUMENTINCOMPONENTINSTANCEREF.ROOTARGUMENTDATAPROTOTYPEREF }
     *     
     */
    public OPERATIONARGUMENTINCOMPONENTINSTANCEREF.ROOTARGUMENTDATAPROTOTYPEREF getROOTARGUMENTDATAPROTOTYPEREF() {
        return rootargumentdataprototyperef;
    }

    /**
     * ??rootargumentdataprototyperef?????
     * 
     * @param value
     *     allowed object is
     *     {@link OPERATIONARGUMENTINCOMPONENTINSTANCEREF.ROOTARGUMENTDATAPROTOTYPEREF }
     *     
     */
    public void setROOTARGUMENTDATAPROTOTYPEREF(OPERATIONARGUMENTINCOMPONENTINSTANCEREF.ROOTARGUMENTDATAPROTOTYPEREF value) {
        this.rootargumentdataprototyperef = value;
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
     * {@link OPERATIONARGUMENTINCOMPONENTINSTANCEREF.CONTEXTDATAPROTOTYPEREF }
     * 
     * 
     */
    public List<OPERATIONARGUMENTINCOMPONENTINSTANCEREF.CONTEXTDATAPROTOTYPEREF> getCONTEXTDATAPROTOTYPEREF() {
        if (contextdataprototyperef == null) {
            contextdataprototyperef = new ArrayList<OPERATIONARGUMENTINCOMPONENTINSTANCEREF.CONTEXTDATAPROTOTYPEREF>();
        }
        return this.contextdataprototyperef;
    }

    /**
     * ??targetdataprototyperef?????
     * 
     * @return
     *     possible object is
     *     {@link OPERATIONARGUMENTINCOMPONENTINSTANCEREF.TARGETDATAPROTOTYPEREF }
     *     
     */
    public OPERATIONARGUMENTINCOMPONENTINSTANCEREF.TARGETDATAPROTOTYPEREF getTARGETDATAPROTOTYPEREF() {
        return targetdataprototyperef;
    }

    /**
     * ??targetdataprototyperef?????
     * 
     * @param value
     *     allowed object is
     *     {@link OPERATIONARGUMENTINCOMPONENTINSTANCEREF.TARGETDATAPROTOTYPEREF }
     *     
     */
    public void setTARGETDATAPROTOTYPEREF(OPERATIONARGUMENTINCOMPONENTINSTANCEREF.TARGETDATAPROTOTYPEREF value) {
        this.targetdataprototyperef = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}SW-COMPONENT-TYPE--SUBTYPES-ENUM" />
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
        protected SWCOMPONENTTYPESUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link SWCOMPONENTTYPESUBTYPESENUM }
         *     
         */
        public SWCOMPONENTTYPESUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link SWCOMPONENTTYPESUBTYPESENUM }
         *     
         */
        public void setDEST(SWCOMPONENTTYPESUBTYPESENUM value) {
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
    public static class CONTEXTOPERATIONREF
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}ARGUMENT-DATA-PROTOTYPE--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ROOTARGUMENTDATAPROTOTYPEREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected ARGUMENTDATAPROTOTYPESUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link ARGUMENTDATAPROTOTYPESUBTYPESENUM }
         *     
         */
        public ARGUMENTDATAPROTOTYPESUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link ARGUMENTDATAPROTOTYPESUBTYPESENUM }
         *     
         */
        public void setDEST(ARGUMENTDATAPROTOTYPESUBTYPESENUM value) {
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
    public static class TARGETDATAPROTOTYPEREF
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
