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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * This element specifies an individual input parameter axis (abscissa).
 * 
 * <p>SW-CALPRM-AXIS complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="SW-CALPRM-AXIS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}SW-CALPRM-AXIS"/>
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
@XmlType(name = "SW-CALPRM-AXIS", propOrder = {
    "swaxisindex",
    "category",
    "swaxisgroupedOrSWAXISINDIVIDUAL",
    "swcalibrationaccess",
    "displayformat",
    "basetyperef"
})
public class SWCALPRMAXIS {

    @XmlElement(name = "SW-AXIS-INDEX")
    protected AXISINDEXTYPE swaxisindex;
    @XmlElement(name = "CATEGORY")
    protected CALPRMAXISCATEGORYENUM category;
    @XmlElements({
        @XmlElement(name = "SW-AXIS-GROUPED", type = SWAXISGROUPED.class),
        @XmlElement(name = "SW-AXIS-INDIVIDUAL", type = SWAXISINDIVIDUAL.class)
    })
    protected Object swaxisgroupedOrSWAXISINDIVIDUAL;
    @XmlElement(name = "SW-CALIBRATION-ACCESS")
    protected SWCALIBRATIONACCESSENUM swcalibrationaccess;
    @XmlElement(name = "DISPLAY-FORMAT")
    protected DISPLAYFORMATSTRING displayformat;
    @XmlElement(name = "BASE-TYPE-REF")
    protected SWCALPRMAXIS.BASETYPEREF basetyperef;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

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
     * ??swaxisgroupedOrSWAXISINDIVIDUAL?????
     * 
     * @return
     *     possible object is
     *     {@link SWAXISGROUPED }
     *     {@link SWAXISINDIVIDUAL }
     *     
     */
    public Object getSWAXISGROUPEDOrSWAXISINDIVIDUAL() {
        return swaxisgroupedOrSWAXISINDIVIDUAL;
    }

    /**
     * ??swaxisgroupedOrSWAXISINDIVIDUAL?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWAXISGROUPED }
     *     {@link SWAXISINDIVIDUAL }
     *     
     */
    public void setSWAXISGROUPEDOrSWAXISINDIVIDUAL(Object value) {
        this.swaxisgroupedOrSWAXISINDIVIDUAL = value;
    }

    /**
     * ??swcalibrationaccess?????
     * 
     * @return
     *     possible object is
     *     {@link SWCALIBRATIONACCESSENUM }
     *     
     */
    public SWCALIBRATIONACCESSENUM getSWCALIBRATIONACCESS() {
        return swcalibrationaccess;
    }

    /**
     * ??swcalibrationaccess?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWCALIBRATIONACCESSENUM }
     *     
     */
    public void setSWCALIBRATIONACCESS(SWCALIBRATIONACCESSENUM value) {
        this.swcalibrationaccess = value;
    }

    /**
     * ??displayformat?????
     * 
     * @return
     *     possible object is
     *     {@link DISPLAYFORMATSTRING }
     *     
     */
    public DISPLAYFORMATSTRING getDISPLAYFORMAT() {
        return displayformat;
    }

    /**
     * ??displayformat?????
     * 
     * @param value
     *     allowed object is
     *     {@link DISPLAYFORMATSTRING }
     *     
     */
    public void setDISPLAYFORMAT(DISPLAYFORMATSTRING value) {
        this.displayformat = value;
    }

    /**
     * ??basetyperef?????
     * 
     * @return
     *     possible object is
     *     {@link SWCALPRMAXIS.BASETYPEREF }
     *     
     */
    public SWCALPRMAXIS.BASETYPEREF getBASETYPEREF() {
        return basetyperef;
    }

    /**
     * ??basetyperef?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWCALPRMAXIS.BASETYPEREF }
     *     
     */
    public void setBASETYPEREF(SWCALPRMAXIS.BASETYPEREF value) {
        this.basetyperef = value;
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

}
