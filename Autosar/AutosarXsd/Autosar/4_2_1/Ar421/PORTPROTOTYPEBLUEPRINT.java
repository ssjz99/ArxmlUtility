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
 * This meta-class represents the ability to express a blueprint of a PortPrototype by referring to a particular PortInterface. This blueprint can then be used as a guidance to create particular PortPrototypes which are defined according to this blueprint. By this it is possible to standardize application interfaces without the need to also standardize software-components with PortPrototypes typed by the standardized PortInterfaces.
 * 
 * <p>PORT-PROTOTYPE-BLUEPRINT complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="PORT-PROTOTYPE-BLUEPRINT">
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
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ATP-BLUEPRINT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ATP-CLASSIFIER"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ATP-FEATURE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ATP-STRUCTURE-ELEMENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}PORT-PROTOTYPE-BLUEPRINT"/>
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
@XmlType(name = "PORT-PROTOTYPE-BLUEPRINT", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "variationpoint",
    "blueprintpolicys",
    "shortnamepattern",
    "initvalues",
    "interfaceref",
    "providedcomspecs",
    "requiredcomspecs"
})
public class PORTPROTOTYPEBLUEPRINT {

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
    @XmlElement(name = "BLUEPRINT-POLICYS")
    protected Ar421.FLATMAP.BLUEPRINTPOLICYS blueprintpolicys;
    @XmlElement(name = "SHORT-NAME-PATTERN")
    protected STRING shortnamepattern;
    @XmlElement(name = "INIT-VALUES")
    protected PORTPROTOTYPEBLUEPRINT.INITVALUES initvalues;
    @XmlElement(name = "INTERFACE-REF")
    protected PORTPROTOTYPEBLUEPRINT.INTERFACEREF interfaceref;
    @XmlElement(name = "PROVIDED-COM-SPECS")
    protected PORTPROTOTYPEBLUEPRINT.PROVIDEDCOMSPECS providedcomspecs;
    @XmlElement(name = "REQUIRED-COM-SPECS")
    protected PORTPROTOTYPEBLUEPRINT.REQUIREDCOMSPECS requiredcomspecs;
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
     * ??blueprintpolicys?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.FLATMAP.BLUEPRINTPOLICYS }
     *     
     */
    public Ar421.FLATMAP.BLUEPRINTPOLICYS getBLUEPRINTPOLICYS() {
        return blueprintpolicys;
    }

    /**
     * ??blueprintpolicys?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.FLATMAP.BLUEPRINTPOLICYS }
     *     
     */
    public void setBLUEPRINTPOLICYS(Ar421.FLATMAP.BLUEPRINTPOLICYS value) {
        this.blueprintpolicys = value;
    }

    /**
     * ??shortnamepattern?????
     * 
     * @return
     *     possible object is
     *     {@link STRING }
     *     
     */
    public STRING getSHORTNAMEPATTERN() {
        return shortnamepattern;
    }

    /**
     * ??shortnamepattern?????
     * 
     * @param value
     *     allowed object is
     *     {@link STRING }
     *     
     */
    public void setSHORTNAMEPATTERN(STRING value) {
        this.shortnamepattern = value;
    }

    /**
     * ??initvalues?????
     * 
     * @return
     *     possible object is
     *     {@link PORTPROTOTYPEBLUEPRINT.INITVALUES }
     *     
     */
    public PORTPROTOTYPEBLUEPRINT.INITVALUES getINITVALUES() {
        return initvalues;
    }

    /**
     * ??initvalues?????
     * 
     * @param value
     *     allowed object is
     *     {@link PORTPROTOTYPEBLUEPRINT.INITVALUES }
     *     
     */
    public void setINITVALUES(PORTPROTOTYPEBLUEPRINT.INITVALUES value) {
        this.initvalues = value;
    }

    /**
     * ??interfaceref?????
     * 
     * @return
     *     possible object is
     *     {@link PORTPROTOTYPEBLUEPRINT.INTERFACEREF }
     *     
     */
    public PORTPROTOTYPEBLUEPRINT.INTERFACEREF getINTERFACEREF() {
        return interfaceref;
    }

    /**
     * ??interfaceref?????
     * 
     * @param value
     *     allowed object is
     *     {@link PORTPROTOTYPEBLUEPRINT.INTERFACEREF }
     *     
     */
    public void setINTERFACEREF(PORTPROTOTYPEBLUEPRINT.INTERFACEREF value) {
        this.interfaceref = value;
    }

    /**
     * ??providedcomspecs?????
     * 
     * @return
     *     possible object is
     *     {@link PORTPROTOTYPEBLUEPRINT.PROVIDEDCOMSPECS }
     *     
     */
    public PORTPROTOTYPEBLUEPRINT.PROVIDEDCOMSPECS getPROVIDEDCOMSPECS() {
        return providedcomspecs;
    }

    /**
     * ??providedcomspecs?????
     * 
     * @param value
     *     allowed object is
     *     {@link PORTPROTOTYPEBLUEPRINT.PROVIDEDCOMSPECS }
     *     
     */
    public void setPROVIDEDCOMSPECS(PORTPROTOTYPEBLUEPRINT.PROVIDEDCOMSPECS value) {
        this.providedcomspecs = value;
    }

    /**
     * ??requiredcomspecs?????
     * 
     * @return
     *     possible object is
     *     {@link PORTPROTOTYPEBLUEPRINT.REQUIREDCOMSPECS }
     *     
     */
    public PORTPROTOTYPEBLUEPRINT.REQUIREDCOMSPECS getREQUIREDCOMSPECS() {
        return requiredcomspecs;
    }

    /**
     * ??requiredcomspecs?????
     * 
     * @param value
     *     allowed object is
     *     {@link PORTPROTOTYPEBLUEPRINT.REQUIREDCOMSPECS }
     *     
     */
    public void setREQUIREDCOMSPECS(PORTPROTOTYPEBLUEPRINT.REQUIREDCOMSPECS value) {
        this.requiredcomspecs = value;
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
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="PORT-PROTOTYPE-BLUEPRINT-INIT-VALUE" type="{http://autosar.org/schema/r4.0}PORT-PROTOTYPE-BLUEPRINT-INIT-VALUE"/>
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
        "portprototypeblueprintinitvalue"
    })
    public static class INITVALUES {

        @XmlElement(name = "PORT-PROTOTYPE-BLUEPRINT-INIT-VALUE")
        protected List<PORTPROTOTYPEBLUEPRINTINITVALUE> portprototypeblueprintinitvalue;

        /**
         * Gets the value of the portprototypeblueprintinitvalue property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the portprototypeblueprintinitvalue property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPORTPROTOTYPEBLUEPRINTINITVALUE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PORTPROTOTYPEBLUEPRINTINITVALUE }
         * 
         * 
         */
        public List<PORTPROTOTYPEBLUEPRINTINITVALUE> getPORTPROTOTYPEBLUEPRINTINITVALUE() {
            if (portprototypeblueprintinitvalue == null) {
                portprototypeblueprintinitvalue = new ArrayList<PORTPROTOTYPEBLUEPRINTINITVALUE>();
            }
            return this.portprototypeblueprintinitvalue;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}PORT-INTERFACE--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class INTERFACEREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected PORTINTERFACESUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link PORTINTERFACESUBTYPESENUM }
         *     
         */
        public PORTINTERFACESUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link PORTINTERFACESUBTYPESENUM }
         *     
         */
        public void setDEST(PORTINTERFACESUBTYPESENUM value) {
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
     *         &lt;element name="MODE-SWITCH-SENDER-COM-SPEC" type="{http://autosar.org/schema/r4.0}MODE-SWITCH-SENDER-COM-SPEC"/>
     *         &lt;element name="NONQUEUED-SENDER-COM-SPEC" type="{http://autosar.org/schema/r4.0}NONQUEUED-SENDER-COM-SPEC"/>
     *         &lt;element name="NV-PROVIDE-COM-SPEC" type="{http://autosar.org/schema/r4.0}NV-PROVIDE-COM-SPEC"/>
     *         &lt;element name="PARAMETER-PROVIDE-COM-SPEC" type="{http://autosar.org/schema/r4.0}PARAMETER-PROVIDE-COM-SPEC"/>
     *         &lt;element name="QUEUED-SENDER-COM-SPEC" type="{http://autosar.org/schema/r4.0}QUEUED-SENDER-COM-SPEC"/>
     *         &lt;element name="SERVER-COM-SPEC" type="{http://autosar.org/schema/r4.0}SERVER-COM-SPEC"/>
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
        "modeswitchsendercomspecOrNONQUEUEDSENDERCOMSPECOrNVPROVIDECOMSPEC"
    })
    public static class PROVIDEDCOMSPECS {

        @XmlElements({
            @XmlElement(name = "MODE-SWITCH-SENDER-COM-SPEC", type = MODESWITCHSENDERCOMSPEC.class),
            @XmlElement(name = "NONQUEUED-SENDER-COM-SPEC", type = NONQUEUEDSENDERCOMSPEC.class),
            @XmlElement(name = "NV-PROVIDE-COM-SPEC", type = NVPROVIDECOMSPEC.class),
            @XmlElement(name = "PARAMETER-PROVIDE-COM-SPEC", type = PARAMETERPROVIDECOMSPEC.class),
            @XmlElement(name = "QUEUED-SENDER-COM-SPEC", type = QUEUEDSENDERCOMSPEC.class),
            @XmlElement(name = "SERVER-COM-SPEC", type = SERVERCOMSPEC.class)
        })
        protected List<Object> modeswitchsendercomspecOrNONQUEUEDSENDERCOMSPECOrNVPROVIDECOMSPEC;

        /**
         * Gets the value of the modeswitchsendercomspecOrNONQUEUEDSENDERCOMSPECOrNVPROVIDECOMSPEC property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the modeswitchsendercomspecOrNONQUEUEDSENDERCOMSPECOrNVPROVIDECOMSPEC property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMODESWITCHSENDERCOMSPECOrNONQUEUEDSENDERCOMSPECOrNVPROVIDECOMSPEC().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MODESWITCHSENDERCOMSPEC }
         * {@link NONQUEUEDSENDERCOMSPEC }
         * {@link NVPROVIDECOMSPEC }
         * {@link PARAMETERPROVIDECOMSPEC }
         * {@link QUEUEDSENDERCOMSPEC }
         * {@link SERVERCOMSPEC }
         * 
         * 
         */
        public List<Object> getMODESWITCHSENDERCOMSPECOrNONQUEUEDSENDERCOMSPECOrNVPROVIDECOMSPEC() {
            if (modeswitchsendercomspecOrNONQUEUEDSENDERCOMSPECOrNVPROVIDECOMSPEC == null) {
                modeswitchsendercomspecOrNONQUEUEDSENDERCOMSPECOrNVPROVIDECOMSPEC = new ArrayList<Object>();
            }
            return this.modeswitchsendercomspecOrNONQUEUEDSENDERCOMSPECOrNVPROVIDECOMSPEC;
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
     *         &lt;element name="CLIENT-COM-SPEC" type="{http://autosar.org/schema/r4.0}CLIENT-COM-SPEC"/>
     *         &lt;element name="MODE-SWITCH-RECEIVER-COM-SPEC" type="{http://autosar.org/schema/r4.0}MODE-SWITCH-RECEIVER-COM-SPEC"/>
     *         &lt;element name="NONQUEUED-RECEIVER-COM-SPEC" type="{http://autosar.org/schema/r4.0}NONQUEUED-RECEIVER-COM-SPEC"/>
     *         &lt;element name="NV-REQUIRE-COM-SPEC" type="{http://autosar.org/schema/r4.0}NV-REQUIRE-COM-SPEC"/>
     *         &lt;element name="PARAMETER-REQUIRE-COM-SPEC" type="{http://autosar.org/schema/r4.0}PARAMETER-REQUIRE-COM-SPEC"/>
     *         &lt;element name="QUEUED-RECEIVER-COM-SPEC" type="{http://autosar.org/schema/r4.0}QUEUED-RECEIVER-COM-SPEC"/>
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
        "clientcomspecOrMODESWITCHRECEIVERCOMSPECOrNONQUEUEDRECEIVERCOMSPEC"
    })
    public static class REQUIREDCOMSPECS {

        @XmlElements({
            @XmlElement(name = "CLIENT-COM-SPEC", type = CLIENTCOMSPEC.class),
            @XmlElement(name = "MODE-SWITCH-RECEIVER-COM-SPEC", type = MODESWITCHRECEIVERCOMSPEC.class),
            @XmlElement(name = "NONQUEUED-RECEIVER-COM-SPEC", type = NONQUEUEDRECEIVERCOMSPEC.class),
            @XmlElement(name = "NV-REQUIRE-COM-SPEC", type = NVREQUIRECOMSPEC.class),
            @XmlElement(name = "PARAMETER-REQUIRE-COM-SPEC", type = PARAMETERREQUIRECOMSPEC.class),
            @XmlElement(name = "QUEUED-RECEIVER-COM-SPEC", type = QUEUEDRECEIVERCOMSPEC.class)
        })
        protected List<Object> clientcomspecOrMODESWITCHRECEIVERCOMSPECOrNONQUEUEDRECEIVERCOMSPEC;

        /**
         * Gets the value of the clientcomspecOrMODESWITCHRECEIVERCOMSPECOrNONQUEUEDRECEIVERCOMSPEC property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the clientcomspecOrMODESWITCHRECEIVERCOMSPECOrNONQUEUEDRECEIVERCOMSPEC property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCLIENTCOMSPECOrMODESWITCHRECEIVERCOMSPECOrNONQUEUEDRECEIVERCOMSPEC().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CLIENTCOMSPEC }
         * {@link MODESWITCHRECEIVERCOMSPEC }
         * {@link NONQUEUEDRECEIVERCOMSPEC }
         * {@link NVREQUIRECOMSPEC }
         * {@link PARAMETERREQUIRECOMSPEC }
         * {@link QUEUEDRECEIVERCOMSPEC }
         * 
         * 
         */
        public List<Object> getCLIENTCOMSPECOrMODESWITCHRECEIVERCOMSPECOrNONQUEUEDRECEIVERCOMSPEC() {
            if (clientcomspecOrMODESWITCHRECEIVERCOMSPECOrNONQUEUEDRECEIVERCOMSPEC == null) {
                clientcomspecOrMODESWITCHRECEIVERCOMSPECOrNONQUEUEDRECEIVERCOMSPEC = new ArrayList<Object>();
            }
            return this.clientcomspecOrMODESWITCHRECEIVERCOMSPECOrNONQUEUEDRECEIVERCOMSPEC;
        }

    }

}
