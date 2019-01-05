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
 * This element describes the interdependencies of data objects, e.g. variables and parameters. 
 * 
 * Use cases:
 * * Calculate the value of a calibration parameter (by the MCD system) from the value(s) of other calibration parameters.
 * * Virtual data - that means the data object is not directly in the ecu and this property describes how the "virtual variable" can be computed from the real ones (by the MCD system).
 * 
 * <p>SW-DATA-DEPENDENCY complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="SW-DATA-DEPENDENCY">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}SW-DATA-DEPENDENCY"/>
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
@XmlType(name = "SW-DATA-DEPENDENCY", propOrder = {
    "swdatadependencyformula",
    "swdatadependencyargs"
})
public class SWDATADEPENDENCY {

    @XmlElement(name = "SW-DATA-DEPENDENCY-FORMULA")
    protected COMPUGENERICMATH swdatadependencyformula;
    @XmlElement(name = "SW-DATA-DEPENDENCY-ARGS")
    protected SWDATADEPENDENCYARGS swdatadependencyargs;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??swdatadependencyformula?????
     * 
     * @return
     *     possible object is
     *     {@link COMPUGENERICMATH }
     *     
     */
    public COMPUGENERICMATH getSWDATADEPENDENCYFORMULA() {
        return swdatadependencyformula;
    }

    /**
     * ??swdatadependencyformula?????
     * 
     * @param value
     *     allowed object is
     *     {@link COMPUGENERICMATH }
     *     
     */
    public void setSWDATADEPENDENCYFORMULA(COMPUGENERICMATH value) {
        this.swdatadependencyformula = value;
    }

    /**
     * ??swdatadependencyargs?????
     * 
     * @return
     *     possible object is
     *     {@link SWDATADEPENDENCYARGS }
     *     
     */
    public SWDATADEPENDENCYARGS getSWDATADEPENDENCYARGS() {
        return swdatadependencyargs;
    }

    /**
     * ??swdatadependencyargs?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWDATADEPENDENCYARGS }
     *     
     */
    public void setSWDATADEPENDENCYARGS(SWDATADEPENDENCYARGS value) {
        this.swdatadependencyargs = value;
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

}
