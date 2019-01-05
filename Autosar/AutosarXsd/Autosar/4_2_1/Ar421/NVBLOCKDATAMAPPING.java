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
 * Defines the mapping between the VariableDataPrototypes in the NvBlockComponents ports and the VariableDataPrototypes of the RAM Block.
 * 
 * The data types of the referenced VariableDataPrototypes in the ports and the referenced sub-element (inside a CompositeDataType) of the VariableDataPrototype representing the RAM Block shall be compatible.
 * 
 * <p>NV-BLOCK-DATA-MAPPING complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="NV-BLOCK-DATA-MAPPING">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}NV-BLOCK-DATA-MAPPING"/>
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
@XmlType(name = "NV-BLOCK-DATA-MAPPING", propOrder = {
    "nvramblockelement",
    "readnvdata",
    "writtennvdata",
    "writtenreadnvdata",
    "variationpoint"
})
public class NVBLOCKDATAMAPPING {

    @XmlElement(name = "NV-RAM-BLOCK-ELEMENT")
    protected AUTOSARVARIABLEREF nvramblockelement;
    @XmlElement(name = "READ-NV-DATA")
    protected AUTOSARVARIABLEREF readnvdata;
    @XmlElement(name = "WRITTEN-NV-DATA")
    protected AUTOSARVARIABLEREF writtennvdata;
    @XmlElement(name = "WRITTEN-READ-NV-DATA")
    protected AUTOSARVARIABLEREF writtenreadnvdata;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??nvramblockelement?????
     * 
     * @return
     *     possible object is
     *     {@link AUTOSARVARIABLEREF }
     *     
     */
    public AUTOSARVARIABLEREF getNVRAMBLOCKELEMENT() {
        return nvramblockelement;
    }

    /**
     * ??nvramblockelement?????
     * 
     * @param value
     *     allowed object is
     *     {@link AUTOSARVARIABLEREF }
     *     
     */
    public void setNVRAMBLOCKELEMENT(AUTOSARVARIABLEREF value) {
        this.nvramblockelement = value;
    }

    /**
     * ??readnvdata?????
     * 
     * @return
     *     possible object is
     *     {@link AUTOSARVARIABLEREF }
     *     
     */
    public AUTOSARVARIABLEREF getREADNVDATA() {
        return readnvdata;
    }

    /**
     * ??readnvdata?????
     * 
     * @param value
     *     allowed object is
     *     {@link AUTOSARVARIABLEREF }
     *     
     */
    public void setREADNVDATA(AUTOSARVARIABLEREF value) {
        this.readnvdata = value;
    }

    /**
     * ??writtennvdata?????
     * 
     * @return
     *     possible object is
     *     {@link AUTOSARVARIABLEREF }
     *     
     */
    public AUTOSARVARIABLEREF getWRITTENNVDATA() {
        return writtennvdata;
    }

    /**
     * ??writtennvdata?????
     * 
     * @param value
     *     allowed object is
     *     {@link AUTOSARVARIABLEREF }
     *     
     */
    public void setWRITTENNVDATA(AUTOSARVARIABLEREF value) {
        this.writtennvdata = value;
    }

    /**
     * ??writtenreadnvdata?????
     * 
     * @return
     *     possible object is
     *     {@link AUTOSARVARIABLEREF }
     *     
     */
    public AUTOSARVARIABLEREF getWRITTENREADNVDATA() {
        return writtenreadnvdata;
    }

    /**
     * ??writtenreadnvdata?????
     * 
     * @param value
     *     allowed object is
     *     {@link AUTOSARVARIABLEREF }
     *     
     */
    public void setWRITTENREADNVDATA(AUTOSARVARIABLEREF value) {
        this.writtenreadnvdata = value;
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
