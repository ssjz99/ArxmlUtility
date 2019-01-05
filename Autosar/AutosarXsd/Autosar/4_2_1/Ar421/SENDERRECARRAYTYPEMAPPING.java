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
 * If the ApplicationCompositeDataType is an Array, the "ArrayTypeMapping" will be used.
 * 
 * <p>SENDER-REC-ARRAY-TYPE-MAPPING complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="SENDER-REC-ARRAY-TYPE-MAPPING">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}SENDER-REC-COMPOSITE-TYPE-MAPPING"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}SENDER-REC-ARRAY-TYPE-MAPPING"/>
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
@XmlType(name = "SENDER-REC-ARRAY-TYPE-MAPPING", propOrder = {
    "arrayelementmappings"
})
public class SENDERRECARRAYTYPEMAPPING {

    @XmlElement(name = "ARRAY-ELEMENT-MAPPINGS")
    protected SENDERRECARRAYTYPEMAPPING.ARRAYELEMENTMAPPINGS arrayelementmappings;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??arrayelementmappings?????
     * 
     * @return
     *     possible object is
     *     {@link SENDERRECARRAYTYPEMAPPING.ARRAYELEMENTMAPPINGS }
     *     
     */
    public SENDERRECARRAYTYPEMAPPING.ARRAYELEMENTMAPPINGS getARRAYELEMENTMAPPINGS() {
        return arrayelementmappings;
    }

    /**
     * ??arrayelementmappings?????
     * 
     * @param value
     *     allowed object is
     *     {@link SENDERRECARRAYTYPEMAPPING.ARRAYELEMENTMAPPINGS }
     *     
     */
    public void setARRAYELEMENTMAPPINGS(SENDERRECARRAYTYPEMAPPING.ARRAYELEMENTMAPPINGS value) {
        this.arrayelementmappings = value;
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
     *         &lt;element name="SENDER-REC-ARRAY-ELEMENT-MAPPING" type="{http://autosar.org/schema/r4.0}SENDER-REC-ARRAY-ELEMENT-MAPPING"/>
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
        "senderrecarrayelementmapping"
    })
    public static class ARRAYELEMENTMAPPINGS {

        @XmlElement(name = "SENDER-REC-ARRAY-ELEMENT-MAPPING")
        protected List<SENDERRECARRAYELEMENTMAPPING> senderrecarrayelementmapping;

        /**
         * Gets the value of the senderrecarrayelementmapping property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the senderrecarrayelementmapping property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSENDERRECARRAYELEMENTMAPPING().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SENDERRECARRAYELEMENTMAPPING }
         * 
         * 
         */
        public List<SENDERRECARRAYELEMENTMAPPING> getSENDERRECARRAYELEMENTMAPPING() {
            if (senderrecarrayelementmapping == null) {
                senderrecarrayelementmapping = new ArrayList<SENDERRECARRAYELEMENTMAPPING>();
            }
            return this.senderrecarrayelementmapping;
        }

    }

}
