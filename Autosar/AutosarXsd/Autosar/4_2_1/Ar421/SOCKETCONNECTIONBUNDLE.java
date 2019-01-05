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
 * This elements groups SocketConnections, i.e. specifies socket connections belonging to the bundle and describes properties which are common for all socket connections in the bundle.
 * 
 * <p>SOCKET-CONNECTION-BUNDLE complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="SOCKET-CONNECTION-BUNDLE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}SOCKET-CONNECTION-BUNDLE"/>
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
@XmlType(name = "SOCKET-CONNECTION-BUNDLE", propOrder = {
    "shortname",
    "bundledconnections",
    "pdus",
    "serverportref",
    "variationpoint"
})
public class SOCKETCONNECTIONBUNDLE {

    @XmlElement(name = "SHORT-NAME", required = true)
    protected IDENTIFIER shortname;
    @XmlElement(name = "BUNDLED-CONNECTIONS")
    protected SOCKETCONNECTIONBUNDLE.BUNDLEDCONNECTIONS bundledconnections;
    @XmlElement(name = "PDUS")
    protected SOCKETCONNECTIONBUNDLE.PDUS pdus;
    @XmlElement(name = "SERVER-PORT-REF")
    protected SOCKETCONNECTIONBUNDLE.SERVERPORTREF serverportref;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??shortname?????
     * 
     * @return
     *     possible object is
     *     {@link IDENTIFIER }
     *     
     */
    public IDENTIFIER getSHORTNAME() {
        return shortname;
    }

    /**
     * ??shortname?????
     * 
     * @param value
     *     allowed object is
     *     {@link IDENTIFIER }
     *     
     */
    public void setSHORTNAME(IDENTIFIER value) {
        this.shortname = value;
    }

    /**
     * ??bundledconnections?????
     * 
     * @return
     *     possible object is
     *     {@link SOCKETCONNECTIONBUNDLE.BUNDLEDCONNECTIONS }
     *     
     */
    public SOCKETCONNECTIONBUNDLE.BUNDLEDCONNECTIONS getBUNDLEDCONNECTIONS() {
        return bundledconnections;
    }

    /**
     * ??bundledconnections?????
     * 
     * @param value
     *     allowed object is
     *     {@link SOCKETCONNECTIONBUNDLE.BUNDLEDCONNECTIONS }
     *     
     */
    public void setBUNDLEDCONNECTIONS(SOCKETCONNECTIONBUNDLE.BUNDLEDCONNECTIONS value) {
        this.bundledconnections = value;
    }

    /**
     * ??pdus?????
     * 
     * @return
     *     possible object is
     *     {@link SOCKETCONNECTIONBUNDLE.PDUS }
     *     
     */
    public SOCKETCONNECTIONBUNDLE.PDUS getPDUS() {
        return pdus;
    }

    /**
     * ??pdus?????
     * 
     * @param value
     *     allowed object is
     *     {@link SOCKETCONNECTIONBUNDLE.PDUS }
     *     
     */
    public void setPDUS(SOCKETCONNECTIONBUNDLE.PDUS value) {
        this.pdus = value;
    }

    /**
     * ??serverportref?????
     * 
     * @return
     *     possible object is
     *     {@link SOCKETCONNECTIONBUNDLE.SERVERPORTREF }
     *     
     */
    public SOCKETCONNECTIONBUNDLE.SERVERPORTREF getSERVERPORTREF() {
        return serverportref;
    }

    /**
     * ??serverportref?????
     * 
     * @param value
     *     allowed object is
     *     {@link SOCKETCONNECTIONBUNDLE.SERVERPORTREF }
     *     
     */
    public void setSERVERPORTREF(SOCKETCONNECTIONBUNDLE.SERVERPORTREF value) {
        this.serverportref = value;
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
     *         &lt;element name="SOCKET-CONNECTION" type="{http://autosar.org/schema/r4.0}SOCKET-CONNECTION"/>
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
        "socketconnection"
    })
    public static class BUNDLEDCONNECTIONS {

        @XmlElement(name = "SOCKET-CONNECTION")
        protected List<SOCKETCONNECTION> socketconnection;

        /**
         * Gets the value of the socketconnection property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the socketconnection property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSOCKETCONNECTION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SOCKETCONNECTION }
         * 
         * 
         */
        public List<SOCKETCONNECTION> getSOCKETCONNECTION() {
            if (socketconnection == null) {
                socketconnection = new ArrayList<SOCKETCONNECTION>();
            }
            return this.socketconnection;
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
     *         &lt;element name="SOCKET-CONNECTION-IPDU-IDENTIFIER" type="{http://autosar.org/schema/r4.0}SOCKET-CONNECTION-IPDU-IDENTIFIER"/>
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
        "socketconnectionipduidentifier"
    })
    public static class PDUS {

        @XmlElement(name = "SOCKET-CONNECTION-IPDU-IDENTIFIER")
        protected List<SOCKETCONNECTIONIPDUIDENTIFIER> socketconnectionipduidentifier;

        /**
         * Gets the value of the socketconnectionipduidentifier property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the socketconnectionipduidentifier property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSOCKETCONNECTIONIPDUIDENTIFIER().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SOCKETCONNECTIONIPDUIDENTIFIER }
         * 
         * 
         */
        public List<SOCKETCONNECTIONIPDUIDENTIFIER> getSOCKETCONNECTIONIPDUIDENTIFIER() {
            if (socketconnectionipduidentifier == null) {
                socketconnectionipduidentifier = new ArrayList<SOCKETCONNECTIONIPDUIDENTIFIER>();
            }
            return this.socketconnectionipduidentifier;
        }

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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}SOCKET-ADDRESS--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SERVERPORTREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected SOCKETADDRESSSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link SOCKETADDRESSSUBTYPESENUM }
         *     
         */
        public SOCKETADDRESSSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link SOCKETADDRESSSUBTYPESENUM }
         *     
         */
        public void setDEST(SOCKETADDRESSSUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
