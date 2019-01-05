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
 * <p>R-MODE-IN-ATOMIC-SWC-INSTANCE-REF complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="R-MODE-IN-ATOMIC-SWC-INSTANCE-REF">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ATP-INSTANCE-REF"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}R-MODE-IN-ATOMIC-SWC-INSTANCE-REF"/>
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
@XmlType(name = "R-MODE-IN-ATOMIC-SWC-INSTANCE-REF", propOrder = {
    "contextportref",
    "contextmodedeclarationgroupprototyperef",
    "targetmodedeclarationref"
})
public class RMODEINATOMICSWCINSTANCEREF {

    @XmlElement(name = "CONTEXT-PORT-REF")
    protected RMODEINATOMICSWCINSTANCEREF.CONTEXTPORTREF contextportref;
    @XmlElement(name = "CONTEXT-MODE-DECLARATION-GROUP-PROTOTYPE-REF")
    protected RMODEINATOMICSWCINSTANCEREF.CONTEXTMODEDECLARATIONGROUPPROTOTYPEREF contextmodedeclarationgroupprototyperef;
    @XmlElement(name = "TARGET-MODE-DECLARATION-REF")
    protected RMODEINATOMICSWCINSTANCEREF.TARGETMODEDECLARATIONREF targetmodedeclarationref;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??contextportref?????
     * 
     * @return
     *     possible object is
     *     {@link RMODEINATOMICSWCINSTANCEREF.CONTEXTPORTREF }
     *     
     */
    public RMODEINATOMICSWCINSTANCEREF.CONTEXTPORTREF getCONTEXTPORTREF() {
        return contextportref;
    }

    /**
     * ??contextportref?????
     * 
     * @param value
     *     allowed object is
     *     {@link RMODEINATOMICSWCINSTANCEREF.CONTEXTPORTREF }
     *     
     */
    public void setCONTEXTPORTREF(RMODEINATOMICSWCINSTANCEREF.CONTEXTPORTREF value) {
        this.contextportref = value;
    }

    /**
     * ??contextmodedeclarationgroupprototyperef?????
     * 
     * @return
     *     possible object is
     *     {@link RMODEINATOMICSWCINSTANCEREF.CONTEXTMODEDECLARATIONGROUPPROTOTYPEREF }
     *     
     */
    public RMODEINATOMICSWCINSTANCEREF.CONTEXTMODEDECLARATIONGROUPPROTOTYPEREF getCONTEXTMODEDECLARATIONGROUPPROTOTYPEREF() {
        return contextmodedeclarationgroupprototyperef;
    }

    /**
     * ??contextmodedeclarationgroupprototyperef?????
     * 
     * @param value
     *     allowed object is
     *     {@link RMODEINATOMICSWCINSTANCEREF.CONTEXTMODEDECLARATIONGROUPPROTOTYPEREF }
     *     
     */
    public void setCONTEXTMODEDECLARATIONGROUPPROTOTYPEREF(RMODEINATOMICSWCINSTANCEREF.CONTEXTMODEDECLARATIONGROUPPROTOTYPEREF value) {
        this.contextmodedeclarationgroupprototyperef = value;
    }

    /**
     * ??targetmodedeclarationref?????
     * 
     * @return
     *     possible object is
     *     {@link RMODEINATOMICSWCINSTANCEREF.TARGETMODEDECLARATIONREF }
     *     
     */
    public RMODEINATOMICSWCINSTANCEREF.TARGETMODEDECLARATIONREF getTARGETMODEDECLARATIONREF() {
        return targetmodedeclarationref;
    }

    /**
     * ??targetmodedeclarationref?????
     * 
     * @param value
     *     allowed object is
     *     {@link RMODEINATOMICSWCINSTANCEREF.TARGETMODEDECLARATIONREF }
     *     
     */
    public void setTARGETMODEDECLARATIONREF(RMODEINATOMICSWCINSTANCEREF.TARGETMODEDECLARATIONREF value) {
        this.targetmodedeclarationref = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}MODE-DECLARATION-GROUP-PROTOTYPE--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CONTEXTMODEDECLARATIONGROUPPROTOTYPEREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected MODEDECLARATIONGROUPPROTOTYPESUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link MODEDECLARATIONGROUPPROTOTYPESUBTYPESENUM }
         *     
         */
        public MODEDECLARATIONGROUPPROTOTYPESUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link MODEDECLARATIONGROUPPROTOTYPESUBTYPESENUM }
         *     
         */
        public void setDEST(MODEDECLARATIONGROUPPROTOTYPESUBTYPESENUM value) {
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}ABSTRACT-REQUIRED-PORT-PROTOTYPE--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CONTEXTPORTREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected ABSTRACTREQUIREDPORTPROTOTYPESUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link ABSTRACTREQUIREDPORTPROTOTYPESUBTYPESENUM }
         *     
         */
        public ABSTRACTREQUIREDPORTPROTOTYPESUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link ABSTRACTREQUIREDPORTPROTOTYPESUBTYPESENUM }
         *     
         */
        public void setDEST(ABSTRACTREQUIREDPORTPROTOTYPESUBTYPESENUM value) {
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}MODE-DECLARATION--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TARGETMODEDECLARATIONREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected MODEDECLARATIONSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link MODEDECLARATIONSUBTYPESENUM }
         *     
         */
        public MODEDECLARATIONSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link MODEDECLARATIONSUBTYPESENUM }
         *     
         */
        public void setDEST(MODEDECLARATIONSUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
