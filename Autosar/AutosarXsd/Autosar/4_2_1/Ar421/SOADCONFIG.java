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
 * SoAd Configuration for one specific Physical Channel.
 * 
 * <p>SO-AD-CONFIG complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="SO-AD-CONFIG">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}SO-AD-CONFIG"/>
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
@XmlType(name = "SO-AD-CONFIG", propOrder = {
    "connections",
    "connectionbundles",
    "logicaddresss",
    "socketaddresss"
})
public class SOADCONFIG {

    @XmlElement(name = "CONNECTIONS")
    protected SOADCONFIG.CONNECTIONS connections;
    @XmlElement(name = "CONNECTION-BUNDLES")
    protected SOADCONFIG.CONNECTIONBUNDLES connectionbundles;
    @XmlElement(name = "LOGIC-ADDRESSS")
    protected SOADCONFIG.LOGICADDRESSS logicaddresss;
    @XmlElement(name = "SOCKET-ADDRESSS")
    protected SOADCONFIG.SOCKETADDRESSS socketaddresss;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??connections?????
     * 
     * @return
     *     possible object is
     *     {@link SOADCONFIG.CONNECTIONS }
     *     
     */
    public SOADCONFIG.CONNECTIONS getCONNECTIONS() {
        return connections;
    }

    /**
     * ??connections?????
     * 
     * @param value
     *     allowed object is
     *     {@link SOADCONFIG.CONNECTIONS }
     *     
     */
    public void setCONNECTIONS(SOADCONFIG.CONNECTIONS value) {
        this.connections = value;
    }

    /**
     * ??connectionbundles?????
     * 
     * @return
     *     possible object is
     *     {@link SOADCONFIG.CONNECTIONBUNDLES }
     *     
     */
    public SOADCONFIG.CONNECTIONBUNDLES getCONNECTIONBUNDLES() {
        return connectionbundles;
    }

    /**
     * ??connectionbundles?????
     * 
     * @param value
     *     allowed object is
     *     {@link SOADCONFIG.CONNECTIONBUNDLES }
     *     
     */
    public void setCONNECTIONBUNDLES(SOADCONFIG.CONNECTIONBUNDLES value) {
        this.connectionbundles = value;
    }

    /**
     * ??logicaddresss?????
     * 
     * @return
     *     possible object is
     *     {@link SOADCONFIG.LOGICADDRESSS }
     *     
     */
    public SOADCONFIG.LOGICADDRESSS getLOGICADDRESSS() {
        return logicaddresss;
    }

    /**
     * ??logicaddresss?????
     * 
     * @param value
     *     allowed object is
     *     {@link SOADCONFIG.LOGICADDRESSS }
     *     
     */
    public void setLOGICADDRESSS(SOADCONFIG.LOGICADDRESSS value) {
        this.logicaddresss = value;
    }

    /**
     * ??socketaddresss?????
     * 
     * @return
     *     possible object is
     *     {@link SOADCONFIG.SOCKETADDRESSS }
     *     
     */
    public SOADCONFIG.SOCKETADDRESSS getSOCKETADDRESSS() {
        return socketaddresss;
    }

    /**
     * ??socketaddresss?????
     * 
     * @param value
     *     allowed object is
     *     {@link SOADCONFIG.SOCKETADDRESSS }
     *     
     */
    public void setSOCKETADDRESSS(SOADCONFIG.SOCKETADDRESSS value) {
        this.socketaddresss = value;
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
     *         &lt;element name="SOCKET-CONNECTION-BUNDLE" type="{http://autosar.org/schema/r4.0}SOCKET-CONNECTION-BUNDLE"/>
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
        "socketconnectionbundle"
    })
    public static class CONNECTIONBUNDLES {

        @XmlElement(name = "SOCKET-CONNECTION-BUNDLE")
        protected List<SOCKETCONNECTIONBUNDLE> socketconnectionbundle;

        /**
         * Gets the value of the socketconnectionbundle property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the socketconnectionbundle property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSOCKETCONNECTIONBUNDLE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SOCKETCONNECTIONBUNDLE }
         * 
         * 
         */
        public List<SOCKETCONNECTIONBUNDLE> getSOCKETCONNECTIONBUNDLE() {
            if (socketconnectionbundle == null) {
                socketconnectionbundle = new ArrayList<SOCKETCONNECTIONBUNDLE>();
            }
            return this.socketconnectionbundle;
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
    public static class CONNECTIONS {

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
     *         &lt;element name="LOGIC-ADDRESS" type="{http://autosar.org/schema/r4.0}LOGIC-ADDRESS"/>
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
        "logicaddress"
    })
    public static class LOGICADDRESSS {

        @XmlElement(name = "LOGIC-ADDRESS")
        protected List<LOGICADDRESS> logicaddress;

        /**
         * Gets the value of the logicaddress property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the logicaddress property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLOGICADDRESS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LOGICADDRESS }
         * 
         * 
         */
        public List<LOGICADDRESS> getLOGICADDRESS() {
            if (logicaddress == null) {
                logicaddress = new ArrayList<LOGICADDRESS>();
            }
            return this.logicaddress;
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
     *         &lt;element name="SOCKET-ADDRESS" type="{http://autosar.org/schema/r4.0}SOCKET-ADDRESS"/>
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
        "socketaddress"
    })
    public static class SOCKETADDRESSS {

        @XmlElement(name = "SOCKET-ADDRESS")
        protected List<SOCKETADDRESS> socketaddress;

        /**
         * Gets the value of the socketaddress property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the socketaddress property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSOCKETADDRESS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SOCKETADDRESS }
         * 
         * 
         */
        public List<SOCKETADDRESS> getSOCKETADDRESS() {
            if (socketaddress == null) {
                socketaddress = new ArrayList<SOCKETADDRESS>();
            }
            return this.socketaddress;
        }

    }

}
