//
// ????? JavaTM Architecture for XML Binding (JAXB) ???? v2.2.8-b130911.1802 ???
// ??? <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// ?????????, ??????????????
// ????: 2018.03.12 ?? 11:42:22 PM CET 
//


package Ar421;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Image maps enable authors to specify regions of an image or object and assign a specific action to each region (e.g., retrieve a document, run a program, etc.) When the region is activated by the user, the action is executed.
 * 
 * The class follows the html approach and is intended to support interactive documents.
 * 
 * <p>MAP complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="MAP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MAP"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}MAP"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MAP", propOrder = {
    "area"
})
public class MAP {

    @XmlElement(name = "AREA")
    protected List<AREA> area;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;
    @XmlAttribute(name = "CLASS")
    protected String _class;
    @XmlAttribute(name = "NAME")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String name;
    @XmlAttribute(name = "ONCLICK")
    protected String onclick;
    @XmlAttribute(name = "ONDBLCLICK")
    protected String ondblclick;
    @XmlAttribute(name = "ONKEYDOWN")
    protected String onkeydown;
    @XmlAttribute(name = "ONKEYPRESS")
    protected String onkeypress;
    @XmlAttribute(name = "ONKEYUP")
    protected String onkeyup;
    @XmlAttribute(name = "ONMOUSEDOWN")
    protected String onmousedown;
    @XmlAttribute(name = "ONMOUSEMOVE")
    protected String onmousemove;
    @XmlAttribute(name = "ONMOUSEOUT")
    protected String onmouseout;
    @XmlAttribute(name = "ONMOUSEOVER")
    protected String onmouseover;
    @XmlAttribute(name = "ONMOUSEUP")
    protected String onmouseup;
    @XmlAttribute(name = "STYLE")
    protected String style;
    @XmlAttribute(name = "TITLE")
    protected String title;

    /**
     * Gets the value of the area property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the area property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAREA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AREA }
     * 
     * 
     */
    public List<AREA> getAREA() {
        if (area == null) {
            area = new ArrayList<AREA>();
        }
        return this.area;
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
     * ??class?????
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLASS() {
        return _class;
    }

    /**
     * ??class?????
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLASS(String value) {
        this._class = value;
    }

    /**
     * ??name?????
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAME() {
        return name;
    }

    /**
     * ??name?????
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAME(String value) {
        this.name = value;
    }

    /**
     * ??onclick?????
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getONCLICK() {
        return onclick;
    }

    /**
     * ??onclick?????
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setONCLICK(String value) {
        this.onclick = value;
    }

    /**
     * ??ondblclick?????
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getONDBLCLICK() {
        return ondblclick;
    }

    /**
     * ??ondblclick?????
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setONDBLCLICK(String value) {
        this.ondblclick = value;
    }

    /**
     * ??onkeydown?????
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getONKEYDOWN() {
        return onkeydown;
    }

    /**
     * ??onkeydown?????
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setONKEYDOWN(String value) {
        this.onkeydown = value;
    }

    /**
     * ??onkeypress?????
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getONKEYPRESS() {
        return onkeypress;
    }

    /**
     * ??onkeypress?????
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setONKEYPRESS(String value) {
        this.onkeypress = value;
    }

    /**
     * ??onkeyup?????
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getONKEYUP() {
        return onkeyup;
    }

    /**
     * ??onkeyup?????
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setONKEYUP(String value) {
        this.onkeyup = value;
    }

    /**
     * ??onmousedown?????
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getONMOUSEDOWN() {
        return onmousedown;
    }

    /**
     * ??onmousedown?????
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setONMOUSEDOWN(String value) {
        this.onmousedown = value;
    }

    /**
     * ??onmousemove?????
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getONMOUSEMOVE() {
        return onmousemove;
    }

    /**
     * ??onmousemove?????
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setONMOUSEMOVE(String value) {
        this.onmousemove = value;
    }

    /**
     * ??onmouseout?????
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getONMOUSEOUT() {
        return onmouseout;
    }

    /**
     * ??onmouseout?????
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setONMOUSEOUT(String value) {
        this.onmouseout = value;
    }

    /**
     * ??onmouseover?????
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getONMOUSEOVER() {
        return onmouseover;
    }

    /**
     * ??onmouseover?????
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setONMOUSEOVER(String value) {
        this.onmouseover = value;
    }

    /**
     * ??onmouseup?????
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getONMOUSEUP() {
        return onmouseup;
    }

    /**
     * ??onmouseup?????
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setONMOUSEUP(String value) {
        this.onmouseup = value;
    }

    /**
     * ??style?????
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTYLE() {
        return style;
    }

    /**
     * ??style?????
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTYLE(String value) {
        this.style = value;
    }

    /**
     * ??title?????
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTITLE() {
        return title;
    }

    /**
     * ??title?????
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTITLE(String value) {
        this.title = value;
    }

}
