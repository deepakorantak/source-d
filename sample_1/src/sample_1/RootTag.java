package sample_1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

/**Root
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Award">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AwardTitle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="AwardEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="AwardExpirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="AwardAmount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="AwardInstrument">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Organization">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="Directorate">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="LongName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Division">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="LongName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ProgramOfficer">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="SignBlockName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="AbstractNarration" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="MinAmdLetterDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="MaxAmdLetterDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="ARRAAmount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="AwardID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="Investigator" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="EmailAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                             &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="RoleCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Institution" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="CityName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ZipCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="StreetAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="CountryName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="StateName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="StateCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="FoaInformation" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ProgramElement" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ProgramReference" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "award"
})
@XmlRootElement(name = "rootTag")
public class RootTag {

    @XmlElement(name = "Award", required = true)
    protected RootTag.Award award;

    /**
     * Gets the value of the award property.
     * 
     * @return
     *     possible object is
     *     {@link RootTag.Award }
     *     
     */
    public RootTag.Award getAward() {
        return award;
    }

    /**
     * Sets the value of the award property.
     * 
     * @param value
     *     allowed object is
     *     {@link RootTag.Award }
     *     
     */
    public void setAward(RootTag.Award value) {
        this.award = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="AwardTitle" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="AwardEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="AwardExpirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="AwardAmount" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="AwardInstrument">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Organization">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="Directorate">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="LongName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Division">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="LongName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ProgramOfficer">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="SignBlockName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="AbstractNarration" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="MinAmdLetterDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="MaxAmdLetterDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="ARRAAmount" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="AwardID" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="Investigator" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="EmailAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                   &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="RoleCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Institution" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="CityName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ZipCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                   &lt;element name="StreetAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="CountryName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="StateName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="StateCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="FoaInformation" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ProgramElement" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ProgramReference" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "awardTitle",
        "awardEffectiveDate",
        "awardExpirationDate",
        "awardAmount",
        "awardInstrument",
        "organization",
        "programOfficer",
        "abstractNarration",
        "minAmdLetterDate",
        "maxAmdLetterDate",
        "arraAmount",
        "awardID",
        "investigator",
        "institution",
        "foaInformation",
        "programElement",
        "programReference"
    })
    public static class Award {

        @XmlElement(name = "AwardTitle", required = true)
        protected String awardTitle;
        
        @XmlElement(name = "AwardEffectiveDate", required = true)
        @XmlSchemaType(name = "string")
        protected String awardEffectiveDate;
        
        @XmlElement(name = "AwardExpirationDate", required = true)
        @XmlSchemaType(name = "string")
        protected String awardExpirationDate;
        @XmlElement(name = "AwardAmount")
        protected int awardAmount;
        @XmlElement(name = "AwardInstrument", required = true)
        protected RootTag.Award.AwardInstrument awardInstrument;
        @XmlElement(name = "Organization", required = true)
        protected RootTag.Award.Organization organization;
        
        public String getAwardEffectiveDate() {
			return awardEffectiveDate;
		}

		public void setAwardEffectiveDate(String awardEffectiveDate) {
			this.awardEffectiveDate = awardEffectiveDate;
		}


		@XmlElement(name = "ProgramOfficer", required = true)
        protected RootTag.Award.ProgramOfficer programOfficer;
        @XmlElement(name = "AbstractNarration", required = true)
        protected String abstractNarration;
        @XmlElement(name = "MinAmdLetterDate", required = true)
        @XmlSchemaType(name = "string")
        protected String minAmdLetterDate;
        @XmlElement(name = "MaxAmdLetterDate", required = true)
        @XmlSchemaType(name = "string")
        protected String maxAmdLetterDate;
        @XmlElement(name = "ARRAAmount", required = true)
        protected String arraAmount;
        @XmlElement(name = "AwardID")
        protected int awardID;
        @XmlElement(name = "Investigator", required = true)
        protected List<RootTag.Award.Investigator> investigator;
        @XmlElement(name = "Institution", required = true)
        protected List<RootTag.Award.Institution> institution;
        @XmlElement(name = "FoaInformation", required = true)
        protected List<RootTag.Award.FoaInformation> foaInformation;
        @XmlElement(name = "ProgramElement", required = true)
        protected List<RootTag.Award.ProgramElement> programElement;
        @XmlElement(name = "ProgramReference", required = true)
        protected List<RootTag.Award.ProgramReference> programReference;

        /**
         * Gets the value of the awardTitle property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwardTitle() {
            return awardTitle;
        }

        /**
         * Sets the value of the awardTitle property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwardTitle(String value) {
            this.awardTitle = value;
        }

    
        public String getAwardExpirationDate() {
            return awardExpirationDate;
        }

        /**
         * Sets the value of the awardExpirationDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwardExpirationDate(String value) {
            this.awardExpirationDate = value;
        }

        /**
         * Gets the value of the awardAmount property.
         * 
         */
        public int getAwardAmount() {
            return awardAmount;
        }

        /**
         * Sets the value of the awardAmount property.
         * 
         */
        public void setAwardAmount(int value) {
            this.awardAmount = value;
        }

        /**
         * Gets the value of the awardInstrument property.
         * 
         * @return
         *     possible object is
         *     {@link RootTag.Award.AwardInstrument }
         *     
         */
        public RootTag.Award.AwardInstrument getAwardInstrument() {
            return awardInstrument;
        }

        /**
         * Sets the value of the awardInstrument property.
         * 
         * @param value
         *     allowed object is
         *     {@link RootTag.Award.AwardInstrument }
         *     
         */
        public void setAwardInstrument(RootTag.Award.AwardInstrument value) {
            this.awardInstrument = value;
        }

        /**
         * Gets the value of the organization property.
         * 
         * @return
         *     possible object is
         *     {@link RootTag.Award.Organization }
         *     
         */
        public RootTag.Award.Organization getOrganization() {
            return organization;
        }

        /**
         * Sets the value of the organization property.
         * 
         * @param value
         *     allowed object is
         *     {@link RootTag.Award.Organization }
         *     
         */
        public void setOrganization(RootTag.Award.Organization value) {
            this.organization = value;
        }

        /**
         * Gets the value of the programOfficer property.
         * 
         * @return
         *     possible object is
         *     {@link RootTag.Award.ProgramOfficer }
         *     
         */
        public RootTag.Award.ProgramOfficer getProgramOfficer() {
            return programOfficer;
        }

        /**
         * Sets the value of the programOfficer property.
         * 
         * @param value
         *     allowed object is
         *     {@link RootTag.Award.ProgramOfficer }
         *     
         */
        public void setProgramOfficer(RootTag.Award.ProgramOfficer value) {
            this.programOfficer = value;
        }

        /**
         * Gets the value of the abstractNarration property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAbstractNarration() {
            return abstractNarration;
        }

        /**
         * Sets the value of the abstractNarration property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAbstractNarration(String value) {
            this.abstractNarration = value;
        }

        /**
         * Gets the value of the minAmdLetterDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMinAmdLetterDate() {
            return minAmdLetterDate;
        }

        /**
         * Sets the value of the minAmdLetterDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMinAmdLetterDate(String value) {
            this.minAmdLetterDate = value;
        }

        /**
         * Gets the value of the maxAmdLetterDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMaxAmdLetterDate() {
            return maxAmdLetterDate;
        }

        /**
         * Sets the value of the maxAmdLetterDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMaxAmdLetterDate(String value) {
            this.maxAmdLetterDate = value;
        }

        /**
         * Gets the value of the arraAmount property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getARRAAmount() {
            return arraAmount;
        }

        /**
         * Sets the value of the arraAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setARRAAmount(String value) {
            this.arraAmount = value;
        }

        /**
         * Gets the value of the awardID property.
         * 
         */
        public int getAwardID() {
            return awardID;
        }

        /**
         * Sets the value of the awardID property.
         * 
         */
        public void setAwardID(int value) {
            this.awardID = value;
        }

        /**
         * Gets the value of the investigator property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the investigator property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInvestigator().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RootTag.Award.Investigator }
         * 
         * 
         */
        public List<RootTag.Award.Investigator> getInvestigator() {
            if (investigator == null) {
                investigator = new ArrayList<RootTag.Award.Investigator>();
            }
            return this.investigator;
        }

        /**
         * Gets the value of the institution property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the institution property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInstitution().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RootTag.Award.Institution }
         * 
         * 
         */
        public List<RootTag.Award.Institution> getInstitution() {
            if (institution == null) {
                institution = new ArrayList<RootTag.Award.Institution>();
            }
            return this.institution;
        }

        /**
         * Gets the value of the foaInformation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the foaInformation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFoaInformation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RootTag.Award.FoaInformation }
         * 
         * 
         */
        public List<RootTag.Award.FoaInformation> getFoaInformation() {
            if (foaInformation == null) {
                foaInformation = new ArrayList<RootTag.Award.FoaInformation>();
            }
            return this.foaInformation;
        }

        /**
         * Gets the value of the programElement property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the programElement property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProgramElement().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RootTag.Award.ProgramElement }
         * 
         * 
         */
        public List<RootTag.Award.ProgramElement> getProgramElement() {
            if (programElement == null) {
                programElement = new ArrayList<RootTag.Award.ProgramElement>();
            }
            return this.programElement;
        }

        /**
         * Gets the value of the programReference property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the programReference property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProgramReference().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RootTag.Award.ProgramReference }
         * 
         * 
         */
        public List<RootTag.Award.ProgramReference> getProgramReference() {
            if (programReference == null) {
                programReference = new ArrayList<RootTag.Award.ProgramReference>();
            }
            return this.programReference;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class AwardInstrument {

            @XmlElement(name = "Value", required = true)
            protected String value;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "code",
            "name"
        })
        public static class FoaInformation {

            @XmlElement(name = "Code")
            protected int code;
            @XmlElement(name = "Name", required = true)
            protected String name;

            /**
             * Gets the value of the code property.
             * 
             */
            public int getCode() {
                return code;
            }

            /**
             * Sets the value of the code property.
             * 
             */
            public void setCode(int value) {
                this.code = value;
            }

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="CityName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="ZipCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *         &lt;element name="StreetAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="CountryName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="StateName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="StateCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "name",
            "cityName",
            "zipCode",
            "phoneNumber",
            "streetAddress",
            "countryName",
            "stateName",
            "stateCode"
        })
        public static class Institution {

            @XmlElement(name = "Name", required = true)
            protected String name;
            @XmlElement(name = "CityName", required = true)
            protected String cityName;
            @XmlElement(name = "ZipCode")
            protected int zipCode;
            @XmlElement(name = "PhoneNumber", required = true)
            protected BigDecimal phoneNumber;
            @XmlElement(name = "StreetAddress", required = true)
            protected String streetAddress;
            @XmlElement(name = "CountryName", required = true)
            protected String countryName;
            @XmlElement(name = "StateName", required = true)
            protected String stateName;
            @XmlElement(name = "StateCode", required = true)
            protected String stateCode;

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * Gets the value of the cityName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCityName() {
                return cityName;
            }

            /**
             * Sets the value of the cityName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCityName(String value) {
                this.cityName = value;
            }

            /**
             * Gets the value of the zipCode property.
             * 
             */
            public int getZipCode() {
                return zipCode;
            }

            /**
             * Sets the value of the zipCode property.
             * 
             */
            public void setZipCode(int value) {
                this.zipCode = value;
            }

            /**
             * Gets the value of the phoneNumber property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getPhoneNumber() {
                return phoneNumber;
            }

            /**
             * Sets the value of the phoneNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setPhoneNumber(BigDecimal value) {
                this.phoneNumber = value;
            }

            /**
             * Gets the value of the streetAddress property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStreetAddress() {
                return streetAddress;
            }

            /**
             * Sets the value of the streetAddress property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStreetAddress(String value) {
                this.streetAddress = value;
            }

            /**
             * Gets the value of the countryName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCountryName() {
                return countryName;
            }

            /**
             * Sets the value of the countryName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCountryName(String value) {
                this.countryName = value;
            }

            /**
             * Gets the value of the stateName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStateName() {
                return stateName;
            }

            /**
             * Sets the value of the stateName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStateName(String value) {
                this.stateName = value;
            }

            /**
             * Gets the value of the stateCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStateCode() {
                return stateCode;
            }

            /**
             * Sets the value of the stateCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStateCode(String value) {
                this.stateCode = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="EmailAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="RoleCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "firstName",
            "lastName",
            "emailAddress",
            "startDate",
            "endDate",
            "roleCode"
        })
        public static class Investigator {

            @XmlElement(name = "FirstName", required = true)
            protected String firstName;
            @XmlElement(name = "LastName", required = true)
            protected String lastName;
            @XmlElement(name = "EmailAddress", required = true)
            protected String emailAddress;
            @XmlElement(name = "StartDate", required = true)
            @XmlSchemaType(name = "string")
            protected String startDate;
            @XmlElement(name = "EndDate", required = true)
            protected String endDate;
            @XmlElement(name = "RoleCode")
            protected int roleCode;

            /**
             * Gets the value of the firstName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFirstName() {
                return firstName;
            }

            /**
             * Sets the value of the firstName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFirstName(String value) {
                this.firstName = value;
            }

            /**
             * Gets the value of the lastName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLastName() {
                return lastName;
            }

            /**
             * Sets the value of the lastName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLastName(String value) {
                this.lastName = value;
            }

            /**
             * Gets the value of the emailAddress property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEmailAddress() {
                return emailAddress;
            }

            /**
             * Sets the value of the emailAddress property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEmailAddress(String value) {
                this.emailAddress = value;
            }

            /**
             * Gets the value of the startDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStartDate() {
                return startDate;
            }

            /**
             * Sets the value of the startDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStartDate(String value) {
                this.startDate = value;
            }

            /**
             * Gets the value of the endDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEndDate() {
                return endDate;
            }

            /**
             * Sets the value of the endDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEndDate(String value) {
                this.endDate = value;
            }

            /**
             * Gets the value of the roleCode property.
             * 
             */
            public int getRoleCode() {
                return roleCode;
            }

            /**
             * Sets the value of the roleCode property.
             * 
             */
            public void setRoleCode(int value) {
                this.roleCode = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="Directorate">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="LongName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Division">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="LongName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "code",
            "directorate",
            "division"
        })
        public static class Organization {

            @XmlElement(name = "Code")
            protected int code;
            @XmlElement(name = "Directorate", required = true)
            protected RootTag.Award.Organization.Directorate directorate;
            @XmlElement(name = "Division", required = true)
            protected RootTag.Award.Organization.Division division;

            /**
             * Gets the value of the code property.
             * 
             */
            public int getCode() {
                return code;
            }

            /**
             * Sets the value of the code property.
             * 
             */
            public void setCode(int value) {
                this.code = value;
            }

            /**
             * Gets the value of the directorate property.
             * 
             * @return
             *     possible object is
             *     {@link RootTag.Award.Organization.Directorate }
             *     
             */
            public RootTag.Award.Organization.Directorate getDirectorate() {
                return directorate;
            }

            /**
             * Sets the value of the directorate property.
             * 
             * @param value
             *     allowed object is
             *     {@link RootTag.Award.Organization.Directorate }
             *     
             */
            public void setDirectorate(RootTag.Award.Organization.Directorate value) {
                this.directorate = value;
            }

            /**
             * Gets the value of the division property.
             * 
             * @return
             *     possible object is
             *     {@link RootTag.Award.Organization.Division }
             *     
             */
            public RootTag.Award.Organization.Division getDivision() {
                return division;
            }

            /**
             * Sets the value of the division property.
             * 
             * @param value
             *     allowed object is
             *     {@link RootTag.Award.Organization.Division }
             *     
             */
            public void setDivision(RootTag.Award.Organization.Division value) {
                this.division = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="LongName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "longName"
            })
            public static class Directorate {

                @XmlElement(name = "LongName", required = true)
                protected String longName;

                /**
                 * Gets the value of the longName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLongName() {
                    return longName;
                }

                /**
                 * Sets the value of the longName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLongName(String value) {
                    this.longName = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="LongName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "longName"
            })
            public static class Division {

                @XmlElement(name = "LongName", required = true)
                protected String longName;

                /**
                 * Gets the value of the longName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLongName() {
                    return longName;
                }

                /**
                 * Sets the value of the longName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLongName(String value) {
                    this.longName = value;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "code",
            "text"
        })
        public static class ProgramElement {

            @XmlElement(name = "Code")
            protected int code;
            @XmlElement(name = "Text", required = true)
            protected String text;

            /**
             * Gets the value of the code property.
             * 
             */
            public int getCode() {
                return code;
            }

            /**
             * Sets the value of the code property.
             * 
             */
            public void setCode(int value) {
                this.code = value;
            }

            /**
             * Gets the value of the text property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getText() {
                return text;
            }

            /**
             * Sets the value of the text property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setText(String value) {
                this.text = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="SignBlockName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "signBlockName"
        })
        public static class ProgramOfficer {

            @XmlElement(name = "SignBlockName", required = true)
            protected String signBlockName;

            /**
             * Gets the value of the signBlockName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSignBlockName() {
                return signBlockName;
            }

            /**
             * Sets the value of the signBlockName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSignBlockName(String value) {
                this.signBlockName = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "code",
            "text"
        })
        public static class ProgramReference {

            @XmlElement(name = "Code")
            protected int code;
            @XmlElement(name = "Text", required = true)
            protected String text;

            /**
             * Gets the value of the code property.
             * 
             */
            public int getCode() {
                return code;
            }

            /**
             * Sets the value of the code property.
             * 
             */
            public void setCode(int value) {
                this.code = value;
            }

            /**
             * Gets the value of the text property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getText() {
                return text;
            }

            /**
             * Sets the value of the text property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setText(String value) {
                this.text = value;
            }

        }

    }
}
