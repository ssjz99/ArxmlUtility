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
 * The SwcInternalBehavior of an AtomicSwComponentType describes the relevant aspects of the software-component with respect to the RTE, i.e. the RunnableEntities and the RTEEvents they respond to.
 * 
 * <p>SWC-INTERNAL-BEHAVIOR complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="SWC-INTERNAL-BEHAVIOR">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTILANGUAGE-REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ATP-CLASSIFIER"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ATP-FEATURE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ATP-STRUCTURE-ELEMENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}INTERNAL-BEHAVIOR"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}SWC-INTERNAL-BEHAVIOR"/>
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
@XmlType(name = "SWC-INTERNAL-BEHAVIOR", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "constantmemorys",
    "constantvaluemappingrefs",
    "datatypemappingrefs",
    "exclusiveareas",
    "exclusiveareanestingorders",
    "staticmemorys",
    "artypedperinstancememorys",
    "events",
    "explicitinterrunnablevariables",
    "handleterminationandrestart",
    "implicitinterrunnablevariables",
    "includeddatatypesets",
    "includedmodedeclarationgroupsets",
    "instantiationdatadefpropss",
    "perinstancememorys",
    "perinstanceparameters",
    "portapioptions",
    "runnables",
    "servicedependencys",
    "sharedparameters",
    "supportsmultipleinstantiation",
    "variationpointproxys",
    "variationpoint"
})
public class SWCINTERNALBEHAVIOR {

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
    @XmlElement(name = "CONSTANT-MEMORYS")
    protected Ar421.BSWINTERNALBEHAVIOR.CONSTANTMEMORYS constantmemorys;
    @XmlElement(name = "CONSTANT-VALUE-MAPPING-REFS")
    protected Ar421.BSWINTERNALBEHAVIOR.CONSTANTVALUEMAPPINGREFS constantvaluemappingrefs;
    @XmlElement(name = "DATA-TYPE-MAPPING-REFS")
    protected Ar421.BSWINTERNALBEHAVIOR.DATATYPEMAPPINGREFS datatypemappingrefs;
    @XmlElement(name = "EXCLUSIVE-AREAS")
    protected Ar421.BSWINTERNALBEHAVIOR.EXCLUSIVEAREAS exclusiveareas;
    @XmlElement(name = "EXCLUSIVE-AREA-NESTING-ORDERS")
    protected Ar421.BSWINTERNALBEHAVIOR.EXCLUSIVEAREANESTINGORDERS exclusiveareanestingorders;
    @XmlElement(name = "STATIC-MEMORYS")
    protected Ar421.BSWINTERNALBEHAVIOR.STATICMEMORYS staticmemorys;
    @XmlElement(name = "AR-TYPED-PER-INSTANCE-MEMORYS")
    protected SWCINTERNALBEHAVIOR.ARTYPEDPERINSTANCEMEMORYS artypedperinstancememorys;
    @XmlElement(name = "EVENTS")
    protected SWCINTERNALBEHAVIOR.EVENTS events;
    @XmlElement(name = "EXPLICIT-INTER-RUNNABLE-VARIABLES")
    protected SWCINTERNALBEHAVIOR.EXPLICITINTERRUNNABLEVARIABLES explicitinterrunnablevariables;
    @XmlElement(name = "HANDLE-TERMINATION-AND-RESTART")
    protected HANDLETERMINATIONANDRESTARTENUM handleterminationandrestart;
    @XmlElement(name = "IMPLICIT-INTER-RUNNABLE-VARIABLES")
    protected SWCINTERNALBEHAVIOR.IMPLICITINTERRUNNABLEVARIABLES implicitinterrunnablevariables;
    @XmlElement(name = "INCLUDED-DATA-TYPE-SETS")
    protected SWCINTERNALBEHAVIOR.INCLUDEDDATATYPESETS includeddatatypesets;
    @XmlElement(name = "INCLUDED-MODE-DECLARATION-GROUP-SETS")
    protected SWCINTERNALBEHAVIOR.INCLUDEDMODEDECLARATIONGROUPSETS includedmodedeclarationgroupsets;
    @XmlElement(name = "INSTANTIATION-DATA-DEF-PROPSS")
    protected SWCINTERNALBEHAVIOR.INSTANTIATIONDATADEFPROPSS instantiationdatadefpropss;
    @XmlElement(name = "PER-INSTANCE-MEMORYS")
    protected SWCINTERNALBEHAVIOR.PERINSTANCEMEMORYS perinstancememorys;
    @XmlElement(name = "PER-INSTANCE-PARAMETERS")
    protected SWCINTERNALBEHAVIOR.PERINSTANCEPARAMETERS perinstanceparameters;
    @XmlElement(name = "PORT-API-OPTIONS")
    protected SWCINTERNALBEHAVIOR.PORTAPIOPTIONS portapioptions;
    @XmlElement(name = "RUNNABLES")
    protected SWCINTERNALBEHAVIOR.RUNNABLES runnables;
    @XmlElement(name = "SERVICE-DEPENDENCYS")
    protected SWCINTERNALBEHAVIOR.SERVICEDEPENDENCYS servicedependencys;
    @XmlElement(name = "SHARED-PARAMETERS")
    protected SWCINTERNALBEHAVIOR.SHAREDPARAMETERS sharedparameters;
    @XmlElement(name = "SUPPORTS-MULTIPLE-INSTANTIATION")
    protected BOOLEAN supportsmultipleinstantiation;
    @XmlElement(name = "VARIATION-POINT-PROXYS")
    protected SWCINTERNALBEHAVIOR.VARIATIONPOINTPROXYS variationpointproxys;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
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
     * ??constantmemorys?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.BSWINTERNALBEHAVIOR.CONSTANTMEMORYS }
     *     
     */
    public Ar421.BSWINTERNALBEHAVIOR.CONSTANTMEMORYS getCONSTANTMEMORYS() {
        return constantmemorys;
    }

    /**
     * ??constantmemorys?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.BSWINTERNALBEHAVIOR.CONSTANTMEMORYS }
     *     
     */
    public void setCONSTANTMEMORYS(Ar421.BSWINTERNALBEHAVIOR.CONSTANTMEMORYS value) {
        this.constantmemorys = value;
    }

    /**
     * ??constantvaluemappingrefs?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.BSWINTERNALBEHAVIOR.CONSTANTVALUEMAPPINGREFS }
     *     
     */
    public Ar421.BSWINTERNALBEHAVIOR.CONSTANTVALUEMAPPINGREFS getCONSTANTVALUEMAPPINGREFS() {
        return constantvaluemappingrefs;
    }

    /**
     * ??constantvaluemappingrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.BSWINTERNALBEHAVIOR.CONSTANTVALUEMAPPINGREFS }
     *     
     */
    public void setCONSTANTVALUEMAPPINGREFS(Ar421.BSWINTERNALBEHAVIOR.CONSTANTVALUEMAPPINGREFS value) {
        this.constantvaluemappingrefs = value;
    }

    /**
     * ??datatypemappingrefs?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.BSWINTERNALBEHAVIOR.DATATYPEMAPPINGREFS }
     *     
     */
    public Ar421.BSWINTERNALBEHAVIOR.DATATYPEMAPPINGREFS getDATATYPEMAPPINGREFS() {
        return datatypemappingrefs;
    }

    /**
     * ??datatypemappingrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.BSWINTERNALBEHAVIOR.DATATYPEMAPPINGREFS }
     *     
     */
    public void setDATATYPEMAPPINGREFS(Ar421.BSWINTERNALBEHAVIOR.DATATYPEMAPPINGREFS value) {
        this.datatypemappingrefs = value;
    }

    /**
     * ??exclusiveareas?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.BSWINTERNALBEHAVIOR.EXCLUSIVEAREAS }
     *     
     */
    public Ar421.BSWINTERNALBEHAVIOR.EXCLUSIVEAREAS getEXCLUSIVEAREAS() {
        return exclusiveareas;
    }

    /**
     * ??exclusiveareas?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.BSWINTERNALBEHAVIOR.EXCLUSIVEAREAS }
     *     
     */
    public void setEXCLUSIVEAREAS(Ar421.BSWINTERNALBEHAVIOR.EXCLUSIVEAREAS value) {
        this.exclusiveareas = value;
    }

    /**
     * ??exclusiveareanestingorders?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.BSWINTERNALBEHAVIOR.EXCLUSIVEAREANESTINGORDERS }
     *     
     */
    public Ar421.BSWINTERNALBEHAVIOR.EXCLUSIVEAREANESTINGORDERS getEXCLUSIVEAREANESTINGORDERS() {
        return exclusiveareanestingorders;
    }

    /**
     * ??exclusiveareanestingorders?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.BSWINTERNALBEHAVIOR.EXCLUSIVEAREANESTINGORDERS }
     *     
     */
    public void setEXCLUSIVEAREANESTINGORDERS(Ar421.BSWINTERNALBEHAVIOR.EXCLUSIVEAREANESTINGORDERS value) {
        this.exclusiveareanestingorders = value;
    }

    /**
     * ??staticmemorys?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.BSWINTERNALBEHAVIOR.STATICMEMORYS }
     *     
     */
    public Ar421.BSWINTERNALBEHAVIOR.STATICMEMORYS getSTATICMEMORYS() {
        return staticmemorys;
    }

    /**
     * ??staticmemorys?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.BSWINTERNALBEHAVIOR.STATICMEMORYS }
     *     
     */
    public void setSTATICMEMORYS(Ar421.BSWINTERNALBEHAVIOR.STATICMEMORYS value) {
        this.staticmemorys = value;
    }

    /**
     * ??artypedperinstancememorys?????
     * 
     * @return
     *     possible object is
     *     {@link SWCINTERNALBEHAVIOR.ARTYPEDPERINSTANCEMEMORYS }
     *     
     */
    public SWCINTERNALBEHAVIOR.ARTYPEDPERINSTANCEMEMORYS getARTYPEDPERINSTANCEMEMORYS() {
        return artypedperinstancememorys;
    }

    /**
     * ??artypedperinstancememorys?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWCINTERNALBEHAVIOR.ARTYPEDPERINSTANCEMEMORYS }
     *     
     */
    public void setARTYPEDPERINSTANCEMEMORYS(SWCINTERNALBEHAVIOR.ARTYPEDPERINSTANCEMEMORYS value) {
        this.artypedperinstancememorys = value;
    }

    /**
     * ??events?????
     * 
     * @return
     *     possible object is
     *     {@link SWCINTERNALBEHAVIOR.EVENTS }
     *     
     */
    public SWCINTERNALBEHAVIOR.EVENTS getEVENTS() {
        return events;
    }

    /**
     * ??events?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWCINTERNALBEHAVIOR.EVENTS }
     *     
     */
    public void setEVENTS(SWCINTERNALBEHAVIOR.EVENTS value) {
        this.events = value;
    }

    /**
     * ??explicitinterrunnablevariables?????
     * 
     * @return
     *     possible object is
     *     {@link SWCINTERNALBEHAVIOR.EXPLICITINTERRUNNABLEVARIABLES }
     *     
     */
    public SWCINTERNALBEHAVIOR.EXPLICITINTERRUNNABLEVARIABLES getEXPLICITINTERRUNNABLEVARIABLES() {
        return explicitinterrunnablevariables;
    }

    /**
     * ??explicitinterrunnablevariables?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWCINTERNALBEHAVIOR.EXPLICITINTERRUNNABLEVARIABLES }
     *     
     */
    public void setEXPLICITINTERRUNNABLEVARIABLES(SWCINTERNALBEHAVIOR.EXPLICITINTERRUNNABLEVARIABLES value) {
        this.explicitinterrunnablevariables = value;
    }

    /**
     * ??handleterminationandrestart?????
     * 
     * @return
     *     possible object is
     *     {@link HANDLETERMINATIONANDRESTARTENUM }
     *     
     */
    public HANDLETERMINATIONANDRESTARTENUM getHANDLETERMINATIONANDRESTART() {
        return handleterminationandrestart;
    }

    /**
     * ??handleterminationandrestart?????
     * 
     * @param value
     *     allowed object is
     *     {@link HANDLETERMINATIONANDRESTARTENUM }
     *     
     */
    public void setHANDLETERMINATIONANDRESTART(HANDLETERMINATIONANDRESTARTENUM value) {
        this.handleterminationandrestart = value;
    }

    /**
     * ??implicitinterrunnablevariables?????
     * 
     * @return
     *     possible object is
     *     {@link SWCINTERNALBEHAVIOR.IMPLICITINTERRUNNABLEVARIABLES }
     *     
     */
    public SWCINTERNALBEHAVIOR.IMPLICITINTERRUNNABLEVARIABLES getIMPLICITINTERRUNNABLEVARIABLES() {
        return implicitinterrunnablevariables;
    }

    /**
     * ??implicitinterrunnablevariables?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWCINTERNALBEHAVIOR.IMPLICITINTERRUNNABLEVARIABLES }
     *     
     */
    public void setIMPLICITINTERRUNNABLEVARIABLES(SWCINTERNALBEHAVIOR.IMPLICITINTERRUNNABLEVARIABLES value) {
        this.implicitinterrunnablevariables = value;
    }

    /**
     * ??includeddatatypesets?????
     * 
     * @return
     *     possible object is
     *     {@link SWCINTERNALBEHAVIOR.INCLUDEDDATATYPESETS }
     *     
     */
    public SWCINTERNALBEHAVIOR.INCLUDEDDATATYPESETS getINCLUDEDDATATYPESETS() {
        return includeddatatypesets;
    }

    /**
     * ??includeddatatypesets?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWCINTERNALBEHAVIOR.INCLUDEDDATATYPESETS }
     *     
     */
    public void setINCLUDEDDATATYPESETS(SWCINTERNALBEHAVIOR.INCLUDEDDATATYPESETS value) {
        this.includeddatatypesets = value;
    }

    /**
     * ??includedmodedeclarationgroupsets?????
     * 
     * @return
     *     possible object is
     *     {@link SWCINTERNALBEHAVIOR.INCLUDEDMODEDECLARATIONGROUPSETS }
     *     
     */
    public SWCINTERNALBEHAVIOR.INCLUDEDMODEDECLARATIONGROUPSETS getINCLUDEDMODEDECLARATIONGROUPSETS() {
        return includedmodedeclarationgroupsets;
    }

    /**
     * ??includedmodedeclarationgroupsets?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWCINTERNALBEHAVIOR.INCLUDEDMODEDECLARATIONGROUPSETS }
     *     
     */
    public void setINCLUDEDMODEDECLARATIONGROUPSETS(SWCINTERNALBEHAVIOR.INCLUDEDMODEDECLARATIONGROUPSETS value) {
        this.includedmodedeclarationgroupsets = value;
    }

    /**
     * ??instantiationdatadefpropss?????
     * 
     * @return
     *     possible object is
     *     {@link SWCINTERNALBEHAVIOR.INSTANTIATIONDATADEFPROPSS }
     *     
     */
    public SWCINTERNALBEHAVIOR.INSTANTIATIONDATADEFPROPSS getINSTANTIATIONDATADEFPROPSS() {
        return instantiationdatadefpropss;
    }

    /**
     * ??instantiationdatadefpropss?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWCINTERNALBEHAVIOR.INSTANTIATIONDATADEFPROPSS }
     *     
     */
    public void setINSTANTIATIONDATADEFPROPSS(SWCINTERNALBEHAVIOR.INSTANTIATIONDATADEFPROPSS value) {
        this.instantiationdatadefpropss = value;
    }

    /**
     * ??perinstancememorys?????
     * 
     * @return
     *     possible object is
     *     {@link SWCINTERNALBEHAVIOR.PERINSTANCEMEMORYS }
     *     
     */
    public SWCINTERNALBEHAVIOR.PERINSTANCEMEMORYS getPERINSTANCEMEMORYS() {
        return perinstancememorys;
    }

    /**
     * ??perinstancememorys?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWCINTERNALBEHAVIOR.PERINSTANCEMEMORYS }
     *     
     */
    public void setPERINSTANCEMEMORYS(SWCINTERNALBEHAVIOR.PERINSTANCEMEMORYS value) {
        this.perinstancememorys = value;
    }

    /**
     * ??perinstanceparameters?????
     * 
     * @return
     *     possible object is
     *     {@link SWCINTERNALBEHAVIOR.PERINSTANCEPARAMETERS }
     *     
     */
    public SWCINTERNALBEHAVIOR.PERINSTANCEPARAMETERS getPERINSTANCEPARAMETERS() {
        return perinstanceparameters;
    }

    /**
     * ??perinstanceparameters?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWCINTERNALBEHAVIOR.PERINSTANCEPARAMETERS }
     *     
     */
    public void setPERINSTANCEPARAMETERS(SWCINTERNALBEHAVIOR.PERINSTANCEPARAMETERS value) {
        this.perinstanceparameters = value;
    }

    /**
     * ??portapioptions?????
     * 
     * @return
     *     possible object is
     *     {@link SWCINTERNALBEHAVIOR.PORTAPIOPTIONS }
     *     
     */
    public SWCINTERNALBEHAVIOR.PORTAPIOPTIONS getPORTAPIOPTIONS() {
        return portapioptions;
    }

    /**
     * ??portapioptions?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWCINTERNALBEHAVIOR.PORTAPIOPTIONS }
     *     
     */
    public void setPORTAPIOPTIONS(SWCINTERNALBEHAVIOR.PORTAPIOPTIONS value) {
        this.portapioptions = value;
    }

    /**
     * ??runnables?????
     * 
     * @return
     *     possible object is
     *     {@link SWCINTERNALBEHAVIOR.RUNNABLES }
     *     
     */
    public SWCINTERNALBEHAVIOR.RUNNABLES getRUNNABLES() {
        return runnables;
    }

    /**
     * ??runnables?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWCINTERNALBEHAVIOR.RUNNABLES }
     *     
     */
    public void setRUNNABLES(SWCINTERNALBEHAVIOR.RUNNABLES value) {
        this.runnables = value;
    }

    /**
     * ??servicedependencys?????
     * 
     * @return
     *     possible object is
     *     {@link SWCINTERNALBEHAVIOR.SERVICEDEPENDENCYS }
     *     
     */
    public SWCINTERNALBEHAVIOR.SERVICEDEPENDENCYS getSERVICEDEPENDENCYS() {
        return servicedependencys;
    }

    /**
     * ??servicedependencys?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWCINTERNALBEHAVIOR.SERVICEDEPENDENCYS }
     *     
     */
    public void setSERVICEDEPENDENCYS(SWCINTERNALBEHAVIOR.SERVICEDEPENDENCYS value) {
        this.servicedependencys = value;
    }

    /**
     * ??sharedparameters?????
     * 
     * @return
     *     possible object is
     *     {@link SWCINTERNALBEHAVIOR.SHAREDPARAMETERS }
     *     
     */
    public SWCINTERNALBEHAVIOR.SHAREDPARAMETERS getSHAREDPARAMETERS() {
        return sharedparameters;
    }

    /**
     * ??sharedparameters?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWCINTERNALBEHAVIOR.SHAREDPARAMETERS }
     *     
     */
    public void setSHAREDPARAMETERS(SWCINTERNALBEHAVIOR.SHAREDPARAMETERS value) {
        this.sharedparameters = value;
    }

    /**
     * ??supportsmultipleinstantiation?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getSUPPORTSMULTIPLEINSTANTIATION() {
        return supportsmultipleinstantiation;
    }

    /**
     * ??supportsmultipleinstantiation?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setSUPPORTSMULTIPLEINSTANTIATION(BOOLEAN value) {
        this.supportsmultipleinstantiation = value;
    }

    /**
     * ??variationpointproxys?????
     * 
     * @return
     *     possible object is
     *     {@link SWCINTERNALBEHAVIOR.VARIATIONPOINTPROXYS }
     *     
     */
    public SWCINTERNALBEHAVIOR.VARIATIONPOINTPROXYS getVARIATIONPOINTPROXYS() {
        return variationpointproxys;
    }

    /**
     * ??variationpointproxys?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWCINTERNALBEHAVIOR.VARIATIONPOINTPROXYS }
     *     
     */
    public void setVARIATIONPOINTPROXYS(SWCINTERNALBEHAVIOR.VARIATIONPOINTPROXYS value) {
        this.variationpointproxys = value;
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
     *         &lt;element name="VARIABLE-DATA-PROTOTYPE" type="{http://autosar.org/schema/r4.0}VARIABLE-DATA-PROTOTYPE"/>
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
        "variabledataprototype"
    })
    public static class ARTYPEDPERINSTANCEMEMORYS {

        @XmlElement(name = "VARIABLE-DATA-PROTOTYPE")
        protected List<VARIABLEDATAPROTOTYPE> variabledataprototype;

        /**
         * Gets the value of the variabledataprototype property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the variabledataprototype property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVARIABLEDATAPROTOTYPE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VARIABLEDATAPROTOTYPE }
         * 
         * 
         */
        public List<VARIABLEDATAPROTOTYPE> getVARIABLEDATAPROTOTYPE() {
            if (variabledataprototype == null) {
                variabledataprototype = new ArrayList<VARIABLEDATAPROTOTYPE>();
            }
            return this.variabledataprototype;
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
     *         &lt;element name="ASYNCHRONOUS-SERVER-CALL-RETURNS-EVENT" type="{http://autosar.org/schema/r4.0}ASYNCHRONOUS-SERVER-CALL-RETURNS-EVENT"/>
     *         &lt;element name="BACKGROUND-EVENT" type="{http://autosar.org/schema/r4.0}BACKGROUND-EVENT"/>
     *         &lt;element name="DATA-RECEIVE-ERROR-EVENT" type="{http://autosar.org/schema/r4.0}DATA-RECEIVE-ERROR-EVENT"/>
     *         &lt;element name="DATA-RECEIVED-EVENT" type="{http://autosar.org/schema/r4.0}DATA-RECEIVED-EVENT"/>
     *         &lt;element name="DATA-SEND-COMPLETED-EVENT" type="{http://autosar.org/schema/r4.0}DATA-SEND-COMPLETED-EVENT"/>
     *         &lt;element name="DATA-WRITE-COMPLETED-EVENT" type="{http://autosar.org/schema/r4.0}DATA-WRITE-COMPLETED-EVENT"/>
     *         &lt;element name="EXTERNAL-TRIGGER-OCCURRED-EVENT" type="{http://autosar.org/schema/r4.0}EXTERNAL-TRIGGER-OCCURRED-EVENT"/>
     *         &lt;element name="INIT-EVENT" type="{http://autosar.org/schema/r4.0}INIT-EVENT"/>
     *         &lt;element name="INTERNAL-TRIGGER-OCCURRED-EVENT" type="{http://autosar.org/schema/r4.0}INTERNAL-TRIGGER-OCCURRED-EVENT"/>
     *         &lt;element name="MODE-SWITCHED-ACK-EVENT" type="{http://autosar.org/schema/r4.0}MODE-SWITCHED-ACK-EVENT"/>
     *         &lt;element name="OPERATION-INVOKED-EVENT" type="{http://autosar.org/schema/r4.0}OPERATION-INVOKED-EVENT"/>
     *         &lt;element name="SWC-MODE-MANAGER-ERROR-EVENT" type="{http://autosar.org/schema/r4.0}SWC-MODE-MANAGER-ERROR-EVENT"/>
     *         &lt;element name="SWC-MODE-SWITCH-EVENT" type="{http://autosar.org/schema/r4.0}SWC-MODE-SWITCH-EVENT"/>
     *         &lt;element name="TIMING-EVENT" type="{http://autosar.org/schema/r4.0}TIMING-EVENT"/>
     *         &lt;element name="TRANSFORMER-HARD-ERROR-EVENT" type="{http://autosar.org/schema/r4.0}TRANSFORMER-HARD-ERROR-EVENT"/>
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
        "asynchronousservercallreturnseventOrBACKGROUNDEVENTOrDATARECEIVEERROREVENT"
    })
    public static class EVENTS {

        @XmlElements({
            @XmlElement(name = "ASYNCHRONOUS-SERVER-CALL-RETURNS-EVENT", type = ASYNCHRONOUSSERVERCALLRETURNSEVENT.class),
            @XmlElement(name = "BACKGROUND-EVENT", type = BACKGROUNDEVENT.class),
            @XmlElement(name = "DATA-RECEIVE-ERROR-EVENT", type = DATARECEIVEERROREVENT.class),
            @XmlElement(name = "DATA-RECEIVED-EVENT", type = DATARECEIVEDEVENT.class),
            @XmlElement(name = "DATA-SEND-COMPLETED-EVENT", type = DATASENDCOMPLETEDEVENT.class),
            @XmlElement(name = "DATA-WRITE-COMPLETED-EVENT", type = DATAWRITECOMPLETEDEVENT.class),
            @XmlElement(name = "EXTERNAL-TRIGGER-OCCURRED-EVENT", type = EXTERNALTRIGGEROCCURREDEVENT.class),
            @XmlElement(name = "INIT-EVENT", type = INITEVENT.class),
            @XmlElement(name = "INTERNAL-TRIGGER-OCCURRED-EVENT", type = INTERNALTRIGGEROCCURREDEVENT.class),
            @XmlElement(name = "MODE-SWITCHED-ACK-EVENT", type = MODESWITCHEDACKEVENT.class),
            @XmlElement(name = "OPERATION-INVOKED-EVENT", type = OPERATIONINVOKEDEVENT.class),
            @XmlElement(name = "SWC-MODE-MANAGER-ERROR-EVENT", type = SWCMODEMANAGERERROREVENT.class),
            @XmlElement(name = "SWC-MODE-SWITCH-EVENT", type = SWCMODESWITCHEVENT.class),
            @XmlElement(name = "TIMING-EVENT", type = TIMINGEVENT.class),
            @XmlElement(name = "TRANSFORMER-HARD-ERROR-EVENT", type = TRANSFORMERHARDERROREVENT.class)
        })
        protected List<Object> asynchronousservercallreturnseventOrBACKGROUNDEVENTOrDATARECEIVEERROREVENT;

        /**
         * Gets the value of the asynchronousservercallreturnseventOrBACKGROUNDEVENTOrDATARECEIVEERROREVENT property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the asynchronousservercallreturnseventOrBACKGROUNDEVENTOrDATARECEIVEERROREVENT property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getASYNCHRONOUSSERVERCALLRETURNSEVENTOrBACKGROUNDEVENTOrDATARECEIVEERROREVENT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ASYNCHRONOUSSERVERCALLRETURNSEVENT }
         * {@link BACKGROUNDEVENT }
         * {@link DATARECEIVEERROREVENT }
         * {@link DATARECEIVEDEVENT }
         * {@link DATASENDCOMPLETEDEVENT }
         * {@link DATAWRITECOMPLETEDEVENT }
         * {@link EXTERNALTRIGGEROCCURREDEVENT }
         * {@link INITEVENT }
         * {@link INTERNALTRIGGEROCCURREDEVENT }
         * {@link MODESWITCHEDACKEVENT }
         * {@link OPERATIONINVOKEDEVENT }
         * {@link SWCMODEMANAGERERROREVENT }
         * {@link SWCMODESWITCHEVENT }
         * {@link TIMINGEVENT }
         * {@link TRANSFORMERHARDERROREVENT }
         * 
         * 
         */
        public List<Object> getASYNCHRONOUSSERVERCALLRETURNSEVENTOrBACKGROUNDEVENTOrDATARECEIVEERROREVENT() {
            if (asynchronousservercallreturnseventOrBACKGROUNDEVENTOrDATARECEIVEERROREVENT == null) {
                asynchronousservercallreturnseventOrBACKGROUNDEVENTOrDATARECEIVEERROREVENT = new ArrayList<Object>();
            }
            return this.asynchronousservercallreturnseventOrBACKGROUNDEVENTOrDATARECEIVEERROREVENT;
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
     *         &lt;element name="VARIABLE-DATA-PROTOTYPE" type="{http://autosar.org/schema/r4.0}VARIABLE-DATA-PROTOTYPE"/>
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
        "variabledataprototype"
    })
    public static class EXPLICITINTERRUNNABLEVARIABLES {

        @XmlElement(name = "VARIABLE-DATA-PROTOTYPE")
        protected List<VARIABLEDATAPROTOTYPE> variabledataprototype;

        /**
         * Gets the value of the variabledataprototype property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the variabledataprototype property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVARIABLEDATAPROTOTYPE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VARIABLEDATAPROTOTYPE }
         * 
         * 
         */
        public List<VARIABLEDATAPROTOTYPE> getVARIABLEDATAPROTOTYPE() {
            if (variabledataprototype == null) {
                variabledataprototype = new ArrayList<VARIABLEDATAPROTOTYPE>();
            }
            return this.variabledataprototype;
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
     *         &lt;element name="VARIABLE-DATA-PROTOTYPE" type="{http://autosar.org/schema/r4.0}VARIABLE-DATA-PROTOTYPE"/>
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
        "variabledataprototype"
    })
    public static class IMPLICITINTERRUNNABLEVARIABLES {

        @XmlElement(name = "VARIABLE-DATA-PROTOTYPE")
        protected List<VARIABLEDATAPROTOTYPE> variabledataprototype;

        /**
         * Gets the value of the variabledataprototype property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the variabledataprototype property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVARIABLEDATAPROTOTYPE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VARIABLEDATAPROTOTYPE }
         * 
         * 
         */
        public List<VARIABLEDATAPROTOTYPE> getVARIABLEDATAPROTOTYPE() {
            if (variabledataprototype == null) {
                variabledataprototype = new ArrayList<VARIABLEDATAPROTOTYPE>();
            }
            return this.variabledataprototype;
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
     *         &lt;element name="INCLUDED-DATA-TYPE-SET" type="{http://autosar.org/schema/r4.0}INCLUDED-DATA-TYPE-SET"/>
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
        "includeddatatypeset"
    })
    public static class INCLUDEDDATATYPESETS {

        @XmlElement(name = "INCLUDED-DATA-TYPE-SET")
        protected List<INCLUDEDDATATYPESET> includeddatatypeset;

        /**
         * Gets the value of the includeddatatypeset property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the includeddatatypeset property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getINCLUDEDDATATYPESET().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link INCLUDEDDATATYPESET }
         * 
         * 
         */
        public List<INCLUDEDDATATYPESET> getINCLUDEDDATATYPESET() {
            if (includeddatatypeset == null) {
                includeddatatypeset = new ArrayList<INCLUDEDDATATYPESET>();
            }
            return this.includeddatatypeset;
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
     *         &lt;element name="INCLUDED-MODE-DECLARATION-GROUP-SET" type="{http://autosar.org/schema/r4.0}INCLUDED-MODE-DECLARATION-GROUP-SET"/>
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
        "includedmodedeclarationgroupset"
    })
    public static class INCLUDEDMODEDECLARATIONGROUPSETS {

        @XmlElement(name = "INCLUDED-MODE-DECLARATION-GROUP-SET")
        protected List<INCLUDEDMODEDECLARATIONGROUPSET> includedmodedeclarationgroupset;

        /**
         * Gets the value of the includedmodedeclarationgroupset property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the includedmodedeclarationgroupset property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getINCLUDEDMODEDECLARATIONGROUPSET().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link INCLUDEDMODEDECLARATIONGROUPSET }
         * 
         * 
         */
        public List<INCLUDEDMODEDECLARATIONGROUPSET> getINCLUDEDMODEDECLARATIONGROUPSET() {
            if (includedmodedeclarationgroupset == null) {
                includedmodedeclarationgroupset = new ArrayList<INCLUDEDMODEDECLARATIONGROUPSET>();
            }
            return this.includedmodedeclarationgroupset;
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
     *         &lt;element name="INSTANTIATION-DATA-DEF-PROPS" type="{http://autosar.org/schema/r4.0}INSTANTIATION-DATA-DEF-PROPS"/>
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
        "instantiationdatadefprops"
    })
    public static class INSTANTIATIONDATADEFPROPSS {

        @XmlElement(name = "INSTANTIATION-DATA-DEF-PROPS")
        protected List<INSTANTIATIONDATADEFPROPS> instantiationdatadefprops;

        /**
         * Gets the value of the instantiationdatadefprops property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the instantiationdatadefprops property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getINSTANTIATIONDATADEFPROPS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link INSTANTIATIONDATADEFPROPS }
         * 
         * 
         */
        public List<INSTANTIATIONDATADEFPROPS> getINSTANTIATIONDATADEFPROPS() {
            if (instantiationdatadefprops == null) {
                instantiationdatadefprops = new ArrayList<INSTANTIATIONDATADEFPROPS>();
            }
            return this.instantiationdatadefprops;
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
     *         &lt;element name="PER-INSTANCE-MEMORY" type="{http://autosar.org/schema/r4.0}PER-INSTANCE-MEMORY"/>
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
        "perinstancememory"
    })
    public static class PERINSTANCEMEMORYS {

        @XmlElement(name = "PER-INSTANCE-MEMORY")
        protected List<PERINSTANCEMEMORY> perinstancememory;

        /**
         * Gets the value of the perinstancememory property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the perinstancememory property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPERINSTANCEMEMORY().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PERINSTANCEMEMORY }
         * 
         * 
         */
        public List<PERINSTANCEMEMORY> getPERINSTANCEMEMORY() {
            if (perinstancememory == null) {
                perinstancememory = new ArrayList<PERINSTANCEMEMORY>();
            }
            return this.perinstancememory;
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
     *         &lt;element name="PARAMETER-DATA-PROTOTYPE" type="{http://autosar.org/schema/r4.0}PARAMETER-DATA-PROTOTYPE"/>
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
        "parameterdataprototype"
    })
    public static class PERINSTANCEPARAMETERS {

        @XmlElement(name = "PARAMETER-DATA-PROTOTYPE")
        protected List<PARAMETERDATAPROTOTYPE> parameterdataprototype;

        /**
         * Gets the value of the parameterdataprototype property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the parameterdataprototype property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPARAMETERDATAPROTOTYPE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PARAMETERDATAPROTOTYPE }
         * 
         * 
         */
        public List<PARAMETERDATAPROTOTYPE> getPARAMETERDATAPROTOTYPE() {
            if (parameterdataprototype == null) {
                parameterdataprototype = new ArrayList<PARAMETERDATAPROTOTYPE>();
            }
            return this.parameterdataprototype;
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
     *         &lt;element name="PORT-API-OPTION" type="{http://autosar.org/schema/r4.0}PORT-API-OPTION"/>
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
        "portapioption"
    })
    public static class PORTAPIOPTIONS {

        @XmlElement(name = "PORT-API-OPTION")
        protected List<PORTAPIOPTION> portapioption;

        /**
         * Gets the value of the portapioption property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the portapioption property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPORTAPIOPTION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PORTAPIOPTION }
         * 
         * 
         */
        public List<PORTAPIOPTION> getPORTAPIOPTION() {
            if (portapioption == null) {
                portapioption = new ArrayList<PORTAPIOPTION>();
            }
            return this.portapioption;
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
     *         &lt;element name="RUNNABLE-ENTITY" type="{http://autosar.org/schema/r4.0}RUNNABLE-ENTITY"/>
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
        "runnableentity"
    })
    public static class RUNNABLES {

        @XmlElement(name = "RUNNABLE-ENTITY")
        protected List<RUNNABLEENTITY> runnableentity;

        /**
         * Gets the value of the runnableentity property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the runnableentity property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRUNNABLEENTITY().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RUNNABLEENTITY }
         * 
         * 
         */
        public List<RUNNABLEENTITY> getRUNNABLEENTITY() {
            if (runnableentity == null) {
                runnableentity = new ArrayList<RUNNABLEENTITY>();
            }
            return this.runnableentity;
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
     *         &lt;element name="SWC-SERVICE-DEPENDENCY" type="{http://autosar.org/schema/r4.0}SWC-SERVICE-DEPENDENCY"/>
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
        "swcservicedependency"
    })
    public static class SERVICEDEPENDENCYS {

        @XmlElement(name = "SWC-SERVICE-DEPENDENCY")
        protected List<SWCSERVICEDEPENDENCY> swcservicedependency;

        /**
         * Gets the value of the swcservicedependency property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the swcservicedependency property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSWCSERVICEDEPENDENCY().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SWCSERVICEDEPENDENCY }
         * 
         * 
         */
        public List<SWCSERVICEDEPENDENCY> getSWCSERVICEDEPENDENCY() {
            if (swcservicedependency == null) {
                swcservicedependency = new ArrayList<SWCSERVICEDEPENDENCY>();
            }
            return this.swcservicedependency;
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
     *         &lt;element name="PARAMETER-DATA-PROTOTYPE" type="{http://autosar.org/schema/r4.0}PARAMETER-DATA-PROTOTYPE"/>
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
        "parameterdataprototype"
    })
    public static class SHAREDPARAMETERS {

        @XmlElement(name = "PARAMETER-DATA-PROTOTYPE")
        protected List<PARAMETERDATAPROTOTYPE> parameterdataprototype;

        /**
         * Gets the value of the parameterdataprototype property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the parameterdataprototype property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPARAMETERDATAPROTOTYPE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PARAMETERDATAPROTOTYPE }
         * 
         * 
         */
        public List<PARAMETERDATAPROTOTYPE> getPARAMETERDATAPROTOTYPE() {
            if (parameterdataprototype == null) {
                parameterdataprototype = new ArrayList<PARAMETERDATAPROTOTYPE>();
            }
            return this.parameterdataprototype;
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
     *         &lt;element name="VARIATION-POINT-PROXY" type="{http://autosar.org/schema/r4.0}VARIATION-POINT-PROXY"/>
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
        "variationpointproxy"
    })
    public static class VARIATIONPOINTPROXYS {

        @XmlElement(name = "VARIATION-POINT-PROXY")
        protected List<VARIATIONPOINTPROXY> variationpointproxy;

        /**
         * Gets the value of the variationpointproxy property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the variationpointproxy property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVARIATIONPOINTPROXY().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VARIATIONPOINTPROXY }
         * 
         * 
         */
        public List<VARIATIONPOINTPROXY> getVARIATIONPOINTPROXY() {
            if (variationpointproxy == null) {
                variationpointproxy = new ArrayList<VARIATIONPOINTPROXY>();
            }
            return this.variationpointproxy;
        }

    }

}
