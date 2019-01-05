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
 * This represents the values for the axis of a compound primitive (curve, map).
 * 
 * For standard and fix axes,  SwAxisCont contains the values of the axis directly. 
 * 
 * The axis values of SwAxisCont with the category CURVE_AXIS, COM_AXIS, RES_AXIS are for display only. For editing and processing, only the values in the related GroupAxis are binding.
 * 
 * <p>SW-AXIS-CONT complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="SW-AXIS-CONT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}SW-AXIS-CONT"/>
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
@XmlType(name = "SW-AXIS-CONT", propOrder = {
    "category",
    "unitref",
    "unitdisplayname",
    "swaxisindex",
    "swarraysize",
    "swvaluesphys"
})
public class SWAXISCONT {

    @XmlElement(name = "CATEGORY")
    protected CALPRMAXISCATEGORYENUM category;
    @XmlElement(name = "UNIT-REF")
    protected SWAXISCONT.UNITREF unitref;
    @XmlElement(name = "UNIT-DISPLAY-NAME")
    protected SINGLELANGUAGEUNITNAMES unitdisplayname;
    @XmlElement(name = "SW-AXIS-INDEX")
    protected AXISINDEXTYPE swaxisindex;
    @XmlElement(name = "SW-ARRAYSIZE")
    protected VALUELIST swarraysize;
    @XmlElement(name = "SW-VALUES-PHYS")
    protected SWVALUES swvaluesphys;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??category?????
     * 
     * @return
     *     possible object is
     *     {@link CALPRMAXISCATEGORYENUM }
     *     
     */
    public CALPRMAXISCATEGORYENUM getCATEGORY() {
        return category;
    }

    /**
     * ??category?????
     * 
     * @param value
     *     allowed object is
     *     {@link CALPRMAXISCATEGORYENUM }
     *     
     */
    public void setCATEGORY(CALPRMAXISCATEGORYENUM value) {
        this.category = value;
    }

    /**
     * ??unitref?????
     * 
     * @return
     *     possible object is
     *     {@link SWAXISCONT.UNITREF }
     *     
     */
    public SWAXISCONT.UNITREF getUNITREF() {
        return unitref;
    }

    /**
     * ??unitref?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWAXISCONT.UNITREF }
     *     
     */
    public void setUNITREF(SWAXISCONT.UNITREF value) {
        this.unitref = value;
    }

    /**
     * ??unitdisplayname?????
     * 
     * @return
     *     possible object is
     *     {@link SINGLELANGUAGEUNITNAMES }
     *     
     */
    public SINGLELANGUAGEUNITNAMES getUNITDISPLAYNAME() {
        return unitdisplayname;
    }

    /**
     * ??unitdisplayname?????
     * 
     * @param value
     *     allowed object is
     *     {@link SINGLELANGUAGEUNITNAMES }
     *     
     */
    public void setUNITDISPLAYNAME(SINGLELANGUAGEUNITNAMES value) {
        this.unitdisplayname = value;
    }

    /**
     * ??swaxisindex?????
     * 
     * @return
     *     possible object is
     *     {@link AXISINDEXTYPE }
     *     
     */
    public AXISINDEXTYPE getSWAXISINDEX() {
        return swaxisindex;
    }

    /**
     * ??swaxisindex?????
     * 
     * @param value
     *     allowed object is
     *     {@link AXISINDEXTYPE }
     *     
     */
    public void setSWAXISINDEX(AXISINDEXTYPE value) {
        this.swaxisindex = value;
    }

    /**
     * ??swarraysize?????
     * 
     * @return
     *     possible object is
     *     {@link VALUELIST }
     *     
     */
    public VALUELIST getSWARRAYSIZE() {
        return swarraysize;
    }

    /**
     * ??swarraysize?????
     * 
     * @param value
     *     allowed object is
     *     {@link VALUELIST }
     *     
     */
    public void setSWARRAYSIZE(VALUELIST value) {
        this.swarraysize = value;
    }

    /**
     * ??swvaluesphys?????
     * 
     * @return
     *     possible object is
     *     {@link SWVALUES }
     *     
     */
    public SWVALUES getSWVALUESPHYS() {
        return swvaluesphys;
    }

    /**
     * ??swvaluesphys?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWVALUES }
     *     
     */
    public void setSWVALUESPHYS(SWVALUES value) {
        this.swvaluesphys = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}UNIT--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class UNITREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected UNITSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link UNITSUBTYPESENUM }
         *     
         */
        public UNITSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link UNITSUBTYPESENUM }
         *     
         */
        public void setDEST(UNITSUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
