//
// ????? JavaTM Architecture for XML Binding (JAXB) ???? v2.2.8-b130911.1802 ???
// ??? <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// ?????????, ??????????????
// ????: 2018.03.12 ?? 11:42:22 PM CET 
//


package Ar421;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * ServiceSwComponentType is used for configuring services for a given ECU. Instances of this class are only to be created in ECU Configuration phase for the specific purpose of the service configuration.
 * 
 * <p>SERVICE-SW-COMPONENT-TYPE complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="SERVICE-SW-COMPONENT-TYPE">
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
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ATP-TYPE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}SW-COMPONENT-TYPE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ATOMIC-SW-COMPONENT-TYPE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}SERVICE-SW-COMPONENT-TYPE"/>
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
@XmlType(name = "SERVICE-SW-COMPONENT-TYPE", propOrder = {
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
    "swcomponentdocumentations",
    "consistencyneedss",
    "ports",
    "portgroups",
    "unitgrouprefs",
    "internalbehaviors",
    "symbolprops"
})
public class SERVICESWCOMPONENTTYPE {

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
    @XmlElement(name = "SW-COMPONENT-DOCUMENTATIONS")
    protected Ar421.PARAMETERSWCOMPONENTTYPE.SWCOMPONENTDOCUMENTATIONS swcomponentdocumentations;
    @XmlElement(name = "CONSISTENCY-NEEDSS")
    protected Ar421.PARAMETERSWCOMPONENTTYPE.CONSISTENCYNEEDSS consistencyneedss;
    @XmlElement(name = "PORTS")
    protected Ar421.PARAMETERSWCOMPONENTTYPE.PORTS ports;
    @XmlElement(name = "PORT-GROUPS")
    protected Ar421.PARAMETERSWCOMPONENTTYPE.PORTGROUPS portgroups;
    @XmlElement(name = "UNIT-GROUP-REFS")
    protected Ar421.PARAMETERSWCOMPONENTTYPE.UNITGROUPREFS unitgrouprefs;
    @XmlElement(name = "INTERNAL-BEHAVIORS")
    protected Ar421.SERVICEPROXYSWCOMPONENTTYPE.INTERNALBEHAVIORS internalbehaviors;
    @XmlElement(name = "SYMBOL-PROPS")
    protected SYMBOLPROPS symbolprops;
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
     * ??swcomponentdocumentations?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.PARAMETERSWCOMPONENTTYPE.SWCOMPONENTDOCUMENTATIONS }
     *     
     */
    public Ar421.PARAMETERSWCOMPONENTTYPE.SWCOMPONENTDOCUMENTATIONS getSWCOMPONENTDOCUMENTATIONS() {
        return swcomponentdocumentations;
    }

    /**
     * ??swcomponentdocumentations?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.PARAMETERSWCOMPONENTTYPE.SWCOMPONENTDOCUMENTATIONS }
     *     
     */
    public void setSWCOMPONENTDOCUMENTATIONS(Ar421.PARAMETERSWCOMPONENTTYPE.SWCOMPONENTDOCUMENTATIONS value) {
        this.swcomponentdocumentations = value;
    }

    /**
     * ??consistencyneedss?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.PARAMETERSWCOMPONENTTYPE.CONSISTENCYNEEDSS }
     *     
     */
    public Ar421.PARAMETERSWCOMPONENTTYPE.CONSISTENCYNEEDSS getCONSISTENCYNEEDSS() {
        return consistencyneedss;
    }

    /**
     * ??consistencyneedss?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.PARAMETERSWCOMPONENTTYPE.CONSISTENCYNEEDSS }
     *     
     */
    public void setCONSISTENCYNEEDSS(Ar421.PARAMETERSWCOMPONENTTYPE.CONSISTENCYNEEDSS value) {
        this.consistencyneedss = value;
    }

    /**
     * ??ports?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.PARAMETERSWCOMPONENTTYPE.PORTS }
     *     
     */
    public Ar421.PARAMETERSWCOMPONENTTYPE.PORTS getPORTS() {
        return ports;
    }

    /**
     * ??ports?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.PARAMETERSWCOMPONENTTYPE.PORTS }
     *     
     */
    public void setPORTS(Ar421.PARAMETERSWCOMPONENTTYPE.PORTS value) {
        this.ports = value;
    }

    /**
     * ??portgroups?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.PARAMETERSWCOMPONENTTYPE.PORTGROUPS }
     *     
     */
    public Ar421.PARAMETERSWCOMPONENTTYPE.PORTGROUPS getPORTGROUPS() {
        return portgroups;
    }

    /**
     * ??portgroups?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.PARAMETERSWCOMPONENTTYPE.PORTGROUPS }
     *     
     */
    public void setPORTGROUPS(Ar421.PARAMETERSWCOMPONENTTYPE.PORTGROUPS value) {
        this.portgroups = value;
    }

    /**
     * ??unitgrouprefs?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.PARAMETERSWCOMPONENTTYPE.UNITGROUPREFS }
     *     
     */
    public Ar421.PARAMETERSWCOMPONENTTYPE.UNITGROUPREFS getUNITGROUPREFS() {
        return unitgrouprefs;
    }

    /**
     * ??unitgrouprefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.PARAMETERSWCOMPONENTTYPE.UNITGROUPREFS }
     *     
     */
    public void setUNITGROUPREFS(Ar421.PARAMETERSWCOMPONENTTYPE.UNITGROUPREFS value) {
        this.unitgrouprefs = value;
    }

    /**
     * ??internalbehaviors?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.SERVICEPROXYSWCOMPONENTTYPE.INTERNALBEHAVIORS }
     *     
     */
    public Ar421.SERVICEPROXYSWCOMPONENTTYPE.INTERNALBEHAVIORS getINTERNALBEHAVIORS() {
        return internalbehaviors;
    }

    /**
     * ??internalbehaviors?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.SERVICEPROXYSWCOMPONENTTYPE.INTERNALBEHAVIORS }
     *     
     */
    public void setINTERNALBEHAVIORS(Ar421.SERVICEPROXYSWCOMPONENTTYPE.INTERNALBEHAVIORS value) {
        this.internalbehaviors = value;
    }

    /**
     * ??symbolprops?????
     * 
     * @return
     *     possible object is
     *     {@link SYMBOLPROPS }
     *     
     */
    public SYMBOLPROPS getSYMBOLPROPS() {
        return symbolprops;
    }

    /**
     * ??symbolprops?????
     * 
     * @param value
     *     allowed object is
     *     {@link SYMBOLPROPS }
     *     
     */
    public void setSYMBOLPROPS(SYMBOLPROPS value) {
        this.symbolprops = value;
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

}
