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
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * This specifies the legal values for the implementation policies for services (in AUTOSAR: BswModuleEntry-s).
 * 
 * <p>SW-SERVICE-IMPL-POLICY-ENUM complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="SW-SERVICE-IMPL-POLICY-ENUM">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://autosar.org/schema/r4.0>SW-SERVICE-IMPL-POLICY-ENUM--SIMPLE">
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SW-SERVICE-IMPL-POLICY-ENUM", propOrder = {
    "value"
})
public class SWSERVICEIMPLPOLICYENUM {

    @XmlValue
    protected SWSERVICEIMPLPOLICYENUMSIMPLE value;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??value?????
     * 
     * @return
     *     possible object is
     *     {@link SWSERVICEIMPLPOLICYENUMSIMPLE }
     *     
     */
    public SWSERVICEIMPLPOLICYENUMSIMPLE getValue() {
        return value;
    }

    /**
     * ??value?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWSERVICEIMPLPOLICYENUMSIMPLE }
     *     
     */
    public void setValue(SWSERVICEIMPLPOLICYENUMSIMPLE value) {
        this.value = value;
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
