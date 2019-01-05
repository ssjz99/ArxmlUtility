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
 * This meta-class provides a mapping between one record layout and its matching interpolation routines. This allows to formally specify the semantics of the interpolation routines. 
 * 
 * The use case is such that the curves/Maps define an interpolation method. This mapping table specifies which interpolation routine implements methods for a particular record layout. Using this information, the implementer of a software-component can select the appropriate interpolation routine.
 * 
 * <p>INTERPOLATION-ROUTINE-MAPPING complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="INTERPOLATION-ROUTINE-MAPPING">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}INTERPOLATION-ROUTINE-MAPPING"/>
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
@XmlType(name = "INTERPOLATION-ROUTINE-MAPPING", propOrder = {
    "interpolationroutines",
    "swrecordlayoutref"
})
public class INTERPOLATIONROUTINEMAPPING {

    @XmlElement(name = "INTERPOLATION-ROUTINES")
    protected INTERPOLATIONROUTINEMAPPING.INTERPOLATIONROUTINES interpolationroutines;
    @XmlElement(name = "SW-RECORD-LAYOUT-REF")
    protected INTERPOLATIONROUTINEMAPPING.SWRECORDLAYOUTREF swrecordlayoutref;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??interpolationroutines?????
     * 
     * @return
     *     possible object is
     *     {@link INTERPOLATIONROUTINEMAPPING.INTERPOLATIONROUTINES }
     *     
     */
    public INTERPOLATIONROUTINEMAPPING.INTERPOLATIONROUTINES getINTERPOLATIONROUTINES() {
        return interpolationroutines;
    }

    /**
     * ??interpolationroutines?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTERPOLATIONROUTINEMAPPING.INTERPOLATIONROUTINES }
     *     
     */
    public void setINTERPOLATIONROUTINES(INTERPOLATIONROUTINEMAPPING.INTERPOLATIONROUTINES value) {
        this.interpolationroutines = value;
    }

    /**
     * ??swrecordlayoutref?????
     * 
     * @return
     *     possible object is
     *     {@link INTERPOLATIONROUTINEMAPPING.SWRECORDLAYOUTREF }
     *     
     */
    public INTERPOLATIONROUTINEMAPPING.SWRECORDLAYOUTREF getSWRECORDLAYOUTREF() {
        return swrecordlayoutref;
    }

    /**
     * ??swrecordlayoutref?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTERPOLATIONROUTINEMAPPING.SWRECORDLAYOUTREF }
     *     
     */
    public void setSWRECORDLAYOUTREF(INTERPOLATIONROUTINEMAPPING.SWRECORDLAYOUTREF value) {
        this.swrecordlayoutref = value;
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
     *         &lt;element name="INTERPOLATION-ROUTINE" type="{http://autosar.org/schema/r4.0}INTERPOLATION-ROUTINE"/>
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
        "interpolationroutine"
    })
    public static class INTERPOLATIONROUTINES {

        @XmlElement(name = "INTERPOLATION-ROUTINE")
        protected List<INTERPOLATIONROUTINE> interpolationroutine;

        /**
         * Gets the value of the interpolationroutine property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the interpolationroutine property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getINTERPOLATIONROUTINE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link INTERPOLATIONROUTINE }
         * 
         * 
         */
        public List<INTERPOLATIONROUTINE> getINTERPOLATIONROUTINE() {
            if (interpolationroutine == null) {
                interpolationroutine = new ArrayList<INTERPOLATIONROUTINE>();
            }
            return this.interpolationroutine;
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
