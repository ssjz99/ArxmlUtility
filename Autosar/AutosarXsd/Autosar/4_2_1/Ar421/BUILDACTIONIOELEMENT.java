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
 * This meta-class represents the ability to specify the input/output entities of a BuildAction.
 * 
 * <p>BUILD-ACTION-IO-ELEMENT complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="BUILD-ACTION-IO-ELEMENT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}BUILD-ACTION-IO-ELEMENT"/>
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
@XmlType(name = "BUILD-ACTION-IO-ELEMENT", propOrder = {
    "category",
    "sdgs",
    "ecucdefinitionref",
    "engineeringobject",
    "foreignmodelreference",
    "modelobjectreference",
    "role"
})
public class BUILDACTIONIOELEMENT {

    @XmlElement(name = "CATEGORY")
    protected NMTOKENSTRING category;
    @XmlElement(name = "SDGS")
    protected BUILDACTIONIOELEMENT.SDGS sdgs;
    @XmlElement(name = "ECUC-DEFINITION-REF")
    protected BUILDACTIONIOELEMENT.ECUCDEFINITIONREF ecucdefinitionref;
    @XmlElement(name = "ENGINEERING-OBJECT")
    protected BUILDENGINEERINGOBJECT engineeringobject;
    @XmlElement(name = "FOREIGN-MODEL-REFERENCE")
    protected FOREIGNMODELREFERENCE foreignmodelreference;
    @XmlElement(name = "MODEL-OBJECT-REFERENCE")
    protected GENERICMODELREFERENCE modelobjectreference;
    @XmlElement(name = "ROLE")
    protected IDENTIFIER role;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??category?????
     * 
     * @return
     *     possible object is
     *     {@link NMTOKENSTRING }
     *     
     */
    public NMTOKENSTRING getCATEGORY() {
        return category;
    }

    /**
     * ??category?????
     * 
     * @param value
     *     allowed object is
     *     {@link NMTOKENSTRING }
     *     
     */
    public void setCATEGORY(NMTOKENSTRING value) {
        this.category = value;
    }

    /**
     * ??sdgs?????
     * 
     * @return
     *     possible object is
     *     {@link BUILDACTIONIOELEMENT.SDGS }
     *     
     */
    public BUILDACTIONIOELEMENT.SDGS getSDGS() {
        return sdgs;
    }

    /**
     * ??sdgs?????
     * 
     * @param value
     *     allowed object is
     *     {@link BUILDACTIONIOELEMENT.SDGS }
     *     
     */
    public void setSDGS(BUILDACTIONIOELEMENT.SDGS value) {
        this.sdgs = value;
    }

    /**
     * ??ecucdefinitionref?????
     * 
     * @return
     *     possible object is
     *     {@link BUILDACTIONIOELEMENT.ECUCDEFINITIONREF }
     *     
     */
    public BUILDACTIONIOELEMENT.ECUCDEFINITIONREF getECUCDEFINITIONREF() {
        return ecucdefinitionref;
    }

    /**
     * ??ecucdefinitionref?????
     * 
     * @param value
     *     allowed object is
     *     {@link BUILDACTIONIOELEMENT.ECUCDEFINITIONREF }
     *     
     */
    public void setECUCDEFINITIONREF(BUILDACTIONIOELEMENT.ECUCDEFINITIONREF value) {
        this.ecucdefinitionref = value;
    }

    /**
     * ??engineeringobject?????
     * 
     * @return
     *     possible object is
     *     {@link BUILDENGINEERINGOBJECT }
     *     
     */
    public BUILDENGINEERINGOBJECT getENGINEERINGOBJECT() {
        return engineeringobject;
    }

    /**
     * ??engineeringobject?????
     * 
     * @param value
     *     allowed object is
     *     {@link BUILDENGINEERINGOBJECT }
     *     
     */
    public void setENGINEERINGOBJECT(BUILDENGINEERINGOBJECT value) {
        this.engineeringobject = value;
    }

    /**
     * ??foreignmodelreference?????
     * 
     * @return
     *     possible object is
     *     {@link FOREIGNMODELREFERENCE }
     *     
     */
    public FOREIGNMODELREFERENCE getFOREIGNMODELREFERENCE() {
        return foreignmodelreference;
    }

    /**
     * ??foreignmodelreference?????
     * 
     * @param value
     *     allowed object is
     *     {@link FOREIGNMODELREFERENCE }
     *     
     */
    public void setFOREIGNMODELREFERENCE(FOREIGNMODELREFERENCE value) {
        this.foreignmodelreference = value;
    }

    /**
     * ??modelobjectreference?????
     * 
     * @return
     *     possible object is
     *     {@link GENERICMODELREFERENCE }
     *     
     */
    public GENERICMODELREFERENCE getMODELOBJECTREFERENCE() {
        return modelobjectreference;
    }

    /**
     * ??modelobjectreference?????
     * 
     * @param value
     *     allowed object is
     *     {@link GENERICMODELREFERENCE }
     *     
     */
    public void setMODELOBJECTREFERENCE(GENERICMODELREFERENCE value) {
        this.modelobjectreference = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}ECUC-DEFINITION-ELEMENT--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ECUCDEFINITIONREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected ECUCDEFINITIONELEMENTSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link ECUCDEFINITIONELEMENTSUBTYPESENUM }
         *     
         */
        public ECUCDEFINITIONELEMENTSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link ECUCDEFINITIONELEMENTSUBTYPESENUM }
         *     
         */
        public void setDEST(ECUCDEFINITIONELEMENTSUBTYPESENUM value) {
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
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="SDG" type="{http://autosar.org/schema/r4.0}SDG"/>
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
        "sdg"
    })
    public static class SDGS {

        @XmlElement(name = "SDG")
        protected List<SDG> sdg;

        /**
         * Gets the value of the sdg property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the sdg property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSDG().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SDG }
         * 
         * 
         */
        public List<SDG> getSDG() {
            if (sdg == null) {
                sdg = new ArrayList<SDG>();
            }
            return this.sdg;
        }

    }

}
