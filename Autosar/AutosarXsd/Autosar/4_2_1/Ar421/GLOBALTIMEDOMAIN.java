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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * This represents the ability to define a global time domain.
 * 
 * <p>GLOBAL-TIME-DOMAIN complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="GLOBAL-TIME-DOMAIN">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTILANGUAGE-REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}COLLECTABLE-ELEMENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}PACKAGEABLE-ELEMENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}FIBEX-ELEMENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}GLOBAL-TIME-DOMAIN"/>
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
@XmlType(name = "GLOBAL-TIME-DOMAIN", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "variationpoint",
    "communicationclusterrefs",
    "domainid",
    "followuptimeoutvalue",
    "gateways",
    "globaltimepduref",
    "master",
    "slaves",
    "subdomainrefs",
    "synclossthreshold",
    "synclosstimeout"
})
public class GLOBALTIMEDOMAIN {

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
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlElement(name = "COMMUNICATION-CLUSTER-REFS")
    protected GLOBALTIMEDOMAIN.COMMUNICATIONCLUSTERREFS communicationclusterrefs;
    @XmlElement(name = "DOMAIN-ID")
    protected POSITIVEINTEGER domainid;
    @XmlElement(name = "FOLLOW-UP-TIMEOUT-VALUE")
    protected TIMEVALUE followuptimeoutvalue;
    @XmlElement(name = "GATEWAYS")
    protected GLOBALTIMEDOMAIN.GATEWAYS gateways;
    @XmlElement(name = "GLOBAL-TIME-PDU-REF")
    protected GLOBALTIMEDOMAIN.GLOBALTIMEPDUREF globaltimepduref;
    @XmlElement(name = "MASTER")
    protected GLOBALTIMEDOMAIN.MASTER master;
    @XmlElement(name = "SLAVES")
    protected GLOBALTIMEDOMAIN.SLAVES slaves;
    @XmlElement(name = "SUB-DOMAIN-REFS")
    protected GLOBALTIMEDOMAIN.SUBDOMAINREFS subdomainrefs;
    @XmlElement(name = "SYNC-LOSS-THRESHOLD")
    protected TIMEVALUE synclossthreshold;
    @XmlElement(name = "SYNC-LOSS-TIMEOUT")
    protected TIMEVALUE synclosstimeout;
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
     * ??communicationclusterrefs?????
     * 
     * @return
     *     possible object is
     *     {@link GLOBALTIMEDOMAIN.COMMUNICATIONCLUSTERREFS }
     *     
     */
    public GLOBALTIMEDOMAIN.COMMUNICATIONCLUSTERREFS getCOMMUNICATIONCLUSTERREFS() {
        return communicationclusterrefs;
    }

    /**
     * ??communicationclusterrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link GLOBALTIMEDOMAIN.COMMUNICATIONCLUSTERREFS }
     *     
     */
    public void setCOMMUNICATIONCLUSTERREFS(GLOBALTIMEDOMAIN.COMMUNICATIONCLUSTERREFS value) {
        this.communicationclusterrefs = value;
    }

    /**
     * ??domainid?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getDOMAINID() {
        return domainid;
    }

    /**
     * ??domainid?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setDOMAINID(POSITIVEINTEGER value) {
        this.domainid = value;
    }

    /**
     * ??followuptimeoutvalue?????
     * 
     * @return
     *     possible object is
     *     {@link TIMEVALUE }
     *     
     */
    public TIMEVALUE getFOLLOWUPTIMEOUTVALUE() {
        return followuptimeoutvalue;
    }

    /**
     * ??followuptimeoutvalue?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMEVALUE }
     *     
     */
    public void setFOLLOWUPTIMEOUTVALUE(TIMEVALUE value) {
        this.followuptimeoutvalue = value;
    }

    /**
     * ??gateways?????
     * 
     * @return
     *     possible object is
     *     {@link GLOBALTIMEDOMAIN.GATEWAYS }
     *     
     */
    public GLOBALTIMEDOMAIN.GATEWAYS getGATEWAYS() {
        return gateways;
    }

    /**
     * ??gateways?????
     * 
     * @param value
     *     allowed object is
     *     {@link GLOBALTIMEDOMAIN.GATEWAYS }
     *     
     */
    public void setGATEWAYS(GLOBALTIMEDOMAIN.GATEWAYS value) {
        this.gateways = value;
    }

    /**
     * ??globaltimepduref?????
     * 
     * @return
     *     possible object is
     *     {@link GLOBALTIMEDOMAIN.GLOBALTIMEPDUREF }
     *     
     */
    public GLOBALTIMEDOMAIN.GLOBALTIMEPDUREF getGLOBALTIMEPDUREF() {
        return globaltimepduref;
    }

    /**
     * ??globaltimepduref?????
     * 
     * @param value
     *     allowed object is
     *     {@link GLOBALTIMEDOMAIN.GLOBALTIMEPDUREF }
     *     
     */
    public void setGLOBALTIMEPDUREF(GLOBALTIMEDOMAIN.GLOBALTIMEPDUREF value) {
        this.globaltimepduref = value;
    }

    /**
     * ??master?????
     * 
     * @return
     *     possible object is
     *     {@link GLOBALTIMEDOMAIN.MASTER }
     *     
     */
    public GLOBALTIMEDOMAIN.MASTER getMASTER() {
        return master;
    }

    /**
     * ??master?????
     * 
     * @param value
     *     allowed object is
     *     {@link GLOBALTIMEDOMAIN.MASTER }
     *     
     */
    public void setMASTER(GLOBALTIMEDOMAIN.MASTER value) {
        this.master = value;
    }

    /**
     * ??slaves?????
     * 
     * @return
     *     possible object is
     *     {@link GLOBALTIMEDOMAIN.SLAVES }
     *     
     */
    public GLOBALTIMEDOMAIN.SLAVES getSLAVES() {
        return slaves;
    }

    /**
     * ??slaves?????
     * 
     * @param value
     *     allowed object is
     *     {@link GLOBALTIMEDOMAIN.SLAVES }
     *     
     */
    public void setSLAVES(GLOBALTIMEDOMAIN.SLAVES value) {
        this.slaves = value;
    }

    /**
     * ??subdomainrefs?????
     * 
     * @return
     *     possible object is
     *     {@link GLOBALTIMEDOMAIN.SUBDOMAINREFS }
     *     
     */
    public GLOBALTIMEDOMAIN.SUBDOMAINREFS getSUBDOMAINREFS() {
        return subdomainrefs;
    }

    /**
     * ??subdomainrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link GLOBALTIMEDOMAIN.SUBDOMAINREFS }
     *     
     */
    public void setSUBDOMAINREFS(GLOBALTIMEDOMAIN.SUBDOMAINREFS value) {
        this.subdomainrefs = value;
    }

    /**
     * ??synclossthreshold?????
     * 
     * @return
     *     possible object is
     *     {@link TIMEVALUE }
     *     
     */
    public TIMEVALUE getSYNCLOSSTHRESHOLD() {
        return synclossthreshold;
    }

    /**
     * ??synclossthreshold?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMEVALUE }
     *     
     */
    public void setSYNCLOSSTHRESHOLD(TIMEVALUE value) {
        this.synclossthreshold = value;
    }

    /**
     * ??synclosstimeout?????
     * 
     * @return
     *     possible object is
     *     {@link TIMEVALUE }
     *     
     */
    public TIMEVALUE getSYNCLOSSTIMEOUT() {
        return synclosstimeout;
    }

    /**
     * ??synclosstimeout?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMEVALUE }
     *     
     */
    public void setSYNCLOSSTIMEOUT(TIMEVALUE value) {
        this.synclosstimeout = value;
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
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="COMMUNICATION-CLUSTER-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}COMMUNICATION-CLUSTER--SUBTYPES-ENUM" />
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
        "communicationclusterref"
    })
    public static class COMMUNICATIONCLUSTERREFS {

        @XmlElement(name = "COMMUNICATION-CLUSTER-REF")
        protected List<GLOBALTIMEDOMAIN.COMMUNICATIONCLUSTERREFS.COMMUNICATIONCLUSTERREF> communicationclusterref;

        /**
         * Gets the value of the communicationclusterref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the communicationclusterref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCOMMUNICATIONCLUSTERREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GLOBALTIMEDOMAIN.COMMUNICATIONCLUSTERREFS.COMMUNICATIONCLUSTERREF }
         * 
         * 
         */
        public List<GLOBALTIMEDOMAIN.COMMUNICATIONCLUSTERREFS.COMMUNICATIONCLUSTERREF> getCOMMUNICATIONCLUSTERREF() {
            if (communicationclusterref == null) {
                communicationclusterref = new ArrayList<GLOBALTIMEDOMAIN.COMMUNICATIONCLUSTERREFS.COMMUNICATIONCLUSTERREF>();
            }
            return this.communicationclusterref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}COMMUNICATION-CLUSTER--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class COMMUNICATIONCLUSTERREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected COMMUNICATIONCLUSTERSUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link COMMUNICATIONCLUSTERSUBTYPESENUM }
             *     
             */
            public COMMUNICATIONCLUSTERSUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link COMMUNICATIONCLUSTERSUBTYPESENUM }
             *     
             */
            public void setDEST(COMMUNICATIONCLUSTERSUBTYPESENUM value) {
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
     *         &lt;element name="GLOBAL-TIME-GATEWAY" type="{http://autosar.org/schema/r4.0}GLOBAL-TIME-GATEWAY"/>
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
        "globaltimegateway"
    })
    public static class GATEWAYS {

        @XmlElement(name = "GLOBAL-TIME-GATEWAY")
        protected List<GLOBALTIMEGATEWAY> globaltimegateway;

        /**
         * Gets the value of the globaltimegateway property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the globaltimegateway property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGLOBALTIMEGATEWAY().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GLOBALTIMEGATEWAY }
         * 
         * 
         */
        public List<GLOBALTIMEGATEWAY> getGLOBALTIMEGATEWAY() {
            if (globaltimegateway == null) {
                globaltimegateway = new ArrayList<GLOBALTIMEGATEWAY>();
            }
            return this.globaltimegateway;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}GENERAL-PURPOSE-PDU--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class GLOBALTIMEPDUREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected GENERALPURPOSEPDUSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link GENERALPURPOSEPDUSUBTYPESENUM }
         *     
         */
        public GENERALPURPOSEPDUSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link GENERALPURPOSEPDUSUBTYPESENUM }
         *     
         */
        public void setDEST(GENERALPURPOSEPDUSUBTYPESENUM value) {
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
     *       &lt;choice minOccurs="0">
     *         &lt;element name="GLOBAL-TIME-CAN-MASTER" type="{http://autosar.org/schema/r4.0}GLOBAL-TIME-CAN-MASTER"/>
     *         &lt;element name="GLOBAL-TIME-ETH-MASTER" type="{http://autosar.org/schema/r4.0}GLOBAL-TIME-ETH-MASTER"/>
     *         &lt;element name="GLOBAL-TIME-FR-MASTER" type="{http://autosar.org/schema/r4.0}GLOBAL-TIME-FR-MASTER"/>
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
        "globaltimecanmasterOrGLOBALTIMEETHMASTEROrGLOBALTIMEFRMASTER"
    })
    public static class MASTER {

        @XmlElements({
            @XmlElement(name = "GLOBAL-TIME-CAN-MASTER", type = GLOBALTIMECANMASTER.class),
            @XmlElement(name = "GLOBAL-TIME-ETH-MASTER", type = GLOBALTIMEETHMASTER.class),
            @XmlElement(name = "GLOBAL-TIME-FR-MASTER", type = GLOBALTIMEFRMASTER.class)
        })
        protected Object globaltimecanmasterOrGLOBALTIMEETHMASTEROrGLOBALTIMEFRMASTER;

        /**
         * ??globaltimecanmasterOrGLOBALTIMEETHMASTEROrGLOBALTIMEFRMASTER?????
         * 
         * @return
         *     possible object is
         *     {@link GLOBALTIMECANMASTER }
         *     {@link GLOBALTIMEETHMASTER }
         *     {@link GLOBALTIMEFRMASTER }
         *     
         */
        public Object getGLOBALTIMECANMASTEROrGLOBALTIMEETHMASTEROrGLOBALTIMEFRMASTER() {
            return globaltimecanmasterOrGLOBALTIMEETHMASTEROrGLOBALTIMEFRMASTER;
        }

        /**
         * ??globaltimecanmasterOrGLOBALTIMEETHMASTEROrGLOBALTIMEFRMASTER?????
         * 
         * @param value
         *     allowed object is
         *     {@link GLOBALTIMECANMASTER }
         *     {@link GLOBALTIMEETHMASTER }
         *     {@link GLOBALTIMEFRMASTER }
         *     
         */
        public void setGLOBALTIMECANMASTEROrGLOBALTIMEETHMASTEROrGLOBALTIMEFRMASTER(Object value) {
            this.globaltimecanmasterOrGLOBALTIMEETHMASTEROrGLOBALTIMEFRMASTER = value;
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
     *         &lt;element name="GLOBAL-TIME-CAN-SLAVE" type="{http://autosar.org/schema/r4.0}GLOBAL-TIME-CAN-SLAVE"/>
     *         &lt;element name="GLOBAL-TIME-ETH-SLAVE" type="{http://autosar.org/schema/r4.0}GLOBAL-TIME-ETH-SLAVE"/>
     *         &lt;element name="GLOBAL-TIME-FR-SLAVE" type="{http://autosar.org/schema/r4.0}GLOBAL-TIME-FR-SLAVE"/>
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
        "globaltimecanslaveOrGLOBALTIMEETHSLAVEOrGLOBALTIMEFRSLAVE"
    })
    public static class SLAVES {

        @XmlElements({
            @XmlElement(name = "GLOBAL-TIME-CAN-SLAVE", type = GLOBALTIMECANSLAVE.class),
            @XmlElement(name = "GLOBAL-TIME-ETH-SLAVE", type = GLOBALTIMEETHSLAVE.class),
            @XmlElement(name = "GLOBAL-TIME-FR-SLAVE", type = GLOBALTIMEFRSLAVE.class)
        })
        protected List<Object> globaltimecanslaveOrGLOBALTIMEETHSLAVEOrGLOBALTIMEFRSLAVE;

        /**
         * Gets the value of the globaltimecanslaveOrGLOBALTIMEETHSLAVEOrGLOBALTIMEFRSLAVE property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the globaltimecanslaveOrGLOBALTIMEETHSLAVEOrGLOBALTIMEFRSLAVE property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGLOBALTIMECANSLAVEOrGLOBALTIMEETHSLAVEOrGLOBALTIMEFRSLAVE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GLOBALTIMECANSLAVE }
         * {@link GLOBALTIMEETHSLAVE }
         * {@link GLOBALTIMEFRSLAVE }
         * 
         * 
         */
        public List<Object> getGLOBALTIMECANSLAVEOrGLOBALTIMEETHSLAVEOrGLOBALTIMEFRSLAVE() {
            if (globaltimecanslaveOrGLOBALTIMEETHSLAVEOrGLOBALTIMEFRSLAVE == null) {
                globaltimecanslaveOrGLOBALTIMEETHSLAVEOrGLOBALTIMEFRSLAVE = new ArrayList<Object>();
            }
            return this.globaltimecanslaveOrGLOBALTIMEETHSLAVEOrGLOBALTIMEFRSLAVE;
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
     *         &lt;element name="SUB-DOMAIN-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}GLOBAL-TIME-DOMAIN--SUBTYPES-ENUM" />
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
        "subdomainref"
    })
    public static class SUBDOMAINREFS {

        @XmlElement(name = "SUB-DOMAIN-REF")
        protected List<GLOBALTIMEDOMAIN.SUBDOMAINREFS.SUBDOMAINREF> subdomainref;

        /**
         * Gets the value of the subdomainref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the subdomainref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSUBDOMAINREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GLOBALTIMEDOMAIN.SUBDOMAINREFS.SUBDOMAINREF }
         * 
         * 
         */
        public List<GLOBALTIMEDOMAIN.SUBDOMAINREFS.SUBDOMAINREF> getSUBDOMAINREF() {
            if (subdomainref == null) {
                subdomainref = new ArrayList<GLOBALTIMEDOMAIN.SUBDOMAINREFS.SUBDOMAINREF>();
            }
            return this.subdomainref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}GLOBAL-TIME-DOMAIN--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class SUBDOMAINREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected GLOBALTIMEDOMAINSUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link GLOBALTIMEDOMAINSUBTYPESENUM }
             *     
             */
            public GLOBALTIMEDOMAINSUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link GLOBALTIMEDOMAINSUBTYPESENUM }
             *     
             */
            public void setDEST(GLOBALTIMEDOMAINSUBTYPESENUM value) {
                this.dest = value;
            }

        }

    }

}
