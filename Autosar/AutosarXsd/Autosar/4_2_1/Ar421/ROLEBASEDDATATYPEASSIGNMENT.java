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
 * This class specifies an assignment of a role to a particular data type of a software component (or in the BswModuleBehavior of a module or cluster) in the context of an AUTOSAR Service.
 * 
 * With this assignment, the role of the data type can be mapped to a specific ServiceNeeds element, so that a tool is able to create the correct access.
 * 
 * <p>ROLE-BASED-DATA-TYPE-ASSIGNMENT complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="ROLE-BASED-DATA-TYPE-ASSIGNMENT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ROLE-BASED-DATA-TYPE-ASSIGNMENT"/>
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
@XmlType(name = "ROLE-BASED-DATA-TYPE-ASSIGNMENT", propOrder = {
    "role",
    "usedimplementationdatatyperef",
    "variationpoint"
})
public class ROLEBASEDDATATYPEASSIGNMENT {

    @XmlElement(name = "ROLE")
    protected IDENTIFIER role;
    @XmlElement(name = "USED-IMPLEMENTATION-DATA-TYPE-REF")
    protected ROLEBASEDDATATYPEASSIGNMENT.USEDIMPLEMENTATIONDATATYPEREF usedimplementationdatatyperef;
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
     * ??usedimplementationdatatyperef?????
     * 
     * @return
     *     possible object is
     *     {@link ROLEBASEDDATATYPEASSIGNMENT.USEDIMPLEMENTATIONDATATYPEREF }
     *     
     */
    public ROLEBASEDDATATYPEASSIGNMENT.USEDIMPLEMENTATIONDATATYPEREF getUSEDIMPLEMENTATIONDATATYPEREF() {
        return usedimplementationdatatyperef;
    }

    /**
     * ??usedimplementationdatatyperef?????
     * 
     * @param value
     *     allowed object is
     *     {@link ROLEBASEDDATATYPEASSIGNMENT.USEDIMPLEMENTATIONDATATYPEREF }
     *     
     */
    public void setUSEDIMPLEMENTATIONDATATYPEREF(ROLEBASEDDATATYPEASSIGNMENT.USEDIMPLEMENTATIONDATATYPEREF value) {
        this.usedimplementationdatatyperef = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}IMPLEMENTATION-DATA-TYPE--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class USEDIMPLEMENTATIONDATATYPEREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected IMPLEMENTATIONDATATYPESUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link IMPLEMENTATIONDATATYPESUBTYPESENUM }
         *     
         */
        public IMPLEMENTATIONDATATYPESUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link IMPLEMENTATIONDATATYPESUBTYPESENUM }
         *     
         */
        public void setDEST(IMPLEMENTATIONDATATYPESUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
