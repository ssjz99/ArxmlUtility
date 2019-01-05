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
 * A value of this type is taken for controlling the range checking behavior of the AUTOSAR RTE.
 * 
 * <p>HANDLE-OUT-OF-RANGE-ENUM complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="HANDLE-OUT-OF-RANGE-ENUM">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://autosar.org/schema/r4.0>HANDLE-OUT-OF-RANGE-ENUM--SIMPLE">
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HANDLE-OUT-OF-RANGE-ENUM", propOrder = {
    "value"
})
public class HANDLEOUTOFRANGEENUM {

    @XmlValue
    protected HANDLEOUTOFRANGEENUMSIMPLE value;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??value?????
     * 
     * @return
     *     possible object is
     *     {@link HANDLEOUTOFRANGEENUMSIMPLE }
     *     
     */
    public HANDLEOUTOFRANGEENUMSIMPLE getValue() {
        return value;
    }

    /**
     * ??value?????
     * 
     * @param value
     *     allowed object is
     *     {@link HANDLEOUTOFRANGEENUMSIMPLE }
     *     
     */
    public void setValue(HANDLEOUTOFRANGEENUMSIMPLE value) {
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
