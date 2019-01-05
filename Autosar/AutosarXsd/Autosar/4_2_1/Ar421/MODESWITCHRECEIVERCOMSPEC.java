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
 * Communication attributes of RPortPrototypes with respect to mode communication
 * 
 * <p>MODE-SWITCH-RECEIVER-COM-SPEC complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="MODE-SWITCH-RECEIVER-COM-SPEC">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}R-PORT-COM-SPEC"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MODE-SWITCH-RECEIVER-COM-SPEC"/>
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
@XmlType(name = "MODE-SWITCH-RECEIVER-COM-SPEC", propOrder = {
    "enhancedmodeapi",
    "modegroupref",
    "supportsasynchronousmodeswitch"
})
public class MODESWITCHRECEIVERCOMSPEC {

    @XmlElement(name = "ENHANCED-MODE-API")
    protected BOOLEAN enhancedmodeapi;
    @XmlElement(name = "MODE-GROUP-REF")
    protected MODESWITCHRECEIVERCOMSPEC.MODEGROUPREF modegroupref;
    @XmlElement(name = "SUPPORTS-ASYNCHRONOUS-MODE-SWITCH")
    protected BOOLEAN supportsasynchronousmodeswitch;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??enhancedmodeapi?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getENHANCEDMODEAPI() {
        return enhancedmodeapi;
    }

    /**
     * ??enhancedmodeapi?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setENHANCEDMODEAPI(BOOLEAN value) {
        this.enhancedmodeapi = value;
    }

    /**
     * ??modegroupref?????
     * 
     * @return
     *     possible object is
     *     {@link MODESWITCHRECEIVERCOMSPEC.MODEGROUPREF }
     *     
     */
    public MODESWITCHRECEIVERCOMSPEC.MODEGROUPREF getMODEGROUPREF() {
        return modegroupref;
    }

    /**
     * ??modegroupref?????
     * 
     * @param value
     *     allowed object is
     *     {@link MODESWITCHRECEIVERCOMSPEC.MODEGROUPREF }
     *     
     */
    public void setMODEGROUPREF(MODESWITCHRECEIVERCOMSPEC.MODEGROUPREF value) {
        this.modegroupref = value;
    }

    /**
     * ??supportsasynchronousmodeswitch?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getSUPPORTSASYNCHRONOUSMODESWITCH() {
        return supportsasynchronousmodeswitch;
    }

    /**
     * ??supportsasynchronousmodeswitch?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setSUPPORTSASYNCHRONOUSMODESWITCH(BOOLEAN value) {
        this.supportsasynchronousmodeswitch = value;
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
    public static class MODEGROUPREF
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
