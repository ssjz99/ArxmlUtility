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
 * Describes the properties of the elements of an application array data type.
 * 
 * <p>APPLICATION-ARRAY-ELEMENT complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="APPLICATION-ARRAY-ELEMENT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTILANGUAGE-REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ATP-FEATURE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ATP-PROTOTYPE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}DATA-PROTOTYPE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}APPLICATION-COMPOSITE-ELEMENT-DATA-PROTOTYPE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}APPLICATION-ARRAY-ELEMENT"/>
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
@XmlType(name = "APPLICATION-ARRAY-ELEMENT", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "swdatadefprops",
    "typetref",
    "arraysizehandling",
    "arraysizesemantics",
    "maxnumberofelements"
})
public class APPLICATIONARRAYELEMENT {

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
    @XmlElement(name = "SW-DATA-DEF-PROPS")
    protected SWDATADEFPROPS swdatadefprops;
    @XmlElement(name = "TYPE-TREF")
    protected Ar421.APPLICATIONRECORDELEMENT.TYPETREF typetref;
    @XmlElement(name = "ARRAY-SIZE-HANDLING")
    protected ARRAYSIZEHANDLINGENUM arraysizehandling;
    @XmlElement(name = "ARRAY-SIZE-SEMANTICS")
    protected ARRAYSIZESEMANTICSENUM arraysizesemantics;
    @XmlElement(name = "MAX-NUMBER-OF-ELEMENTS")
    protected POSITIVEINTEGERVALUEVARIATIONPOINT maxnumberofelements;
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
     * ??swdatadefprops?????
     * 
     * @return
     *     possible object is
     *     {@link SWDATADEFPROPS }
     *     
     */
    public SWDATADEFPROPS getSWDATADEFPROPS() {
        return swdatadefprops;
    }

    /**
     * ??swdatadefprops?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWDATADEFPROPS }
     *     
     */
    public void setSWDATADEFPROPS(SWDATADEFPROPS value) {
        this.swdatadefprops = value;
    }

    /**
     * ??typetref?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.APPLICATIONRECORDELEMENT.TYPETREF }
     *     
     */
    public Ar421.APPLICATIONRECORDELEMENT.TYPETREF getTYPETREF() {
        return typetref;
    }

    /**
     * ??typetref?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.APPLICATIONRECORDELEMENT.TYPETREF }
     *     
     */
    public void setTYPETREF(Ar421.APPLICATIONRECORDELEMENT.TYPETREF value) {
        this.typetref = value;
    }

    /**
     * ??arraysizehandling?????
     * 
     * @return
     *     possible object is
     *     {@link ARRAYSIZEHANDLINGENUM }
     *     
     */
    public ARRAYSIZEHANDLINGENUM getARRAYSIZEHANDLING() {
        return arraysizehandling;
    }

    /**
     * ??arraysizehandling?????
     * 
     * @param value
     *     allowed object is
     *     {@link ARRAYSIZEHANDLINGENUM }
     *     
     */
    public void setARRAYSIZEHANDLING(ARRAYSIZEHANDLINGENUM value) {
        this.arraysizehandling = value;
    }

    /**
     * ??arraysizesemantics?????
     * 
     * @return
     *     possible object is
     *     {@link ARRAYSIZESEMANTICSENUM }
     *     
     */
    public ARRAYSIZESEMANTICSENUM getARRAYSIZESEMANTICS() {
        return arraysizesemantics;
    }

    /**
     * ??arraysizesemantics?????
     * 
     * @param value
     *     allowed object is
     *     {@link ARRAYSIZESEMANTICSENUM }
     *     
     */
    public void setARRAYSIZESEMANTICS(ARRAYSIZESEMANTICSENUM value) {
        this.arraysizesemantics = value;
    }

    /**
     * ??maxnumberofelements?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGERVALUEVARIATIONPOINT }
     *     
     */
    public POSITIVEINTEGERVALUEVARIATIONPOINT getMAXNUMBEROFELEMENTS() {
        return maxnumberofelements;
    }

    /**
     * ??maxnumberofelements?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGERVALUEVARIATIONPOINT }
     *     
     */
    public void setMAXNUMBEROFELEMENTS(POSITIVEINTEGERVALUEVARIATIONPOINT value) {
        this.maxnumberofelements = value;
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

}
