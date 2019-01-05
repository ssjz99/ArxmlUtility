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
 * The class represents that the related attribute is modifiable during the blueprinting. It applies only to attribute with upper multiplicity greater than 1.
 * 
 * <p>BLUEPRINT-POLICY-LIST complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="BLUEPRINT-POLICY-LIST">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}BLUEPRINT-POLICY"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}BLUEPRINT-POLICY-MODIFIABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}BLUEPRINT-POLICY-LIST"/>
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
@XmlType(name = "BLUEPRINT-POLICY-LIST", propOrder = {
    "attributename",
    "blueprintderivationguide",
    "maxnumberofelements",
    "minnumberofelements"
})
public class BLUEPRINTPOLICYLIST {

    @XmlElement(name = "ATTRIBUTE-NAME")
    protected STRING attributename;
    @XmlElement(name = "BLUEPRINT-DERIVATION-GUIDE")
    protected DOCUMENTATIONBLOCK blueprintderivationguide;
    @XmlElement(name = "MAX-NUMBER-OF-ELEMENTS")
    protected POSITIVEINTEGERVALUEVARIATIONPOINT maxnumberofelements;
    @XmlElement(name = "MIN-NUMBER-OF-ELEMENTS")
    protected POSITIVEINTEGERVALUEVARIATIONPOINT minnumberofelements;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??attributename?????
     * 
     * @return
     *     possible object is
     *     {@link STRING }
     *     
     */
    public STRING getATTRIBUTENAME() {
        return attributename;
    }

    /**
     * ??attributename?????
     * 
     * @param value
     *     allowed object is
     *     {@link STRING }
     *     
     */
    public void setATTRIBUTENAME(STRING value) {
        this.attributename = value;
    }

    /**
     * ??blueprintderivationguide?????
     * 
     * @return
     *     possible object is
     *     {@link DOCUMENTATIONBLOCK }
     *     
     */
    public DOCUMENTATIONBLOCK getBLUEPRINTDERIVATIONGUIDE() {
        return blueprintderivationguide;
    }

    /**
     * ??blueprintderivationguide?????
     * 
     * @param value
     *     allowed object is
     *     {@link DOCUMENTATIONBLOCK }
     *     
     */
    public void setBLUEPRINTDERIVATIONGUIDE(DOCUMENTATIONBLOCK value) {
        this.blueprintderivationguide = value;
    }

    /**
     * ??maxnumberofelements?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGERVALUEVARIATIONPOINT }
     *     
     */
    public POSITIVEINTEGERVALUEVARIATIONPOINT getMAXNUMBEROFELEMENTS() {
        return maxnumberofelements;
    }

    /**
     * ??maxnumberofelements?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGERVALUEVARIATIONPOINT }
     *     
     */
    public void setMAXNUMBEROFELEMENTS(POSITIVEINTEGERVALUEVARIATIONPOINT value) {
        this.maxnumberofelements = value;
    }

    /**
     * ??minnumberofelements?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGERVALUEVARIATIONPOINT }
     *     
     */
    public POSITIVEINTEGERVALUEVARIATIONPOINT getMINNUMBEROFELEMENTS() {
        return minnumberofelements;
    }

    /**
     * ??minnumberofelements?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGERVALUEVARIATIONPOINT }
     *     
     */
    public void setMINNUMBEROFELEMENTS(POSITIVEINTEGERVALUEVARIATIONPOINT value) {
        this.minnumberofelements = value;
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
