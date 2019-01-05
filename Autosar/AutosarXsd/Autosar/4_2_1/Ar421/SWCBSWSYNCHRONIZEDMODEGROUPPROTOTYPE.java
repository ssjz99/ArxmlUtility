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
 * Synchronizes a mode group provided by a component via a port with a mode group provided by a BSW module or cluster.
 * 
 * <p>SWC-BSW-SYNCHRONIZED-MODE-GROUP-PROTOTYPE complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="SWC-BSW-SYNCHRONIZED-MODE-GROUP-PROTOTYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}SWC-BSW-SYNCHRONIZED-MODE-GROUP-PROTOTYPE"/>
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
@XmlType(name = "SWC-BSW-SYNCHRONIZED-MODE-GROUP-PROTOTYPE", propOrder = {
    "bswmodegroupref",
    "swcmodegroupiref",
    "variationpoint"
})
public class SWCBSWSYNCHRONIZEDMODEGROUPPROTOTYPE {

    @XmlElement(name = "BSW-MODE-GROUP-REF")
    protected SWCBSWSYNCHRONIZEDMODEGROUPPROTOTYPE.BSWMODEGROUPREF bswmodegroupref;
    @XmlElement(name = "SWC-MODE-GROUP-IREF")
    protected PMODEGROUPINATOMICSWCINSTANCEREF swcmodegroupiref;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??bswmodegroupref?????
     * 
     * @return
     *     possible object is
     *     {@link SWCBSWSYNCHRONIZEDMODEGROUPPROTOTYPE.BSWMODEGROUPREF }
     *     
     */
    public SWCBSWSYNCHRONIZEDMODEGROUPPROTOTYPE.BSWMODEGROUPREF getBSWMODEGROUPREF() {
        return bswmodegroupref;
    }

    /**
     * ??bswmodegroupref?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWCBSWSYNCHRONIZEDMODEGROUPPROTOTYPE.BSWMODEGROUPREF }
     *     
     */
    public void setBSWMODEGROUPREF(SWCBSWSYNCHRONIZEDMODEGROUPPROTOTYPE.BSWMODEGROUPREF value) {
        this.bswmodegroupref = value;
    }

    /**
     * ??swcmodegroupiref?????
     * 
     * @return
     *     possible object is
     *     {@link PMODEGROUPINATOMICSWCINSTANCEREF }
     *     
     */
    public PMODEGROUPINATOMICSWCINSTANCEREF getSWCMODEGROUPIREF() {
        return swcmodegroupiref;
    }

    /**
     * ??swcmodegroupiref?????
     * 
     * @param value
     *     allowed object is
     *     {@link PMODEGROUPINATOMICSWCINSTANCEREF }
     *     
     */
    public void setSWCMODEGROUPIREF(PMODEGROUPINATOMICSWCINSTANCEREF value) {
        this.swcmodegroupiref = value;
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
    public static class BSWMODEGROUPREF
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
