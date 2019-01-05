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
 * This meta-class represents the ability to define an InstanceRef to a nested DataPrototypeGroup
 * 
 * <p>INNER-DATA-PROTOTYPE-GROUP-IN-COMPOSITION-INSTANCE-REF complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="INNER-DATA-PROTOTYPE-GROUP-IN-COMPOSITION-INSTANCE-REF">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ATP-INSTANCE-REF"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}INNER-DATA-PROTOTYPE-GROUP-IN-COMPOSITION-INSTANCE-REF"/>
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
@XmlType(name = "INNER-DATA-PROTOTYPE-GROUP-IN-COMPOSITION-INSTANCE-REF", propOrder = {
    "contextswcomponentprototyperef",
    "targetdataprototypegroupref",
    "variationpoint"
})
public class INNERDATAPROTOTYPEGROUPINCOMPOSITIONINSTANCEREF {

    @XmlElement(name = "CONTEXT-SW-COMPONENT-PROTOTYPE-REF")
    protected List<INNERDATAPROTOTYPEGROUPINCOMPOSITIONINSTANCEREF.CONTEXTSWCOMPONENTPROTOTYPEREF> contextswcomponentprototyperef;
    @XmlElement(name = "TARGET-DATA-PROTOTYPE-GROUP-REF")
    protected INNERDATAPROTOTYPEGROUPINCOMPOSITIONINSTANCEREF.TARGETDATAPROTOTYPEGROUPREF targetdataprototypegroupref;
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
     * {@link INNERDATAPROTOTYPEGROUPINCOMPOSITIONINSTANCEREF.CONTEXTSWCOMPONENTPROTOTYPEREF }
     * 
     * 
     */
    public List<INNERDATAPROTOTYPEGROUPINCOMPOSITIONINSTANCEREF.CONTEXTSWCOMPONENTPROTOTYPEREF> getCONTEXTSWCOMPONENTPROTOTYPEREF() {
        if (contextswcomponentprototyperef == null) {
            contextswcomponentprototyperef = new ArrayList<INNERDATAPROTOTYPEGROUPINCOMPOSITIONINSTANCEREF.CONTEXTSWCOMPONENTPROTOTYPEREF>();
        }
        return this.contextswcomponentprototyperef;
    }

    /**
     * ??targetdataprototypegroupref?????
     * 
     * @return
     *     possible object is
     *     {@link INNERDATAPROTOTYPEGROUPINCOMPOSITIONINSTANCEREF.TARGETDATAPROTOTYPEGROUPREF }
     *     
     */
    public INNERDATAPROTOTYPEGROUPINCOMPOSITIONINSTANCEREF.TARGETDATAPROTOTYPEGROUPREF getTARGETDATAPROTOTYPEGROUPREF() {
        return targetdataprototypegroupref;
    }

    /**
     * ??targetdataprototypegroupref?????
     * 
     * @param value
     *     allowed object is
     *     {@link INNERDATAPROTOTYPEGROUPINCOMPOSITIONINSTANCEREF.TARGETDATAPROTOTYPEGROUPREF }
     *     
     */
    public void setTARGETDATAPROTOTYPEGROUPREF(INNERDATAPROTOTYPEGROUPINCOMPOSITIONINSTANCEREF.TARGETDATAPROTOTYPEGROUPREF value) {
        this.targetdataprototypegroupref = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}DATA-PROTOTYPE-GROUP--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TARGETDATAPROTOTYPEGROUPREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected DATAPROTOTYPEGROUPSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link DATAPROTOTYPEGROUPSUBTYPESENUM }
         *     
         */
        public DATAPROTOTYPEGROUPSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link DATAPROTOTYPEGROUPSUBTYPESENUM }
         *     
         */
        public void setDEST(DATAPROTOTYPEGROUPSUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
