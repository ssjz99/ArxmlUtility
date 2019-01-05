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
 * A FMFeatureSelection represents the state of a particular
 * FMFeature within a FMFeatureSelectionSet.
 * 
 * <p>FM-FEATURE-SELECTION complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="FM-FEATURE-SELECTION">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTILANGUAGE-REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}FM-FEATURE-SELECTION"/>
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
@XmlType(name = "FM-FEATURE-SELECTION", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "featureref",
    "state",
    "minimumselectedbindingtime",
    "maximumselectedbindingtime",
    "attributevalues"
})
public class FMFEATURESELECTION {

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
    @XmlElement(name = "FEATURE-REF")
    protected FMFEATURESELECTION.FEATUREREF featureref;
    @XmlElement(name = "STATE")
    protected FMFEATURESELECTIONSTATE state;
    @XmlElement(name = "MINIMUM-SELECTED-BINDING-TIME")
    protected BINDINGTIMEENUM minimumselectedbindingtime;
    @XmlElement(name = "MAXIMUM-SELECTED-BINDING-TIME")
    protected BINDINGTIMEENUM maximumselectedbindingtime;
    @XmlElement(name = "ATTRIBUTE-VALUES")
    protected FMFEATURESELECTION.ATTRIBUTEVALUES attributevalues;
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
     * ??featureref?????
     * 
     * @return
     *     possible object is
     *     {@link FMFEATURESELECTION.FEATUREREF }
     *     
     */
    public FMFEATURESELECTION.FEATUREREF getFEATUREREF() {
        return featureref;
    }

    /**
     * ??featureref?????
     * 
     * @param value
     *     allowed object is
     *     {@link FMFEATURESELECTION.FEATUREREF }
     *     
     */
    public void setFEATUREREF(FMFEATURESELECTION.FEATUREREF value) {
        this.featureref = value;
    }

    /**
     * ??state?????
     * 
     * @return
     *     possible object is
     *     {@link FMFEATURESELECTIONSTATE }
     *     
     */
    public FMFEATURESELECTIONSTATE getSTATE() {
        return state;
    }

    /**
     * ??state?????
     * 
     * @param value
     *     allowed object is
     *     {@link FMFEATURESELECTIONSTATE }
     *     
     */
    public void setSTATE(FMFEATURESELECTIONSTATE value) {
        this.state = value;
    }

    /**
     * ??minimumselectedbindingtime?????
     * 
     * @return
     *     possible object is
     *     {@link BINDINGTIMEENUM }
     *     
     */
    public BINDINGTIMEENUM getMINIMUMSELECTEDBINDINGTIME() {
        return minimumselectedbindingtime;
    }

    /**
     * ??minimumselectedbindingtime?????
     * 
     * @param value
     *     allowed object is
     *     {@link BINDINGTIMEENUM }
     *     
     */
    public void setMINIMUMSELECTEDBINDINGTIME(BINDINGTIMEENUM value) {
        this.minimumselectedbindingtime = value;
    }

    /**
     * ??maximumselectedbindingtime?????
     * 
     * @return
     *     possible object is
     *     {@link BINDINGTIMEENUM }
     *     
     */
    public BINDINGTIMEENUM getMAXIMUMSELECTEDBINDINGTIME() {
        return maximumselectedbindingtime;
    }

    /**
     * ??maximumselectedbindingtime?????
     * 
     * @param value
     *     allowed object is
     *     {@link BINDINGTIMEENUM }
     *     
     */
    public void setMAXIMUMSELECTEDBINDINGTIME(BINDINGTIMEENUM value) {
        this.maximumselectedbindingtime = value;
    }

    /**
     * ??attributevalues?????
     * 
     * @return
     *     possible object is
     *     {@link FMFEATURESELECTION.ATTRIBUTEVALUES }
     *     
     */
    public FMFEATURESELECTION.ATTRIBUTEVALUES getATTRIBUTEVALUES() {
        return attributevalues;
    }

    /**
     * ??attributevalues?????
     * 
     * @param value
     *     allowed object is
     *     {@link FMFEATURESELECTION.ATTRIBUTEVALUES }
     *     
     */
    public void setATTRIBUTEVALUES(FMFEATURESELECTION.ATTRIBUTEVALUES value) {
        this.attributevalues = value;
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
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="FM-ATTRIBUTE-VALUE" type="{http://autosar.org/schema/r4.0}FM-ATTRIBUTE-VALUE"/>
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
        "fmattributevalue"
    })
    public static class ATTRIBUTEVALUES {

        @XmlElement(name = "FM-ATTRIBUTE-VALUE")
        protected List<FMATTRIBUTEVALUE> fmattributevalue;

        /**
         * Gets the value of the fmattributevalue property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fmattributevalue property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFMATTRIBUTEVALUE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FMATTRIBUTEVALUE }
         * 
         * 
         */
        public List<FMATTRIBUTEVALUE> getFMATTRIBUTEVALUE() {
            if (fmattributevalue == null) {
                fmattributevalue = new ArrayList<FMATTRIBUTEVALUE>();
            }
            return this.fmattributevalue;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}FM-FEATURE--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class FEATUREREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected FMFEATURESUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link FMFEATURESUBTYPESENUM }
         *     
         */
        public FMFEATURESUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link FMFEATURESUBTYPESENUM }
         *     
         */
        public void setDEST(FMFEATURESUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
