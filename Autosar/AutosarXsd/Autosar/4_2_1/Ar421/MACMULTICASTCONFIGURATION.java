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
 * References a per cluster globally defined MAC-Multicast-Group.
 * 
 * <p>MAC-MULTICAST-CONFIGURATION complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="MAC-MULTICAST-CONFIGURATION">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}NETWORK-ENDPOINT-ADDRESS"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MAC-MULTICAST-CONFIGURATION"/>
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
@XmlType(name = "MAC-MULTICAST-CONFIGURATION", propOrder = {
    "macmulticastgroupref"
})
public class MACMULTICASTCONFIGURATION {

    @XmlElement(name = "MAC-MULTICAST-GROUP-REF")
    protected MACMULTICASTCONFIGURATION.MACMULTICASTGROUPREF macmulticastgroupref;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??macmulticastgroupref?????
     * 
     * @return
     *     possible object is
     *     {@link MACMULTICASTCONFIGURATION.MACMULTICASTGROUPREF }
     *     
     */
    public MACMULTICASTCONFIGURATION.MACMULTICASTGROUPREF getMACMULTICASTGROUPREF() {
        return macmulticastgroupref;
    }

    /**
     * ??macmulticastgroupref?????
     * 
     * @param value
     *     allowed object is
     *     {@link MACMULTICASTCONFIGURATION.MACMULTICASTGROUPREF }
     *     
     */
    public void setMACMULTICASTGROUPREF(MACMULTICASTCONFIGURATION.MACMULTICASTGROUPREF value) {
        this.macmulticastgroupref = value;
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
    public static class MACMULTICASTGROUPREF
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
