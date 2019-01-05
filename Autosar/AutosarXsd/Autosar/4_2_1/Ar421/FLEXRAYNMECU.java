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
 * FlexRay specific attributes.
 * 
 * <p>FLEXRAY-NM-ECU complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="FLEXRAY-NM-ECU">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}BUSSPECIFIC-NM-ECU"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}FLEXRAY-NM-ECU"/>
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
@XmlType(name = "FLEXRAY-NM-ECU", propOrder = {
    "nmhwvoteenabled",
    "nmmainfunctionacrossfrcycle",
    "nmrepeatmessagebitenable"
})
public class FLEXRAYNMECU {

    @XmlElement(name = "NM-HW-VOTE-ENABLED")
    protected BOOLEAN nmhwvoteenabled;
    @XmlElement(name = "NM-MAIN-FUNCTION-ACROSS-FR-CYCLE")
    protected BOOLEAN nmmainfunctionacrossfrcycle;
    @XmlElement(name = "NM-REPEAT-MESSAGE-BIT-ENABLE")
    protected BOOLEAN nmrepeatmessagebitenable;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??nmhwvoteenabled?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getNMHWVOTEENABLED() {
        return nmhwvoteenabled;
    }

    /**
     * ??nmhwvoteenabled?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setNMHWVOTEENABLED(BOOLEAN value) {
        this.nmhwvoteenabled = value;
    }

    /**
     * ??nmmainfunctionacrossfrcycle?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getNMMAINFUNCTIONACROSSFRCYCLE() {
        return nmmainfunctionacrossfrcycle;
    }

    /**
     * ??nmmainfunctionacrossfrcycle?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setNMMAINFUNCTIONACROSSFRCYCLE(BOOLEAN value) {
        this.nmmainfunctionacrossfrcycle = value;
    }

    /**
     * ??nmrepeatmessagebitenable?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getNMREPEATMESSAGEBITENABLE() {
        return nmrepeatmessagebitenable;
    }

    /**
     * ??nmrepeatmessagebitenable?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setNMREPEATMESSAGEBITENABLE(BOOLEAN value) {
        this.nmrepeatmessagebitenable = value;
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
