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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * This meta-class represents the ability to express a late binding reference to a model element. The model element can be from every model. Even if it is modeled according to the association representation, it is not limited to refer to AUTOSAR model elements.
 * 
 * <p>GENERIC-MODEL-REFERENCE complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="GENERIC-MODEL-REFERENCE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}GENERIC-MODEL-REFERENCE"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}GENERIC-MODEL-REFERENCE"/>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GENERIC-MODEL-REFERENCE", propOrder = {
    "ref"
})
public class GENERICMODELREFERENCE {

    @XmlElement(name = "REF")
    protected REF ref;
    @XmlAttribute(name = "BASE")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String base;
    @XmlAttribute(name = "DEST")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String dest;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??ref?????
     * 
     * @return
     *     possible object is
     *     {@link REF }
     *     
     */
    public REF getREF() {
        return ref;
    }

    /**
     * ??ref?????
     * 
     * @param value
     *     allowed object is
     *     {@link REF }
     *     
     */
    public void setREF(REF value) {
        this.ref = value;
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
