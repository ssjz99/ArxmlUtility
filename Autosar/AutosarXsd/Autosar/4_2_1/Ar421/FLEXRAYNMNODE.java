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
 * FlexRay specific NM Node attributes.
 * 
 * <p>FLEXRAY-NM-NODE complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="FLEXRAY-NM-NODE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTILANGUAGE-REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}NM-NODE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}FLEXRAY-NM-NODE"/>
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
@XmlType(name = "FLEXRAY-NM-NODE", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "controllerref",
    "nmcoordcluster",
    "nmcoordinatorrole",
    "nmifecuref",
    "nmnodeid",
    "nmpassivemodeenabled",
    "rxnmpdurefs",
    "txnmpdurefs",
    "variationpoint",
    "nminstanceid"
})
public class FLEXRAYNMNODE {

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
    @XmlElement(name = "CONTROLLER-REF")
    protected FLEXRAYNMNODE.CONTROLLERREF controllerref;
    @XmlElement(name = "NM-COORD-CLUSTER")
    protected POSITIVEINTEGER nmcoordcluster;
    @XmlElement(name = "NM-COORDINATOR-ROLE")
    protected NMCOORDINATORROLEENUM nmcoordinatorrole;
    @XmlElement(name = "NM-IF-ECU-REF")
    protected FLEXRAYNMNODE.NMIFECUREF nmifecuref;
    @XmlElement(name = "NM-NODE-ID")
    protected INTEGER nmnodeid;
    @XmlElement(name = "NM-PASSIVE-MODE-ENABLED")
    protected BOOLEAN nmpassivemodeenabled;
    @XmlElement(name = "RX-NM-PDU-REFS")
    protected FLEXRAYNMNODE.RXNMPDUREFS rxnmpdurefs;
    @XmlElement(name = "TX-NM-PDU-REFS")
    protected FLEXRAYNMNODE.TXNMPDUREFS txnmpdurefs;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlElement(name = "NM-INSTANCE-ID")
    protected POSITIVEINTEGER nminstanceid;
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
     * ??controllerref?????
     * 
     * @return
     *     possible object is
     *     {@link FLEXRAYNMNODE.CONTROLLERREF }
     *     
     */
    public FLEXRAYNMNODE.CONTROLLERREF getCONTROLLERREF() {
        return controllerref;
    }

    /**
     * ??controllerref?????
     * 
     * @param value
     *     allowed object is
     *     {@link FLEXRAYNMNODE.CONTROLLERREF }
     *     
     */
    public void setCONTROLLERREF(FLEXRAYNMNODE.CONTROLLERREF value) {
        this.controllerref = value;
    }

    /**
     * ??nmcoordcluster?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getNMCOORDCLUSTER() {
        return nmcoordcluster;
    }

    /**
     * ??nmcoordcluster?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setNMCOORDCLUSTER(POSITIVEINTEGER value) {
        this.nmcoordcluster = value;
    }

    /**
     * ??nmcoordinatorrole?????
     * 
     * @return
     *     possible object is
     *     {@link NMCOORDINATORROLEENUM }
     *     
     */
    public NMCOORDINATORROLEENUM getNMCOORDINATORROLE() {
        return nmcoordinatorrole;
    }

    /**
     * ??nmcoordinatorrole?????
     * 
     * @param value
     *     allowed object is
     *     {@link NMCOORDINATORROLEENUM }
     *     
     */
    public void setNMCOORDINATORROLE(NMCOORDINATORROLEENUM value) {
        this.nmcoordinatorrole = value;
    }

    /**
     * ??nmifecuref?????
     * 
     * @return
     *     possible object is
     *     {@link FLEXRAYNMNODE.NMIFECUREF }
     *     
     */
    public FLEXRAYNMNODE.NMIFECUREF getNMIFECUREF() {
        return nmifecuref;
    }

    /**
     * ??nmifecuref?????
     * 
     * @param value
     *     allowed object is
     *     {@link FLEXRAYNMNODE.NMIFECUREF }
     *     
     */
    public void setNMIFECUREF(FLEXRAYNMNODE.NMIFECUREF value) {
        this.nmifecuref = value;
    }

    /**
     * ??nmnodeid?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getNMNODEID() {
        return nmnodeid;
    }

    /**
     * ??nmnodeid?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setNMNODEID(INTEGER value) {
        this.nmnodeid = value;
    }

    /**
     * ??nmpassivemodeenabled?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getNMPASSIVEMODEENABLED() {
        return nmpassivemodeenabled;
    }

    /**
     * ??nmpassivemodeenabled?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setNMPASSIVEMODEENABLED(BOOLEAN value) {
        this.nmpassivemodeenabled = value;
    }

    /**
     * ??rxnmpdurefs?????
     * 
     * @return
     *     possible object is
     *     {@link FLEXRAYNMNODE.RXNMPDUREFS }
     *     
     */
    public FLEXRAYNMNODE.RXNMPDUREFS getRXNMPDUREFS() {
        return rxnmpdurefs;
    }

    /**
     * ??rxnmpdurefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link FLEXRAYNMNODE.RXNMPDUREFS }
     *     
     */
    public void setRXNMPDUREFS(FLEXRAYNMNODE.RXNMPDUREFS value) {
        this.rxnmpdurefs = value;
    }

    /**
     * ??txnmpdurefs?????
     * 
     * @return
     *     possible object is
     *     {@link FLEXRAYNMNODE.TXNMPDUREFS }
     *     
     */
    public FLEXRAYNMNODE.TXNMPDUREFS getTXNMPDUREFS() {
        return txnmpdurefs;
    }

    /**
     * ??txnmpdurefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link FLEXRAYNMNODE.TXNMPDUREFS }
     *     
     */
    public void setTXNMPDUREFS(FLEXRAYNMNODE.TXNMPDUREFS value) {
        this.txnmpdurefs = value;
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
     * ??nminstanceid?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getNMINSTANCEID() {
        return nminstanceid;
    }

    /**
     * ??nminstanceid?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setNMINSTANCEID(POSITIVEINTEGER value) {
        this.nminstanceid = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}COMMUNICATION-CONTROLLER--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CONTROLLERREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected COMMUNICATIONCONTROLLERSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link COMMUNICATIONCONTROLLERSUBTYPESENUM }
         *     
         */
        public COMMUNICATIONCONTROLLERSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link COMMUNICATIONCONTROLLERSUBTYPESENUM }
         *     
         */
        public void setDEST(COMMUNICATIONCONTROLLERSUBTYPESENUM value) {
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
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}NM-ECU--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class NMIFECUREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected NMECUSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link NMECUSUBTYPESENUM }
         *     
         */
        public NMECUSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link NMECUSUBTYPESENUM }
         *     
         */
        public void setDEST(NMECUSUBTYPESENUM value) {
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
     *         &lt;element name="RX-NM-PDU-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}NM-PDU--SUBTYPES-ENUM" />
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
        "rxnmpduref"
    })
    public static class RXNMPDUREFS {

        @XmlElement(name = "RX-NM-PDU-REF")
        protected List<FLEXRAYNMNODE.RXNMPDUREFS.RXNMPDUREF> rxnmpduref;

        /**
         * Gets the value of the rxnmpduref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the rxnmpduref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRXNMPDUREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FLEXRAYNMNODE.RXNMPDUREFS.RXNMPDUREF }
         * 
         * 
         */
        public List<FLEXRAYNMNODE.RXNMPDUREFS.RXNMPDUREF> getRXNMPDUREF() {
            if (rxnmpduref == null) {
                rxnmpduref = new ArrayList<FLEXRAYNMNODE.RXNMPDUREFS.RXNMPDUREF>();
            }
            return this.rxnmpduref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}NM-PDU--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class RXNMPDUREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected NMPDUSUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link NMPDUSUBTYPESENUM }
             *     
             */
            public NMPDUSUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link NMPDUSUBTYPESENUM }
             *     
             */
            public void setDEST(NMPDUSUBTYPESENUM value) {
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
     *         &lt;element name="TX-NM-PDU-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}NM-PDU--SUBTYPES-ENUM" />
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
        "txnmpduref"
    })
    public static class TXNMPDUREFS {

        @XmlElement(name = "TX-NM-PDU-REF")
        protected List<FLEXRAYNMNODE.TXNMPDUREFS.TXNMPDUREF> txnmpduref;

        /**
         * Gets the value of the txnmpduref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the txnmpduref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTXNMPDUREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FLEXRAYNMNODE.TXNMPDUREFS.TXNMPDUREF }
         * 
         * 
         */
        public List<FLEXRAYNMNODE.TXNMPDUREFS.TXNMPDUREF> getTXNMPDUREF() {
            if (txnmpduref == null) {
                txnmpduref = new ArrayList<FLEXRAYNMNODE.TXNMPDUREFS.TXNMPDUREF>();
            }
            return this.txnmpduref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}NM-PDU--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class TXNMPDUREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected NMPDUSUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link NMPDUSUBTYPESENUM }
             *     
             */
            public NMPDUSUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link NMPDUSUBTYPESENUM }
             *     
             */
            public void setDEST(NMPDUSUBTYPESENUM value) {
                this.dest = value;
            }

        }

    }

}
