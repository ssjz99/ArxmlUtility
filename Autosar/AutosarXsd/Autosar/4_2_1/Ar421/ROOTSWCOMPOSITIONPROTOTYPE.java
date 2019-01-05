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
 * The RootSwCompositionPrototype represents the top-level-composition of software components within a given System. According to the use case of the System, this may for example be the a more or less complete VFB description, the software of a System Extract or the software of a flat ECU Extract with only atomic SWCs. 
 * 
 * Therefore the RootSwComposition will only occasionally contain all atomic software components that are used in a complete VFB System. The OEM is primarily interested in the required functionality and the interfaces defining the integration of the Software Component into the System. The internal structure of such a component contains often substantial intellectual property of a supplier. Therefore a top-level software composition will often contain empty compositions which represent subsystems. 
 * 
 * The contained SwComponentPrototypes are fully specified by their SwComponentTypes (including PortPrototypes, PortInterfaces, VariableDataPrototypes, SwcInternalBehavior etc.), and their ports are interconnected using SwConnectorPrototypes.
 * 
 * <p>ROOT-SW-COMPOSITION-PROTOTYPE complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="ROOT-SW-COMPOSITION-PROTOTYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTILANGUAGE-REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ATP-FEATURE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ATP-PROTOTYPE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ROOT-SW-COMPOSITION-PROTOTYPE"/>
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
@XmlType(name = "ROOT-SW-COMPOSITION-PROTOTYPE", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "calibrationparametervaluesetrefs",
    "flatmapref",
    "softwarecompositiontref",
    "variationpoint"
})
public class ROOTSWCOMPOSITIONPROTOTYPE {

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
    @XmlElement(name = "CALIBRATION-PARAMETER-VALUE-SET-REFS")
    protected ROOTSWCOMPOSITIONPROTOTYPE.CALIBRATIONPARAMETERVALUESETREFS calibrationparametervaluesetrefs;
    @XmlElement(name = "FLAT-MAP-REF")
    protected ROOTSWCOMPOSITIONPROTOTYPE.FLATMAPREF flatmapref;
    @XmlElement(name = "SOFTWARE-COMPOSITION-TREF")
    protected ROOTSWCOMPOSITIONPROTOTYPE.SOFTWARECOMPOSITIONTREF softwarecompositiontref;
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
     * ??calibrationparametervaluesetrefs?????
     * 
     * @return
     *     possible object is
     *     {@link ROOTSWCOMPOSITIONPROTOTYPE.CALIBRATIONPARAMETERVALUESETREFS }
     *     
     */
    public ROOTSWCOMPOSITIONPROTOTYPE.CALIBRATIONPARAMETERVALUESETREFS getCALIBRATIONPARAMETERVALUESETREFS() {
        return calibrationparametervaluesetrefs;
    }

    /**
     * ??calibrationparametervaluesetrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link ROOTSWCOMPOSITIONPROTOTYPE.CALIBRATIONPARAMETERVALUESETREFS }
     *     
     */
    public void setCALIBRATIONPARAMETERVALUESETREFS(ROOTSWCOMPOSITIONPROTOTYPE.CALIBRATIONPARAMETERVALUESETREFS value) {
        this.calibrationparametervaluesetrefs = value;
    }

    /**
     * ??flatmapref?????
     * 
     * @return
     *     possible object is
     *     {@link ROOTSWCOMPOSITIONPROTOTYPE.FLATMAPREF }
     *     
     */
    public ROOTSWCOMPOSITIONPROTOTYPE.FLATMAPREF getFLATMAPREF() {
        return flatmapref;
    }

    /**
     * ??flatmapref?????
     * 
     * @param value
     *     allowed object is
     *     {@link ROOTSWCOMPOSITIONPROTOTYPE.FLATMAPREF }
     *     
     */
    public void setFLATMAPREF(ROOTSWCOMPOSITIONPROTOTYPE.FLATMAPREF value) {
        this.flatmapref = value;
    }

    /**
     * ??softwarecompositiontref?????
     * 
     * @return
     *     possible object is
     *     {@link ROOTSWCOMPOSITIONPROTOTYPE.SOFTWARECOMPOSITIONTREF }
     *     
     */
    public ROOTSWCOMPOSITIONPROTOTYPE.SOFTWARECOMPOSITIONTREF getSOFTWARECOMPOSITIONTREF() {
        return softwarecompositiontref;
    }

    /**
     * ??softwarecompositiontref?????
     * 
     * @param value
     *     allowed object is
     *     {@link ROOTSWCOMPOSITIONPROTOTYPE.SOFTWARECOMPOSITIONTREF }
     *     
     */
    public void setSOFTWARECOMPOSITIONTREF(ROOTSWCOMPOSITIONPROTOTYPE.SOFTWARECOMPOSITIONTREF value) {
        this.softwarecompositiontref = value;
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
     *         &lt;element name="CALIBRATION-PARAMETER-VALUE-SET-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}CALIBRATION-PARAMETER-VALUE-SET--SUBTYPES-ENUM" />
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
        "calibrationparametervaluesetref"
    })
    public static class CALIBRATIONPARAMETERVALUESETREFS {

        @XmlElement(name = "CALIBRATION-PARAMETER-VALUE-SET-REF")
        protected List<ROOTSWCOMPOSITIONPROTOTYPE.CALIBRATIONPARAMETERVALUESETREFS.CALIBRATIONPARAMETERVALUESETREF> calibrationparametervaluesetref;

        /**
         * Gets the value of the calibrationparametervaluesetref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the calibrationparametervaluesetref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCALIBRATIONPARAMETERVALUESETREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ROOTSWCOMPOSITIONPROTOTYPE.CALIBRATIONPARAMETERVALUESETREFS.CALIBRATIONPARAMETERVALUESETREF }
         * 
         * 
         */
        public List<ROOTSWCOMPOSITIONPROTOTYPE.CALIBRATIONPARAMETERVALUESETREFS.CALIBRATIONPARAMETERVALUESETREF> getCALIBRATIONPARAMETERVALUESETREF() {
            if (calibrationparametervaluesetref == null) {
                calibrationparametervaluesetref = new ArrayList<ROOTSWCOMPOSITIONPROTOTYPE.CALIBRATIONPARAMETERVALUESETREFS.CALIBRATIONPARAMETERVALUESETREF>();
            }
            return this.calibrationparametervaluesetref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}CALIBRATION-PARAMETER-VALUE-SET--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class CALIBRATIONPARAMETERVALUESETREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected CALIBRATIONPARAMETERVALUESETSUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link CALIBRATIONPARAMETERVALUESETSUBTYPESENUM }
             *     
             */
            public CALIBRATIONPARAMETERVALUESETSUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link CALIBRATIONPARAMETERVALUESETSUBTYPESENUM }
             *     
             */
            public void setDEST(CALIBRATIONPARAMETERVALUESETSUBTYPESENUM value) {
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}FLAT-MAP--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class FLATMAPREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected FLATMAPSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link FLATMAPSUBTYPESENUM }
         *     
         */
        public FLATMAPSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link FLATMAPSUBTYPESENUM }
         *     
         */
        public void setDEST(FLATMAPSUBTYPESENUM value) {
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}COMPOSITION-SW-COMPONENT-TYPE--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SOFTWARECOMPOSITIONTREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected COMPOSITIONSWCOMPONENTTYPESUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link COMPOSITIONSWCOMPONENTTYPESUBTYPESENUM }
         *     
         */
        public COMPOSITIONSWCOMPONENTTYPESUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link COMPOSITIONSWCOMPONENTTYPESUBTYPESENUM }
         *     
         */
        public void setDEST(COMPOSITIONSWCOMPONENTTYPESUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
