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
 * <p>MODE-IN-BSW-MODULE-DESCRIPTION-INSTANCE-REF complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="MODE-IN-BSW-MODULE-DESCRIPTION-INSTANCE-REF">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ATP-INSTANCE-REF"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MODE-IN-BSW-MODULE-DESCRIPTION-INSTANCE-REF"/>
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
@XmlType(name = "MODE-IN-BSW-MODULE-DESCRIPTION-INSTANCE-REF", propOrder = {
    "contextmodedeclarationgroupref",
    "targetmoderef"
})
public class MODEINBSWMODULEDESCRIPTIONINSTANCEREF {

    @XmlElement(name = "CONTEXT-MODE-DECLARATION-GROUP-REF")
    protected MODEINBSWMODULEDESCRIPTIONINSTANCEREF.CONTEXTMODEDECLARATIONGROUPREF contextmodedeclarationgroupref;
    @XmlElement(name = "TARGET-MODE-REF")
    protected MODEINBSWMODULEDESCRIPTIONINSTANCEREF.TARGETMODEREF targetmoderef;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??contextmodedeclarationgroupref?????
     * 
     * @return
     *     possible object is
     *     {@link MODEINBSWMODULEDESCRIPTIONINSTANCEREF.CONTEXTMODEDECLARATIONGROUPREF }
     *     
     */
    public MODEINBSWMODULEDESCRIPTIONINSTANCEREF.CONTEXTMODEDECLARATIONGROUPREF getCONTEXTMODEDECLARATIONGROUPREF() {
        return contextmodedeclarationgroupref;
    }

    /**
     * ??contextmodedeclarationgroupref?????
     * 
     * @param value
     *     allowed object is
     *     {@link MODEINBSWMODULEDESCRIPTIONINSTANCEREF.CONTEXTMODEDECLARATIONGROUPREF }
     *     
     */
    public void setCONTEXTMODEDECLARATIONGROUPREF(MODEINBSWMODULEDESCRIPTIONINSTANCEREF.CONTEXTMODEDECLARATIONGROUPREF value) {
        this.contextmodedeclarationgroupref = value;
    }

    /**
     * ??targetmoderef?????
     * 
     * @return
     *     possible object is
     *     {@link MODEINBSWMODULEDESCRIPTIONINSTANCEREF.TARGETMODEREF }
     *     
     */
    public MODEINBSWMODULEDESCRIPTIONINSTANCEREF.TARGETMODEREF getTARGETMODEREF() {
        return targetmoderef;
    }

    /**
     * ??targetmoderef?????
     * 
     * @param value
     *     allowed object is
     *     {@link MODEINBSWMODULEDESCRIPTIONINSTANCEREF.TARGETMODEREF }
     *     
     */
    public void setTARGETMODEREF(MODEINBSWMODULEDESCRIPTIONINSTANCEREF.TARGETMODEREF value) {
        this.targetmoderef = value;
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
    public static class CONTEXTMODEDECLARATIONGROUPREF
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
    public static class TARGETMODEREF
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
