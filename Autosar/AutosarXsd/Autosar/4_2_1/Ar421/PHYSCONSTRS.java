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
 * This meta-class represents the ability to express physical constraints. Therefore it has (in opposite to InternalConstrs) a reference to a Unit.
 * 
 * <p>PHYS-CONSTRS complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="PHYS-CONSTRS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}PHYS-CONSTRS"/>
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
@XmlType(name = "PHYS-CONSTRS", propOrder = {
    "lowerlimit",
    "upperlimit",
    "scaleconstrs",
    "maxgradient",
    "maxdiff",
    "monotony",
    "unitref"
})
public class PHYSCONSTRS {

    @XmlElement(name = "LOWER-LIMIT")
    protected LIMIT lowerlimit;
    @XmlElement(name = "UPPER-LIMIT")
    protected LIMIT upperlimit;
    @XmlElement(name = "SCALE-CONSTRS")
    protected PHYSCONSTRS.SCALECONSTRS scaleconstrs;
    @XmlElement(name = "MAX-GRADIENT")
    protected NUMERICALVALUE maxgradient;
    @XmlElement(name = "MAX-DIFF")
    protected NUMERICALVALUE maxdiff;
    @XmlElement(name = "MONOTONY")
    protected MONOTONYENUM monotony;
    @XmlElement(name = "UNIT-REF")
    protected PHYSCONSTRS.UNITREF unitref;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??lowerlimit?????
     * 
     * @return
     *     possible object is
     *     {@link LIMIT }
     *     
     */
    public LIMIT getLOWERLIMIT() {
        return lowerlimit;
    }

    /**
     * ??lowerlimit?????
     * 
     * @param value
     *     allowed object is
     *     {@link LIMIT }
     *     
     */
    public void setLOWERLIMIT(LIMIT value) {
        this.lowerlimit = value;
    }

    /**
     * ??upperlimit?????
     * 
     * @return
     *     possible object is
     *     {@link LIMIT }
     *     
     */
    public LIMIT getUPPERLIMIT() {
        return upperlimit;
    }

    /**
     * ??upperlimit?????
     * 
     * @param value
     *     allowed object is
     *     {@link LIMIT }
     *     
     */
    public void setUPPERLIMIT(LIMIT value) {
        this.upperlimit = value;
    }

    /**
     * ??scaleconstrs?????
     * 
     * @return
     *     possible object is
     *     {@link PHYSCONSTRS.SCALECONSTRS }
     *     
     */
    public PHYSCONSTRS.SCALECONSTRS getSCALECONSTRS() {
        return scaleconstrs;
    }

    /**
     * ??scaleconstrs?????
     * 
     * @param value
     *     allowed object is
     *     {@link PHYSCONSTRS.SCALECONSTRS }
     *     
     */
    public void setSCALECONSTRS(PHYSCONSTRS.SCALECONSTRS value) {
        this.scaleconstrs = value;
    }

    /**
     * ??maxgradient?????
     * 
     * @return
     *     possible object is
     *     {@link NUMERICALVALUE }
     *     
     */
    public NUMERICALVALUE getMAXGRADIENT() {
        return maxgradient;
    }

    /**
     * ??maxgradient?????
     * 
     * @param value
     *     allowed object is
     *     {@link NUMERICALVALUE }
     *     
     */
    public void setMAXGRADIENT(NUMERICALVALUE value) {
        this.maxgradient = value;
    }

    /**
     * ??maxdiff?????
     * 
     * @return
     *     possible object is
     *     {@link NUMERICALVALUE }
     *     
     */
    public NUMERICALVALUE getMAXDIFF() {
        return maxdiff;
    }

    /**
     * ??maxdiff?????
     * 
     * @param value
     *     allowed object is
     *     {@link NUMERICALVALUE }
     *     
     */
    public void setMAXDIFF(NUMERICALVALUE value) {
        this.maxdiff = value;
    }

    /**
     * ??monotony?????
     * 
     * @return
     *     possible object is
     *     {@link MONOTONYENUM }
     *     
     */
    public MONOTONYENUM getMONOTONY() {
        return monotony;
    }

    /**
     * ??monotony?????
     * 
     * @param value
     *     allowed object is
     *     {@link MONOTONYENUM }
     *     
     */
    public void setMONOTONY(MONOTONYENUM value) {
        this.monotony = value;
    }

    /**
     * ??unitref?????
     * 
     * @return
     *     possible object is
     *     {@link PHYSCONSTRS.UNITREF }
     *     
     */
    public PHYSCONSTRS.UNITREF getUNITREF() {
        return unitref;
    }

    /**
     * ??unitref?????
     * 
     * @param value
     *     allowed object is
     *     {@link PHYSCONSTRS.UNITREF }
     *     
     */
    public void setUNITREF(PHYSCONSTRS.UNITREF value) {
        this.unitref = value;
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
     *         &lt;element name="SCALE-CONSTR" type="{http://autosar.org/schema/r4.0}SCALE-CONSTR"/>
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
        "scaleconstr"
    })
    public static class SCALECONSTRS {

        @XmlElement(name = "SCALE-CONSTR")
        protected List<SCALECONSTR> scaleconstr;

        /**
         * Gets the value of the scaleconstr property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the scaleconstr property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSCALECONSTR().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SCALECONSTR }
         * 
         * 
         */
        public List<SCALECONSTR> getSCALECONSTR() {
            if (scaleconstr == null) {
                scaleconstr = new ArrayList<SCALECONSTR>();
            }
            return this.scaleconstr;
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