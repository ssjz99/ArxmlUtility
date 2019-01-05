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
 * This meta-class represents the ability to map ApplicationErrors onto each other.
 * 
 * <p>CLIENT-SERVER-APPLICATION-ERROR-MAPPING complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="CLIENT-SERVER-APPLICATION-ERROR-MAPPING">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}CLIENT-SERVER-APPLICATION-ERROR-MAPPING"/>
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
@XmlType(name = "CLIENT-SERVER-APPLICATION-ERROR-MAPPING", propOrder = {
    "firstapplicationerrorref",
    "secondapplicationerrorref"
})
public class CLIENTSERVERAPPLICATIONERRORMAPPING {

    @XmlElement(name = "FIRST-APPLICATION-ERROR-REF")
    protected CLIENTSERVERAPPLICATIONERRORMAPPING.FIRSTAPPLICATIONERRORREF firstapplicationerrorref;
    @XmlElement(name = "SECOND-APPLICATION-ERROR-REF")
    protected CLIENTSERVERAPPLICATIONERRORMAPPING.SECONDAPPLICATIONERRORREF secondapplicationerrorref;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??firstapplicationerrorref?????
     * 
     * @return
     *     possible object is
     *     {@link CLIENTSERVERAPPLICATIONERRORMAPPING.FIRSTAPPLICATIONERRORREF }
     *     
     */
    public CLIENTSERVERAPPLICATIONERRORMAPPING.FIRSTAPPLICATIONERRORREF getFIRSTAPPLICATIONERRORREF() {
        return firstapplicationerrorref;
    }

    /**
     * ??firstapplicationerrorref?????
     * 
     * @param value
     *     allowed object is
     *     {@link CLIENTSERVERAPPLICATIONERRORMAPPING.FIRSTAPPLICATIONERRORREF }
     *     
     */
    public void setFIRSTAPPLICATIONERRORREF(CLIENTSERVERAPPLICATIONERRORMAPPING.FIRSTAPPLICATIONERRORREF value) {
        this.firstapplicationerrorref = value;
    }

    /**
     * ??secondapplicationerrorref?????
     * 
     * @return
     *     possible object is
     *     {@link CLIENTSERVERAPPLICATIONERRORMAPPING.SECONDAPPLICATIONERRORREF }
     *     
     */
    public CLIENTSERVERAPPLICATIONERRORMAPPING.SECONDAPPLICATIONERRORREF getSECONDAPPLICATIONERRORREF() {
        return secondapplicationerrorref;
    }

    /**
     * ??secondapplicationerrorref?????
     * 
     * @param value
     *     allowed object is
     *     {@link CLIENTSERVERAPPLICATIONERRORMAPPING.SECONDAPPLICATIONERRORREF }
     *     
     */
    public void setSECONDAPPLICATIONERRORREF(CLIENTSERVERAPPLICATIONERRORMAPPING.SECONDAPPLICATIONERRORREF value) {
        this.secondapplicationerrorref = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}APPLICATION-ERROR--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class FIRSTAPPLICATIONERRORREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected APPLICATIONERRORSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link APPLICATIONERRORSUBTYPESENUM }
         *     
         */
        public APPLICATIONERRORSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link APPLICATIONERRORSUBTYPESENUM }
         *     
         */
        public void setDEST(APPLICATIONERRORSUBTYPESENUM value) {
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}APPLICATION-ERROR--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SECONDAPPLICATIONERRORREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected APPLICATIONERRORSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link APPLICATIONERRORSUBTYPESENUM }
         *     
         */
        public APPLICATIONERRORSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link APPLICATIONERRORSUBTYPESENUM }
         *     
         */
        public void setDEST(APPLICATIONERRORSUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
