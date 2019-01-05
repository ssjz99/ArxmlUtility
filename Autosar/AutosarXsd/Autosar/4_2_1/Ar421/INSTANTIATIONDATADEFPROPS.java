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
 * This is a general class allowing to apply additional SwDataDefProps to particular instantiations of a DataPrototype.
 * 
 * Typically the accessibility and further information like alias names for a  particular data is modeled on the level of DataPrototypes (especially  VariableDataPrototypes, ParameterDataPrototypes). But due to the recursive  structure of the meta-model concerning data types (a composite (data) type consists  out of data prototypes) a part of the MCD information is described in the data  type (in case of ApplicationCompositeDataType).
 * 
 * This is a strong restriction in the reuse of data typed because the data type should be re-used  for different VariableDataPrototypes and ParameterDataPrototypes to guarantee type  compatibility on C-implementation level (e.g. data of a Port is stored in PIM  or a ParameterDataPrototype used as ROM Block and shall be typed by the same data type as NVRAM Block).
 * 
 * This class overcomes such a restriction if applied properly.
 * 
 * <p>INSTANTIATION-DATA-DEF-PROPS complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="INSTANTIATION-DATA-DEF-PROPS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}INSTANTIATION-DATA-DEF-PROPS"/>
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
@XmlType(name = "INSTANTIATION-DATA-DEF-PROPS", propOrder = {
    "parameterinstance",
    "swdatadefprops",
    "variableinstance",
    "variationpoint"
})
public class INSTANTIATIONDATADEFPROPS {

    @XmlElement(name = "PARAMETER-INSTANCE")
    protected AUTOSARPARAMETERREF parameterinstance;
    @XmlElement(name = "SW-DATA-DEF-PROPS")
    protected SWDATADEFPROPS swdatadefprops;
    @XmlElement(name = "VARIABLE-INSTANCE")
    protected AUTOSARVARIABLEREF variableinstance;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??parameterinstance?????
     * 
     * @return
     *     possible object is
     *     {@link AUTOSARPARAMETERREF }
     *     
     */
    public AUTOSARPARAMETERREF getPARAMETERINSTANCE() {
        return parameterinstance;
    }

    /**
     * ??parameterinstance?????
     * 
     * @param value
     *     allowed object is
     *     {@link AUTOSARPARAMETERREF }
     *     
     */
    public void setPARAMETERINSTANCE(AUTOSARPARAMETERREF value) {
        this.parameterinstance = value;
    }

    /**
     * ??swdatadefprops?????
     * 
     * @return
     *     possible object is
     *     {@link SWDATADEFPROPS }
     *     
     */
    public SWDATADEFPROPS getSWDATADEFPROPS() {
        return swdatadefprops;
    }

    /**
     * ??swdatadefprops?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWDATADEFPROPS }
     *     
     */
    public void setSWDATADEFPROPS(SWDATADEFPROPS value) {
        this.swdatadefprops = value;
    }

    /**
     * ??variableinstance?????
     * 
     * @return
     *     possible object is
     *     {@link AUTOSARVARIABLEREF }
     *     
     */
    public AUTOSARVARIABLEREF getVARIABLEINSTANCE() {
        return variableinstance;
    }

    /**
     * ??variableinstance?????
     * 
     * @param value
     *     allowed object is
     *     {@link AUTOSARVARIABLEREF }
     *     
     */
    public void setVARIABLEINSTANCE(AUTOSARVARIABLEREF value) {
        this.variableinstance = value;
    }

    /**
     * ??variationpoint?????
     * 
     * @return
     *     possible object is
     *     {@link VARIATIONPOINT }
     *     
     */
    public VARIATIONPOINT getVARIATIONPOINT() {
        return variationpoint;
    }

    /**
     * ??variationpoint?????
     * 
     * @param value
     *     allowed object is
     *     {@link VARIATIONPOINT }
     *     
     */
    public void setVARIATIONPOINT(VARIATIONPOINT value) {
        this.variationpoint = value;
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
