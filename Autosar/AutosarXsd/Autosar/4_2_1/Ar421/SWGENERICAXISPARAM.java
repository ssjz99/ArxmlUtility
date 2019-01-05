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
 * This element describes a specific parameter of a generic axis. The name of the parameter is defined through a reference to a parameter type defined on a corresponding axis type.
 * 
 * The value of the parameter is given here in case that it is not changeable during calibration. Example is shift / Offset in a fixed axis.
 * 
 * <p>SW-GENERIC-AXIS-PARAM complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="SW-GENERIC-AXIS-PARAM">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}SW-GENERIC-AXIS-PARAM"/>
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
@XmlType(name = "SW-GENERIC-AXIS-PARAM", propOrder = {
    "swgenericaxisparamtyperef",
    "vf"
})
public class SWGENERICAXISPARAM {

    @XmlElement(name = "SW-GENERIC-AXIS-PARAM-TYPE-REF")
    protected SWGENERICAXISPARAM.SWGENERICAXISPARAMTYPEREF swgenericaxisparamtyperef;
    @XmlElement(name = "VF")
    protected List<NUMERICALVALUEVARIATIONPOINT> vf;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??swgenericaxisparamtyperef?????
     * 
     * @return
     *     possible object is
     *     {@link SWGENERICAXISPARAM.SWGENERICAXISPARAMTYPEREF }
     *     
     */
    public SWGENERICAXISPARAM.SWGENERICAXISPARAMTYPEREF getSWGENERICAXISPARAMTYPEREF() {
        return swgenericaxisparamtyperef;
    }

    /**
     * ??swgenericaxisparamtyperef?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWGENERICAXISPARAM.SWGENERICAXISPARAMTYPEREF }
     *     
     */
    public void setSWGENERICAXISPARAMTYPEREF(SWGENERICAXISPARAM.SWGENERICAXISPARAMTYPEREF value) {
        this.swgenericaxisparamtyperef = value;
    }

    /**
     * Gets the value of the vf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVF().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NUMERICALVALUEVARIATIONPOINT }
     * 
     * 
     */
    public List<NUMERICALVALUEVARIATIONPOINT> getVF() {
        if (vf == null) {
            vf = new ArrayList<NUMERICALVALUEVARIATIONPOINT>();
        }
        return this.vf;
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

}
