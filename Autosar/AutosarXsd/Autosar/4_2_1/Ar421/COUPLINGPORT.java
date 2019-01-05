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
 * A CouplingPort is used to connect a CouplingElement with an EcuInstance or two CouplingElements with each other via a CouplingPortConnection. Optionally, the CouplingPort may also have a reference to a macMulticastGroup and a defaultVLAN.
 * 
 * <p>COUPLING-PORT complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="COUPLING-PORT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTILANGUAGE-REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}COUPLING-PORT"/>
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
@XmlType(name = "COUPLING-PORT", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "connectionnegotiationbehavior",
    "couplingportdetails",
    "couplingportspeed",
    "defaultvlanref",
    "macmulticastaddressrefs",
    "physicallayertype",
    "vlanmemberships",
    "vlanmodifierref"
})
public class COUPLINGPORT {

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
    @XmlElement(name = "CONNECTION-NEGOTIATION-BEHAVIOR")
    protected ETHERNETCONNECTIONNEGOTIATIONENUM connectionnegotiationbehavior;
    @XmlElement(name = "COUPLING-PORT-DETAILS")
    protected COUPLINGPORTDETAILS couplingportdetails;
    @XmlElement(name = "COUPLING-PORT-SPEED")
    protected POSITIVEINTEGER couplingportspeed;
    @XmlElement(name = "DEFAULT-VLAN-REF")
    protected COUPLINGPORT.DEFAULTVLANREF defaultvlanref;
    @XmlElement(name = "MAC-MULTICAST-ADDRESS-REFS")
    protected COUPLINGPORT.MACMULTICASTADDRESSREFS macmulticastaddressrefs;
    @XmlElement(name = "PHYSICAL-LAYER-TYPE")
    protected ETHERNETPHYSICALLAYERTYPEENUM physicallayertype;
    @XmlElement(name = "VLAN-MEMBERSHIPS")
    protected COUPLINGPORT.VLANMEMBERSHIPS vlanmemberships;
    @XmlElement(name = "VLAN-MODIFIER-REF")
    protected COUPLINGPORT.VLANMODIFIERREF vlanmodifierref;
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
     * ??connectionnegotiationbehavior?????
     * 
     * @return
     *     possible object is
     *     {@link ETHERNETCONNECTIONNEGOTIATIONENUM }
     *     
     */
    public ETHERNETCONNECTIONNEGOTIATIONENUM getCONNECTIONNEGOTIATIONBEHAVIOR() {
        return connectionnegotiationbehavior;
    }

    /**
     * ??connectionnegotiationbehavior?????
     * 
     * @param value
     *     allowed object is
     *     {@link ETHERNETCONNECTIONNEGOTIATIONENUM }
     *     
     */
    public void setCONNECTIONNEGOTIATIONBEHAVIOR(ETHERNETCONNECTIONNEGOTIATIONENUM value) {
        this.connectionnegotiationbehavior = value;
    }

    /**
     * ??couplingportdetails?????
     * 
     * @return
     *     possible object is
     *     {@link COUPLINGPORTDETAILS }
     *     
     */
    public COUPLINGPORTDETAILS getCOUPLINGPORTDETAILS() {
        return couplingportdetails;
    }

    /**
     * ??couplingportdetails?????
     * 
     * @param value
     *     allowed object is
     *     {@link COUPLINGPORTDETAILS }
     *     
     */
    public void setCOUPLINGPORTDETAILS(COUPLINGPORTDETAILS value) {
        this.couplingportdetails = value;
    }

    /**
     * ??couplingportspeed?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getCOUPLINGPORTSPEED() {
        return couplingportspeed;
    }

    /**
     * ??couplingportspeed?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setCOUPLINGPORTSPEED(POSITIVEINTEGER value) {
        this.couplingportspeed = value;
    }

    /**
     * ??defaultvlanref?????
     * 
     * @return
     *     possible object is
     *     {@link COUPLINGPORT.DEFAULTVLANREF }
     *     
     */
    public COUPLINGPORT.DEFAULTVLANREF getDEFAULTVLANREF() {
        return defaultvlanref;
    }

    /**
     * ??defaultvlanref?????
     * 
     * @param value
     *     allowed object is
     *     {@link COUPLINGPORT.DEFAULTVLANREF }
     *     
     */
    public void setDEFAULTVLANREF(COUPLINGPORT.DEFAULTVLANREF value) {
        this.defaultvlanref = value;
    }

    /**
     * ??macmulticastaddressrefs?????
     * 
     * @return
     *     possible object is
     *     {@link COUPLINGPORT.MACMULTICASTADDRESSREFS }
     *     
     */
    public COUPLINGPORT.MACMULTICASTADDRESSREFS getMACMULTICASTADDRESSREFS() {
        return macmulticastaddressrefs;
    }

    /**
     * ??macmulticastaddressrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link COUPLINGPORT.MACMULTICASTADDRESSREFS }
     *     
     */
    public void setMACMULTICASTADDRESSREFS(COUPLINGPORT.MACMULTICASTADDRESSREFS value) {
        this.macmulticastaddressrefs = value;
    }

    /**
     * ??physicallayertype?????
     * 
     * @return
     *     possible object is
     *     {@link ETHERNETPHYSICALLAYERTYPEENUM }
     *     
     */
    public ETHERNETPHYSICALLAYERTYPEENUM getPHYSICALLAYERTYPE() {
        return physicallayertype;
    }

    /**
     * ??physicallayertype?????
     * 
     * @param value
     *     allowed object is
     *     {@link ETHERNETPHYSICALLAYERTYPEENUM }
     *     
     */
    public void setPHYSICALLAYERTYPE(ETHERNETPHYSICALLAYERTYPEENUM value) {
        this.physicallayertype = value;
    }

    /**
     * ??vlanmemberships?????
     * 
     * @return
     *     possible object is
     *     {@link COUPLINGPORT.VLANMEMBERSHIPS }
     *     
     */
    public COUPLINGPORT.VLANMEMBERSHIPS getVLANMEMBERSHIPS() {
        return vlanmemberships;
    }

    /**
     * ??vlanmemberships?????
     * 
     * @param value
     *     allowed object is
     *     {@link COUPLINGPORT.VLANMEMBERSHIPS }
     *     
     */
    public void setVLANMEMBERSHIPS(COUPLINGPORT.VLANMEMBERSHIPS value) {
        this.vlanmemberships = value;
    }

    /**
     * ??vlanmodifierref?????
     * 
     * @return
     *     possible object is
     *     {@link COUPLINGPORT.VLANMODIFIERREF }
     *     
     */
    public COUPLINGPORT.VLANMODIFIERREF getVLANMODIFIERREF() {
        return vlanmodifierref;
    }

    /**
     * ??vlanmodifierref?????
     * 
     * @param value
     *     allowed object is
     *     {@link COUPLINGPORT.VLANMODIFIERREF }
     *     
     */
    public void setVLANMODIFIERREF(COUPLINGPORT.VLANMODIFIERREF value) {
        this.vlanmodifierref = value;
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
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}ETHERNET-PHYSICAL-CHANNEL--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DEFAULTVLANREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected ETHERNETPHYSICALCHANNELSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link ETHERNETPHYSICALCHANNELSUBTYPESENUM }
         *     
         */
        public ETHERNETPHYSICALCHANNELSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link ETHERNETPHYSICALCHANNELSUBTYPESENUM }
         *     
         */
        public void setDEST(ETHERNETPHYSICALCHANNELSUBTYPESENUM value) {
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
     *         &lt;element name="MAC-MULTICAST-ADDRESS-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}MAC-MULTICAST-GROUP--SUBTYPES-ENUM" />
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
        "macmulticastaddressref"
    })
    public static class MACMULTICASTADDRESSREFS {

        @XmlElement(name = "MAC-MULTICAST-ADDRESS-REF")
        protected List<COUPLINGPORT.MACMULTICASTADDRESSREFS.MACMULTICASTADDRESSREF> macmulticastaddressref;

        /**
         * Gets the value of the macmulticastaddressref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the macmulticastaddressref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMACMULTICASTADDRESSREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link COUPLINGPORT.MACMULTICASTADDRESSREFS.MACMULTICASTADDRESSREF }
         * 
         * 
         */
        public List<COUPLINGPORT.MACMULTICASTADDRESSREFS.MACMULTICASTADDRESSREF> getMACMULTICASTADDRESSREF() {
            if (macmulticastaddressref == null) {
                macmulticastaddressref = new ArrayList<COUPLINGPORT.MACMULTICASTADDRESSREFS.MACMULTICASTADDRESSREF>();
            }
            return this.macmulticastaddressref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}MAC-MULTICAST-GROUP--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class MACMULTICASTADDRESSREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected MACMULTICASTGROUPSUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link MACMULTICASTGROUPSUBTYPESENUM }
             *     
             */
            public MACMULTICASTGROUPSUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link MACMULTICASTGROUPSUBTYPESENUM }
             *     
             */
            public void setDEST(MACMULTICASTGROUPSUBTYPESENUM value) {
                this.dest = value;
            }

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
     *         &lt;element name="VLAN-MEMBERSHIP" type="{http://autosar.org/schema/r4.0}VLAN-MEMBERSHIP"/>
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
        "vlanmembership"
    })
    public static class VLANMEMBERSHIPS {

        @XmlElement(name = "VLAN-MEMBERSHIP")
        protected List<VLANMEMBERSHIP> vlanmembership;

        /**
         * Gets the value of the vlanmembership property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the vlanmembership property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVLANMEMBERSHIP().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VLANMEMBERSHIP }
         * 
         * 
         */
        public List<VLANMEMBERSHIP> getVLANMEMBERSHIP() {
            if (vlanmembership == null) {
                vlanmembership = new ArrayList<VLANMEMBERSHIP>();
            }
            return this.vlanmembership;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}ETHERNET-PHYSICAL-CHANNEL--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class VLANMODIFIERREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected ETHERNETPHYSICALCHANNELSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link ETHERNETPHYSICALCHANNELSUBTYPESENUM }
         *     
         */
        public ETHERNETPHYSICALCHANNELSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link ETHERNETPHYSICALCHANNELSUBTYPESENUM }
         *     
         */
        public void setDEST(ETHERNETPHYSICALCHANNELSUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
