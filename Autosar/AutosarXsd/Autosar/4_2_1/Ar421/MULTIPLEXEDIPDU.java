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
 * A MultiplexedPdu (i.e. NOT a COM I-PDU) contains a DynamicPart, an optional StaticPart and a selectorField. In case of multiplexing this IPdu is routed between the Pdu Multiplexer and the Interface Layer. 
 * 
 * A multiplexer is used to define variable parts within an IPdu that may carry different signals. The receivers of such a IPdu can determine which signalPdus are transmitted by evaluating the selector field, which carries a unique selector code for each sub-part.
 * 
 * <p>MULTIPLEXED-I-PDU complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="MULTIPLEXED-I-PDU">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTILANGUAGE-REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}COLLECTABLE-ELEMENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}PACKAGEABLE-ELEMENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}FIBEX-ELEMENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}PDU"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}I-PDU"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTIPLEXED-I-PDU"/>
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
@XmlType(name = "MULTIPLEXED-I-PDU", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "variationpoint",
    "length",
    "metadatalength",
    "containedipduprops",
    "dynamicparts",
    "selectorfieldbyteorder",
    "selectorfieldlength",
    "selectorfieldstartposition",
    "staticparts",
    "triggermode",
    "unusedbitpattern"
})
public class MULTIPLEXEDIPDU {

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
    @XmlElement(name = "LENGTH")
    protected INTEGER length;
    @XmlElement(name = "META-DATA-LENGTH")
    protected POSITIVEINTEGER metadatalength;
    @XmlElement(name = "CONTAINED-I-PDU-PROPS")
    protected CONTAINEDIPDUPROPS containedipduprops;
    @XmlElement(name = "DYNAMIC-PARTS")
    protected MULTIPLEXEDIPDU.DYNAMICPARTS dynamicparts;
    @XmlElement(name = "SELECTOR-FIELD-BYTE-ORDER")
    protected BYTEORDERENUM selectorfieldbyteorder;
    @XmlElement(name = "SELECTOR-FIELD-LENGTH")
    protected INTEGER selectorfieldlength;
    @XmlElement(name = "SELECTOR-FIELD-START-POSITION")
    protected INTEGER selectorfieldstartposition;
    @XmlElement(name = "STATIC-PARTS")
    protected MULTIPLEXEDIPDU.STATICPARTS staticparts;
    @XmlElement(name = "TRIGGER-MODE")
    protected TRIGGERMODE triggermode;
    @XmlElement(name = "UNUSED-BIT-PATTERN")
    protected INTEGER unusedbitpattern;
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
     * ??length?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getLENGTH() {
        return length;
    }

    /**
     * ??length?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setLENGTH(INTEGER value) {
        this.length = value;
    }

    /**
     * ??metadatalength?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getMETADATALENGTH() {
        return metadatalength;
    }

    /**
     * ??metadatalength?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setMETADATALENGTH(POSITIVEINTEGER value) {
        this.metadatalength = value;
    }

    /**
     * ??containedipduprops?????
     * 
     * @return
     *     possible object is
     *     {@link CONTAINEDIPDUPROPS }
     *     
     */
    public CONTAINEDIPDUPROPS getCONTAINEDIPDUPROPS() {
        return containedipduprops;
    }

    /**
     * ??containedipduprops?????
     * 
     * @param value
     *     allowed object is
     *     {@link CONTAINEDIPDUPROPS }
     *     
     */
    public void setCONTAINEDIPDUPROPS(CONTAINEDIPDUPROPS value) {
        this.containedipduprops = value;
    }

    /**
     * ??dynamicparts?????
     * 
     * @return
     *     possible object is
     *     {@link MULTIPLEXEDIPDU.DYNAMICPARTS }
     *     
     */
    public MULTIPLEXEDIPDU.DYNAMICPARTS getDYNAMICPARTS() {
        return dynamicparts;
    }

    /**
     * ??dynamicparts?????
     * 
     * @param value
     *     allowed object is
     *     {@link MULTIPLEXEDIPDU.DYNAMICPARTS }
     *     
     */
    public void setDYNAMICPARTS(MULTIPLEXEDIPDU.DYNAMICPARTS value) {
        this.dynamicparts = value;
    }

    /**
     * ??selectorfieldbyteorder?????
     * 
     * @return
     *     possible object is
     *     {@link BYTEORDERENUM }
     *     
     */
    public BYTEORDERENUM getSELECTORFIELDBYTEORDER() {
        return selectorfieldbyteorder;
    }

    /**
     * ??selectorfieldbyteorder?????
     * 
     * @param value
     *     allowed object is
     *     {@link BYTEORDERENUM }
     *     
     */
    public void setSELECTORFIELDBYTEORDER(BYTEORDERENUM value) {
        this.selectorfieldbyteorder = value;
    }

    /**
     * ??selectorfieldlength?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getSELECTORFIELDLENGTH() {
        return selectorfieldlength;
    }

    /**
     * ??selectorfieldlength?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setSELECTORFIELDLENGTH(INTEGER value) {
        this.selectorfieldlength = value;
    }

    /**
     * ??selectorfieldstartposition?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getSELECTORFIELDSTARTPOSITION() {
        return selectorfieldstartposition;
    }

    /**
     * ??selectorfieldstartposition?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setSELECTORFIELDSTARTPOSITION(INTEGER value) {
        this.selectorfieldstartposition = value;
    }

    /**
     * ??staticparts?????
     * 
     * @return
     *     possible object is
     *     {@link MULTIPLEXEDIPDU.STATICPARTS }
     *     
     */
    public MULTIPLEXEDIPDU.STATICPARTS getSTATICPARTS() {
        return staticparts;
    }

    /**
     * ??staticparts?????
     * 
     * @param value
     *     allowed object is
     *     {@link MULTIPLEXEDIPDU.STATICPARTS }
     *     
     */
    public void setSTATICPARTS(MULTIPLEXEDIPDU.STATICPARTS value) {
        this.staticparts = value;
    }

    /**
     * ??triggermode?????
     * 
     * @return
     *     possible object is
     *     {@link TRIGGERMODE }
     *     
     */
    public TRIGGERMODE getTRIGGERMODE() {
        return triggermode;
    }

    /**
     * ??triggermode?????
     * 
     * @param value
     *     allowed object is
     *     {@link TRIGGERMODE }
     *     
     */
    public void setTRIGGERMODE(TRIGGERMODE value) {
        this.triggermode = value;
    }

    /**
     * ??unusedbitpattern?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getUNUSEDBITPATTERN() {
        return unusedbitpattern;
    }

    /**
     * ??unusedbitpattern?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setUNUSEDBITPATTERN(INTEGER value) {
        this.unusedbitpattern = value;
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
     *         &lt;element name="DYNAMIC-PART" type="{http://autosar.org/schema/r4.0}DYNAMIC-PART"/>
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
        "dynamicpart"
    })
    public static class DYNAMICPARTS {

        @XmlElement(name = "DYNAMIC-PART")
        protected List<DYNAMICPART> dynamicpart;

        /**
         * Gets the value of the dynamicpart property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dynamicpart property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDYNAMICPART().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DYNAMICPART }
         * 
         * 
         */
        public List<DYNAMICPART> getDYNAMICPART() {
            if (dynamicpart == null) {
                dynamicpart = new ArrayList<DYNAMICPART>();
            }
            return this.dynamicpart;
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
     *         &lt;element name="STATIC-PART" type="{http://autosar.org/schema/r4.0}STATIC-PART"/>
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
        "staticpart"
    })
    public static class STATICPARTS {

        @XmlElement(name = "STATIC-PART")
        protected List<STATICPART> staticpart;

        /**
         * Gets the value of the staticpart property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the staticpart property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSTATICPART().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link STATICPART }
         * 
         * 
         */
        public List<STATICPART> getSTATICPART() {
            if (staticpart == null) {
                staticpart = new ArrayList<STATICPART>();
            }
            return this.staticpart;
        }

    }

}