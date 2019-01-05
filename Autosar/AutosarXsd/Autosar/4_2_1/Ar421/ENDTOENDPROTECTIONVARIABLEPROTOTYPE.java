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
 * It is possible to protect the data exchanged between software components. For this purpose, for each communication to be protected,  the user defines a separate EndToEndProtection (specifying a set of protection settings) and refers to a variableDataPrototype in the role of sender and to one or many variableDataPrototypes in the role of receiver. For details, see EndToEnd Library.
 * 
 * <p>END-TO-END-PROTECTION-VARIABLE-PROTOTYPE complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="END-TO-END-PROTECTION-VARIABLE-PROTOTYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}END-TO-END-PROTECTION-VARIABLE-PROTOTYPE"/>
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
@XmlType(name = "END-TO-END-PROTECTION-VARIABLE-PROTOTYPE", propOrder = {
    "receiverirefs",
    "senderiref",
    "shortlabel",
    "variationpoint"
})
public class ENDTOENDPROTECTIONVARIABLEPROTOTYPE {

    @XmlElement(name = "RECEIVER-IREFS")
    protected ENDTOENDPROTECTIONVARIABLEPROTOTYPE.RECEIVERIREFS receiverirefs;
    @XmlElement(name = "SENDER-IREF")
    protected VARIABLEDATAPROTOTYPEINSYSTEMINSTANCEREF senderiref;
    @XmlElement(name = "SHORT-LABEL")
    protected IDENTIFIER shortlabel;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??receiverirefs?????
     * 
     * @return
     *     possible object is
     *     {@link ENDTOENDPROTECTIONVARIABLEPROTOTYPE.RECEIVERIREFS }
     *     
     */
    public ENDTOENDPROTECTIONVARIABLEPROTOTYPE.RECEIVERIREFS getRECEIVERIREFS() {
        return receiverirefs;
    }

    /**
     * ??receiverirefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link ENDTOENDPROTECTIONVARIABLEPROTOTYPE.RECEIVERIREFS }
     *     
     */
    public void setRECEIVERIREFS(ENDTOENDPROTECTIONVARIABLEPROTOTYPE.RECEIVERIREFS value) {
        this.receiverirefs = value;
    }

    /**
     * ??senderiref?????
     * 
     * @return
     *     possible object is
     *     {@link VARIABLEDATAPROTOTYPEINSYSTEMINSTANCEREF }
     *     
     */
    public VARIABLEDATAPROTOTYPEINSYSTEMINSTANCEREF getSENDERIREF() {
        return senderiref;
    }

    /**
     * ??senderiref?????
     * 
     * @param value
     *     allowed object is
     *     {@link VARIABLEDATAPROTOTYPEINSYSTEMINSTANCEREF }
     *     
     */
    public void setSENDERIREF(VARIABLEDATAPROTOTYPEINSYSTEMINSTANCEREF value) {
        this.senderiref = value;
    }

    /**
     * ??shortlabel?????
     * 
     * @return
     *     possible object is
     *     {@link IDENTIFIER }
     *     
     */
    public IDENTIFIER getSHORTLABEL() {
        return shortlabel;
    }

    /**
     * ??shortlabel?????
     * 
     * @param value
     *     allowed object is
     *     {@link IDENTIFIER }
     *     
     */
    public void setSHORTLABEL(IDENTIFIER value) {
        this.shortlabel = value;
    }

    /**
     * ??variationpoint?????
     * 
     * @return
     *     possible object is
     *     {@link VARIATIONPOINT }
     *     
     */
    public VARIATIONPOINT getVARIATIONPOINT() {
        return variationpoint;
    }

    /**
     * ??variationpoint?????
     * 
     * @param value
     *     allowed object is
     *     {@link VARIATIONPOINT }
     *     
     */
    public void setVARIATIONPOINT(VARIATIONPOINT value) {
        this.variationpoint = value;
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
     *         &lt;element name="RECEIVER-IREF" type="{http://autosar.org/schema/r4.0}VARIABLE-DATA-PROTOTYPE-IN-SYSTEM-INSTANCE-REF"/>
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
        "receiveriref"
    })
    public static class RECEIVERIREFS {

        @XmlElement(name = "RECEIVER-IREF")
        protected List<VARIABLEDATAPROTOTYPEINSYSTEMINSTANCEREF> receiveriref;

        /**
         * Gets the value of the receiveriref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the receiveriref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRECEIVERIREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VARIABLEDATAPROTOTYPEINSYSTEMINSTANCEREF }
         * 
         * 
         */
        public List<VARIABLEDATAPROTOTYPEINSYSTEMINSTANCEREF> getRECEIVERIREF() {
            if (receiveriref == null) {
                receiveriref = new ArrayList<VARIABLEDATAPROTOTYPEINSYSTEMINSTANCEREF>();
            }
            return this.receiveriref;
        }

    }

}
