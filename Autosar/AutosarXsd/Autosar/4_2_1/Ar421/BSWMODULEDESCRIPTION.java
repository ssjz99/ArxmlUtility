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
 * Root element for the description of a single BSW module or BSW cluster.
 * In case it describes a BSW module, the short name of this element equals the name of the BSW module.
 * 
 * <p>BSW-MODULE-DESCRIPTION complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="BSW-MODULE-DESCRIPTION">
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
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ATP-BLUEPRINTABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ATP-CLASSIFIER"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ATP-FEATURE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ATP-STRUCTURE-ELEMENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}BSW-MODULE-DESCRIPTION"/>
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
@XmlType(name = "BSW-MODULE-DESCRIPTION", propOrder = {
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
    "moduleid",
    "bswmoduledocumentations",
    "providedentrys",
    "outgoingcallbacks",
    "bswmoduledependencys",
    "providedmodegroups",
    "requiredmodegroups",
    "releasedtriggers",
    "requiredtriggers",
    "providedclientserverentrys",
    "requiredclientserverentrys",
    "provideddatas",
    "requireddatas",
    "internalbehaviors"
})
public class BSWMODULEDESCRIPTION {

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
    @XmlElement(name = "MODULE-ID")
    protected POSITIVEINTEGER moduleid;
    @XmlElement(name = "BSW-MODULE-DOCUMENTATIONS")
    protected BSWMODULEDESCRIPTION.BSWMODULEDOCUMENTATIONS bswmoduledocumentations;
    @XmlElement(name = "PROVIDED-ENTRYS")
    protected BSWMODULEDESCRIPTION.PROVIDEDENTRYS providedentrys;
    @XmlElement(name = "OUTGOING-CALLBACKS")
    protected BSWMODULEDESCRIPTION.OUTGOINGCALLBACKS outgoingcallbacks;
    @XmlElement(name = "BSW-MODULE-DEPENDENCYS")
    protected BSWMODULEDESCRIPTION.BSWMODULEDEPENDENCYS bswmoduledependencys;
    @XmlElement(name = "PROVIDED-MODE-GROUPS")
    protected BSWMODULEDESCRIPTION.PROVIDEDMODEGROUPS providedmodegroups;
    @XmlElement(name = "REQUIRED-MODE-GROUPS")
    protected BSWMODULEDESCRIPTION.REQUIREDMODEGROUPS requiredmodegroups;
    @XmlElement(name = "RELEASED-TRIGGERS")
    protected BSWMODULEDESCRIPTION.RELEASEDTRIGGERS releasedtriggers;
    @XmlElement(name = "REQUIRED-TRIGGERS")
    protected BSWMODULEDESCRIPTION.REQUIREDTRIGGERS requiredtriggers;
    @XmlElement(name = "PROVIDED-CLIENT-SERVER-ENTRYS")
    protected BSWMODULEDESCRIPTION.PROVIDEDCLIENTSERVERENTRYS providedclientserverentrys;
    @XmlElement(name = "REQUIRED-CLIENT-SERVER-ENTRYS")
    protected BSWMODULEDESCRIPTION.REQUIREDCLIENTSERVERENTRYS requiredclientserverentrys;
    @XmlElement(name = "PROVIDED-DATAS")
    protected BSWMODULEDESCRIPTION.PROVIDEDDATAS provideddatas;
    @XmlElement(name = "REQUIRED-DATAS")
    protected BSWMODULEDESCRIPTION.REQUIREDDATAS requireddatas;
    @XmlElement(name = "INTERNAL-BEHAVIORS")
    protected BSWMODULEDESCRIPTION.INTERNALBEHAVIORS internalbehaviors;
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
     * ??moduleid?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getMODULEID() {
        return moduleid;
    }

    /**
     * ??moduleid?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setMODULEID(POSITIVEINTEGER value) {
        this.moduleid = value;
    }

    /**
     * ??bswmoduledocumentations?????
     * 
     * @return
     *     possible object is
     *     {@link BSWMODULEDESCRIPTION.BSWMODULEDOCUMENTATIONS }
     *     
     */
    public BSWMODULEDESCRIPTION.BSWMODULEDOCUMENTATIONS getBSWMODULEDOCUMENTATIONS() {
        return bswmoduledocumentations;
    }

    /**
     * ??bswmoduledocumentations?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWMODULEDESCRIPTION.BSWMODULEDOCUMENTATIONS }
     *     
     */
    public void setBSWMODULEDOCUMENTATIONS(BSWMODULEDESCRIPTION.BSWMODULEDOCUMENTATIONS value) {
        this.bswmoduledocumentations = value;
    }

    /**
     * ??providedentrys?????
     * 
     * @return
     *     possible object is
     *     {@link BSWMODULEDESCRIPTION.PROVIDEDENTRYS }
     *     
     */
    public BSWMODULEDESCRIPTION.PROVIDEDENTRYS getPROVIDEDENTRYS() {
        return providedentrys;
    }

    /**
     * ??providedentrys?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWMODULEDESCRIPTION.PROVIDEDENTRYS }
     *     
     */
    public void setPROVIDEDENTRYS(BSWMODULEDESCRIPTION.PROVIDEDENTRYS value) {
        this.providedentrys = value;
    }

    /**
     * ??outgoingcallbacks?????
     * 
     * @return
     *     possible object is
     *     {@link BSWMODULEDESCRIPTION.OUTGOINGCALLBACKS }
     *     
     */
    public BSWMODULEDESCRIPTION.OUTGOINGCALLBACKS getOUTGOINGCALLBACKS() {
        return outgoingcallbacks;
    }

    /**
     * ??outgoingcallbacks?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWMODULEDESCRIPTION.OUTGOINGCALLBACKS }
     *     
     */
    public void setOUTGOINGCALLBACKS(BSWMODULEDESCRIPTION.OUTGOINGCALLBACKS value) {
        this.outgoingcallbacks = value;
    }

    /**
     * ??bswmoduledependencys?????
     * 
     * @return
     *     possible object is
     *     {@link BSWMODULEDESCRIPTION.BSWMODULEDEPENDENCYS }
     *     
     */
    public BSWMODULEDESCRIPTION.BSWMODULEDEPENDENCYS getBSWMODULEDEPENDENCYS() {
        return bswmoduledependencys;
    }

    /**
     * ??bswmoduledependencys?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWMODULEDESCRIPTION.BSWMODULEDEPENDENCYS }
     *     
     */
    public void setBSWMODULEDEPENDENCYS(BSWMODULEDESCRIPTION.BSWMODULEDEPENDENCYS value) {
        this.bswmoduledependencys = value;
    }

    /**
     * ??providedmodegroups?????
     * 
     * @return
     *     possible object is
     *     {@link BSWMODULEDESCRIPTION.PROVIDEDMODEGROUPS }
     *     
     */
    public BSWMODULEDESCRIPTION.PROVIDEDMODEGROUPS getPROVIDEDMODEGROUPS() {
        return providedmodegroups;
    }

    /**
     * ??providedmodegroups?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWMODULEDESCRIPTION.PROVIDEDMODEGROUPS }
     *     
     */
    public void setPROVIDEDMODEGROUPS(BSWMODULEDESCRIPTION.PROVIDEDMODEGROUPS value) {
        this.providedmodegroups = value;
    }

    /**
     * ??requiredmodegroups?????
     * 
     * @return
     *     possible object is
     *     {@link BSWMODULEDESCRIPTION.REQUIREDMODEGROUPS }
     *     
     */
    public BSWMODULEDESCRIPTION.REQUIREDMODEGROUPS getREQUIREDMODEGROUPS() {
        return requiredmodegroups;
    }

    /**
     * ??requiredmodegroups?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWMODULEDESCRIPTION.REQUIREDMODEGROUPS }
     *     
     */
    public void setREQUIREDMODEGROUPS(BSWMODULEDESCRIPTION.REQUIREDMODEGROUPS value) {
        this.requiredmodegroups = value;
    }

    /**
     * ??releasedtriggers?????
     * 
     * @return
     *     possible object is
     *     {@link BSWMODULEDESCRIPTION.RELEASEDTRIGGERS }
     *     
     */
    public BSWMODULEDESCRIPTION.RELEASEDTRIGGERS getRELEASEDTRIGGERS() {
        return releasedtriggers;
    }

    /**
     * ??releasedtriggers?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWMODULEDESCRIPTION.RELEASEDTRIGGERS }
     *     
     */
    public void setRELEASEDTRIGGERS(BSWMODULEDESCRIPTION.RELEASEDTRIGGERS value) {
        this.releasedtriggers = value;
    }

    /**
     * ??requiredtriggers?????
     * 
     * @return
     *     possible object is
     *     {@link BSWMODULEDESCRIPTION.REQUIREDTRIGGERS }
     *     
     */
    public BSWMODULEDESCRIPTION.REQUIREDTRIGGERS getREQUIREDTRIGGERS() {
        return requiredtriggers;
    }

    /**
     * ??requiredtriggers?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWMODULEDESCRIPTION.REQUIREDTRIGGERS }
     *     
     */
    public void setREQUIREDTRIGGERS(BSWMODULEDESCRIPTION.REQUIREDTRIGGERS value) {
        this.requiredtriggers = value;
    }

    /**
     * ??providedclientserverentrys?????
     * 
     * @return
     *     possible object is
     *     {@link BSWMODULEDESCRIPTION.PROVIDEDCLIENTSERVERENTRYS }
     *     
     */
    public BSWMODULEDESCRIPTION.PROVIDEDCLIENTSERVERENTRYS getPROVIDEDCLIENTSERVERENTRYS() {
        return providedclientserverentrys;
    }

    /**
     * ??providedclientserverentrys?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWMODULEDESCRIPTION.PROVIDEDCLIENTSERVERENTRYS }
     *     
     */
    public void setPROVIDEDCLIENTSERVERENTRYS(BSWMODULEDESCRIPTION.PROVIDEDCLIENTSERVERENTRYS value) {
        this.providedclientserverentrys = value;
    }

    /**
     * ??requiredclientserverentrys?????
     * 
     * @return
     *     possible object is
     *     {@link BSWMODULEDESCRIPTION.REQUIREDCLIENTSERVERENTRYS }
     *     
     */
    public BSWMODULEDESCRIPTION.REQUIREDCLIENTSERVERENTRYS getREQUIREDCLIENTSERVERENTRYS() {
        return requiredclientserverentrys;
    }

    /**
     * ??requiredclientserverentrys?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWMODULEDESCRIPTION.REQUIREDCLIENTSERVERENTRYS }
     *     
     */
    public void setREQUIREDCLIENTSERVERENTRYS(BSWMODULEDESCRIPTION.REQUIREDCLIENTSERVERENTRYS value) {
        this.requiredclientserverentrys = value;
    }

    /**
     * ??provideddatas?????
     * 
     * @return
     *     possible object is
     *     {@link BSWMODULEDESCRIPTION.PROVIDEDDATAS }
     *     
     */
    public BSWMODULEDESCRIPTION.PROVIDEDDATAS getPROVIDEDDATAS() {
        return provideddatas;
    }

    /**
     * ??provideddatas?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWMODULEDESCRIPTION.PROVIDEDDATAS }
     *     
     */
    public void setPROVIDEDDATAS(BSWMODULEDESCRIPTION.PROVIDEDDATAS value) {
        this.provideddatas = value;
    }

    /**
     * ??requireddatas?????
     * 
     * @return
     *     possible object is
     *     {@link BSWMODULEDESCRIPTION.REQUIREDDATAS }
     *     
     */
    public BSWMODULEDESCRIPTION.REQUIREDDATAS getREQUIREDDATAS() {
        return requireddatas;
    }

    /**
     * ??requireddatas?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWMODULEDESCRIPTION.REQUIREDDATAS }
     *     
     */
    public void setREQUIREDDATAS(BSWMODULEDESCRIPTION.REQUIREDDATAS value) {
        this.requireddatas = value;
    }

    /**
     * ??internalbehaviors?????
     * 
     * @return
     *     possible object is
     *     {@link BSWMODULEDESCRIPTION.INTERNALBEHAVIORS }
     *     
     */
    public BSWMODULEDESCRIPTION.INTERNALBEHAVIORS getINTERNALBEHAVIORS() {
        return internalbehaviors;
    }

    /**
     * ??internalbehaviors?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWMODULEDESCRIPTION.INTERNALBEHAVIORS }
     *     
     */
    public void setINTERNALBEHAVIORS(BSWMODULEDESCRIPTION.INTERNALBEHAVIORS value) {
        this.internalbehaviors = value;
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
     *         &lt;element name="BSW-MODULE-DEPENDENCY" type="{http://autosar.org/schema/r4.0}BSW-MODULE-DEPENDENCY"/>
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
        "bswmoduledependency"
    })
    public static class BSWMODULEDEPENDENCYS {

        @XmlElement(name = "BSW-MODULE-DEPENDENCY")
        protected List<BSWMODULEDEPENDENCY> bswmoduledependency;

        /**
         * Gets the value of the bswmoduledependency property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bswmoduledependency property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBSWMODULEDEPENDENCY().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BSWMODULEDEPENDENCY }
         * 
         * 
         */
        public List<BSWMODULEDEPENDENCY> getBSWMODULEDEPENDENCY() {
            if (bswmoduledependency == null) {
                bswmoduledependency = new ArrayList<BSWMODULEDEPENDENCY>();
            }
            return this.bswmoduledependency;
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
     *         &lt;element name="SW-COMPONENT-DOCUMENTATION" type="{http://autosar.org/schema/r4.0}SW-COMPONENT-DOCUMENTATION"/>
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
        "swcomponentdocumentation"
    })
    public static class BSWMODULEDOCUMENTATIONS {

        @XmlElement(name = "SW-COMPONENT-DOCUMENTATION")
        protected List<SWCOMPONENTDOCUMENTATION> swcomponentdocumentation;

        /**
         * Gets the value of the swcomponentdocumentation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the swcomponentdocumentation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSWCOMPONENTDOCUMENTATION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SWCOMPONENTDOCUMENTATION }
         * 
         * 
         */
        public List<SWCOMPONENTDOCUMENTATION> getSWCOMPONENTDOCUMENTATION() {
            if (swcomponentdocumentation == null) {
                swcomponentdocumentation = new ArrayList<SWCOMPONENTDOCUMENTATION>();
            }
            return this.swcomponentdocumentation;
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
     *         &lt;element name="BSW-INTERNAL-BEHAVIOR" type="{http://autosar.org/schema/r4.0}BSW-INTERNAL-BEHAVIOR"/>
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
        "bswinternalbehavior"
    })
    public static class INTERNALBEHAVIORS {

        @XmlElement(name = "BSW-INTERNAL-BEHAVIOR")
        protected List<BSWINTERNALBEHAVIOR> bswinternalbehavior;

        /**
         * Gets the value of the bswinternalbehavior property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bswinternalbehavior property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBSWINTERNALBEHAVIOR().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BSWINTERNALBEHAVIOR }
         * 
         * 
         */
        public List<BSWINTERNALBEHAVIOR> getBSWINTERNALBEHAVIOR() {
            if (bswinternalbehavior == null) {
                bswinternalbehavior = new ArrayList<BSWINTERNALBEHAVIOR>();
            }
            return this.bswinternalbehavior;
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
     *         &lt;element name="BSW-MODULE-ENTRY-REF-CONDITIONAL" type="{http://autosar.org/schema/r4.0}BSW-MODULE-ENTRY-REF-CONDITIONAL"/>
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
        "bswmoduleentryrefconditional"
    })
    public static class OUTGOINGCALLBACKS {

        @XmlElement(name = "BSW-MODULE-ENTRY-REF-CONDITIONAL")
        protected List<BSWMODULEENTRYREFCONDITIONAL> bswmoduleentryrefconditional;

        /**
         * Gets the value of the bswmoduleentryrefconditional property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bswmoduleentryrefconditional property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBSWMODULEENTRYREFCONDITIONAL().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BSWMODULEENTRYREFCONDITIONAL }
         * 
         * 
         */
        public List<BSWMODULEENTRYREFCONDITIONAL> getBSWMODULEENTRYREFCONDITIONAL() {
            if (bswmoduleentryrefconditional == null) {
                bswmoduleentryrefconditional = new ArrayList<BSWMODULEENTRYREFCONDITIONAL>();
            }
            return this.bswmoduleentryrefconditional;
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
     *         &lt;element name="BSW-MODULE-CLIENT-SERVER-ENTRY" type="{http://autosar.org/schema/r4.0}BSW-MODULE-CLIENT-SERVER-ENTRY"/>
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
        "bswmoduleclientserverentry"
    })
    public static class PROVIDEDCLIENTSERVERENTRYS {

        @XmlElement(name = "BSW-MODULE-CLIENT-SERVER-ENTRY")
        protected List<BSWMODULECLIENTSERVERENTRY> bswmoduleclientserverentry;

        /**
         * Gets the value of the bswmoduleclientserverentry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bswmoduleclientserverentry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBSWMODULECLIENTSERVERENTRY().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BSWMODULECLIENTSERVERENTRY }
         * 
         * 
         */
        public List<BSWMODULECLIENTSERVERENTRY> getBSWMODULECLIENTSERVERENTRY() {
            if (bswmoduleclientserverentry == null) {
                bswmoduleclientserverentry = new ArrayList<BSWMODULECLIENTSERVERENTRY>();
            }
            return this.bswmoduleclientserverentry;
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
    public static class PROVIDEDDATAS {

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
     *         &lt;element name="BSW-MODULE-ENTRY-REF-CONDITIONAL" type="{http://autosar.org/schema/r4.0}BSW-MODULE-ENTRY-REF-CONDITIONAL"/>
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
        "bswmoduleentryrefconditional"
    })
    public static class PROVIDEDENTRYS {

        @XmlElement(name = "BSW-MODULE-ENTRY-REF-CONDITIONAL")
        protected List<BSWMODULEENTRYREFCONDITIONAL> bswmoduleentryrefconditional;

        /**
         * Gets the value of the bswmoduleentryrefconditional property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bswmoduleentryrefconditional property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBSWMODULEENTRYREFCONDITIONAL().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BSWMODULEENTRYREFCONDITIONAL }
         * 
         * 
         */
        public List<BSWMODULEENTRYREFCONDITIONAL> getBSWMODULEENTRYREFCONDITIONAL() {
            if (bswmoduleentryrefconditional == null) {
                bswmoduleentryrefconditional = new ArrayList<BSWMODULEENTRYREFCONDITIONAL>();
            }
            return this.bswmoduleentryrefconditional;
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
     *         &lt;element name="MODE-DECLARATION-GROUP-PROTOTYPE" type="{http://autosar.org/schema/r4.0}MODE-DECLARATION-GROUP-PROTOTYPE"/>
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
        "modedeclarationgroupprototype"
    })
    public static class PROVIDEDMODEGROUPS {

        @XmlElement(name = "MODE-DECLARATION-GROUP-PROTOTYPE")
        protected List<MODEDECLARATIONGROUPPROTOTYPE> modedeclarationgroupprototype;

        /**
         * Gets the value of the modedeclarationgroupprototype property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the modedeclarationgroupprototype property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMODEDECLARATIONGROUPPROTOTYPE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MODEDECLARATIONGROUPPROTOTYPE }
         * 
         * 
         */
        public List<MODEDECLARATIONGROUPPROTOTYPE> getMODEDECLARATIONGROUPPROTOTYPE() {
            if (modedeclarationgroupprototype == null) {
                modedeclarationgroupprototype = new ArrayList<MODEDECLARATIONGROUPPROTOTYPE>();
            }
            return this.modedeclarationgroupprototype;
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
     *         &lt;element name="TRIGGER" type="{http://autosar.org/schema/r4.0}TRIGGER"/>
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
        "trigger"
    })
    public static class RELEASEDTRIGGERS {

        @XmlElement(name = "TRIGGER")
        protected List<TRIGGER> trigger;

        /**
         * Gets the value of the trigger property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the trigger property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTRIGGER().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TRIGGER }
         * 
         * 
         */
        public List<TRIGGER> getTRIGGER() {
            if (trigger == null) {
                trigger = new ArrayList<TRIGGER>();
            }
            return this.trigger;
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
     *         &lt;element name="BSW-MODULE-CLIENT-SERVER-ENTRY" type="{http://autosar.org/schema/r4.0}BSW-MODULE-CLIENT-SERVER-ENTRY"/>
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
        "bswmoduleclientserverentry"
    })
    public static class REQUIREDCLIENTSERVERENTRYS {

        @XmlElement(name = "BSW-MODULE-CLIENT-SERVER-ENTRY")
        protected List<BSWMODULECLIENTSERVERENTRY> bswmoduleclientserverentry;

        /**
         * Gets the value of the bswmoduleclientserverentry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bswmoduleclientserverentry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBSWMODULECLIENTSERVERENTRY().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BSWMODULECLIENTSERVERENTRY }
         * 
         * 
         */
        public List<BSWMODULECLIENTSERVERENTRY> getBSWMODULECLIENTSERVERENTRY() {
            if (bswmoduleclientserverentry == null) {
                bswmoduleclientserverentry = new ArrayList<BSWMODULECLIENTSERVERENTRY>();
            }
            return this.bswmoduleclientserverentry;
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
    public static class REQUIREDDATAS {

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
     *         &lt;element name="MODE-DECLARATION-GROUP-PROTOTYPE" type="{http://autosar.org/schema/r4.0}MODE-DECLARATION-GROUP-PROTOTYPE"/>
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
        "modedeclarationgroupprototype"
    })
    public static class REQUIREDMODEGROUPS {

        @XmlElement(name = "MODE-DECLARATION-GROUP-PROTOTYPE")
        protected List<MODEDECLARATIONGROUPPROTOTYPE> modedeclarationgroupprototype;

        /**
         * Gets the value of the modedeclarationgroupprototype property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the modedeclarationgroupprototype property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMODEDECLARATIONGROUPPROTOTYPE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MODEDECLARATIONGROUPPROTOTYPE }
         * 
         * 
         */
        public List<MODEDECLARATIONGROUPPROTOTYPE> getMODEDECLARATIONGROUPPROTOTYPE() {
            if (modedeclarationgroupprototype == null) {
                modedeclarationgroupprototype = new ArrayList<MODEDECLARATIONGROUPPROTOTYPE>();
            }
            return this.modedeclarationgroupprototype;
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
     *         &lt;element name="TRIGGER" type="{http://autosar.org/schema/r4.0}TRIGGER"/>
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
        "trigger"
    })
    public static class REQUIREDTRIGGERS {

        @XmlElement(name = "TRIGGER")
        protected List<TRIGGER> trigger;

        /**
         * Gets the value of the trigger property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the trigger property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTRIGGER().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TRIGGER }
         * 
         * 
         */
        public List<TRIGGER> getTRIGGER() {
            if (trigger == null) {
                trigger = new ArrayList<TRIGGER>();
            }
            return this.trigger;
        }

    }

}
