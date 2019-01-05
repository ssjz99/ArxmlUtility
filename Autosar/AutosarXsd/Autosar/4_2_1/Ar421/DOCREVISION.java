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
 * This meta-class represents the ability to maintain information which relates to revision management of documents or objects.
 * 
 * <p>DOC-REVISION complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="DOC-REVISION">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}DOC-REVISION"/>
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
@XmlType(name = "DOC-REVISION", propOrder = {
    "revisionlabel",
    "revisionlabelp1",
    "revisionlabelp2",
    "state",
    "issuedby",
    "date",
    "modifications"
})
public class DOCREVISION {

    @XmlElement(name = "REVISION-LABEL")
    protected REVISIONLABELSTRING revisionlabel;
    @XmlElement(name = "REVISION-LABEL-P-1")
    protected REVISIONLABELSTRING revisionlabelp1;
    @XmlElement(name = "REVISION-LABEL-P-2")
    protected REVISIONLABELSTRING revisionlabelp2;
    @XmlElement(name = "STATE")
    protected NMTOKENSTRING state;
    @XmlElement(name = "ISSUED-BY")
    protected STRING issuedby;
    @XmlElement(name = "DATE")
    protected DATE date;
    @XmlElement(name = "MODIFICATIONS")
    protected DOCREVISION.MODIFICATIONS modifications;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??revisionlabel?????
     * 
     * @return
     *     possible object is
     *     {@link REVISIONLABELSTRING }
     *     
     */
    public REVISIONLABELSTRING getREVISIONLABEL() {
        return revisionlabel;
    }

    /**
     * ??revisionlabel?????
     * 
     * @param value
     *     allowed object is
     *     {@link REVISIONLABELSTRING }
     *     
     */
    public void setREVISIONLABEL(REVISIONLABELSTRING value) {
        this.revisionlabel = value;
    }

    /**
     * ??revisionlabelp1?????
     * 
     * @return
     *     possible object is
     *     {@link REVISIONLABELSTRING }
     *     
     */
    public REVISIONLABELSTRING getREVISIONLABELP1() {
        return revisionlabelp1;
    }

    /**
     * ??revisionlabelp1?????
     * 
     * @param value
     *     allowed object is
     *     {@link REVISIONLABELSTRING }
     *     
     */
    public void setREVISIONLABELP1(REVISIONLABELSTRING value) {
        this.revisionlabelp1 = value;
    }

    /**
     * ??revisionlabelp2?????
     * 
     * @return
     *     possible object is
     *     {@link REVISIONLABELSTRING }
     *     
     */
    public REVISIONLABELSTRING getREVISIONLABELP2() {
        return revisionlabelp2;
    }

    /**
     * ??revisionlabelp2?????
     * 
     * @param value
     *     allowed object is
     *     {@link REVISIONLABELSTRING }
     *     
     */
    public void setREVISIONLABELP2(REVISIONLABELSTRING value) {
        this.revisionlabelp2 = value;
    }

    /**
     * ??state?????
     * 
     * @return
     *     possible object is
     *     {@link NMTOKENSTRING }
     *     
     */
    public NMTOKENSTRING getSTATE() {
        return state;
    }

    /**
     * ??state?????
     * 
     * @param value
     *     allowed object is
     *     {@link NMTOKENSTRING }
     *     
     */
    public void setSTATE(NMTOKENSTRING value) {
        this.state = value;
    }

    /**
     * ??issuedby?????
     * 
     * @return
     *     possible object is
     *     {@link STRING }
     *     
     */
    public STRING getISSUEDBY() {
        return issuedby;
    }

    /**
     * ??issuedby?????
     * 
     * @param value
     *     allowed object is
     *     {@link STRING }
     *     
     */
    public void setISSUEDBY(STRING value) {
        this.issuedby = value;
    }

    /**
     * ??date?????
     * 
     * @return
     *     possible object is
     *     {@link DATE }
     *     
     */
    public DATE getDATE() {
        return date;
    }

    /**
     * ??date?????
     * 
     * @param value
     *     allowed object is
     *     {@link DATE }
     *     
     */
    public void setDATE(DATE value) {
        this.date = value;
    }

    /**
     * ??modifications?????
     * 
     * @return
     *     possible object is
     *     {@link DOCREVISION.MODIFICATIONS }
     *     
     */
    public DOCREVISION.MODIFICATIONS getMODIFICATIONS() {
        return modifications;
    }

    /**
     * ??modifications?????
     * 
     * @param value
     *     allowed object is
     *     {@link DOCREVISION.MODIFICATIONS }
     *     
     */
    public void setMODIFICATIONS(DOCREVISION.MODIFICATIONS value) {
        this.modifications = value;
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
     *         &lt;element name="MODIFICATION" type="{http://autosar.org/schema/r4.0}MODIFICATION"/>
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
        "modification"
    })
    public static class MODIFICATIONS {

        @XmlElement(name = "MODIFICATION")
        protected List<MODIFICATION> modification;

        /**
         * Gets the value of the modification property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the modification property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMODIFICATION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MODIFICATION }
         * 
         * 
         */
        public List<MODIFICATION> getMODIFICATION() {
            if (modification == null) {
                modification = new ArrayList<MODIFICATION>();
            }
            return this.modification;
        }

    }

}
