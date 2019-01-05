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
 * This element specifies which values are stored for the current SwRecordLayoutGroup. If no baseType is present, the SwBaseType referenced initially in the parent SwRecordLayoutGroup is valid. The specification of swRecordLayoutVAxis gives the axis of the values which shall be stored in accordance with the current record layout SwRecordLayoutGroup. In swRecordLayoutVProp one can specify the information which shall be stored.
 * 
 * <p>SW-RECORD-LAYOUT-V complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="SW-RECORD-LAYOUT-V">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}SW-RECORD-LAYOUT-V"/>
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
@XmlType(name = "SW-RECORD-LAYOUT-V", propOrder = {
    "shortlabel",
    "category",
    "desc",
    "basetyperef",
    "swrecordlayoutvaxis",
    "swrecordlayoutvprop",
    "swrecordlayoutvindex",
    "swgenericaxisparamtyperef",
    "swrecordlayoutvfixvalue"
})
public class SWRECORDLAYOUTV {

    @XmlElement(name = "SHORT-LABEL")
    protected IDENTIFIER shortlabel;
    @XmlElement(name = "CATEGORY")
    protected ASAMRECORDLAYOUTSEMANTICS category;
    @XmlElement(name = "DESC")
    protected MULTILANGUAGEOVERVIEWPARAGRAPH desc;
    @XmlElement(name = "BASE-TYPE-REF")
    protected SWRECORDLAYOUTV.BASETYPEREF basetyperef;
    @XmlElement(name = "SW-RECORD-LAYOUT-V-AXIS")
    protected AXISINDEXTYPE swrecordlayoutvaxis;
    @XmlElement(name = "SW-RECORD-LAYOUT-V-PROP")
    protected NMTOKENSTRING swrecordlayoutvprop;
    @XmlElement(name = "SW-RECORD-LAYOUT-V-INDEX")
    protected NMTOKENSSTRING swrecordlayoutvindex;
    @XmlElement(name = "SW-GENERIC-AXIS-PARAM-TYPE-REF")
    protected SWRECORDLAYOUTV.SWGENERICAXISPARAMTYPEREF swgenericaxisparamtyperef;
    @XmlElement(name = "SW-RECORD-LAYOUT-V-FIX-VALUE")
    protected INTEGER swrecordlayoutvfixvalue;
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
     * ??basetyperef?????
     * 
     * @return
     *     possible object is
     *     {@link SWRECORDLAYOUTV.BASETYPEREF }
     *     
     */
    public SWRECORDLAYOUTV.BASETYPEREF getBASETYPEREF() {
        return basetyperef;
    }

    /**
     * ??basetyperef?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWRECORDLAYOUTV.BASETYPEREF }
     *     
     */
    public void setBASETYPEREF(SWRECORDLAYOUTV.BASETYPEREF value) {
        this.basetyperef = value;
    }

    /**
     * ??swrecordlayoutvaxis?????
     * 
     * @return
     *     possible object is
     *     {@link AXISINDEXTYPE }
     *     
     */
    public AXISINDEXTYPE getSWRECORDLAYOUTVAXIS() {
        return swrecordlayoutvaxis;
    }

    /**
     * ??swrecordlayoutvaxis?????
     * 
     * @param value
     *     allowed object is
     *     {@link AXISINDEXTYPE }
     *     
     */
    public void setSWRECORDLAYOUTVAXIS(AXISINDEXTYPE value) {
        this.swrecordlayoutvaxis = value;
    }

    /**
     * ??swrecordlayoutvprop?????
     * 
     * @return
     *     possible object is
     *     {@link NMTOKENSTRING }
     *     
     */
    public NMTOKENSTRING getSWRECORDLAYOUTVPROP() {
        return swrecordlayoutvprop;
    }

    /**
     * ??swrecordlayoutvprop?????
     * 
     * @param value
     *     allowed object is
     *     {@link NMTOKENSTRING }
     *     
     */
    public void setSWRECORDLAYOUTVPROP(NMTOKENSTRING value) {
        this.swrecordlayoutvprop = value;
    }

    /**
     * ??swrecordlayoutvindex?????
     * 
     * @return
     *     possible object is
     *     {@link NMTOKENSSTRING }
     *     
     */
    public NMTOKENSSTRING getSWRECORDLAYOUTVINDEX() {
        return swrecordlayoutvindex;
    }

    /**
     * ??swrecordlayoutvindex?????
     * 
     * @param value
     *     allowed object is
     *     {@link NMTOKENSSTRING }
     *     
     */
    public void setSWRECORDLAYOUTVINDEX(NMTOKENSSTRING value) {
        this.swrecordlayoutvindex = value;
    }

    /**
     * ??swgenericaxisparamtyperef?????
     * 
     * @return
     *     possible object is
     *     {@link SWRECORDLAYOUTV.SWGENERICAXISPARAMTYPEREF }
     *     
     */
    public SWRECORDLAYOUTV.SWGENERICAXISPARAMTYPEREF getSWGENERICAXISPARAMTYPEREF() {
        return swgenericaxisparamtyperef;
    }

    /**
     * ??swgenericaxisparamtyperef?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWRECORDLAYOUTV.SWGENERICAXISPARAMTYPEREF }
     *     
     */
    public void setSWGENERICAXISPARAMTYPEREF(SWRECORDLAYOUTV.SWGENERICAXISPARAMTYPEREF value) {
        this.swgenericaxisparamtyperef = value;
    }

    /**
     * ??swrecordlayoutvfixvalue?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getSWRECORDLAYOUTVFIXVALUE() {
        return swrecordlayoutvfixvalue;
    }

    /**
     * ??swrecordlayoutvfixvalue?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setSWRECORDLAYOUTVFIXVALUE(INTEGER value) {
        this.swrecordlayoutvfixvalue = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}SW-BASE-TYPE--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class BASETYPEREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected SWBASETYPESUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link SWBASETYPESUBTYPESENUM }
         *     
         */
        public SWBASETYPESUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link SWBASETYPESUBTYPESENUM }
         *     
         */
        public void setDEST(SWBASETYPESUBTYPESENUM value) {
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

}
