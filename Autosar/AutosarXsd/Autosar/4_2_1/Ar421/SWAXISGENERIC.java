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
 * This element defines a generic axis. In a generic axis the axispoints points are calculated in the ECU. 
 * The ECU is equipped with a fixed calculation algorithm. Parameters for the algorithm can be stored in the data component of the ECU. Therefore these parameters are specified in the data declaration, not in the calibration data.
 * 
 * <p>SW-AXIS-GENERIC complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="SW-AXIS-GENERIC">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}SW-AXIS-GENERIC"/>
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
@XmlType(name = "SW-AXIS-GENERIC", propOrder = {
    "swaxistyperef",
    "swnumberofaxispoints",
    "swgenericaxisparams"
})
public class SWAXISGENERIC {

    @XmlElement(name = "SW-AXIS-TYPE-REF")
    protected SWAXISGENERIC.SWAXISTYPEREF swaxistyperef;
    @XmlElement(name = "SW-NUMBER-OF-AXIS-POINTS")
    protected INTEGERVALUEVARIATIONPOINT swnumberofaxispoints;
    @XmlElement(name = "SW-GENERIC-AXIS-PARAMS")
    protected SWAXISGENERIC.SWGENERICAXISPARAMS swgenericaxisparams;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??swaxistyperef?????
     * 
     * @return
     *     possible object is
     *     {@link SWAXISGENERIC.SWAXISTYPEREF }
     *     
     */
    public SWAXISGENERIC.SWAXISTYPEREF getSWAXISTYPEREF() {
        return swaxistyperef;
    }

    /**
     * ??swaxistyperef?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWAXISGENERIC.SWAXISTYPEREF }
     *     
     */
    public void setSWAXISTYPEREF(SWAXISGENERIC.SWAXISTYPEREF value) {
        this.swaxistyperef = value;
    }

    /**
     * ??swnumberofaxispoints?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGERVALUEVARIATIONPOINT }
     *     
     */
    public INTEGERVALUEVARIATIONPOINT getSWNUMBEROFAXISPOINTS() {
        return swnumberofaxispoints;
    }

    /**
     * ??swnumberofaxispoints?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGERVALUEVARIATIONPOINT }
     *     
     */
    public void setSWNUMBEROFAXISPOINTS(INTEGERVALUEVARIATIONPOINT value) {
        this.swnumberofaxispoints = value;
    }

    /**
     * ??swgenericaxisparams?????
     * 
     * @return
     *     possible object is
     *     {@link SWAXISGENERIC.SWGENERICAXISPARAMS }
     *     
     */
    public SWAXISGENERIC.SWGENERICAXISPARAMS getSWGENERICAXISPARAMS() {
        return swgenericaxisparams;
    }

    /**
     * ??swgenericaxisparams?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWAXISGENERIC.SWGENERICAXISPARAMS }
     *     
     */
    public void setSWGENERICAXISPARAMS(SWAXISGENERIC.SWGENERICAXISPARAMS value) {
        this.swgenericaxisparams = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}SW-AXIS-TYPE--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SWAXISTYPEREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected SWAXISTYPESUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link SWAXISTYPESUBTYPESENUM }
         *     
         */
        public SWAXISTYPESUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link SWAXISTYPESUBTYPESENUM }
         *     
         */
        public void setDEST(SWAXISTYPESUBTYPESENUM value) {
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
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="SW-GENERIC-AXIS-PARAM" type="{http://autosar.org/schema/r4.0}SW-GENERIC-AXIS-PARAM"/>
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
        "swgenericaxisparam"
    })
    public static class SWGENERICAXISPARAMS {

        @XmlElement(name = "SW-GENERIC-AXIS-PARAM")
        protected List<SWGENERICAXISPARAM> swgenericaxisparam;

        /**
         * Gets the value of the swgenericaxisparam property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the swgenericaxisparam property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSWGENERICAXISPARAM().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SWGENERICAXISPARAM }
         * 
         * 
         */
        public List<SWGENERICAXISPARAM> getSWGENERICAXISPARAM() {
            if (swgenericaxisparam == null) {
                swgenericaxisparam = new ArrayList<SWGENERICAXISPARAM>();
            }
            return this.swgenericaxisparam;
        }

    }

}
