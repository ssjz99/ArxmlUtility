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
 * Maps an SwcInternalBehavior to an BswInternalBehavior. This is required to coordinate the API generation and the scheduling for AUTOSAR Service Components, ECU Abstraction Components and Complex Driver Components by the RTE and the BSW scheduling mechanisms.
 * 
 * <p>SWC-BSW-MAPPING complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="SWC-BSW-MAPPING">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTILANGUAGE-REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}COLLECTABLE-ELEMENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}PACKAGEABLE-ELEMENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-ELEMENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ATP-CLASSIFIER"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ATP-FEATURE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ATP-STRUCTURE-ELEMENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}SWC-BSW-MAPPING"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SWC-BSW-MAPPING", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "variationpoint",
    "bswbehaviorref",
    "runnablemappings",
    "swcbehaviorref",
    "synchronizedmodegroups",
    "synchronizedtriggers"
})
public class SWCBSWMAPPING {

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
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlElement(name = "BSW-BEHAVIOR-REF")
    protected SWCBSWMAPPING.BSWBEHAVIORREF bswbehaviorref;
    @XmlElement(name = "RUNNABLE-MAPPINGS")
    protected SWCBSWMAPPING.RUNNABLEMAPPINGS runnablemappings;
    @XmlElement(name = "SWC-BEHAVIOR-REF")
    protected SWCBSWMAPPING.SWCBEHAVIORREF swcbehaviorref;
    @XmlElement(name = "SYNCHRONIZED-MODE-GROUPS")
    protected SWCBSWMAPPING.SYNCHRONIZEDMODEGROUPS synchronizedmodegroups;
    @XmlElement(name = "SYNCHRONIZED-TRIGGERS")
    protected SWCBSWMAPPING.SYNCHRONIZEDTRIGGERS synchronizedtriggers;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;
    @XmlAttribute(name = "UUID")
    protected String uuid;

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
     * ??bswbehaviorref?????
     * 
     * @return
     *     possible object is
     *     {@link SWCBSWMAPPING.BSWBEHAVIORREF }
     *     
     */
    public SWCBSWMAPPING.BSWBEHAVIORREF getBSWBEHAVIORREF() {
        return bswbehaviorref;
    }

    /**
     * ??bswbehaviorref?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWCBSWMAPPING.BSWBEHAVIORREF }
     *     
     */
    public void setBSWBEHAVIORREF(SWCBSWMAPPING.BSWBEHAVIORREF value) {
        this.bswbehaviorref = value;
    }

    /**
     * ??runnablemappings?????
     * 
     * @return
     *     possible object is
     *     {@link SWCBSWMAPPING.RUNNABLEMAPPINGS }
     *     
     */
    public SWCBSWMAPPING.RUNNABLEMAPPINGS getRUNNABLEMAPPINGS() {
        return runnablemappings;
    }

    /**
     * ??runnablemappings?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWCBSWMAPPING.RUNNABLEMAPPINGS }
     *     
     */
    public void setRUNNABLEMAPPINGS(SWCBSWMAPPING.RUNNABLEMAPPINGS value) {
        this.runnablemappings = value;
    }

    /**
     * ??swcbehaviorref?????
     * 
     * @return
     *     possible object is
     *     {@link SWCBSWMAPPING.SWCBEHAVIORREF }
     *     
     */
    public SWCBSWMAPPING.SWCBEHAVIORREF getSWCBEHAVIORREF() {
        return swcbehaviorref;
    }

    /**
     * ??swcbehaviorref?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWCBSWMAPPING.SWCBEHAVIORREF }
     *     
     */
    public void setSWCBEHAVIORREF(SWCBSWMAPPING.SWCBEHAVIORREF value) {
        this.swcbehaviorref = value;
    }

    /**
     * ??synchronizedmodegroups?????
     * 
     * @return
     *     possible object is
     *     {@link SWCBSWMAPPING.SYNCHRONIZEDMODEGROUPS }
     *     
     */
    public SWCBSWMAPPING.SYNCHRONIZEDMODEGROUPS getSYNCHRONIZEDMODEGROUPS() {
        return synchronizedmodegroups;
    }

    /**
     * ??synchronizedmodegroups?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWCBSWMAPPING.SYNCHRONIZEDMODEGROUPS }
     *     
     */
    public void setSYNCHRONIZEDMODEGROUPS(SWCBSWMAPPING.SYNCHRONIZEDMODEGROUPS value) {
        this.synchronizedmodegroups = value;
    }

    /**
     * ??synchronizedtriggers?????
     * 
     * @return
     *     possible object is
     *     {@link SWCBSWMAPPING.SYNCHRONIZEDTRIGGERS }
     *     
     */
    public SWCBSWMAPPING.SYNCHRONIZEDTRIGGERS getSYNCHRONIZEDTRIGGERS() {
        return synchronizedtriggers;
    }

    /**
     * ??synchronizedtriggers?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWCBSWMAPPING.SYNCHRONIZEDTRIGGERS }
     *     
     */
    public void setSYNCHRONIZEDTRIGGERS(SWCBSWMAPPING.SYNCHRONIZEDTRIGGERS value) {
        this.synchronizedtriggers = value;
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
     * <p>anonymous complex type? Java ??
     * 
     * <p>????????????????????
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}BSW-INTERNAL-BEHAVIOR--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class BSWBEHAVIORREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected BSWINTERNALBEHAVIORSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link BSWINTERNALBEHAVIORSUBTYPESENUM }
         *     
         */
        public BSWINTERNALBEHAVIORSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link BSWINTERNALBEHAVIORSUBTYPESENUM }
         *     
         */
        public void setDEST(BSWINTERNALBEHAVIORSUBTYPESENUM value) {
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
     *         &lt;element name="SWC-BSW-RUNNABLE-MAPPING" type="{http://autosar.org/schema/r4.0}SWC-BSW-RUNNABLE-MAPPING"/>
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
        "swcbswrunnablemapping"
    })
    public static class RUNNABLEMAPPINGS {

        @XmlElement(name = "SWC-BSW-RUNNABLE-MAPPING")
        protected List<SWCBSWRUNNABLEMAPPING> swcbswrunnablemapping;

        /**
         * Gets the value of the swcbswrunnablemapping property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the swcbswrunnablemapping property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSWCBSWRUNNABLEMAPPING().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SWCBSWRUNNABLEMAPPING }
         * 
         * 
         */
        public List<SWCBSWRUNNABLEMAPPING> getSWCBSWRUNNABLEMAPPING() {
            if (swcbswrunnablemapping == null) {
                swcbswrunnablemapping = new ArrayList<SWCBSWRUNNABLEMAPPING>();
            }
            return this.swcbswrunnablemapping;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}SWC-INTERNAL-BEHAVIOR--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SWCBEHAVIORREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected SWCINTERNALBEHAVIORSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link SWCINTERNALBEHAVIORSUBTYPESENUM }
         *     
         */
        public SWCINTERNALBEHAVIORSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link SWCINTERNALBEHAVIORSUBTYPESENUM }
         *     
         */
        public void setDEST(SWCINTERNALBEHAVIORSUBTYPESENUM value) {
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
     *         &lt;element name="SWC-BSW-SYNCHRONIZED-MODE-GROUP-PROTOTYPE" type="{http://autosar.org/schema/r4.0}SWC-BSW-SYNCHRONIZED-MODE-GROUP-PROTOTYPE"/>
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
        "swcbswsynchronizedmodegroupprototype"
    })
    public static class SYNCHRONIZEDMODEGROUPS {

        @XmlElement(name = "SWC-BSW-SYNCHRONIZED-MODE-GROUP-PROTOTYPE")
        protected List<SWCBSWSYNCHRONIZEDMODEGROUPPROTOTYPE> swcbswsynchronizedmodegroupprototype;

        /**
         * Gets the value of the swcbswsynchronizedmodegroupprototype property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the swcbswsynchronizedmodegroupprototype property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSWCBSWSYNCHRONIZEDMODEGROUPPROTOTYPE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SWCBSWSYNCHRONIZEDMODEGROUPPROTOTYPE }
         * 
         * 
         */
        public List<SWCBSWSYNCHRONIZEDMODEGROUPPROTOTYPE> getSWCBSWSYNCHRONIZEDMODEGROUPPROTOTYPE() {
            if (swcbswsynchronizedmodegroupprototype == null) {
                swcbswsynchronizedmodegroupprototype = new ArrayList<SWCBSWSYNCHRONIZEDMODEGROUPPROTOTYPE>();
            }
            return this.swcbswsynchronizedmodegroupprototype;
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
     *         &lt;element name="SWC-BSW-SYNCHRONIZED-TRIGGER" type="{http://autosar.org/schema/r4.0}SWC-BSW-SYNCHRONIZED-TRIGGER"/>
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
        "swcbswsynchronizedtrigger"
    })
    public static class SYNCHRONIZEDTRIGGERS {

        @XmlElement(name = "SWC-BSW-SYNCHRONIZED-TRIGGER")
        protected List<SWCBSWSYNCHRONIZEDTRIGGER> swcbswsynchronizedtrigger;

        /**
         * Gets the value of the swcbswsynchronizedtrigger property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the swcbswsynchronizedtrigger property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSWCBSWSYNCHRONIZEDTRIGGER().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SWCBSWSYNCHRONIZEDTRIGGER }
         * 
         * 
         */
        public List<SWCBSWSYNCHRONIZEDTRIGGER> getSWCBSWSYNCHRONIZEDTRIGGER() {
            if (swcbswsynchronizedtrigger == null) {
                swcbswsynchronizedtrigger = new ArrayList<SWCBSWSYNCHRONIZEDTRIGGER>();
            }
            return this.swcbswsynchronizedtrigger;
        }

    }

}
