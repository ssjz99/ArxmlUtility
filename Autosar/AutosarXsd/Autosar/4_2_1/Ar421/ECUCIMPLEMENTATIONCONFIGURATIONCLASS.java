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
 * Specifies which ConfigurationClass this parameter has in the individual ConfigurationVariants.
 * 
 * This element is removed from the specifications and therefore it shall not be used.
 * 
 * <p>ECUC-IMPLEMENTATION-CONFIGURATION-CLASS complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="ECUC-IMPLEMENTATION-CONFIGURATION-CLASS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ECUC-IMPLEMENTATION-CONFIGURATION-CLASS"/>
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
@XmlType(name = "ECUC-IMPLEMENTATION-CONFIGURATION-CLASS", propOrder = {
    "configclass",
    "configvariant"
})
public class ECUCIMPLEMENTATIONCONFIGURATIONCLASS {

    @XmlElement(name = "CONFIG-CLASS")
    protected ECUCCONFIGURATIONCLASSENUM configclass;
    @XmlElement(name = "CONFIG-VARIANT")
    protected ECUCCONFIGURATIONVARIANTENUM configvariant;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??configclass?????
     * 
     * @return
     *     possible object is
     *     {@link ECUCCONFIGURATIONCLASSENUM }
     *     
     */
    public ECUCCONFIGURATIONCLASSENUM getCONFIGCLASS() {
        return configclass;
    }

    /**
     * ??configclass?????
     * 
     * @param value
     *     allowed object is
     *     {@link ECUCCONFIGURATIONCLASSENUM }
     *     
     */
    public void setCONFIGCLASS(ECUCCONFIGURATIONCLASSENUM value) {
        this.configclass = value;
    }

    /**
     * ??configvariant?????
     * 
     * @return
     *     possible object is
     *     {@link ECUCCONFIGURATIONVARIANTENUM }
     *     
     */
    public ECUCCONFIGURATIONVARIANTENUM getCONFIGVARIANT() {
        return configvariant;
    }

    /**
     * ??configvariant?????
     * 
     * @param value
     *     allowed object is
     *     {@link ECUCCONFIGURATIONVARIANTENUM }
     *     
     */
    public void setCONFIGVARIANT(ECUCCONFIGURATIONVARIANTENUM value) {
        this.configvariant = value;
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
