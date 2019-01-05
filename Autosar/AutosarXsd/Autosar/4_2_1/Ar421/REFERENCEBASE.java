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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * This meta-class establishes a basis for relative references. Reference bases are identified by the shortLabel which must be unique in the current package.
 * 
 * <p>REFERENCE-BASE complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="REFERENCE-BASE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERENCE-BASE"/>
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
@XmlType(name = "REFERENCE-BASE", propOrder = {
    "shortlabel",
    "isdefault",
    "isglobal",
    "baseisthispackage",
    "globalinpackagerefs",
    "globalelements",
    "packageref"
})
public class REFERENCEBASE {

    @XmlElement(name = "SHORT-LABEL")
    protected IDENTIFIER shortlabel;
    @XmlElement(name = "IS-DEFAULT")
    protected BOOLEAN isdefault;
    @XmlElement(name = "IS-GLOBAL")
    protected BOOLEAN isglobal;
    @XmlElement(name = "BASE-IS-THIS-PACKAGE")
    protected BOOLEAN baseisthispackage;
    @XmlElement(name = "GLOBAL-IN-PACKAGE-REFS")
    protected REFERENCEBASE.GLOBALINPACKAGEREFS globalinpackagerefs;
    @XmlElement(name = "GLOBAL-ELEMENTS")
    protected REFERENCEBASE.GLOBALELEMENTS globalelements;
    @XmlElement(name = "PACKAGE-REF")
    protected REFERENCEBASE.PACKAGEREF packageref;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??shortlabel?????
     * 
     * @return
     *     possible object is
     *     {@link IDENTIFIER }
     *     
     */
    public IDENTIFIER getSHORTLABEL() {
        return shortlabel;
    }

    /**
     * ??shortlabel?????
     * 
     * @param value
     *     allowed object is
     *     {@link IDENTIFIER }
     *     
     */
    public void setSHORTLABEL(IDENTIFIER value) {
        this.shortlabel = value;
    }

    /**
     * ??isdefault?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getISDEFAULT() {
        return isdefault;
    }

    /**
     * ??isdefault?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setISDEFAULT(BOOLEAN value) {
        this.isdefault = value;
    }

    /**
     * ??isglobal?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getISGLOBAL() {
        return isglobal;
    }

    /**
     * ??isglobal?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setISGLOBAL(BOOLEAN value) {
        this.isglobal = value;
    }

    /**
     * ??baseisthispackage?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getBASEISTHISPACKAGE() {
        return baseisthispackage;
    }

    /**
     * ??baseisthispackage?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setBASEISTHISPACKAGE(BOOLEAN value) {
        this.baseisthispackage = value;
    }

    /**
     * ??globalinpackagerefs?????
     * 
     * @return
     *     possible object is
     *     {@link REFERENCEBASE.GLOBALINPACKAGEREFS }
     *     
     */
    public REFERENCEBASE.GLOBALINPACKAGEREFS getGLOBALINPACKAGEREFS() {
        return globalinpackagerefs;
    }

    /**
     * ??globalinpackagerefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link REFERENCEBASE.GLOBALINPACKAGEREFS }
     *     
     */
    public void setGLOBALINPACKAGEREFS(REFERENCEBASE.GLOBALINPACKAGEREFS value) {
        this.globalinpackagerefs = value;
    }

    /**
     * ??globalelements?????
     * 
     * @return
     *     possible object is
     *     {@link REFERENCEBASE.GLOBALELEMENTS }
     *     
     */
    public REFERENCEBASE.GLOBALELEMENTS getGLOBALELEMENTS() {
        return globalelements;
    }

    /**
     * ??globalelements?????
     * 
     * @param value
     *     allowed object is
     *     {@link REFERENCEBASE.GLOBALELEMENTS }
     *     
     */
    public void setGLOBALELEMENTS(REFERENCEBASE.GLOBALELEMENTS value) {
        this.globalelements = value;
    }

    /**
     * ??packageref?????
     * 
     * @return
     *     possible object is
     *     {@link REFERENCEBASE.PACKAGEREF }
     *     
     */
    public REFERENCEBASE.PACKAGEREF getPACKAGEREF() {
        return packageref;
    }

    /**
     * ??packageref?????
     * 
     * @param value
     *     allowed object is
     *     {@link REFERENCEBASE.PACKAGEREF }
     *     
     */
    public void setPACKAGEREF(REFERENCEBASE.PACKAGEREF value) {
        this.packageref = value;
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
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="GLOBAL-ELEMENT" type="{http://autosar.org/schema/r4.0}REFERRABLE--SUBTYPES-ENUM"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "globalelement"
    })
    public static class GLOBALELEMENTS {

        @XmlElement(name = "GLOBAL-ELEMENT")
        @XmlSchemaType(name = "string")
        protected List<REFERRABLESUBTYPESENUM> globalelement;

        /**
         * Gets the value of the globalelement property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the globalelement property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGLOBALELEMENT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link REFERRABLESUBTYPESENUM }
         * 
         * 
         */
        public List<REFERRABLESUBTYPESENUM> getGLOBALELEMENT() {
            if (globalelement == null) {
                globalelement = new ArrayList<REFERRABLESUBTYPESENUM>();
            }
            return this.globalelement;
        }

    }


    /**
     * <p>anonymous complex type? Java ??
     * 
     * <p>????????????????????
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="GLOBAL-IN-PACKAGE-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}AR-PACKAGE--SUBTYPES-ENUM" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "globalinpackageref"
    })
    public static class GLOBALINPACKAGEREFS {

        @XmlElement(name = "GLOBAL-IN-PACKAGE-REF")
        protected List<REFERENCEBASE.GLOBALINPACKAGEREFS.GLOBALINPACKAGEREF> globalinpackageref;

        /**
         * Gets the value of the globalinpackageref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the globalinpackageref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGLOBALINPACKAGEREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link REFERENCEBASE.GLOBALINPACKAGEREFS.GLOBALINPACKAGEREF }
         * 
         * 
         */
        public List<REFERENCEBASE.GLOBALINPACKAGEREFS.GLOBALINPACKAGEREF> getGLOBALINPACKAGEREF() {
            if (globalinpackageref == null) {
                globalinpackageref = new ArrayList<REFERENCEBASE.GLOBALINPACKAGEREFS.GLOBALINPACKAGEREF>();
            }
            return this.globalinpackageref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}AR-PACKAGE--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class GLOBALINPACKAGEREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected ARPACKAGESUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link ARPACKAGESUBTYPESENUM }
             *     
             */
            public ARPACKAGESUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link ARPACKAGESUBTYPESENUM }
             *     
             */
            public void setDEST(ARPACKAGESUBTYPESENUM value) {
                this.dest = value;
            }

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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}AR-PACKAGE--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PACKAGEREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected ARPACKAGESUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link ARPACKAGESUBTYPESENUM }
         *     
         */
        public ARPACKAGESUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link ARPACKAGESUBTYPESENUM }
         *     
         */
        public void setDEST(ARPACKAGESUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
