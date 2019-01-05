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


/**
 * This element specifies a region in an image map. Image maps enable authors to specify regions in an object (e.g. a graphic) and to assign a specific activity to each region (e.g. load a document, launch a program etc.).
 * 
 * For more details refer to the specification of HTML.
 * 
 * <p>AREA complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="AREA">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AREA"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}AREA"/>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AREA")
public class AREA {

    @XmlAttribute(name = "ACCESSKEY")
    protected String accesskey;
    @XmlAttribute(name = "ALT")
    protected String alt;
    @XmlAttribute(name = "CLASS")
    protected String _class;
    @XmlAttribute(name = "COORDS")
    protected String coords;
    @XmlAttribute(name = "HREF")
    protected String href;
    @XmlAttribute(name = "NOHREF")
    protected AREAENUMNOHREFSIMPLE nohref;
    @XmlAttribute(name = "ONBLUR")
    protected String onblur;
    @XmlAttribute(name = "ONCLICK")
    protected String onclick;
    @XmlAttribute(name = "ONDBLCLICK")
    protected String ondblclick;
    @XmlAttribute(name = "ONFOCUS")
    protected String onfocus;
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
    @XmlAttribute(name = "SHAPE")
    protected AREAENUMSHAPESIMPLE shape;
    @XmlAttribute(name = "STYLE")
    protected String style;
    @XmlAttribute(name = "TABINDEX")
    protected String tabindex;
    @XmlAttribute(name = "TITLE")
    protected String title;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??accesskey?????
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCESSKEY() {
        return accesskey;
    }

    /**
     * ??accesskey?????
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCESSKEY(String value) {
        this.accesskey = value;
    }

    /**
     * ??alt?????
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getALT() {
        return alt;
    }

    /**
     * ??alt?????
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setALT(String value) {
        this.alt = value;
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
     * ??coords?????
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOORDS() {
        return coords;
    }

    /**
     * ??coords?????
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOORDS(String value) {
        this.coords = value;
    }

    /**
     * ??href?????
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHREF() {
        return href;
    }

    /**
     * ??href?????
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHREF(String value) {
        this.href = value;
    }

    /**
     * ??nohref?????
     * 
     * @return
     *     possible object is
     *     {@link AREAENUMNOHREFSIMPLE }
     *     
     */
    public AREAENUMNOHREFSIMPLE getNOHREF() {
        return nohref;
    }

    /**
     * ??nohref?????
     * 
     * @param value
     *     allowed object is
     *     {@link AREAENUMNOHREFSIMPLE }
     *     
     */
    public void setNOHREF(AREAENUMNOHREFSIMPLE value) {
        this.nohref = value;
    }

    /**
     * ??onblur?????
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getONBLUR() {
        return onblur;
    }

    /**
     * ??onblur?????
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setONBLUR(String value) {
        this.onblur = value;
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
     * ??onfocus?????
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getONFOCUS() {
        return onfocus;
    }

    /**
     * ??onfocus?????
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setONFOCUS(String value) {
        this.onfocus = value;
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
     * ??shape?????
     * 
     * @return
     *     possible object is
     *     {@link AREAENUMSHAPESIMPLE }
     *     
     */
    public AREAENUMSHAPESIMPLE getSHAPE() {
        return shape;
    }

    /**
     * ??shape?????
     * 
     * @param value
     *     allowed object is
     *     {@link AREAENUMSHAPESIMPLE }
     *     
     */
    public void setSHAPE(AREAENUMSHAPESIMPLE value) {
        this.shape = value;
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
     * ??tabindex?????
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTABINDEX() {
        return tabindex;
    }

    /**
     * ??tabindex?????
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTABINDEX(String value) {
        this.tabindex = value;
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
