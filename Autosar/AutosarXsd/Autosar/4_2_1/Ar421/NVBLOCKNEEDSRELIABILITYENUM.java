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
 * Reliability against data loss on the non-volatile medium.
 * These requirements give only a relative indication, for example on the required degree of redundancy for storage. 
 * 
 * They do, however, not specify by which means (e.g. software or hardware) the reliability is actually achieved.
 * 
 * <p>NV-BLOCK-NEEDS-RELIABILITY-ENUM complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="NV-BLOCK-NEEDS-RELIABILITY-ENUM">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://autosar.org/schema/r4.0>NV-BLOCK-NEEDS-RELIABILITY-ENUM--SIMPLE">
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NV-BLOCK-NEEDS-RELIABILITY-ENUM", propOrder = {
    "value"
})
public class NVBLOCKNEEDSRELIABILITYENUM {

    @XmlValue
    protected NVBLOCKNEEDSRELIABILITYENUMSIMPLE value;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??value?????
     * 
     * @return
     *     possible object is
     *     {@link NVBLOCKNEEDSRELIABILITYENUMSIMPLE }
     *     
     */
    public NVBLOCKNEEDSRELIABILITYENUMSIMPLE getValue() {
        return value;
    }

    /**
     * ??value?????
     * 
     * @param value
     *     allowed object is
     *     {@link NVBLOCKNEEDSRELIABILITYENUMSIMPLE }
     *     
     */
    public void setValue(NVBLOCKNEEDSRELIABILITYENUMSIMPLE value) {
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
