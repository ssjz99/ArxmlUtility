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
 * This class represents the ability to denote a context of a so called standalone  documentation. Note that this is an <<atpMixed>>. The contents needs to be considered as ordered.
 * 
 * <p>DOCUMENTATION-CONTEXT complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="DOCUMENTATION-CONTEXT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTILANGUAGE-REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}DOCUMENTATION-CONTEXT"/>
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
@XmlType(name = "DOCUMENTATION-CONTEXT", propOrder = {
    "shortname",
    "longname",
    "featureiref",
    "identifiableref"
})
public class DOCUMENTATIONCONTEXT {

    @XmlElement(name = "SHORT-NAME", required = true)
    protected IDENTIFIER shortname;
    @XmlElement(name = "LONG-NAME")
    protected MULTILANGUAGELONGNAME longname;
    @XmlElement(name = "FEATURE-IREF")
    protected ANYINSTANCEREF featureiref;
    @XmlElement(name = "IDENTIFIABLE-REF")
    protected DOCUMENTATIONCONTEXT.IDENTIFIABLEREF identifiableref;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

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
     * ??featureiref?????
     * 
     * @return
     *     possible object is
     *     {@link ANYINSTANCEREF }
     *     
     */
    public ANYINSTANCEREF getFEATUREIREF() {
        return featureiref;
    }

    /**
     * ??featureiref?????
     * 
     * @param value
     *     allowed object is
     *     {@link ANYINSTANCEREF }
     *     
     */
    public void setFEATUREIREF(ANYINSTANCEREF value) {
        this.featureiref = value;
    }

    /**
     * ??identifiableref?????
     * 
     * @return
     *     possible object is
     *     {@link DOCUMENTATIONCONTEXT.IDENTIFIABLEREF }
     *     
     */
    public DOCUMENTATIONCONTEXT.IDENTIFIABLEREF getIDENTIFIABLEREF() {
        return identifiableref;
    }

    /**
     * ??identifiableref?????
     * 
     * @param value
     *     allowed object is
     *     {@link DOCUMENTATIONCONTEXT.IDENTIFIABLEREF }
     *     
     */
    public void setIDENTIFIABLEREF(DOCUMENTATIONCONTEXT.IDENTIFIABLEREF value) {
        this.identifiableref = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}IDENTIFIABLE--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class IDENTIFIABLEREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected IDENTIFIABLESUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link IDENTIFIABLESUBTYPESENUM }
         *     
         */
        public IDENTIFIABLESUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link IDENTIFIABLESUBTYPESENUM }
         *     
         */
        public void setDEST(IDENTIFIABLESUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
