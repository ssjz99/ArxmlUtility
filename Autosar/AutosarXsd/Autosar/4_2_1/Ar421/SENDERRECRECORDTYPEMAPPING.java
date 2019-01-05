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
 * If the ApplicationCompositeDataType is a Record, the "RecordTypeMapping" will be used.
 * 
 * <p>SENDER-REC-RECORD-TYPE-MAPPING complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="SENDER-REC-RECORD-TYPE-MAPPING">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}SENDER-REC-COMPOSITE-TYPE-MAPPING"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}SENDER-REC-RECORD-TYPE-MAPPING"/>
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
@XmlType(name = "SENDER-REC-RECORD-TYPE-MAPPING", propOrder = {
    "recordelementmappings"
})
public class SENDERRECRECORDTYPEMAPPING {

    @XmlElement(name = "RECORD-ELEMENT-MAPPINGS")
    protected SENDERRECRECORDTYPEMAPPING.RECORDELEMENTMAPPINGS recordelementmappings;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??recordelementmappings?????
     * 
     * @return
     *     possible object is
     *     {@link SENDERRECRECORDTYPEMAPPING.RECORDELEMENTMAPPINGS }
     *     
     */
    public SENDERRECRECORDTYPEMAPPING.RECORDELEMENTMAPPINGS getRECORDELEMENTMAPPINGS() {
        return recordelementmappings;
    }

    /**
     * ??recordelementmappings?????
     * 
     * @param value
     *     allowed object is
     *     {@link SENDERRECRECORDTYPEMAPPING.RECORDELEMENTMAPPINGS }
     *     
     */
    public void setRECORDELEMENTMAPPINGS(SENDERRECRECORDTYPEMAPPING.RECORDELEMENTMAPPINGS value) {
        this.recordelementmappings = value;
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
     *         &lt;element name="SENDER-REC-RECORD-ELEMENT-MAPPING" type="{http://autosar.org/schema/r4.0}SENDER-REC-RECORD-ELEMENT-MAPPING"/>
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
        "senderrecrecordelementmapping"
    })
    public static class RECORDELEMENTMAPPINGS {

        @XmlElement(name = "SENDER-REC-RECORD-ELEMENT-MAPPING")
        protected List<SENDERRECRECORDELEMENTMAPPING> senderrecrecordelementmapping;

        /**
         * Gets the value of the senderrecrecordelementmapping property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the senderrecrecordelementmapping property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSENDERRECRECORDELEMENTMAPPING().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SENDERRECRECORDELEMENTMAPPING }
         * 
         * 
         */
        public List<SENDERRECRECORDELEMENTMAPPING> getSENDERRECRECORDELEMENTMAPPING() {
            if (senderrecrecordelementmapping == null) {
                senderrecrecordelementmapping = new ArrayList<SENDERRECRECORDELEMENTMAPPING>();
            }
            return this.senderrecrecordelementmapping;
        }

    }

}
