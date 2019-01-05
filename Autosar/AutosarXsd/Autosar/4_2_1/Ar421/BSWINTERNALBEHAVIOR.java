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
 * Specifies the behavior of a BSW module or a BSW cluster w.r.t. the code entities visible by the BSW Scheduler.
 * It is possible to have several different BswInternalBehaviors referring to the same BswModuleDescription.
 * 
 * <p>BSW-INTERNAL-BEHAVIOR complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="BSW-INTERNAL-BEHAVIOR">
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
 *         &lt;group ref="{http://autosar.org/schema/r4.0}BSW-INTERNAL-BEHAVIOR"/>
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
@XmlType(name = "BSW-INTERNAL-BEHAVIOR", propOrder = {
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
    "clientpolicys",
    "exclusiveareapolicys",
    "includeddatatypesets",
    "internaltriggeringpointpolicys",
    "parameterpolicys",
    "releasedtriggerpolicys",
    "sendpolicys",
    "variationpointproxys",
    "internaltriggeringpoints",
    "entitys",
    "events",
    "triggerdirectimplementations",
    "modesenderpolicys",
    "modereceiverpolicys",
    "servicedependencys",
    "perinstanceparameters",
    "schedulernameprefixs",
    "receptionpolicys",
    "distinguishedpartitions"
})
public class BSWINTERNALBEHAVIOR {

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
    protected BSWINTERNALBEHAVIOR.CONSTANTMEMORYS constantmemorys;
    @XmlElement(name = "CONSTANT-VALUE-MAPPING-REFS")
    protected BSWINTERNALBEHAVIOR.CONSTANTVALUEMAPPINGREFS constantvaluemappingrefs;
    @XmlElement(name = "DATA-TYPE-MAPPING-REFS")
    protected BSWINTERNALBEHAVIOR.DATATYPEMAPPINGREFS datatypemappingrefs;
    @XmlElement(name = "EXCLUSIVE-AREAS")
    protected BSWINTERNALBEHAVIOR.EXCLUSIVEAREAS exclusiveareas;
    @XmlElement(name = "EXCLUSIVE-AREA-NESTING-ORDERS")
    protected BSWINTERNALBEHAVIOR.EXCLUSIVEAREANESTINGORDERS exclusiveareanestingorders;
    @XmlElement(name = "STATIC-MEMORYS")
    protected BSWINTERNALBEHAVIOR.STATICMEMORYS staticmemorys;
    @XmlElement(name = "CLIENT-POLICYS")
    protected BSWINTERNALBEHAVIOR.CLIENTPOLICYS clientpolicys;
    @XmlElement(name = "EXCLUSIVE-AREA-POLICYS")
    protected BSWINTERNALBEHAVIOR.EXCLUSIVEAREAPOLICYS exclusiveareapolicys;
    @XmlElement(name = "INCLUDED-DATA-TYPE-SETS")
    protected BSWINTERNALBEHAVIOR.INCLUDEDDATATYPESETS includeddatatypesets;
    @XmlElement(name = "INTERNAL-TRIGGERING-POINT-POLICYS")
    protected BSWINTERNALBEHAVIOR.INTERNALTRIGGERINGPOINTPOLICYS internaltriggeringpointpolicys;
    @XmlElement(name = "PARAMETER-POLICYS")
    protected BSWINTERNALBEHAVIOR.PARAMETERPOLICYS parameterpolicys;
    @XmlElement(name = "RELEASED-TRIGGER-POLICYS")
    protected BSWINTERNALBEHAVIOR.RELEASEDTRIGGERPOLICYS releasedtriggerpolicys;
    @XmlElement(name = "SEND-POLICYS")
    protected BSWINTERNALBEHAVIOR.SENDPOLICYS sendpolicys;
    @XmlElement(name = "VARIATION-POINT-PROXYS")
    protected BSWINTERNALBEHAVIOR.VARIATIONPOINTPROXYS variationpointproxys;
    @XmlElement(name = "INTERNAL-TRIGGERING-POINTS")
    protected BSWINTERNALBEHAVIOR.INTERNALTRIGGERINGPOINTS internaltriggeringpoints;
    @XmlElement(name = "ENTITYS")
    protected BSWINTERNALBEHAVIOR.ENTITYS entitys;
    @XmlElement(name = "EVENTS")
    protected BSWINTERNALBEHAVIOR.EVENTS events;
    @XmlElement(name = "TRIGGER-DIRECT-IMPLEMENTATIONS")
    protected BSWINTERNALBEHAVIOR.TRIGGERDIRECTIMPLEMENTATIONS triggerdirectimplementations;
    @XmlElement(name = "MODE-SENDER-POLICYS")
    protected BSWINTERNALBEHAVIOR.MODESENDERPOLICYS modesenderpolicys;
    @XmlElement(name = "MODE-RECEIVER-POLICYS")
    protected BSWINTERNALBEHAVIOR.MODERECEIVERPOLICYS modereceiverpolicys;
    @XmlElement(name = "SERVICE-DEPENDENCYS")
    protected BSWINTERNALBEHAVIOR.SERVICEDEPENDENCYS servicedependencys;
    @XmlElement(name = "PER-INSTANCE-PARAMETERS")
    protected BSWINTERNALBEHAVIOR.PERINSTANCEPARAMETERS perinstanceparameters;
    @XmlElement(name = "SCHEDULER-NAME-PREFIXS")
    protected BSWINTERNALBEHAVIOR.SCHEDULERNAMEPREFIXS schedulernameprefixs;
    @XmlElement(name = "RECEPTION-POLICYS")
    protected BSWINTERNALBEHAVIOR.RECEPTIONPOLICYS receptionpolicys;
    @XmlElement(name = "DISTINGUISHED-PARTITIONS")
    protected BSWINTERNALBEHAVIOR.DISTINGUISHEDPARTITIONS distinguishedpartitions;
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
     *     {@link BSWINTERNALBEHAVIOR.CONSTANTMEMORYS }
     *     
     */
    public BSWINTERNALBEHAVIOR.CONSTANTMEMORYS getCONSTANTMEMORYS() {
        return constantmemorys;
    }

    /**
     * ??constantmemorys?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWINTERNALBEHAVIOR.CONSTANTMEMORYS }
     *     
     */
    public void setCONSTANTMEMORYS(BSWINTERNALBEHAVIOR.CONSTANTMEMORYS value) {
        this.constantmemorys = value;
    }

    /**
     * ??constantvaluemappingrefs?????
     * 
     * @return
     *     possible object is
     *     {@link BSWINTERNALBEHAVIOR.CONSTANTVALUEMAPPINGREFS }
     *     
     */
    public BSWINTERNALBEHAVIOR.CONSTANTVALUEMAPPINGREFS getCONSTANTVALUEMAPPINGREFS() {
        return constantvaluemappingrefs;
    }

    /**
     * ??constantvaluemappingrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWINTERNALBEHAVIOR.CONSTANTVALUEMAPPINGREFS }
     *     
     */
    public void setCONSTANTVALUEMAPPINGREFS(BSWINTERNALBEHAVIOR.CONSTANTVALUEMAPPINGREFS value) {
        this.constantvaluemappingrefs = value;
    }

    /**
     * ??datatypemappingrefs?????
     * 
     * @return
     *     possible object is
     *     {@link BSWINTERNALBEHAVIOR.DATATYPEMAPPINGREFS }
     *     
     */
    public BSWINTERNALBEHAVIOR.DATATYPEMAPPINGREFS getDATATYPEMAPPINGREFS() {
        return datatypemappingrefs;
    }

    /**
     * ??datatypemappingrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWINTERNALBEHAVIOR.DATATYPEMAPPINGREFS }
     *     
     */
    public void setDATATYPEMAPPINGREFS(BSWINTERNALBEHAVIOR.DATATYPEMAPPINGREFS value) {
        this.datatypemappingrefs = value;
    }

    /**
     * ??exclusiveareas?????
     * 
     * @return
     *     possible object is
     *     {@link BSWINTERNALBEHAVIOR.EXCLUSIVEAREAS }
     *     
     */
    public BSWINTERNALBEHAVIOR.EXCLUSIVEAREAS getEXCLUSIVEAREAS() {
        return exclusiveareas;
    }

    /**
     * ??exclusiveareas?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWINTERNALBEHAVIOR.EXCLUSIVEAREAS }
     *     
     */
    public void setEXCLUSIVEAREAS(BSWINTERNALBEHAVIOR.EXCLUSIVEAREAS value) {
        this.exclusiveareas = value;
    }

    /**
     * ??exclusiveareanestingorders?????
     * 
     * @return
     *     possible object is
     *     {@link BSWINTERNALBEHAVIOR.EXCLUSIVEAREANESTINGORDERS }
     *     
     */
    public BSWINTERNALBEHAVIOR.EXCLUSIVEAREANESTINGORDERS getEXCLUSIVEAREANESTINGORDERS() {
        return exclusiveareanestingorders;
    }

    /**
     * ??exclusiveareanestingorders?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWINTERNALBEHAVIOR.EXCLUSIVEAREANESTINGORDERS }
     *     
     */
    public void setEXCLUSIVEAREANESTINGORDERS(BSWINTERNALBEHAVIOR.EXCLUSIVEAREANESTINGORDERS value) {
        this.exclusiveareanestingorders = value;
    }

    /**
     * ??staticmemorys?????
     * 
     * @return
     *     possible object is
     *     {@link BSWINTERNALBEHAVIOR.STATICMEMORYS }
     *     
     */
    public BSWINTERNALBEHAVIOR.STATICMEMORYS getSTATICMEMORYS() {
        return staticmemorys;
    }

    /**
     * ??staticmemorys?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWINTERNALBEHAVIOR.STATICMEMORYS }
     *     
     */
    public void setSTATICMEMORYS(BSWINTERNALBEHAVIOR.STATICMEMORYS value) {
        this.staticmemorys = value;
    }

    /**
     * ??clientpolicys?????
     * 
     * @return
     *     possible object is
     *     {@link BSWINTERNALBEHAVIOR.CLIENTPOLICYS }
     *     
     */
    public BSWINTERNALBEHAVIOR.CLIENTPOLICYS getCLIENTPOLICYS() {
        return clientpolicys;
    }

    /**
     * ??clientpolicys?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWINTERNALBEHAVIOR.CLIENTPOLICYS }
     *     
     */
    public void setCLIENTPOLICYS(BSWINTERNALBEHAVIOR.CLIENTPOLICYS value) {
        this.clientpolicys = value;
    }

    /**
     * ??exclusiveareapolicys?????
     * 
     * @return
     *     possible object is
     *     {@link BSWINTERNALBEHAVIOR.EXCLUSIVEAREAPOLICYS }
     *     
     */
    public BSWINTERNALBEHAVIOR.EXCLUSIVEAREAPOLICYS getEXCLUSIVEAREAPOLICYS() {
        return exclusiveareapolicys;
    }

    /**
     * ??exclusiveareapolicys?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWINTERNALBEHAVIOR.EXCLUSIVEAREAPOLICYS }
     *     
     */
    public void setEXCLUSIVEAREAPOLICYS(BSWINTERNALBEHAVIOR.EXCLUSIVEAREAPOLICYS value) {
        this.exclusiveareapolicys = value;
    }

    /**
     * ??includeddatatypesets?????
     * 
     * @return
     *     possible object is
     *     {@link BSWINTERNALBEHAVIOR.INCLUDEDDATATYPESETS }
     *     
     */
    public BSWINTERNALBEHAVIOR.INCLUDEDDATATYPESETS getINCLUDEDDATATYPESETS() {
        return includeddatatypesets;
    }

    /**
     * ??includeddatatypesets?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWINTERNALBEHAVIOR.INCLUDEDDATATYPESETS }
     *     
     */
    public void setINCLUDEDDATATYPESETS(BSWINTERNALBEHAVIOR.INCLUDEDDATATYPESETS value) {
        this.includeddatatypesets = value;
    }

    /**
     * ??internaltriggeringpointpolicys?????
     * 
     * @return
     *     possible object is
     *     {@link BSWINTERNALBEHAVIOR.INTERNALTRIGGERINGPOINTPOLICYS }
     *     
     */
    public BSWINTERNALBEHAVIOR.INTERNALTRIGGERINGPOINTPOLICYS getINTERNALTRIGGERINGPOINTPOLICYS() {
        return internaltriggeringpointpolicys;
    }

    /**
     * ??internaltriggeringpointpolicys?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWINTERNALBEHAVIOR.INTERNALTRIGGERINGPOINTPOLICYS }
     *     
     */
    public void setINTERNALTRIGGERINGPOINTPOLICYS(BSWINTERNALBEHAVIOR.INTERNALTRIGGERINGPOINTPOLICYS value) {
        this.internaltriggeringpointpolicys = value;
    }

    /**
     * ??parameterpolicys?????
     * 
     * @return
     *     possible object is
     *     {@link BSWINTERNALBEHAVIOR.PARAMETERPOLICYS }
     *     
     */
    public BSWINTERNALBEHAVIOR.PARAMETERPOLICYS getPARAMETERPOLICYS() {
        return parameterpolicys;
    }

    /**
     * ??parameterpolicys?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWINTERNALBEHAVIOR.PARAMETERPOLICYS }
     *     
     */
    public void setPARAMETERPOLICYS(BSWINTERNALBEHAVIOR.PARAMETERPOLICYS value) {
        this.parameterpolicys = value;
    }

    /**
     * ??releasedtriggerpolicys?????
     * 
     * @return
     *     possible object is
     *     {@link BSWINTERNALBEHAVIOR.RELEASEDTRIGGERPOLICYS }
     *     
     */
    public BSWINTERNALBEHAVIOR.RELEASEDTRIGGERPOLICYS getRELEASEDTRIGGERPOLICYS() {
        return releasedtriggerpolicys;
    }

    /**
     * ??releasedtriggerpolicys?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWINTERNALBEHAVIOR.RELEASEDTRIGGERPOLICYS }
     *     
     */
    public void setRELEASEDTRIGGERPOLICYS(BSWINTERNALBEHAVIOR.RELEASEDTRIGGERPOLICYS value) {
        this.releasedtriggerpolicys = value;
    }

    /**
     * ??sendpolicys?????
     * 
     * @return
     *     possible object is
     *     {@link BSWINTERNALBEHAVIOR.SENDPOLICYS }
     *     
     */
    public BSWINTERNALBEHAVIOR.SENDPOLICYS getSENDPOLICYS() {
        return sendpolicys;
    }

    /**
     * ??sendpolicys?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWINTERNALBEHAVIOR.SENDPOLICYS }
     *     
     */
    public void setSENDPOLICYS(BSWINTERNALBEHAVIOR.SENDPOLICYS value) {
        this.sendpolicys = value;
    }

    /**
     * ??variationpointproxys?????
     * 
     * @return
     *     possible object is
     *     {@link BSWINTERNALBEHAVIOR.VARIATIONPOINTPROXYS }
     *     
     */
    public BSWINTERNALBEHAVIOR.VARIATIONPOINTPROXYS getVARIATIONPOINTPROXYS() {
        return variationpointproxys;
    }

    /**
     * ??variationpointproxys?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWINTERNALBEHAVIOR.VARIATIONPOINTPROXYS }
     *     
     */
    public void setVARIATIONPOINTPROXYS(BSWINTERNALBEHAVIOR.VARIATIONPOINTPROXYS value) {
        this.variationpointproxys = value;
    }

    /**
     * ??internaltriggeringpoints?????
     * 
     * @return
     *     possible object is
     *     {@link BSWINTERNALBEHAVIOR.INTERNALTRIGGERINGPOINTS }
     *     
     */
    public BSWINTERNALBEHAVIOR.INTERNALTRIGGERINGPOINTS getINTERNALTRIGGERINGPOINTS() {
        return internaltriggeringpoints;
    }

    /**
     * ??internaltriggeringpoints?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWINTERNALBEHAVIOR.INTERNALTRIGGERINGPOINTS }
     *     
     */
    public void setINTERNALTRIGGERINGPOINTS(BSWINTERNALBEHAVIOR.INTERNALTRIGGERINGPOINTS value) {
        this.internaltriggeringpoints = value;
    }

    /**
     * ??entitys?????
     * 
     * @return
     *     possible object is
     *     {@link BSWINTERNALBEHAVIOR.ENTITYS }
     *     
     */
    public BSWINTERNALBEHAVIOR.ENTITYS getENTITYS() {
        return entitys;
    }

    /**
     * ??entitys?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWINTERNALBEHAVIOR.ENTITYS }
     *     
     */
    public void setENTITYS(BSWINTERNALBEHAVIOR.ENTITYS value) {
        this.entitys = value;
    }

    /**
     * ??events?????
     * 
     * @return
     *     possible object is
     *     {@link BSWINTERNALBEHAVIOR.EVENTS }
     *     
     */
    public BSWINTERNALBEHAVIOR.EVENTS getEVENTS() {
        return events;
    }

    /**
     * ??events?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWINTERNALBEHAVIOR.EVENTS }
     *     
     */
    public void setEVENTS(BSWINTERNALBEHAVIOR.EVENTS value) {
        this.events = value;
    }

    /**
     * ??triggerdirectimplementations?????
     * 
     * @return
     *     possible object is
     *     {@link BSWINTERNALBEHAVIOR.TRIGGERDIRECTIMPLEMENTATIONS }
     *     
     */
    public BSWINTERNALBEHAVIOR.TRIGGERDIRECTIMPLEMENTATIONS getTRIGGERDIRECTIMPLEMENTATIONS() {
        return triggerdirectimplementations;
    }

    /**
     * ??triggerdirectimplementations?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWINTERNALBEHAVIOR.TRIGGERDIRECTIMPLEMENTATIONS }
     *     
     */
    public void setTRIGGERDIRECTIMPLEMENTATIONS(BSWINTERNALBEHAVIOR.TRIGGERDIRECTIMPLEMENTATIONS value) {
        this.triggerdirectimplementations = value;
    }

    /**
     * ??modesenderpolicys?????
     * 
     * @return
     *     possible object is
     *     {@link BSWINTERNALBEHAVIOR.MODESENDERPOLICYS }
     *     
     */
    public BSWINTERNALBEHAVIOR.MODESENDERPOLICYS getMODESENDERPOLICYS() {
        return modesenderpolicys;
    }

    /**
     * ??modesenderpolicys?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWINTERNALBEHAVIOR.MODESENDERPOLICYS }
     *     
     */
    public void setMODESENDERPOLICYS(BSWINTERNALBEHAVIOR.MODESENDERPOLICYS value) {
        this.modesenderpolicys = value;
    }

    /**
     * ??modereceiverpolicys?????
     * 
     * @return
     *     possible object is
     *     {@link BSWINTERNALBEHAVIOR.MODERECEIVERPOLICYS }
     *     
     */
    public BSWINTERNALBEHAVIOR.MODERECEIVERPOLICYS getMODERECEIVERPOLICYS() {
        return modereceiverpolicys;
    }

    /**
     * ??modereceiverpolicys?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWINTERNALBEHAVIOR.MODERECEIVERPOLICYS }
     *     
     */
    public void setMODERECEIVERPOLICYS(BSWINTERNALBEHAVIOR.MODERECEIVERPOLICYS value) {
        this.modereceiverpolicys = value;
    }

    /**
     * ??servicedependencys?????
     * 
     * @return
     *     possible object is
     *     {@link BSWINTERNALBEHAVIOR.SERVICEDEPENDENCYS }
     *     
     */
    public BSWINTERNALBEHAVIOR.SERVICEDEPENDENCYS getSERVICEDEPENDENCYS() {
        return servicedependencys;
    }

    /**
     * ??servicedependencys?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWINTERNALBEHAVIOR.SERVICEDEPENDENCYS }
     *     
     */
    public void setSERVICEDEPENDENCYS(BSWINTERNALBEHAVIOR.SERVICEDEPENDENCYS value) {
        this.servicedependencys = value;
    }

    /**
     * ??perinstanceparameters?????
     * 
     * @return
     *     possible object is
     *     {@link BSWINTERNALBEHAVIOR.PERINSTANCEPARAMETERS }
     *     
     */
    public BSWINTERNALBEHAVIOR.PERINSTANCEPARAMETERS getPERINSTANCEPARAMETERS() {
        return perinstanceparameters;
    }

    /**
     * ??perinstanceparameters?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWINTERNALBEHAVIOR.PERINSTANCEPARAMETERS }
     *     
     */
    public void setPERINSTANCEPARAMETERS(BSWINTERNALBEHAVIOR.PERINSTANCEPARAMETERS value) {
        this.perinstanceparameters = value;
    }

    /**
     * ??schedulernameprefixs?????
     * 
     * @return
     *     possible object is
     *     {@link BSWINTERNALBEHAVIOR.SCHEDULERNAMEPREFIXS }
     *     
     */
    public BSWINTERNALBEHAVIOR.SCHEDULERNAMEPREFIXS getSCHEDULERNAMEPREFIXS() {
        return schedulernameprefixs;
    }

    /**
     * ??schedulernameprefixs?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWINTERNALBEHAVIOR.SCHEDULERNAMEPREFIXS }
     *     
     */
    public void setSCHEDULERNAMEPREFIXS(BSWINTERNALBEHAVIOR.SCHEDULERNAMEPREFIXS value) {
        this.schedulernameprefixs = value;
    }

    /**
     * ??receptionpolicys?????
     * 
     * @return
     *     possible object is
     *     {@link BSWINTERNALBEHAVIOR.RECEPTIONPOLICYS }
     *     
     */
    public BSWINTERNALBEHAVIOR.RECEPTIONPOLICYS getRECEPTIONPOLICYS() {
        return receptionpolicys;
    }

    /**
     * ??receptionpolicys?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWINTERNALBEHAVIOR.RECEPTIONPOLICYS }
     *     
     */
    public void setRECEPTIONPOLICYS(BSWINTERNALBEHAVIOR.RECEPTIONPOLICYS value) {
        this.receptionpolicys = value;
    }

    /**
     * ??distinguishedpartitions?????
     * 
     * @return
     *     possible object is
     *     {@link BSWINTERNALBEHAVIOR.DISTINGUISHEDPARTITIONS }
     *     
     */
    public BSWINTERNALBEHAVIOR.DISTINGUISHEDPARTITIONS getDISTINGUISHEDPARTITIONS() {
        return distinguishedpartitions;
    }

    /**
     * ??distinguishedpartitions?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWINTERNALBEHAVIOR.DISTINGUISHEDPARTITIONS }
     *     
     */
    public void setDISTINGUISHEDPARTITIONS(BSWINTERNALBEHAVIOR.DISTINGUISHEDPARTITIONS value) {
        this.distinguishedpartitions = value;
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
     *         &lt;element name="BSW-CLIENT-POLICY" type="{http://autosar.org/schema/r4.0}BSW-CLIENT-POLICY"/>
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
        "bswclientpolicy"
    })
    public static class CLIENTPOLICYS {

        @XmlElement(name = "BSW-CLIENT-POLICY")
        protected List<BSWCLIENTPOLICY> bswclientpolicy;

        /**
         * Gets the value of the bswclientpolicy property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bswclientpolicy property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBSWCLIENTPOLICY().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BSWCLIENTPOLICY }
         * 
         * 
         */
        public List<BSWCLIENTPOLICY> getBSWCLIENTPOLICY() {
            if (bswclientpolicy == null) {
                bswclientpolicy = new ArrayList<BSWCLIENTPOLICY>();
            }
            return this.bswclientpolicy;
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
    public static class CONSTANTMEMORYS {

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
     *         &lt;element name="CONSTANT-VALUE-MAPPING-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}CONSTANT-SPECIFICATION-MAPPING-SET--SUBTYPES-ENUM" />
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
        "constantvaluemappingref"
    })
    public static class CONSTANTVALUEMAPPINGREFS {

        @XmlElement(name = "CONSTANT-VALUE-MAPPING-REF")
        protected List<BSWINTERNALBEHAVIOR.CONSTANTVALUEMAPPINGREFS.CONSTANTVALUEMAPPINGREF> constantvaluemappingref;

        /**
         * Gets the value of the constantvaluemappingref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the constantvaluemappingref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCONSTANTVALUEMAPPINGREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BSWINTERNALBEHAVIOR.CONSTANTVALUEMAPPINGREFS.CONSTANTVALUEMAPPINGREF }
         * 
         * 
         */
        public List<BSWINTERNALBEHAVIOR.CONSTANTVALUEMAPPINGREFS.CONSTANTVALUEMAPPINGREF> getCONSTANTVALUEMAPPINGREF() {
            if (constantvaluemappingref == null) {
                constantvaluemappingref = new ArrayList<BSWINTERNALBEHAVIOR.CONSTANTVALUEMAPPINGREFS.CONSTANTVALUEMAPPINGREF>();
            }
            return this.constantvaluemappingref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}CONSTANT-SPECIFICATION-MAPPING-SET--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class CONSTANTVALUEMAPPINGREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected CONSTANTSPECIFICATIONMAPPINGSETSUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link CONSTANTSPECIFICATIONMAPPINGSETSUBTYPESENUM }
             *     
             */
            public CONSTANTSPECIFICATIONMAPPINGSETSUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link CONSTANTSPECIFICATIONMAPPINGSETSUBTYPESENUM }
             *     
             */
            public void setDEST(CONSTANTSPECIFICATIONMAPPINGSETSUBTYPESENUM value) {
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
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="DATA-TYPE-MAPPING-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}DATA-TYPE-MAPPING-SET--SUBTYPES-ENUM" />
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
        "datatypemappingref"
    })
    public static class DATATYPEMAPPINGREFS {

        @XmlElement(name = "DATA-TYPE-MAPPING-REF")
        protected List<BSWINTERNALBEHAVIOR.DATATYPEMAPPINGREFS.DATATYPEMAPPINGREF> datatypemappingref;

        /**
         * Gets the value of the datatypemappingref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the datatypemappingref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDATATYPEMAPPINGREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BSWINTERNALBEHAVIOR.DATATYPEMAPPINGREFS.DATATYPEMAPPINGREF }
         * 
         * 
         */
        public List<BSWINTERNALBEHAVIOR.DATATYPEMAPPINGREFS.DATATYPEMAPPINGREF> getDATATYPEMAPPINGREF() {
            if (datatypemappingref == null) {
                datatypemappingref = new ArrayList<BSWINTERNALBEHAVIOR.DATATYPEMAPPINGREFS.DATATYPEMAPPINGREF>();
            }
            return this.datatypemappingref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}DATA-TYPE-MAPPING-SET--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class DATATYPEMAPPINGREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected DATATYPEMAPPINGSETSUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link DATATYPEMAPPINGSETSUBTYPESENUM }
             *     
             */
            public DATATYPEMAPPINGSETSUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link DATATYPEMAPPINGSETSUBTYPESENUM }
             *     
             */
            public void setDEST(DATATYPEMAPPINGSETSUBTYPESENUM value) {
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
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="BSW-DISTINGUISHED-PARTITION" type="{http://autosar.org/schema/r4.0}BSW-DISTINGUISHED-PARTITION"/>
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
        "bswdistinguishedpartition"
    })
    public static class DISTINGUISHEDPARTITIONS {

        @XmlElement(name = "BSW-DISTINGUISHED-PARTITION")
        protected List<BSWDISTINGUISHEDPARTITION> bswdistinguishedpartition;

        /**
         * Gets the value of the bswdistinguishedpartition property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bswdistinguishedpartition property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBSWDISTINGUISHEDPARTITION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BSWDISTINGUISHEDPARTITION }
         * 
         * 
         */
        public List<BSWDISTINGUISHEDPARTITION> getBSWDISTINGUISHEDPARTITION() {
            if (bswdistinguishedpartition == null) {
                bswdistinguishedpartition = new ArrayList<BSWDISTINGUISHEDPARTITION>();
            }
            return this.bswdistinguishedpartition;
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
     *         &lt;element name="BSW-CALLED-ENTITY" type="{http://autosar.org/schema/r4.0}BSW-CALLED-ENTITY"/>
     *         &lt;element name="BSW-INTERRUPT-ENTITY" type="{http://autosar.org/schema/r4.0}BSW-INTERRUPT-ENTITY"/>
     *         &lt;element name="BSW-SCHEDULABLE-ENTITY" type="{http://autosar.org/schema/r4.0}BSW-SCHEDULABLE-ENTITY"/>
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
        "bswcalledentityOrBSWINTERRUPTENTITYOrBSWSCHEDULABLEENTITY"
    })
    public static class ENTITYS {

        @XmlElements({
            @XmlElement(name = "BSW-CALLED-ENTITY", type = BSWCALLEDENTITY.class),
            @XmlElement(name = "BSW-INTERRUPT-ENTITY", type = BSWINTERRUPTENTITY.class),
            @XmlElement(name = "BSW-SCHEDULABLE-ENTITY", type = BSWSCHEDULABLEENTITY.class)
        })
        protected List<Object> bswcalledentityOrBSWINTERRUPTENTITYOrBSWSCHEDULABLEENTITY;

        /**
         * Gets the value of the bswcalledentityOrBSWINTERRUPTENTITYOrBSWSCHEDULABLEENTITY property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bswcalledentityOrBSWINTERRUPTENTITYOrBSWSCHEDULABLEENTITY property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBSWCALLEDENTITYOrBSWINTERRUPTENTITYOrBSWSCHEDULABLEENTITY().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BSWCALLEDENTITY }
         * {@link BSWINTERRUPTENTITY }
         * {@link BSWSCHEDULABLEENTITY }
         * 
         * 
         */
        public List<Object> getBSWCALLEDENTITYOrBSWINTERRUPTENTITYOrBSWSCHEDULABLEENTITY() {
            if (bswcalledentityOrBSWINTERRUPTENTITYOrBSWSCHEDULABLEENTITY == null) {
                bswcalledentityOrBSWINTERRUPTENTITYOrBSWSCHEDULABLEENTITY = new ArrayList<Object>();
            }
            return this.bswcalledentityOrBSWINTERRUPTENTITYOrBSWSCHEDULABLEENTITY;
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
     *         &lt;element name="BSW-ASYNCHRONOUS-SERVER-CALL-RETURNS-EVENT" type="{http://autosar.org/schema/r4.0}BSW-ASYNCHRONOUS-SERVER-CALL-RETURNS-EVENT"/>
     *         &lt;element name="BSW-BACKGROUND-EVENT" type="{http://autosar.org/schema/r4.0}BSW-BACKGROUND-EVENT"/>
     *         &lt;element name="BSW-DATA-RECEIVED-EVENT" type="{http://autosar.org/schema/r4.0}BSW-DATA-RECEIVED-EVENT"/>
     *         &lt;element name="BSW-EXTERNAL-TRIGGER-OCCURRED-EVENT" type="{http://autosar.org/schema/r4.0}BSW-EXTERNAL-TRIGGER-OCCURRED-EVENT"/>
     *         &lt;element name="BSW-INTERNAL-TRIGGER-OCCURRED-EVENT" type="{http://autosar.org/schema/r4.0}BSW-INTERNAL-TRIGGER-OCCURRED-EVENT"/>
     *         &lt;element name="BSW-MODE-MANAGER-ERROR-EVENT" type="{http://autosar.org/schema/r4.0}BSW-MODE-MANAGER-ERROR-EVENT"/>
     *         &lt;element name="BSW-MODE-SWITCH-EVENT" type="{http://autosar.org/schema/r4.0}BSW-MODE-SWITCH-EVENT"/>
     *         &lt;element name="BSW-MODE-SWITCHED-ACK-EVENT" type="{http://autosar.org/schema/r4.0}BSW-MODE-SWITCHED-ACK-EVENT"/>
     *         &lt;element name="BSW-OPERATION-INVOKED-EVENT" type="{http://autosar.org/schema/r4.0}BSW-OPERATION-INVOKED-EVENT"/>
     *         &lt;element name="BSW-TIMING-EVENT" type="{http://autosar.org/schema/r4.0}BSW-TIMING-EVENT"/>
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
        "bswasynchronousservercallreturnseventOrBSWBACKGROUNDEVENTOrBSWDATARECEIVEDEVENT"
    })
    public static class EVENTS {

        @XmlElements({
            @XmlElement(name = "BSW-ASYNCHRONOUS-SERVER-CALL-RETURNS-EVENT", type = BSWASYNCHRONOUSSERVERCALLRETURNSEVENT.class),
            @XmlElement(name = "BSW-BACKGROUND-EVENT", type = BSWBACKGROUNDEVENT.class),
            @XmlElement(name = "BSW-DATA-RECEIVED-EVENT", type = BSWDATARECEIVEDEVENT.class),
            @XmlElement(name = "BSW-EXTERNAL-TRIGGER-OCCURRED-EVENT", type = BSWEXTERNALTRIGGEROCCURREDEVENT.class),
            @XmlElement(name = "BSW-INTERNAL-TRIGGER-OCCURRED-EVENT", type = BSWINTERNALTRIGGEROCCURREDEVENT.class),
            @XmlElement(name = "BSW-MODE-MANAGER-ERROR-EVENT", type = BSWMODEMANAGERERROREVENT.class),
            @XmlElement(name = "BSW-MODE-SWITCH-EVENT", type = BSWMODESWITCHEVENT.class),
            @XmlElement(name = "BSW-MODE-SWITCHED-ACK-EVENT", type = BSWMODESWITCHEDACKEVENT.class),
            @XmlElement(name = "BSW-OPERATION-INVOKED-EVENT", type = BSWOPERATIONINVOKEDEVENT.class),
            @XmlElement(name = "BSW-TIMING-EVENT", type = BSWTIMINGEVENT.class)
        })
        protected List<Object> bswasynchronousservercallreturnseventOrBSWBACKGROUNDEVENTOrBSWDATARECEIVEDEVENT;

        /**
         * Gets the value of the bswasynchronousservercallreturnseventOrBSWBACKGROUNDEVENTOrBSWDATARECEIVEDEVENT property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bswasynchronousservercallreturnseventOrBSWBACKGROUNDEVENTOrBSWDATARECEIVEDEVENT property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBSWASYNCHRONOUSSERVERCALLRETURNSEVENTOrBSWBACKGROUNDEVENTOrBSWDATARECEIVEDEVENT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BSWASYNCHRONOUSSERVERCALLRETURNSEVENT }
         * {@link BSWBACKGROUNDEVENT }
         * {@link BSWDATARECEIVEDEVENT }
         * {@link BSWEXTERNALTRIGGEROCCURREDEVENT }
         * {@link BSWINTERNALTRIGGEROCCURREDEVENT }
         * {@link BSWMODEMANAGERERROREVENT }
         * {@link BSWMODESWITCHEVENT }
         * {@link BSWMODESWITCHEDACKEVENT }
         * {@link BSWOPERATIONINVOKEDEVENT }
         * {@link BSWTIMINGEVENT }
         * 
         * 
         */
        public List<Object> getBSWASYNCHRONOUSSERVERCALLRETURNSEVENTOrBSWBACKGROUNDEVENTOrBSWDATARECEIVEDEVENT() {
            if (bswasynchronousservercallreturnseventOrBSWBACKGROUNDEVENTOrBSWDATARECEIVEDEVENT == null) {
                bswasynchronousservercallreturnseventOrBSWBACKGROUNDEVENTOrBSWDATARECEIVEDEVENT = new ArrayList<Object>();
            }
            return this.bswasynchronousservercallreturnseventOrBSWBACKGROUNDEVENTOrBSWDATARECEIVEDEVENT;
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
     *         &lt;element name="EXCLUSIVE-AREA-NESTING-ORDER" type="{http://autosar.org/schema/r4.0}EXCLUSIVE-AREA-NESTING-ORDER"/>
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
        "exclusiveareanestingorder"
    })
    public static class EXCLUSIVEAREANESTINGORDERS {

        @XmlElement(name = "EXCLUSIVE-AREA-NESTING-ORDER")
        protected List<EXCLUSIVEAREANESTINGORDER> exclusiveareanestingorder;

        /**
         * Gets the value of the exclusiveareanestingorder property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the exclusiveareanestingorder property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEXCLUSIVEAREANESTINGORDER().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EXCLUSIVEAREANESTINGORDER }
         * 
         * 
         */
        public List<EXCLUSIVEAREANESTINGORDER> getEXCLUSIVEAREANESTINGORDER() {
            if (exclusiveareanestingorder == null) {
                exclusiveareanestingorder = new ArrayList<EXCLUSIVEAREANESTINGORDER>();
            }
            return this.exclusiveareanestingorder;
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
     *         &lt;element name="BSW-EXCLUSIVE-AREA-POLICY" type="{http://autosar.org/schema/r4.0}BSW-EXCLUSIVE-AREA-POLICY"/>
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
        "bswexclusiveareapolicy"
    })
    public static class EXCLUSIVEAREAPOLICYS {

        @XmlElement(name = "BSW-EXCLUSIVE-AREA-POLICY")
        protected List<BSWEXCLUSIVEAREAPOLICY> bswexclusiveareapolicy;

        /**
         * Gets the value of the bswexclusiveareapolicy property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bswexclusiveareapolicy property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBSWEXCLUSIVEAREAPOLICY().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BSWEXCLUSIVEAREAPOLICY }
         * 
         * 
         */
        public List<BSWEXCLUSIVEAREAPOLICY> getBSWEXCLUSIVEAREAPOLICY() {
            if (bswexclusiveareapolicy == null) {
                bswexclusiveareapolicy = new ArrayList<BSWEXCLUSIVEAREAPOLICY>();
            }
            return this.bswexclusiveareapolicy;
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
     *         &lt;element name="EXCLUSIVE-AREA" type="{http://autosar.org/schema/r4.0}EXCLUSIVE-AREA"/>
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
        "exclusivearea"
    })
    public static class EXCLUSIVEAREAS {

        @XmlElement(name = "EXCLUSIVE-AREA")
        protected List<EXCLUSIVEAREA> exclusivearea;

        /**
         * Gets the value of the exclusivearea property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the exclusivearea property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEXCLUSIVEAREA().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EXCLUSIVEAREA }
         * 
         * 
         */
        public List<EXCLUSIVEAREA> getEXCLUSIVEAREA() {
            if (exclusivearea == null) {
                exclusivearea = new ArrayList<EXCLUSIVEAREA>();
            }
            return this.exclusivearea;
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
     *         &lt;element name="BSW-INTERNAL-TRIGGERING-POINT-POLICY" type="{http://autosar.org/schema/r4.0}BSW-INTERNAL-TRIGGERING-POINT-POLICY"/>
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
        "bswinternaltriggeringpointpolicy"
    })
    public static class INTERNALTRIGGERINGPOINTPOLICYS {

        @XmlElement(name = "BSW-INTERNAL-TRIGGERING-POINT-POLICY")
        protected List<BSWINTERNALTRIGGERINGPOINTPOLICY> bswinternaltriggeringpointpolicy;

        /**
         * Gets the value of the bswinternaltriggeringpointpolicy property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bswinternaltriggeringpointpolicy property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBSWINTERNALTRIGGERINGPOINTPOLICY().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BSWINTERNALTRIGGERINGPOINTPOLICY }
         * 
         * 
         */
        public List<BSWINTERNALTRIGGERINGPOINTPOLICY> getBSWINTERNALTRIGGERINGPOINTPOLICY() {
            if (bswinternaltriggeringpointpolicy == null) {
                bswinternaltriggeringpointpolicy = new ArrayList<BSWINTERNALTRIGGERINGPOINTPOLICY>();
            }
            return this.bswinternaltriggeringpointpolicy;
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
     *         &lt;element name="BSW-INTERNAL-TRIGGERING-POINT" type="{http://autosar.org/schema/r4.0}BSW-INTERNAL-TRIGGERING-POINT"/>
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
        "bswinternaltriggeringpoint"
    })
    public static class INTERNALTRIGGERINGPOINTS {

        @XmlElement(name = "BSW-INTERNAL-TRIGGERING-POINT")
        protected List<BSWINTERNALTRIGGERINGPOINT> bswinternaltriggeringpoint;

        /**
         * Gets the value of the bswinternaltriggeringpoint property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bswinternaltriggeringpoint property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBSWINTERNALTRIGGERINGPOINT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BSWINTERNALTRIGGERINGPOINT }
         * 
         * 
         */
        public List<BSWINTERNALTRIGGERINGPOINT> getBSWINTERNALTRIGGERINGPOINT() {
            if (bswinternaltriggeringpoint == null) {
                bswinternaltriggeringpoint = new ArrayList<BSWINTERNALTRIGGERINGPOINT>();
            }
            return this.bswinternaltriggeringpoint;
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
     *         &lt;element name="BSW-MODE-RECEIVER-POLICY" type="{http://autosar.org/schema/r4.0}BSW-MODE-RECEIVER-POLICY"/>
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
        "bswmodereceiverpolicy"
    })
    public static class MODERECEIVERPOLICYS {

        @XmlElement(name = "BSW-MODE-RECEIVER-POLICY")
        protected List<BSWMODERECEIVERPOLICY> bswmodereceiverpolicy;

        /**
         * Gets the value of the bswmodereceiverpolicy property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bswmodereceiverpolicy property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBSWMODERECEIVERPOLICY().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BSWMODERECEIVERPOLICY }
         * 
         * 
         */
        public List<BSWMODERECEIVERPOLICY> getBSWMODERECEIVERPOLICY() {
            if (bswmodereceiverpolicy == null) {
                bswmodereceiverpolicy = new ArrayList<BSWMODERECEIVERPOLICY>();
            }
            return this.bswmodereceiverpolicy;
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
     *         &lt;element name="BSW-MODE-SENDER-POLICY" type="{http://autosar.org/schema/r4.0}BSW-MODE-SENDER-POLICY"/>
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
        "bswmodesenderpolicy"
    })
    public static class MODESENDERPOLICYS {

        @XmlElement(name = "BSW-MODE-SENDER-POLICY")
        protected List<BSWMODESENDERPOLICY> bswmodesenderpolicy;

        /**
         * Gets the value of the bswmodesenderpolicy property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bswmodesenderpolicy property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBSWMODESENDERPOLICY().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BSWMODESENDERPOLICY }
         * 
         * 
         */
        public List<BSWMODESENDERPOLICY> getBSWMODESENDERPOLICY() {
            if (bswmodesenderpolicy == null) {
                bswmodesenderpolicy = new ArrayList<BSWMODESENDERPOLICY>();
            }
            return this.bswmodesenderpolicy;
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
     *         &lt;element name="BSW-PARAMETER-POLICY" type="{http://autosar.org/schema/r4.0}BSW-PARAMETER-POLICY"/>
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
        "bswparameterpolicy"
    })
    public static class PARAMETERPOLICYS {

        @XmlElement(name = "BSW-PARAMETER-POLICY")
        protected List<BSWPARAMETERPOLICY> bswparameterpolicy;

        /**
         * Gets the value of the bswparameterpolicy property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bswparameterpolicy property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBSWPARAMETERPOLICY().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BSWPARAMETERPOLICY }
         * 
         * 
         */
        public List<BSWPARAMETERPOLICY> getBSWPARAMETERPOLICY() {
            if (bswparameterpolicy == null) {
                bswparameterpolicy = new ArrayList<BSWPARAMETERPOLICY>();
            }
            return this.bswparameterpolicy;
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
     *         &lt;element name="BSW-QUEUED-DATA-RECEPTION-POLICY" type="{http://autosar.org/schema/r4.0}BSW-QUEUED-DATA-RECEPTION-POLICY"/>
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
        "bswqueueddatareceptionpolicy"
    })
    public static class RECEPTIONPOLICYS {

        @XmlElement(name = "BSW-QUEUED-DATA-RECEPTION-POLICY")
        protected List<BSWQUEUEDDATARECEPTIONPOLICY> bswqueueddatareceptionpolicy;

        /**
         * Gets the value of the bswqueueddatareceptionpolicy property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bswqueueddatareceptionpolicy property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBSWQUEUEDDATARECEPTIONPOLICY().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BSWQUEUEDDATARECEPTIONPOLICY }
         * 
         * 
         */
        public List<BSWQUEUEDDATARECEPTIONPOLICY> getBSWQUEUEDDATARECEPTIONPOLICY() {
            if (bswqueueddatareceptionpolicy == null) {
                bswqueueddatareceptionpolicy = new ArrayList<BSWQUEUEDDATARECEPTIONPOLICY>();
            }
            return this.bswqueueddatareceptionpolicy;
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
     *         &lt;element name="BSW-RELEASED-TRIGGER-POLICY" type="{http://autosar.org/schema/r4.0}BSW-RELEASED-TRIGGER-POLICY"/>
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
        "bswreleasedtriggerpolicy"
    })
    public static class RELEASEDTRIGGERPOLICYS {

        @XmlElement(name = "BSW-RELEASED-TRIGGER-POLICY")
        protected List<BSWRELEASEDTRIGGERPOLICY> bswreleasedtriggerpolicy;

        /**
         * Gets the value of the bswreleasedtriggerpolicy property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bswreleasedtriggerpolicy property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBSWRELEASEDTRIGGERPOLICY().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BSWRELEASEDTRIGGERPOLICY }
         * 
         * 
         */
        public List<BSWRELEASEDTRIGGERPOLICY> getBSWRELEASEDTRIGGERPOLICY() {
            if (bswreleasedtriggerpolicy == null) {
                bswreleasedtriggerpolicy = new ArrayList<BSWRELEASEDTRIGGERPOLICY>();
            }
            return this.bswreleasedtriggerpolicy;
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
     *         &lt;element name="BSW-SCHEDULER-NAME-PREFIX" type="{http://autosar.org/schema/r4.0}BSW-SCHEDULER-NAME-PREFIX"/>
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
        "bswschedulernameprefix"
    })
    public static class SCHEDULERNAMEPREFIXS {

        @XmlElement(name = "BSW-SCHEDULER-NAME-PREFIX")
        protected List<BSWSCHEDULERNAMEPREFIX> bswschedulernameprefix;

        /**
         * Gets the value of the bswschedulernameprefix property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bswschedulernameprefix property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBSWSCHEDULERNAMEPREFIX().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BSWSCHEDULERNAMEPREFIX }
         * 
         * 
         */
        public List<BSWSCHEDULERNAMEPREFIX> getBSWSCHEDULERNAMEPREFIX() {
            if (bswschedulernameprefix == null) {
                bswschedulernameprefix = new ArrayList<BSWSCHEDULERNAMEPREFIX>();
            }
            return this.bswschedulernameprefix;
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
     *         &lt;element name="BSW-DATA-SEND-POLICY" type="{http://autosar.org/schema/r4.0}BSW-DATA-SEND-POLICY"/>
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
        "bswdatasendpolicy"
    })
    public static class SENDPOLICYS {

        @XmlElement(name = "BSW-DATA-SEND-POLICY")
        protected List<BSWDATASENDPOLICY> bswdatasendpolicy;

        /**
         * Gets the value of the bswdatasendpolicy property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bswdatasendpolicy property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBSWDATASENDPOLICY().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BSWDATASENDPOLICY }
         * 
         * 
         */
        public List<BSWDATASENDPOLICY> getBSWDATASENDPOLICY() {
            if (bswdatasendpolicy == null) {
                bswdatasendpolicy = new ArrayList<BSWDATASENDPOLICY>();
            }
            return this.bswdatasendpolicy;
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
     *         &lt;element name="BSW-SERVICE-DEPENDENCY" type="{http://autosar.org/schema/r4.0}BSW-SERVICE-DEPENDENCY"/>
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
        "bswservicedependency"
    })
    public static class SERVICEDEPENDENCYS {

        @XmlElement(name = "BSW-SERVICE-DEPENDENCY")
        protected List<BSWSERVICEDEPENDENCY> bswservicedependency;

        /**
         * Gets the value of the bswservicedependency property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bswservicedependency property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBSWSERVICEDEPENDENCY().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BSWSERVICEDEPENDENCY }
         * 
         * 
         */
        public List<BSWSERVICEDEPENDENCY> getBSWSERVICEDEPENDENCY() {
            if (bswservicedependency == null) {
                bswservicedependency = new ArrayList<BSWSERVICEDEPENDENCY>();
            }
            return this.bswservicedependency;
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
    public static class STATICMEMORYS {

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
     *         &lt;element name="BSW-TRIGGER-DIRECT-IMPLEMENTATION" type="{http://autosar.org/schema/r4.0}BSW-TRIGGER-DIRECT-IMPLEMENTATION"/>
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
        "bswtriggerdirectimplementation"
    })
    public static class TRIGGERDIRECTIMPLEMENTATIONS {

        @XmlElement(name = "BSW-TRIGGER-DIRECT-IMPLEMENTATION")
        protected List<BSWTRIGGERDIRECTIMPLEMENTATION> bswtriggerdirectimplementation;

        /**
         * Gets the value of the bswtriggerdirectimplementation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bswtriggerdirectimplementation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBSWTRIGGERDIRECTIMPLEMENTATION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BSWTRIGGERDIRECTIMPLEMENTATION }
         * 
         * 
         */
        public List<BSWTRIGGERDIRECTIMPLEMENTATION> getBSWTRIGGERDIRECTIMPLEMENTATION() {
            if (bswtriggerdirectimplementation == null) {
                bswtriggerdirectimplementation = new ArrayList<BSWTRIGGERDIRECTIMPLEMENTATION>();
            }
            return this.bswtriggerdirectimplementation;
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
