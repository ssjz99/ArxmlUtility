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
 * This meta-class contains information about end-to-end protection. The set of applicable attributes depends on the actual value of the category attribute of EndToEndProtection.
 * 
 * <p>END-TO-END-DESCRIPTION complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="END-TO-END-DESCRIPTION">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}END-TO-END-DESCRIPTION"/>
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
@XmlType(name = "END-TO-END-DESCRIPTION", propOrder = {
    "category",
    "dataids",
    "dataidmode",
    "datalength",
    "maxdeltacounterinit",
    "crcoffset",
    "counteroffset",
    "maxnoneworrepeateddata",
    "synccounterinit",
    "dataidnibbleoffset"
})
public class ENDTOENDDESCRIPTION {

    @XmlElement(name = "CATEGORY")
    protected NMTOKENSTRING category;
    @XmlElement(name = "DATA-IDS")
    protected ENDTOENDDESCRIPTION.DATAIDS dataids;
    @XmlElement(name = "DATA-ID-MODE")
    protected POSITIVEINTEGER dataidmode;
    @XmlElement(name = "DATA-LENGTH")
    protected POSITIVEINTEGER datalength;
    @XmlElement(name = "MAX-DELTA-COUNTER-INIT")
    protected POSITIVEINTEGER maxdeltacounterinit;
    @XmlElement(name = "CRC-OFFSET")
    protected POSITIVEINTEGER crcoffset;
    @XmlElement(name = "COUNTER-OFFSET")
    protected POSITIVEINTEGER counteroffset;
    @XmlElement(name = "MAX-NO-NEW-OR-REPEATED-DATA")
    protected POSITIVEINTEGER maxnoneworrepeateddata;
    @XmlElement(name = "SYNC-COUNTER-INIT")
    protected POSITIVEINTEGER synccounterinit;
    @XmlElement(name = "DATA-ID-NIBBLE-OFFSET")
    protected POSITIVEINTEGER dataidnibbleoffset;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??category?????
     * 
     * @return
     *     possible object is
     *     {@link NMTOKENSTRING }
     *     
     */
    public NMTOKENSTRING getCATEGORY() {
        return category;
    }

    /**
     * ??category?????
     * 
     * @param value
     *     allowed object is
     *     {@link NMTOKENSTRING }
     *     
     */
    public void setCATEGORY(NMTOKENSTRING value) {
        this.category = value;
    }

    /**
     * ??dataids?????
     * 
     * @return
     *     possible object is
     *     {@link ENDTOENDDESCRIPTION.DATAIDS }
     *     
     */
    public ENDTOENDDESCRIPTION.DATAIDS getDATAIDS() {
        return dataids;
    }

    /**
     * ??dataids?????
     * 
     * @param value
     *     allowed object is
     *     {@link ENDTOENDDESCRIPTION.DATAIDS }
     *     
     */
    public void setDATAIDS(ENDTOENDDESCRIPTION.DATAIDS value) {
        this.dataids = value;
    }

    /**
     * ??dataidmode?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getDATAIDMODE() {
        return dataidmode;
    }

    /**
     * ??dataidmode?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setDATAIDMODE(POSITIVEINTEGER value) {
        this.dataidmode = value;
    }

    /**
     * ??datalength?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getDATALENGTH() {
        return datalength;
    }

    /**
     * ??datalength?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setDATALENGTH(POSITIVEINTEGER value) {
        this.datalength = value;
    }

    /**
     * ??maxdeltacounterinit?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getMAXDELTACOUNTERINIT() {
        return maxdeltacounterinit;
    }

    /**
     * ??maxdeltacounterinit?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setMAXDELTACOUNTERINIT(POSITIVEINTEGER value) {
        this.maxdeltacounterinit = value;
    }

    /**
     * ??crcoffset?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getCRCOFFSET() {
        return crcoffset;
    }

    /**
     * ??crcoffset?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setCRCOFFSET(POSITIVEINTEGER value) {
        this.crcoffset = value;
    }

    /**
     * ??counteroffset?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getCOUNTEROFFSET() {
        return counteroffset;
    }

    /**
     * ??counteroffset?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setCOUNTEROFFSET(POSITIVEINTEGER value) {
        this.counteroffset = value;
    }

    /**
     * ??maxnoneworrepeateddata?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getMAXNONEWORREPEATEDDATA() {
        return maxnoneworrepeateddata;
    }

    /**
     * ??maxnoneworrepeateddata?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setMAXNONEWORREPEATEDDATA(POSITIVEINTEGER value) {
        this.maxnoneworrepeateddata = value;
    }

    /**
     * ??synccounterinit?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getSYNCCOUNTERINIT() {
        return synccounterinit;
    }

    /**
     * ??synccounterinit?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setSYNCCOUNTERINIT(POSITIVEINTEGER value) {
        this.synccounterinit = value;
    }

    /**
     * ??dataidnibbleoffset?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getDATAIDNIBBLEOFFSET() {
        return dataidnibbleoffset;
    }

    /**
     * ??dataidnibbleoffset?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setDATAIDNIBBLEOFFSET(POSITIVEINTEGER value) {
        this.dataidnibbleoffset = value;
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
     *         &lt;element name="DATA-ID" type="{http://autosar.org/schema/r4.0}POSITIVE-INTEGER"/>
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
        "dataid"
    })
    public static class DATAIDS {

        @XmlElement(name = "DATA-ID")
        protected List<POSITIVEINTEGER> dataid;

        /**
         * Gets the value of the dataid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dataid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDATAID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link POSITIVEINTEGER }
         * 
         * 
         */
        public List<POSITIVEINTEGER> getDATAID() {
            if (dataid == null) {
                dataid = new ArrayList<POSITIVEINTEGER>();
            }
            return this.dataid;
        }

    }

}
