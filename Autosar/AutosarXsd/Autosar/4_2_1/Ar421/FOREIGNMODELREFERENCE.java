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
 * This meta-class represents the ability to express a late binding reference to a foreign model element. The foreign model element can be from every model. Even if it is modeled according to the association representation, it is not limited to refer to AUTOSAR model elements.
 * 
 * <p>FOREIGN-MODEL-REFERENCE complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="FOREIGN-MODEL-REFERENCE">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF--SIMPLE">
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}FOREIGN-MODEL-REFERENCE"/>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FOREIGN-MODEL-REFERENCE", propOrder = {
    "value"
})
public class FOREIGNMODELREFERENCE {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;
    @XmlAttribute(name = "BASE")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String base;
    @XmlAttribute(name = "DEST")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String dest;

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

    /**
     * ??base?????
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBASE() {
        return base;
    }

    /**
     * ??base?????
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBASE(String value) {
        this.base = value;
    }

    /**
     * ??dest?????
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEST() {
        return dest;
    }

    /**
     * ??dest?????
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEST(String value) {
        this.dest = value;
    }

}
