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
 * <p>P-MODE-GROUP-IN-ATOMIC-SWC-INSTANCE-REF complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="P-MODE-GROUP-IN-ATOMIC-SWC-INSTANCE-REF">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ATP-INSTANCE-REF"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MODE-GROUP-IN-ATOMIC-SWC-INSTANCE-REF"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}P-MODE-GROUP-IN-ATOMIC-SWC-INSTANCE-REF"/>
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
@XmlType(name = "P-MODE-GROUP-IN-ATOMIC-SWC-INSTANCE-REF", propOrder = {
    "contextpportref",
    "targetmodegroupref"
})
public class PMODEGROUPINATOMICSWCINSTANCEREF {

    @XmlElement(name = "CONTEXT-P-PORT-REF")
    protected PMODEGROUPINATOMICSWCINSTANCEREF.CONTEXTPPORTREF contextpportref;
    @XmlElement(name = "TARGET-MODE-GROUP-REF")
    protected PMODEGROUPINATOMICSWCINSTANCEREF.TARGETMODEGROUPREF targetmodegroupref;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??contextpportref?????
     * 
     * @return
     *     possible object is
     *     {@link PMODEGROUPINATOMICSWCINSTANCEREF.CONTEXTPPORTREF }
     *     
     */
    public PMODEGROUPINATOMICSWCINSTANCEREF.CONTEXTPPORTREF getCONTEXTPPORTREF() {
        return contextpportref;
    }

    /**
     * ??contextpportref?????
     * 
     * @param value
     *     allowed object is
     *     {@link PMODEGROUPINATOMICSWCINSTANCEREF.CONTEXTPPORTREF }
     *     
     */
    public void setCONTEXTPPORTREF(PMODEGROUPINATOMICSWCINSTANCEREF.CONTEXTPPORTREF value) {
        this.contextpportref = value;
    }

    /**
     * ??targetmodegroupref?????
     * 
     * @return
     *     possible object is
     *     {@link PMODEGROUPINATOMICSWCINSTANCEREF.TARGETMODEGROUPREF }
     *     
     */
    public PMODEGROUPINATOMICSWCINSTANCEREF.TARGETMODEGROUPREF getTARGETMODEGROUPREF() {
        return targetmodegroupref;
    }

    /**
     * ??targetmodegroupref?????
     * 
     * @param value
     *     allowed object is
     *     {@link PMODEGROUPINATOMICSWCINSTANCEREF.TARGETMODEGROUPREF }
     *     
     */
    public void setTARGETMODEGROUPREF(PMODEGROUPINATOMICSWCINSTANCEREF.TARGETMODEGROUPREF value) {
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}ABSTRACT-PROVIDED-PORT-PROTOTYPE--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CONTEXTPPORTREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected ABSTRACTPROVIDEDPORTPROTOTYPESUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link ABSTRACTPROVIDEDPORTPROTOTYPESUBTYPESENUM }
         *     
         */
        public ABSTRACTPROVIDEDPORTPROTOTYPESUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link ABSTRACTPROVIDEDPORTPROTOTYPESUBTYPESENUM }
         *     
         */
        public void setDEST(ABSTRACTPROVIDEDPORTPROTOTYPESUBTYPESENUM value) {
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
