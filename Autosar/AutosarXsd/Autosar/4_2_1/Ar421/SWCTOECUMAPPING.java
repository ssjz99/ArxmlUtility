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
 * Map software components to a specific ECU Instance and optionally to a processing unit and to an EcuPartition. For each combination of ECUInstance and the optional ProcessingUnit and the optional EcuPartition and the optional SensorActuator only one SwcToEcuMapping shall be used.
 * 
 * <p>SWC-TO-ECU-MAPPING complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="SWC-TO-ECU-MAPPING">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTILANGUAGE-REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}SWC-TO-ECU-MAPPING"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SWC-TO-ECU-MAPPING", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "componentirefs",
    "controlledhwelementref",
    "ecuinstanceref",
    "partitionref",
    "processingunitref",
    "variationpoint"
})
public class SWCTOECUMAPPING {

    @XmlElement(name = "SHORT-NAME", required = true)
    protected IDENTIFIER shortname;
    @XmlElement(name = "LONG-NAME")
    protected MULTILANGUAGELONGNAME longname;
    @XmlElement(name = "DESC")
    protected MULTILANGUAGEOVERVIEWPARAGRAPH desc;
    @XmlElement(name = "CATEGORY")
    protected CATEGORYSTRING category;
    @XmlElement(name = "ADMIN-DATA")
    protected ADMINDATA admindata;
    @XmlElement(name = "INTRODUCTION")
    protected DOCUMENTATIONBLOCK introduction;
    @XmlElement(name = "ANNOTATIONS")
    protected Ar421.LINKER.ANNOTATIONS annotations;
    @XmlElement(name = "COMPONENT-IREFS")
    protected SWCTOECUMAPPING.COMPONENTIREFS componentirefs;
    @XmlElement(name = "CONTROLLED-HW-ELEMENT-REF")
    protected SWCTOECUMAPPING.CONTROLLEDHWELEMENTREF controlledhwelementref;
    @XmlElement(name = "ECU-INSTANCE-REF")
    protected SWCTOECUMAPPING.ECUINSTANCEREF ecuinstanceref;
    @XmlElement(name = "PARTITION-REF")
    protected SWCTOECUMAPPING.PARTITIONREF partitionref;
    @XmlElement(name = "PROCESSING-UNIT-REF")
    protected SWCTOECUMAPPING.PROCESSINGUNITREF processingunitref;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlAttribute(name = "UUID")
    protected String uuid;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??shortname?????
     * 
     * @return
     *     possible object is
     *     {@link IDENTIFIER }
     *     
     */
    public IDENTIFIER getSHORTNAME() {
        return shortname;
    }

    /**
     * ??shortname?????
     * 
     * @param value
     *     allowed object is
     *     {@link IDENTIFIER }
     *     
     */
    public void setSHORTNAME(IDENTIFIER value) {
        this.shortname = value;
    }

    /**
     * ??longname?????
     * 
     * @return
     *     possible object is
     *     {@link MULTILANGUAGELONGNAME }
     *     
     */
    public MULTILANGUAGELONGNAME getLONGNAME() {
        return longname;
    }

    /**
     * ??longname?????
     * 
     * @param value
     *     allowed object is
     *     {@link MULTILANGUAGELONGNAME }
     *     
     */
    public void setLONGNAME(MULTILANGUAGELONGNAME value) {
        this.longname = value;
    }

    /**
     * ??desc?????
     * 
     * @return
     *     possible object is
     *     {@link MULTILANGUAGEOVERVIEWPARAGRAPH }
     *     
     */
    public MULTILANGUAGEOVERVIEWPARAGRAPH getDESC() {
        return desc;
    }

    /**
     * ??desc?????
     * 
     * @param value
     *     allowed object is
     *     {@link MULTILANGUAGEOVERVIEWPARAGRAPH }
     *     
     */
    public void setDESC(MULTILANGUAGEOVERVIEWPARAGRAPH value) {
        this.desc = value;
    }

    /**
     * ??category?????
     * 
     * @return
     *     possible object is
     *     {@link CATEGORYSTRING }
     *     
     */
    public CATEGORYSTRING getCATEGORY() {
        return category;
    }

    /**
     * ??category?????
     * 
     * @param value
     *     allowed object is
     *     {@link CATEGORYSTRING }
     *     
     */
    public void setCATEGORY(CATEGORYSTRING value) {
        this.category = value;
    }

    /**
     * ??admindata?????
     * 
     * @return
     *     possible object is
     *     {@link ADMINDATA }
     *     
     */
    public ADMINDATA getADMINDATA() {
        return admindata;
    }

    /**
     * ??admindata?????
     * 
     * @param value
     *     allowed object is
     *     {@link ADMINDATA }
     *     
     */
    public void setADMINDATA(ADMINDATA value) {
        this.admindata = value;
    }

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
     * ??annotations?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.LINKER.ANNOTATIONS }
     *     
     */
    public Ar421.LINKER.ANNOTATIONS getANNOTATIONS() {
        return annotations;
    }

    /**
     * ??annotations?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.LINKER.ANNOTATIONS }
     *     
     */
    public void setANNOTATIONS(Ar421.LINKER.ANNOTATIONS value) {
        this.annotations = value;
    }

    /**
     * ??componentirefs?????
     * 
     * @return
     *     possible object is
     *     {@link SWCTOECUMAPPING.COMPONENTIREFS }
     *     
     */
    public SWCTOECUMAPPING.COMPONENTIREFS getCOMPONENTIREFS() {
        return componentirefs;
    }

    /**
     * ??componentirefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWCTOECUMAPPING.COMPONENTIREFS }
     *     
     */
    public void setCOMPONENTIREFS(SWCTOECUMAPPING.COMPONENTIREFS value) {
        this.componentirefs = value;
    }

    /**
     * ??controlledhwelementref?????
     * 
     * @return
     *     possible object is
     *     {@link SWCTOECUMAPPING.CONTROLLEDHWELEMENTREF }
     *     
     */
    public SWCTOECUMAPPING.CONTROLLEDHWELEMENTREF getCONTROLLEDHWELEMENTREF() {
        return controlledhwelementref;
    }

    /**
     * ??controlledhwelementref?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWCTOECUMAPPING.CONTROLLEDHWELEMENTREF }
     *     
     */
    public void setCONTROLLEDHWELEMENTREF(SWCTOECUMAPPING.CONTROLLEDHWELEMENTREF value) {
        this.controlledhwelementref = value;
    }

    /**
     * ??ecuinstanceref?????
     * 
     * @return
     *     possible object is
     *     {@link SWCTOECUMAPPING.ECUINSTANCEREF }
     *     
     */
    public SWCTOECUMAPPING.ECUINSTANCEREF getECUINSTANCEREF() {
        return ecuinstanceref;
    }

    /**
     * ??ecuinstanceref?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWCTOECUMAPPING.ECUINSTANCEREF }
     *     
     */
    public void setECUINSTANCEREF(SWCTOECUMAPPING.ECUINSTANCEREF value) {
        this.ecuinstanceref = value;
    }

    /**
     * ??partitionref?????
     * 
     * @return
     *     possible object is
     *     {@link SWCTOECUMAPPING.PARTITIONREF }
     *     
     */
    public SWCTOECUMAPPING.PARTITIONREF getPARTITIONREF() {
        return partitionref;
    }

    /**
     * ??partitionref?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWCTOECUMAPPING.PARTITIONREF }
     *     
     */
    public void setPARTITIONREF(SWCTOECUMAPPING.PARTITIONREF value) {
        this.partitionref = value;
    }

    /**
     * ??processingunitref?????
     * 
     * @return
     *     possible object is
     *     {@link SWCTOECUMAPPING.PROCESSINGUNITREF }
     *     
     */
    public SWCTOECUMAPPING.PROCESSINGUNITREF getPROCESSINGUNITREF() {
        return processingunitref;
    }

    /**
     * ??processingunitref?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWCTOECUMAPPING.PROCESSINGUNITREF }
     *     
     */
    public void setPROCESSINGUNITREF(SWCTOECUMAPPING.PROCESSINGUNITREF value) {
        this.processingunitref = value;
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
     * ??uuid?????
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUUID() {
        return uuid;
    }

    /**
     * ??uuid?????
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUUID(String value) {
        this.uuid = value;
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
     *         &lt;element name="COMPONENT-IREF" type="{http://autosar.org/schema/r4.0}COMPONENT-IN-SYSTEM-INSTANCE-REF"/>
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
        "componentiref"
    })
    public static class COMPONENTIREFS {

        @XmlElement(name = "COMPONENT-IREF")
        protected List<COMPONENTINSYSTEMINSTANCEREF> componentiref;

        /**
         * Gets the value of the componentiref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the componentiref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCOMPONENTIREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link COMPONENTINSYSTEMINSTANCEREF }
         * 
         * 
         */
        public List<COMPONENTINSYSTEMINSTANCEREF> getCOMPONENTIREF() {
            if (componentiref == null) {
                componentiref = new ArrayList<COMPONENTINSYSTEMINSTANCEREF>();
            }
            return this.componentiref;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}HW-ELEMENT--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CONTROLLEDHWELEMENTREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected HWELEMENTSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link HWELEMENTSUBTYPESENUM }
         *     
         */
        public HWELEMENTSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link HWELEMENTSUBTYPESENUM }
         *     
         */
        public void setDEST(HWELEMENTSUBTYPESENUM value) {
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
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}ECU-PARTITION--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PARTITIONREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected ECUPARTITIONSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link ECUPARTITIONSUBTYPESENUM }
         *     
         */
        public ECUPARTITIONSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link ECUPARTITIONSUBTYPESENUM }
         *     
         */
        public void setDEST(ECUPARTITIONSUBTYPESENUM value) {
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}HW-ELEMENT--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PROCESSINGUNITREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected HWELEMENTSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link HWELEMENTSUBTYPESENUM }
         *     
         */
        public HWELEMENTSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link HWELEMENTSUBTYPESENUM }
         *     
         */
        public void setDEST(HWELEMENTSUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
