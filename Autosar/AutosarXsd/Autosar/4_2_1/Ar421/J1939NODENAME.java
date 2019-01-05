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
 * This element contains attributes to configure the J1939NmNode NAME.
 * 
 * <p>J-1939-NODE-NAME complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="J-1939-NODE-NAME">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}J-1939-NODE-NAME"/>
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
@XmlType(name = "J-1939-NODE-NAME", propOrder = {
    "arbitraryaddresscapable",
    "ecuinstance",
    "function",
    "functioninstance",
    "identitiynumber",
    "industrygroup",
    "manufacturercode",
    "vehiclesystem",
    "vehiclesysteminstance"
})
public class J1939NODENAME {

    @XmlElement(name = "ARBITRARY-ADDRESS-CAPABLE")
    protected BOOLEAN arbitraryaddresscapable;
    @XmlElement(name = "ECU-INSTANCE")
    protected INTEGER ecuinstance;
    @XmlElement(name = "FUNCTION")
    protected INTEGER function;
    @XmlElement(name = "FUNCTION-INSTANCE")
    protected INTEGER functioninstance;
    @XmlElement(name = "IDENTITIY-NUMBER")
    protected INTEGER identitiynumber;
    @XmlElement(name = "INDUSTRY-GROUP")
    protected INTEGER industrygroup;
    @XmlElement(name = "MANUFACTURER-CODE")
    protected INTEGER manufacturercode;
    @XmlElement(name = "VEHICLE-SYSTEM")
    protected INTEGER vehiclesystem;
    @XmlElement(name = "VEHICLE-SYSTEM-INSTANCE")
    protected INTEGER vehiclesysteminstance;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??arbitraryaddresscapable?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getARBITRARYADDRESSCAPABLE() {
        return arbitraryaddresscapable;
    }

    /**
     * ??arbitraryaddresscapable?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setARBITRARYADDRESSCAPABLE(BOOLEAN value) {
        this.arbitraryaddresscapable = value;
    }

    /**
     * ??ecuinstance?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getECUINSTANCE() {
        return ecuinstance;
    }

    /**
     * ??ecuinstance?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setECUINSTANCE(INTEGER value) {
        this.ecuinstance = value;
    }

    /**
     * ??function?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getFUNCTION() {
        return function;
    }

    /**
     * ??function?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setFUNCTION(INTEGER value) {
        this.function = value;
    }

    /**
     * ??functioninstance?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getFUNCTIONINSTANCE() {
        return functioninstance;
    }

    /**
     * ??functioninstance?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setFUNCTIONINSTANCE(INTEGER value) {
        this.functioninstance = value;
    }

    /**
     * ??identitiynumber?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getIDENTITIYNUMBER() {
        return identitiynumber;
    }

    /**
     * ??identitiynumber?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setIDENTITIYNUMBER(INTEGER value) {
        this.identitiynumber = value;
    }

    /**
     * ??industrygroup?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getINDUSTRYGROUP() {
        return industrygroup;
    }

    /**
     * ??industrygroup?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setINDUSTRYGROUP(INTEGER value) {
        this.industrygroup = value;
    }

    /**
     * ??manufacturercode?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getMANUFACTURERCODE() {
        return manufacturercode;
    }

    /**
     * ??manufacturercode?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setMANUFACTURERCODE(INTEGER value) {
        this.manufacturercode = value;
    }

    /**
     * ??vehiclesystem?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getVEHICLESYSTEM() {
        return vehiclesystem;
    }

    /**
     * ??vehiclesystem?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setVEHICLESYSTEM(INTEGER value) {
        this.vehiclesystem = value;
    }

    /**
     * ??vehiclesysteminstance?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getVEHICLESYSTEMINSTANCE() {
        return vehiclesysteminstance;
    }

    /**
     * ??vehiclesysteminstance?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setVEHICLESYSTEMINSTANCE(INTEGER value) {
        this.vehiclesysteminstance = value;
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
