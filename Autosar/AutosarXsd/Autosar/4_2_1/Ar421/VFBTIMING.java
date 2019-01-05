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
 * A model element used to define timing descriptions and constraints at VFB level.
 * 
 * TimingDescriptions aggregated by VfbTiming are restricted to event chains referring to events which are derived from the class TDEventVfb.
 * 
 * <p>VFB-TIMING complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="VFB-TIMING">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTILANGUAGE-REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ATP-BLUEPRINT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ATP-BLUEPRINTABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}COLLECTABLE-ELEMENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}PACKAGEABLE-ELEMENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-ELEMENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}TIMING-EXTENSION"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}VFB-TIMING"/>
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
@XmlType(name = "VFB-TIMING", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "blueprintpolicys",
    "shortnamepattern",
    "variationpoint",
    "timingdescriptions",
    "timingguarantees",
    "timingrequirements",
    "componentref"
})
public class VFBTIMING {

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
    @XmlElement(name = "BLUEPRINT-POLICYS")
    protected Ar421.FLATMAP.BLUEPRINTPOLICYS blueprintpolicys;
    @XmlElement(name = "SHORT-NAME-PATTERN")
    protected STRING shortnamepattern;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlElement(name = "TIMING-DESCRIPTIONS")
    protected Ar421.BSWMODULETIMING.TIMINGDESCRIPTIONS timingdescriptions;
    @XmlElement(name = "TIMING-GUARANTEES")
    protected Ar421.BSWMODULETIMING.TIMINGGUARANTEES timingguarantees;
    @XmlElement(name = "TIMING-REQUIREMENTS")
    protected Ar421.BSWMODULETIMING.TIMINGREQUIREMENTS timingrequirements;
    @XmlElement(name = "COMPONENT-REF")
    protected VFBTIMING.COMPONENTREF componentref;
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
     *     {@link Ar421.BSWMODULETIMING.TIMINGDESCRIPTIONS }
     *     
     */
    public Ar421.BSWMODULETIMING.TIMINGDESCRIPTIONS getTIMINGDESCRIPTIONS() {
        return timingdescriptions;
    }

    /**
     * ??timingdescriptions?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.BSWMODULETIMING.TIMINGDESCRIPTIONS }
     *     
     */
    public void setTIMINGDESCRIPTIONS(Ar421.BSWMODULETIMING.TIMINGDESCRIPTIONS value) {
        this.timingdescriptions = value;
    }

    /**
     * ??timingguarantees?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.BSWMODULETIMING.TIMINGGUARANTEES }
     *     
     */
    public Ar421.BSWMODULETIMING.TIMINGGUARANTEES getTIMINGGUARANTEES() {
        return timingguarantees;
    }

    /**
     * ??timingguarantees?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.BSWMODULETIMING.TIMINGGUARANTEES }
     *     
     */
    public void setTIMINGGUARANTEES(Ar421.BSWMODULETIMING.TIMINGGUARANTEES value) {
        this.timingguarantees = value;
    }

    /**
     * ??timingrequirements?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.BSWMODULETIMING.TIMINGREQUIREMENTS }
     *     
     */
    public Ar421.BSWMODULETIMING.TIMINGREQUIREMENTS getTIMINGREQUIREMENTS() {
        return timingrequirements;
    }

    /**
     * ??timingrequirements?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.BSWMODULETIMING.TIMINGREQUIREMENTS }
     *     
     */
    public void setTIMINGREQUIREMENTS(Ar421.BSWMODULETIMING.TIMINGREQUIREMENTS value) {
        this.timingrequirements = value;
    }

    /**
     * ??componentref?????
     * 
     * @return
     *     possible object is
     *     {@link VFBTIMING.COMPONENTREF }
     *     
     */
    public VFBTIMING.COMPONENTREF getCOMPONENTREF() {
        return componentref;
    }

    /**
     * ??componentref?????
     * 
     * @param value
     *     allowed object is
     *     {@link VFBTIMING.COMPONENTREF }
     *     
     */
    public void setCOMPONENTREF(VFBTIMING.COMPONENTREF value) {
        this.componentref = value;
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
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}SW-COMPONENT-TYPE--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class COMPONENTREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected SWCOMPONENTTYPESUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link SWCOMPONENTTYPESUBTYPESENUM }
         *     
         */
        public SWCOMPONENTTYPESUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link SWCOMPONENTTYPESUBTYPESENUM }
         *     
         */
        public void setDEST(SWCOMPONENTTYPESUBTYPESENUM value) {
            this.dest = value;
        }

    }

}