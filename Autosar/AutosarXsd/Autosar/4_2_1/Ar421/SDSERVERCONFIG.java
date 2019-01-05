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
 * Server configuration for Service-Discovery.
 * 
 * <p>SD-SERVER-CONFIG complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="SD-SERVER-CONFIG">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}SD-SERVER-CONFIG"/>
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
@XmlType(name = "SD-SERVER-CONFIG", propOrder = {
    "capabilityrecords",
    "initialofferbehavior",
    "offercyclicdelay",
    "requestresponsedelay",
    "serverservicemajorversion",
    "serverserviceminorversion",
    "ttl"
})
public class SDSERVERCONFIG {

    @XmlElement(name = "CAPABILITY-RECORDS")
    protected SDSERVERCONFIG.CAPABILITYRECORDS capabilityrecords;
    @XmlElement(name = "INITIAL-OFFER-BEHAVIOR")
    protected INITIALSDDELAYCONFIG initialofferbehavior;
    @XmlElement(name = "OFFER-CYCLIC-DELAY")
    protected TIMEVALUE offercyclicdelay;
    @XmlElement(name = "REQUEST-RESPONSE-DELAY")
    protected REQUESTRESPONSEDELAY requestresponsedelay;
    @XmlElement(name = "SERVER-SERVICE-MAJOR-VERSION")
    protected POSITIVEINTEGER serverservicemajorversion;
    @XmlElement(name = "SERVER-SERVICE-MINOR-VERSION")
    protected POSITIVEINTEGER serverserviceminorversion;
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
     *     {@link SDSERVERCONFIG.CAPABILITYRECORDS }
     *     
     */
    public SDSERVERCONFIG.CAPABILITYRECORDS getCAPABILITYRECORDS() {
        return capabilityrecords;
    }

    /**
     * ??capabilityrecords?????
     * 
     * @param value
     *     allowed object is
     *     {@link SDSERVERCONFIG.CAPABILITYRECORDS }
     *     
     */
    public void setCAPABILITYRECORDS(SDSERVERCONFIG.CAPABILITYRECORDS value) {
        this.capabilityrecords = value;
    }

    /**
     * ??initialofferbehavior?????
     * 
     * @return
     *     possible object is
     *     {@link INITIALSDDELAYCONFIG }
     *     
     */
    public INITIALSDDELAYCONFIG getINITIALOFFERBEHAVIOR() {
        return initialofferbehavior;
    }

    /**
     * ??initialofferbehavior?????
     * 
     * @param value
     *     allowed object is
     *     {@link INITIALSDDELAYCONFIG }
     *     
     */
    public void setINITIALOFFERBEHAVIOR(INITIALSDDELAYCONFIG value) {
        this.initialofferbehavior = value;
    }

    /**
     * ??offercyclicdelay?????
     * 
     * @return
     *     possible object is
     *     {@link TIMEVALUE }
     *     
     */
    public TIMEVALUE getOFFERCYCLICDELAY() {
        return offercyclicdelay;
    }

    /**
     * ??offercyclicdelay?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMEVALUE }
     *     
     */
    public void setOFFERCYCLICDELAY(TIMEVALUE value) {
        this.offercyclicdelay = value;
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
     * ??serverservicemajorversion?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getSERVERSERVICEMAJORVERSION() {
        return serverservicemajorversion;
    }

    /**
     * ??serverservicemajorversion?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setSERVERSERVICEMAJORVERSION(POSITIVEINTEGER value) {
        this.serverservicemajorversion = value;
    }

    /**
     * ??serverserviceminorversion?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getSERVERSERVICEMINORVERSION() {
        return serverserviceminorversion;
    }

    /**
     * ??serverserviceminorversion?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setSERVERSERVICEMINORVERSION(POSITIVEINTEGER value) {
        this.serverserviceminorversion = value;
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
