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
 * A J1939TpPg represents one J1939 message (parameter group, PG) identified by the PGN (parameter group number) that can be received or transmitted via J1939Tp.
 * 
 * <p>J-1939-TP-PG complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="J-1939-TP-PG">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}J-1939-TP-PG"/>
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
@XmlType(name = "J-1939-TP-PG", propOrder = {
    "directpduref",
    "pgn",
    "sdurefs",
    "tpsduref"
})
public class J1939TPPG {

    @XmlElement(name = "DIRECT-PDU-REF")
    protected J1939TPPG.DIRECTPDUREF directpduref;
    @XmlElement(name = "PGN")
    protected INTEGER pgn;
    @XmlElement(name = "SDU-REFS")
    protected J1939TPPG.SDUREFS sdurefs;
    @XmlElement(name = "TP-SDU-REF")
    protected J1939TPPG.TPSDUREF tpsduref;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??directpduref?????
     * 
     * @return
     *     possible object is
     *     {@link J1939TPPG.DIRECTPDUREF }
     *     
     */
    public J1939TPPG.DIRECTPDUREF getDIRECTPDUREF() {
        return directpduref;
    }

    /**
     * ??directpduref?????
     * 
     * @param value
     *     allowed object is
     *     {@link J1939TPPG.DIRECTPDUREF }
     *     
     */
    public void setDIRECTPDUREF(J1939TPPG.DIRECTPDUREF value) {
        this.directpduref = value;
    }

    /**
     * ??pgn?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getPGN() {
        return pgn;
    }

    /**
     * ??pgn?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setPGN(INTEGER value) {
        this.pgn = value;
    }

    /**
     * ??sdurefs?????
     * 
     * @return
     *     possible object is
     *     {@link J1939TPPG.SDUREFS }
     *     
     */
    public J1939TPPG.SDUREFS getSDUREFS() {
        return sdurefs;
    }

    /**
     * ??sdurefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link J1939TPPG.SDUREFS }
     *     
     */
    public void setSDUREFS(J1939TPPG.SDUREFS value) {
        this.sdurefs = value;
    }

    /**
     * ??tpsduref?????
     * 
     * @return
     *     possible object is
     *     {@link J1939TPPG.TPSDUREF }
     *     
     */
    public J1939TPPG.TPSDUREF getTPSDUREF() {
        return tpsduref;
    }

    /**
     * ??tpsduref?????
     * 
     * @param value
     *     allowed object is
     *     {@link J1939TPPG.TPSDUREF }
     *     
     */
    public void setTPSDUREF(J1939TPPG.TPSDUREF value) {
        this.tpsduref = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}N-PDU--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DIRECTPDUREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected NPDUSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link NPDUSUBTYPESENUM }
         *     
         */
        public NPDUSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link NPDUSUBTYPESENUM }
         *     
         */
        public void setDEST(NPDUSUBTYPESENUM value) {
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
     *         &lt;element name="SDU-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}I-PDU--SUBTYPES-ENUM" />
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
        "sduref"
    })
    public static class SDUREFS {

        @XmlElement(name = "SDU-REF")
        protected List<J1939TPPG.SDUREFS.SDUREF> sduref;

        /**
         * Gets the value of the sduref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the sduref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSDUREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link J1939TPPG.SDUREFS.SDUREF }
         * 
         * 
         */
        public List<J1939TPPG.SDUREFS.SDUREF> getSDUREF() {
            if (sduref == null) {
                sduref = new ArrayList<J1939TPPG.SDUREFS.SDUREF>();
            }
            return this.sduref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}I-PDU--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class SDUREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected IPDUSUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link IPDUSUBTYPESENUM }
             *     
             */
            public IPDUSUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link IPDUSUBTYPESENUM }
             *     
             */
            public void setDEST(IPDUSUBTYPESENUM value) {
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
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}I-PDU--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TPSDUREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected IPDUSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link IPDUSUBTYPESENUM }
         *     
         */
        public IPDUSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link IPDUSUBTYPESENUM }
         *     
         */
        public void setDEST(IPDUSUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
