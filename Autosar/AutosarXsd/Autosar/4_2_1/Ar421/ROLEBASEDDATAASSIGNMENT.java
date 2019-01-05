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
 * This class specifies an assignment of a role to a particular data object in the SwcInternalBehavior of a software component (or in the BswModuleBehavior of a module or cluster) in the context of an AUTOSAR Service.
 * 
 * With this assignment, the role of the data can be mapped to a specific ServiceNeeds element, so that a tool is able to create the correct access.
 * 
 * <p>ROLE-BASED-DATA-ASSIGNMENT complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="ROLE-BASED-DATA-ASSIGNMENT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ROLE-BASED-DATA-ASSIGNMENT"/>
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
@XmlType(name = "ROLE-BASED-DATA-ASSIGNMENT", propOrder = {
    "role",
    "useddataelement",
    "usedparameterelement",
    "usedpimref",
    "variationpoint"
})
public class ROLEBASEDDATAASSIGNMENT {

    @XmlElement(name = "ROLE")
    protected IDENTIFIER role;
    @XmlElement(name = "USED-DATA-ELEMENT")
    protected AUTOSARVARIABLEREF useddataelement;
    @XmlElement(name = "USED-PARAMETER-ELEMENT")
    protected AUTOSARPARAMETERREF usedparameterelement;
    @XmlElement(name = "USED-PIM-REF")
    protected ROLEBASEDDATAASSIGNMENT.USEDPIMREF usedpimref;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??role?????
     * 
     * @return
     *     possible object is
     *     {@link IDENTIFIER }
     *     
     */
    public IDENTIFIER getROLE() {
        return role;
    }

    /**
     * ??role?????
     * 
     * @param value
     *     allowed object is
     *     {@link IDENTIFIER }
     *     
     */
    public void setROLE(IDENTIFIER value) {
        this.role = value;
    }

    /**
     * ??useddataelement?????
     * 
     * @return
     *     possible object is
     *     {@link AUTOSARVARIABLEREF }
     *     
     */
    public AUTOSARVARIABLEREF getUSEDDATAELEMENT() {
        return useddataelement;
    }

    /**
     * ??useddataelement?????
     * 
     * @param value
     *     allowed object is
     *     {@link AUTOSARVARIABLEREF }
     *     
     */
    public void setUSEDDATAELEMENT(AUTOSARVARIABLEREF value) {
        this.useddataelement = value;
    }

    /**
     * ??usedparameterelement?????
     * 
     * @return
     *     possible object is
     *     {@link AUTOSARPARAMETERREF }
     *     
     */
    public AUTOSARPARAMETERREF getUSEDPARAMETERELEMENT() {
        return usedparameterelement;
    }

    /**
     * ??usedparameterelement?????
     * 
     * @param value
     *     allowed object is
     *     {@link AUTOSARPARAMETERREF }
     *     
     */
    public void setUSEDPARAMETERELEMENT(AUTOSARPARAMETERREF value) {
        this.usedparameterelement = value;
    }

    /**
     * ??usedpimref?????
     * 
     * @return
     *     possible object is
     *     {@link ROLEBASEDDATAASSIGNMENT.USEDPIMREF }
     *     
     */
    public ROLEBASEDDATAASSIGNMENT.USEDPIMREF getUSEDPIMREF() {
        return usedpimref;
    }

    /**
     * ??usedpimref?????
     * 
     * @param value
     *     allowed object is
     *     {@link ROLEBASEDDATAASSIGNMENT.USEDPIMREF }
     *     
     */
    public void setUSEDPIMREF(ROLEBASEDDATAASSIGNMENT.USEDPIMREF value) {
        this.usedpimref = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}PER-INSTANCE-MEMORY--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class USEDPIMREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected PERINSTANCEMEMORYSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link PERINSTANCEMEMORYSUBTYPESENUM }
         *     
         */
        public PERINSTANCEMEMORYSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link PERINSTANCEMEMORYSUBTYPESENUM }
         *     
         */
        public void setDEST(PERINSTANCEMEMORYSUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
