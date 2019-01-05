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
 * Specifies how a record layout is set up. Using SwRecordLayoutGroup it recursively models iterations through axis values. The subelement swRecordLayoutGroupContentType may reference other SwRecordLayouts, SwRecordLayoutVs and SwRecordLayoutGroups for the modeled record layout.
 * 
 * <p>SW-RECORD-LAYOUT-GROUP complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="SW-RECORD-LAYOUT-GROUP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}SW-RECORD-LAYOUT-GROUP"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SW-RECORD-LAYOUT-GROUP", propOrder = {
    "shortlabel",
    "category",
    "desc",
    "swrecordlayoutgroupaxis",
    "swrecordlayoutgroupindex",
    "swgenericaxisparamtyperef",
    "swrecordlayoutgroupfrom",
    "swrecordlayoutgroupto",
    "swrecordlayoutgroupstep",
    "swrecordlayoutcomponent",
    "swrecordlayoutrefOrSWRECORDLAYOUTVOrSWRECORDLAYOUTGROUP"
})
public class SWRECORDLAYOUTGROUP {

    @XmlElement(name = "SHORT-LABEL")
    protected IDENTIFIER shortlabel;
    @XmlElement(name = "CATEGORY")
    protected ASAMRECORDLAYOUTSEMANTICS category;
    @XmlElement(name = "DESC")
    protected MULTILANGUAGEOVERVIEWPARAGRAPH desc;
    @XmlElement(name = "SW-RECORD-LAYOUT-GROUP-AXIS")
    protected AXISINDEXTYPE swrecordlayoutgroupaxis;
    @XmlElement(name = "SW-RECORD-LAYOUT-GROUP-INDEX")
    protected NMTOKENSTRING swrecordlayoutgroupindex;
    @XmlElement(name = "SW-GENERIC-AXIS-PARAM-TYPE-REF")
    protected SWRECORDLAYOUTGROUP.SWGENERICAXISPARAMTYPEREF swgenericaxisparamtyperef;
    @XmlElement(name = "SW-RECORD-LAYOUT-GROUP-FROM")
    protected RECORDLAYOUTITERATORPOINT swrecordlayoutgroupfrom;
    @XmlElement(name = "SW-RECORD-LAYOUT-GROUP-TO")
    protected RECORDLAYOUTITERATORPOINT swrecordlayoutgroupto;
    @XmlElement(name = "SW-RECORD-LAYOUT-GROUP-STEP")
    protected INTEGER swrecordlayoutgroupstep;
    @XmlElement(name = "SW-RECORD-LAYOUT-COMPONENT")
    protected IDENTIFIER swrecordlayoutcomponent;
    @XmlElements({
        @XmlElement(name = "SW-RECORD-LAYOUT-REF", type = SWRECORDLAYOUTGROUP.SWRECORDLAYOUTREF.class),
        @XmlElement(name = "SW-RECORD-LAYOUT-V", type = SWRECORDLAYOUTV.class),
        @XmlElement(name = "SW-RECORD-LAYOUT-GROUP", type = SWRECORDLAYOUTGROUP.class)
    })
    protected List<Object> swrecordlayoutrefOrSWRECORDLAYOUTVOrSWRECORDLAYOUTGROUP;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??shortlabel?????
     * 
     * @return
     *     possible object is
     *     {@link IDENTIFIER }
     *     
     */
    public IDENTIFIER getSHORTLABEL() {
        return shortlabel;
    }

    /**
     * ??shortlabel?????
     * 
     * @param value
     *     allowed object is
     *     {@link IDENTIFIER }
     *     
     */
    public void setSHORTLABEL(IDENTIFIER value) {
        this.shortlabel = value;
    }

    /**
     * ??category?????
     * 
     * @return
     *     possible object is
     *     {@link ASAMRECORDLAYOUTSEMANTICS }
     *     
     */
    public ASAMRECORDLAYOUTSEMANTICS getCATEGORY() {
        return category;
    }

    /**
     * ??category?????
     * 
     * @param value
     *     allowed object is
     *     {@link ASAMRECORDLAYOUTSEMANTICS }
     *     
     */
    public void setCATEGORY(ASAMRECORDLAYOUTSEMANTICS value) {
        this.category = value;
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
     * ??swrecordlayoutgroupaxis?????
     * 
     * @return
     *     possible object is
     *     {@link AXISINDEXTYPE }
     *     
     */
    public AXISINDEXTYPE getSWRECORDLAYOUTGROUPAXIS() {
        return swrecordlayoutgroupaxis;
    }

    /**
     * ??swrecordlayoutgroupaxis?????
     * 
     * @param value
     *     allowed object is
     *     {@link AXISINDEXTYPE }
     *     
     */
    public void setSWRECORDLAYOUTGROUPAXIS(AXISINDEXTYPE value) {
        this.swrecordlayoutgroupaxis = value;
    }

    /**
     * ??swrecordlayoutgroupindex?????
     * 
     * @return
     *     possible object is
     *     {@link NMTOKENSTRING }
     *     
     */
    public NMTOKENSTRING getSWRECORDLAYOUTGROUPINDEX() {
        return swrecordlayoutgroupindex;
    }

    /**
     * ??swrecordlayoutgroupindex?????
     * 
     * @param value
     *     allowed object is
     *     {@link NMTOKENSTRING }
     *     
     */
    public void setSWRECORDLAYOUTGROUPINDEX(NMTOKENSTRING value) {
        this.swrecordlayoutgroupindex = value;
    }

    /**
     * ??swgenericaxisparamtyperef?????
     * 
     * @return
     *     possible object is
     *     {@link SWRECORDLAYOUTGROUP.SWGENERICAXISPARAMTYPEREF }
     *     
     */
    public SWRECORDLAYOUTGROUP.SWGENERICAXISPARAMTYPEREF getSWGENERICAXISPARAMTYPEREF() {
        return swgenericaxisparamtyperef;
    }

    /**
     * ??swgenericaxisparamtyperef?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWRECORDLAYOUTGROUP.SWGENERICAXISPARAMTYPEREF }
     *     
     */
    public void setSWGENERICAXISPARAMTYPEREF(SWRECORDLAYOUTGROUP.SWGENERICAXISPARAMTYPEREF value) {
        this.swgenericaxisparamtyperef = value;
    }

    /**
     * ??swrecordlayoutgroupfrom?????
     * 
     * @return
     *     possible object is
     *     {@link RECORDLAYOUTITERATORPOINT }
     *     
     */
    public RECORDLAYOUTITERATORPOINT getSWRECORDLAYOUTGROUPFROM() {
        return swrecordlayoutgroupfrom;
    }

    /**
     * ??swrecordlayoutgroupfrom?????
     * 
     * @param value
     *     allowed object is
     *     {@link RECORDLAYOUTITERATORPOINT }
     *     
     */
    public void setSWRECORDLAYOUTGROUPFROM(RECORDLAYOUTITERATORPOINT value) {
        this.swrecordlayoutgroupfrom = value;
    }

    /**
     * ??swrecordlayoutgroupto?????
     * 
     * @return
     *     possible object is
     *     {@link RECORDLAYOUTITERATORPOINT }
     *     
     */
    public RECORDLAYOUTITERATORPOINT getSWRECORDLAYOUTGROUPTO() {
        return swrecordlayoutgroupto;
    }

    /**
     * ??swrecordlayoutgroupto?????
     * 
     * @param value
     *     allowed object is
     *     {@link RECORDLAYOUTITERATORPOINT }
     *     
     */
    public void setSWRECORDLAYOUTGROUPTO(RECORDLAYOUTITERATORPOINT value) {
        this.swrecordlayoutgroupto = value;
    }

    /**
     * ??swrecordlayoutgroupstep?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getSWRECORDLAYOUTGROUPSTEP() {
        return swrecordlayoutgroupstep;
    }

    /**
     * ??swrecordlayoutgroupstep?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setSWRECORDLAYOUTGROUPSTEP(INTEGER value) {
        this.swrecordlayoutgroupstep = value;
    }

    /**
     * ??swrecordlayoutcomponent?????
     * 
     * @return
     *     possible object is
     *     {@link IDENTIFIER }
     *     
     */
    public IDENTIFIER getSWRECORDLAYOUTCOMPONENT() {
        return swrecordlayoutcomponent;
    }

    /**
     * ??swrecordlayoutcomponent?????
     * 
     * @param value
     *     allowed object is
     *     {@link IDENTIFIER }
     *     
     */
    public void setSWRECORDLAYOUTCOMPONENT(IDENTIFIER value) {
        this.swrecordlayoutcomponent = value;
    }

    /**
     * Gets the value of the swrecordlayoutrefOrSWRECORDLAYOUTVOrSWRECORDLAYOUTGROUP property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the swrecordlayoutrefOrSWRECORDLAYOUTVOrSWRECORDLAYOUTGROUP property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSWRECORDLAYOUTREFOrSWRECORDLAYOUTVOrSWRECORDLAYOUTGROUP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SWRECORDLAYOUTGROUP.SWRECORDLAYOUTREF }
     * {@link SWRECORDLAYOUTV }
     * {@link SWRECORDLAYOUTGROUP }
     * 
     * 
     */
    public List<Object> getSWRECORDLAYOUTREFOrSWRECORDLAYOUTVOrSWRECORDLAYOUTGROUP() {
        if (swrecordlayoutrefOrSWRECORDLAYOUTVOrSWRECORDLAYOUTGROUP == null) {
            swrecordlayoutrefOrSWRECORDLAYOUTVOrSWRECORDLAYOUTGROUP = new ArrayList<Object>();
        }
        return this.swrecordlayoutrefOrSWRECORDLAYOUTVOrSWRECORDLAYOUTGROUP;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}SW-GENERIC-AXIS-PARAM-TYPE--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SWGENERICAXISPARAMTYPEREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected SWGENERICAXISPARAMTYPESUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link SWGENERICAXISPARAMTYPESUBTYPESENUM }
         *     
         */
        public SWGENERICAXISPARAMTYPESUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link SWGENERICAXISPARAMTYPESUBTYPESENUM }
         *     
         */
        public void setDEST(SWGENERICAXISPARAMTYPESUBTYPESENUM value) {
            this.dest = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}SW-RECORD-LAYOUT--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SWRECORDLAYOUTREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected SWRECORDLAYOUTSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link SWRECORDLAYOUTSUBTYPESENUM }
         *     
         */
        public SWRECORDLAYOUTSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link SWRECORDLAYOUTSUBTYPESENUM }
         *     
         */
        public void setDEST(SWRECORDLAYOUTSUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
