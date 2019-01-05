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
 * Resource estimations for RTE and BSW of a single ECU instance.
 * 
 * <p>ECU-RESOURCE-ESTIMATION complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="ECU-RESOURCE-ESTIMATION">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ECU-RESOURCE-ESTIMATION"/>
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
@XmlType(name = "ECU-RESOURCE-ESTIMATION", propOrder = {
    "introduction",
    "bswresourceestimation",
    "ecuinstanceref",
    "rteresourceestimation",
    "swcomptoecumappingrefs",
    "variationpoint"
})
public class ECURESOURCEESTIMATION {

    @XmlElement(name = "INTRODUCTION")
    protected DOCUMENTATIONBLOCK introduction;
    @XmlElement(name = "BSW-RESOURCE-ESTIMATION")
    protected RESOURCECONSUMPTION bswresourceestimation;
    @XmlElement(name = "ECU-INSTANCE-REF")
    protected ECURESOURCEESTIMATION.ECUINSTANCEREF ecuinstanceref;
    @XmlElement(name = "RTE-RESOURCE-ESTIMATION")
    protected RESOURCECONSUMPTION rteresourceestimation;
    @XmlElement(name = "SW-COMP-TO-ECU-MAPPING-REFS")
    protected ECURESOURCEESTIMATION.SWCOMPTOECUMAPPINGREFS swcomptoecumappingrefs;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??introduction?????
     * 
     * @return
     *     possible object is
     *     {@link DOCUMENTATIONBLOCK }
     *     
     */
    public DOCUMENTATIONBLOCK getINTRODUCTION() {
        return introduction;
    }

    /**
     * ??introduction?????
     * 
     * @param value
     *     allowed object is
     *     {@link DOCUMENTATIONBLOCK }
     *     
     */
    public void setINTRODUCTION(DOCUMENTATIONBLOCK value) {
        this.introduction = value;
    }

    /**
     * ??bswresourceestimation?????
     * 
     * @return
     *     possible object is
     *     {@link RESOURCECONSUMPTION }
     *     
     */
    public RESOURCECONSUMPTION getBSWRESOURCEESTIMATION() {
        return bswresourceestimation;
    }

    /**
     * ??bswresourceestimation?????
     * 
     * @param value
     *     allowed object is
     *     {@link RESOURCECONSUMPTION }
     *     
     */
    public void setBSWRESOURCEESTIMATION(RESOURCECONSUMPTION value) {
        this.bswresourceestimation = value;
    }

    /**
     * ??ecuinstanceref?????
     * 
     * @return
     *     possible object is
     *     {@link ECURESOURCEESTIMATION.ECUINSTANCEREF }
     *     
     */
    public ECURESOURCEESTIMATION.ECUINSTANCEREF getECUINSTANCEREF() {
        return ecuinstanceref;
    }

    /**
     * ??ecuinstanceref?????
     * 
     * @param value
     *     allowed object is
     *     {@link ECURESOURCEESTIMATION.ECUINSTANCEREF }
     *     
     */
    public void setECUINSTANCEREF(ECURESOURCEESTIMATION.ECUINSTANCEREF value) {
        this.ecuinstanceref = value;
    }

    /**
     * ??rteresourceestimation?????
     * 
     * @return
     *     possible object is
     *     {@link RESOURCECONSUMPTION }
     *     
     */
    public RESOURCECONSUMPTION getRTERESOURCEESTIMATION() {
        return rteresourceestimation;
    }

    /**
     * ??rteresourceestimation?????
     * 
     * @param value
     *     allowed object is
     *     {@link RESOURCECONSUMPTION }
     *     
     */
    public void setRTERESOURCEESTIMATION(RESOURCECONSUMPTION value) {
        this.rteresourceestimation = value;
    }

    /**
     * ??swcomptoecumappingrefs?????
     * 
     * @return
     *     possible object is
     *     {@link ECURESOURCEESTIMATION.SWCOMPTOECUMAPPINGREFS }
     *     
     */
    public ECURESOURCEESTIMATION.SWCOMPTOECUMAPPINGREFS getSWCOMPTOECUMAPPINGREFS() {
        return swcomptoecumappingrefs;
    }

    /**
     * ??swcomptoecumappingrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link ECURESOURCEESTIMATION.SWCOMPTOECUMAPPINGREFS }
     *     
     */
    public void setSWCOMPTOECUMAPPINGREFS(ECURESOURCEESTIMATION.SWCOMPTOECUMAPPINGREFS value) {
        this.swcomptoecumappingrefs = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}ECU-INSTANCE--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ECUINSTANCEREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected ECUINSTANCESUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link ECUINSTANCESUBTYPESENUM }
         *     
         */
        public ECUINSTANCESUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link ECUINSTANCESUBTYPESENUM }
         *     
         */
        public void setDEST(ECUINSTANCESUBTYPESENUM value) {
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
     *         &lt;element name="SW-COMP-TO-ECU-MAPPING-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}SWC-TO-ECU-MAPPING--SUBTYPES-ENUM" />
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
        "swcomptoecumappingref"
    })
    public static class SWCOMPTOECUMAPPINGREFS {

        @XmlElement(name = "SW-COMP-TO-ECU-MAPPING-REF")
        protected List<ECURESOURCEESTIMATION.SWCOMPTOECUMAPPINGREFS.SWCOMPTOECUMAPPINGREF> swcomptoecumappingref;

        /**
         * Gets the value of the swcomptoecumappingref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the swcomptoecumappingref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSWCOMPTOECUMAPPINGREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ECURESOURCEESTIMATION.SWCOMPTOECUMAPPINGREFS.SWCOMPTOECUMAPPINGREF }
         * 
         * 
         */
        public List<ECURESOURCEESTIMATION.SWCOMPTOECUMAPPINGREFS.SWCOMPTOECUMAPPINGREF> getSWCOMPTOECUMAPPINGREF() {
            if (swcomptoecumappingref == null) {
                swcomptoecumappingref = new ArrayList<ECURESOURCEESTIMATION.SWCOMPTOECUMAPPINGREFS.SWCOMPTOECUMAPPINGREF>();
            }
            return this.swcomptoecumappingref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}SWC-TO-ECU-MAPPING--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class SWCOMPTOECUMAPPINGREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected SWCTOECUMAPPINGSUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link SWCTOECUMAPPINGSUBTYPESENUM }
             *     
             */
            public SWCTOECUMAPPINGSUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link SWCTOECUMAPPINGSUBTYPESENUM }
             *     
             */
            public void setDEST(SWCTOECUMAPPINGSUBTYPESENUM value) {
                this.dest = value;
            }

        }

    }

}
