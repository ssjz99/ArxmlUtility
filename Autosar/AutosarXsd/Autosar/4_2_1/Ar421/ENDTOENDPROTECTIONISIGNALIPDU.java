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
 * It is possible to protect the inter-ECU data exchange of safety-related ISignalGroups at the level of COM IPdus using protection mechanisms provided by E2E Library. For each ISignalGroup to be protected, a separate EndToEndProtectionISignalIPdu element shall be created within the EndToEndProtectionSet. 
 * 
 * The EndToEndProtectionISignalIPdu element refers to the ISignalGroup that is to be protected and to the ISignalIPdu that transmits the protected ISignalGroup. The information how the referenced ISignalGroup shall be protected (through which E2E Profile and with which E2E settings) is defined in the EndToEndDescription element.
 * 
 * <p>END-TO-END-PROTECTION-I-SIGNAL-I-PDU complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="END-TO-END-PROTECTION-I-SIGNAL-I-PDU">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}END-TO-END-PROTECTION-I-SIGNAL-I-PDU"/>
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
@XmlType(name = "END-TO-END-PROTECTION-I-SIGNAL-I-PDU", propOrder = {
    "dataoffset",
    "isignalgroupref",
    "isignalipduref",
    "variationpoint"
})
public class ENDTOENDPROTECTIONISIGNALIPDU {

    @XmlElement(name = "DATA-OFFSET")
    protected INTEGER dataoffset;
    @XmlElement(name = "I-SIGNAL-GROUP-REF")
    protected ENDTOENDPROTECTIONISIGNALIPDU.ISIGNALGROUPREF isignalgroupref;
    @XmlElement(name = "I-SIGNAL-I-PDU-REF")
    protected ENDTOENDPROTECTIONISIGNALIPDU.ISIGNALIPDUREF isignalipduref;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??dataoffset?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getDATAOFFSET() {
        return dataoffset;
    }

    /**
     * ??dataoffset?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setDATAOFFSET(INTEGER value) {
        this.dataoffset = value;
    }

    /**
     * ??isignalgroupref?????
     * 
     * @return
     *     possible object is
     *     {@link ENDTOENDPROTECTIONISIGNALIPDU.ISIGNALGROUPREF }
     *     
     */
    public ENDTOENDPROTECTIONISIGNALIPDU.ISIGNALGROUPREF getISIGNALGROUPREF() {
        return isignalgroupref;
    }

    /**
     * ??isignalgroupref?????
     * 
     * @param value
     *     allowed object is
     *     {@link ENDTOENDPROTECTIONISIGNALIPDU.ISIGNALGROUPREF }
     *     
     */
    public void setISIGNALGROUPREF(ENDTOENDPROTECTIONISIGNALIPDU.ISIGNALGROUPREF value) {
        this.isignalgroupref = value;
    }

    /**
     * ??isignalipduref?????
     * 
     * @return
     *     possible object is
     *     {@link ENDTOENDPROTECTIONISIGNALIPDU.ISIGNALIPDUREF }
     *     
     */
    public ENDTOENDPROTECTIONISIGNALIPDU.ISIGNALIPDUREF getISIGNALIPDUREF() {
        return isignalipduref;
    }

    /**
     * ??isignalipduref?????
     * 
     * @param value
     *     allowed object is
     *     {@link ENDTOENDPROTECTIONISIGNALIPDU.ISIGNALIPDUREF }
     *     
     */
    public void setISIGNALIPDUREF(ENDTOENDPROTECTIONISIGNALIPDU.ISIGNALIPDUREF value) {
        this.isignalipduref = value;
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
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}I-SIGNAL-GROUP--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ISIGNALGROUPREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected ISIGNALGROUPSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link ISIGNALGROUPSUBTYPESENUM }
         *     
         */
        public ISIGNALGROUPSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link ISIGNALGROUPSUBTYPESENUM }
         *     
         */
        public void setDEST(ISIGNALGROUPSUBTYPESENUM value) {
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
    public static class ISIGNALIPDUREF
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
