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
 * This meta-class represents the ability to associate an alternative name to a flat representations or an Identifiable.
 * 
 * The usage of this name is defined outside of AUTOSAR. For example this name can be used by MCD tools or as a name for component instances in the ECU extract.
 * 
 * Note that flatInstance and identifiable are mutually exclusive.
 * 
 * <p>ALIAS-NAME-ASSIGNMENT complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="ALIAS-NAME-ASSIGNMENT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ALIAS-NAME-ASSIGNMENT"/>
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
@XmlType(name = "ALIAS-NAME-ASSIGNMENT", propOrder = {
    "shortlabel",
    "label",
    "identifiableref",
    "flatinstanceref",
    "variationpoint"
})
public class ALIASNAMEASSIGNMENT {

    @XmlElement(name = "SHORT-LABEL")
    protected STRING shortlabel;
    @XmlElement(name = "LABEL")
    protected MULTILANGUAGELONGNAME label;
    @XmlElement(name = "IDENTIFIABLE-REF")
    protected ALIASNAMEASSIGNMENT.IDENTIFIABLEREF identifiableref;
    @XmlElement(name = "FLAT-INSTANCE-REF")
    protected ALIASNAMEASSIGNMENT.FLATINSTANCEREF flatinstanceref;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??shortlabel?????
     * 
     * @return
     *     possible object is
     *     {@link STRING }
     *     
     */
    public STRING getSHORTLABEL() {
        return shortlabel;
    }

    /**
     * ??shortlabel?????
     * 
     * @param value
     *     allowed object is
     *     {@link STRING }
     *     
     */
    public void setSHORTLABEL(STRING value) {
        this.shortlabel = value;
    }

    /**
     * ??label?????
     * 
     * @return
     *     possible object is
     *     {@link MULTILANGUAGELONGNAME }
     *     
     */
    public MULTILANGUAGELONGNAME getLABEL() {
        return label;
    }

    /**
     * ??label?????
     * 
     * @param value
     *     allowed object is
     *     {@link MULTILANGUAGELONGNAME }
     *     
     */
    public void setLABEL(MULTILANGUAGELONGNAME value) {
        this.label = value;
    }

    /**
     * ??identifiableref?????
     * 
     * @return
     *     possible object is
     *     {@link ALIASNAMEASSIGNMENT.IDENTIFIABLEREF }
     *     
     */
    public ALIASNAMEASSIGNMENT.IDENTIFIABLEREF getIDENTIFIABLEREF() {
        return identifiableref;
    }

    /**
     * ??identifiableref?????
     * 
     * @param value
     *     allowed object is
     *     {@link ALIASNAMEASSIGNMENT.IDENTIFIABLEREF }
     *     
     */
    public void setIDENTIFIABLEREF(ALIASNAMEASSIGNMENT.IDENTIFIABLEREF value) {
        this.identifiableref = value;
    }

    /**
     * ??flatinstanceref?????
     * 
     * @return
     *     possible object is
     *     {@link ALIASNAMEASSIGNMENT.FLATINSTANCEREF }
     *     
     */
    public ALIASNAMEASSIGNMENT.FLATINSTANCEREF getFLATINSTANCEREF() {
        return flatinstanceref;
    }

    /**
     * ??flatinstanceref?????
     * 
     * @param value
     *     allowed object is
     *     {@link ALIASNAMEASSIGNMENT.FLATINSTANCEREF }
     *     
     */
    public void setFLATINSTANCEREF(ALIASNAMEASSIGNMENT.FLATINSTANCEREF value) {
        this.flatinstanceref = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}FLAT-INSTANCE-DESCRIPTOR--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class FLATINSTANCEREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected FLATINSTANCEDESCRIPTORSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link FLATINSTANCEDESCRIPTORSUBTYPESENUM }
         *     
         */
        public FLATINSTANCEDESCRIPTORSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link FLATINSTANCEDESCRIPTORSUBTYPESENUM }
         *     
         */
        public void setDEST(FLATINSTANCEDESCRIPTORSUBTYPESENUM value) {
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}IDENTIFIABLE--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class IDENTIFIABLEREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected IDENTIFIABLESUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link IDENTIFIABLESUBTYPESENUM }
         *     
         */
        public IDENTIFIABLESUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link IDENTIFIABLESUBTYPESENUM }
         *     
         */
        public void setDEST(IDENTIFIABLESUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
