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
 * PduReplication is a form of redundancy where the data content of one ISignalIPdu (source) is transmitted inside a set of replica ISignalIPdus. These ISignalIPdus (copies) have different Pdu IDs, identical PduCounters, identical data content and are transmitted with the same frequency.
 * 
 * <p>SIGNAL-I-PDU-REPLICATION complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="SIGNAL-I-PDU-REPLICATION">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}SIGNAL-I-PDU-REPLICATION"/>
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
@XmlType(name = "SIGNAL-I-PDU-REPLICATION", propOrder = {
    "pdureplicationvoting",
    "replicapdusrefs",
    "variationpoint"
})
public class SIGNALIPDUREPLICATION {

    @XmlElement(name = "PDU-REPLICATION-VOTING")
    protected INTEGER pdureplicationvoting;
    @XmlElement(name = "REPLICA-PDUS-REFS")
    protected SIGNALIPDUREPLICATION.REPLICAPDUSREFS replicapdusrefs;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??pdureplicationvoting?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getPDUREPLICATIONVOTING() {
        return pdureplicationvoting;
    }

    /**
     * ??pdureplicationvoting?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setPDUREPLICATIONVOTING(INTEGER value) {
        this.pdureplicationvoting = value;
    }

    /**
     * ??replicapdusrefs?????
     * 
     * @return
     *     possible object is
     *     {@link SIGNALIPDUREPLICATION.REPLICAPDUSREFS }
     *     
     */
    public SIGNALIPDUREPLICATION.REPLICAPDUSREFS getREPLICAPDUSREFS() {
        return replicapdusrefs;
    }

    /**
     * ??replicapdusrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link SIGNALIPDUREPLICATION.REPLICAPDUSREFS }
     *     
     */
    public void setREPLICAPDUSREFS(SIGNALIPDUREPLICATION.REPLICAPDUSREFS value) {
        this.replicapdusrefs = value;
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
     *       &lt;choice maxOccurs="2" minOccurs="0">
     *         &lt;element name="REPLICA-PDUS-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}I-SIGNAL-I-PDU--SUBTYPES-ENUM" />
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
        "replicapdusref"
    })
    public static class REPLICAPDUSREFS {

        @XmlElement(name = "REPLICA-PDUS-REF")
        protected List<SIGNALIPDUREPLICATION.REPLICAPDUSREFS.REPLICAPDUSREF> replicapdusref;

        /**
         * Gets the value of the replicapdusref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the replicapdusref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getREPLICAPDUSREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SIGNALIPDUREPLICATION.REPLICAPDUSREFS.REPLICAPDUSREF }
         * 
         * 
         */
        public List<SIGNALIPDUREPLICATION.REPLICAPDUSREFS.REPLICAPDUSREF> getREPLICAPDUSREF() {
            if (replicapdusref == null) {
                replicapdusref = new ArrayList<SIGNALIPDUREPLICATION.REPLICAPDUSREFS.REPLICAPDUSREF>();
            }
            return this.replicapdusref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}I-SIGNAL-I-PDU--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class REPLICAPDUSREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected ISIGNALIPDUSUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link ISIGNALIPDUSUBTYPESENUM }
             *     
             */
            public ISIGNALIPDUSUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link ISIGNALIPDUSUBTYPESENUM }
             *     
             */
            public void setDEST(ISIGNALIPDUSUBTYPESENUM value) {
                this.dest = value;
            }

        }

    }

}
