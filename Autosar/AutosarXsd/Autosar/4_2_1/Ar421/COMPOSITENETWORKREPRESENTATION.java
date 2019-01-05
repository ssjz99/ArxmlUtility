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
 * This meta-class is used to define the network representation of leaf elements of composite application data types.
 * 
 * <p>COMPOSITE-NETWORK-REPRESENTATION complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="COMPOSITE-NETWORK-REPRESENTATION">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}COMPOSITE-NETWORK-REPRESENTATION"/>
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
@XmlType(name = "COMPOSITE-NETWORK-REPRESENTATION", propOrder = {
    "leafelementiref",
    "networkrepresentation"
})
public class COMPOSITENETWORKREPRESENTATION {

    @XmlElement(name = "LEAF-ELEMENT-IREF")
    protected APPLICATIONCOMPOSITEELEMENTINPORTINTERFACEINSTANCEREF leafelementiref;
    @XmlElement(name = "NETWORK-REPRESENTATION")
    protected SWDATADEFPROPS networkrepresentation;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??leafelementiref?????
     * 
     * @return
     *     possible object is
     *     {@link APPLICATIONCOMPOSITEELEMENTINPORTINTERFACEINSTANCEREF }
     *     
     */
    public APPLICATIONCOMPOSITEELEMENTINPORTINTERFACEINSTANCEREF getLEAFELEMENTIREF() {
        return leafelementiref;
    }

    /**
     * ??leafelementiref?????
     * 
     * @param value
     *     allowed object is
     *     {@link APPLICATIONCOMPOSITEELEMENTINPORTINTERFACEINSTANCEREF }
     *     
     */
    public void setLEAFELEMENTIREF(APPLICATIONCOMPOSITEELEMENTINPORTINTERFACEINSTANCEREF value) {
        this.leafelementiref = value;
    }

    /**
     * ??networkrepresentation?????
     * 
     * @return
     *     possible object is
     *     {@link SWDATADEFPROPS }
     *     
     */
    public SWDATADEFPROPS getNETWORKREPRESENTATION() {
        return networkrepresentation;
    }

    /**
     * ??networkrepresentation?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWDATADEFPROPS }
     *     
     */
    public void setNETWORKREPRESENTATION(SWDATADEFPROPS value) {
        this.networkrepresentation = value;
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
