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
 * <p>APPLICATION-COMPOSITE-ELEMENT-IN-PORT-INTERFACE-INSTANCE-REF complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="APPLICATION-COMPOSITE-ELEMENT-IN-PORT-INTERFACE-INSTANCE-REF">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ATP-INSTANCE-REF"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}APPLICATION-COMPOSITE-ELEMENT-IN-PORT-INTERFACE-INSTANCE-REF"/>
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
@XmlType(name = "APPLICATION-COMPOSITE-ELEMENT-IN-PORT-INTERFACE-INSTANCE-REF", propOrder = {
    "rootdataprototyperef",
    "contextdataprototyperef",
    "targetdataprototyperef"
})
public class APPLICATIONCOMPOSITEELEMENTINPORTINTERFACEINSTANCEREF {

    @XmlElement(name = "ROOT-DATA-PROTOTYPE-REF")
    protected APPLICATIONCOMPOSITEELEMENTINPORTINTERFACEINSTANCEREF.ROOTDATAPROTOTYPEREF rootdataprototyperef;
    @XmlElement(name = "CONTEXT-DATA-PROTOTYPE-REF")
    protected List<APPLICATIONCOMPOSITEELEMENTINPORTINTERFACEINSTANCEREF.CONTEXTDATAPROTOTYPEREF> contextdataprototyperef;
    @XmlElement(name = "TARGET-DATA-PROTOTYPE-REF")
    protected APPLICATIONCOMPOSITEELEMENTINPORTINTERFACEINSTANCEREF.TARGETDATAPROTOTYPEREF targetdataprototyperef;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??rootdataprototyperef?????
     * 
     * @return
     *     possible object is
     *     {@link APPLICATIONCOMPOSITEELEMENTINPORTINTERFACEINSTANCEREF.ROOTDATAPROTOTYPEREF }
     *     
     */
    public APPLICATIONCOMPOSITEELEMENTINPORTINTERFACEINSTANCEREF.ROOTDATAPROTOTYPEREF getROOTDATAPROTOTYPEREF() {
        return rootdataprototyperef;
    }

    /**
     * ??rootdataprototyperef?????
     * 
     * @param value
     *     allowed object is
     *     {@link APPLICATIONCOMPOSITEELEMENTINPORTINTERFACEINSTANCEREF.ROOTDATAPROTOTYPEREF }
     *     
     */
    public void setROOTDATAPROTOTYPEREF(APPLICATIONCOMPOSITEELEMENTINPORTINTERFACEINSTANCEREF.ROOTDATAPROTOTYPEREF value) {
        this.rootdataprototyperef = value;
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
     * {@link APPLICATIONCOMPOSITEELEMENTINPORTINTERFACEINSTANCEREF.CONTEXTDATAPROTOTYPEREF }
     * 
     * 
     */
    public List<APPLICATIONCOMPOSITEELEMENTINPORTINTERFACEINSTANCEREF.CONTEXTDATAPROTOTYPEREF> getCONTEXTDATAPROTOTYPEREF() {
        if (contextdataprototyperef == null) {
            contextdataprototyperef = new ArrayList<APPLICATIONCOMPOSITEELEMENTINPORTINTERFACEINSTANCEREF.CONTEXTDATAPROTOTYPEREF>();
        }
        return this.contextdataprototyperef;
    }

    /**
     * ??targetdataprototyperef?????
     * 
     * @return
     *     possible object is
     *     {@link APPLICATIONCOMPOSITEELEMENTINPORTINTERFACEINSTANCEREF.TARGETDATAPROTOTYPEREF }
     *     
     */
    public APPLICATIONCOMPOSITEELEMENTINPORTINTERFACEINSTANCEREF.TARGETDATAPROTOTYPEREF getTARGETDATAPROTOTYPEREF() {
        return targetdataprototyperef;
    }

    /**
     * ??targetdataprototyperef?????
     * 
     * @param value
     *     allowed object is
     *     {@link APPLICATIONCOMPOSITEELEMENTINPORTINTERFACEINSTANCEREF.TARGETDATAPROTOTYPEREF }
     *     
     */
    public void setTARGETDATAPROTOTYPEREF(APPLICATIONCOMPOSITEELEMENTINPORTINTERFACEINSTANCEREF.TARGETDATAPROTOTYPEREF value) {
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}AUTOSAR-DATA-PROTOTYPE--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ROOTDATAPROTOTYPEREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected AUTOSARDATAPROTOTYPESUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link AUTOSARDATAPROTOTYPESUBTYPESENUM }
         *     
         */
        public AUTOSARDATAPROTOTYPESUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link AUTOSARDATAPROTOTYPESUBTYPESENUM }
         *     
         */
        public void setDEST(AUTOSARDATAPROTOTYPESUBTYPESENUM value) {
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
    public static class TARGETDATAPROTOTYPEREF
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

}
