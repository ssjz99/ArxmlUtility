//
// ????? JavaTM Architecture for XML Binding (JAXB) ???? v2.2.8-b130911.1802 ???
// ??? <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// ?????????, ??????????????
// ????: 2018.03.12 ?? 11:42:22 PM CET 
//


package Ar421;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Each slave node shall publish a one bit signal, named response_error, to the master node in one of its transmitted unconditional frames. The response_error signal shall be set whenever a frame (except for event triggered frame responses) that is transmitted or received by the slave node contains an error in the frame response. The response_error signal shall be cleared when the unconditional frame containing the response_error signal is successfully transmitted.
 * 
 * <p>LIN-ERROR-RESPONSE complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="LIN-ERROR-RESPONSE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}LIN-ERROR-RESPONSE"/>
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
@XmlType(name = "LIN-ERROR-RESPONSE", propOrder = {
    "frametriggeringref",
    "responseerrorposition"
})
public class LINERRORRESPONSE {

    @XmlElement(name = "FRAME-TRIGGERING-REF")
    protected LINERRORRESPONSE.FRAMETRIGGERINGREF frametriggeringref;
    @XmlElement(name = "RESPONSE-ERROR-POSITION")
    protected INTEGER responseerrorposition;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??frametriggeringref?????
     * 
     * @return
     *     possible object is
     *     {@link LINERRORRESPONSE.FRAMETRIGGERINGREF }
     *     
     */
    public LINERRORRESPONSE.FRAMETRIGGERINGREF getFRAMETRIGGERINGREF() {
        return frametriggeringref;
    }

    /**
     * ??frametriggeringref?????
     * 
     * @param value
     *     allowed object is
     *     {@link LINERRORRESPONSE.FRAMETRIGGERINGREF }
     *     
     */
    public void setFRAMETRIGGERINGREF(LINERRORRESPONSE.FRAMETRIGGERINGREF value) {
        this.frametriggeringref = value;
    }

    /**
     * ??responseerrorposition?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getRESPONSEERRORPOSITION() {
        return responseerrorposition;
    }

    /**
     * ??responseerrorposition?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setRESPONSEERRORPOSITION(INTEGER value) {
        this.responseerrorposition = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}LIN-FRAME-TRIGGERING--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class FRAMETRIGGERINGREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected LINFRAMETRIGGERINGSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link LINFRAMETRIGGERINGSUBTYPESENUM }
         *     
         */
        public LINFRAMETRIGGERINGSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link LINFRAMETRIGGERINGSUBTYPESENUM }
         *     
         */
        public void setDEST(LINFRAMETRIGGERINGSUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
