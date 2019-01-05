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
 * This class specifies the ability to write dedicated documentation to a component type according to ASAM FSX.
 * 
 * <p>SW-COMPONENT-DOCUMENTATION complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="SW-COMPONENT-DOCUMENTATION">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}SW-COMPONENT-DOCUMENTATION"/>
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
@XmlType(name = "SW-COMPONENT-DOCUMENTATION", propOrder = {
    "swfeaturedef",
    "swfeaturedesc",
    "swtestdesc",
    "swcalibrationnotes",
    "swmaintenancenotes",
    "swdiagnosticsnotes",
    "swcarbdoc",
    "chapter",
    "variationpoint"
})
public class SWCOMPONENTDOCUMENTATION {

    @XmlElement(name = "SW-FEATURE-DEF")
    protected CHAPTER swfeaturedef;
    @XmlElement(name = "SW-FEATURE-DESC")
    protected CHAPTER swfeaturedesc;
    @XmlElement(name = "SW-TEST-DESC")
    protected CHAPTER swtestdesc;
    @XmlElement(name = "SW-CALIBRATION-NOTES")
    protected CHAPTER swcalibrationnotes;
    @XmlElement(name = "SW-MAINTENANCE-NOTES")
    protected CHAPTER swmaintenancenotes;
    @XmlElement(name = "SW-DIAGNOSTICS-NOTES")
    protected CHAPTER swdiagnosticsnotes;
    @XmlElement(name = "SW-CARB-DOC")
    protected CHAPTER swcarbdoc;
    @XmlElement(name = "CHAPTER")
    protected List<CHAPTER> chapter;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??swfeaturedef?????
     * 
     * @return
     *     possible object is
     *     {@link CHAPTER }
     *     
     */
    public CHAPTER getSWFEATUREDEF() {
        return swfeaturedef;
    }

    /**
     * ??swfeaturedef?????
     * 
     * @param value
     *     allowed object is
     *     {@link CHAPTER }
     *     
     */
    public void setSWFEATUREDEF(CHAPTER value) {
        this.swfeaturedef = value;
    }

    /**
     * ??swfeaturedesc?????
     * 
     * @return
     *     possible object is
     *     {@link CHAPTER }
     *     
     */
    public CHAPTER getSWFEATUREDESC() {
        return swfeaturedesc;
    }

    /**
     * ??swfeaturedesc?????
     * 
     * @param value
     *     allowed object is
     *     {@link CHAPTER }
     *     
     */
    public void setSWFEATUREDESC(CHAPTER value) {
        this.swfeaturedesc = value;
    }

    /**
     * ??swtestdesc?????
     * 
     * @return
     *     possible object is
     *     {@link CHAPTER }
     *     
     */
    public CHAPTER getSWTESTDESC() {
        return swtestdesc;
    }

    /**
     * ??swtestdesc?????
     * 
     * @param value
     *     allowed object is
     *     {@link CHAPTER }
     *     
     */
    public void setSWTESTDESC(CHAPTER value) {
        this.swtestdesc = value;
    }

    /**
     * ??swcalibrationnotes?????
     * 
     * @return
     *     possible object is
     *     {@link CHAPTER }
     *     
     */
    public CHAPTER getSWCALIBRATIONNOTES() {
        return swcalibrationnotes;
    }

    /**
     * ??swcalibrationnotes?????
     * 
     * @param value
     *     allowed object is
     *     {@link CHAPTER }
     *     
     */
    public void setSWCALIBRATIONNOTES(CHAPTER value) {
        this.swcalibrationnotes = value;
    }

    /**
     * ??swmaintenancenotes?????
     * 
     * @return
     *     possible object is
     *     {@link CHAPTER }
     *     
     */
    public CHAPTER getSWMAINTENANCENOTES() {
        return swmaintenancenotes;
    }

    /**
     * ??swmaintenancenotes?????
     * 
     * @param value
     *     allowed object is
     *     {@link CHAPTER }
     *     
     */
    public void setSWMAINTENANCENOTES(CHAPTER value) {
        this.swmaintenancenotes = value;
    }

    /**
     * ??swdiagnosticsnotes?????
     * 
     * @return
     *     possible object is
     *     {@link CHAPTER }
     *     
     */
    public CHAPTER getSWDIAGNOSTICSNOTES() {
        return swdiagnosticsnotes;
    }

    /**
     * ??swdiagnosticsnotes?????
     * 
     * @param value
     *     allowed object is
     *     {@link CHAPTER }
     *     
     */
    public void setSWDIAGNOSTICSNOTES(CHAPTER value) {
        this.swdiagnosticsnotes = value;
    }

    /**
     * ??swcarbdoc?????
     * 
     * @return
     *     possible object is
     *     {@link CHAPTER }
     *     
     */
    public CHAPTER getSWCARBDOC() {
        return swcarbdoc;
    }

    /**
     * ??swcarbdoc?????
     * 
     * @param value
     *     allowed object is
     *     {@link CHAPTER }
     *     
     */
    public void setSWCARBDOC(CHAPTER value) {
        this.swcarbdoc = value;
    }

    /**
     * Gets the value of the chapter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chapter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCHAPTER().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CHAPTER }
     * 
     * 
     */
    public List<CHAPTER> getCHAPTER() {
        if (chapter == null) {
            chapter = new ArrayList<CHAPTER>();
        }
        return this.chapter;
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
