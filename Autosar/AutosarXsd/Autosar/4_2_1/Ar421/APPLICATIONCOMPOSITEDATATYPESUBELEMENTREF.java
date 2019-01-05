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
 * This meta-class represents the specialization of SubElementMapping with respect to ApplicationCompositeDataTypes.
 * 
 * <p>APPLICATION-COMPOSITE-DATA-TYPE-SUB-ELEMENT-REF complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="APPLICATION-COMPOSITE-DATA-TYPE-SUB-ELEMENT-REF">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}SUB-ELEMENT-REF"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}APPLICATION-COMPOSITE-DATA-TYPE-SUB-ELEMENT-REF"/>
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
@XmlType(name = "APPLICATION-COMPOSITE-DATA-TYPE-SUB-ELEMENT-REF", propOrder = {
    "variationpoint",
    "applicationcompositeelementiref"
})
public class APPLICATIONCOMPOSITEDATATYPESUBELEMENTREF {

    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlElement(name = "APPLICATION-COMPOSITE-ELEMENT-IREF")
    protected APPLICATIONCOMPOSITEELEMENTINPORTINTERFACEINSTANCEREF applicationcompositeelementiref;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

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
     * ??applicationcompositeelementiref?????
     * 
     * @return
     *     possible object is
     *     {@link APPLICATIONCOMPOSITEELEMENTINPORTINTERFACEINSTANCEREF }
     *     
     */
    public APPLICATIONCOMPOSITEELEMENTINPORTINTERFACEINSTANCEREF getAPPLICATIONCOMPOSITEELEMENTIREF() {
        return applicationcompositeelementiref;
    }

    /**
     * ??applicationcompositeelementiref?????
     * 
     * @param value
     *     allowed object is
     *     {@link APPLICATIONCOMPOSITEELEMENTINPORTINTERFACEINSTANCEREF }
     *     
     */
    public void setAPPLICATIONCOMPOSITEELEMENTIREF(APPLICATIONCOMPOSITEELEMENTINPORTINTERFACEINSTANCEREF value) {
        this.applicationcompositeelementiref = value;
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
