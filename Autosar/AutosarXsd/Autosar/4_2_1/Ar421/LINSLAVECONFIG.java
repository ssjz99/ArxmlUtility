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
 * Node attributes of LIN slaves that are handled by the LinMaster. 
 * 
 * In the System Description LIN slaves may be described as non AUTOSAR ECUs (linSlaveEcu reference). But in an Ecu Extract of the LinMaster the LinSlaveEcus will not be available. The information that is described here is necessary in the ECU Extract for the configuration of the LinMaster. 
 * 
 * The values of attributes of LinSlaveConfig and LinSlave shall be identical for each LinSlaveConfig that points to a LinSlave. Please note that this causes redundancy which is intended to support flexible development methodology.
 * 
 * <p>LIN-SLAVE-CONFIG complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="LIN-SLAVE-CONFIG">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}LIN-SLAVE-CONFIG"/>
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
@XmlType(name = "LIN-SLAVE-CONFIG", propOrder = {
    "configurednad",
    "functionid",
    "linslaveecuref",
    "supplierid",
    "variantid"
})
public class LINSLAVECONFIG {

    @XmlElement(name = "CONFIGURED-NAD")
    protected INTEGER configurednad;
    @XmlElement(name = "FUNCTION-ID")
    protected POSITIVEINTEGER functionid;
    @XmlElement(name = "LIN-SLAVE-ECU-REF")
    protected LINSLAVECONFIG.LINSLAVEECUREF linslaveecuref;
    @XmlElement(name = "SUPPLIER-ID")
    protected POSITIVEINTEGER supplierid;
    @XmlElement(name = "VARIANT-ID")
    protected POSITIVEINTEGER variantid;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??configurednad?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getCONFIGUREDNAD() {
        return configurednad;
    }

    /**
     * ??configurednad?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setCONFIGUREDNAD(INTEGER value) {
        this.configurednad = value;
    }

    /**
     * ??functionid?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getFUNCTIONID() {
        return functionid;
    }

    /**
     * ??functionid?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setFUNCTIONID(POSITIVEINTEGER value) {
        this.functionid = value;
    }

    /**
     * ??linslaveecuref?????
     * 
     * @return
     *     possible object is
     *     {@link LINSLAVECONFIG.LINSLAVEECUREF }
     *     
     */
    public LINSLAVECONFIG.LINSLAVEECUREF getLINSLAVEECUREF() {
        return linslaveecuref;
    }

    /**
     * ??linslaveecuref?????
     * 
     * @param value
     *     allowed object is
     *     {@link LINSLAVECONFIG.LINSLAVEECUREF }
     *     
     */
    public void setLINSLAVEECUREF(LINSLAVECONFIG.LINSLAVEECUREF value) {
        this.linslaveecuref = value;
    }

    /**
     * ??supplierid?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getSUPPLIERID() {
        return supplierid;
    }

    /**
     * ??supplierid?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setSUPPLIERID(POSITIVEINTEGER value) {
        this.supplierid = value;
    }

    /**
     * ??variantid?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getVARIANTID() {
        return variantid;
    }

    /**
     * ??variantid?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setVARIANTID(POSITIVEINTEGER value) {
        this.variantid = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}LIN-SLAVE--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class LINSLAVEECUREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected LINSLAVESUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link LINSLAVESUBTYPESENUM }
         *     
         */
        public LINSLAVESUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link LINSLAVESUBTYPESENUM }
         *     
         */
        public void setDEST(LINSLAVESUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
