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
 * An Identifier is required in case of one port per ECU communication where multiple Pdus are transmitted over the same connection. If only one IPdu is transmitted over the connetion this attribute can be ignored.
 * 
 * <p>SOCKET-CONNECTION-IPDU-IDENTIFIER complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="SOCKET-CONNECTION-IPDU-IDENTIFIER">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}SOCKET-CONNECTION-IPDU-IDENTIFIER"/>
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
@XmlType(name = "SOCKET-CONNECTION-IPDU-IDENTIFIER", propOrder = {
    "headerid",
    "pducollectionpdutimeout",
    "pducollectiontrigger",
    "pduref",
    "pdutriggeringref",
    "routinggrouprefs"
})
public class SOCKETCONNECTIONIPDUIDENTIFIER {

    @XmlElement(name = "HEADER-ID")
    protected POSITIVEINTEGER headerid;
    @XmlElement(name = "PDU-COLLECTION-PDU-TIMEOUT")
    protected TIMEVALUE pducollectionpdutimeout;
    @XmlElement(name = "PDU-COLLECTION-TRIGGER")
    protected PDUCOLLECTIONTRIGGERENUM pducollectiontrigger;
    @XmlElement(name = "PDU-REF")
    protected SOCKETCONNECTIONIPDUIDENTIFIER.PDUREF pduref;
    @XmlElement(name = "PDU-TRIGGERING-REF")
    protected SOCKETCONNECTIONIPDUIDENTIFIER.PDUTRIGGERINGREF pdutriggeringref;
    @XmlElement(name = "ROUTING-GROUP-REFS")
    protected SOCKETCONNECTIONIPDUIDENTIFIER.ROUTINGGROUPREFS routinggrouprefs;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??headerid?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getHEADERID() {
        return headerid;
    }

    /**
     * ??headerid?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setHEADERID(POSITIVEINTEGER value) {
        this.headerid = value;
    }

    /**
     * ??pducollectionpdutimeout?????
     * 
     * @return
     *     possible object is
     *     {@link TIMEVALUE }
     *     
     */
    public TIMEVALUE getPDUCOLLECTIONPDUTIMEOUT() {
        return pducollectionpdutimeout;
    }

    /**
     * ??pducollectionpdutimeout?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMEVALUE }
     *     
     */
    public void setPDUCOLLECTIONPDUTIMEOUT(TIMEVALUE value) {
        this.pducollectionpdutimeout = value;
    }

    /**
     * ??pducollectiontrigger?????
     * 
     * @return
     *     possible object is
     *     {@link PDUCOLLECTIONTRIGGERENUM }
     *     
     */
    public PDUCOLLECTIONTRIGGERENUM getPDUCOLLECTIONTRIGGER() {
        return pducollectiontrigger;
    }

    /**
     * ??pducollectiontrigger?????
     * 
     * @param value
     *     allowed object is
     *     {@link PDUCOLLECTIONTRIGGERENUM }
     *     
     */
    public void setPDUCOLLECTIONTRIGGER(PDUCOLLECTIONTRIGGERENUM value) {
        this.pducollectiontrigger = value;
    }

    /**
     * ??pduref?????
     * 
     * @return
     *     possible object is
     *     {@link SOCKETCONNECTIONIPDUIDENTIFIER.PDUREF }
     *     
     */
    public SOCKETCONNECTIONIPDUIDENTIFIER.PDUREF getPDUREF() {
        return pduref;
    }

    /**
     * ??pduref?????
     * 
     * @param value
     *     allowed object is
     *     {@link SOCKETCONNECTIONIPDUIDENTIFIER.PDUREF }
     *     
     */
    public void setPDUREF(SOCKETCONNECTIONIPDUIDENTIFIER.PDUREF value) {
        this.pduref = value;
    }

    /**
     * ??pdutriggeringref?????
     * 
     * @return
     *     possible object is
     *     {@link SOCKETCONNECTIONIPDUIDENTIFIER.PDUTRIGGERINGREF }
     *     
     */
    public SOCKETCONNECTIONIPDUIDENTIFIER.PDUTRIGGERINGREF getPDUTRIGGERINGREF() {
        return pdutriggeringref;
    }

    /**
     * ??pdutriggeringref?????
     * 
     * @param value
     *     allowed object is
     *     {@link SOCKETCONNECTIONIPDUIDENTIFIER.PDUTRIGGERINGREF }
     *     
     */
    public void setPDUTRIGGERINGREF(SOCKETCONNECTIONIPDUIDENTIFIER.PDUTRIGGERINGREF value) {
        this.pdutriggeringref = value;
    }

    /**
     * ??routinggrouprefs?????
     * 
     * @return
     *     possible object is
     *     {@link SOCKETCONNECTIONIPDUIDENTIFIER.ROUTINGGROUPREFS }
     *     
     */
    public SOCKETCONNECTIONIPDUIDENTIFIER.ROUTINGGROUPREFS getROUTINGGROUPREFS() {
        return routinggrouprefs;
    }

    /**
     * ??routinggrouprefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link SOCKETCONNECTIONIPDUIDENTIFIER.ROUTINGGROUPREFS }
     *     
     */
    public void setROUTINGGROUPREFS(SOCKETCONNECTIONIPDUIDENTIFIER.ROUTINGGROUPREFS value) {
        this.routinggrouprefs = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}PDU--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PDUREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected PDUSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link PDUSUBTYPESENUM }
         *     
         */
        public PDUSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link PDUSUBTYPESENUM }
         *     
         */
        public void setDEST(PDUSUBTYPESENUM value) {
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}PDU-TRIGGERING--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PDUTRIGGERINGREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected PDUTRIGGERINGSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link PDUTRIGGERINGSUBTYPESENUM }
         *     
         */
        public PDUTRIGGERINGSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link PDUTRIGGERINGSUBTYPESENUM }
         *     
         */
        public void setDEST(PDUTRIGGERINGSUBTYPESENUM value) {
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
     *         &lt;element name="ROUTING-GROUP-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}SO-AD-ROUTING-GROUP--SUBTYPES-ENUM" />
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
        "routinggroupref"
    })
    public static class ROUTINGGROUPREFS {

        @XmlElement(name = "ROUTING-GROUP-REF")
        protected List<SOCKETCONNECTIONIPDUIDENTIFIER.ROUTINGGROUPREFS.ROUTINGGROUPREF> routinggroupref;

        /**
         * Gets the value of the routinggroupref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the routinggroupref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getROUTINGGROUPREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SOCKETCONNECTIONIPDUIDENTIFIER.ROUTINGGROUPREFS.ROUTINGGROUPREF }
         * 
         * 
         */
        public List<SOCKETCONNECTIONIPDUIDENTIFIER.ROUTINGGROUPREFS.ROUTINGGROUPREF> getROUTINGGROUPREF() {
            if (routinggroupref == null) {
                routinggroupref = new ArrayList<SOCKETCONNECTIONIPDUIDENTIFIER.ROUTINGGROUPREFS.ROUTINGGROUPREF>();
            }
            return this.routinggroupref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}SO-AD-ROUTING-GROUP--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ROUTINGGROUPREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected SOADROUTINGGROUPSUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link SOADROUTINGGROUPSUBTYPESENUM }
             *     
             */
            public SOADROUTINGGROUPSUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link SOADROUTINGGROUPSUBTYPESENUM }
             *     
             */
            public void setDEST(SOADROUTINGGROUPSUBTYPESENUM value) {
                this.dest = value;
            }

        }

    }

}
