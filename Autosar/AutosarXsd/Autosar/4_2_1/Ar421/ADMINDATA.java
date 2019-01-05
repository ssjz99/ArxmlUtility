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
 * AdminData represents the ability to express administrative information for an element. This administration information is to be treated as meta-data such as revision id or state of the file. There are basically four kinds of meta-data
 * 
 * * The language and/or used languages.
 * 
 * * Revision information covering e.g. revision number, state, release date, changes. Note that this information can be given in general as well as related to a particular company.
 * 
 * * Document meta-data specific for a company
 * 
 * <p>ADMIN-DATA complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="ADMIN-DATA">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ADMIN-DATA"/>
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
@XmlType(name = "ADMIN-DATA", propOrder = {
    "language",
    "usedlanguages",
    "docrevisions",
    "sdgs"
})
public class ADMINDATA {

    @XmlElement(name = "LANGUAGE")
    protected LENUM language;
    @XmlElement(name = "USED-LANGUAGES")
    protected MULTILANGUAGEPLAINTEXT usedlanguages;
    @XmlElement(name = "DOC-REVISIONS")
    protected ADMINDATA.DOCREVISIONS docrevisions;
    @XmlElement(name = "SDGS")
    protected ADMINDATA.SDGS sdgs;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??language?????
     * 
     * @return
     *     possible object is
     *     {@link LENUM }
     *     
     */
    public LENUM getLANGUAGE() {
        return language;
    }

    /**
     * ??language?????
     * 
     * @param value
     *     allowed object is
     *     {@link LENUM }
     *     
     */
    public void setLANGUAGE(LENUM value) {
        this.language = value;
    }

    /**
     * ??usedlanguages?????
     * 
     * @return
     *     possible object is
     *     {@link MULTILANGUAGEPLAINTEXT }
     *     
     */
    public MULTILANGUAGEPLAINTEXT getUSEDLANGUAGES() {
        return usedlanguages;
    }

    /**
     * ??usedlanguages?????
     * 
     * @param value
     *     allowed object is
     *     {@link MULTILANGUAGEPLAINTEXT }
     *     
     */
    public void setUSEDLANGUAGES(MULTILANGUAGEPLAINTEXT value) {
        this.usedlanguages = value;
    }

    /**
     * ??docrevisions?????
     * 
     * @return
     *     possible object is
     *     {@link ADMINDATA.DOCREVISIONS }
     *     
     */
    public ADMINDATA.DOCREVISIONS getDOCREVISIONS() {
        return docrevisions;
    }

    /**
     * ??docrevisions?????
     * 
     * @param value
     *     allowed object is
     *     {@link ADMINDATA.DOCREVISIONS }
     *     
     */
    public void setDOCREVISIONS(ADMINDATA.DOCREVISIONS value) {
        this.docrevisions = value;
    }

    /**
     * ??sdgs?????
     * 
     * @return
     *     possible object is
     *     {@link ADMINDATA.SDGS }
     *     
     */
    public ADMINDATA.SDGS getSDGS() {
        return sdgs;
    }

    /**
     * ??sdgs?????
     * 
     * @param value
     *     allowed object is
     *     {@link ADMINDATA.SDGS }
     *     
     */
    public void setSDGS(ADMINDATA.SDGS value) {
        this.sdgs = value;
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
     *         &lt;element name="DOC-REVISION" type="{http://autosar.org/schema/r4.0}DOC-REVISION"/>
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
        "docrevision"
    })
    public static class DOCREVISIONS {

        @XmlElement(name = "DOC-REVISION")
        protected List<DOCREVISION> docrevision;

        /**
         * Gets the value of the docrevision property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the docrevision property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDOCREVISION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DOCREVISION }
         * 
         * 
         */
        public List<DOCREVISION> getDOCREVISION() {
            if (docrevision == null) {
                docrevision = new ArrayList<DOCREVISION>();
            }
            return this.docrevision;
        }

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
     *         &lt;element name="SDG" type="{http://autosar.org/schema/r4.0}SDG"/>
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
        "sdg"
    })
    public static class SDGS {

        @XmlElement(name = "SDG")
        protected List<SDG> sdg;

        /**
         * Gets the value of the sdg property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the sdg property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSDG().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SDG }
         * 
         * 
         */
        public List<SDG> getSDG() {
            if (sdg == null) {
                sdg = new ArrayList<SDG>();
            }
            return this.sdg;
        }

    }

}
