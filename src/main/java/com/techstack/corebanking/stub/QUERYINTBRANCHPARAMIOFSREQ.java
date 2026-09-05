
package com.techstack.corebanking.stub;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FCUBS_HEADER" type="{http://fcubs.ofss.com/service/FCUBSACService}FCUBS_HEADERType"/>
 *         <element name="FCUBS_BODY">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Actm-Ib-Setup-IO" type="{http://fcubs.ofss.com/service/FCUBSACService}IntBranchParam-PK-Type"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fcubsheader",
    "fcubsbody"
})
@XmlRootElement(name = "QUERYINTBRANCHPARAM_IOFS_REQ")
public class QUERYINTBRANCHPARAMIOFSREQ {

    @XmlElement(name = "FCUBS_HEADER", required = true)
    protected FCUBSHEADERType fcubsheader;
    @XmlElement(name = "FCUBS_BODY", required = true)
    protected QUERYINTBRANCHPARAMIOFSREQ.FCUBSBODY fcubsbody;

    /**
     * Gets the value of the fcubsheader property.
     * 
     * @return
     *     possible object is
     *     {@link FCUBSHEADERType }
     *     
     */
    public FCUBSHEADERType getFCUBSHEADER() {
        return fcubsheader;
    }

    /**
     * Sets the value of the fcubsheader property.
     * 
     * @param value
     *     allowed object is
     *     {@link FCUBSHEADERType }
     *     
     */
    public void setFCUBSHEADER(FCUBSHEADERType value) {
        this.fcubsheader = value;
    }

    /**
     * Gets the value of the fcubsbody property.
     * 
     * @return
     *     possible object is
     *     {@link QUERYINTBRANCHPARAMIOFSREQ.FCUBSBODY }
     *     
     */
    public QUERYINTBRANCHPARAMIOFSREQ.FCUBSBODY getFCUBSBODY() {
        return fcubsbody;
    }

    /**
     * Sets the value of the fcubsbody property.
     * 
     * @param value
     *     allowed object is
     *     {@link QUERYINTBRANCHPARAMIOFSREQ.FCUBSBODY }
     *     
     */
    public void setFCUBSBODY(QUERYINTBRANCHPARAMIOFSREQ.FCUBSBODY value) {
        this.fcubsbody = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <element name="Actm-Ib-Setup-IO" type="{http://fcubs.ofss.com/service/FCUBSACService}IntBranchParam-PK-Type"/>
     *       </sequence>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "actmIbSetupIO"
    })
    public static class FCUBSBODY {

        @XmlElement(name = "Actm-Ib-Setup-IO", required = true)
        protected IntBranchParamPKType actmIbSetupIO;

        /**
         * Gets the value of the actmIbSetupIO property.
         * 
         * @return
         *     possible object is
         *     {@link IntBranchParamPKType }
         *     
         */
        public IntBranchParamPKType getActmIbSetupIO() {
            return actmIbSetupIO;
        }

        /**
         * Sets the value of the actmIbSetupIO property.
         * 
         * @param value
         *     allowed object is
         *     {@link IntBranchParamPKType }
         *     
         */
        public void setActmIbSetupIO(IntBranchParamPKType value) {
            this.actmIbSetupIO = value;
        }

    }

}
