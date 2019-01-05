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
 * Declares a data object which is locally aggregated. Such an element can only be used within the scope where it is aggregated. 
 * 
 * This element either consists of further subElements or it is further defined via its swDataDefProps.
 * 
 * There are several use cases within the system of ImplementationDataTypes fur such a local declaration:
 * * It can represent the elements of an array, defining the element type and array size
 * * It can represent an element of a struct, defining its type
 * * It can be the local declaration of a debug element.
 * 
 * <p>IMPLEMENTATION-DATA-TYPE-ELEMENT complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="IMPLEMENTATION-DATA-TYPE-ELEMENT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTILANGUAGE-REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IMPLEMENTATION-DATA-TYPE-ELEMENT"/>
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
@XmlType(name = "IMPLEMENTATION-DATA-TYPE-ELEMENT", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "arraysize",
    "arraysizehandling",
    "arraysizesemantics",
    "subelements",
    "swdatadefprops",
    "variationpoint"
})
public class IMPLEMENTATIONDATATYPEELEMENT {

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
    @XmlElement(name = "ARRAY-SIZE")
    protected POSITIVEINTEGERVALUEVARIATIONPOINT arraysize;
    @XmlElement(name = "ARRAY-SIZE-HANDLING")
    protected ARRAYSIZEHANDLINGENUM arraysizehandling;
    @XmlElement(name = "ARRAY-SIZE-SEMANTICS")
    protected ARRAYSIZESEMANTICSENUM arraysizesemantics;
    @XmlElement(name = "SUB-ELEMENTS")
    protected IMPLEMENTATIONDATATYPEELEMENT.SUBELEMENTS subelements;
    @XmlElement(name = "SW-DATA-DEF-PROPS")
    protected SWDATADEFPROPS swdatadefprops;
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
     * ??arraysize?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGERVALUEVARIATIONPOINT }
     *     
     */
    public POSITIVEINTEGERVALUEVARIATIONPOINT getARRAYSIZE() {
        return arraysize;
    }

    /**
     * ??arraysize?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGERVALUEVARIATIONPOINT }
     *     
     */
    public void setARRAYSIZE(POSITIVEINTEGERVALUEVARIATIONPOINT value) {
        this.arraysize = value;
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
     * ??subelements?????
     * 
     * @return
     *     possible object is
     *     {@link IMPLEMENTATIONDATATYPEELEMENT.SUBELEMENTS }
     *     
     */
    public IMPLEMENTATIONDATATYPEELEMENT.SUBELEMENTS getSUBELEMENTS() {
        return subelements;
    }

    /**
     * ??subelements?????
     * 
     * @param value
     *     allowed object is
     *     {@link IMPLEMENTATIONDATATYPEELEMENT.SUBELEMENTS }
     *     
     */
    public void setSUBELEMENTS(IMPLEMENTATIONDATATYPEELEMENT.SUBELEMENTS value) {
        this.subelements = value;
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
     *         &lt;element name="IMPLEMENTATION-DATA-TYPE-ELEMENT" type="{http://autosar.org/schema/r4.0}IMPLEMENTATION-DATA-TYPE-ELEMENT"/>
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
        "implementationdatatypeelement"
    })
    public static class SUBELEMENTS {

        @XmlElement(name = "IMPLEMENTATION-DATA-TYPE-ELEMENT")
        protected List<IMPLEMENTATIONDATATYPEELEMENT> implementationdatatypeelement;

        /**
         * Gets the value of the implementationdatatypeelement property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the implementationdatatypeelement property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIMPLEMENTATIONDATATYPEELEMENT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IMPLEMENTATIONDATATYPEELEMENT }
         * 
         * 
         */
        public List<IMPLEMENTATIONDATATYPEELEMENT> getIMPLEMENTATIONDATATYPEELEMENT() {
            if (implementationdatatypeelement == null) {
                implementationdatatypeelement = new ArrayList<IMPLEMENTATIONDATATYPEELEMENT>();
            }
            return this.implementationdatatypeelement;
        }

    }

}