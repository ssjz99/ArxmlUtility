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
 * Ethernet specific attributes to the CommunicationConnector.
 * 
 * <p>ETHERNET-COMMUNICATION-CONNECTOR complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="ETHERNET-COMMUNICATION-CONNECTOR">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTILANGUAGE-REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}COMMUNICATION-CONNECTOR"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ETHERNET-COMMUNICATION-CONNECTOR"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ETHERNET-COMMUNICATION-CONNECTOR", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "commcontrollerref",
    "ecucommportinstances",
    "pncgatewaytype",
    "ipv6PATHMTUENABLED",
    "ipv6PATHMTUTIMEOUT",
    "maximumtransmissionunit",
    "networkendpointrefs"
})
public class ETHERNETCOMMUNICATIONCONNECTOR {

    @XmlElement(name = "SHORT-NAME", required = true)
    protected IDENTIFIER shortname;
    @XmlElement(name = "LONG-NAME")
    protected MULTILANGUAGELONGNAME longname;
    @XmlElement(name = "DESC")
    protected MULTILANGUAGEOVERVIEWPARAGRAPH desc;
    @XmlElement(name = "CATEGORY")
    protected CATEGORYSTRING category;
    @XmlElement(name = "ADMIN-DATA")
    protected ADMINDATA admindata;
    @XmlElement(name = "INTRODUCTION")
    protected DOCUMENTATIONBLOCK introduction;
    @XmlElement(name = "ANNOTATIONS")
    protected Ar421.LINKER.ANNOTATIONS annotations;
    @XmlElement(name = "COMM-CONTROLLER-REF")
    protected Ar421.LINCOMMUNICATIONCONNECTOR.COMMCONTROLLERREF commcontrollerref;
    @XmlElement(name = "ECU-COMM-PORT-INSTANCES")
    protected Ar421.LINCOMMUNICATIONCONNECTOR.ECUCOMMPORTINSTANCES ecucommportinstances;
    @XmlElement(name = "PNC-GATEWAY-TYPE")
    protected PNCGATEWAYTYPEENUM pncgatewaytype;
    @XmlElement(name = "IP-V-6-PATH-MTU-ENABLED")
    protected BOOLEAN ipv6PATHMTUENABLED;
    @XmlElement(name = "IP-V-6-PATH-MTU-TIMEOUT")
    protected TIMEVALUE ipv6PATHMTUTIMEOUT;
    @XmlElement(name = "MAXIMUM-TRANSMISSION-UNIT")
    protected POSITIVEINTEGER maximumtransmissionunit;
    @XmlElement(name = "NETWORK-ENDPOINT-REFS")
    protected ETHERNETCOMMUNICATIONCONNECTOR.NETWORKENDPOINTREFS networkendpointrefs;
    @XmlAttribute(name = "UUID")
    protected String uuid;
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
     * ??longname?????
     * 
     * @return
     *     possible object is
     *     {@link MULTILANGUAGELONGNAME }
     *     
     */
    public MULTILANGUAGELONGNAME getLONGNAME() {
        return longname;
    }

    /**
     * ??longname?????
     * 
     * @param value
     *     allowed object is
     *     {@link MULTILANGUAGELONGNAME }
     *     
     */
    public void setLONGNAME(MULTILANGUAGELONGNAME value) {
        this.longname = value;
    }

    /**
     * ??desc?????
     * 
     * @return
     *     possible object is
     *     {@link MULTILANGUAGEOVERVIEWPARAGRAPH }
     *     
     */
    public MULTILANGUAGEOVERVIEWPARAGRAPH getDESC() {
        return desc;
    }

    /**
     * ??desc?????
     * 
     * @param value
     *     allowed object is
     *     {@link MULTILANGUAGEOVERVIEWPARAGRAPH }
     *     
     */
    public void setDESC(MULTILANGUAGEOVERVIEWPARAGRAPH value) {
        this.desc = value;
    }

    /**
     * ??category?????
     * 
     * @return
     *     possible object is
     *     {@link CATEGORYSTRING }
     *     
     */
    public CATEGORYSTRING getCATEGORY() {
        return category;
    }

    /**
     * ??category?????
     * 
     * @param value
     *     allowed object is
     *     {@link CATEGORYSTRING }
     *     
     */
    public void setCATEGORY(CATEGORYSTRING value) {
        this.category = value;
    }

    /**
     * ??admindata?????
     * 
     * @return
     *     possible object is
     *     {@link ADMINDATA }
     *     
     */
    public ADMINDATA getADMINDATA() {
        return admindata;
    }

    /**
     * ??admindata?????
     * 
     * @param value
     *     allowed object is
     *     {@link ADMINDATA }
     *     
     */
    public void setADMINDATA(ADMINDATA value) {
        this.admindata = value;
    }

    /**
     * ??introduction?????
     * 
     * @return
     *     possible object is
     *     {@link DOCUMENTATIONBLOCK }
     *     
     */
    public DOCUMENTATIONBLOCK getINTRODUCTION() {
        return introduction;
    }

    /**
     * ??introduction?????
     * 
     * @param value
     *     allowed object is
     *     {@link DOCUMENTATIONBLOCK }
     *     
     */
    public void setINTRODUCTION(DOCUMENTATIONBLOCK value) {
        this.introduction = value;
    }

    /**
     * ??annotations?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.LINKER.ANNOTATIONS }
     *     
     */
    public Ar421.LINKER.ANNOTATIONS getANNOTATIONS() {
        return annotations;
    }

    /**
     * ??annotations?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.LINKER.ANNOTATIONS }
     *     
     */
    public void setANNOTATIONS(Ar421.LINKER.ANNOTATIONS value) {
        this.annotations = value;
    }

    /**
     * ??commcontrollerref?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.LINCOMMUNICATIONCONNECTOR.COMMCONTROLLERREF }
     *     
     */
    public Ar421.LINCOMMUNICATIONCONNECTOR.COMMCONTROLLERREF getCOMMCONTROLLERREF() {
        return commcontrollerref;
    }

    /**
     * ??commcontrollerref?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.LINCOMMUNICATIONCONNECTOR.COMMCONTROLLERREF }
     *     
     */
    public void setCOMMCONTROLLERREF(Ar421.LINCOMMUNICATIONCONNECTOR.COMMCONTROLLERREF value) {
        this.commcontrollerref = value;
    }

    /**
     * ??ecucommportinstances?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.LINCOMMUNICATIONCONNECTOR.ECUCOMMPORTINSTANCES }
     *     
     */
    public Ar421.LINCOMMUNICATIONCONNECTOR.ECUCOMMPORTINSTANCES getECUCOMMPORTINSTANCES() {
        return ecucommportinstances;
    }

    /**
     * ??ecucommportinstances?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.LINCOMMUNICATIONCONNECTOR.ECUCOMMPORTINSTANCES }
     *     
     */
    public void setECUCOMMPORTINSTANCES(Ar421.LINCOMMUNICATIONCONNECTOR.ECUCOMMPORTINSTANCES value) {
        this.ecucommportinstances = value;
    }

    /**
     * ??pncgatewaytype?????
     * 
     * @return
     *     possible object is
     *     {@link PNCGATEWAYTYPEENUM }
     *     
     */
    public PNCGATEWAYTYPEENUM getPNCGATEWAYTYPE() {
        return pncgatewaytype;
    }

    /**
     * ??pncgatewaytype?????
     * 
     * @param value
     *     allowed object is
     *     {@link PNCGATEWAYTYPEENUM }
     *     
     */
    public void setPNCGATEWAYTYPE(PNCGATEWAYTYPEENUM value) {
        this.pncgatewaytype = value;
    }

    /**
     * ??ipv6PATHMTUENABLED?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getIPV6PATHMTUENABLED() {
        return ipv6PATHMTUENABLED;
    }

    /**
     * ??ipv6PATHMTUENABLED?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setIPV6PATHMTUENABLED(BOOLEAN value) {
        this.ipv6PATHMTUENABLED = value;
    }

    /**
     * ??ipv6PATHMTUTIMEOUT?????
     * 
     * @return
     *     possible object is
     *     {@link TIMEVALUE }
     *     
     */
    public TIMEVALUE getIPV6PATHMTUTIMEOUT() {
        return ipv6PATHMTUTIMEOUT;
    }

    /**
     * ??ipv6PATHMTUTIMEOUT?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMEVALUE }
     *     
     */
    public void setIPV6PATHMTUTIMEOUT(TIMEVALUE value) {
        this.ipv6PATHMTUTIMEOUT = value;
    }

    /**
     * ??maximumtransmissionunit?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getMAXIMUMTRANSMISSIONUNIT() {
        return maximumtransmissionunit;
    }

    /**
     * ??maximumtransmissionunit?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setMAXIMUMTRANSMISSIONUNIT(POSITIVEINTEGER value) {
        this.maximumtransmissionunit = value;
    }

    /**
     * ??networkendpointrefs?????
     * 
     * @return
     *     possible object is
     *     {@link ETHERNETCOMMUNICATIONCONNECTOR.NETWORKENDPOINTREFS }
     *     
     */
    public ETHERNETCOMMUNICATIONCONNECTOR.NETWORKENDPOINTREFS getNETWORKENDPOINTREFS() {
        return networkendpointrefs;
    }

    /**
     * ??networkendpointrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link ETHERNETCOMMUNICATIONCONNECTOR.NETWORKENDPOINTREFS }
     *     
     */
    public void setNETWORKENDPOINTREFS(ETHERNETCOMMUNICATIONCONNECTOR.NETWORKENDPOINTREFS value) {
        this.networkendpointrefs = value;
    }

    /**
     * ??uuid?????
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUUID() {
        return uuid;
    }

    /**
     * ??uuid?????
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUUID(String value) {
        this.uuid = value;
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
     *         &lt;element name="NETWORK-ENDPOINT-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}NETWORK-ENDPOINT--SUBTYPES-ENUM" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "networkendpointref"
    })
    public static class NETWORKENDPOINTREFS {

        @XmlElement(name = "NETWORK-ENDPOINT-REF")
        protected List<ETHERNETCOMMUNICATIONCONNECTOR.NETWORKENDPOINTREFS.NETWORKENDPOINTREF> networkendpointref;

        /**
         * Gets the value of the networkendpointref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the networkendpointref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNETWORKENDPOINTREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ETHERNETCOMMUNICATIONCONNECTOR.NETWORKENDPOINTREFS.NETWORKENDPOINTREF }
         * 
         * 
         */
        public List<ETHERNETCOMMUNICATIONCONNECTOR.NETWORKENDPOINTREFS.NETWORKENDPOINTREF> getNETWORKENDPOINTREF() {
            if (networkendpointref == null) {
                networkendpointref = new ArrayList<ETHERNETCOMMUNICATIONCONNECTOR.NETWORKENDPOINTREFS.NETWORKENDPOINTREF>();
            }
            return this.networkendpointref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}NETWORK-ENDPOINT--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class NETWORKENDPOINTREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected NETWORKENDPOINTSUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link NETWORKENDPOINTSUBTYPESENUM }
             *     
             */
            public NETWORKENDPOINTSUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link NETWORKENDPOINTSUBTYPESENUM }
             *     
             */
            public void setDEST(NETWORKENDPOINTSUBTYPESENUM value) {
                this.dest = value;
            }

        }

    }

}
