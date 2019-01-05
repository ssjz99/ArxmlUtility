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
 * This class is a collection of properties relevant for data objects under various aspects. One could consider this class as a "pattern of inheritance by aggregation". The properties can be applied to all objects of all classes in which SwDataDefProps is aggregated.
 * 
 * Note that not all of the attributes or associated elements are useful all of the time. Hence, the process definition (e.g. expressed with an OCL or a Document Control Instance MSR-DCI) has the task of implementing limitations.
 * 
 * SwDataDefProps covers various aspects:
 * 
 * * Structure of the data element for calibration use cases: is it a single value, a curve, or a map, but also the recordLayouts which specify how such elements are mapped/converted to the DataTypes in the programming language (or in AUTOSAR). This is mainly expressed by properties like swRecordLayout and swCalprmAxisSet 
 * 
 * * Implementation aspects, mainly expressed by swImplPolicy, swVariableAccessImplPolicy, swAddrMethod, swPointerTagetProps, baseType, implementationDataType and additionalNativeTypeQualifier
 * 
 * * Access policy for the MCD system, mainly expressed by swCalibrationAccess 
 * 
 * * Semantics of the data element, mainly expressed by compuMethod and/or unit, dataConstr, invalidValue
 * 
 * * Code generation policy provided by swRecordLayout
 * 
 * <p>SW-DATA-DEF-PROPS complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="SW-DATA-DEF-PROPS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}SW-DATA-DEF-PROPS"/>
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
@XmlType(name = "SW-DATA-DEF-PROPS", propOrder = {
    "swdatadefpropsvariants"
})
public class SWDATADEFPROPS {

    @XmlElement(name = "SW-DATA-DEF-PROPS-VARIANTS")
    protected SWDATADEFPROPS.SWDATADEFPROPSVARIANTS swdatadefpropsvariants;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??swdatadefpropsvariants?????
     * 
     * @return
     *     possible object is
     *     {@link SWDATADEFPROPS.SWDATADEFPROPSVARIANTS }
     *     
     */
    public SWDATADEFPROPS.SWDATADEFPROPSVARIANTS getSWDATADEFPROPSVARIANTS() {
        return swdatadefpropsvariants;
    }

    /**
     * ??swdatadefpropsvariants?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWDATADEFPROPS.SWDATADEFPROPSVARIANTS }
     *     
     */
    public void setSWDATADEFPROPSVARIANTS(SWDATADEFPROPS.SWDATADEFPROPSVARIANTS value) {
        this.swdatadefpropsvariants = value;
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
     *         &lt;element name="SW-DATA-DEF-PROPS-CONDITIONAL" type="{http://autosar.org/schema/r4.0}SW-DATA-DEF-PROPS-CONDITIONAL"/>
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
        "swdatadefpropsconditional"
    })
    public static class SWDATADEFPROPSVARIANTS {

        @XmlElement(name = "SW-DATA-DEF-PROPS-CONDITIONAL")
        protected List<SWDATADEFPROPSCONDITIONAL> swdatadefpropsconditional;

        /**
         * Gets the value of the swdatadefpropsconditional property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the swdatadefpropsconditional property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSWDATADEFPROPSCONDITIONAL().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SWDATADEFPROPSCONDITIONAL }
         * 
         * 
         */
        public List<SWDATADEFPROPSCONDITIONAL> getSWDATADEFPROPSCONDITIONAL() {
            if (swdatadefpropsconditional == null) {
                swdatadefpropsconditional = new ArrayList<SWDATADEFPROPSCONDITIONAL>();
            }
            return this.swdatadefpropsconditional;
        }

    }

}
