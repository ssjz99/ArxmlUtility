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
 * <p>R-MODE-GROUP-IN-ATOMIC-SWC-INSTANCE-REF complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="R-MODE-GROUP-IN-ATOMIC-SWC-INSTANCE-REF">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ATP-INSTANCE-REF"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MODE-GROUP-IN-ATOMIC-SWC-INSTANCE-REF"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}R-MODE-GROUP-IN-ATOMIC-SWC-INSTANCE-REF"/>
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
@XmlType(name = "R-MODE-GROUP-IN-ATOMIC-SWC-INSTANCE-REF", propOrder = {
    "contextrportref",
    "targetmodegroupref"
})
public class RMODEGROUPINATOMICSWCINSTANCEREF {

    @XmlElement(name = "CONTEXT-R-PORT-REF")
    protected RMODEGROUPINATOMICSWCINSTANCEREF.CONTEXTRPORTREF contextrportref;
    @XmlElement(name = "TARGET-MODE-GROUP-REF")
    protected RMODEGROUPINATOMICSWCINSTANCEREF.TARGETMODEGROUPREF targetmodegroupref;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??contextrportref?????
     * 
     * @return
     *     possible object is
     *     {@link RMODEGROUPINATOMICSWCINSTANCEREF.CONTEXTRPORTREF }
     *     
     */
    public RMODEGROUPINATOMICSWCINSTANCEREF.CONTEXTRPORTREF getCONTEXTRPORTREF() {
        return contextrportref;
    }

    /**
     * ??contextrportref?????
     * 
     * @param value
     *     allowed object is
     *     {@link RMODEGROUPINATOMICSWCINSTANCEREF.CONTEXTRPORTREF }
     *     
     */
    public void setCONTEXTRPORTREF(RMODEGROUPINATOMICSWCINSTANCEREF.CONTEXTRPORTREF value) {
        this.contextrportref = value;
    }

    /**
     * ??targetmodegroupref?????
     * 
     * @return
     *     possible object is
     *     {@link RMODEGROUPINATOMICSWCINSTANCEREF.TARGETMODEGROUPREF }
     *     
     */
    public RMODEGROUPINATOMICSWCINSTANCEREF.TARGETMODEGROUPREF getTARGETMODEGROUPREF() {
        return targetmodegroupref;
    }

    /**
     * ??targetmodegroupref?????
     * 
     * @param value
     *     allowed object is
     *     {@link RMODEGROUPINATOMICSWCINSTANCEREF.TARGETMODEGROUPREF }
     *     
     */
    public void setTARGETMODEGROUPREF(RMODEGROUPINATOMICSWCINSTANCEREF.TARGETMODEGROUPREF value) {
        this.targetmodegroupref = value;
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
    public static class CONTEXTRPORTREF
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
    public static class TARGETMODEGROUPREF
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

}
