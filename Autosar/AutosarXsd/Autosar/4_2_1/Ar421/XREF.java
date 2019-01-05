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
 * This represents a cross-reference within documentation.
 * 
 * <p>XREF complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="XREF">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}XREF"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}XREF"/>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XREF", propOrder = {
    "label1",
    "referrableref"
})
public class XREF {

    @XmlElement(name = "LABEL-1")
    protected SINGLELANGUAGELONGNAME label1;
    @XmlElement(name = "REFERRABLE-REF")
    protected XREF.REFERRABLEREF referrableref;
    @XmlAttribute(name = "SHOW-CONTENT")
    protected SHOWCONTENTENUMSIMPLE showcontent;
    @XmlAttribute(name = "SHOW-RESOURCE-ALIAS-NAME")
    protected SHOWRESOURCEALIASNAMEENUMSIMPLE showresourcealiasname;
    @XmlAttribute(name = "SHOW-RESOURCE-CATEGORY")
    protected SHOWRESOURCECATEGORYENUMSIMPLE showresourcecategory;
    @XmlAttribute(name = "SHOW-RESOURCE-LONG-NAME")
    protected SHOWRESOURCELONGNAMEENUMSIMPLE showresourcelongname;
    @XmlAttribute(name = "SHOW-RESOURCE-NUMBER")
    protected SHOWRESOURCENUMBERENUMSIMPLE showresourcenumber;
    @XmlAttribute(name = "SHOW-RESOURCE-PAGE")
    protected SHOWRESOURCEPAGEENUMSIMPLE showresourcepage;
    @XmlAttribute(name = "SHOW-RESOURCE-SHORT-NAME")
    protected SHOWRESOURCESHORTNAMEENUMSIMPLE showresourceshortname;
    @XmlAttribute(name = "SHOW-RESOURCE-TYPE")
    protected SHOWRESOURCETYPEENUMSIMPLE showresourcetype;
    @XmlAttribute(name = "SHOW-SEE")
    protected SHOWSEEENUMSIMPLE showsee;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??label1?????
     * 
     * @return
     *     possible object is
     *     {@link SINGLELANGUAGELONGNAME }
     *     
     */
    public SINGLELANGUAGELONGNAME getLABEL1() {
        return label1;
    }

    /**
     * ??label1?????
     * 
     * @param value
     *     allowed object is
     *     {@link SINGLELANGUAGELONGNAME }
     *     
     */
    public void setLABEL1(SINGLELANGUAGELONGNAME value) {
        this.label1 = value;
    }

    /**
     * ??referrableref?????
     * 
     * @return
     *     possible object is
     *     {@link XREF.REFERRABLEREF }
     *     
     */
    public XREF.REFERRABLEREF getREFERRABLEREF() {
        return referrableref;
    }

    /**
     * ??referrableref?????
     * 
     * @param value
     *     allowed object is
     *     {@link XREF.REFERRABLEREF }
     *     
     */
    public void setREFERRABLEREF(XREF.REFERRABLEREF value) {
        this.referrableref = value;
    }

    /**
     * ??showcontent?????
     * 
     * @return
     *     possible object is
     *     {@link SHOWCONTENTENUMSIMPLE }
     *     
     */
    public SHOWCONTENTENUMSIMPLE getSHOWCONTENT() {
        return showcontent;
    }

    /**
     * ??showcontent?????
     * 
     * @param value
     *     allowed object is
     *     {@link SHOWCONTENTENUMSIMPLE }
     *     
     */
    public void setSHOWCONTENT(SHOWCONTENTENUMSIMPLE value) {
        this.showcontent = value;
    }

    /**
     * ??showresourcealiasname?????
     * 
     * @return
     *     possible object is
     *     {@link SHOWRESOURCEALIASNAMEENUMSIMPLE }
     *     
     */
    public SHOWRESOURCEALIASNAMEENUMSIMPLE getSHOWRESOURCEALIASNAME() {
        return showresourcealiasname;
    }

    /**
     * ??showresourcealiasname?????
     * 
     * @param value
     *     allowed object is
     *     {@link SHOWRESOURCEALIASNAMEENUMSIMPLE }
     *     
     */
    public void setSHOWRESOURCEALIASNAME(SHOWRESOURCEALIASNAMEENUMSIMPLE value) {
        this.showresourcealiasname = value;
    }

    /**
     * ??showresourcecategory?????
     * 
     * @return
     *     possible object is
     *     {@link SHOWRESOURCECATEGORYENUMSIMPLE }
     *     
     */
    public SHOWRESOURCECATEGORYENUMSIMPLE getSHOWRESOURCECATEGORY() {
        return showresourcecategory;
    }

    /**
     * ??showresourcecategory?????
     * 
     * @param value
     *     allowed object is
     *     {@link SHOWRESOURCECATEGORYENUMSIMPLE }
     *     
     */
    public void setSHOWRESOURCECATEGORY(SHOWRESOURCECATEGORYENUMSIMPLE value) {
        this.showresourcecategory = value;
    }

    /**
     * ??showresourcelongname?????
     * 
     * @return
     *     possible object is
     *     {@link SHOWRESOURCELONGNAMEENUMSIMPLE }
     *     
     */
    public SHOWRESOURCELONGNAMEENUMSIMPLE getSHOWRESOURCELONGNAME() {
        return showresourcelongname;
    }

    /**
     * ??showresourcelongname?????
     * 
     * @param value
     *     allowed object is
     *     {@link SHOWRESOURCELONGNAMEENUMSIMPLE }
     *     
     */
    public void setSHOWRESOURCELONGNAME(SHOWRESOURCELONGNAMEENUMSIMPLE value) {
        this.showresourcelongname = value;
    }

    /**
     * ??showresourcenumber?????
     * 
     * @return
     *     possible object is
     *     {@link SHOWRESOURCENUMBERENUMSIMPLE }
     *     
     */
    public SHOWRESOURCENUMBERENUMSIMPLE getSHOWRESOURCENUMBER() {
        return showresourcenumber;
    }

    /**
     * ??showresourcenumber?????
     * 
     * @param value
     *     allowed object is
     *     {@link SHOWRESOURCENUMBERENUMSIMPLE }
     *     
     */
    public void setSHOWRESOURCENUMBER(SHOWRESOURCENUMBERENUMSIMPLE value) {
        this.showresourcenumber = value;
    }

    /**
     * ??showresourcepage?????
     * 
     * @return
     *     possible object is
     *     {@link SHOWRESOURCEPAGEENUMSIMPLE }
     *     
     */
    public SHOWRESOURCEPAGEENUMSIMPLE getSHOWRESOURCEPAGE() {
        return showresourcepage;
    }

    /**
     * ??showresourcepage?????
     * 
     * @param value
     *     allowed object is
     *     {@link SHOWRESOURCEPAGEENUMSIMPLE }
     *     
     */
    public void setSHOWRESOURCEPAGE(SHOWRESOURCEPAGEENUMSIMPLE value) {
        this.showresourcepage = value;
    }

    /**
     * ??showresourceshortname?????
     * 
     * @return
     *     possible object is
     *     {@link SHOWRESOURCESHORTNAMEENUMSIMPLE }
     *     
     */
    public SHOWRESOURCESHORTNAMEENUMSIMPLE getSHOWRESOURCESHORTNAME() {
        return showresourceshortname;
    }

    /**
     * ??showresourceshortname?????
     * 
     * @param value
     *     allowed object is
     *     {@link SHOWRESOURCESHORTNAMEENUMSIMPLE }
     *     
     */
    public void setSHOWRESOURCESHORTNAME(SHOWRESOURCESHORTNAMEENUMSIMPLE value) {
        this.showresourceshortname = value;
    }

    /**
     * ??showresourcetype?????
     * 
     * @return
     *     possible object is
     *     {@link SHOWRESOURCETYPEENUMSIMPLE }
     *     
     */
    public SHOWRESOURCETYPEENUMSIMPLE getSHOWRESOURCETYPE() {
        return showresourcetype;
    }

    /**
     * ??showresourcetype?????
     * 
     * @param value
     *     allowed object is
     *     {@link SHOWRESOURCETYPEENUMSIMPLE }
     *     
     */
    public void setSHOWRESOURCETYPE(SHOWRESOURCETYPEENUMSIMPLE value) {
        this.showresourcetype = value;
    }

    /**
     * ??showsee?????
     * 
     * @return
     *     possible object is
     *     {@link SHOWSEEENUMSIMPLE }
     *     
     */
    public SHOWSEEENUMSIMPLE getSHOWSEE() {
        return showsee;
    }

    /**
     * ??showsee?????
     * 
     * @param value
     *     allowed object is
     *     {@link SHOWSEEENUMSIMPLE }
     *     
     */
    public void setSHOWSEE(SHOWSEEENUMSIMPLE value) {
        this.showsee = value;
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
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}REFERRABLE--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class REFERRABLEREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected REFERRABLESUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link REFERRABLESUBTYPESENUM }
         *     
         */
        public REFERRABLESUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link REFERRABLESUBTYPESENUM }
         *     
         */
        public void setDEST(REFERRABLESUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
