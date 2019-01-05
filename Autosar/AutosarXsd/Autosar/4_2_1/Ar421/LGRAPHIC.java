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
 * This meta-class represents the figure in one particular language.
 * 
 * <p>L-GRAPHIC complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="L-GRAPHIC">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}LANGUAGE-SPECIFIC"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}L-GRAPHIC"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}LANGUAGE-SPECIFIC"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "L-GRAPHIC", propOrder = {
    "graphic",
    "map"
})
public class LGRAPHIC {

    @XmlElement(name = "GRAPHIC")
    protected GRAPHIC graphic;
    @XmlElement(name = "MAP")
    protected MAP map;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;
    @XmlAttribute(name = "L", required = true)
    protected LENUMSIMPLE l;

    /**
     * ??graphic?????
     * 
     * @return
     *     possible object is
     *     {@link GRAPHIC }
     *     
     */
    public GRAPHIC getGRAPHIC() {
        return graphic;
    }

    /**
     * ??graphic?????
     * 
     * @param value
     *     allowed object is
     *     {@link GRAPHIC }
     *     
     */
    public void setGRAPHIC(GRAPHIC value) {
        this.graphic = value;
    }

    /**
     * ??map?????
     * 
     * @return
     *     possible object is
     *     {@link MAP }
     *     
     */
    public MAP getMAP() {
        return map;
    }

    /**
     * ??map?????
     * 
     * @param value
     *     allowed object is
     *     {@link MAP }
     *     
     */
    public void setMAP(MAP value) {
        this.map = value;
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
     * ??l?????
     * 
     * @return
     *     possible object is
     *     {@link LENUMSIMPLE }
     *     
     */
    public LENUMSIMPLE getL() {
        return l;
    }

    /**
     * ??l?????
     * 
     * @param value
     *     allowed object is
     *     {@link LENUMSIMPLE }
     *     
     */
    public void setL(LENUMSIMPLE value) {
        this.l = value;
    }

}
