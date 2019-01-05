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
 * Client configuration for Service-Discovery.
 * 
 * <p>SD-CLIENT-CONFIG complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="SD-CLIENT-CONFIG">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}SD-CLIENT-CONFIG"/>
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
@XmlType(name = "SD-CLIENT-CONFIG", propOrder = {
    "capabilityrecords",
    "clientservicemajorversion",
    "clientserviceminorversion",
    "initialfindbehavior",
    "requestresponsedelay",
    "ttl"
})
public class SDCLIENTCONFIG {

    @XmlElement(name = "CAPABILITY-RECORDS")
    protected SDCLIENTCONFIG.CAPABILITYRECORDS capabilityrecords;
    @XmlElement(name = "CLIENT-SERVICE-MAJOR-VERSION")
    protected POSITIVEINTEGER clientservicemajorversion;
    @XmlElement(name = "CLIENT-SERVICE-MINOR-VERSION")
    protected POSITIVEINTEGER clientserviceminorversion;
    @XmlElement(name = "INITIAL-FIND-BEHAVIOR")
    protected INITIALSDDELAYCONFIG initialfindbehavior;
    @XmlElement(name = "REQUEST-RESPONSE-DELAY")
    protected REQUESTRESPONSEDELAY requestresponsedelay;
    @XmlElement(name = "TTL")
    protected POSITIVEINTEGER ttl;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??capabilityrecords?????
     * 
     * @return
     *     possible object is
     *     {@link SDCLIENTCONFIG.CAPABILITYRECORDS }
     *     
     */
    public SDCLIENTCONFIG.CAPABILITYRECORDS getCAPABILITYRECORDS() {
        return capabilityrecords;
    }

    /**
     * ??capabilityrecords?????
     * 
     * @param value
     *     allowed object is
     *     {@link SDCLIENTCONFIG.CAPABILITYRECORDS }
     *     
     */
    public void setCAPABILITYRECORDS(SDCLIENTCONFIG.CAPABILITYRECORDS value) {
        this.capabilityrecords = value;
    }

    /**
     * ??clientservicemajorversion?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getCLIENTSERVICEMAJORVERSION() {
        return clientservicemajorversion;
    }

    /**
     * ??clientservicemajorversion?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setCLIENTSERVICEMAJORVERSION(POSITIVEINTEGER value) {
        this.clientservicemajorversion = value;
    }

    /**
     * ??clientserviceminorversion?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getCLIENTSERVICEMINORVERSION() {
        return clientserviceminorversion;
    }

    /**
     * ??clientserviceminorversion?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setCLIENTSERVICEMINORVERSION(POSITIVEINTEGER value) {
        this.clientserviceminorversion = value;
    }

    /**
     * ??initialfindbehavior?????
     * 
     * @return
     *     possible object is
     *     {@link INITIALSDDELAYCONFIG }
     *     
     */
    public INITIALSDDELAYCONFIG getINITIALFINDBEHAVIOR() {
        return initialfindbehavior;
    }

    /**
     * ??initialfindbehavior?????
     * 
     * @param value
     *     allowed object is
     *     {@link INITIALSDDELAYCONFIG }
     *     
     */
    public void setINITIALFINDBEHAVIOR(INITIALSDDELAYCONFIG value) {
        this.initialfindbehavior = value;
    }

    /**
     * ??requestresponsedelay?????
     * 
     * @return
     *     possible object is
     *     {@link REQUESTRESPONSEDELAY }
     *     
     */
    public REQUESTRESPONSEDELAY getREQUESTRESPONSEDELAY() {
        return requestresponsedelay;
    }

    /**
     * ??requestresponsedelay?????
     * 
     * @param value
     *     allowed object is
     *     {@link REQUESTRESPONSEDELAY }
     *     
     */
    public void setREQUESTRESPONSEDELAY(REQUESTRESPONSEDELAY value) {
        this.requestresponsedelay = value;
    }

    /**
     * ??ttl?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getTTL() {
        return ttl;
    }

    /**
     * ??ttl?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setTTL(POSITIVEINTEGER value) {
        this.ttl = value;
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
     *         &lt;element name="TAG-WITH-OPTIONAL-VALUE" type="{http://autosar.org/schema/r4.0}TAG-WITH-OPTIONAL-VALUE"/>
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
        "tagwithoptionalvalue"
    })
    public static class CAPABILITYRECORDS {

        @XmlElement(name = "TAG-WITH-OPTIONAL-VALUE")
        protected List<TAGWITHOPTIONALVALUE> tagwithoptionalvalue;

        /**
         * Gets the value of the tagwithoptionalvalue property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tagwithoptionalvalue property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTAGWITHOPTIONALVALUE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TAGWITHOPTIONALVALUE }
         * 
         * 
         */
        public List<TAGWITHOPTIONALVALUE> getTAGWITHOPTIONALVALUE() {
            if (tagwithoptionalvalue == null) {
                tagwithoptionalvalue = new ArrayList<TAGWITHOPTIONALVALUE>();
            }
            return this.tagwithoptionalvalue;
        }

    }

}
