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
 * This class specifies an assignment of a role to a particular BswModuleEntry (usually a configurable callback). 
 * 
 * With this assignment, the role of the callback is mapped to a specific ServiceNeeds element, so that a tool is able to create appropriate configuration values for the module that implements the AUTOSAR Service.
 * 
 * <p>ROLE-BASED-BSW-MODULE-ENTRY-ASSIGNMENT complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="ROLE-BASED-BSW-MODULE-ENTRY-ASSIGNMENT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ROLE-BASED-BSW-MODULE-ENTRY-ASSIGNMENT"/>
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
@XmlType(name = "ROLE-BASED-BSW-MODULE-ENTRY-ASSIGNMENT", propOrder = {
    "assignedentryref",
    "role",
    "variationpoint"
})
public class ROLEBASEDBSWMODULEENTRYASSIGNMENT {

    @XmlElement(name = "ASSIGNED-ENTRY-REF")
    protected ROLEBASEDBSWMODULEENTRYASSIGNMENT.ASSIGNEDENTRYREF assignedentryref;
    @XmlElement(name = "ROLE")
    protected IDENTIFIER role;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??assignedentryref?????
     * 
     * @return
     *     possible object is
     *     {@link ROLEBASEDBSWMODULEENTRYASSIGNMENT.ASSIGNEDENTRYREF }
     *     
     */
    public ROLEBASEDBSWMODULEENTRYASSIGNMENT.ASSIGNEDENTRYREF getASSIGNEDENTRYREF() {
        return assignedentryref;
    }

    /**
     * ??assignedentryref?????
     * 
     * @param value
     *     allowed object is
     *     {@link ROLEBASEDBSWMODULEENTRYASSIGNMENT.ASSIGNEDENTRYREF }
     *     
     */
    public void setASSIGNEDENTRYREF(ROLEBASEDBSWMODULEENTRYASSIGNMENT.ASSIGNEDENTRYREF value) {
        this.assignedentryref = value;
    }

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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}BSW-MODULE-ENTRY--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ASSIGNEDENTRYREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected BSWMODULEENTRYSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link BSWMODULEENTRYSUBTYPESENUM }
         *     
         */
        public BSWMODULEENTRYSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link BSWMODULEENTRYSUBTYPESENUM }
         *     
         */
        public void setDEST(BSWMODULEENTRYSUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
