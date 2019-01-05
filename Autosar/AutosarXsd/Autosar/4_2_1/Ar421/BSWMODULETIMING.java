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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * A model element used to define timing descriptions and constraints for the BswInternalBehavior of one BSW Module. Thereby, for each BswInternalBehavior a separate timing can be specified.
 * 
 * A constraint defined at this level holds true for all Implementations of that BswInternalBehavior.
 * 
 * TimingDescriptions aggregated by BswModuleTiming are restricted to event chains referring to events which are derived from the class TDEventBswInternalBehavior.
 * 
 * <p>BSW-MODULE-TIMING complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="BSW-MODULE-TIMING">
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
 *         &lt;group ref="{http://autosar.org/schema/r4.0}TIMING-EXTENSION"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}BSW-MODULE-TIMING"/>
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
@XmlType(name = "BSW-MODULE-TIMING", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "variationpoint",
    "timingdescriptions",
    "timingguarantees",
    "timingrequirements",
    "behaviorref"
})
public class BSWMODULETIMING {

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
    @XmlElement(name = "TIMING-DESCRIPTIONS")
    protected BSWMODULETIMING.TIMINGDESCRIPTIONS timingdescriptions;
    @XmlElement(name = "TIMING-GUARANTEES")
    protected BSWMODULETIMING.TIMINGGUARANTEES timingguarantees;
    @XmlElement(name = "TIMING-REQUIREMENTS")
    protected BSWMODULETIMING.TIMINGREQUIREMENTS timingrequirements;
    @XmlElement(name = "BEHAVIOR-REF")
    protected BSWMODULETIMING.BEHAVIORREF behaviorref;
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
     * ??timingdescriptions?????
     * 
     * @return
     *     possible object is
     *     {@link BSWMODULETIMING.TIMINGDESCRIPTIONS }
     *     
     */
    public BSWMODULETIMING.TIMINGDESCRIPTIONS getTIMINGDESCRIPTIONS() {
        return timingdescriptions;
    }

    /**
     * ??timingdescriptions?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWMODULETIMING.TIMINGDESCRIPTIONS }
     *     
     */
    public void setTIMINGDESCRIPTIONS(BSWMODULETIMING.TIMINGDESCRIPTIONS value) {
        this.timingdescriptions = value;
    }

    /**
     * ??timingguarantees?????
     * 
     * @return
     *     possible object is
     *     {@link BSWMODULETIMING.TIMINGGUARANTEES }
     *     
     */
    public BSWMODULETIMING.TIMINGGUARANTEES getTIMINGGUARANTEES() {
        return timingguarantees;
    }

    /**
     * ??timingguarantees?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWMODULETIMING.TIMINGGUARANTEES }
     *     
     */
    public void setTIMINGGUARANTEES(BSWMODULETIMING.TIMINGGUARANTEES value) {
        this.timingguarantees = value;
    }

    /**
     * ??timingrequirements?????
     * 
     * @return
     *     possible object is
     *     {@link BSWMODULETIMING.TIMINGREQUIREMENTS }
     *     
     */
    public BSWMODULETIMING.TIMINGREQUIREMENTS getTIMINGREQUIREMENTS() {
        return timingrequirements;
    }

    /**
     * ??timingrequirements?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWMODULETIMING.TIMINGREQUIREMENTS }
     *     
     */
    public void setTIMINGREQUIREMENTS(BSWMODULETIMING.TIMINGREQUIREMENTS value) {
        this.timingrequirements = value;
    }

    /**
     * ??behaviorref?????
     * 
     * @return
     *     possible object is
     *     {@link BSWMODULETIMING.BEHAVIORREF }
     *     
     */
    public BSWMODULETIMING.BEHAVIORREF getBEHAVIORREF() {
        return behaviorref;
    }

    /**
     * ??behaviorref?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWMODULETIMING.BEHAVIORREF }
     *     
     */
    public void setBEHAVIORREF(BSWMODULETIMING.BEHAVIORREF value) {
        this.behaviorref = value;
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
    public static class BEHAVIORREF
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
     *         &lt;element name="TD-EVENT-BSW-INTERNAL-BEHAVIOR" type="{http://autosar.org/schema/r4.0}TD-EVENT-BSW-INTERNAL-BEHAVIOR"/>
     *         &lt;element name="TD-EVENT-BSW-MODE-DECLARATION" type="{http://autosar.org/schema/r4.0}TD-EVENT-BSW-MODE-DECLARATION"/>
     *         &lt;element name="TD-EVENT-BSW-MODULE" type="{http://autosar.org/schema/r4.0}TD-EVENT-BSW-MODULE"/>
     *         &lt;element name="TD-EVENT-COMPLEX" type="{http://autosar.org/schema/r4.0}TD-EVENT-COMPLEX"/>
     *         &lt;element name="TD-EVENT-FR-CLUSTER-CYCLE-START" type="{http://autosar.org/schema/r4.0}TD-EVENT-FR-CLUSTER-CYCLE-START"/>
     *         &lt;element name="TD-EVENT-FRAME" type="{http://autosar.org/schema/r4.0}TD-EVENT-FRAME"/>
     *         &lt;element name="TD-EVENT-I-PDU" type="{http://autosar.org/schema/r4.0}TD-EVENT-I-PDU"/>
     *         &lt;element name="TD-EVENT-I-SIGNAL" type="{http://autosar.org/schema/r4.0}TD-EVENT-I-SIGNAL"/>
     *         &lt;element name="TD-EVENT-MODE-DECLARATION" type="{http://autosar.org/schema/r4.0}TD-EVENT-MODE-DECLARATION"/>
     *         &lt;element name="TD-EVENT-OPERATION" type="{http://autosar.org/schema/r4.0}TD-EVENT-OPERATION"/>
     *         &lt;element name="TD-EVENT-SWC-INTERNAL-BEHAVIOR" type="{http://autosar.org/schema/r4.0}TD-EVENT-SWC-INTERNAL-BEHAVIOR"/>
     *         &lt;element name="TD-EVENT-SWC-INTERNAL-BEHAVIOR-REFERENCE" type="{http://autosar.org/schema/r4.0}TD-EVENT-SWC-INTERNAL-BEHAVIOR-REFERENCE"/>
     *         &lt;element name="TD-EVENT-TT-CAN-CYCLE-START" type="{http://autosar.org/schema/r4.0}TD-EVENT-TT-CAN-CYCLE-START"/>
     *         &lt;element name="TD-EVENT-TRIGGER" type="{http://autosar.org/schema/r4.0}TD-EVENT-TRIGGER"/>
     *         &lt;element name="TD-EVENT-VARIABLE-DATA-PROTOTYPE" type="{http://autosar.org/schema/r4.0}TD-EVENT-VARIABLE-DATA-PROTOTYPE"/>
     *         &lt;element name="TD-EVENT-VFB-REFERENCE" type="{http://autosar.org/schema/r4.0}TD-EVENT-VFB-REFERENCE"/>
     *         &lt;element name="TIMING-DESCRIPTION-EVENT-CHAIN" type="{http://autosar.org/schema/r4.0}TIMING-DESCRIPTION-EVENT-CHAIN"/>
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
        "tdeventbswinternalbehaviorOrTDEVENTBSWMODEDECLARATIONOrTDEVENTBSWMODULE"
    })
    public static class TIMINGDESCRIPTIONS {

        @XmlElements({
            @XmlElement(name = "TD-EVENT-BSW-INTERNAL-BEHAVIOR", type = TDEVENTBSWINTERNALBEHAVIOR.class),
            @XmlElement(name = "TD-EVENT-BSW-MODE-DECLARATION", type = TDEVENTBSWMODEDECLARATION.class),
            @XmlElement(name = "TD-EVENT-BSW-MODULE", type = TDEVENTBSWMODULE.class),
            @XmlElement(name = "TD-EVENT-COMPLEX", type = TDEVENTCOMPLEX.class),
            @XmlElement(name = "TD-EVENT-FR-CLUSTER-CYCLE-START", type = TDEVENTFRCLUSTERCYCLESTART.class),
            @XmlElement(name = "TD-EVENT-FRAME", type = TDEVENTFRAME.class),
            @XmlElement(name = "TD-EVENT-I-PDU", type = TDEVENTIPDU.class),
            @XmlElement(name = "TD-EVENT-I-SIGNAL", type = TDEVENTISIGNAL.class),
            @XmlElement(name = "TD-EVENT-MODE-DECLARATION", type = TDEVENTMODEDECLARATION.class),
            @XmlElement(name = "TD-EVENT-OPERATION", type = TDEVENTOPERATION.class),
            @XmlElement(name = "TD-EVENT-SWC-INTERNAL-BEHAVIOR", type = TDEVENTSWCINTERNALBEHAVIOR.class),
            @XmlElement(name = "TD-EVENT-SWC-INTERNAL-BEHAVIOR-REFERENCE", type = TDEVENTSWCINTERNALBEHAVIORREFERENCE.class),
            @XmlElement(name = "TD-EVENT-TT-CAN-CYCLE-START", type = TDEVENTTTCANCYCLESTART.class),
            @XmlElement(name = "TD-EVENT-TRIGGER", type = TDEVENTTRIGGER.class),
            @XmlElement(name = "TD-EVENT-VARIABLE-DATA-PROTOTYPE", type = TDEVENTVARIABLEDATAPROTOTYPE.class),
            @XmlElement(name = "TD-EVENT-VFB-REFERENCE", type = TDEVENTVFBREFERENCE.class),
            @XmlElement(name = "TIMING-DESCRIPTION-EVENT-CHAIN", type = TIMINGDESCRIPTIONEVENTCHAIN.class)
        })
        protected List<Object> tdeventbswinternalbehaviorOrTDEVENTBSWMODEDECLARATIONOrTDEVENTBSWMODULE;

        /**
         * Gets the value of the tdeventbswinternalbehaviorOrTDEVENTBSWMODEDECLARATIONOrTDEVENTBSWMODULE property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tdeventbswinternalbehaviorOrTDEVENTBSWMODEDECLARATIONOrTDEVENTBSWMODULE property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTDEVENTBSWINTERNALBEHAVIOROrTDEVENTBSWMODEDECLARATIONOrTDEVENTBSWMODULE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TDEVENTBSWINTERNALBEHAVIOR }
         * {@link TDEVENTBSWMODEDECLARATION }
         * {@link TDEVENTBSWMODULE }
         * {@link TDEVENTCOMPLEX }
         * {@link TDEVENTFRCLUSTERCYCLESTART }
         * {@link TDEVENTFRAME }
         * {@link TDEVENTIPDU }
         * {@link TDEVENTISIGNAL }
         * {@link TDEVENTMODEDECLARATION }
         * {@link TDEVENTOPERATION }
         * {@link TDEVENTSWCINTERNALBEHAVIOR }
         * {@link TDEVENTSWCINTERNALBEHAVIORREFERENCE }
         * {@link TDEVENTTTCANCYCLESTART }
         * {@link TDEVENTTRIGGER }
         * {@link TDEVENTVARIABLEDATAPROTOTYPE }
         * {@link TDEVENTVFBREFERENCE }
         * {@link TIMINGDESCRIPTIONEVENTCHAIN }
         * 
         * 
         */
        public List<Object> getTDEVENTBSWINTERNALBEHAVIOROrTDEVENTBSWMODEDECLARATIONOrTDEVENTBSWMODULE() {
            if (tdeventbswinternalbehaviorOrTDEVENTBSWMODEDECLARATIONOrTDEVENTBSWMODULE == null) {
                tdeventbswinternalbehaviorOrTDEVENTBSWMODEDECLARATIONOrTDEVENTBSWMODULE = new ArrayList<Object>();
            }
            return this.tdeventbswinternalbehaviorOrTDEVENTBSWMODEDECLARATIONOrTDEVENTBSWMODULE;
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
     *         &lt;element name="AGE-CONSTRAINT" type="{http://autosar.org/schema/r4.0}AGE-CONSTRAINT"/>
     *         &lt;element name="ARBITRARY-EVENT-TRIGGERING" type="{http://autosar.org/schema/r4.0}ARBITRARY-EVENT-TRIGGERING"/>
     *         &lt;element name="BURST-PATTERN-EVENT-TRIGGERING" type="{http://autosar.org/schema/r4.0}BURST-PATTERN-EVENT-TRIGGERING"/>
     *         &lt;element name="CONCRETE-PATTERN-EVENT-TRIGGERING" type="{http://autosar.org/schema/r4.0}CONCRETE-PATTERN-EVENT-TRIGGERING"/>
     *         &lt;element name="EXECUTION-ORDER-CONSTRAINT" type="{http://autosar.org/schema/r4.0}EXECUTION-ORDER-CONSTRAINT"/>
     *         &lt;element name="EXECUTION-TIME-CONSTRAINT" type="{http://autosar.org/schema/r4.0}EXECUTION-TIME-CONSTRAINT"/>
     *         &lt;element name="LATENCY-TIMING-CONSTRAINT" type="{http://autosar.org/schema/r4.0}LATENCY-TIMING-CONSTRAINT"/>
     *         &lt;element name="OFFSET-TIMING-CONSTRAINT" type="{http://autosar.org/schema/r4.0}OFFSET-TIMING-CONSTRAINT"/>
     *         &lt;element name="PERIODIC-EVENT-TRIGGERING" type="{http://autosar.org/schema/r4.0}PERIODIC-EVENT-TRIGGERING"/>
     *         &lt;element name="SPORADIC-EVENT-TRIGGERING" type="{http://autosar.org/schema/r4.0}SPORADIC-EVENT-TRIGGERING"/>
     *         &lt;element name="SYNCHRONIZATION-TIMING-CONSTRAINT" type="{http://autosar.org/schema/r4.0}SYNCHRONIZATION-TIMING-CONSTRAINT"/>
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
        "ageconstraintOrARBITRARYEVENTTRIGGERINGOrBURSTPATTERNEVENTTRIGGERING"
    })
    public static class TIMINGGUARANTEES {

        @XmlElements({
            @XmlElement(name = "AGE-CONSTRAINT", type = AGECONSTRAINT.class),
            @XmlElement(name = "ARBITRARY-EVENT-TRIGGERING", type = ARBITRARYEVENTTRIGGERING.class),
            @XmlElement(name = "BURST-PATTERN-EVENT-TRIGGERING", type = BURSTPATTERNEVENTTRIGGERING.class),
            @XmlElement(name = "CONCRETE-PATTERN-EVENT-TRIGGERING", type = CONCRETEPATTERNEVENTTRIGGERING.class),
            @XmlElement(name = "EXECUTION-ORDER-CONSTRAINT", type = EXECUTIONORDERCONSTRAINT.class),
            @XmlElement(name = "EXECUTION-TIME-CONSTRAINT", type = EXECUTIONTIMECONSTRAINT.class),
            @XmlElement(name = "LATENCY-TIMING-CONSTRAINT", type = LATENCYTIMINGCONSTRAINT.class),
            @XmlElement(name = "OFFSET-TIMING-CONSTRAINT", type = OFFSETTIMINGCONSTRAINT.class),
            @XmlElement(name = "PERIODIC-EVENT-TRIGGERING", type = PERIODICEVENTTRIGGERING.class),
            @XmlElement(name = "SPORADIC-EVENT-TRIGGERING", type = SPORADICEVENTTRIGGERING.class),
            @XmlElement(name = "SYNCHRONIZATION-TIMING-CONSTRAINT", type = SYNCHRONIZATIONTIMINGCONSTRAINT.class)
        })
        protected List<Object> ageconstraintOrARBITRARYEVENTTRIGGERINGOrBURSTPATTERNEVENTTRIGGERING;

        /**
         * Gets the value of the ageconstraintOrARBITRARYEVENTTRIGGERINGOrBURSTPATTERNEVENTTRIGGERING property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ageconstraintOrARBITRARYEVENTTRIGGERINGOrBURSTPATTERNEVENTTRIGGERING property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAGECONSTRAINTOrARBITRARYEVENTTRIGGERINGOrBURSTPATTERNEVENTTRIGGERING().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AGECONSTRAINT }
         * {@link ARBITRARYEVENTTRIGGERING }
         * {@link BURSTPATTERNEVENTTRIGGERING }
         * {@link CONCRETEPATTERNEVENTTRIGGERING }
         * {@link EXECUTIONORDERCONSTRAINT }
         * {@link EXECUTIONTIMECONSTRAINT }
         * {@link LATENCYTIMINGCONSTRAINT }
         * {@link OFFSETTIMINGCONSTRAINT }
         * {@link PERIODICEVENTTRIGGERING }
         * {@link SPORADICEVENTTRIGGERING }
         * {@link SYNCHRONIZATIONTIMINGCONSTRAINT }
         * 
         * 
         */
        public List<Object> getAGECONSTRAINTOrARBITRARYEVENTTRIGGERINGOrBURSTPATTERNEVENTTRIGGERING() {
            if (ageconstraintOrARBITRARYEVENTTRIGGERINGOrBURSTPATTERNEVENTTRIGGERING == null) {
                ageconstraintOrARBITRARYEVENTTRIGGERINGOrBURSTPATTERNEVENTTRIGGERING = new ArrayList<Object>();
            }
            return this.ageconstraintOrARBITRARYEVENTTRIGGERINGOrBURSTPATTERNEVENTTRIGGERING;
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
     *         &lt;element name="AGE-CONSTRAINT" type="{http://autosar.org/schema/r4.0}AGE-CONSTRAINT"/>
     *         &lt;element name="ARBITRARY-EVENT-TRIGGERING" type="{http://autosar.org/schema/r4.0}ARBITRARY-EVENT-TRIGGERING"/>
     *         &lt;element name="BURST-PATTERN-EVENT-TRIGGERING" type="{http://autosar.org/schema/r4.0}BURST-PATTERN-EVENT-TRIGGERING"/>
     *         &lt;element name="CONCRETE-PATTERN-EVENT-TRIGGERING" type="{http://autosar.org/schema/r4.0}CONCRETE-PATTERN-EVENT-TRIGGERING"/>
     *         &lt;element name="EXECUTION-ORDER-CONSTRAINT" type="{http://autosar.org/schema/r4.0}EXECUTION-ORDER-CONSTRAINT"/>
     *         &lt;element name="EXECUTION-TIME-CONSTRAINT" type="{http://autosar.org/schema/r4.0}EXECUTION-TIME-CONSTRAINT"/>
     *         &lt;element name="LATENCY-TIMING-CONSTRAINT" type="{http://autosar.org/schema/r4.0}LATENCY-TIMING-CONSTRAINT"/>
     *         &lt;element name="OFFSET-TIMING-CONSTRAINT" type="{http://autosar.org/schema/r4.0}OFFSET-TIMING-CONSTRAINT"/>
     *         &lt;element name="PERIODIC-EVENT-TRIGGERING" type="{http://autosar.org/schema/r4.0}PERIODIC-EVENT-TRIGGERING"/>
     *         &lt;element name="SPORADIC-EVENT-TRIGGERING" type="{http://autosar.org/schema/r4.0}SPORADIC-EVENT-TRIGGERING"/>
     *         &lt;element name="SYNCHRONIZATION-TIMING-CONSTRAINT" type="{http://autosar.org/schema/r4.0}SYNCHRONIZATION-TIMING-CONSTRAINT"/>
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
        "ageconstraintOrARBITRARYEVENTTRIGGERINGOrBURSTPATTERNEVENTTRIGGERING"
    })
    public static class TIMINGREQUIREMENTS {

        @XmlElements({
            @XmlElement(name = "AGE-CONSTRAINT", type = AGECONSTRAINT.class),
            @XmlElement(name = "ARBITRARY-EVENT-TRIGGERING", type = ARBITRARYEVENTTRIGGERING.class),
            @XmlElement(name = "BURST-PATTERN-EVENT-TRIGGERING", type = BURSTPATTERNEVENTTRIGGERING.class),
            @XmlElement(name = "CONCRETE-PATTERN-EVENT-TRIGGERING", type = CONCRETEPATTERNEVENTTRIGGERING.class),
            @XmlElement(name = "EXECUTION-ORDER-CONSTRAINT", type = EXECUTIONORDERCONSTRAINT.class),
            @XmlElement(name = "EXECUTION-TIME-CONSTRAINT", type = EXECUTIONTIMECONSTRAINT.class),
            @XmlElement(name = "LATENCY-TIMING-CONSTRAINT", type = LATENCYTIMINGCONSTRAINT.class),
            @XmlElement(name = "OFFSET-TIMING-CONSTRAINT", type = OFFSETTIMINGCONSTRAINT.class),
            @XmlElement(name = "PERIODIC-EVENT-TRIGGERING", type = PERIODICEVENTTRIGGERING.class),
            @XmlElement(name = "SPORADIC-EVENT-TRIGGERING", type = SPORADICEVENTTRIGGERING.class),
            @XmlElement(name = "SYNCHRONIZATION-TIMING-CONSTRAINT", type = SYNCHRONIZATIONTIMINGCONSTRAINT.class)
        })
        protected List<Object> ageconstraintOrARBITRARYEVENTTRIGGERINGOrBURSTPATTERNEVENTTRIGGERING;

        /**
         * Gets the value of the ageconstraintOrARBITRARYEVENTTRIGGERINGOrBURSTPATTERNEVENTTRIGGERING property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ageconstraintOrARBITRARYEVENTTRIGGERINGOrBURSTPATTERNEVENTTRIGGERING property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAGECONSTRAINTOrARBITRARYEVENTTRIGGERINGOrBURSTPATTERNEVENTTRIGGERING().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AGECONSTRAINT }
         * {@link ARBITRARYEVENTTRIGGERING }
         * {@link BURSTPATTERNEVENTTRIGGERING }
         * {@link CONCRETEPATTERNEVENTTRIGGERING }
         * {@link EXECUTIONORDERCONSTRAINT }
         * {@link EXECUTIONTIMECONSTRAINT }
         * {@link LATENCYTIMINGCONSTRAINT }
         * {@link OFFSETTIMINGCONSTRAINT }
         * {@link PERIODICEVENTTRIGGERING }
         * {@link SPORADICEVENTTRIGGERING }
         * {@link SYNCHRONIZATIONTIMINGCONSTRAINT }
         * 
         * 
         */
        public List<Object> getAGECONSTRAINTOrARBITRARYEVENTTRIGGERINGOrBURSTPATTERNEVENTTRIGGERING() {
            if (ageconstraintOrARBITRARYEVENTTRIGGERINGOrBURSTPATTERNEVENTTRIGGERING == null) {
                ageconstraintOrARBITRARYEVENTTRIGGERINGOrBURSTPATTERNEVENTTRIGGERING = new ArrayList<Object>();
            }
            return this.ageconstraintOrARBITRARYEVENTTRIGGERINGOrBURSTPATTERNEVENTTRIGGERING;
        }

    }

}
