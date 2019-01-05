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
 * This represents the ability to define the characteristics of the applicable event window
 * 
 * <p>DIAGNOSTIC-EVENT-WINDOW complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="DIAGNOSTIC-EVENT-WINDOW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}DIAGNOSTIC-EVENT-WINDOW"/>
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
@XmlType(name = "DIAGNOSTIC-EVENT-WINDOW", propOrder = {
    "eventwindowtime",
    "storagestateevaluation"
})
public class DIAGNOSTICEVENTWINDOW {

    @XmlElement(name = "EVENT-WINDOW-TIME")
    protected DIAGNOSTICEVENTWINDOWTIMEENUM eventwindowtime;
    @XmlElement(name = "STORAGE-STATE-EVALUATION")
    protected BOOLEAN storagestateevaluation;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??eventwindowtime?????
     * 
     * @return
     *     possible object is
     *     {@link DIAGNOSTICEVENTWINDOWTIMEENUM }
     *     
     */
    public DIAGNOSTICEVENTWINDOWTIMEENUM getEVENTWINDOWTIME() {
        return eventwindowtime;
    }

    /**
     * ??eventwindowtime?????
     * 
     * @param value
     *     allowed object is
     *     {@link DIAGNOSTICEVENTWINDOWTIMEENUM }
     *     
     */
    public void setEVENTWINDOWTIME(DIAGNOSTICEVENTWINDOWTIMEENUM value) {
        this.eventwindowtime = value;
    }

    /**
     * ??storagestateevaluation?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getSTORAGESTATEEVALUATION() {
        return storagestateevaluation;
    }

    /**
     * ??storagestateevaluation?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setSTORAGESTATEEVALUATION(BOOLEAN value) {
        this.storagestateevaluation = value;
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
