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


/**
 * Default Value which will be distributed if no I-Pdu has been received since last sending.
 * 
 * <p>PDU-MAPPING-DEFAULT-VALUE complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="PDU-MAPPING-DEFAULT-VALUE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}PDU-MAPPING-DEFAULT-VALUE"/>
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
@XmlType(name = "PDU-MAPPING-DEFAULT-VALUE", propOrder = {
    "defaultvalueelements"
})
public class PDUMAPPINGDEFAULTVALUE {

    @XmlElement(name = "DEFAULT-VALUE-ELEMENTS")
    protected PDUMAPPINGDEFAULTVALUE.DEFAULTVALUEELEMENTS defaultvalueelements;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??defaultvalueelements?????
     * 
     * @return
     *     possible object is
     *     {@link PDUMAPPINGDEFAULTVALUE.DEFAULTVALUEELEMENTS }
     *     
     */
    public PDUMAPPINGDEFAULTVALUE.DEFAULTVALUEELEMENTS getDEFAULTVALUEELEMENTS() {
        return defaultvalueelements;
    }

    /**
     * ??defaultvalueelements?????
     * 
     * @param value
     *     allowed object is
     *     {@link PDUMAPPINGDEFAULTVALUE.DEFAULTVALUEELEMENTS }
     *     
     */
    public void setDEFAULTVALUEELEMENTS(PDUMAPPINGDEFAULTVALUE.DEFAULTVALUEELEMENTS value) {
        this.defaultvalueelements = value;
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
     * <p>anonymous complex type? Java ??
     * 
     * <p>????????????????????
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="DEFAULT-VALUE-ELEMENT" type="{http://autosar.org/schema/r4.0}DEFAULT-VALUE-ELEMENT"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "defaultvalueelement"
    })
    public static class DEFAULTVALUEELEMENTS {

        @XmlElement(name = "DEFAULT-VALUE-ELEMENT")
        protected List<DEFAULTVALUEELEMENT> defaultvalueelement;

        /**
         * Gets the value of the defaultvalueelement property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the defaultvalueelement property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDEFAULTVALUEELEMENT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DEFAULTVALUEELEMENT }
         * 
         * 
         */
        public List<DEFAULTVALUEELEMENT> getDEFAULTVALUEELEMENT() {
            if (defaultvalueelement == null) {
                defaultvalueelement = new ArrayList<DEFAULTVALUEELEMENT>();
            }
            return this.defaultvalueelement;
        }

    }

}
