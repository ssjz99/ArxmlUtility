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
 * The System Constraint Description has to describe dedicated and exclusive mapping of SW-Cs to one or more ECUs. Dedicated mapping means that the SW-C can only be mapped to the ECUs it is dedicated to. Exclusive Mapping means that the SW-C cannot be mapped to the ECUs it is excluded from.
 * 
 * <p>SWC-TO-ECU-MAPPING-CONSTRAINT complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="SWC-TO-ECU-MAPPING-CONSTRAINT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MAPPING-CONSTRAINT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}SWC-TO-ECU-MAPPING-CONSTRAINT"/>
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
@XmlType(name = "SWC-TO-ECU-MAPPING-CONSTRAINT", propOrder = {
    "introduction",
    "variationpoint",
    "componentiref",
    "ecuinstancerefs",
    "swctoecumappingconstrainttype"
})
public class SWCTOECUMAPPINGCONSTRAINT {

    @XmlElement(name = "INTRODUCTION")
    protected DOCUMENTATIONBLOCK introduction;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlElement(name = "COMPONENT-IREF")
    protected COMPONENTINSYSTEMINSTANCEREF componentiref;
    @XmlElement(name = "ECU-INSTANCE-REFS")
    protected SWCTOECUMAPPINGCONSTRAINT.ECUINSTANCEREFS ecuinstancerefs;
    @XmlElement(name = "SWC-TO-ECU-MAPPING-CONSTRAINT-TYPE")
    protected SWCTOECUMAPPINGCONSTRAINTTYPE swctoecumappingconstrainttype;
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
     * ??componentiref?????
     * 
     * @return
     *     possible object is
     *     {@link COMPONENTINSYSTEMINSTANCEREF }
     *     
     */
    public COMPONENTINSYSTEMINSTANCEREF getCOMPONENTIREF() {
        return componentiref;
    }

    /**
     * ??componentiref?????
     * 
     * @param value
     *     allowed object is
     *     {@link COMPONENTINSYSTEMINSTANCEREF }
     *     
     */
    public void setCOMPONENTIREF(COMPONENTINSYSTEMINSTANCEREF value) {
        this.componentiref = value;
    }

    /**
     * ??ecuinstancerefs?????
     * 
     * @return
     *     possible object is
     *     {@link SWCTOECUMAPPINGCONSTRAINT.ECUINSTANCEREFS }
     *     
     */
    public SWCTOECUMAPPINGCONSTRAINT.ECUINSTANCEREFS getECUINSTANCEREFS() {
        return ecuinstancerefs;
    }

    /**
     * ??ecuinstancerefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWCTOECUMAPPINGCONSTRAINT.ECUINSTANCEREFS }
     *     
     */
    public void setECUINSTANCEREFS(SWCTOECUMAPPINGCONSTRAINT.ECUINSTANCEREFS value) {
        this.ecuinstancerefs = value;
    }

    /**
     * ??swctoecumappingconstrainttype?????
     * 
     * @return
     *     possible object is
     *     {@link SWCTOECUMAPPINGCONSTRAINTTYPE }
     *     
     */
    public SWCTOECUMAPPINGCONSTRAINTTYPE getSWCTOECUMAPPINGCONSTRAINTTYPE() {
        return swctoecumappingconstrainttype;
    }

    /**
     * ??swctoecumappingconstrainttype?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWCTOECUMAPPINGCONSTRAINTTYPE }
     *     
     */
    public void setSWCTOECUMAPPINGCONSTRAINTTYPE(SWCTOECUMAPPINGCONSTRAINTTYPE value) {
        this.swctoecumappingconstrainttype = value;
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
     *         &lt;element name="ECU-INSTANCE-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}ECU-INSTANCE--SUBTYPES-ENUM" />
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
        "ecuinstanceref"
    })
    public static class ECUINSTANCEREFS {

        @XmlElement(name = "ECU-INSTANCE-REF")
        protected List<SWCTOECUMAPPINGCONSTRAINT.ECUINSTANCEREFS.ECUINSTANCEREF> ecuinstanceref;

        /**
         * Gets the value of the ecuinstanceref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ecuinstanceref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getECUINSTANCEREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SWCTOECUMAPPINGCONSTRAINT.ECUINSTANCEREFS.ECUINSTANCEREF }
         * 
         * 
         */
        public List<SWCTOECUMAPPINGCONSTRAINT.ECUINSTANCEREFS.ECUINSTANCEREF> getECUINSTANCEREF() {
            if (ecuinstanceref == null) {
                ecuinstanceref = new ArrayList<SWCTOECUMAPPINGCONSTRAINT.ECUINSTANCEREFS.ECUINSTANCEREF>();
            }
            return this.ecuinstanceref;
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

    }

}
