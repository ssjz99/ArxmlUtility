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
 * This meta-class represents the ability represent a socket address towards the rest of the meta-model. The actual semantics of the represented socket address, however, is contributed by aggregation of ApplicationEndpoint.
 * 
 * <p>SOCKET-ADDRESS complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="SOCKET-ADDRESS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTILANGUAGE-REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}SOCKET-ADDRESS"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SOCKET-ADDRESS", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "applicationendpoint",
    "connectorref",
    "ipaddress",
    "multicastconnectorrefs",
    "portaddress",
    "variationpoint"
})
public class SOCKETADDRESS {

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
    @XmlElement(name = "APPLICATION-ENDPOINT")
    protected APPLICATIONENDPOINT applicationendpoint;
    @XmlElement(name = "CONNECTOR-REF")
    protected SOCKETADDRESS.CONNECTORREF connectorref;
    @XmlElement(name = "IP-ADDRESS")
    protected STRING ipaddress;
    @XmlElement(name = "MULTICAST-CONNECTOR-REFS")
    protected SOCKETADDRESS.MULTICASTCONNECTORREFS multicastconnectorrefs;
    @XmlElement(name = "PORT-ADDRESS")
    protected INTEGER portaddress;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;
    @XmlAttribute(name = "UUID")
    protected String uuid;

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
     * ??applicationendpoint?????
     * 
     * @return
     *     possible object is
     *     {@link APPLICATIONENDPOINT }
     *     
     */
    public APPLICATIONENDPOINT getAPPLICATIONENDPOINT() {
        return applicationendpoint;
    }

    /**
     * ??applicationendpoint?????
     * 
     * @param value
     *     allowed object is
     *     {@link APPLICATIONENDPOINT }
     *     
     */
    public void setAPPLICATIONENDPOINT(APPLICATIONENDPOINT value) {
        this.applicationendpoint = value;
    }

    /**
     * ??connectorref?????
     * 
     * @return
     *     possible object is
     *     {@link SOCKETADDRESS.CONNECTORREF }
     *     
     */
    public SOCKETADDRESS.CONNECTORREF getCONNECTORREF() {
        return connectorref;
    }

    /**
     * ??connectorref?????
     * 
     * @param value
     *     allowed object is
     *     {@link SOCKETADDRESS.CONNECTORREF }
     *     
     */
    public void setCONNECTORREF(SOCKETADDRESS.CONNECTORREF value) {
        this.connectorref = value;
    }

    /**
     * ??ipaddress?????
     * 
     * @return
     *     possible object is
     *     {@link STRING }
     *     
     */
    public STRING getIPADDRESS() {
        return ipaddress;
    }

    /**
     * ??ipaddress?????
     * 
     * @param value
     *     allowed object is
     *     {@link STRING }
     *     
     */
    public void setIPADDRESS(STRING value) {
        this.ipaddress = value;
    }

    /**
     * ??multicastconnectorrefs?????
     * 
     * @return
     *     possible object is
     *     {@link SOCKETADDRESS.MULTICASTCONNECTORREFS }
     *     
     */
    public SOCKETADDRESS.MULTICASTCONNECTORREFS getMULTICASTCONNECTORREFS() {
        return multicastconnectorrefs;
    }

    /**
     * ??multicastconnectorrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link SOCKETADDRESS.MULTICASTCONNECTORREFS }
     *     
     */
    public void setMULTICASTCONNECTORREFS(SOCKETADDRESS.MULTICASTCONNECTORREFS value) {
        this.multicastconnectorrefs = value;
    }

    /**
     * ??portaddress?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getPORTADDRESS() {
        return portaddress;
    }

    /**
     * ??portaddress?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setPORTADDRESS(INTEGER value) {
        this.portaddress = value;
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
     * <p>anonymous complex type? Java ??
     * 
     * <p>????????????????????
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}ETHERNET-COMMUNICATION-CONNECTOR--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CONNECTORREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected ETHERNETCOMMUNICATIONCONNECTORSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link ETHERNETCOMMUNICATIONCONNECTORSUBTYPESENUM }
         *     
         */
        public ETHERNETCOMMUNICATIONCONNECTORSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link ETHERNETCOMMUNICATIONCONNECTORSUBTYPESENUM }
         *     
         */
        public void setDEST(ETHERNETCOMMUNICATIONCONNECTORSUBTYPESENUM value) {
            this.dest = value;
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
     *         &lt;element name="MULTICAST-CONNECTOR-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}ETHERNET-COMMUNICATION-CONNECTOR--SUBTYPES-ENUM" />
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
        "multicastconnectorref"
    })
    public static class MULTICASTCONNECTORREFS {

        @XmlElement(name = "MULTICAST-CONNECTOR-REF")
        protected List<SOCKETADDRESS.MULTICASTCONNECTORREFS.MULTICASTCONNECTORREF> multicastconnectorref;

        /**
         * Gets the value of the multicastconnectorref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the multicastconnectorref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMULTICASTCONNECTORREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SOCKETADDRESS.MULTICASTCONNECTORREFS.MULTICASTCONNECTORREF }
         * 
         * 
         */
        public List<SOCKETADDRESS.MULTICASTCONNECTORREFS.MULTICASTCONNECTORREF> getMULTICASTCONNECTORREF() {
            if (multicastconnectorref == null) {
                multicastconnectorref = new ArrayList<SOCKETADDRESS.MULTICASTCONNECTORREFS.MULTICASTCONNECTORREF>();
            }
            return this.multicastconnectorref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}ETHERNET-COMMUNICATION-CONNECTOR--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class MULTICASTCONNECTORREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected ETHERNETCOMMUNICATIONCONNECTORSUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link ETHERNETCOMMUNICATIONCONNECTORSUBTYPESENUM }
             *     
             */
            public ETHERNETCOMMUNICATIONCONNECTORSUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link ETHERNETCOMMUNICATIONCONNECTORSUBTYPESENUM }
             *     
             */
            public void setDEST(ETHERNETCOMMUNICATIONCONNECTORSUBTYPESENUM value) {
                this.dest = value;
            }

        }

    }

}
