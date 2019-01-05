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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * A ModeAccessPoint is required by a RunnableEntity owned by a Mode Manager or Mode User.
 * Its semantics implies the ability to access the current mode (provided by the RTE)  of a ModeDeclarationGroupPrototype's ModeDeclarationGroup.
 * 
 * <p>MODE-ACCESS-POINT complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="MODE-ACCESS-POINT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MODE-ACCESS-POINT"/>
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
@XmlType(name = "MODE-ACCESS-POINT", propOrder = {
    "ident",
    "modegroupiref",
    "variationpoint"
})
public class MODEACCESSPOINT {

    @XmlElement(name = "IDENT")
    protected MODEACCESSPOINTIDENT ident;
    @XmlElement(name = "MODE-GROUP-IREF")
    protected MODEACCESSPOINT.MODEGROUPIREF modegroupiref;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??ident?????
     * 
     * @return
     *     possible object is
     *     {@link MODEACCESSPOINTIDENT }
     *     
     */
    public MODEACCESSPOINTIDENT getIDENT() {
        return ident;
    }

    /**
     * ??ident?????
     * 
     * @param value
     *     allowed object is
     *     {@link MODEACCESSPOINTIDENT }
     *     
     */
    public void setIDENT(MODEACCESSPOINTIDENT value) {
        this.ident = value;
    }

    /**
     * ??modegroupiref?????
     * 
     * @return
     *     possible object is
     *     {@link MODEACCESSPOINT.MODEGROUPIREF }
     *     
     */
    public MODEACCESSPOINT.MODEGROUPIREF getMODEGROUPIREF() {
        return modegroupiref;
    }

    /**
     * ??modegroupiref?????
     * 
     * @param value
     *     allowed object is
     *     {@link MODEACCESSPOINT.MODEGROUPIREF }
     *     
     */
    public void setMODEGROUPIREF(MODEACCESSPOINT.MODEGROUPIREF value) {
        this.modegroupiref = value;
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
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice minOccurs="0">
     *         &lt;element name="P-MODE-GROUP-IN-ATOMIC-SWC-INSTANCE-REF" type="{http://autosar.org/schema/r4.0}P-MODE-GROUP-IN-ATOMIC-SWC-INSTANCE-REF"/>
     *         &lt;element name="R-MODE-GROUP-IN-ATOMIC-SWC-INSTANCE-REF" type="{http://autosar.org/schema/r4.0}R-MODE-GROUP-IN-ATOMIC-SWC-INSTANCE-REF"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "pmodegroupinatomicswcinstancerefOrRMODEGROUPINATOMICSWCINSTANCEREF"
    })
    public static class MODEGROUPIREF {

        @XmlElements({
            @XmlElement(name = "P-MODE-GROUP-IN-ATOMIC-SWC-INSTANCE-REF", type = PMODEGROUPINATOMICSWCINSTANCEREF.class),
            @XmlElement(name = "R-MODE-GROUP-IN-ATOMIC-SWC-INSTANCE-REF", type = RMODEGROUPINATOMICSWCINSTANCEREF.class)
        })
        protected Object pmodegroupinatomicswcinstancerefOrRMODEGROUPINATOMICSWCINSTANCEREF;

        /**
         * ??pmodegroupinatomicswcinstancerefOrRMODEGROUPINATOMICSWCINSTANCEREF?????
         * 
         * @return
         *     possible object is
         *     {@link PMODEGROUPINATOMICSWCINSTANCEREF }
         *     {@link RMODEGROUPINATOMICSWCINSTANCEREF }
         *     
         */
        public Object getPMODEGROUPINATOMICSWCINSTANCEREFOrRMODEGROUPINATOMICSWCINSTANCEREF() {
            return pmodegroupinatomicswcinstancerefOrRMODEGROUPINATOMICSWCINSTANCEREF;
        }

        /**
         * ??pmodegroupinatomicswcinstancerefOrRMODEGROUPINATOMICSWCINSTANCEREF?????
         * 
         * @param value
         *     allowed object is
         *     {@link PMODEGROUPINATOMICSWCINSTANCEREF }
         *     {@link RMODEGROUPINATOMICSWCINSTANCEREF }
         *     
         */
        public void setPMODEGROUPINATOMICSWCINSTANCEREFOrRMODEGROUPINATOMICSWCINSTANCEREF(Object value) {
            this.pmodegroupinatomicswcinstancerefOrRMODEGROUPINATOMICSWCINSTANCEREF = value;
        }

    }

}
