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
 * This denotes the method used by the RTE to handle the calibration data. It is published by the RTE generator and can be used e.g. to generate the corresponding emulation method in a Complex Driver.
 * 
 * According to the actual method given by the category attribute,  not all attributes are always needed:
 * 
 * * double pointered method: only baseReference is mandatory
 * * single pointered method: only referenceTable is mandatory
 * * initRam method: only elementGroup(s) are mandatory
 * 
 * Note: For single/double pointered method the group locations are implicitly accessed via the reference table and their location can be found from the initial values in the M1 model of the respective pointers. Therefore, the description of elementGroups is not needed in these cases.  Likewise, for double pointered method the reference table description can be accessed via the M1 model under baseReference.
 * 
 * <p>MC-SW-EMULATION-METHOD-SUPPORT complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="MC-SW-EMULATION-METHOD-SUPPORT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MC-SW-EMULATION-METHOD-SUPPORT"/>
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
@XmlType(name = "MC-SW-EMULATION-METHOD-SUPPORT", propOrder = {
    "shortlabel",
    "category",
    "basereferenceref",
    "elementgroups",
    "referencetableref",
    "variationpoint"
})
public class MCSWEMULATIONMETHODSUPPORT {

    @XmlElement(name = "SHORT-LABEL")
    protected IDENTIFIER shortlabel;
    @XmlElement(name = "CATEGORY")
    protected IDENTIFIER category;
    @XmlElement(name = "BASE-REFERENCE-REF")
    protected MCSWEMULATIONMETHODSUPPORT.BASEREFERENCEREF basereferenceref;
    @XmlElement(name = "ELEMENT-GROUPS")
    protected MCSWEMULATIONMETHODSUPPORT.ELEMENTGROUPS elementgroups;
    @XmlElement(name = "REFERENCE-TABLE-REF")
    protected MCSWEMULATIONMETHODSUPPORT.REFERENCETABLEREF referencetableref;
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
     * ??category?????
     * 
     * @return
     *     possible object is
     *     {@link IDENTIFIER }
     *     
     */
    public IDENTIFIER getCATEGORY() {
        return category;
    }

    /**
     * ??category?????
     * 
     * @param value
     *     allowed object is
     *     {@link IDENTIFIER }
     *     
     */
    public void setCATEGORY(IDENTIFIER value) {
        this.category = value;
    }

    /**
     * ??basereferenceref?????
     * 
     * @return
     *     possible object is
     *     {@link MCSWEMULATIONMETHODSUPPORT.BASEREFERENCEREF }
     *     
     */
    public MCSWEMULATIONMETHODSUPPORT.BASEREFERENCEREF getBASEREFERENCEREF() {
        return basereferenceref;
    }

    /**
     * ??basereferenceref?????
     * 
     * @param value
     *     allowed object is
     *     {@link MCSWEMULATIONMETHODSUPPORT.BASEREFERENCEREF }
     *     
     */
    public void setBASEREFERENCEREF(MCSWEMULATIONMETHODSUPPORT.BASEREFERENCEREF value) {
        this.basereferenceref = value;
    }

    /**
     * ??elementgroups?????
     * 
     * @return
     *     possible object is
     *     {@link MCSWEMULATIONMETHODSUPPORT.ELEMENTGROUPS }
     *     
     */
    public MCSWEMULATIONMETHODSUPPORT.ELEMENTGROUPS getELEMENTGROUPS() {
        return elementgroups;
    }

    /**
     * ??elementgroups?????
     * 
     * @param value
     *     allowed object is
     *     {@link MCSWEMULATIONMETHODSUPPORT.ELEMENTGROUPS }
     *     
     */
    public void setELEMENTGROUPS(MCSWEMULATIONMETHODSUPPORT.ELEMENTGROUPS value) {
        this.elementgroups = value;
    }

    /**
     * ??referencetableref?????
     * 
     * @return
     *     possible object is
     *     {@link MCSWEMULATIONMETHODSUPPORT.REFERENCETABLEREF }
     *     
     */
    public MCSWEMULATIONMETHODSUPPORT.REFERENCETABLEREF getREFERENCETABLEREF() {
        return referencetableref;
    }

    /**
     * ??referencetableref?????
     * 
     * @param value
     *     allowed object is
     *     {@link MCSWEMULATIONMETHODSUPPORT.REFERENCETABLEREF }
     *     
     */
    public void setREFERENCETABLEREF(MCSWEMULATIONMETHODSUPPORT.REFERENCETABLEREF value) {
        this.referencetableref = value;
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
    public static class BASEREFERENCEREF
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
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="MC-PARAMETER-ELEMENT-GROUP" type="{http://autosar.org/schema/r4.0}MC-PARAMETER-ELEMENT-GROUP"/>
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
        "mcparameterelementgroup"
    })
    public static class ELEMENTGROUPS {

        @XmlElement(name = "MC-PARAMETER-ELEMENT-GROUP")
        protected List<MCPARAMETERELEMENTGROUP> mcparameterelementgroup;

        /**
         * Gets the value of the mcparameterelementgroup property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mcparameterelementgroup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMCPARAMETERELEMENTGROUP().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MCPARAMETERELEMENTGROUP }
         * 
         * 
         */
        public List<MCPARAMETERELEMENTGROUP> getMCPARAMETERELEMENTGROUP() {
            if (mcparameterelementgroup == null) {
                mcparameterelementgroup = new ArrayList<MCPARAMETERELEMENTGROUP>();
            }
            return this.mcparameterelementgroup;
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
    public static class REFERENCETABLEREF
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

}
