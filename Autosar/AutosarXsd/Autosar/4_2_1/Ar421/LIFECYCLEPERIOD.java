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
 * This meta class represents the ability to specify a point of time within a specified period, e.g. the starting or end point, in which a specific life cycle state is valid/applies to.
 * 
 * <p>LIFE-CYCLE-PERIOD complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="LIFE-CYCLE-PERIOD">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}LIFE-CYCLE-PERIOD"/>
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
@XmlType(name = "LIFE-CYCLE-PERIOD", propOrder = {
    "date",
    "arreleaseversion",
    "productrelease"
})
public class LIFECYCLEPERIOD {

    @XmlElement(name = "DATE")
    protected DATE date;
    @XmlElement(name = "AR-RELEASE-VERSION")
    protected REVISIONLABELSTRING arreleaseversion;
    @XmlElement(name = "PRODUCT-RELEASE")
    protected REVISIONLABELSTRING productrelease;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

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
     * ??arreleaseversion?????
     * 
     * @return
     *     possible object is
     *     {@link REVISIONLABELSTRING }
     *     
     */
    public REVISIONLABELSTRING getARRELEASEVERSION() {
        return arreleaseversion;
    }

    /**
     * ??arreleaseversion?????
     * 
     * @param value
     *     allowed object is
     *     {@link REVISIONLABELSTRING }
     *     
     */
    public void setARRELEASEVERSION(REVISIONLABELSTRING value) {
        this.arreleaseversion = value;
    }

    /**
     * ??productrelease?????
     * 
     * @return
     *     possible object is
     *     {@link REVISIONLABELSTRING }
     *     
     */
    public REVISIONLABELSTRING getPRODUCTRELEASE() {
        return productrelease;
    }

    /**
     * ??productrelease?????
     * 
     * @param value
     *     allowed object is
     *     {@link REVISIONLABELSTRING }
     *     
     */
    public void setPRODUCTRELEASE(REVISIONLABELSTRING value) {
        this.productrelease = value;
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
