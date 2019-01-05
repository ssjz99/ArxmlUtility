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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * SectionInitializationPolicyType describes the intended initialization of MemorySections. 
 * The following values are standardized in AUTOSAR Methodology:
 * 
 * * '''NO-INIT''': No initialization and no clearing is performed. Such data elements shall not be read before one has written a value into it.
 * * '''INIT''': To be used for data that are initialized by every reset to the specified value (initValue). 
 * * '''POWER-ON-INIT''': To be used for data that are initialized by "Power On" to the specified value (initValue). Note: there might be several resets between power on resets. 
 * * '''CLEARED''': To be used for data that are initialized by every reset to zero. 
 * * '''POWER-ON-CLEARED''': To be used for data that are initialized by "Power On" to zero. Note: there might be several resets between power on resets.
 * 
 * Please note that the values are defined similar to the representation of enumeration types in the XML schema to ensure backward compatibility.
 * 
 * <p>SECTION-INITIALIZATION-POLICY-TYPE complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="SECTION-INITIALIZATION-POLICY-TYPE">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://autosar.org/schema/r4.0>SECTION-INITIALIZATION-POLICY-TYPE--SIMPLE">
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SECTION-INITIALIZATION-POLICY-TYPE", propOrder = {
    "value"
})
public class SECTIONINITIALIZATIONPOLICYTYPE {

    @XmlValue
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String value;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??value?????
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * ??value?????
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
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
