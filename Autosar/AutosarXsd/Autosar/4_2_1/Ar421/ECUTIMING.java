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
 * A model element used to define timing descriptions and constraints within the scope of one ECU configuration.
 * 
 * TimingDescriptions aggregated by EcuTiming are allowed to use all events derived from the class TimingDescriptionEvent.
 * 
 * <p>ECU-TIMING complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="ECU-TIMING">
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
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ECU-TIMING"/>
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
@XmlType(name = "ECU-TIMING", propOrder = {
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
    "ecuconfigurationref"
})
public class ECUTIMING {

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
    protected Ar421.BSWMODULETIMING.TIMINGDESCRIPTIONS timingdescriptions;
    @XmlElement(name = "TIMING-GUARANTEES")
    protected Ar421.BSWMODULETIMING.TIMINGGUARANTEES timingguarantees;
    @XmlElement(name = "TIMING-REQUIREMENTS")
    protected Ar421.BSWMODULETIMING.TIMINGREQUIREMENTS timingrequirements;
    @XmlElement(name = "ECU-CONFIGURATION-REF")
    protected ECUTIMING.ECUCONFIGURATIONREF ecuconfigurationref;
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
     * ??ecuconfigurationref?????
     * 
     * @return
     *     possible object is
     *     {@link ECUTIMING.ECUCONFIGURATIONREF }
     *     
     */
    public ECUTIMING.ECUCONFIGURATIONREF getECUCONFIGURATIONREF() {
        return ecuconfigurationref;
    }

    /**
     * ??ecuconfigurationref?????
     * 
     * @param value
     *     allowed object is
     *     {@link ECUTIMING.ECUCONFIGURATIONREF }
     *     
     */
    public void setECUCONFIGURATIONREF(ECUTIMING.ECUCONFIGURATIONREF value) {
        this.ecuconfigurationref = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}ECUC-VALUE-COLLECTION--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ECUCONFIGURATIONREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected ECUCVALUECOLLECTIONSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link ECUCVALUECOLLECTIONSUBTYPESENUM }
         *     
         */
        public ECUCVALUECOLLECTIONSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link ECUCVALUECOLLECTIONSUBTYPESENUM }
         *     
         */
        public void setDEST(ECUCVALUECOLLECTIONSUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
