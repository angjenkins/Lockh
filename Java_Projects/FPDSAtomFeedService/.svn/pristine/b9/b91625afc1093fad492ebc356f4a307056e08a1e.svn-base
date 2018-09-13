
package com.fpdsng.fpds;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for ListOfAwards complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfAwards">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="count">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="total" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *                   &lt;element name="fetched" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="award" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="awardID">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="awardContractID">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="agencyID">
 *                                         &lt;complexType>
 *                                           &lt;simpleContent>
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                               &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/extension>
 *                                           &lt;/simpleContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="PIID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="modNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="transactionNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="referencedIDVID">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="agencyID">
 *                                         &lt;complexType>
 *                                           &lt;simpleContent>
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                               &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/extension>
 *                                           &lt;/simpleContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="PIID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="modNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *                   &lt;element name="relevantContractDates">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="signedDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="effectiveDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="currentCompletionDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ultimateCompletionDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="dollarValues">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="obligatedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="baseAndExercisedOptionsValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="baseAndAllOptionsValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="totalDollarValues">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="totalObligatedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="totalBaseAndExercisedOptionsValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="totalBaseAndAllOptionsValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                           &lt;/all>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="purchaserInformation">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="contractingOfficeAgencyID">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="contractingOfficeID">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="regionCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="foreignFunding">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="fundingRequestingAgencyID">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="fundingRequestingOfficeID">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/all>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="contractMarketingData">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="feePaidForUseOfService" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="contractData">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="multiYearContract">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="contractActionType">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="typeOfContractPricing">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="majorProgramCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="reasonForModification">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="nationalInterestActionCode">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="costOrPricingData">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="costAccountingStandardsClause">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="inherentlyGovernmentalFunction">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="GFE-GFP">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="seaTransportation">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="undefinitizedAction">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="consolidatedContract">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="performanceBasedServiceContract">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="contingencyHumanitarianPeacekeepingOperation">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="contractFinancing">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="purchaseCardAsPaymentMethod">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="numberOfActions" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *                             &lt;element name="solicitationID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="descriptionOfContractRequirement" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="listOfTreasuryAccounts">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;all>
 *                                       &lt;element name="treasuryAccount">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;all>
 *                                                 &lt;element name="treasuryAccountSymbol">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;all>
 *                                                           &lt;element name="agencyIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="mainAccountCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="allocationTransferAgencyIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="beginningPeriodOfAvailability" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="endingPeriodOfAvailability" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="availabilityTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="subAccountCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="subLevelPrefixCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                         &lt;/all>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="initiative" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="obligatedAmount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                               &lt;/all>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/all>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/all>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="legislativeMandates">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="ClingerCohenAct">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="WalshHealyAct">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="serviceContractAct">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="DavisBaconAct">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="interagencyContractingAuthority">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="otherStatutoryAuthority">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/all>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="productOrServiceInformation">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="productOrServiceCode">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="contractBundling">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="claimantProgramCode">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="principalNAICSCode">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="manufacturingOrganizationType">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="recoveredMaterialClauses">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="systemEquipmentCode">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="informationTechnologyCommercialItemCategory">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="useOfEPADesignatedProducts">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="countryOfOrigin">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="placeOfManufacture">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/all>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="vendor">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="vendorHeader">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="vendorName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="vendorAlternateName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="vendorLegalOrganizationName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="vendorDoingAsBusinessName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="vendorSiteDetails">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="vendorSocioEconomicIndicators">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="isEconomicallyDisadvantagedWomenOwnedSmallBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                 &lt;element name="isJointVentureEconomicallyDisadvantagedWomenOwnedSmallBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                 &lt;element name="isJointVentureWomenOwnedSmallBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                 &lt;element name="isWomenOwnedSmallBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                 &lt;element name="isAlaskanNativeOwnedCorporationOrFirm" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                 &lt;element name="isAmericanIndianOwned" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                 &lt;element name="isIndianTribe" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                 &lt;element name="isNativeHawaiianOwnedOrganizationOrFirm" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                 &lt;element name="isTriballyOwnedFirm" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                 &lt;element name="isVeteranOwned" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                 &lt;element name="isServiceRelatedDisabledVeteranOwnedBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                 &lt;element name="isWomenOwned" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                 &lt;element name="minorityOwned">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="isMinorityOwned" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                           &lt;element name="isSubContinentAsianAmericanOwnedBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                           &lt;element name="isAsianPacificAmericanOwnedBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                           &lt;element name="isBlackAmericanOwnedBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                           &lt;element name="isHispanicAmericanOwnedBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                           &lt;element name="isNativeAmericanOwnedBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                           &lt;element name="isOtherMinorityOwned" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="isVerySmallBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="vendorBusinessTypes">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="isCommunityDevelopedCorporationOwnedFirm" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                 &lt;element name="isLaborSurplusAreaFirm" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                 &lt;element name="federalGovernment">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="isFederalGovernment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                           &lt;element name="isFederallyFundedResearchAndDevelopmentCorp" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                           &lt;element name="isFederalGovernmentAgency" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="isStateGovernment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                 &lt;element name="localGovernment">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="isLocalGovernment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                           &lt;element name="isCityLocalGovernment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                           &lt;element name="isCountyLocalGovernment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                           &lt;element name="isInterMunicipalLocalGovernment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                           &lt;element name="isLocalGovernmentOwned" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                           &lt;element name="isMunicipalityLocalGovernment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                           &lt;element name="isSchoolDistrictLocalGovernment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                           &lt;element name="isTownshipLocalGovernment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="isTribalGovernment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                 &lt;element name="isForeignGovernment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                 &lt;element name="businessOrOrganizationType">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="isCorporateEntityNotTaxExempt" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                           &lt;element name="isCorporateEntityTaxExempt" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                           &lt;element name="isPartnershipOrLimitedLiabilityPartnership" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                           &lt;element name="isSolePropreitorship" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                           &lt;element name="isSmallAgriculturalCooperative" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                           &lt;element name="isInternationalOrganization" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                           &lt;element name="isUSGovernmentEntity" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="vendorLineOfBusiness">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="isCommunityDevelopmentCorporation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                 &lt;element name="isDomesticShelter" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                 &lt;element name="isEducationalInstitution" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                 &lt;element name="isFoundation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                 &lt;element name="isHospital" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                 &lt;element name="isManufacturerOfGoods" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                 &lt;element name="isVeterinaryHospital" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                 &lt;element name="isHispanicServicingInstitution" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="vendorRelationshipWithFederalGovernment">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="receivesContracts" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                 &lt;element name="receivesGrants" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                 &lt;element name="receivesContractsAndGrants" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="typeOfGovernmentEntity">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="isAirportAuthority" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                 &lt;element name="isCouncilOfGovernments" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                 &lt;element name="isHousingAuthoritiesPublicOrTribal" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                 &lt;element name="isInterstateEntity" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                 &lt;element name="isPlanningCommission" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                 &lt;element name="isPortAuthority" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                 &lt;element name="isTransitAuthority" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="vendorOrganizationFactors">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;all>
 *                                                 &lt;element name="isSubchapterSCorporation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                 &lt;element name="isLimitedLiabilityCorporation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                 &lt;element name="isForeignOwnedAndLocated" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                 &lt;element name="profitStructure">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="isForProfitOrganization" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                           &lt;element name="isNonprofitOrganization" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                           &lt;element name="isOtherNotForProfitOrganization" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="isShelteredWorkshop" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                 &lt;element name="stateOfIncorporation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="countryOfIncorporation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="organizationalType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="numberOfEmployees" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="annualRevenue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                               &lt;/all>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="typeOfEducationalEntity">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;all>
 *                                                 &lt;element name="is1862LandGrantCollege" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                 &lt;element name="is1890LandGrantCollege" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                 &lt;element name="is1994LandGrantCollege" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                 &lt;element name="isHistoricallyBlackCollegeOrUniversity" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                 &lt;element name="isMinorityInstitution" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                 &lt;element name="isPrivateUniversityOrCollege" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                 &lt;element name="isSchoolOfForestry" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                 &lt;element name="isStateControlledInstitutionofHigherLearning" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                 &lt;element name="isTribalCollege" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                 &lt;element name="isVeterinaryCollege" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                 &lt;element name="isAlaskanNativeServicingInstitution" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                 &lt;element name="isNativeHawaiianServicingInstitution" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                               &lt;/all>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="vendorCertifications">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;all>
 *                                                 &lt;element name="isDOTCertifiedDisadvantagedBusinessEnterprise" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                 &lt;element name="isSelfCertifiedSmallDisadvantagedBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                 &lt;element name="isSBACertifiedSmallDisadvantagedBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                 &lt;element name="isSBACertified8AProgramParticipant" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                 &lt;element name="isSBACertifiedHUBZone" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                 &lt;element name="isSBACertified8AJointVenture" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                               &lt;/all>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="vendorLocation">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;all>
 *                                                 &lt;element name="streetAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="streetAddress2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="streetAddress3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="state">
 *                                                   &lt;complexType>
 *                                                     &lt;simpleContent>
 *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                                         &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/extension>
 *                                                     &lt;/simpleContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="ZIPCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="countryCode">
 *                                                   &lt;complexType>
 *                                                     &lt;simpleContent>
 *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                                         &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/extension>
 *                                                     &lt;/simpleContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="phoneNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="faxNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="congressionalDistrictCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                               &lt;/all>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="vendorSiteCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="vendorAlternateSiteCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="vendorDUNSInformation">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="DUNSNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="vendorName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="parentDUNSNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="domesticParentDUNSNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="globalParentDUNSNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="parentDUNSName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="domesticParentDUNSName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="globalParentDUNSName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="divisionName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="divisionNumberOrOfficeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="ccrRegistrationDetails">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="registrationDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="renewalDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="CCRException">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>unsignedByte">
 *                                     &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="contractingOfficerBusinessSizeDetermination">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="placeOfPerformance">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="principalPlaceOfPerformance">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="locationCode">
 *                                         &lt;complexType>
 *                                           &lt;simpleContent>
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                               &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/extension>
 *                                           &lt;/simpleContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="stateCode">
 *                                         &lt;complexType>
 *                                           &lt;simpleContent>
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                               &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/extension>
 *                                           &lt;/simpleContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="countryCode">
 *                                         &lt;complexType>
 *                                           &lt;simpleContent>
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                               &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/extension>
 *                                           &lt;/simpleContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="placeOfPerformanceZIPCode">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="county" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="city" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="placeOfPerformanceCongressionalDistrict" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="competition">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="solicitationProcedures">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="typeOfSetAside">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="evaluatedPreference">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="research">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="extentCompeted">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="statutoryExceptionToFairOpportunity">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="numberOfOffersReceived" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *                             &lt;element name="commercialItemAcquisitionProcedures">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="commercialItemTestProgram">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="smallBusinessCompetitivenessDemonstrationProgram" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                             &lt;element name="A76Action">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="fedBizOpps">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="localAreaSetAside">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="priceEvaluationPercentDifference" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="synopsisWaiverException">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="reasonNotCompeted">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/all>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="preferencePrograms">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="subcontractPlan">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/all>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="transactionInformation">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="createdBy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="lastModifiedBy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="lastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="status">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/all>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/all>
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
@XmlType(name = "ListOfAwards", propOrder = {
    "count",
    "award"
})
public class ListOfAwards {

    @XmlElement(required = true)
    protected ListOfAwards.Count count;
    @XmlElement(required = true)
    protected List<ListOfAwards.Award> award;

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfAwards.Count }
     *     
     */
    public ListOfAwards.Count getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfAwards.Count }
     *     
     */
    public void setCount(ListOfAwards.Count value) {
        this.count = value;
    }

    /**
     * Gets the value of the award property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the award property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAward().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListOfAwards.Award }
     * 
     * 
     */
    public List<ListOfAwards.Award> getAward() {
        if (award == null) {
            award = new ArrayList<ListOfAwards.Award>();
        }
        return this.award;
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
     *       &lt;all>
     *         &lt;element name="awardID">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="awardContractID">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="agencyID">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                     &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="PIID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="modNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="transactionNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="referencedIDVID">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="agencyID">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                     &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="PIID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="modNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
     *         &lt;element name="relevantContractDates">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="signedDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="effectiveDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="currentCompletionDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ultimateCompletionDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="dollarValues">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="obligatedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                   &lt;element name="baseAndExercisedOptionsValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                   &lt;element name="baseAndAllOptionsValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="totalDollarValues">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="totalObligatedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                   &lt;element name="totalBaseAndExercisedOptionsValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                   &lt;element name="totalBaseAndAllOptionsValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                 &lt;/all>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="purchaserInformation">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="contractingOfficeAgencyID">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="contractingOfficeID">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="regionCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="foreignFunding">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="fundingRequestingAgencyID">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="fundingRequestingOfficeID">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/all>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="contractMarketingData">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="feePaidForUseOfService" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="contractData">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="multiYearContract">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="contractActionType">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="typeOfContractPricing">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="majorProgramCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="reasonForModification">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="nationalInterestActionCode">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="costOrPricingData">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="costAccountingStandardsClause">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="inherentlyGovernmentalFunction">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="GFE-GFP">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="seaTransportation">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="undefinitizedAction">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="consolidatedContract">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="performanceBasedServiceContract">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="contingencyHumanitarianPeacekeepingOperation">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="contractFinancing">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="purchaseCardAsPaymentMethod">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="numberOfActions" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
     *                   &lt;element name="solicitationID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="descriptionOfContractRequirement" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="listOfTreasuryAccounts">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;all>
     *                             &lt;element name="treasuryAccount">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;all>
     *                                       &lt;element name="treasuryAccountSymbol">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;all>
     *                                                 &lt;element name="agencyIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="mainAccountCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="allocationTransferAgencyIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="beginningPeriodOfAvailability" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="endingPeriodOfAvailability" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="availabilityTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="subAccountCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="subLevelPrefixCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                               &lt;/all>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="initiative" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="obligatedAmount" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                     &lt;/all>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/all>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/all>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="legislativeMandates">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="ClingerCohenAct">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="WalshHealyAct">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="serviceContractAct">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="DavisBaconAct">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="interagencyContractingAuthority">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="otherStatutoryAuthority">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/all>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="productOrServiceInformation">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="productOrServiceCode">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="contractBundling">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="claimantProgramCode">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="principalNAICSCode">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="manufacturingOrganizationType">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="recoveredMaterialClauses">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="systemEquipmentCode">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="informationTechnologyCommercialItemCategory">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="useOfEPADesignatedProducts">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="countryOfOrigin">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="placeOfManufacture">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/all>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="vendor">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="vendorHeader">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="vendorName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="vendorAlternateName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="vendorLegalOrganizationName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="vendorDoingAsBusinessName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="vendorSiteDetails">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="vendorSocioEconomicIndicators">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="isEconomicallyDisadvantagedWomenOwnedSmallBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                       &lt;element name="isJointVentureEconomicallyDisadvantagedWomenOwnedSmallBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                       &lt;element name="isJointVentureWomenOwnedSmallBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                       &lt;element name="isWomenOwnedSmallBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                       &lt;element name="isAlaskanNativeOwnedCorporationOrFirm" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                       &lt;element name="isAmericanIndianOwned" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                       &lt;element name="isIndianTribe" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                       &lt;element name="isNativeHawaiianOwnedOrganizationOrFirm" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                       &lt;element name="isTriballyOwnedFirm" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                       &lt;element name="isVeteranOwned" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                       &lt;element name="isServiceRelatedDisabledVeteranOwnedBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                       &lt;element name="isWomenOwned" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                       &lt;element name="minorityOwned">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="isMinorityOwned" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                                 &lt;element name="isSubContinentAsianAmericanOwnedBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                                 &lt;element name="isAsianPacificAmericanOwnedBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                                 &lt;element name="isBlackAmericanOwnedBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                                 &lt;element name="isHispanicAmericanOwnedBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                                 &lt;element name="isNativeAmericanOwnedBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                                 &lt;element name="isOtherMinorityOwned" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="isVerySmallBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="vendorBusinessTypes">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="isCommunityDevelopedCorporationOwnedFirm" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                       &lt;element name="isLaborSurplusAreaFirm" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                       &lt;element name="federalGovernment">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="isFederalGovernment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                                 &lt;element name="isFederallyFundedResearchAndDevelopmentCorp" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                                 &lt;element name="isFederalGovernmentAgency" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="isStateGovernment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                       &lt;element name="localGovernment">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="isLocalGovernment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                                 &lt;element name="isCityLocalGovernment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                                 &lt;element name="isCountyLocalGovernment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                                 &lt;element name="isInterMunicipalLocalGovernment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                                 &lt;element name="isLocalGovernmentOwned" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                                 &lt;element name="isMunicipalityLocalGovernment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                                 &lt;element name="isSchoolDistrictLocalGovernment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                                 &lt;element name="isTownshipLocalGovernment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="isTribalGovernment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                       &lt;element name="isForeignGovernment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                       &lt;element name="businessOrOrganizationType">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="isCorporateEntityNotTaxExempt" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                                 &lt;element name="isCorporateEntityTaxExempt" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                                 &lt;element name="isPartnershipOrLimitedLiabilityPartnership" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                                 &lt;element name="isSolePropreitorship" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                                 &lt;element name="isSmallAgriculturalCooperative" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                                 &lt;element name="isInternationalOrganization" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                                 &lt;element name="isUSGovernmentEntity" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="vendorLineOfBusiness">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="isCommunityDevelopmentCorporation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                       &lt;element name="isDomesticShelter" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                       &lt;element name="isEducationalInstitution" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                       &lt;element name="isFoundation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                       &lt;element name="isHospital" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                       &lt;element name="isManufacturerOfGoods" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                       &lt;element name="isVeterinaryHospital" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                       &lt;element name="isHispanicServicingInstitution" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="vendorRelationshipWithFederalGovernment">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="receivesContracts" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                       &lt;element name="receivesGrants" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                       &lt;element name="receivesContractsAndGrants" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="typeOfGovernmentEntity">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="isAirportAuthority" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                       &lt;element name="isCouncilOfGovernments" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                       &lt;element name="isHousingAuthoritiesPublicOrTribal" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                       &lt;element name="isInterstateEntity" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                       &lt;element name="isPlanningCommission" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                       &lt;element name="isPortAuthority" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                       &lt;element name="isTransitAuthority" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="vendorOrganizationFactors">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;all>
     *                                       &lt;element name="isSubchapterSCorporation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                       &lt;element name="isLimitedLiabilityCorporation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                       &lt;element name="isForeignOwnedAndLocated" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                       &lt;element name="profitStructure">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="isForProfitOrganization" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                                 &lt;element name="isNonprofitOrganization" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                                 &lt;element name="isOtherNotForProfitOrganization" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="isShelteredWorkshop" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                       &lt;element name="stateOfIncorporation" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="countryOfIncorporation" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="organizationalType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="numberOfEmployees" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="annualRevenue" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                     &lt;/all>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="typeOfEducationalEntity">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;all>
     *                                       &lt;element name="is1862LandGrantCollege" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                       &lt;element name="is1890LandGrantCollege" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                       &lt;element name="is1994LandGrantCollege" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                       &lt;element name="isHistoricallyBlackCollegeOrUniversity" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                       &lt;element name="isMinorityInstitution" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                       &lt;element name="isPrivateUniversityOrCollege" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                       &lt;element name="isSchoolOfForestry" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                       &lt;element name="isStateControlledInstitutionofHigherLearning" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                       &lt;element name="isTribalCollege" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                       &lt;element name="isVeterinaryCollege" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                       &lt;element name="isAlaskanNativeServicingInstitution" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                       &lt;element name="isNativeHawaiianServicingInstitution" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                     &lt;/all>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="vendorCertifications">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;all>
     *                                       &lt;element name="isDOTCertifiedDisadvantagedBusinessEnterprise" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                       &lt;element name="isSelfCertifiedSmallDisadvantagedBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                       &lt;element name="isSBACertifiedSmallDisadvantagedBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                       &lt;element name="isSBACertified8AProgramParticipant" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                       &lt;element name="isSBACertifiedHUBZone" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                       &lt;element name="isSBACertified8AJointVenture" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                     &lt;/all>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="vendorLocation">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;all>
     *                                       &lt;element name="streetAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="streetAddress2" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="streetAddress3" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="state">
     *                                         &lt;complexType>
     *                                           &lt;simpleContent>
     *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                               &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/extension>
     *                                           &lt;/simpleContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="ZIPCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="countryCode">
     *                                         &lt;complexType>
     *                                           &lt;simpleContent>
     *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                               &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/extension>
     *                                           &lt;/simpleContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="phoneNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="faxNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="congressionalDistrictCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                     &lt;/all>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="vendorSiteCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="vendorAlternateSiteCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="vendorDUNSInformation">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="DUNSNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="vendorName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="parentDUNSNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="domesticParentDUNSNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="globalParentDUNSNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="parentDUNSName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="domesticParentDUNSName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="globalParentDUNSName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="divisionName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="divisionNumberOrOfficeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="ccrRegistrationDetails">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="registrationDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="renewalDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
     *                   &lt;element name="CCRException">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>unsignedByte">
     *                           &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="contractingOfficerBusinessSizeDetermination">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="placeOfPerformance">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="principalPlaceOfPerformance">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="locationCode">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                     &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="stateCode">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                     &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="countryCode">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                     &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="placeOfPerformanceZIPCode">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="county" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="city" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="placeOfPerformanceCongressionalDistrict" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="competition">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="solicitationProcedures">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="typeOfSetAside">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="evaluatedPreference">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="research">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="extentCompeted">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="statutoryExceptionToFairOpportunity">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="numberOfOffersReceived" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
     *                   &lt;element name="commercialItemAcquisitionProcedures">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="commercialItemTestProgram">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="smallBusinessCompetitivenessDemonstrationProgram" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                   &lt;element name="A76Action">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="fedBizOpps">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="localAreaSetAside">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="priceEvaluationPercentDifference" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                   &lt;element name="synopsisWaiverException">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="reasonNotCompeted">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/all>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="preferencePrograms">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="subcontractPlan">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/all>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="transactionInformation">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="createdBy" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="lastModifiedBy" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="lastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="status">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/all>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/all>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class Award {

        @XmlElement(required = true)
        protected ListOfAwards.Award.AwardID awardID;
        @XmlElement(required = true)
        protected ListOfAwards.Award.RelevantContractDates relevantContractDates;
        @XmlElement(required = true)
        protected ListOfAwards.Award.DollarValues dollarValues;
        @XmlElement(required = true)
        protected ListOfAwards.Award.TotalDollarValues totalDollarValues;
        @XmlElement(required = true)
        protected ListOfAwards.Award.PurchaserInformation purchaserInformation;
        @XmlElement(required = true)
        protected ListOfAwards.Award.ContractMarketingData contractMarketingData;
        @XmlElement(required = true)
        protected ListOfAwards.Award.ContractData contractData;
        @XmlElement(required = true)
        protected ListOfAwards.Award.LegislativeMandates legislativeMandates;
        @XmlElement(required = true)
        protected ListOfAwards.Award.ProductOrServiceInformation productOrServiceInformation;
        @XmlElement(required = true)
        protected ListOfAwards.Award.Vendor vendor;
        @XmlElement(required = true)
        protected ListOfAwards.Award.PlaceOfPerformance placeOfPerformance;
        @XmlElement(required = true)
        protected ListOfAwards.Award.Competition competition;
        @XmlElement(required = true)
        protected ListOfAwards.Award.PreferencePrograms preferencePrograms;
        @XmlElement(required = true)
        protected ListOfAwards.Award.TransactionInformation transactionInformation;

        /**
         * Gets the value of the awardID property.
         * 
         * @return
         *     possible object is
         *     {@link ListOfAwards.Award.AwardID }
         *     
         */
        public ListOfAwards.Award.AwardID getAwardID() {
            return awardID;
        }

        /**
         * Sets the value of the awardID property.
         * 
         * @param value
         *     allowed object is
         *     {@link ListOfAwards.Award.AwardID }
         *     
         */
        public void setAwardID(ListOfAwards.Award.AwardID value) {
            this.awardID = value;
        }

        /**
         * Gets the value of the relevantContractDates property.
         * 
         * @return
         *     possible object is
         *     {@link ListOfAwards.Award.RelevantContractDates }
         *     
         */
        public ListOfAwards.Award.RelevantContractDates getRelevantContractDates() {
            return relevantContractDates;
        }

        /**
         * Sets the value of the relevantContractDates property.
         * 
         * @param value
         *     allowed object is
         *     {@link ListOfAwards.Award.RelevantContractDates }
         *     
         */
        public void setRelevantContractDates(ListOfAwards.Award.RelevantContractDates value) {
            this.relevantContractDates = value;
        }

        /**
         * Gets the value of the dollarValues property.
         * 
         * @return
         *     possible object is
         *     {@link ListOfAwards.Award.DollarValues }
         *     
         */
        public ListOfAwards.Award.DollarValues getDollarValues() {
            return dollarValues;
        }

        /**
         * Sets the value of the dollarValues property.
         * 
         * @param value
         *     allowed object is
         *     {@link ListOfAwards.Award.DollarValues }
         *     
         */
        public void setDollarValues(ListOfAwards.Award.DollarValues value) {
            this.dollarValues = value;
        }

        /**
         * Gets the value of the totalDollarValues property.
         * 
         * @return
         *     possible object is
         *     {@link ListOfAwards.Award.TotalDollarValues }
         *     
         */
        public ListOfAwards.Award.TotalDollarValues getTotalDollarValues() {
            return totalDollarValues;
        }

        /**
         * Sets the value of the totalDollarValues property.
         * 
         * @param value
         *     allowed object is
         *     {@link ListOfAwards.Award.TotalDollarValues }
         *     
         */
        public void setTotalDollarValues(ListOfAwards.Award.TotalDollarValues value) {
            this.totalDollarValues = value;
        }

        /**
         * Gets the value of the purchaserInformation property.
         * 
         * @return
         *     possible object is
         *     {@link ListOfAwards.Award.PurchaserInformation }
         *     
         */
        public ListOfAwards.Award.PurchaserInformation getPurchaserInformation() {
            return purchaserInformation;
        }

        /**
         * Sets the value of the purchaserInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link ListOfAwards.Award.PurchaserInformation }
         *     
         */
        public void setPurchaserInformation(ListOfAwards.Award.PurchaserInformation value) {
            this.purchaserInformation = value;
        }

        /**
         * Gets the value of the contractMarketingData property.
         * 
         * @return
         *     possible object is
         *     {@link ListOfAwards.Award.ContractMarketingData }
         *     
         */
        public ListOfAwards.Award.ContractMarketingData getContractMarketingData() {
            return contractMarketingData;
        }

        /**
         * Sets the value of the contractMarketingData property.
         * 
         * @param value
         *     allowed object is
         *     {@link ListOfAwards.Award.ContractMarketingData }
         *     
         */
        public void setContractMarketingData(ListOfAwards.Award.ContractMarketingData value) {
            this.contractMarketingData = value;
        }

        /**
         * Gets the value of the contractData property.
         * 
         * @return
         *     possible object is
         *     {@link ListOfAwards.Award.ContractData }
         *     
         */
        public ListOfAwards.Award.ContractData getContractData() {
            return contractData;
        }

        /**
         * Sets the value of the contractData property.
         * 
         * @param value
         *     allowed object is
         *     {@link ListOfAwards.Award.ContractData }
         *     
         */
        public void setContractData(ListOfAwards.Award.ContractData value) {
            this.contractData = value;
        }

        /**
         * Gets the value of the legislativeMandates property.
         * 
         * @return
         *     possible object is
         *     {@link ListOfAwards.Award.LegislativeMandates }
         *     
         */
        public ListOfAwards.Award.LegislativeMandates getLegislativeMandates() {
            return legislativeMandates;
        }

        /**
         * Sets the value of the legislativeMandates property.
         * 
         * @param value
         *     allowed object is
         *     {@link ListOfAwards.Award.LegislativeMandates }
         *     
         */
        public void setLegislativeMandates(ListOfAwards.Award.LegislativeMandates value) {
            this.legislativeMandates = value;
        }

        /**
         * Gets the value of the productOrServiceInformation property.
         * 
         * @return
         *     possible object is
         *     {@link ListOfAwards.Award.ProductOrServiceInformation }
         *     
         */
        public ListOfAwards.Award.ProductOrServiceInformation getProductOrServiceInformation() {
            return productOrServiceInformation;
        }

        /**
         * Sets the value of the productOrServiceInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link ListOfAwards.Award.ProductOrServiceInformation }
         *     
         */
        public void setProductOrServiceInformation(ListOfAwards.Award.ProductOrServiceInformation value) {
            this.productOrServiceInformation = value;
        }

        /**
         * Gets the value of the vendor property.
         * 
         * @return
         *     possible object is
         *     {@link ListOfAwards.Award.Vendor }
         *     
         */
        public ListOfAwards.Award.Vendor getVendor() {
            return vendor;
        }

        /**
         * Sets the value of the vendor property.
         * 
         * @param value
         *     allowed object is
         *     {@link ListOfAwards.Award.Vendor }
         *     
         */
        public void setVendor(ListOfAwards.Award.Vendor value) {
            this.vendor = value;
        }

        /**
         * Gets the value of the placeOfPerformance property.
         * 
         * @return
         *     possible object is
         *     {@link ListOfAwards.Award.PlaceOfPerformance }
         *     
         */
        public ListOfAwards.Award.PlaceOfPerformance getPlaceOfPerformance() {
            return placeOfPerformance;
        }

        /**
         * Sets the value of the placeOfPerformance property.
         * 
         * @param value
         *     allowed object is
         *     {@link ListOfAwards.Award.PlaceOfPerformance }
         *     
         */
        public void setPlaceOfPerformance(ListOfAwards.Award.PlaceOfPerformance value) {
            this.placeOfPerformance = value;
        }

        /**
         * Gets the value of the competition property.
         * 
         * @return
         *     possible object is
         *     {@link ListOfAwards.Award.Competition }
         *     
         */
        public ListOfAwards.Award.Competition getCompetition() {
            return competition;
        }

        /**
         * Sets the value of the competition property.
         * 
         * @param value
         *     allowed object is
         *     {@link ListOfAwards.Award.Competition }
         *     
         */
        public void setCompetition(ListOfAwards.Award.Competition value) {
            this.competition = value;
        }

        /**
         * Gets the value of the preferencePrograms property.
         * 
         * @return
         *     possible object is
         *     {@link ListOfAwards.Award.PreferencePrograms }
         *     
         */
        public ListOfAwards.Award.PreferencePrograms getPreferencePrograms() {
            return preferencePrograms;
        }

        /**
         * Sets the value of the preferencePrograms property.
         * 
         * @param value
         *     allowed object is
         *     {@link ListOfAwards.Award.PreferencePrograms }
         *     
         */
        public void setPreferencePrograms(ListOfAwards.Award.PreferencePrograms value) {
            this.preferencePrograms = value;
        }

        /**
         * Gets the value of the transactionInformation property.
         * 
         * @return
         *     possible object is
         *     {@link ListOfAwards.Award.TransactionInformation }
         *     
         */
        public ListOfAwards.Award.TransactionInformation getTransactionInformation() {
            return transactionInformation;
        }

        /**
         * Sets the value of the transactionInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link ListOfAwards.Award.TransactionInformation }
         *     
         */
        public void setTransactionInformation(ListOfAwards.Award.TransactionInformation value) {
            this.transactionInformation = value;
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
         *         &lt;element name="awardContractID">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="agencyID">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                           &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/extension>
         *                       &lt;/simpleContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="PIID" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="modNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="transactionNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="referencedIDVID">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="agencyID">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                           &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/extension>
         *                       &lt;/simpleContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="PIID" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="modNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "awardContractID",
            "referencedIDVID"
        })
        public static class AwardID {

            @XmlElement(required = true)
            protected ListOfAwards.Award.AwardID.AwardContractID awardContractID;
            @XmlElement(required = true)
            protected ListOfAwards.Award.AwardID.ReferencedIDVID referencedIDVID;

            /**
             * Gets the value of the awardContractID property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfAwards.Award.AwardID.AwardContractID }
             *     
             */
            public ListOfAwards.Award.AwardID.AwardContractID getAwardContractID() {
                return awardContractID;
            }

            /**
             * Sets the value of the awardContractID property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfAwards.Award.AwardID.AwardContractID }
             *     
             */
            public void setAwardContractID(ListOfAwards.Award.AwardID.AwardContractID value) {
                this.awardContractID = value;
            }

            /**
             * Gets the value of the referencedIDVID property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfAwards.Award.AwardID.ReferencedIDVID }
             *     
             */
            public ListOfAwards.Award.AwardID.ReferencedIDVID getReferencedIDVID() {
                return referencedIDVID;
            }

            /**
             * Sets the value of the referencedIDVID property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfAwards.Award.AwardID.ReferencedIDVID }
             *     
             */
            public void setReferencedIDVID(ListOfAwards.Award.AwardID.ReferencedIDVID value) {
                this.referencedIDVID = value;
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
             *         &lt;element name="agencyID">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/extension>
             *             &lt;/simpleContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="PIID" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="modNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="transactionNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "agencyID",
                "piid",
                "modNumber",
                "transactionNumber"
            })
            public static class AwardContractID {

                @XmlElement(required = true)
                protected ListOfAwards.Award.AwardID.AwardContractID.AgencyID agencyID;
                @XmlElement(name = "PIID", required = true)
                protected String piid;
                @XmlElement(required = true)
                protected String modNumber;
                @XmlElement(required = true)
                protected String transactionNumber;

                /**
                 * Gets the value of the agencyID property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ListOfAwards.Award.AwardID.AwardContractID.AgencyID }
                 *     
                 */
                public ListOfAwards.Award.AwardID.AwardContractID.AgencyID getAgencyID() {
                    return agencyID;
                }

                /**
                 * Sets the value of the agencyID property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ListOfAwards.Award.AwardID.AwardContractID.AgencyID }
                 *     
                 */
                public void setAgencyID(ListOfAwards.Award.AwardID.AwardContractID.AgencyID value) {
                    this.agencyID = value;
                }

                /**
                 * Gets the value of the piid property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPIID() {
                    return piid;
                }

                /**
                 * Sets the value of the piid property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPIID(String value) {
                    this.piid = value;
                }

                /**
                 * Gets the value of the modNumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getModNumber() {
                    return modNumber;
                }

                /**
                 * Sets the value of the modNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setModNumber(String value) {
                    this.modNumber = value;
                }

                /**
                 * Gets the value of the transactionNumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTransactionNumber() {
                    return transactionNumber;
                }

                /**
                 * Sets the value of the transactionNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTransactionNumber(String value) {
                    this.transactionNumber = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;simpleContent>
                 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/extension>
                 *   &lt;/simpleContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "value"
                })
                public static class AgencyID {

                    @XmlValue
                    protected String value;
                    @XmlAttribute(required = true)
                    protected String name;

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
             *         &lt;element name="agencyID">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/extension>
             *             &lt;/simpleContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="PIID" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="modNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "agencyID",
                "piid",
                "modNumber"
            })
            public static class ReferencedIDVID {

                @XmlElement(required = true)
                protected ListOfAwards.Award.AwardID.ReferencedIDVID.AgencyID agencyID;
                @XmlElement(name = "PIID", required = true)
                protected String piid;
                @XmlElement(required = true)
                protected String modNumber;

                /**
                 * Gets the value of the agencyID property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ListOfAwards.Award.AwardID.ReferencedIDVID.AgencyID }
                 *     
                 */
                public ListOfAwards.Award.AwardID.ReferencedIDVID.AgencyID getAgencyID() {
                    return agencyID;
                }

                /**
                 * Sets the value of the agencyID property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ListOfAwards.Award.AwardID.ReferencedIDVID.AgencyID }
                 *     
                 */
                public void setAgencyID(ListOfAwards.Award.AwardID.ReferencedIDVID.AgencyID value) {
                    this.agencyID = value;
                }

                /**
                 * Gets the value of the piid property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPIID() {
                    return piid;
                }

                /**
                 * Sets the value of the piid property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPIID(String value) {
                    this.piid = value;
                }

                /**
                 * Gets the value of the modNumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getModNumber() {
                    return modNumber;
                }

                /**
                 * Sets the value of the modNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setModNumber(String value) {
                    this.modNumber = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;simpleContent>
                 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/extension>
                 *   &lt;/simpleContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "value"
                })
                public static class AgencyID {

                    @XmlValue
                    protected String value;
                    @XmlAttribute(required = true)
                    protected String name;

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
         *       &lt;all>
         *         &lt;element name="solicitationProcedures">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="typeOfSetAside">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="evaluatedPreference">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="research">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="extentCompeted">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="statutoryExceptionToFairOpportunity">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="numberOfOffersReceived" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
         *         &lt;element name="commercialItemAcquisitionProcedures">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="commercialItemTestProgram">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="smallBusinessCompetitivenessDemonstrationProgram" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *         &lt;element name="A76Action">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="fedBizOpps">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="localAreaSetAside">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="priceEvaluationPercentDifference" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *         &lt;element name="synopsisWaiverException">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="reasonNotCompeted">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/all>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class Competition {

            @XmlElement(required = true)
            protected ListOfAwards.Award.Competition.SolicitationProcedures solicitationProcedures;
            @XmlElement(required = true)
            protected ListOfAwards.Award.Competition.TypeOfSetAside typeOfSetAside;
            @XmlElement(required = true)
            protected ListOfAwards.Award.Competition.EvaluatedPreference evaluatedPreference;
            @XmlElement(required = true)
            protected ListOfAwards.Award.Competition.Research research;
            @XmlElement(required = true)
            protected ListOfAwards.Award.Competition.ExtentCompeted extentCompeted;
            @XmlElement(required = true)
            protected ListOfAwards.Award.Competition.StatutoryExceptionToFairOpportunity statutoryExceptionToFairOpportunity;
            @XmlSchemaType(name = "unsignedByte")
            protected short numberOfOffersReceived;
            @XmlElement(required = true)
            protected ListOfAwards.Award.Competition.CommercialItemAcquisitionProcedures commercialItemAcquisitionProcedures;
            @XmlElement(required = true)
            protected ListOfAwards.Award.Competition.CommercialItemTestProgram commercialItemTestProgram;
            protected boolean smallBusinessCompetitivenessDemonstrationProgram;
            @XmlElement(name = "A76Action", required = true)
            protected ListOfAwards.Award.Competition.A76Action a76Action;
            @XmlElement(required = true)
            protected ListOfAwards.Award.Competition.FedBizOpps fedBizOpps;
            @XmlElement(required = true)
            protected ListOfAwards.Award.Competition.LocalAreaSetAside localAreaSetAside;
            @XmlElement(required = true)
            protected BigDecimal priceEvaluationPercentDifference;
            @XmlElement(required = true)
            protected ListOfAwards.Award.Competition.SynopsisWaiverException synopsisWaiverException;
            @XmlElement(required = true)
            protected ListOfAwards.Award.Competition.ReasonNotCompeted reasonNotCompeted;

            /**
             * Gets the value of the solicitationProcedures property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfAwards.Award.Competition.SolicitationProcedures }
             *     
             */
            public ListOfAwards.Award.Competition.SolicitationProcedures getSolicitationProcedures() {
                return solicitationProcedures;
            }

            /**
             * Sets the value of the solicitationProcedures property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfAwards.Award.Competition.SolicitationProcedures }
             *     
             */
            public void setSolicitationProcedures(ListOfAwards.Award.Competition.SolicitationProcedures value) {
                this.solicitationProcedures = value;
            }

            /**
             * Gets the value of the typeOfSetAside property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfAwards.Award.Competition.TypeOfSetAside }
             *     
             */
            public ListOfAwards.Award.Competition.TypeOfSetAside getTypeOfSetAside() {
                return typeOfSetAside;
            }

            /**
             * Sets the value of the typeOfSetAside property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfAwards.Award.Competition.TypeOfSetAside }
             *     
             */
            public void setTypeOfSetAside(ListOfAwards.Award.Competition.TypeOfSetAside value) {
                this.typeOfSetAside = value;
            }

            /**
             * Gets the value of the evaluatedPreference property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfAwards.Award.Competition.EvaluatedPreference }
             *     
             */
            public ListOfAwards.Award.Competition.EvaluatedPreference getEvaluatedPreference() {
                return evaluatedPreference;
            }

            /**
             * Sets the value of the evaluatedPreference property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfAwards.Award.Competition.EvaluatedPreference }
             *     
             */
            public void setEvaluatedPreference(ListOfAwards.Award.Competition.EvaluatedPreference value) {
                this.evaluatedPreference = value;
            }

            /**
             * Gets the value of the research property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfAwards.Award.Competition.Research }
             *     
             */
            public ListOfAwards.Award.Competition.Research getResearch() {
                return research;
            }

            /**
             * Sets the value of the research property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfAwards.Award.Competition.Research }
             *     
             */
            public void setResearch(ListOfAwards.Award.Competition.Research value) {
                this.research = value;
            }

            /**
             * Gets the value of the extentCompeted property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfAwards.Award.Competition.ExtentCompeted }
             *     
             */
            public ListOfAwards.Award.Competition.ExtentCompeted getExtentCompeted() {
                return extentCompeted;
            }

            /**
             * Sets the value of the extentCompeted property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfAwards.Award.Competition.ExtentCompeted }
             *     
             */
            public void setExtentCompeted(ListOfAwards.Award.Competition.ExtentCompeted value) {
                this.extentCompeted = value;
            }

            /**
             * Gets the value of the statutoryExceptionToFairOpportunity property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfAwards.Award.Competition.StatutoryExceptionToFairOpportunity }
             *     
             */
            public ListOfAwards.Award.Competition.StatutoryExceptionToFairOpportunity getStatutoryExceptionToFairOpportunity() {
                return statutoryExceptionToFairOpportunity;
            }

            /**
             * Sets the value of the statutoryExceptionToFairOpportunity property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfAwards.Award.Competition.StatutoryExceptionToFairOpportunity }
             *     
             */
            public void setStatutoryExceptionToFairOpportunity(ListOfAwards.Award.Competition.StatutoryExceptionToFairOpportunity value) {
                this.statutoryExceptionToFairOpportunity = value;
            }

            /**
             * Gets the value of the numberOfOffersReceived property.
             * 
             */
            public short getNumberOfOffersReceived() {
                return numberOfOffersReceived;
            }

            /**
             * Sets the value of the numberOfOffersReceived property.
             * 
             */
            public void setNumberOfOffersReceived(short value) {
                this.numberOfOffersReceived = value;
            }

            /**
             * Gets the value of the commercialItemAcquisitionProcedures property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfAwards.Award.Competition.CommercialItemAcquisitionProcedures }
             *     
             */
            public ListOfAwards.Award.Competition.CommercialItemAcquisitionProcedures getCommercialItemAcquisitionProcedures() {
                return commercialItemAcquisitionProcedures;
            }

            /**
             * Sets the value of the commercialItemAcquisitionProcedures property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfAwards.Award.Competition.CommercialItemAcquisitionProcedures }
             *     
             */
            public void setCommercialItemAcquisitionProcedures(ListOfAwards.Award.Competition.CommercialItemAcquisitionProcedures value) {
                this.commercialItemAcquisitionProcedures = value;
            }

            /**
             * Gets the value of the commercialItemTestProgram property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfAwards.Award.Competition.CommercialItemTestProgram }
             *     
             */
            public ListOfAwards.Award.Competition.CommercialItemTestProgram getCommercialItemTestProgram() {
                return commercialItemTestProgram;
            }

            /**
             * Sets the value of the commercialItemTestProgram property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfAwards.Award.Competition.CommercialItemTestProgram }
             *     
             */
            public void setCommercialItemTestProgram(ListOfAwards.Award.Competition.CommercialItemTestProgram value) {
                this.commercialItemTestProgram = value;
            }

            /**
             * Gets the value of the smallBusinessCompetitivenessDemonstrationProgram property.
             * 
             */
            public boolean isSmallBusinessCompetitivenessDemonstrationProgram() {
                return smallBusinessCompetitivenessDemonstrationProgram;
            }

            /**
             * Sets the value of the smallBusinessCompetitivenessDemonstrationProgram property.
             * 
             */
            public void setSmallBusinessCompetitivenessDemonstrationProgram(boolean value) {
                this.smallBusinessCompetitivenessDemonstrationProgram = value;
            }

            /**
             * Gets the value of the a76Action property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfAwards.Award.Competition.A76Action }
             *     
             */
            public ListOfAwards.Award.Competition.A76Action getA76Action() {
                return a76Action;
            }

            /**
             * Sets the value of the a76Action property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfAwards.Award.Competition.A76Action }
             *     
             */
            public void setA76Action(ListOfAwards.Award.Competition.A76Action value) {
                this.a76Action = value;
            }

            /**
             * Gets the value of the fedBizOpps property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfAwards.Award.Competition.FedBizOpps }
             *     
             */
            public ListOfAwards.Award.Competition.FedBizOpps getFedBizOpps() {
                return fedBizOpps;
            }

            /**
             * Sets the value of the fedBizOpps property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfAwards.Award.Competition.FedBizOpps }
             *     
             */
            public void setFedBizOpps(ListOfAwards.Award.Competition.FedBizOpps value) {
                this.fedBizOpps = value;
            }

            /**
             * Gets the value of the localAreaSetAside property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfAwards.Award.Competition.LocalAreaSetAside }
             *     
             */
            public ListOfAwards.Award.Competition.LocalAreaSetAside getLocalAreaSetAside() {
                return localAreaSetAside;
            }

            /**
             * Sets the value of the localAreaSetAside property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfAwards.Award.Competition.LocalAreaSetAside }
             *     
             */
            public void setLocalAreaSetAside(ListOfAwards.Award.Competition.LocalAreaSetAside value) {
                this.localAreaSetAside = value;
            }

            /**
             * Gets the value of the priceEvaluationPercentDifference property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getPriceEvaluationPercentDifference() {
                return priceEvaluationPercentDifference;
            }

            /**
             * Sets the value of the priceEvaluationPercentDifference property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setPriceEvaluationPercentDifference(BigDecimal value) {
                this.priceEvaluationPercentDifference = value;
            }

            /**
             * Gets the value of the synopsisWaiverException property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfAwards.Award.Competition.SynopsisWaiverException }
             *     
             */
            public ListOfAwards.Award.Competition.SynopsisWaiverException getSynopsisWaiverException() {
                return synopsisWaiverException;
            }

            /**
             * Sets the value of the synopsisWaiverException property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfAwards.Award.Competition.SynopsisWaiverException }
             *     
             */
            public void setSynopsisWaiverException(ListOfAwards.Award.Competition.SynopsisWaiverException value) {
                this.synopsisWaiverException = value;
            }

            /**
             * Gets the value of the reasonNotCompeted property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfAwards.Award.Competition.ReasonNotCompeted }
             *     
             */
            public ListOfAwards.Award.Competition.ReasonNotCompeted getReasonNotCompeted() {
                return reasonNotCompeted;
            }

            /**
             * Sets the value of the reasonNotCompeted property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfAwards.Award.Competition.ReasonNotCompeted }
             *     
             */
            public void setReasonNotCompeted(ListOfAwards.Award.Competition.ReasonNotCompeted value) {
                this.reasonNotCompeted = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class A76Action {

                @XmlValue
                protected String value;
                @XmlAttribute(required = true)
                protected String description;

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

                /**
                 * Gets the value of the description property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDescription() {
                    return description;
                }

                /**
                 * Sets the value of the description property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDescription(String value) {
                    this.description = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class CommercialItemAcquisitionProcedures {

                @XmlValue
                protected String value;
                @XmlAttribute(required = true)
                protected String description;

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

                /**
                 * Gets the value of the description property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDescription() {
                    return description;
                }

                /**
                 * Sets the value of the description property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDescription(String value) {
                    this.description = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class CommercialItemTestProgram {

                @XmlValue
                protected String value;
                @XmlAttribute(required = true)
                protected String description;

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

                /**
                 * Gets the value of the description property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDescription() {
                    return description;
                }

                /**
                 * Sets the value of the description property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDescription(String value) {
                    this.description = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class EvaluatedPreference {

                @XmlValue
                protected String value;
                @XmlAttribute(required = true)
                protected String description;

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

                /**
                 * Gets the value of the description property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDescription() {
                    return description;
                }

                /**
                 * Sets the value of the description property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDescription(String value) {
                    this.description = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class ExtentCompeted {

                @XmlValue
                protected String value;
                @XmlAttribute(required = true)
                protected String description;

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

                /**
                 * Gets the value of the description property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDescription() {
                    return description;
                }

                /**
                 * Sets the value of the description property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDescription(String value) {
                    this.description = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class FedBizOpps {

                @XmlValue
                protected String value;
                @XmlAttribute(required = true)
                protected String description;

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

                /**
                 * Gets the value of the description property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDescription() {
                    return description;
                }

                /**
                 * Sets the value of the description property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDescription(String value) {
                    this.description = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class LocalAreaSetAside {

                @XmlValue
                protected String value;
                @XmlAttribute(required = true)
                protected String description;

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

                /**
                 * Gets the value of the description property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDescription() {
                    return description;
                }

                /**
                 * Sets the value of the description property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDescription(String value) {
                    this.description = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class ReasonNotCompeted {

                @XmlValue
                protected String value;
                @XmlAttribute(required = true)
                protected String description;

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

                /**
                 * Gets the value of the description property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDescription() {
                    return description;
                }

                /**
                 * Sets the value of the description property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDescription(String value) {
                    this.description = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class Research {

                @XmlValue
                protected String value;
                @XmlAttribute(required = true)
                protected String description;

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

                /**
                 * Gets the value of the description property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDescription() {
                    return description;
                }

                /**
                 * Sets the value of the description property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDescription(String value) {
                    this.description = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class SolicitationProcedures {

                @XmlValue
                protected String value;
                @XmlAttribute(required = true)
                protected String description;

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

                /**
                 * Gets the value of the description property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDescription() {
                    return description;
                }

                /**
                 * Sets the value of the description property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDescription(String value) {
                    this.description = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class StatutoryExceptionToFairOpportunity {

                @XmlValue
                protected String value;
                @XmlAttribute(required = true)
                protected String description;

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

                /**
                 * Gets the value of the description property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDescription() {
                    return description;
                }

                /**
                 * Sets the value of the description property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDescription(String value) {
                    this.description = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class SynopsisWaiverException {

                @XmlValue
                protected String value;
                @XmlAttribute(required = true)
                protected String description;

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

                /**
                 * Gets the value of the description property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDescription() {
                    return description;
                }

                /**
                 * Sets the value of the description property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDescription(String value) {
                    this.description = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class TypeOfSetAside {

                @XmlValue
                protected String value;
                @XmlAttribute(required = true)
                protected String description;

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

                /**
                 * Gets the value of the description property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDescription() {
                    return description;
                }

                /**
                 * Sets the value of the description property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDescription(String value) {
                    this.description = value;
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
         *       &lt;all>
         *         &lt;element name="multiYearContract">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="contractActionType">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="typeOfContractPricing">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="majorProgramCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="reasonForModification">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="nationalInterestActionCode">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="costOrPricingData">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="costAccountingStandardsClause">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="inherentlyGovernmentalFunction">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="GFE-GFP">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="seaTransportation">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="undefinitizedAction">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="consolidatedContract">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="performanceBasedServiceContract">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="contingencyHumanitarianPeacekeepingOperation">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="contractFinancing">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="purchaseCardAsPaymentMethod">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="numberOfActions" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
         *         &lt;element name="solicitationID" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="descriptionOfContractRequirement" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="listOfTreasuryAccounts">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;all>
         *                   &lt;element name="treasuryAccount">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;all>
         *                             &lt;element name="treasuryAccountSymbol">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;all>
         *                                       &lt;element name="agencyIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="mainAccountCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="allocationTransferAgencyIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="beginningPeriodOfAvailability" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="endingPeriodOfAvailability" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="availabilityTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="subAccountCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="subLevelPrefixCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                     &lt;/all>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="initiative" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="obligatedAmount" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                           &lt;/all>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/all>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/all>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class ContractData {

            @XmlElement(required = true)
            protected ListOfAwards.Award.ContractData.MultiYearContract multiYearContract;
            @XmlElement(required = true)
            protected ListOfAwards.Award.ContractData.ContractActionType contractActionType;
            @XmlElement(required = true)
            protected ListOfAwards.Award.ContractData.TypeOfContractPricing typeOfContractPricing;
            @XmlElement(required = true)
            protected String majorProgramCode;
            @XmlElement(required = true)
            protected ListOfAwards.Award.ContractData.ReasonForModification reasonForModification;
            @XmlElement(required = true)
            protected ListOfAwards.Award.ContractData.NationalInterestActionCode nationalInterestActionCode;
            @XmlElement(required = true)
            protected ListOfAwards.Award.ContractData.CostOrPricingData costOrPricingData;
            @XmlElement(required = true)
            protected ListOfAwards.Award.ContractData.CostAccountingStandardsClause costAccountingStandardsClause;
            @XmlElement(required = true)
            protected ListOfAwards.Award.ContractData.InherentlyGovernmentalFunction inherentlyGovernmentalFunction;
            @XmlElement(name = "GFE-GFP", required = true)
            protected ListOfAwards.Award.ContractData.GFEGFP gfegfp;
            @XmlElement(required = true)
            protected ListOfAwards.Award.ContractData.SeaTransportation seaTransportation;
            @XmlElement(required = true)
            protected ListOfAwards.Award.ContractData.UndefinitizedAction undefinitizedAction;
            @XmlElement(required = true)
            protected ListOfAwards.Award.ContractData.ConsolidatedContract consolidatedContract;
            @XmlElement(required = true)
            protected ListOfAwards.Award.ContractData.PerformanceBasedServiceContract performanceBasedServiceContract;
            @XmlElement(required = true)
            protected ListOfAwards.Award.ContractData.ContingencyHumanitarianPeacekeepingOperation contingencyHumanitarianPeacekeepingOperation;
            @XmlElement(required = true)
            protected ListOfAwards.Award.ContractData.ContractFinancing contractFinancing;
            @XmlElement(required = true)
            protected ListOfAwards.Award.ContractData.PurchaseCardAsPaymentMethod purchaseCardAsPaymentMethod;
            @XmlSchemaType(name = "unsignedByte")
            protected short numberOfActions;
            @XmlElement(required = true)
            protected String solicitationID;
            @XmlElement(required = true)
            protected String descriptionOfContractRequirement;
            @XmlElement(required = true)
            protected ListOfAwards.Award.ContractData.ListOfTreasuryAccounts listOfTreasuryAccounts;

            /**
             * Gets the value of the multiYearContract property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfAwards.Award.ContractData.MultiYearContract }
             *     
             */
            public ListOfAwards.Award.ContractData.MultiYearContract getMultiYearContract() {
                return multiYearContract;
            }

            /**
             * Sets the value of the multiYearContract property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfAwards.Award.ContractData.MultiYearContract }
             *     
             */
            public void setMultiYearContract(ListOfAwards.Award.ContractData.MultiYearContract value) {
                this.multiYearContract = value;
            }

            /**
             * Gets the value of the contractActionType property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfAwards.Award.ContractData.ContractActionType }
             *     
             */
            public ListOfAwards.Award.ContractData.ContractActionType getContractActionType() {
                return contractActionType;
            }

            /**
             * Sets the value of the contractActionType property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfAwards.Award.ContractData.ContractActionType }
             *     
             */
            public void setContractActionType(ListOfAwards.Award.ContractData.ContractActionType value) {
                this.contractActionType = value;
            }

            /**
             * Gets the value of the typeOfContractPricing property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfAwards.Award.ContractData.TypeOfContractPricing }
             *     
             */
            public ListOfAwards.Award.ContractData.TypeOfContractPricing getTypeOfContractPricing() {
                return typeOfContractPricing;
            }

            /**
             * Sets the value of the typeOfContractPricing property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfAwards.Award.ContractData.TypeOfContractPricing }
             *     
             */
            public void setTypeOfContractPricing(ListOfAwards.Award.ContractData.TypeOfContractPricing value) {
                this.typeOfContractPricing = value;
            }

            /**
             * Gets the value of the majorProgramCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMajorProgramCode() {
                return majorProgramCode;
            }

            /**
             * Sets the value of the majorProgramCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMajorProgramCode(String value) {
                this.majorProgramCode = value;
            }

            /**
             * Gets the value of the reasonForModification property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfAwards.Award.ContractData.ReasonForModification }
             *     
             */
            public ListOfAwards.Award.ContractData.ReasonForModification getReasonForModification() {
                return reasonForModification;
            }

            /**
             * Sets the value of the reasonForModification property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfAwards.Award.ContractData.ReasonForModification }
             *     
             */
            public void setReasonForModification(ListOfAwards.Award.ContractData.ReasonForModification value) {
                this.reasonForModification = value;
            }

            /**
             * Gets the value of the nationalInterestActionCode property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfAwards.Award.ContractData.NationalInterestActionCode }
             *     
             */
            public ListOfAwards.Award.ContractData.NationalInterestActionCode getNationalInterestActionCode() {
                return nationalInterestActionCode;
            }

            /**
             * Sets the value of the nationalInterestActionCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfAwards.Award.ContractData.NationalInterestActionCode }
             *     
             */
            public void setNationalInterestActionCode(ListOfAwards.Award.ContractData.NationalInterestActionCode value) {
                this.nationalInterestActionCode = value;
            }

            /**
             * Gets the value of the costOrPricingData property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfAwards.Award.ContractData.CostOrPricingData }
             *     
             */
            public ListOfAwards.Award.ContractData.CostOrPricingData getCostOrPricingData() {
                return costOrPricingData;
            }

            /**
             * Sets the value of the costOrPricingData property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfAwards.Award.ContractData.CostOrPricingData }
             *     
             */
            public void setCostOrPricingData(ListOfAwards.Award.ContractData.CostOrPricingData value) {
                this.costOrPricingData = value;
            }

            /**
             * Gets the value of the costAccountingStandardsClause property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfAwards.Award.ContractData.CostAccountingStandardsClause }
             *     
             */
            public ListOfAwards.Award.ContractData.CostAccountingStandardsClause getCostAccountingStandardsClause() {
                return costAccountingStandardsClause;
            }

            /**
             * Sets the value of the costAccountingStandardsClause property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfAwards.Award.ContractData.CostAccountingStandardsClause }
             *     
             */
            public void setCostAccountingStandardsClause(ListOfAwards.Award.ContractData.CostAccountingStandardsClause value) {
                this.costAccountingStandardsClause = value;
            }

            /**
             * Gets the value of the inherentlyGovernmentalFunction property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfAwards.Award.ContractData.InherentlyGovernmentalFunction }
             *     
             */
            public ListOfAwards.Award.ContractData.InherentlyGovernmentalFunction getInherentlyGovernmentalFunction() {
                return inherentlyGovernmentalFunction;
            }

            /**
             * Sets the value of the inherentlyGovernmentalFunction property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfAwards.Award.ContractData.InherentlyGovernmentalFunction }
             *     
             */
            public void setInherentlyGovernmentalFunction(ListOfAwards.Award.ContractData.InherentlyGovernmentalFunction value) {
                this.inherentlyGovernmentalFunction = value;
            }

            /**
             * Gets the value of the gfegfp property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfAwards.Award.ContractData.GFEGFP }
             *     
             */
            public ListOfAwards.Award.ContractData.GFEGFP getGFEGFP() {
                return gfegfp;
            }

            /**
             * Sets the value of the gfegfp property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfAwards.Award.ContractData.GFEGFP }
             *     
             */
            public void setGFEGFP(ListOfAwards.Award.ContractData.GFEGFP value) {
                this.gfegfp = value;
            }

            /**
             * Gets the value of the seaTransportation property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfAwards.Award.ContractData.SeaTransportation }
             *     
             */
            public ListOfAwards.Award.ContractData.SeaTransportation getSeaTransportation() {
                return seaTransportation;
            }

            /**
             * Sets the value of the seaTransportation property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfAwards.Award.ContractData.SeaTransportation }
             *     
             */
            public void setSeaTransportation(ListOfAwards.Award.ContractData.SeaTransportation value) {
                this.seaTransportation = value;
            }

            /**
             * Gets the value of the undefinitizedAction property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfAwards.Award.ContractData.UndefinitizedAction }
             *     
             */
            public ListOfAwards.Award.ContractData.UndefinitizedAction getUndefinitizedAction() {
                return undefinitizedAction;
            }

            /**
             * Sets the value of the undefinitizedAction property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfAwards.Award.ContractData.UndefinitizedAction }
             *     
             */
            public void setUndefinitizedAction(ListOfAwards.Award.ContractData.UndefinitizedAction value) {
                this.undefinitizedAction = value;
            }

            /**
             * Gets the value of the consolidatedContract property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfAwards.Award.ContractData.ConsolidatedContract }
             *     
             */
            public ListOfAwards.Award.ContractData.ConsolidatedContract getConsolidatedContract() {
                return consolidatedContract;
            }

            /**
             * Sets the value of the consolidatedContract property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfAwards.Award.ContractData.ConsolidatedContract }
             *     
             */
            public void setConsolidatedContract(ListOfAwards.Award.ContractData.ConsolidatedContract value) {
                this.consolidatedContract = value;
            }

            /**
             * Gets the value of the performanceBasedServiceContract property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfAwards.Award.ContractData.PerformanceBasedServiceContract }
             *     
             */
            public ListOfAwards.Award.ContractData.PerformanceBasedServiceContract getPerformanceBasedServiceContract() {
                return performanceBasedServiceContract;
            }

            /**
             * Sets the value of the performanceBasedServiceContract property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfAwards.Award.ContractData.PerformanceBasedServiceContract }
             *     
             */
            public void setPerformanceBasedServiceContract(ListOfAwards.Award.ContractData.PerformanceBasedServiceContract value) {
                this.performanceBasedServiceContract = value;
            }

            /**
             * Gets the value of the contingencyHumanitarianPeacekeepingOperation property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfAwards.Award.ContractData.ContingencyHumanitarianPeacekeepingOperation }
             *     
             */
            public ListOfAwards.Award.ContractData.ContingencyHumanitarianPeacekeepingOperation getContingencyHumanitarianPeacekeepingOperation() {
                return contingencyHumanitarianPeacekeepingOperation;
            }

            /**
             * Sets the value of the contingencyHumanitarianPeacekeepingOperation property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfAwards.Award.ContractData.ContingencyHumanitarianPeacekeepingOperation }
             *     
             */
            public void setContingencyHumanitarianPeacekeepingOperation(ListOfAwards.Award.ContractData.ContingencyHumanitarianPeacekeepingOperation value) {
                this.contingencyHumanitarianPeacekeepingOperation = value;
            }

            /**
             * Gets the value of the contractFinancing property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfAwards.Award.ContractData.ContractFinancing }
             *     
             */
            public ListOfAwards.Award.ContractData.ContractFinancing getContractFinancing() {
                return contractFinancing;
            }

            /**
             * Sets the value of the contractFinancing property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfAwards.Award.ContractData.ContractFinancing }
             *     
             */
            public void setContractFinancing(ListOfAwards.Award.ContractData.ContractFinancing value) {
                this.contractFinancing = value;
            }

            /**
             * Gets the value of the purchaseCardAsPaymentMethod property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfAwards.Award.ContractData.PurchaseCardAsPaymentMethod }
             *     
             */
            public ListOfAwards.Award.ContractData.PurchaseCardAsPaymentMethod getPurchaseCardAsPaymentMethod() {
                return purchaseCardAsPaymentMethod;
            }

            /**
             * Sets the value of the purchaseCardAsPaymentMethod property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfAwards.Award.ContractData.PurchaseCardAsPaymentMethod }
             *     
             */
            public void setPurchaseCardAsPaymentMethod(ListOfAwards.Award.ContractData.PurchaseCardAsPaymentMethod value) {
                this.purchaseCardAsPaymentMethod = value;
            }

            /**
             * Gets the value of the numberOfActions property.
             * 
             */
            public short getNumberOfActions() {
                return numberOfActions;
            }

            /**
             * Sets the value of the numberOfActions property.
             * 
             */
            public void setNumberOfActions(short value) {
                this.numberOfActions = value;
            }

            /**
             * Gets the value of the solicitationID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSolicitationID() {
                return solicitationID;
            }

            /**
             * Sets the value of the solicitationID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSolicitationID(String value) {
                this.solicitationID = value;
            }

            /**
             * Gets the value of the descriptionOfContractRequirement property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescriptionOfContractRequirement() {
                return descriptionOfContractRequirement;
            }

            /**
             * Sets the value of the descriptionOfContractRequirement property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDescriptionOfContractRequirement(String value) {
                this.descriptionOfContractRequirement = value;
            }

            /**
             * Gets the value of the listOfTreasuryAccounts property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfAwards.Award.ContractData.ListOfTreasuryAccounts }
             *     
             */
            public ListOfAwards.Award.ContractData.ListOfTreasuryAccounts getListOfTreasuryAccounts() {
                return listOfTreasuryAccounts;
            }

            /**
             * Sets the value of the listOfTreasuryAccounts property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfAwards.Award.ContractData.ListOfTreasuryAccounts }
             *     
             */
            public void setListOfTreasuryAccounts(ListOfAwards.Award.ContractData.ListOfTreasuryAccounts value) {
                this.listOfTreasuryAccounts = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class ConsolidatedContract {

                @XmlValue
                protected String value;
                @XmlAttribute(required = true)
                protected String description;

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

                /**
                 * Gets the value of the description property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDescription() {
                    return description;
                }

                /**
                 * Sets the value of the description property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDescription(String value) {
                    this.description = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class ContingencyHumanitarianPeacekeepingOperation {

                @XmlValue
                protected String value;
                @XmlAttribute(required = true)
                protected String description;

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

                /**
                 * Gets the value of the description property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDescription() {
                    return description;
                }

                /**
                 * Sets the value of the description property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDescription(String value) {
                    this.description = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class ContractActionType {

                @XmlValue
                protected String value;
                @XmlAttribute(required = true)
                protected String description;

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

                /**
                 * Gets the value of the description property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDescription() {
                    return description;
                }

                /**
                 * Sets the value of the description property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDescription(String value) {
                    this.description = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class ContractFinancing {

                @XmlValue
                protected String value;
                @XmlAttribute(required = true)
                protected String description;

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

                /**
                 * Gets the value of the description property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDescription() {
                    return description;
                }

                /**
                 * Sets the value of the description property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDescription(String value) {
                    this.description = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class CostAccountingStandardsClause {

                @XmlValue
                protected String value;
                @XmlAttribute(required = true)
                protected String description;

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

                /**
                 * Gets the value of the description property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDescription() {
                    return description;
                }

                /**
                 * Sets the value of the description property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDescription(String value) {
                    this.description = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class CostOrPricingData {

                @XmlValue
                protected String value;
                @XmlAttribute(required = true)
                protected String description;

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

                /**
                 * Gets the value of the description property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDescription() {
                    return description;
                }

                /**
                 * Sets the value of the description property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDescription(String value) {
                    this.description = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class GFEGFP {

                @XmlValue
                protected String value;
                @XmlAttribute(required = true)
                protected String description;

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

                /**
                 * Gets the value of the description property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDescription() {
                    return description;
                }

                /**
                 * Sets the value of the description property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDescription(String value) {
                    this.description = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class InherentlyGovernmentalFunction {

                @XmlValue
                protected String value;
                @XmlAttribute(required = true)
                protected String description;

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

                /**
                 * Gets the value of the description property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDescription() {
                    return description;
                }

                /**
                 * Sets the value of the description property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDescription(String value) {
                    this.description = value;
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
             *       &lt;all>
             *         &lt;element name="treasuryAccount">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;all>
             *                   &lt;element name="treasuryAccountSymbol">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;all>
             *                             &lt;element name="agencyIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="mainAccountCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="allocationTransferAgencyIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="beginningPeriodOfAvailability" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="endingPeriodOfAvailability" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="availabilityTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="subAccountCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="subLevelPrefixCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                           &lt;/all>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="initiative" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="obligatedAmount" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                 &lt;/all>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/all>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {

            })
            public static class ListOfTreasuryAccounts {

                @XmlElement(required = true)
                protected ListOfAwards.Award.ContractData.ListOfTreasuryAccounts.TreasuryAccount treasuryAccount;

                /**
                 * Gets the value of the treasuryAccount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ListOfAwards.Award.ContractData.ListOfTreasuryAccounts.TreasuryAccount }
                 *     
                 */
                public ListOfAwards.Award.ContractData.ListOfTreasuryAccounts.TreasuryAccount getTreasuryAccount() {
                    return treasuryAccount;
                }

                /**
                 * Sets the value of the treasuryAccount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ListOfAwards.Award.ContractData.ListOfTreasuryAccounts.TreasuryAccount }
                 *     
                 */
                public void setTreasuryAccount(ListOfAwards.Award.ContractData.ListOfTreasuryAccounts.TreasuryAccount value) {
                    this.treasuryAccount = value;
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
                 *       &lt;all>
                 *         &lt;element name="treasuryAccountSymbol">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;all>
                 *                   &lt;element name="agencyIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="mainAccountCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="allocationTransferAgencyIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="beginningPeriodOfAvailability" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="endingPeriodOfAvailability" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="availabilityTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="subAccountCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="subLevelPrefixCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                 &lt;/all>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="initiative" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="obligatedAmount" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *       &lt;/all>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {

                })
                public static class TreasuryAccount {

                    @XmlElement(required = true)
                    protected ListOfAwards.Award.ContractData.ListOfTreasuryAccounts.TreasuryAccount.TreasuryAccountSymbol treasuryAccountSymbol;
                    @XmlElement(required = true)
                    protected String initiative;
                    @XmlElement(required = true)
                    protected String obligatedAmount;

                    /**
                     * Gets the value of the treasuryAccountSymbol property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ListOfAwards.Award.ContractData.ListOfTreasuryAccounts.TreasuryAccount.TreasuryAccountSymbol }
                     *     
                     */
                    public ListOfAwards.Award.ContractData.ListOfTreasuryAccounts.TreasuryAccount.TreasuryAccountSymbol getTreasuryAccountSymbol() {
                        return treasuryAccountSymbol;
                    }

                    /**
                     * Sets the value of the treasuryAccountSymbol property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ListOfAwards.Award.ContractData.ListOfTreasuryAccounts.TreasuryAccount.TreasuryAccountSymbol }
                     *     
                     */
                    public void setTreasuryAccountSymbol(ListOfAwards.Award.ContractData.ListOfTreasuryAccounts.TreasuryAccount.TreasuryAccountSymbol value) {
                        this.treasuryAccountSymbol = value;
                    }

                    /**
                     * Gets the value of the initiative property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getInitiative() {
                        return initiative;
                    }

                    /**
                     * Sets the value of the initiative property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setInitiative(String value) {
                        this.initiative = value;
                    }

                    /**
                     * Gets the value of the obligatedAmount property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getObligatedAmount() {
                        return obligatedAmount;
                    }

                    /**
                     * Sets the value of the obligatedAmount property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setObligatedAmount(String value) {
                        this.obligatedAmount = value;
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
                     *       &lt;all>
                     *         &lt;element name="agencyIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="mainAccountCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="allocationTransferAgencyIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="beginningPeriodOfAvailability" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="endingPeriodOfAvailability" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="availabilityTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="subAccountCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="subLevelPrefixCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *       &lt;/all>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {

                    })
                    public static class TreasuryAccountSymbol {

                        @XmlElement(required = true)
                        protected String agencyIdentifier;
                        @XmlElement(required = true)
                        protected String mainAccountCode;
                        @XmlElement(required = true)
                        protected String allocationTransferAgencyIdentifier;
                        @XmlElement(required = true)
                        protected String beginningPeriodOfAvailability;
                        @XmlElement(required = true)
                        protected String endingPeriodOfAvailability;
                        @XmlElement(required = true)
                        protected String availabilityTypeCode;
                        @XmlElement(required = true)
                        protected String subAccountCode;
                        @XmlElement(required = true)
                        protected String subLevelPrefixCode;

                        /**
                         * Gets the value of the agencyIdentifier property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getAgencyIdentifier() {
                            return agencyIdentifier;
                        }

                        /**
                         * Sets the value of the agencyIdentifier property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setAgencyIdentifier(String value) {
                            this.agencyIdentifier = value;
                        }

                        /**
                         * Gets the value of the mainAccountCode property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getMainAccountCode() {
                            return mainAccountCode;
                        }

                        /**
                         * Sets the value of the mainAccountCode property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setMainAccountCode(String value) {
                            this.mainAccountCode = value;
                        }

                        /**
                         * Gets the value of the allocationTransferAgencyIdentifier property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getAllocationTransferAgencyIdentifier() {
                            return allocationTransferAgencyIdentifier;
                        }

                        /**
                         * Sets the value of the allocationTransferAgencyIdentifier property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setAllocationTransferAgencyIdentifier(String value) {
                            this.allocationTransferAgencyIdentifier = value;
                        }

                        /**
                         * Gets the value of the beginningPeriodOfAvailability property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getBeginningPeriodOfAvailability() {
                            return beginningPeriodOfAvailability;
                        }

                        /**
                         * Sets the value of the beginningPeriodOfAvailability property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setBeginningPeriodOfAvailability(String value) {
                            this.beginningPeriodOfAvailability = value;
                        }

                        /**
                         * Gets the value of the endingPeriodOfAvailability property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getEndingPeriodOfAvailability() {
                            return endingPeriodOfAvailability;
                        }

                        /**
                         * Sets the value of the endingPeriodOfAvailability property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setEndingPeriodOfAvailability(String value) {
                            this.endingPeriodOfAvailability = value;
                        }

                        /**
                         * Gets the value of the availabilityTypeCode property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getAvailabilityTypeCode() {
                            return availabilityTypeCode;
                        }

                        /**
                         * Sets the value of the availabilityTypeCode property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setAvailabilityTypeCode(String value) {
                            this.availabilityTypeCode = value;
                        }

                        /**
                         * Gets the value of the subAccountCode property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSubAccountCode() {
                            return subAccountCode;
                        }

                        /**
                         * Sets the value of the subAccountCode property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSubAccountCode(String value) {
                            this.subAccountCode = value;
                        }

                        /**
                         * Gets the value of the subLevelPrefixCode property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSubLevelPrefixCode() {
                            return subLevelPrefixCode;
                        }

                        /**
                         * Sets the value of the subLevelPrefixCode property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSubLevelPrefixCode(String value) {
                            this.subLevelPrefixCode = value;
                        }

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
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class MultiYearContract {

                @XmlValue
                protected String value;
                @XmlAttribute
                protected String description;

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

                /**
                 * Gets the value of the description property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDescription() {
                    return description;
                }

                /**
                 * Sets the value of the description property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDescription(String value) {
                    this.description = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class NationalInterestActionCode {

                @XmlValue
                protected String value;
                @XmlAttribute(required = true)
                protected String description;

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

                /**
                 * Gets the value of the description property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDescription() {
                    return description;
                }

                /**
                 * Sets the value of the description property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDescription(String value) {
                    this.description = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class PerformanceBasedServiceContract {

                @XmlValue
                protected String value;
                @XmlAttribute(required = true)
                protected String description;

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

                /**
                 * Gets the value of the description property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDescription() {
                    return description;
                }

                /**
                 * Sets the value of the description property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDescription(String value) {
                    this.description = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class PurchaseCardAsPaymentMethod {

                @XmlValue
                protected String value;
                @XmlAttribute(required = true)
                protected String description;

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

                /**
                 * Gets the value of the description property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDescription() {
                    return description;
                }

                /**
                 * Sets the value of the description property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDescription(String value) {
                    this.description = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class ReasonForModification {

                @XmlValue
                protected String value;
                @XmlAttribute(required = true)
                protected String description;

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

                /**
                 * Gets the value of the description property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDescription() {
                    return description;
                }

                /**
                 * Sets the value of the description property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDescription(String value) {
                    this.description = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class SeaTransportation {

                @XmlValue
                protected String value;
                @XmlAttribute(required = true)
                protected String description;

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

                /**
                 * Gets the value of the description property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDescription() {
                    return description;
                }

                /**
                 * Sets the value of the description property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDescription(String value) {
                    this.description = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class TypeOfContractPricing {

                @XmlValue
                protected String value;
                @XmlAttribute(required = true)
                protected String description;

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

                /**
                 * Gets the value of the description property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDescription() {
                    return description;
                }

                /**
                 * Sets the value of the description property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDescription(String value) {
                    this.description = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class UndefinitizedAction {

                @XmlValue
                protected String value;
                @XmlAttribute(required = true)
                protected String description;

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

                /**
                 * Gets the value of the description property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDescription() {
                    return description;
                }

                /**
                 * Sets the value of the description property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDescription(String value) {
                    this.description = value;
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
         *         &lt;element name="feePaidForUseOfService" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
            "feePaidForUseOfService"
        })
        public static class ContractMarketingData {

            @XmlElement(required = true)
            protected BigDecimal feePaidForUseOfService;

            /**
             * Gets the value of the feePaidForUseOfService property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getFeePaidForUseOfService() {
                return feePaidForUseOfService;
            }

            /**
             * Sets the value of the feePaidForUseOfService property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setFeePaidForUseOfService(BigDecimal value) {
                this.feePaidForUseOfService = value;
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
         *         &lt;element name="obligatedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *         &lt;element name="baseAndExercisedOptionsValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *         &lt;element name="baseAndAllOptionsValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
            "obligatedAmount",
            "baseAndExercisedOptionsValue",
            "baseAndAllOptionsValue"
        })
        public static class DollarValues {

            @XmlElement(required = true)
            protected BigDecimal obligatedAmount;
            @XmlElement(required = true)
            protected BigDecimal baseAndExercisedOptionsValue;
            @XmlElement(required = true)
            protected BigDecimal baseAndAllOptionsValue;

            /**
             * Gets the value of the obligatedAmount property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getObligatedAmount() {
                return obligatedAmount;
            }

            /**
             * Sets the value of the obligatedAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setObligatedAmount(BigDecimal value) {
                this.obligatedAmount = value;
            }

            /**
             * Gets the value of the baseAndExercisedOptionsValue property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getBaseAndExercisedOptionsValue() {
                return baseAndExercisedOptionsValue;
            }

            /**
             * Sets the value of the baseAndExercisedOptionsValue property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setBaseAndExercisedOptionsValue(BigDecimal value) {
                this.baseAndExercisedOptionsValue = value;
            }

            /**
             * Gets the value of the baseAndAllOptionsValue property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getBaseAndAllOptionsValue() {
                return baseAndAllOptionsValue;
            }

            /**
             * Sets the value of the baseAndAllOptionsValue property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setBaseAndAllOptionsValue(BigDecimal value) {
                this.baseAndAllOptionsValue = value;
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
         *       &lt;all>
         *         &lt;element name="ClingerCohenAct">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="WalshHealyAct">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="serviceContractAct">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="DavisBaconAct">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="interagencyContractingAuthority">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="otherStatutoryAuthority">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/all>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class LegislativeMandates {

            @XmlElement(name = "ClingerCohenAct", required = true)
            protected ListOfAwards.Award.LegislativeMandates.ClingerCohenAct clingerCohenAct;
            @XmlElement(name = "WalshHealyAct", required = true)
            protected ListOfAwards.Award.LegislativeMandates.WalshHealyAct walshHealyAct;
            @XmlElement(required = true)
            protected ListOfAwards.Award.LegislativeMandates.ServiceContractAct serviceContractAct;
            @XmlElement(name = "DavisBaconAct", required = true)
            protected ListOfAwards.Award.LegislativeMandates.DavisBaconAct davisBaconAct;
            @XmlElement(required = true)
            protected ListOfAwards.Award.LegislativeMandates.InteragencyContractingAuthority interagencyContractingAuthority;
            @XmlElement(required = true)
            protected ListOfAwards.Award.LegislativeMandates.OtherStatutoryAuthority otherStatutoryAuthority;

            /**
             * Gets the value of the clingerCohenAct property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfAwards.Award.LegislativeMandates.ClingerCohenAct }
             *     
             */
            public ListOfAwards.Award.LegislativeMandates.ClingerCohenAct getClingerCohenAct() {
                return clingerCohenAct;
            }

            /**
             * Sets the value of the clingerCohenAct property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfAwards.Award.LegislativeMandates.ClingerCohenAct }
             *     
             */
            public void setClingerCohenAct(ListOfAwards.Award.LegislativeMandates.ClingerCohenAct value) {
                this.clingerCohenAct = value;
            }

            /**
             * Gets the value of the walshHealyAct property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfAwards.Award.LegislativeMandates.WalshHealyAct }
             *     
             */
            public ListOfAwards.Award.LegislativeMandates.WalshHealyAct getWalshHealyAct() {
                return walshHealyAct;
            }

            /**
             * Sets the value of the walshHealyAct property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfAwards.Award.LegislativeMandates.WalshHealyAct }
             *     
             */
            public void setWalshHealyAct(ListOfAwards.Award.LegislativeMandates.WalshHealyAct value) {
                this.walshHealyAct = value;
            }

            /**
             * Gets the value of the serviceContractAct property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfAwards.Award.LegislativeMandates.ServiceContractAct }
             *     
             */
            public ListOfAwards.Award.LegislativeMandates.ServiceContractAct getServiceContractAct() {
                return serviceContractAct;
            }

            /**
             * Sets the value of the serviceContractAct property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfAwards.Award.LegislativeMandates.ServiceContractAct }
             *     
             */
            public void setServiceContractAct(ListOfAwards.Award.LegislativeMandates.ServiceContractAct value) {
                this.serviceContractAct = value;
            }

            /**
             * Gets the value of the davisBaconAct property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfAwards.Award.LegislativeMandates.DavisBaconAct }
             *     
             */
            public ListOfAwards.Award.LegislativeMandates.DavisBaconAct getDavisBaconAct() {
                return davisBaconAct;
            }

            /**
             * Sets the value of the davisBaconAct property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfAwards.Award.LegislativeMandates.DavisBaconAct }
             *     
             */
            public void setDavisBaconAct(ListOfAwards.Award.LegislativeMandates.DavisBaconAct value) {
                this.davisBaconAct = value;
            }

            /**
             * Gets the value of the interagencyContractingAuthority property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfAwards.Award.LegislativeMandates.InteragencyContractingAuthority }
             *     
             */
            public ListOfAwards.Award.LegislativeMandates.InteragencyContractingAuthority getInteragencyContractingAuthority() {
                return interagencyContractingAuthority;
            }

            /**
             * Sets the value of the interagencyContractingAuthority property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfAwards.Award.LegislativeMandates.InteragencyContractingAuthority }
             *     
             */
            public void setInteragencyContractingAuthority(ListOfAwards.Award.LegislativeMandates.InteragencyContractingAuthority value) {
                this.interagencyContractingAuthority = value;
            }

            /**
             * Gets the value of the otherStatutoryAuthority property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfAwards.Award.LegislativeMandates.OtherStatutoryAuthority }
             *     
             */
            public ListOfAwards.Award.LegislativeMandates.OtherStatutoryAuthority getOtherStatutoryAuthority() {
                return otherStatutoryAuthority;
            }

            /**
             * Sets the value of the otherStatutoryAuthority property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfAwards.Award.LegislativeMandates.OtherStatutoryAuthority }
             *     
             */
            public void setOtherStatutoryAuthority(ListOfAwards.Award.LegislativeMandates.OtherStatutoryAuthority value) {
                this.otherStatutoryAuthority = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class ClingerCohenAct {

                @XmlValue
                protected String value;
                @XmlAttribute(required = true)
                protected String description;

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

                /**
                 * Gets the value of the description property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDescription() {
                    return description;
                }

                /**
                 * Sets the value of the description property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDescription(String value) {
                    this.description = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class DavisBaconAct {

                @XmlValue
                protected String value;
                @XmlAttribute(required = true)
                protected String description;

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

                /**
                 * Gets the value of the description property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDescription() {
                    return description;
                }

                /**
                 * Sets the value of the description property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDescription(String value) {
                    this.description = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class InteragencyContractingAuthority {

                @XmlValue
                protected String value;
                @XmlAttribute(required = true)
                protected String description;

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

                /**
                 * Gets the value of the description property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDescription() {
                    return description;
                }

                /**
                 * Sets the value of the description property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDescription(String value) {
                    this.description = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class OtherStatutoryAuthority {

                @XmlValue
                protected String value;
                @XmlAttribute(required = true)
                protected String description;

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

                /**
                 * Gets the value of the description property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDescription() {
                    return description;
                }

                /**
                 * Sets the value of the description property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDescription(String value) {
                    this.description = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class ServiceContractAct {

                @XmlValue
                protected String value;
                @XmlAttribute(required = true)
                protected String description;

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

                /**
                 * Gets the value of the description property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDescription() {
                    return description;
                }

                /**
                 * Sets the value of the description property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDescription(String value) {
                    this.description = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class WalshHealyAct {

                @XmlValue
                protected String value;
                @XmlAttribute(required = true)
                protected String description;

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

                /**
                 * Gets the value of the description property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDescription() {
                    return description;
                }

                /**
                 * Sets the value of the description property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDescription(String value) {
                    this.description = value;
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
         *         &lt;element name="principalPlaceOfPerformance">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="locationCode">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/extension>
         *                       &lt;/simpleContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="stateCode">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/extension>
         *                       &lt;/simpleContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="countryCode">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                           &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/extension>
         *                       &lt;/simpleContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="placeOfPerformanceZIPCode">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="county" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="city" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="placeOfPerformanceCongressionalDistrict" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
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
            "principalPlaceOfPerformance",
            "placeOfPerformanceZIPCode",
            "placeOfPerformanceCongressionalDistrict"
        })
        public static class PlaceOfPerformance {

            @XmlElement(required = true)
            protected ListOfAwards.Award.PlaceOfPerformance.PrincipalPlaceOfPerformance principalPlaceOfPerformance;
            @XmlElement(required = true)
            protected ListOfAwards.Award.PlaceOfPerformance.PlaceOfPerformanceZIPCode placeOfPerformanceZIPCode;
            @XmlSchemaType(name = "unsignedByte")
            protected short placeOfPerformanceCongressionalDistrict;

            /**
             * Gets the value of the principalPlaceOfPerformance property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfAwards.Award.PlaceOfPerformance.PrincipalPlaceOfPerformance }
             *     
             */
            public ListOfAwards.Award.PlaceOfPerformance.PrincipalPlaceOfPerformance getPrincipalPlaceOfPerformance() {
                return principalPlaceOfPerformance;
            }

            /**
             * Sets the value of the principalPlaceOfPerformance property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfAwards.Award.PlaceOfPerformance.PrincipalPlaceOfPerformance }
             *     
             */
            public void setPrincipalPlaceOfPerformance(ListOfAwards.Award.PlaceOfPerformance.PrincipalPlaceOfPerformance value) {
                this.principalPlaceOfPerformance = value;
            }

            /**
             * Gets the value of the placeOfPerformanceZIPCode property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfAwards.Award.PlaceOfPerformance.PlaceOfPerformanceZIPCode }
             *     
             */
            public ListOfAwards.Award.PlaceOfPerformance.PlaceOfPerformanceZIPCode getPlaceOfPerformanceZIPCode() {
                return placeOfPerformanceZIPCode;
            }

            /**
             * Sets the value of the placeOfPerformanceZIPCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfAwards.Award.PlaceOfPerformance.PlaceOfPerformanceZIPCode }
             *     
             */
            public void setPlaceOfPerformanceZIPCode(ListOfAwards.Award.PlaceOfPerformance.PlaceOfPerformanceZIPCode value) {
                this.placeOfPerformanceZIPCode = value;
            }

            /**
             * Gets the value of the placeOfPerformanceCongressionalDistrict property.
             * 
             */
            public short getPlaceOfPerformanceCongressionalDistrict() {
                return placeOfPerformanceCongressionalDistrict;
            }

            /**
             * Sets the value of the placeOfPerformanceCongressionalDistrict property.
             * 
             */
            public void setPlaceOfPerformanceCongressionalDistrict(short value) {
                this.placeOfPerformanceCongressionalDistrict = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="county" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="city" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class PlaceOfPerformanceZIPCode {

                @XmlValue
                protected String value;
                @XmlAttribute
                protected String county;
                @XmlAttribute
                protected String city;

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

                /**
                 * Gets the value of the county property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCounty() {
                    return county;
                }

                /**
                 * Sets the value of the county property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCounty(String value) {
                    this.county = value;
                }

                /**
                 * Gets the value of the city property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCity() {
                    return city;
                }

                /**
                 * Sets the value of the city property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCity(String value) {
                    this.city = value;
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
             *         &lt;element name="locationCode">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/extension>
             *             &lt;/simpleContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="stateCode">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/extension>
             *             &lt;/simpleContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="countryCode">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/extension>
             *             &lt;/simpleContent>
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
                "locationCode",
                "stateCode",
                "countryCode"
            })
            public static class PrincipalPlaceOfPerformance {

                @XmlElement(required = true)
                protected ListOfAwards.Award.PlaceOfPerformance.PrincipalPlaceOfPerformance.LocationCode locationCode;
                @XmlElement(required = true)
                protected ListOfAwards.Award.PlaceOfPerformance.PrincipalPlaceOfPerformance.StateCode stateCode;
                @XmlElement(required = true)
                protected ListOfAwards.Award.PlaceOfPerformance.PrincipalPlaceOfPerformance.CountryCode countryCode;

                /**
                 * Gets the value of the locationCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ListOfAwards.Award.PlaceOfPerformance.PrincipalPlaceOfPerformance.LocationCode }
                 *     
                 */
                public ListOfAwards.Award.PlaceOfPerformance.PrincipalPlaceOfPerformance.LocationCode getLocationCode() {
                    return locationCode;
                }

                /**
                 * Sets the value of the locationCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ListOfAwards.Award.PlaceOfPerformance.PrincipalPlaceOfPerformance.LocationCode }
                 *     
                 */
                public void setLocationCode(ListOfAwards.Award.PlaceOfPerformance.PrincipalPlaceOfPerformance.LocationCode value) {
                    this.locationCode = value;
                }

                /**
                 * Gets the value of the stateCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ListOfAwards.Award.PlaceOfPerformance.PrincipalPlaceOfPerformance.StateCode }
                 *     
                 */
                public ListOfAwards.Award.PlaceOfPerformance.PrincipalPlaceOfPerformance.StateCode getStateCode() {
                    return stateCode;
                }

                /**
                 * Sets the value of the stateCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ListOfAwards.Award.PlaceOfPerformance.PrincipalPlaceOfPerformance.StateCode }
                 *     
                 */
                public void setStateCode(ListOfAwards.Award.PlaceOfPerformance.PrincipalPlaceOfPerformance.StateCode value) {
                    this.stateCode = value;
                }

                /**
                 * Gets the value of the countryCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ListOfAwards.Award.PlaceOfPerformance.PrincipalPlaceOfPerformance.CountryCode }
                 *     
                 */
                public ListOfAwards.Award.PlaceOfPerformance.PrincipalPlaceOfPerformance.CountryCode getCountryCode() {
                    return countryCode;
                }

                /**
                 * Sets the value of the countryCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ListOfAwards.Award.PlaceOfPerformance.PrincipalPlaceOfPerformance.CountryCode }
                 *     
                 */
                public void setCountryCode(ListOfAwards.Award.PlaceOfPerformance.PrincipalPlaceOfPerformance.CountryCode value) {
                    this.countryCode = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;simpleContent>
                 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/extension>
                 *   &lt;/simpleContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "value"
                })
                public static class CountryCode {

                    @XmlValue
                    protected String value;
                    @XmlAttribute(required = true)
                    protected String name;

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
                 *   &lt;simpleContent>
                 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/extension>
                 *   &lt;/simpleContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "value"
                })
                public static class LocationCode {

                    @XmlValue
                    protected String value;
                    @XmlAttribute
                    protected String name;

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
                 *   &lt;simpleContent>
                 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/extension>
                 *   &lt;/simpleContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "value"
                })
                public static class StateCode {

                    @XmlValue
                    protected String value;
                    @XmlAttribute
                    protected String name;

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
         *       &lt;all>
         *         &lt;element name="subcontractPlan">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/all>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class PreferencePrograms {

            @XmlElement(required = true)
            protected ListOfAwards.Award.PreferencePrograms.SubcontractPlan subcontractPlan;

            /**
             * Gets the value of the subcontractPlan property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfAwards.Award.PreferencePrograms.SubcontractPlan }
             *     
             */
            public ListOfAwards.Award.PreferencePrograms.SubcontractPlan getSubcontractPlan() {
                return subcontractPlan;
            }

            /**
             * Sets the value of the subcontractPlan property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfAwards.Award.PreferencePrograms.SubcontractPlan }
             *     
             */
            public void setSubcontractPlan(ListOfAwards.Award.PreferencePrograms.SubcontractPlan value) {
                this.subcontractPlan = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class SubcontractPlan {

                @XmlValue
                protected String value;
                @XmlAttribute(required = true)
                protected String description;

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

                /**
                 * Gets the value of the description property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDescription() {
                    return description;
                }

                /**
                 * Sets the value of the description property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDescription(String value) {
                    this.description = value;
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
         *       &lt;all>
         *         &lt;element name="productOrServiceCode">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="contractBundling">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="claimantProgramCode">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="principalNAICSCode">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="manufacturingOrganizationType">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="recoveredMaterialClauses">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="systemEquipmentCode">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="informationTechnologyCommercialItemCategory">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="useOfEPADesignatedProducts">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="countryOfOrigin">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="placeOfManufacture">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/all>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class ProductOrServiceInformation {

            @XmlElement(required = true)
            protected ListOfAwards.Award.ProductOrServiceInformation.ProductOrServiceCode productOrServiceCode;
            @XmlElement(required = true)
            protected ListOfAwards.Award.ProductOrServiceInformation.ContractBundling contractBundling;
            @XmlElement(required = true)
            protected ListOfAwards.Award.ProductOrServiceInformation.ClaimantProgramCode claimantProgramCode;
            @XmlElement(required = true)
            protected ListOfAwards.Award.ProductOrServiceInformation.PrincipalNAICSCode principalNAICSCode;
            @XmlElement(required = true)
            protected ListOfAwards.Award.ProductOrServiceInformation.ManufacturingOrganizationType manufacturingOrganizationType;
            @XmlElement(required = true)
            protected ListOfAwards.Award.ProductOrServiceInformation.RecoveredMaterialClauses recoveredMaterialClauses;
            @XmlElement(required = true)
            protected ListOfAwards.Award.ProductOrServiceInformation.SystemEquipmentCode systemEquipmentCode;
            @XmlElement(required = true)
            protected ListOfAwards.Award.ProductOrServiceInformation.InformationTechnologyCommercialItemCategory informationTechnologyCommercialItemCategory;
            @XmlElement(required = true)
            protected ListOfAwards.Award.ProductOrServiceInformation.UseOfEPADesignatedProducts useOfEPADesignatedProducts;
            @XmlElement(required = true)
            protected ListOfAwards.Award.ProductOrServiceInformation.CountryOfOrigin countryOfOrigin;
            @XmlElement(required = true)
            protected ListOfAwards.Award.ProductOrServiceInformation.PlaceOfManufacture placeOfManufacture;

            /**
             * Gets the value of the productOrServiceCode property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfAwards.Award.ProductOrServiceInformation.ProductOrServiceCode }
             *     
             */
            public ListOfAwards.Award.ProductOrServiceInformation.ProductOrServiceCode getProductOrServiceCode() {
                return productOrServiceCode;
            }

            /**
             * Sets the value of the productOrServiceCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfAwards.Award.ProductOrServiceInformation.ProductOrServiceCode }
             *     
             */
            public void setProductOrServiceCode(ListOfAwards.Award.ProductOrServiceInformation.ProductOrServiceCode value) {
                this.productOrServiceCode = value;
            }

            /**
             * Gets the value of the contractBundling property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfAwards.Award.ProductOrServiceInformation.ContractBundling }
             *     
             */
            public ListOfAwards.Award.ProductOrServiceInformation.ContractBundling getContractBundling() {
                return contractBundling;
            }

            /**
             * Sets the value of the contractBundling property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfAwards.Award.ProductOrServiceInformation.ContractBundling }
             *     
             */
            public void setContractBundling(ListOfAwards.Award.ProductOrServiceInformation.ContractBundling value) {
                this.contractBundling = value;
            }

            /**
             * Gets the value of the claimantProgramCode property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfAwards.Award.ProductOrServiceInformation.ClaimantProgramCode }
             *     
             */
            public ListOfAwards.Award.ProductOrServiceInformation.ClaimantProgramCode getClaimantProgramCode() {
                return claimantProgramCode;
            }

            /**
             * Sets the value of the claimantProgramCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfAwards.Award.ProductOrServiceInformation.ClaimantProgramCode }
             *     
             */
            public void setClaimantProgramCode(ListOfAwards.Award.ProductOrServiceInformation.ClaimantProgramCode value) {
                this.claimantProgramCode = value;
            }

            /**
             * Gets the value of the principalNAICSCode property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfAwards.Award.ProductOrServiceInformation.PrincipalNAICSCode }
             *     
             */
            public ListOfAwards.Award.ProductOrServiceInformation.PrincipalNAICSCode getPrincipalNAICSCode() {
                return principalNAICSCode;
            }

            /**
             * Sets the value of the principalNAICSCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfAwards.Award.ProductOrServiceInformation.PrincipalNAICSCode }
             *     
             */
            public void setPrincipalNAICSCode(ListOfAwards.Award.ProductOrServiceInformation.PrincipalNAICSCode value) {
                this.principalNAICSCode = value;
            }

            /**
             * Gets the value of the manufacturingOrganizationType property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfAwards.Award.ProductOrServiceInformation.ManufacturingOrganizationType }
             *     
             */
            public ListOfAwards.Award.ProductOrServiceInformation.ManufacturingOrganizationType getManufacturingOrganizationType() {
                return manufacturingOrganizationType;
            }

            /**
             * Sets the value of the manufacturingOrganizationType property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfAwards.Award.ProductOrServiceInformation.ManufacturingOrganizationType }
             *     
             */
            public void setManufacturingOrganizationType(ListOfAwards.Award.ProductOrServiceInformation.ManufacturingOrganizationType value) {
                this.manufacturingOrganizationType = value;
            }

            /**
             * Gets the value of the recoveredMaterialClauses property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfAwards.Award.ProductOrServiceInformation.RecoveredMaterialClauses }
             *     
             */
            public ListOfAwards.Award.ProductOrServiceInformation.RecoveredMaterialClauses getRecoveredMaterialClauses() {
                return recoveredMaterialClauses;
            }

            /**
             * Sets the value of the recoveredMaterialClauses property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfAwards.Award.ProductOrServiceInformation.RecoveredMaterialClauses }
             *     
             */
            public void setRecoveredMaterialClauses(ListOfAwards.Award.ProductOrServiceInformation.RecoveredMaterialClauses value) {
                this.recoveredMaterialClauses = value;
            }

            /**
             * Gets the value of the systemEquipmentCode property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfAwards.Award.ProductOrServiceInformation.SystemEquipmentCode }
             *     
             */
            public ListOfAwards.Award.ProductOrServiceInformation.SystemEquipmentCode getSystemEquipmentCode() {
                return systemEquipmentCode;
            }

            /**
             * Sets the value of the systemEquipmentCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfAwards.Award.ProductOrServiceInformation.SystemEquipmentCode }
             *     
             */
            public void setSystemEquipmentCode(ListOfAwards.Award.ProductOrServiceInformation.SystemEquipmentCode value) {
                this.systemEquipmentCode = value;
            }

            /**
             * Gets the value of the informationTechnologyCommercialItemCategory property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfAwards.Award.ProductOrServiceInformation.InformationTechnologyCommercialItemCategory }
             *     
             */
            public ListOfAwards.Award.ProductOrServiceInformation.InformationTechnologyCommercialItemCategory getInformationTechnologyCommercialItemCategory() {
                return informationTechnologyCommercialItemCategory;
            }

            /**
             * Sets the value of the informationTechnologyCommercialItemCategory property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfAwards.Award.ProductOrServiceInformation.InformationTechnologyCommercialItemCategory }
             *     
             */
            public void setInformationTechnologyCommercialItemCategory(ListOfAwards.Award.ProductOrServiceInformation.InformationTechnologyCommercialItemCategory value) {
                this.informationTechnologyCommercialItemCategory = value;
            }

            /**
             * Gets the value of the useOfEPADesignatedProducts property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfAwards.Award.ProductOrServiceInformation.UseOfEPADesignatedProducts }
             *     
             */
            public ListOfAwards.Award.ProductOrServiceInformation.UseOfEPADesignatedProducts getUseOfEPADesignatedProducts() {
                return useOfEPADesignatedProducts;
            }

            /**
             * Sets the value of the useOfEPADesignatedProducts property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfAwards.Award.ProductOrServiceInformation.UseOfEPADesignatedProducts }
             *     
             */
            public void setUseOfEPADesignatedProducts(ListOfAwards.Award.ProductOrServiceInformation.UseOfEPADesignatedProducts value) {
                this.useOfEPADesignatedProducts = value;
            }

            /**
             * Gets the value of the countryOfOrigin property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfAwards.Award.ProductOrServiceInformation.CountryOfOrigin }
             *     
             */
            public ListOfAwards.Award.ProductOrServiceInformation.CountryOfOrigin getCountryOfOrigin() {
                return countryOfOrigin;
            }

            /**
             * Sets the value of the countryOfOrigin property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfAwards.Award.ProductOrServiceInformation.CountryOfOrigin }
             *     
             */
            public void setCountryOfOrigin(ListOfAwards.Award.ProductOrServiceInformation.CountryOfOrigin value) {
                this.countryOfOrigin = value;
            }

            /**
             * Gets the value of the placeOfManufacture property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfAwards.Award.ProductOrServiceInformation.PlaceOfManufacture }
             *     
             */
            public ListOfAwards.Award.ProductOrServiceInformation.PlaceOfManufacture getPlaceOfManufacture() {
                return placeOfManufacture;
            }

            /**
             * Sets the value of the placeOfManufacture property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfAwards.Award.ProductOrServiceInformation.PlaceOfManufacture }
             *     
             */
            public void setPlaceOfManufacture(ListOfAwards.Award.ProductOrServiceInformation.PlaceOfManufacture value) {
                this.placeOfManufacture = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class ClaimantProgramCode {

                @XmlValue
                protected String value;
                @XmlAttribute(required = true)
                protected String description;

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

                /**
                 * Gets the value of the description property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDescription() {
                    return description;
                }

                /**
                 * Sets the value of the description property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDescription(String value) {
                    this.description = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class ContractBundling {

                @XmlValue
                protected String value;
                @XmlAttribute(required = true)
                protected String description;

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

                /**
                 * Gets the value of the description property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDescription() {
                    return description;
                }

                /**
                 * Sets the value of the description property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDescription(String value) {
                    this.description = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class CountryOfOrigin {

                @XmlValue
                protected String value;
                @XmlAttribute(required = true)
                protected String name;

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
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class InformationTechnologyCommercialItemCategory {

                @XmlValue
                protected String value;
                @XmlAttribute(required = true)
                protected String description;

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

                /**
                 * Gets the value of the description property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDescription() {
                    return description;
                }

                /**
                 * Sets the value of the description property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDescription(String value) {
                    this.description = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class ManufacturingOrganizationType {

                @XmlValue
                protected String value;
                @XmlAttribute(required = true)
                protected String description;

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

                /**
                 * Gets the value of the description property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDescription() {
                    return description;
                }

                /**
                 * Sets the value of the description property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDescription(String value) {
                    this.description = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class PlaceOfManufacture {

                @XmlValue
                protected String value;
                @XmlAttribute(required = true)
                protected String description;

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

                /**
                 * Gets the value of the description property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDescription() {
                    return description;
                }

                /**
                 * Sets the value of the description property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDescription(String value) {
                    this.description = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class PrincipalNAICSCode {

                @XmlValue
                protected String value;
                @XmlAttribute(required = true)
                protected String description;

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

                /**
                 * Gets the value of the description property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDescription() {
                    return description;
                }

                /**
                 * Sets the value of the description property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDescription(String value) {
                    this.description = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class ProductOrServiceCode {

                @XmlValue
                protected String value;
                @XmlAttribute(required = true)
                protected String description;

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

                /**
                 * Gets the value of the description property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDescription() {
                    return description;
                }

                /**
                 * Sets the value of the description property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDescription(String value) {
                    this.description = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class RecoveredMaterialClauses {

                @XmlValue
                protected String value;
                @XmlAttribute(required = true)
                protected String description;

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

                /**
                 * Gets the value of the description property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDescription() {
                    return description;
                }

                /**
                 * Sets the value of the description property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDescription(String value) {
                    this.description = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class SystemEquipmentCode {

                @XmlValue
                protected String value;
                @XmlAttribute(required = true)
                protected String description;

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

                /**
                 * Gets the value of the description property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDescription() {
                    return description;
                }

                /**
                 * Sets the value of the description property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDescription(String value) {
                    this.description = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class UseOfEPADesignatedProducts {

                @XmlValue
                protected String value;
                @XmlAttribute(required = true)
                protected String description;

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

                /**
                 * Gets the value of the description property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDescription() {
                    return description;
                }

                /**
                 * Sets the value of the description property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDescription(String value) {
                    this.description = value;
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
         *       &lt;all>
         *         &lt;element name="contractingOfficeAgencyID">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="contractingOfficeID">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="regionCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="foreignFunding">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="fundingRequestingAgencyID">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="fundingRequestingOfficeID">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/all>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class PurchaserInformation {

            @XmlElement(required = true)
            protected ListOfAwards.Award.PurchaserInformation.ContractingOfficeAgencyID contractingOfficeAgencyID;
            @XmlElement(required = true)
            protected ListOfAwards.Award.PurchaserInformation.ContractingOfficeID contractingOfficeID;
            @XmlElement(required = true)
            protected ListOfAwards.Award.PurchaserInformation.ForeignFunding foreignFunding;
            @XmlElement(required = true)
            protected ListOfAwards.Award.PurchaserInformation.FundingRequestingAgencyID fundingRequestingAgencyID;
            @XmlElement(required = true)
            protected ListOfAwards.Award.PurchaserInformation.FundingRequestingOfficeID fundingRequestingOfficeID;

            /**
             * Gets the value of the contractingOfficeAgencyID property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfAwards.Award.PurchaserInformation.ContractingOfficeAgencyID }
             *     
             */
            public ListOfAwards.Award.PurchaserInformation.ContractingOfficeAgencyID getContractingOfficeAgencyID() {
                return contractingOfficeAgencyID;
            }

            /**
             * Sets the value of the contractingOfficeAgencyID property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfAwards.Award.PurchaserInformation.ContractingOfficeAgencyID }
             *     
             */
            public void setContractingOfficeAgencyID(ListOfAwards.Award.PurchaserInformation.ContractingOfficeAgencyID value) {
                this.contractingOfficeAgencyID = value;
            }

            /**
             * Gets the value of the contractingOfficeID property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfAwards.Award.PurchaserInformation.ContractingOfficeID }
             *     
             */
            public ListOfAwards.Award.PurchaserInformation.ContractingOfficeID getContractingOfficeID() {
                return contractingOfficeID;
            }

            /**
             * Sets the value of the contractingOfficeID property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfAwards.Award.PurchaserInformation.ContractingOfficeID }
             *     
             */
            public void setContractingOfficeID(ListOfAwards.Award.PurchaserInformation.ContractingOfficeID value) {
                this.contractingOfficeID = value;
            }

            /**
             * Gets the value of the foreignFunding property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfAwards.Award.PurchaserInformation.ForeignFunding }
             *     
             */
            public ListOfAwards.Award.PurchaserInformation.ForeignFunding getForeignFunding() {
                return foreignFunding;
            }

            /**
             * Sets the value of the foreignFunding property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfAwards.Award.PurchaserInformation.ForeignFunding }
             *     
             */
            public void setForeignFunding(ListOfAwards.Award.PurchaserInformation.ForeignFunding value) {
                this.foreignFunding = value;
            }

            /**
             * Gets the value of the fundingRequestingAgencyID property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfAwards.Award.PurchaserInformation.FundingRequestingAgencyID }
             *     
             */
            public ListOfAwards.Award.PurchaserInformation.FundingRequestingAgencyID getFundingRequestingAgencyID() {
                return fundingRequestingAgencyID;
            }

            /**
             * Sets the value of the fundingRequestingAgencyID property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfAwards.Award.PurchaserInformation.FundingRequestingAgencyID }
             *     
             */
            public void setFundingRequestingAgencyID(ListOfAwards.Award.PurchaserInformation.FundingRequestingAgencyID value) {
                this.fundingRequestingAgencyID = value;
            }

            /**
             * Gets the value of the fundingRequestingOfficeID property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfAwards.Award.PurchaserInformation.FundingRequestingOfficeID }
             *     
             */
            public ListOfAwards.Award.PurchaserInformation.FundingRequestingOfficeID getFundingRequestingOfficeID() {
                return fundingRequestingOfficeID;
            }

            /**
             * Sets the value of the fundingRequestingOfficeID property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfAwards.Award.PurchaserInformation.FundingRequestingOfficeID }
             *     
             */
            public void setFundingRequestingOfficeID(ListOfAwards.Award.PurchaserInformation.FundingRequestingOfficeID value) {
                this.fundingRequestingOfficeID = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class ContractingOfficeAgencyID {

                @XmlValue
                protected String value;
                @XmlAttribute(required = true)
                protected String name;

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
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="regionCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class ContractingOfficeID {

                @XmlValue
                protected String value;
                @XmlAttribute(required = true)
                protected String name;
                @XmlAttribute
                protected String regionCode;

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
                 * Gets the value of the regionCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRegionCode() {
                    return regionCode;
                }

                /**
                 * Sets the value of the regionCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRegionCode(String value) {
                    this.regionCode = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class ForeignFunding {

                @XmlValue
                protected String value;
                @XmlAttribute(required = true)
                protected String description;

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

                /**
                 * Gets the value of the description property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDescription() {
                    return description;
                }

                /**
                 * Sets the value of the description property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDescription(String value) {
                    this.description = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class FundingRequestingAgencyID {

                @XmlValue
                protected String value;
                @XmlAttribute(required = true)
                protected String name;

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
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class FundingRequestingOfficeID {

                @XmlValue
                protected String value;
                @XmlAttribute(required = true)
                protected String name;

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
         *         &lt;element name="signedDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="effectiveDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="currentCompletionDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="ultimateCompletionDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "signedDate",
            "effectiveDate",
            "currentCompletionDate",
            "ultimateCompletionDate"
        })
        public static class RelevantContractDates {

            @XmlElement(required = true)
            protected String signedDate;
            @XmlElement(required = true)
            protected String effectiveDate;
            @XmlElement(required = true)
            protected String currentCompletionDate;
            @XmlElement(required = true)
            protected String ultimateCompletionDate;

            /**
             * Gets the value of the signedDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSignedDate() {
                return signedDate;
            }

            /**
             * Sets the value of the signedDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSignedDate(String value) {
                this.signedDate = value;
            }

            /**
             * Gets the value of the effectiveDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEffectiveDate() {
                return effectiveDate;
            }

            /**
             * Sets the value of the effectiveDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEffectiveDate(String value) {
                this.effectiveDate = value;
            }

            /**
             * Gets the value of the currentCompletionDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCurrentCompletionDate() {
                return currentCompletionDate;
            }

            /**
             * Sets the value of the currentCompletionDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCurrentCompletionDate(String value) {
                this.currentCompletionDate = value;
            }

            /**
             * Gets the value of the ultimateCompletionDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUltimateCompletionDate() {
                return ultimateCompletionDate;
            }

            /**
             * Sets the value of the ultimateCompletionDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUltimateCompletionDate(String value) {
                this.ultimateCompletionDate = value;
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
         *       &lt;all>
         *         &lt;element name="totalObligatedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *         &lt;element name="totalBaseAndExercisedOptionsValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *         &lt;element name="totalBaseAndAllOptionsValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *       &lt;/all>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class TotalDollarValues {

            @XmlElement(required = true)
            protected BigDecimal totalObligatedAmount;
            @XmlElement(required = true)
            protected BigDecimal totalBaseAndExercisedOptionsValue;
            @XmlElement(required = true)
            protected BigDecimal totalBaseAndAllOptionsValue;

            /**
             * Gets the value of the totalObligatedAmount property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTotalObligatedAmount() {
                return totalObligatedAmount;
            }

            /**
             * Sets the value of the totalObligatedAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setTotalObligatedAmount(BigDecimal value) {
                this.totalObligatedAmount = value;
            }

            /**
             * Gets the value of the totalBaseAndExercisedOptionsValue property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTotalBaseAndExercisedOptionsValue() {
                return totalBaseAndExercisedOptionsValue;
            }

            /**
             * Sets the value of the totalBaseAndExercisedOptionsValue property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setTotalBaseAndExercisedOptionsValue(BigDecimal value) {
                this.totalBaseAndExercisedOptionsValue = value;
            }

            /**
             * Gets the value of the totalBaseAndAllOptionsValue property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTotalBaseAndAllOptionsValue() {
                return totalBaseAndAllOptionsValue;
            }

            /**
             * Sets the value of the totalBaseAndAllOptionsValue property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setTotalBaseAndAllOptionsValue(BigDecimal value) {
                this.totalBaseAndAllOptionsValue = value;
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
         *       &lt;all>
         *         &lt;element name="createdBy" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="lastModifiedBy" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="lastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="status">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/all>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class TransactionInformation {

            @XmlElement(required = true)
            protected String createdBy;
            @XmlElement(required = true)
            protected String createdDate;
            @XmlElement(required = true)
            protected String lastModifiedBy;
            @XmlElement(required = true)
            protected String lastModifiedDate;
            @XmlElement(required = true)
            protected ListOfAwards.Award.TransactionInformation.Status status;

            /**
             * Gets the value of the createdBy property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCreatedBy() {
                return createdBy;
            }

            /**
             * Sets the value of the createdBy property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCreatedBy(String value) {
                this.createdBy = value;
            }

            /**
             * Gets the value of the createdDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCreatedDate() {
                return createdDate;
            }

            /**
             * Sets the value of the createdDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCreatedDate(String value) {
                this.createdDate = value;
            }

            /**
             * Gets the value of the lastModifiedBy property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLastModifiedBy() {
                return lastModifiedBy;
            }

            /**
             * Sets the value of the lastModifiedBy property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLastModifiedBy(String value) {
                this.lastModifiedBy = value;
            }

            /**
             * Gets the value of the lastModifiedDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLastModifiedDate() {
                return lastModifiedDate;
            }

            /**
             * Sets the value of the lastModifiedDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLastModifiedDate(String value) {
                this.lastModifiedDate = value;
            }

            /**
             * Gets the value of the status property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfAwards.Award.TransactionInformation.Status }
             *     
             */
            public ListOfAwards.Award.TransactionInformation.Status getStatus() {
                return status;
            }

            /**
             * Sets the value of the status property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfAwards.Award.TransactionInformation.Status }
             *     
             */
            public void setStatus(ListOfAwards.Award.TransactionInformation.Status value) {
                this.status = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class Status {

                @XmlValue
                protected String value;
                @XmlAttribute(required = true)
                protected String description;

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

                /**
                 * Gets the value of the description property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDescription() {
                    return description;
                }

                /**
                 * Sets the value of the description property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDescription(String value) {
                    this.description = value;
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
         *         &lt;element name="vendorHeader">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="vendorName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="vendorAlternateName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="vendorLegalOrganizationName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="vendorDoingAsBusinessName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="vendorSiteDetails">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="vendorSocioEconomicIndicators">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="isEconomicallyDisadvantagedWomenOwnedSmallBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                             &lt;element name="isJointVentureEconomicallyDisadvantagedWomenOwnedSmallBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                             &lt;element name="isJointVentureWomenOwnedSmallBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                             &lt;element name="isWomenOwnedSmallBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                             &lt;element name="isAlaskanNativeOwnedCorporationOrFirm" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                             &lt;element name="isAmericanIndianOwned" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                             &lt;element name="isIndianTribe" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                             &lt;element name="isNativeHawaiianOwnedOrganizationOrFirm" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                             &lt;element name="isTriballyOwnedFirm" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                             &lt;element name="isVeteranOwned" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                             &lt;element name="isServiceRelatedDisabledVeteranOwnedBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                             &lt;element name="isWomenOwned" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                             &lt;element name="minorityOwned">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="isMinorityOwned" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                                       &lt;element name="isSubContinentAsianAmericanOwnedBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                                       &lt;element name="isAsianPacificAmericanOwnedBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                                       &lt;element name="isBlackAmericanOwnedBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                                       &lt;element name="isHispanicAmericanOwnedBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                                       &lt;element name="isNativeAmericanOwnedBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                                       &lt;element name="isOtherMinorityOwned" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="isVerySmallBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="vendorBusinessTypes">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="isCommunityDevelopedCorporationOwnedFirm" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                             &lt;element name="isLaborSurplusAreaFirm" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                             &lt;element name="federalGovernment">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="isFederalGovernment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                                       &lt;element name="isFederallyFundedResearchAndDevelopmentCorp" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                                       &lt;element name="isFederalGovernmentAgency" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="isStateGovernment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                             &lt;element name="localGovernment">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="isLocalGovernment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                                       &lt;element name="isCityLocalGovernment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                                       &lt;element name="isCountyLocalGovernment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                                       &lt;element name="isInterMunicipalLocalGovernment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                                       &lt;element name="isLocalGovernmentOwned" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                                       &lt;element name="isMunicipalityLocalGovernment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                                       &lt;element name="isSchoolDistrictLocalGovernment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                                       &lt;element name="isTownshipLocalGovernment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="isTribalGovernment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                             &lt;element name="isForeignGovernment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                             &lt;element name="businessOrOrganizationType">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="isCorporateEntityNotTaxExempt" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                                       &lt;element name="isCorporateEntityTaxExempt" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                                       &lt;element name="isPartnershipOrLimitedLiabilityPartnership" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                                       &lt;element name="isSolePropreitorship" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                                       &lt;element name="isSmallAgriculturalCooperative" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                                       &lt;element name="isInternationalOrganization" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                                       &lt;element name="isUSGovernmentEntity" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
         *                   &lt;element name="vendorLineOfBusiness">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="isCommunityDevelopmentCorporation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                             &lt;element name="isDomesticShelter" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                             &lt;element name="isEducationalInstitution" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                             &lt;element name="isFoundation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                             &lt;element name="isHospital" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                             &lt;element name="isManufacturerOfGoods" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                             &lt;element name="isVeterinaryHospital" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                             &lt;element name="isHispanicServicingInstitution" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="vendorRelationshipWithFederalGovernment">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="receivesContracts" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                             &lt;element name="receivesGrants" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                             &lt;element name="receivesContractsAndGrants" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="typeOfGovernmentEntity">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="isAirportAuthority" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                             &lt;element name="isCouncilOfGovernments" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                             &lt;element name="isHousingAuthoritiesPublicOrTribal" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                             &lt;element name="isInterstateEntity" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                             &lt;element name="isPlanningCommission" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                             &lt;element name="isPortAuthority" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                             &lt;element name="isTransitAuthority" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="vendorOrganizationFactors">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;all>
         *                             &lt;element name="isSubchapterSCorporation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                             &lt;element name="isLimitedLiabilityCorporation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                             &lt;element name="isForeignOwnedAndLocated" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                             &lt;element name="profitStructure">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="isForProfitOrganization" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                                       &lt;element name="isNonprofitOrganization" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                                       &lt;element name="isOtherNotForProfitOrganization" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="isShelteredWorkshop" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                             &lt;element name="stateOfIncorporation" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="countryOfIncorporation" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="organizationalType" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="numberOfEmployees" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="annualRevenue" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                           &lt;/all>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="typeOfEducationalEntity">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;all>
         *                             &lt;element name="is1862LandGrantCollege" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                             &lt;element name="is1890LandGrantCollege" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                             &lt;element name="is1994LandGrantCollege" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                             &lt;element name="isHistoricallyBlackCollegeOrUniversity" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                             &lt;element name="isMinorityInstitution" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                             &lt;element name="isPrivateUniversityOrCollege" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                             &lt;element name="isSchoolOfForestry" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                             &lt;element name="isStateControlledInstitutionofHigherLearning" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                             &lt;element name="isTribalCollege" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                             &lt;element name="isVeterinaryCollege" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                             &lt;element name="isAlaskanNativeServicingInstitution" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                             &lt;element name="isNativeHawaiianServicingInstitution" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                           &lt;/all>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="vendorCertifications">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;all>
         *                             &lt;element name="isDOTCertifiedDisadvantagedBusinessEnterprise" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                             &lt;element name="isSelfCertifiedSmallDisadvantagedBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                             &lt;element name="isSBACertifiedSmallDisadvantagedBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                             &lt;element name="isSBACertified8AProgramParticipant" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                             &lt;element name="isSBACertifiedHUBZone" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                             &lt;element name="isSBACertified8AJointVenture" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                           &lt;/all>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="vendorLocation">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;all>
         *                             &lt;element name="streetAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="streetAddress2" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="streetAddress3" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="state">
         *                               &lt;complexType>
         *                                 &lt;simpleContent>
         *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                                     &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/extension>
         *                                 &lt;/simpleContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="ZIPCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="countryCode">
         *                               &lt;complexType>
         *                                 &lt;simpleContent>
         *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                                     &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/extension>
         *                                 &lt;/simpleContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="phoneNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="faxNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="congressionalDistrictCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                           &lt;/all>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="vendorSiteCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="vendorAlternateSiteCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="vendorDUNSInformation">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="DUNSNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="vendorName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="parentDUNSNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="domesticParentDUNSNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="globalParentDUNSNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="parentDUNSName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="domesticParentDUNSName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="globalParentDUNSName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="divisionName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="divisionNumberOrOfficeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="ccrRegistrationDetails">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="registrationDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="renewalDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
         *         &lt;element name="CCRException">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>unsignedByte">
         *                 &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="contractingOfficerBusinessSizeDetermination">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
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
            "vendorHeader",
            "vendorSiteDetails",
            "ccrException",
            "contractingOfficerBusinessSizeDetermination"
        })
        public static class Vendor {

            @XmlElement(required = true)
            protected ListOfAwards.Award.Vendor.VendorHeader vendorHeader;
            @XmlElement(required = true)
            protected ListOfAwards.Award.Vendor.VendorSiteDetails vendorSiteDetails;
            @XmlElement(name = "CCRException", required = true)
            protected ListOfAwards.Award.Vendor.CCRException ccrException;
            @XmlElement(required = true)
            protected ListOfAwards.Award.Vendor.ContractingOfficerBusinessSizeDetermination contractingOfficerBusinessSizeDetermination;

            /**
             * Gets the value of the vendorHeader property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfAwards.Award.Vendor.VendorHeader }
             *     
             */
            public ListOfAwards.Award.Vendor.VendorHeader getVendorHeader() {
                return vendorHeader;
            }

            /**
             * Sets the value of the vendorHeader property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfAwards.Award.Vendor.VendorHeader }
             *     
             */
            public void setVendorHeader(ListOfAwards.Award.Vendor.VendorHeader value) {
                this.vendorHeader = value;
            }

            /**
             * Gets the value of the vendorSiteDetails property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfAwards.Award.Vendor.VendorSiteDetails }
             *     
             */
            public ListOfAwards.Award.Vendor.VendorSiteDetails getVendorSiteDetails() {
                return vendorSiteDetails;
            }

            /**
             * Sets the value of the vendorSiteDetails property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfAwards.Award.Vendor.VendorSiteDetails }
             *     
             */
            public void setVendorSiteDetails(ListOfAwards.Award.Vendor.VendorSiteDetails value) {
                this.vendorSiteDetails = value;
            }

            /**
             * Gets the value of the ccrException property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfAwards.Award.Vendor.CCRException }
             *     
             */
            public ListOfAwards.Award.Vendor.CCRException getCCRException() {
                return ccrException;
            }

            /**
             * Sets the value of the ccrException property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfAwards.Award.Vendor.CCRException }
             *     
             */
            public void setCCRException(ListOfAwards.Award.Vendor.CCRException value) {
                this.ccrException = value;
            }

            /**
             * Gets the value of the contractingOfficerBusinessSizeDetermination property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfAwards.Award.Vendor.ContractingOfficerBusinessSizeDetermination }
             *     
             */
            public ListOfAwards.Award.Vendor.ContractingOfficerBusinessSizeDetermination getContractingOfficerBusinessSizeDetermination() {
                return contractingOfficerBusinessSizeDetermination;
            }

            /**
             * Sets the value of the contractingOfficerBusinessSizeDetermination property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfAwards.Award.Vendor.ContractingOfficerBusinessSizeDetermination }
             *     
             */
            public void setContractingOfficerBusinessSizeDetermination(ListOfAwards.Award.Vendor.ContractingOfficerBusinessSizeDetermination value) {
                this.contractingOfficerBusinessSizeDetermination = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>unsignedByte">
             *       &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class CCRException {

                @XmlValue
                @XmlSchemaType(name = "unsignedByte")
                protected short value;
                @XmlAttribute(required = true)
                protected String description;

                /**
                 * Gets the value of the value property.
                 * 
                 */
                public short getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 */
                public void setValue(short value) {
                    this.value = value;
                }

                /**
                 * Gets the value of the description property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDescription() {
                    return description;
                }

                /**
                 * Sets the value of the description property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDescription(String value) {
                    this.description = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class ContractingOfficerBusinessSizeDetermination {

                @XmlValue
                protected String value;
                @XmlAttribute(required = true)
                protected String description;

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

                /**
                 * Gets the value of the description property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDescription() {
                    return description;
                }

                /**
                 * Sets the value of the description property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDescription(String value) {
                    this.description = value;
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
             *         &lt;element name="vendorName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="vendorAlternateName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="vendorLegalOrganizationName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="vendorDoingAsBusinessName" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "vendorName",
                "vendorAlternateName",
                "vendorLegalOrganizationName",
                "vendorDoingAsBusinessName"
            })
            public static class VendorHeader {

                @XmlElement(required = true)
                protected String vendorName;
                @XmlElement(required = true)
                protected String vendorAlternateName;
                @XmlElement(required = true)
                protected String vendorLegalOrganizationName;
                @XmlElement(required = true)
                protected String vendorDoingAsBusinessName;

                /**
                 * Gets the value of the vendorName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVendorName() {
                    return vendorName;
                }

                /**
                 * Sets the value of the vendorName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVendorName(String value) {
                    this.vendorName = value;
                }

                /**
                 * Gets the value of the vendorAlternateName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVendorAlternateName() {
                    return vendorAlternateName;
                }

                /**
                 * Sets the value of the vendorAlternateName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVendorAlternateName(String value) {
                    this.vendorAlternateName = value;
                }

                /**
                 * Gets the value of the vendorLegalOrganizationName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVendorLegalOrganizationName() {
                    return vendorLegalOrganizationName;
                }

                /**
                 * Sets the value of the vendorLegalOrganizationName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVendorLegalOrganizationName(String value) {
                    this.vendorLegalOrganizationName = value;
                }

                /**
                 * Gets the value of the vendorDoingAsBusinessName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVendorDoingAsBusinessName() {
                    return vendorDoingAsBusinessName;
                }

                /**
                 * Sets the value of the vendorDoingAsBusinessName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVendorDoingAsBusinessName(String value) {
                    this.vendorDoingAsBusinessName = value;
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
             *         &lt;element name="vendorSocioEconomicIndicators">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="isEconomicallyDisadvantagedWomenOwnedSmallBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                   &lt;element name="isJointVentureEconomicallyDisadvantagedWomenOwnedSmallBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                   &lt;element name="isJointVentureWomenOwnedSmallBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                   &lt;element name="isWomenOwnedSmallBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                   &lt;element name="isAlaskanNativeOwnedCorporationOrFirm" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                   &lt;element name="isAmericanIndianOwned" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                   &lt;element name="isIndianTribe" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                   &lt;element name="isNativeHawaiianOwnedOrganizationOrFirm" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                   &lt;element name="isTriballyOwnedFirm" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                   &lt;element name="isVeteranOwned" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                   &lt;element name="isServiceRelatedDisabledVeteranOwnedBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                   &lt;element name="isWomenOwned" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                   &lt;element name="minorityOwned">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="isMinorityOwned" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                             &lt;element name="isSubContinentAsianAmericanOwnedBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                             &lt;element name="isAsianPacificAmericanOwnedBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                             &lt;element name="isBlackAmericanOwnedBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                             &lt;element name="isHispanicAmericanOwnedBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                             &lt;element name="isNativeAmericanOwnedBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                             &lt;element name="isOtherMinorityOwned" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="isVerySmallBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="vendorBusinessTypes">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="isCommunityDevelopedCorporationOwnedFirm" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                   &lt;element name="isLaborSurplusAreaFirm" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                   &lt;element name="federalGovernment">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="isFederalGovernment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                             &lt;element name="isFederallyFundedResearchAndDevelopmentCorp" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                             &lt;element name="isFederalGovernmentAgency" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="isStateGovernment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                   &lt;element name="localGovernment">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="isLocalGovernment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                             &lt;element name="isCityLocalGovernment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                             &lt;element name="isCountyLocalGovernment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                             &lt;element name="isInterMunicipalLocalGovernment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                             &lt;element name="isLocalGovernmentOwned" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                             &lt;element name="isMunicipalityLocalGovernment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                             &lt;element name="isSchoolDistrictLocalGovernment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                             &lt;element name="isTownshipLocalGovernment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="isTribalGovernment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                   &lt;element name="isForeignGovernment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                   &lt;element name="businessOrOrganizationType">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="isCorporateEntityNotTaxExempt" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                             &lt;element name="isCorporateEntityTaxExempt" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                             &lt;element name="isPartnershipOrLimitedLiabilityPartnership" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                             &lt;element name="isSolePropreitorship" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                             &lt;element name="isSmallAgriculturalCooperative" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                             &lt;element name="isInternationalOrganization" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                             &lt;element name="isUSGovernmentEntity" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
             *         &lt;element name="vendorLineOfBusiness">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="isCommunityDevelopmentCorporation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                   &lt;element name="isDomesticShelter" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                   &lt;element name="isEducationalInstitution" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                   &lt;element name="isFoundation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                   &lt;element name="isHospital" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                   &lt;element name="isManufacturerOfGoods" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                   &lt;element name="isVeterinaryHospital" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                   &lt;element name="isHispanicServicingInstitution" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="vendorRelationshipWithFederalGovernment">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="receivesContracts" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                   &lt;element name="receivesGrants" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                   &lt;element name="receivesContractsAndGrants" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="typeOfGovernmentEntity">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="isAirportAuthority" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                   &lt;element name="isCouncilOfGovernments" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                   &lt;element name="isHousingAuthoritiesPublicOrTribal" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                   &lt;element name="isInterstateEntity" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                   &lt;element name="isPlanningCommission" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                   &lt;element name="isPortAuthority" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                   &lt;element name="isTransitAuthority" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="vendorOrganizationFactors">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;all>
             *                   &lt;element name="isSubchapterSCorporation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                   &lt;element name="isLimitedLiabilityCorporation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                   &lt;element name="isForeignOwnedAndLocated" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                   &lt;element name="profitStructure">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="isForProfitOrganization" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                             &lt;element name="isNonprofitOrganization" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                             &lt;element name="isOtherNotForProfitOrganization" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="isShelteredWorkshop" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                   &lt;element name="stateOfIncorporation" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="countryOfIncorporation" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="organizationalType" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="numberOfEmployees" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="annualRevenue" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                 &lt;/all>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="typeOfEducationalEntity">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;all>
             *                   &lt;element name="is1862LandGrantCollege" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                   &lt;element name="is1890LandGrantCollege" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                   &lt;element name="is1994LandGrantCollege" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                   &lt;element name="isHistoricallyBlackCollegeOrUniversity" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                   &lt;element name="isMinorityInstitution" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                   &lt;element name="isPrivateUniversityOrCollege" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                   &lt;element name="isSchoolOfForestry" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                   &lt;element name="isStateControlledInstitutionofHigherLearning" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                   &lt;element name="isTribalCollege" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                   &lt;element name="isVeterinaryCollege" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                   &lt;element name="isAlaskanNativeServicingInstitution" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                   &lt;element name="isNativeHawaiianServicingInstitution" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                 &lt;/all>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="vendorCertifications">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;all>
             *                   &lt;element name="isDOTCertifiedDisadvantagedBusinessEnterprise" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                   &lt;element name="isSelfCertifiedSmallDisadvantagedBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                   &lt;element name="isSBACertifiedSmallDisadvantagedBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                   &lt;element name="isSBACertified8AProgramParticipant" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                   &lt;element name="isSBACertifiedHUBZone" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                   &lt;element name="isSBACertified8AJointVenture" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                 &lt;/all>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="vendorLocation">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;all>
             *                   &lt;element name="streetAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="streetAddress2" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="streetAddress3" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="state">
             *                     &lt;complexType>
             *                       &lt;simpleContent>
             *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/extension>
             *                       &lt;/simpleContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="ZIPCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="countryCode">
             *                     &lt;complexType>
             *                       &lt;simpleContent>
             *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/extension>
             *                       &lt;/simpleContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="phoneNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="faxNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="congressionalDistrictCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                 &lt;/all>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="vendorSiteCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="vendorAlternateSiteCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="vendorDUNSInformation">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="DUNSNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="vendorName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="parentDUNSNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="domesticParentDUNSNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="globalParentDUNSNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="parentDUNSName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="domesticParentDUNSName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="globalParentDUNSName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="divisionName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="divisionNumberOrOfficeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="ccrRegistrationDetails">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="registrationDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="renewalDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "vendorSocioEconomicIndicators",
                "vendorBusinessTypes",
                "vendorLineOfBusiness",
                "vendorRelationshipWithFederalGovernment",
                "typeOfGovernmentEntity",
                "vendorOrganizationFactors",
                "typeOfEducationalEntity",
                "vendorCertifications",
                "vendorLocation",
                "vendorSiteCode",
                "vendorAlternateSiteCode",
                "vendorDUNSInformation",
                "divisionName",
                "divisionNumberOrOfficeCode",
                "ccrRegistrationDetails"
            })
            public static class VendorSiteDetails {

                @XmlElement(required = true)
                protected ListOfAwards.Award.Vendor.VendorSiteDetails.VendorSocioEconomicIndicators vendorSocioEconomicIndicators;
                @XmlElement(required = true)
                protected ListOfAwards.Award.Vendor.VendorSiteDetails.VendorBusinessTypes vendorBusinessTypes;
                @XmlElement(required = true)
                protected ListOfAwards.Award.Vendor.VendorSiteDetails.VendorLineOfBusiness vendorLineOfBusiness;
                @XmlElement(required = true)
                protected ListOfAwards.Award.Vendor.VendorSiteDetails.VendorRelationshipWithFederalGovernment vendorRelationshipWithFederalGovernment;
                @XmlElement(required = true)
                protected ListOfAwards.Award.Vendor.VendorSiteDetails.TypeOfGovernmentEntity typeOfGovernmentEntity;
                @XmlElement(required = true)
                protected ListOfAwards.Award.Vendor.VendorSiteDetails.VendorOrganizationFactors vendorOrganizationFactors;
                @XmlElement(required = true)
                protected ListOfAwards.Award.Vendor.VendorSiteDetails.TypeOfEducationalEntity typeOfEducationalEntity;
                @XmlElement(required = true)
                protected ListOfAwards.Award.Vendor.VendorSiteDetails.VendorCertifications vendorCertifications;
                @XmlElement(required = true)
                protected ListOfAwards.Award.Vendor.VendorSiteDetails.VendorLocation vendorLocation;
                @XmlElement(required = true)
                protected String vendorSiteCode;
                @XmlElement(required = true)
                protected String vendorAlternateSiteCode;
                @XmlElement(required = true)
                protected ListOfAwards.Award.Vendor.VendorSiteDetails.VendorDUNSInformation vendorDUNSInformation;
                @XmlElement(required = true)
                protected String divisionName;
                @XmlElement(required = true)
                protected String divisionNumberOrOfficeCode;
                @XmlElement(required = true)
                protected ListOfAwards.Award.Vendor.VendorSiteDetails.CcrRegistrationDetails ccrRegistrationDetails;

                /**
                 * Gets the value of the vendorSocioEconomicIndicators property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ListOfAwards.Award.Vendor.VendorSiteDetails.VendorSocioEconomicIndicators }
                 *     
                 */
                public ListOfAwards.Award.Vendor.VendorSiteDetails.VendorSocioEconomicIndicators getVendorSocioEconomicIndicators() {
                    return vendorSocioEconomicIndicators;
                }

                /**
                 * Sets the value of the vendorSocioEconomicIndicators property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ListOfAwards.Award.Vendor.VendorSiteDetails.VendorSocioEconomicIndicators }
                 *     
                 */
                public void setVendorSocioEconomicIndicators(ListOfAwards.Award.Vendor.VendorSiteDetails.VendorSocioEconomicIndicators value) {
                    this.vendorSocioEconomicIndicators = value;
                }

                /**
                 * Gets the value of the vendorBusinessTypes property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ListOfAwards.Award.Vendor.VendorSiteDetails.VendorBusinessTypes }
                 *     
                 */
                public ListOfAwards.Award.Vendor.VendorSiteDetails.VendorBusinessTypes getVendorBusinessTypes() {
                    return vendorBusinessTypes;
                }

                /**
                 * Sets the value of the vendorBusinessTypes property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ListOfAwards.Award.Vendor.VendorSiteDetails.VendorBusinessTypes }
                 *     
                 */
                public void setVendorBusinessTypes(ListOfAwards.Award.Vendor.VendorSiteDetails.VendorBusinessTypes value) {
                    this.vendorBusinessTypes = value;
                }

                /**
                 * Gets the value of the vendorLineOfBusiness property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ListOfAwards.Award.Vendor.VendorSiteDetails.VendorLineOfBusiness }
                 *     
                 */
                public ListOfAwards.Award.Vendor.VendorSiteDetails.VendorLineOfBusiness getVendorLineOfBusiness() {
                    return vendorLineOfBusiness;
                }

                /**
                 * Sets the value of the vendorLineOfBusiness property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ListOfAwards.Award.Vendor.VendorSiteDetails.VendorLineOfBusiness }
                 *     
                 */
                public void setVendorLineOfBusiness(ListOfAwards.Award.Vendor.VendorSiteDetails.VendorLineOfBusiness value) {
                    this.vendorLineOfBusiness = value;
                }

                /**
                 * Gets the value of the vendorRelationshipWithFederalGovernment property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ListOfAwards.Award.Vendor.VendorSiteDetails.VendorRelationshipWithFederalGovernment }
                 *     
                 */
                public ListOfAwards.Award.Vendor.VendorSiteDetails.VendorRelationshipWithFederalGovernment getVendorRelationshipWithFederalGovernment() {
                    return vendorRelationshipWithFederalGovernment;
                }

                /**
                 * Sets the value of the vendorRelationshipWithFederalGovernment property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ListOfAwards.Award.Vendor.VendorSiteDetails.VendorRelationshipWithFederalGovernment }
                 *     
                 */
                public void setVendorRelationshipWithFederalGovernment(ListOfAwards.Award.Vendor.VendorSiteDetails.VendorRelationshipWithFederalGovernment value) {
                    this.vendorRelationshipWithFederalGovernment = value;
                }

                /**
                 * Gets the value of the typeOfGovernmentEntity property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ListOfAwards.Award.Vendor.VendorSiteDetails.TypeOfGovernmentEntity }
                 *     
                 */
                public ListOfAwards.Award.Vendor.VendorSiteDetails.TypeOfGovernmentEntity getTypeOfGovernmentEntity() {
                    return typeOfGovernmentEntity;
                }

                /**
                 * Sets the value of the typeOfGovernmentEntity property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ListOfAwards.Award.Vendor.VendorSiteDetails.TypeOfGovernmentEntity }
                 *     
                 */
                public void setTypeOfGovernmentEntity(ListOfAwards.Award.Vendor.VendorSiteDetails.TypeOfGovernmentEntity value) {
                    this.typeOfGovernmentEntity = value;
                }

                /**
                 * Gets the value of the vendorOrganizationFactors property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ListOfAwards.Award.Vendor.VendorSiteDetails.VendorOrganizationFactors }
                 *     
                 */
                public ListOfAwards.Award.Vendor.VendorSiteDetails.VendorOrganizationFactors getVendorOrganizationFactors() {
                    return vendorOrganizationFactors;
                }

                /**
                 * Sets the value of the vendorOrganizationFactors property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ListOfAwards.Award.Vendor.VendorSiteDetails.VendorOrganizationFactors }
                 *     
                 */
                public void setVendorOrganizationFactors(ListOfAwards.Award.Vendor.VendorSiteDetails.VendorOrganizationFactors value) {
                    this.vendorOrganizationFactors = value;
                }

                /**
                 * Gets the value of the typeOfEducationalEntity property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ListOfAwards.Award.Vendor.VendorSiteDetails.TypeOfEducationalEntity }
                 *     
                 */
                public ListOfAwards.Award.Vendor.VendorSiteDetails.TypeOfEducationalEntity getTypeOfEducationalEntity() {
                    return typeOfEducationalEntity;
                }

                /**
                 * Sets the value of the typeOfEducationalEntity property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ListOfAwards.Award.Vendor.VendorSiteDetails.TypeOfEducationalEntity }
                 *     
                 */
                public void setTypeOfEducationalEntity(ListOfAwards.Award.Vendor.VendorSiteDetails.TypeOfEducationalEntity value) {
                    this.typeOfEducationalEntity = value;
                }

                /**
                 * Gets the value of the vendorCertifications property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ListOfAwards.Award.Vendor.VendorSiteDetails.VendorCertifications }
                 *     
                 */
                public ListOfAwards.Award.Vendor.VendorSiteDetails.VendorCertifications getVendorCertifications() {
                    return vendorCertifications;
                }

                /**
                 * Sets the value of the vendorCertifications property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ListOfAwards.Award.Vendor.VendorSiteDetails.VendorCertifications }
                 *     
                 */
                public void setVendorCertifications(ListOfAwards.Award.Vendor.VendorSiteDetails.VendorCertifications value) {
                    this.vendorCertifications = value;
                }

                /**
                 * Gets the value of the vendorLocation property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ListOfAwards.Award.Vendor.VendorSiteDetails.VendorLocation }
                 *     
                 */
                public ListOfAwards.Award.Vendor.VendorSiteDetails.VendorLocation getVendorLocation() {
                    return vendorLocation;
                }

                /**
                 * Sets the value of the vendorLocation property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ListOfAwards.Award.Vendor.VendorSiteDetails.VendorLocation }
                 *     
                 */
                public void setVendorLocation(ListOfAwards.Award.Vendor.VendorSiteDetails.VendorLocation value) {
                    this.vendorLocation = value;
                }

                /**
                 * Gets the value of the vendorSiteCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVendorSiteCode() {
                    return vendorSiteCode;
                }

                /**
                 * Sets the value of the vendorSiteCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVendorSiteCode(String value) {
                    this.vendorSiteCode = value;
                }

                /**
                 * Gets the value of the vendorAlternateSiteCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVendorAlternateSiteCode() {
                    return vendorAlternateSiteCode;
                }

                /**
                 * Sets the value of the vendorAlternateSiteCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVendorAlternateSiteCode(String value) {
                    this.vendorAlternateSiteCode = value;
                }

                /**
                 * Gets the value of the vendorDUNSInformation property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ListOfAwards.Award.Vendor.VendorSiteDetails.VendorDUNSInformation }
                 *     
                 */
                public ListOfAwards.Award.Vendor.VendorSiteDetails.VendorDUNSInformation getVendorDUNSInformation() {
                    return vendorDUNSInformation;
                }

                /**
                 * Sets the value of the vendorDUNSInformation property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ListOfAwards.Award.Vendor.VendorSiteDetails.VendorDUNSInformation }
                 *     
                 */
                public void setVendorDUNSInformation(ListOfAwards.Award.Vendor.VendorSiteDetails.VendorDUNSInformation value) {
                    this.vendorDUNSInformation = value;
                }

                /**
                 * Gets the value of the divisionName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDivisionName() {
                    return divisionName;
                }

                /**
                 * Sets the value of the divisionName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDivisionName(String value) {
                    this.divisionName = value;
                }

                /**
                 * Gets the value of the divisionNumberOrOfficeCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDivisionNumberOrOfficeCode() {
                    return divisionNumberOrOfficeCode;
                }

                /**
                 * Sets the value of the divisionNumberOrOfficeCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDivisionNumberOrOfficeCode(String value) {
                    this.divisionNumberOrOfficeCode = value;
                }

                /**
                 * Gets the value of the ccrRegistrationDetails property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ListOfAwards.Award.Vendor.VendorSiteDetails.CcrRegistrationDetails }
                 *     
                 */
                public ListOfAwards.Award.Vendor.VendorSiteDetails.CcrRegistrationDetails getCcrRegistrationDetails() {
                    return ccrRegistrationDetails;
                }

                /**
                 * Sets the value of the ccrRegistrationDetails property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ListOfAwards.Award.Vendor.VendorSiteDetails.CcrRegistrationDetails }
                 *     
                 */
                public void setCcrRegistrationDetails(ListOfAwards.Award.Vendor.VendorSiteDetails.CcrRegistrationDetails value) {
                    this.ccrRegistrationDetails = value;
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
                 *         &lt;element name="registrationDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="renewalDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                    "registrationDate",
                    "renewalDate"
                })
                public static class CcrRegistrationDetails {

                    @XmlElement(required = true)
                    protected String registrationDate;
                    @XmlElement(required = true)
                    protected String renewalDate;

                    /**
                     * Gets the value of the registrationDate property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getRegistrationDate() {
                        return registrationDate;
                    }

                    /**
                     * Sets the value of the registrationDate property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setRegistrationDate(String value) {
                        this.registrationDate = value;
                    }

                    /**
                     * Gets the value of the renewalDate property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getRenewalDate() {
                        return renewalDate;
                    }

                    /**
                     * Sets the value of the renewalDate property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setRenewalDate(String value) {
                        this.renewalDate = value;
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
                 *       &lt;all>
                 *         &lt;element name="is1862LandGrantCollege" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *         &lt;element name="is1890LandGrantCollege" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *         &lt;element name="is1994LandGrantCollege" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *         &lt;element name="isHistoricallyBlackCollegeOrUniversity" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *         &lt;element name="isMinorityInstitution" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *         &lt;element name="isPrivateUniversityOrCollege" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *         &lt;element name="isSchoolOfForestry" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *         &lt;element name="isStateControlledInstitutionofHigherLearning" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *         &lt;element name="isTribalCollege" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *         &lt;element name="isVeterinaryCollege" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *         &lt;element name="isAlaskanNativeServicingInstitution" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *         &lt;element name="isNativeHawaiianServicingInstitution" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *       &lt;/all>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {

                })
                public static class TypeOfEducationalEntity {

                    protected boolean is1862LandGrantCollege;
                    protected boolean is1890LandGrantCollege;
                    protected boolean is1994LandGrantCollege;
                    protected boolean isHistoricallyBlackCollegeOrUniversity;
                    protected boolean isMinorityInstitution;
                    protected boolean isPrivateUniversityOrCollege;
                    protected boolean isSchoolOfForestry;
                    protected boolean isStateControlledInstitutionofHigherLearning;
                    protected boolean isTribalCollege;
                    protected boolean isVeterinaryCollege;
                    protected boolean isAlaskanNativeServicingInstitution;
                    protected boolean isNativeHawaiianServicingInstitution;

                    /**
                     * Gets the value of the is1862LandGrantCollege property.
                     * 
                     */
                    public boolean isIs1862LandGrantCollege() {
                        return is1862LandGrantCollege;
                    }

                    /**
                     * Sets the value of the is1862LandGrantCollege property.
                     * 
                     */
                    public void setIs1862LandGrantCollege(boolean value) {
                        this.is1862LandGrantCollege = value;
                    }

                    /**
                     * Gets the value of the is1890LandGrantCollege property.
                     * 
                     */
                    public boolean isIs1890LandGrantCollege() {
                        return is1890LandGrantCollege;
                    }

                    /**
                     * Sets the value of the is1890LandGrantCollege property.
                     * 
                     */
                    public void setIs1890LandGrantCollege(boolean value) {
                        this.is1890LandGrantCollege = value;
                    }

                    /**
                     * Gets the value of the is1994LandGrantCollege property.
                     * 
                     */
                    public boolean isIs1994LandGrantCollege() {
                        return is1994LandGrantCollege;
                    }

                    /**
                     * Sets the value of the is1994LandGrantCollege property.
                     * 
                     */
                    public void setIs1994LandGrantCollege(boolean value) {
                        this.is1994LandGrantCollege = value;
                    }

                    /**
                     * Gets the value of the isHistoricallyBlackCollegeOrUniversity property.
                     * 
                     */
                    public boolean isIsHistoricallyBlackCollegeOrUniversity() {
                        return isHistoricallyBlackCollegeOrUniversity;
                    }

                    /**
                     * Sets the value of the isHistoricallyBlackCollegeOrUniversity property.
                     * 
                     */
                    public void setIsHistoricallyBlackCollegeOrUniversity(boolean value) {
                        this.isHistoricallyBlackCollegeOrUniversity = value;
                    }

                    /**
                     * Gets the value of the isMinorityInstitution property.
                     * 
                     */
                    public boolean isIsMinorityInstitution() {
                        return isMinorityInstitution;
                    }

                    /**
                     * Sets the value of the isMinorityInstitution property.
                     * 
                     */
                    public void setIsMinorityInstitution(boolean value) {
                        this.isMinorityInstitution = value;
                    }

                    /**
                     * Gets the value of the isPrivateUniversityOrCollege property.
                     * 
                     */
                    public boolean isIsPrivateUniversityOrCollege() {
                        return isPrivateUniversityOrCollege;
                    }

                    /**
                     * Sets the value of the isPrivateUniversityOrCollege property.
                     * 
                     */
                    public void setIsPrivateUniversityOrCollege(boolean value) {
                        this.isPrivateUniversityOrCollege = value;
                    }

                    /**
                     * Gets the value of the isSchoolOfForestry property.
                     * 
                     */
                    public boolean isIsSchoolOfForestry() {
                        return isSchoolOfForestry;
                    }

                    /**
                     * Sets the value of the isSchoolOfForestry property.
                     * 
                     */
                    public void setIsSchoolOfForestry(boolean value) {
                        this.isSchoolOfForestry = value;
                    }

                    /**
                     * Gets the value of the isStateControlledInstitutionofHigherLearning property.
                     * 
                     */
                    public boolean isIsStateControlledInstitutionofHigherLearning() {
                        return isStateControlledInstitutionofHigherLearning;
                    }

                    /**
                     * Sets the value of the isStateControlledInstitutionofHigherLearning property.
                     * 
                     */
                    public void setIsStateControlledInstitutionofHigherLearning(boolean value) {
                        this.isStateControlledInstitutionofHigherLearning = value;
                    }

                    /**
                     * Gets the value of the isTribalCollege property.
                     * 
                     */
                    public boolean isIsTribalCollege() {
                        return isTribalCollege;
                    }

                    /**
                     * Sets the value of the isTribalCollege property.
                     * 
                     */
                    public void setIsTribalCollege(boolean value) {
                        this.isTribalCollege = value;
                    }

                    /**
                     * Gets the value of the isVeterinaryCollege property.
                     * 
                     */
                    public boolean isIsVeterinaryCollege() {
                        return isVeterinaryCollege;
                    }

                    /**
                     * Sets the value of the isVeterinaryCollege property.
                     * 
                     */
                    public void setIsVeterinaryCollege(boolean value) {
                        this.isVeterinaryCollege = value;
                    }

                    /**
                     * Gets the value of the isAlaskanNativeServicingInstitution property.
                     * 
                     */
                    public boolean isIsAlaskanNativeServicingInstitution() {
                        return isAlaskanNativeServicingInstitution;
                    }

                    /**
                     * Sets the value of the isAlaskanNativeServicingInstitution property.
                     * 
                     */
                    public void setIsAlaskanNativeServicingInstitution(boolean value) {
                        this.isAlaskanNativeServicingInstitution = value;
                    }

                    /**
                     * Gets the value of the isNativeHawaiianServicingInstitution property.
                     * 
                     */
                    public boolean isIsNativeHawaiianServicingInstitution() {
                        return isNativeHawaiianServicingInstitution;
                    }

                    /**
                     * Sets the value of the isNativeHawaiianServicingInstitution property.
                     * 
                     */
                    public void setIsNativeHawaiianServicingInstitution(boolean value) {
                        this.isNativeHawaiianServicingInstitution = value;
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
                 *         &lt;element name="isAirportAuthority" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *         &lt;element name="isCouncilOfGovernments" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *         &lt;element name="isHousingAuthoritiesPublicOrTribal" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *         &lt;element name="isInterstateEntity" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *         &lt;element name="isPlanningCommission" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *         &lt;element name="isPortAuthority" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *         &lt;element name="isTransitAuthority" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
                    "isAirportAuthority",
                    "isCouncilOfGovernments",
                    "isHousingAuthoritiesPublicOrTribal",
                    "isInterstateEntity",
                    "isPlanningCommission",
                    "isPortAuthority",
                    "isTransitAuthority"
                })
                public static class TypeOfGovernmentEntity {

                    protected boolean isAirportAuthority;
                    protected boolean isCouncilOfGovernments;
                    protected boolean isHousingAuthoritiesPublicOrTribal;
                    protected boolean isInterstateEntity;
                    protected boolean isPlanningCommission;
                    protected boolean isPortAuthority;
                    protected boolean isTransitAuthority;

                    /**
                     * Gets the value of the isAirportAuthority property.
                     * 
                     */
                    public boolean isIsAirportAuthority() {
                        return isAirportAuthority;
                    }

                    /**
                     * Sets the value of the isAirportAuthority property.
                     * 
                     */
                    public void setIsAirportAuthority(boolean value) {
                        this.isAirportAuthority = value;
                    }

                    /**
                     * Gets the value of the isCouncilOfGovernments property.
                     * 
                     */
                    public boolean isIsCouncilOfGovernments() {
                        return isCouncilOfGovernments;
                    }

                    /**
                     * Sets the value of the isCouncilOfGovernments property.
                     * 
                     */
                    public void setIsCouncilOfGovernments(boolean value) {
                        this.isCouncilOfGovernments = value;
                    }

                    /**
                     * Gets the value of the isHousingAuthoritiesPublicOrTribal property.
                     * 
                     */
                    public boolean isIsHousingAuthoritiesPublicOrTribal() {
                        return isHousingAuthoritiesPublicOrTribal;
                    }

                    /**
                     * Sets the value of the isHousingAuthoritiesPublicOrTribal property.
                     * 
                     */
                    public void setIsHousingAuthoritiesPublicOrTribal(boolean value) {
                        this.isHousingAuthoritiesPublicOrTribal = value;
                    }

                    /**
                     * Gets the value of the isInterstateEntity property.
                     * 
                     */
                    public boolean isIsInterstateEntity() {
                        return isInterstateEntity;
                    }

                    /**
                     * Sets the value of the isInterstateEntity property.
                     * 
                     */
                    public void setIsInterstateEntity(boolean value) {
                        this.isInterstateEntity = value;
                    }

                    /**
                     * Gets the value of the isPlanningCommission property.
                     * 
                     */
                    public boolean isIsPlanningCommission() {
                        return isPlanningCommission;
                    }

                    /**
                     * Sets the value of the isPlanningCommission property.
                     * 
                     */
                    public void setIsPlanningCommission(boolean value) {
                        this.isPlanningCommission = value;
                    }

                    /**
                     * Gets the value of the isPortAuthority property.
                     * 
                     */
                    public boolean isIsPortAuthority() {
                        return isPortAuthority;
                    }

                    /**
                     * Sets the value of the isPortAuthority property.
                     * 
                     */
                    public void setIsPortAuthority(boolean value) {
                        this.isPortAuthority = value;
                    }

                    /**
                     * Gets the value of the isTransitAuthority property.
                     * 
                     */
                    public boolean isIsTransitAuthority() {
                        return isTransitAuthority;
                    }

                    /**
                     * Sets the value of the isTransitAuthority property.
                     * 
                     */
                    public void setIsTransitAuthority(boolean value) {
                        this.isTransitAuthority = value;
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
                 *         &lt;element name="isCommunityDevelopedCorporationOwnedFirm" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *         &lt;element name="isLaborSurplusAreaFirm" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *         &lt;element name="federalGovernment">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="isFederalGovernment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *                   &lt;element name="isFederallyFundedResearchAndDevelopmentCorp" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *                   &lt;element name="isFederalGovernmentAgency" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="isStateGovernment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *         &lt;element name="localGovernment">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="isLocalGovernment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *                   &lt;element name="isCityLocalGovernment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *                   &lt;element name="isCountyLocalGovernment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *                   &lt;element name="isInterMunicipalLocalGovernment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *                   &lt;element name="isLocalGovernmentOwned" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *                   &lt;element name="isMunicipalityLocalGovernment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *                   &lt;element name="isSchoolDistrictLocalGovernment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *                   &lt;element name="isTownshipLocalGovernment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="isTribalGovernment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *         &lt;element name="isForeignGovernment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *         &lt;element name="businessOrOrganizationType">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="isCorporateEntityNotTaxExempt" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *                   &lt;element name="isCorporateEntityTaxExempt" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *                   &lt;element name="isPartnershipOrLimitedLiabilityPartnership" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *                   &lt;element name="isSolePropreitorship" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *                   &lt;element name="isSmallAgriculturalCooperative" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *                   &lt;element name="isInternationalOrganization" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *                   &lt;element name="isUSGovernmentEntity" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
                    "isCommunityDevelopedCorporationOwnedFirm",
                    "isLaborSurplusAreaFirm",
                    "federalGovernment",
                    "isStateGovernment",
                    "localGovernment",
                    "isTribalGovernment",
                    "isForeignGovernment",
                    "businessOrOrganizationType"
                })
                public static class VendorBusinessTypes {

                    protected boolean isCommunityDevelopedCorporationOwnedFirm;
                    protected boolean isLaborSurplusAreaFirm;
                    @XmlElement(required = true)
                    protected ListOfAwards.Award.Vendor.VendorSiteDetails.VendorBusinessTypes.FederalGovernment federalGovernment;
                    protected boolean isStateGovernment;
                    @XmlElement(required = true)
                    protected ListOfAwards.Award.Vendor.VendorSiteDetails.VendorBusinessTypes.LocalGovernment localGovernment;
                    protected boolean isTribalGovernment;
                    protected boolean isForeignGovernment;
                    @XmlElement(required = true)
                    protected ListOfAwards.Award.Vendor.VendorSiteDetails.VendorBusinessTypes.BusinessOrOrganizationType businessOrOrganizationType;

                    /**
                     * Gets the value of the isCommunityDevelopedCorporationOwnedFirm property.
                     * 
                     */
                    public boolean isIsCommunityDevelopedCorporationOwnedFirm() {
                        return isCommunityDevelopedCorporationOwnedFirm;
                    }

                    /**
                     * Sets the value of the isCommunityDevelopedCorporationOwnedFirm property.
                     * 
                     */
                    public void setIsCommunityDevelopedCorporationOwnedFirm(boolean value) {
                        this.isCommunityDevelopedCorporationOwnedFirm = value;
                    }

                    /**
                     * Gets the value of the isLaborSurplusAreaFirm property.
                     * 
                     */
                    public boolean isIsLaborSurplusAreaFirm() {
                        return isLaborSurplusAreaFirm;
                    }

                    /**
                     * Sets the value of the isLaborSurplusAreaFirm property.
                     * 
                     */
                    public void setIsLaborSurplusAreaFirm(boolean value) {
                        this.isLaborSurplusAreaFirm = value;
                    }

                    /**
                     * Gets the value of the federalGovernment property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ListOfAwards.Award.Vendor.VendorSiteDetails.VendorBusinessTypes.FederalGovernment }
                     *     
                     */
                    public ListOfAwards.Award.Vendor.VendorSiteDetails.VendorBusinessTypes.FederalGovernment getFederalGovernment() {
                        return federalGovernment;
                    }

                    /**
                     * Sets the value of the federalGovernment property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ListOfAwards.Award.Vendor.VendorSiteDetails.VendorBusinessTypes.FederalGovernment }
                     *     
                     */
                    public void setFederalGovernment(ListOfAwards.Award.Vendor.VendorSiteDetails.VendorBusinessTypes.FederalGovernment value) {
                        this.federalGovernment = value;
                    }

                    /**
                     * Gets the value of the isStateGovernment property.
                     * 
                     */
                    public boolean isIsStateGovernment() {
                        return isStateGovernment;
                    }

                    /**
                     * Sets the value of the isStateGovernment property.
                     * 
                     */
                    public void setIsStateGovernment(boolean value) {
                        this.isStateGovernment = value;
                    }

                    /**
                     * Gets the value of the localGovernment property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ListOfAwards.Award.Vendor.VendorSiteDetails.VendorBusinessTypes.LocalGovernment }
                     *     
                     */
                    public ListOfAwards.Award.Vendor.VendorSiteDetails.VendorBusinessTypes.LocalGovernment getLocalGovernment() {
                        return localGovernment;
                    }

                    /**
                     * Sets the value of the localGovernment property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ListOfAwards.Award.Vendor.VendorSiteDetails.VendorBusinessTypes.LocalGovernment }
                     *     
                     */
                    public void setLocalGovernment(ListOfAwards.Award.Vendor.VendorSiteDetails.VendorBusinessTypes.LocalGovernment value) {
                        this.localGovernment = value;
                    }

                    /**
                     * Gets the value of the isTribalGovernment property.
                     * 
                     */
                    public boolean isIsTribalGovernment() {
                        return isTribalGovernment;
                    }

                    /**
                     * Sets the value of the isTribalGovernment property.
                     * 
                     */
                    public void setIsTribalGovernment(boolean value) {
                        this.isTribalGovernment = value;
                    }

                    /**
                     * Gets the value of the isForeignGovernment property.
                     * 
                     */
                    public boolean isIsForeignGovernment() {
                        return isForeignGovernment;
                    }

                    /**
                     * Sets the value of the isForeignGovernment property.
                     * 
                     */
                    public void setIsForeignGovernment(boolean value) {
                        this.isForeignGovernment = value;
                    }

                    /**
                     * Gets the value of the businessOrOrganizationType property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ListOfAwards.Award.Vendor.VendorSiteDetails.VendorBusinessTypes.BusinessOrOrganizationType }
                     *     
                     */
                    public ListOfAwards.Award.Vendor.VendorSiteDetails.VendorBusinessTypes.BusinessOrOrganizationType getBusinessOrOrganizationType() {
                        return businessOrOrganizationType;
                    }

                    /**
                     * Sets the value of the businessOrOrganizationType property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ListOfAwards.Award.Vendor.VendorSiteDetails.VendorBusinessTypes.BusinessOrOrganizationType }
                     *     
                     */
                    public void setBusinessOrOrganizationType(ListOfAwards.Award.Vendor.VendorSiteDetails.VendorBusinessTypes.BusinessOrOrganizationType value) {
                        this.businessOrOrganizationType = value;
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
                     *         &lt;element name="isCorporateEntityNotTaxExempt" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                     *         &lt;element name="isCorporateEntityTaxExempt" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                     *         &lt;element name="isPartnershipOrLimitedLiabilityPartnership" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                     *         &lt;element name="isSolePropreitorship" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                     *         &lt;element name="isSmallAgriculturalCooperative" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                     *         &lt;element name="isInternationalOrganization" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                     *         &lt;element name="isUSGovernmentEntity" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
                        "isCorporateEntityNotTaxExempt",
                        "isCorporateEntityTaxExempt",
                        "isPartnershipOrLimitedLiabilityPartnership",
                        "isSolePropreitorship",
                        "isSmallAgriculturalCooperative",
                        "isInternationalOrganization",
                        "isUSGovernmentEntity"
                    })
                    public static class BusinessOrOrganizationType {

                        protected boolean isCorporateEntityNotTaxExempt;
                        protected boolean isCorporateEntityTaxExempt;
                        protected boolean isPartnershipOrLimitedLiabilityPartnership;
                        protected boolean isSolePropreitorship;
                        protected boolean isSmallAgriculturalCooperative;
                        protected boolean isInternationalOrganization;
                        protected boolean isUSGovernmentEntity;

                        /**
                         * Gets the value of the isCorporateEntityNotTaxExempt property.
                         * 
                         */
                        public boolean isIsCorporateEntityNotTaxExempt() {
                            return isCorporateEntityNotTaxExempt;
                        }

                        /**
                         * Sets the value of the isCorporateEntityNotTaxExempt property.
                         * 
                         */
                        public void setIsCorporateEntityNotTaxExempt(boolean value) {
                            this.isCorporateEntityNotTaxExempt = value;
                        }

                        /**
                         * Gets the value of the isCorporateEntityTaxExempt property.
                         * 
                         */
                        public boolean isIsCorporateEntityTaxExempt() {
                            return isCorporateEntityTaxExempt;
                        }

                        /**
                         * Sets the value of the isCorporateEntityTaxExempt property.
                         * 
                         */
                        public void setIsCorporateEntityTaxExempt(boolean value) {
                            this.isCorporateEntityTaxExempt = value;
                        }

                        /**
                         * Gets the value of the isPartnershipOrLimitedLiabilityPartnership property.
                         * 
                         */
                        public boolean isIsPartnershipOrLimitedLiabilityPartnership() {
                            return isPartnershipOrLimitedLiabilityPartnership;
                        }

                        /**
                         * Sets the value of the isPartnershipOrLimitedLiabilityPartnership property.
                         * 
                         */
                        public void setIsPartnershipOrLimitedLiabilityPartnership(boolean value) {
                            this.isPartnershipOrLimitedLiabilityPartnership = value;
                        }

                        /**
                         * Gets the value of the isSolePropreitorship property.
                         * 
                         */
                        public boolean isIsSolePropreitorship() {
                            return isSolePropreitorship;
                        }

                        /**
                         * Sets the value of the isSolePropreitorship property.
                         * 
                         */
                        public void setIsSolePropreitorship(boolean value) {
                            this.isSolePropreitorship = value;
                        }

                        /**
                         * Gets the value of the isSmallAgriculturalCooperative property.
                         * 
                         */
                        public boolean isIsSmallAgriculturalCooperative() {
                            return isSmallAgriculturalCooperative;
                        }

                        /**
                         * Sets the value of the isSmallAgriculturalCooperative property.
                         * 
                         */
                        public void setIsSmallAgriculturalCooperative(boolean value) {
                            this.isSmallAgriculturalCooperative = value;
                        }

                        /**
                         * Gets the value of the isInternationalOrganization property.
                         * 
                         */
                        public boolean isIsInternationalOrganization() {
                            return isInternationalOrganization;
                        }

                        /**
                         * Sets the value of the isInternationalOrganization property.
                         * 
                         */
                        public void setIsInternationalOrganization(boolean value) {
                            this.isInternationalOrganization = value;
                        }

                        /**
                         * Gets the value of the isUSGovernmentEntity property.
                         * 
                         */
                        public boolean isIsUSGovernmentEntity() {
                            return isUSGovernmentEntity;
                        }

                        /**
                         * Sets the value of the isUSGovernmentEntity property.
                         * 
                         */
                        public void setIsUSGovernmentEntity(boolean value) {
                            this.isUSGovernmentEntity = value;
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
                     *         &lt;element name="isFederalGovernment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                     *         &lt;element name="isFederallyFundedResearchAndDevelopmentCorp" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                     *         &lt;element name="isFederalGovernmentAgency" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
                        "isFederalGovernment",
                        "isFederallyFundedResearchAndDevelopmentCorp",
                        "isFederalGovernmentAgency"
                    })
                    public static class FederalGovernment {

                        protected boolean isFederalGovernment;
                        protected boolean isFederallyFundedResearchAndDevelopmentCorp;
                        protected boolean isFederalGovernmentAgency;

                        /**
                         * Gets the value of the isFederalGovernment property.
                         * 
                         */
                        public boolean isIsFederalGovernment() {
                            return isFederalGovernment;
                        }

                        /**
                         * Sets the value of the isFederalGovernment property.
                         * 
                         */
                        public void setIsFederalGovernment(boolean value) {
                            this.isFederalGovernment = value;
                        }

                        /**
                         * Gets the value of the isFederallyFundedResearchAndDevelopmentCorp property.
                         * 
                         */
                        public boolean isIsFederallyFundedResearchAndDevelopmentCorp() {
                            return isFederallyFundedResearchAndDevelopmentCorp;
                        }

                        /**
                         * Sets the value of the isFederallyFundedResearchAndDevelopmentCorp property.
                         * 
                         */
                        public void setIsFederallyFundedResearchAndDevelopmentCorp(boolean value) {
                            this.isFederallyFundedResearchAndDevelopmentCorp = value;
                        }

                        /**
                         * Gets the value of the isFederalGovernmentAgency property.
                         * 
                         */
                        public boolean isIsFederalGovernmentAgency() {
                            return isFederalGovernmentAgency;
                        }

                        /**
                         * Sets the value of the isFederalGovernmentAgency property.
                         * 
                         */
                        public void setIsFederalGovernmentAgency(boolean value) {
                            this.isFederalGovernmentAgency = value;
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
                     *         &lt;element name="isLocalGovernment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                     *         &lt;element name="isCityLocalGovernment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                     *         &lt;element name="isCountyLocalGovernment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                     *         &lt;element name="isInterMunicipalLocalGovernment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                     *         &lt;element name="isLocalGovernmentOwned" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                     *         &lt;element name="isMunicipalityLocalGovernment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                     *         &lt;element name="isSchoolDistrictLocalGovernment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                     *         &lt;element name="isTownshipLocalGovernment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
                        "isLocalGovernment",
                        "isCityLocalGovernment",
                        "isCountyLocalGovernment",
                        "isInterMunicipalLocalGovernment",
                        "isLocalGovernmentOwned",
                        "isMunicipalityLocalGovernment",
                        "isSchoolDistrictLocalGovernment",
                        "isTownshipLocalGovernment"
                    })
                    public static class LocalGovernment {

                        protected boolean isLocalGovernment;
                        protected boolean isCityLocalGovernment;
                        protected boolean isCountyLocalGovernment;
                        protected boolean isInterMunicipalLocalGovernment;
                        protected boolean isLocalGovernmentOwned;
                        protected boolean isMunicipalityLocalGovernment;
                        protected boolean isSchoolDistrictLocalGovernment;
                        protected boolean isTownshipLocalGovernment;

                        /**
                         * Gets the value of the isLocalGovernment property.
                         * 
                         */
                        public boolean isIsLocalGovernment() {
                            return isLocalGovernment;
                        }

                        /**
                         * Sets the value of the isLocalGovernment property.
                         * 
                         */
                        public void setIsLocalGovernment(boolean value) {
                            this.isLocalGovernment = value;
                        }

                        /**
                         * Gets the value of the isCityLocalGovernment property.
                         * 
                         */
                        public boolean isIsCityLocalGovernment() {
                            return isCityLocalGovernment;
                        }

                        /**
                         * Sets the value of the isCityLocalGovernment property.
                         * 
                         */
                        public void setIsCityLocalGovernment(boolean value) {
                            this.isCityLocalGovernment = value;
                        }

                        /**
                         * Gets the value of the isCountyLocalGovernment property.
                         * 
                         */
                        public boolean isIsCountyLocalGovernment() {
                            return isCountyLocalGovernment;
                        }

                        /**
                         * Sets the value of the isCountyLocalGovernment property.
                         * 
                         */
                        public void setIsCountyLocalGovernment(boolean value) {
                            this.isCountyLocalGovernment = value;
                        }

                        /**
                         * Gets the value of the isInterMunicipalLocalGovernment property.
                         * 
                         */
                        public boolean isIsInterMunicipalLocalGovernment() {
                            return isInterMunicipalLocalGovernment;
                        }

                        /**
                         * Sets the value of the isInterMunicipalLocalGovernment property.
                         * 
                         */
                        public void setIsInterMunicipalLocalGovernment(boolean value) {
                            this.isInterMunicipalLocalGovernment = value;
                        }

                        /**
                         * Gets the value of the isLocalGovernmentOwned property.
                         * 
                         */
                        public boolean isIsLocalGovernmentOwned() {
                            return isLocalGovernmentOwned;
                        }

                        /**
                         * Sets the value of the isLocalGovernmentOwned property.
                         * 
                         */
                        public void setIsLocalGovernmentOwned(boolean value) {
                            this.isLocalGovernmentOwned = value;
                        }

                        /**
                         * Gets the value of the isMunicipalityLocalGovernment property.
                         * 
                         */
                        public boolean isIsMunicipalityLocalGovernment() {
                            return isMunicipalityLocalGovernment;
                        }

                        /**
                         * Sets the value of the isMunicipalityLocalGovernment property.
                         * 
                         */
                        public void setIsMunicipalityLocalGovernment(boolean value) {
                            this.isMunicipalityLocalGovernment = value;
                        }

                        /**
                         * Gets the value of the isSchoolDistrictLocalGovernment property.
                         * 
                         */
                        public boolean isIsSchoolDistrictLocalGovernment() {
                            return isSchoolDistrictLocalGovernment;
                        }

                        /**
                         * Sets the value of the isSchoolDistrictLocalGovernment property.
                         * 
                         */
                        public void setIsSchoolDistrictLocalGovernment(boolean value) {
                            this.isSchoolDistrictLocalGovernment = value;
                        }

                        /**
                         * Gets the value of the isTownshipLocalGovernment property.
                         * 
                         */
                        public boolean isIsTownshipLocalGovernment() {
                            return isTownshipLocalGovernment;
                        }

                        /**
                         * Sets the value of the isTownshipLocalGovernment property.
                         * 
                         */
                        public void setIsTownshipLocalGovernment(boolean value) {
                            this.isTownshipLocalGovernment = value;
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
                 *       &lt;all>
                 *         &lt;element name="isDOTCertifiedDisadvantagedBusinessEnterprise" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *         &lt;element name="isSelfCertifiedSmallDisadvantagedBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *         &lt;element name="isSBACertifiedSmallDisadvantagedBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *         &lt;element name="isSBACertified8AProgramParticipant" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *         &lt;element name="isSBACertifiedHUBZone" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *         &lt;element name="isSBACertified8AJointVenture" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *       &lt;/all>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {

                })
                public static class VendorCertifications {

                    protected boolean isDOTCertifiedDisadvantagedBusinessEnterprise;
                    protected boolean isSelfCertifiedSmallDisadvantagedBusiness;
                    protected boolean isSBACertifiedSmallDisadvantagedBusiness;
                    protected boolean isSBACertified8AProgramParticipant;
                    protected boolean isSBACertifiedHUBZone;
                    protected boolean isSBACertified8AJointVenture;

                    /**
                     * Gets the value of the isDOTCertifiedDisadvantagedBusinessEnterprise property.
                     * 
                     */
                    public boolean isIsDOTCertifiedDisadvantagedBusinessEnterprise() {
                        return isDOTCertifiedDisadvantagedBusinessEnterprise;
                    }

                    /**
                     * Sets the value of the isDOTCertifiedDisadvantagedBusinessEnterprise property.
                     * 
                     */
                    public void setIsDOTCertifiedDisadvantagedBusinessEnterprise(boolean value) {
                        this.isDOTCertifiedDisadvantagedBusinessEnterprise = value;
                    }

                    /**
                     * Gets the value of the isSelfCertifiedSmallDisadvantagedBusiness property.
                     * 
                     */
                    public boolean isIsSelfCertifiedSmallDisadvantagedBusiness() {
                        return isSelfCertifiedSmallDisadvantagedBusiness;
                    }

                    /**
                     * Sets the value of the isSelfCertifiedSmallDisadvantagedBusiness property.
                     * 
                     */
                    public void setIsSelfCertifiedSmallDisadvantagedBusiness(boolean value) {
                        this.isSelfCertifiedSmallDisadvantagedBusiness = value;
                    }

                    /**
                     * Gets the value of the isSBACertifiedSmallDisadvantagedBusiness property.
                     * 
                     */
                    public boolean isIsSBACertifiedSmallDisadvantagedBusiness() {
                        return isSBACertifiedSmallDisadvantagedBusiness;
                    }

                    /**
                     * Sets the value of the isSBACertifiedSmallDisadvantagedBusiness property.
                     * 
                     */
                    public void setIsSBACertifiedSmallDisadvantagedBusiness(boolean value) {
                        this.isSBACertifiedSmallDisadvantagedBusiness = value;
                    }

                    /**
                     * Gets the value of the isSBACertified8AProgramParticipant property.
                     * 
                     */
                    public boolean isIsSBACertified8AProgramParticipant() {
                        return isSBACertified8AProgramParticipant;
                    }

                    /**
                     * Sets the value of the isSBACertified8AProgramParticipant property.
                     * 
                     */
                    public void setIsSBACertified8AProgramParticipant(boolean value) {
                        this.isSBACertified8AProgramParticipant = value;
                    }

                    /**
                     * Gets the value of the isSBACertifiedHUBZone property.
                     * 
                     */
                    public boolean isIsSBACertifiedHUBZone() {
                        return isSBACertifiedHUBZone;
                    }

                    /**
                     * Sets the value of the isSBACertifiedHUBZone property.
                     * 
                     */
                    public void setIsSBACertifiedHUBZone(boolean value) {
                        this.isSBACertifiedHUBZone = value;
                    }

                    /**
                     * Gets the value of the isSBACertified8AJointVenture property.
                     * 
                     */
                    public boolean isIsSBACertified8AJointVenture() {
                        return isSBACertified8AJointVenture;
                    }

                    /**
                     * Sets the value of the isSBACertified8AJointVenture property.
                     * 
                     */
                    public void setIsSBACertified8AJointVenture(boolean value) {
                        this.isSBACertified8AJointVenture = value;
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
                 *         &lt;element name="DUNSNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="vendorName" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="parentDUNSNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="domesticParentDUNSNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="globalParentDUNSNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="parentDUNSName" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="domesticParentDUNSName" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="globalParentDUNSName" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                    "dunsNumber",
                    "vendorName",
                    "parentDUNSNumber",
                    "domesticParentDUNSNumber",
                    "globalParentDUNSNumber",
                    "parentDUNSName",
                    "domesticParentDUNSName",
                    "globalParentDUNSName"
                })
                public static class VendorDUNSInformation {

                    @XmlElement(name = "DUNSNumber", required = true)
                    protected String dunsNumber;
                    @XmlElement(required = true)
                    protected String vendorName;
                    @XmlElement(required = true)
                    protected String parentDUNSNumber;
                    @XmlElement(required = true)
                    protected String domesticParentDUNSNumber;
                    @XmlElement(required = true)
                    protected String globalParentDUNSNumber;
                    @XmlElement(required = true)
                    protected String parentDUNSName;
                    @XmlElement(required = true)
                    protected String domesticParentDUNSName;
                    @XmlElement(required = true)
                    protected String globalParentDUNSName;

                    /**
                     * Gets the value of the dunsNumber property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDUNSNumber() {
                        return dunsNumber;
                    }

                    /**
                     * Sets the value of the dunsNumber property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDUNSNumber(String value) {
                        this.dunsNumber = value;
                    }

                    /**
                     * Gets the value of the vendorName property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getVendorName() {
                        return vendorName;
                    }

                    /**
                     * Sets the value of the vendorName property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setVendorName(String value) {
                        this.vendorName = value;
                    }

                    /**
                     * Gets the value of the parentDUNSNumber property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getParentDUNSNumber() {
                        return parentDUNSNumber;
                    }

                    /**
                     * Sets the value of the parentDUNSNumber property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setParentDUNSNumber(String value) {
                        this.parentDUNSNumber = value;
                    }

                    /**
                     * Gets the value of the domesticParentDUNSNumber property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDomesticParentDUNSNumber() {
                        return domesticParentDUNSNumber;
                    }

                    /**
                     * Sets the value of the domesticParentDUNSNumber property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDomesticParentDUNSNumber(String value) {
                        this.domesticParentDUNSNumber = value;
                    }

                    /**
                     * Gets the value of the globalParentDUNSNumber property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getGlobalParentDUNSNumber() {
                        return globalParentDUNSNumber;
                    }

                    /**
                     * Sets the value of the globalParentDUNSNumber property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setGlobalParentDUNSNumber(String value) {
                        this.globalParentDUNSNumber = value;
                    }

                    /**
                     * Gets the value of the parentDUNSName property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getParentDUNSName() {
                        return parentDUNSName;
                    }

                    /**
                     * Sets the value of the parentDUNSName property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setParentDUNSName(String value) {
                        this.parentDUNSName = value;
                    }

                    /**
                     * Gets the value of the domesticParentDUNSName property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDomesticParentDUNSName() {
                        return domesticParentDUNSName;
                    }

                    /**
                     * Sets the value of the domesticParentDUNSName property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDomesticParentDUNSName(String value) {
                        this.domesticParentDUNSName = value;
                    }

                    /**
                     * Gets the value of the globalParentDUNSName property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getGlobalParentDUNSName() {
                        return globalParentDUNSName;
                    }

                    /**
                     * Sets the value of the globalParentDUNSName property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setGlobalParentDUNSName(String value) {
                        this.globalParentDUNSName = value;
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
                 *         &lt;element name="isCommunityDevelopmentCorporation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *         &lt;element name="isDomesticShelter" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *         &lt;element name="isEducationalInstitution" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *         &lt;element name="isFoundation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *         &lt;element name="isHospital" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *         &lt;element name="isManufacturerOfGoods" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *         &lt;element name="isVeterinaryHospital" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *         &lt;element name="isHispanicServicingInstitution" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
                    "isCommunityDevelopmentCorporation",
                    "isDomesticShelter",
                    "isEducationalInstitution",
                    "isFoundation",
                    "isHospital",
                    "isManufacturerOfGoods",
                    "isVeterinaryHospital",
                    "isHispanicServicingInstitution"
                })
                public static class VendorLineOfBusiness {

                    protected boolean isCommunityDevelopmentCorporation;
                    protected boolean isDomesticShelter;
                    protected boolean isEducationalInstitution;
                    protected boolean isFoundation;
                    protected boolean isHospital;
                    protected boolean isManufacturerOfGoods;
                    protected boolean isVeterinaryHospital;
                    protected boolean isHispanicServicingInstitution;

                    /**
                     * Gets the value of the isCommunityDevelopmentCorporation property.
                     * 
                     */
                    public boolean isIsCommunityDevelopmentCorporation() {
                        return isCommunityDevelopmentCorporation;
                    }

                    /**
                     * Sets the value of the isCommunityDevelopmentCorporation property.
                     * 
                     */
                    public void setIsCommunityDevelopmentCorporation(boolean value) {
                        this.isCommunityDevelopmentCorporation = value;
                    }

                    /**
                     * Gets the value of the isDomesticShelter property.
                     * 
                     */
                    public boolean isIsDomesticShelter() {
                        return isDomesticShelter;
                    }

                    /**
                     * Sets the value of the isDomesticShelter property.
                     * 
                     */
                    public void setIsDomesticShelter(boolean value) {
                        this.isDomesticShelter = value;
                    }

                    /**
                     * Gets the value of the isEducationalInstitution property.
                     * 
                     */
                    public boolean isIsEducationalInstitution() {
                        return isEducationalInstitution;
                    }

                    /**
                     * Sets the value of the isEducationalInstitution property.
                     * 
                     */
                    public void setIsEducationalInstitution(boolean value) {
                        this.isEducationalInstitution = value;
                    }

                    /**
                     * Gets the value of the isFoundation property.
                     * 
                     */
                    public boolean isIsFoundation() {
                        return isFoundation;
                    }

                    /**
                     * Sets the value of the isFoundation property.
                     * 
                     */
                    public void setIsFoundation(boolean value) {
                        this.isFoundation = value;
                    }

                    /**
                     * Gets the value of the isHospital property.
                     * 
                     */
                    public boolean isIsHospital() {
                        return isHospital;
                    }

                    /**
                     * Sets the value of the isHospital property.
                     * 
                     */
                    public void setIsHospital(boolean value) {
                        this.isHospital = value;
                    }

                    /**
                     * Gets the value of the isManufacturerOfGoods property.
                     * 
                     */
                    public boolean isIsManufacturerOfGoods() {
                        return isManufacturerOfGoods;
                    }

                    /**
                     * Sets the value of the isManufacturerOfGoods property.
                     * 
                     */
                    public void setIsManufacturerOfGoods(boolean value) {
                        this.isManufacturerOfGoods = value;
                    }

                    /**
                     * Gets the value of the isVeterinaryHospital property.
                     * 
                     */
                    public boolean isIsVeterinaryHospital() {
                        return isVeterinaryHospital;
                    }

                    /**
                     * Sets the value of the isVeterinaryHospital property.
                     * 
                     */
                    public void setIsVeterinaryHospital(boolean value) {
                        this.isVeterinaryHospital = value;
                    }

                    /**
                     * Gets the value of the isHispanicServicingInstitution property.
                     * 
                     */
                    public boolean isIsHispanicServicingInstitution() {
                        return isHispanicServicingInstitution;
                    }

                    /**
                     * Sets the value of the isHispanicServicingInstitution property.
                     * 
                     */
                    public void setIsHispanicServicingInstitution(boolean value) {
                        this.isHispanicServicingInstitution = value;
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
                 *       &lt;all>
                 *         &lt;element name="streetAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="streetAddress2" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="streetAddress3" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="state">
                 *           &lt;complexType>
                 *             &lt;simpleContent>
                 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/extension>
                 *             &lt;/simpleContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="ZIPCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="countryCode">
                 *           &lt;complexType>
                 *             &lt;simpleContent>
                 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/extension>
                 *             &lt;/simpleContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="phoneNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="faxNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="congressionalDistrictCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *       &lt;/all>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {

                })
                public static class VendorLocation {

                    @XmlElement(required = true)
                    protected String streetAddress;
                    @XmlElement(required = true)
                    protected String streetAddress2;
                    @XmlElement(required = true)
                    protected String streetAddress3;
                    @XmlElement(required = true)
                    protected String city;
                    @XmlElement(required = true)
                    protected ListOfAwards.Award.Vendor.VendorSiteDetails.VendorLocation.State state;
                    @XmlElement(name = "ZIPCode", required = true)
                    protected String zipCode;
                    @XmlElement(required = true)
                    protected ListOfAwards.Award.Vendor.VendorSiteDetails.VendorLocation.CountryCode countryCode;
                    @XmlElement(required = true)
                    protected String phoneNo;
                    @XmlElement(required = true)
                    protected String faxNo;
                    @XmlElement(required = true)
                    protected String congressionalDistrictCode;

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
                     * Gets the value of the streetAddress2 property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getStreetAddress2() {
                        return streetAddress2;
                    }

                    /**
                     * Sets the value of the streetAddress2 property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setStreetAddress2(String value) {
                        this.streetAddress2 = value;
                    }

                    /**
                     * Gets the value of the streetAddress3 property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getStreetAddress3() {
                        return streetAddress3;
                    }

                    /**
                     * Sets the value of the streetAddress3 property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setStreetAddress3(String value) {
                        this.streetAddress3 = value;
                    }

                    /**
                     * Gets the value of the city property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCity() {
                        return city;
                    }

                    /**
                     * Sets the value of the city property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCity(String value) {
                        this.city = value;
                    }

                    /**
                     * Gets the value of the state property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ListOfAwards.Award.Vendor.VendorSiteDetails.VendorLocation.State }
                     *     
                     */
                    public ListOfAwards.Award.Vendor.VendorSiteDetails.VendorLocation.State getState() {
                        return state;
                    }

                    /**
                     * Sets the value of the state property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ListOfAwards.Award.Vendor.VendorSiteDetails.VendorLocation.State }
                     *     
                     */
                    public void setState(ListOfAwards.Award.Vendor.VendorSiteDetails.VendorLocation.State value) {
                        this.state = value;
                    }

                    /**
                     * Gets the value of the zipCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getZIPCode() {
                        return zipCode;
                    }

                    /**
                     * Sets the value of the zipCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setZIPCode(String value) {
                        this.zipCode = value;
                    }

                    /**
                     * Gets the value of the countryCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ListOfAwards.Award.Vendor.VendorSiteDetails.VendorLocation.CountryCode }
                     *     
                     */
                    public ListOfAwards.Award.Vendor.VendorSiteDetails.VendorLocation.CountryCode getCountryCode() {
                        return countryCode;
                    }

                    /**
                     * Sets the value of the countryCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ListOfAwards.Award.Vendor.VendorSiteDetails.VendorLocation.CountryCode }
                     *     
                     */
                    public void setCountryCode(ListOfAwards.Award.Vendor.VendorSiteDetails.VendorLocation.CountryCode value) {
                        this.countryCode = value;
                    }

                    /**
                     * Gets the value of the phoneNo property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPhoneNo() {
                        return phoneNo;
                    }

                    /**
                     * Sets the value of the phoneNo property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPhoneNo(String value) {
                        this.phoneNo = value;
                    }

                    /**
                     * Gets the value of the faxNo property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getFaxNo() {
                        return faxNo;
                    }

                    /**
                     * Sets the value of the faxNo property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setFaxNo(String value) {
                        this.faxNo = value;
                    }

                    /**
                     * Gets the value of the congressionalDistrictCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCongressionalDistrictCode() {
                        return congressionalDistrictCode;
                    }

                    /**
                     * Sets the value of the congressionalDistrictCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCongressionalDistrictCode(String value) {
                        this.congressionalDistrictCode = value;
                    }


                    /**
                     * <p>Java class for anonymous complex type.
                     * 
                     * <p>The following schema fragment specifies the expected content contained within this class.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;simpleContent>
                     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                     *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/extension>
                     *   &lt;/simpleContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "value"
                    })
                    public static class CountryCode {

                        @XmlValue
                        protected String value;
                        @XmlAttribute
                        protected String name;

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
                     *   &lt;simpleContent>
                     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                     *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/extension>
                     *   &lt;/simpleContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "value"
                    })
                    public static class State {

                        @XmlValue
                        protected String value;
                        @XmlAttribute
                        protected String name;

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
                 *       &lt;all>
                 *         &lt;element name="isSubchapterSCorporation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *         &lt;element name="isLimitedLiabilityCorporation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *         &lt;element name="isForeignOwnedAndLocated" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *         &lt;element name="profitStructure">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="isForProfitOrganization" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *                   &lt;element name="isNonprofitOrganization" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *                   &lt;element name="isOtherNotForProfitOrganization" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="isShelteredWorkshop" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *         &lt;element name="stateOfIncorporation" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="countryOfIncorporation" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="organizationalType" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="numberOfEmployees" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="annualRevenue" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *       &lt;/all>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {

                })
                public static class VendorOrganizationFactors {

                    protected boolean isSubchapterSCorporation;
                    protected boolean isLimitedLiabilityCorporation;
                    protected boolean isForeignOwnedAndLocated;
                    @XmlElement(required = true)
                    protected ListOfAwards.Award.Vendor.VendorSiteDetails.VendorOrganizationFactors.ProfitStructure profitStructure;
                    protected boolean isShelteredWorkshop;
                    @XmlElement(required = true)
                    protected String stateOfIncorporation;
                    @XmlElement(required = true)
                    protected String countryOfIncorporation;
                    @XmlElement(required = true)
                    protected String organizationalType;
                    @XmlElement(required = true)
                    protected String numberOfEmployees;
                    @XmlElement(required = true)
                    protected String annualRevenue;

                    /**
                     * Gets the value of the isSubchapterSCorporation property.
                     * 
                     */
                    public boolean isIsSubchapterSCorporation() {
                        return isSubchapterSCorporation;
                    }

                    /**
                     * Sets the value of the isSubchapterSCorporation property.
                     * 
                     */
                    public void setIsSubchapterSCorporation(boolean value) {
                        this.isSubchapterSCorporation = value;
                    }

                    /**
                     * Gets the value of the isLimitedLiabilityCorporation property.
                     * 
                     */
                    public boolean isIsLimitedLiabilityCorporation() {
                        return isLimitedLiabilityCorporation;
                    }

                    /**
                     * Sets the value of the isLimitedLiabilityCorporation property.
                     * 
                     */
                    public void setIsLimitedLiabilityCorporation(boolean value) {
                        this.isLimitedLiabilityCorporation = value;
                    }

                    /**
                     * Gets the value of the isForeignOwnedAndLocated property.
                     * 
                     */
                    public boolean isIsForeignOwnedAndLocated() {
                        return isForeignOwnedAndLocated;
                    }

                    /**
                     * Sets the value of the isForeignOwnedAndLocated property.
                     * 
                     */
                    public void setIsForeignOwnedAndLocated(boolean value) {
                        this.isForeignOwnedAndLocated = value;
                    }

                    /**
                     * Gets the value of the profitStructure property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ListOfAwards.Award.Vendor.VendorSiteDetails.VendorOrganizationFactors.ProfitStructure }
                     *     
                     */
                    public ListOfAwards.Award.Vendor.VendorSiteDetails.VendorOrganizationFactors.ProfitStructure getProfitStructure() {
                        return profitStructure;
                    }

                    /**
                     * Sets the value of the profitStructure property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ListOfAwards.Award.Vendor.VendorSiteDetails.VendorOrganizationFactors.ProfitStructure }
                     *     
                     */
                    public void setProfitStructure(ListOfAwards.Award.Vendor.VendorSiteDetails.VendorOrganizationFactors.ProfitStructure value) {
                        this.profitStructure = value;
                    }

                    /**
                     * Gets the value of the isShelteredWorkshop property.
                     * 
                     */
                    public boolean isIsShelteredWorkshop() {
                        return isShelteredWorkshop;
                    }

                    /**
                     * Sets the value of the isShelteredWorkshop property.
                     * 
                     */
                    public void setIsShelteredWorkshop(boolean value) {
                        this.isShelteredWorkshop = value;
                    }

                    /**
                     * Gets the value of the stateOfIncorporation property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getStateOfIncorporation() {
                        return stateOfIncorporation;
                    }

                    /**
                     * Sets the value of the stateOfIncorporation property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setStateOfIncorporation(String value) {
                        this.stateOfIncorporation = value;
                    }

                    /**
                     * Gets the value of the countryOfIncorporation property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCountryOfIncorporation() {
                        return countryOfIncorporation;
                    }

                    /**
                     * Sets the value of the countryOfIncorporation property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCountryOfIncorporation(String value) {
                        this.countryOfIncorporation = value;
                    }

                    /**
                     * Gets the value of the organizationalType property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getOrganizationalType() {
                        return organizationalType;
                    }

                    /**
                     * Sets the value of the organizationalType property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setOrganizationalType(String value) {
                        this.organizationalType = value;
                    }

                    /**
                     * Gets the value of the numberOfEmployees property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNumberOfEmployees() {
                        return numberOfEmployees;
                    }

                    /**
                     * Sets the value of the numberOfEmployees property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNumberOfEmployees(String value) {
                        this.numberOfEmployees = value;
                    }

                    /**
                     * Gets the value of the annualRevenue property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAnnualRevenue() {
                        return annualRevenue;
                    }

                    /**
                     * Sets the value of the annualRevenue property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAnnualRevenue(String value) {
                        this.annualRevenue = value;
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
                     *         &lt;element name="isForProfitOrganization" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                     *         &lt;element name="isNonprofitOrganization" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                     *         &lt;element name="isOtherNotForProfitOrganization" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
                        "isForProfitOrganization",
                        "isNonprofitOrganization",
                        "isOtherNotForProfitOrganization"
                    })
                    public static class ProfitStructure {

                        protected boolean isForProfitOrganization;
                        protected boolean isNonprofitOrganization;
                        protected boolean isOtherNotForProfitOrganization;

                        /**
                         * Gets the value of the isForProfitOrganization property.
                         * 
                         */
                        public boolean isIsForProfitOrganization() {
                            return isForProfitOrganization;
                        }

                        /**
                         * Sets the value of the isForProfitOrganization property.
                         * 
                         */
                        public void setIsForProfitOrganization(boolean value) {
                            this.isForProfitOrganization = value;
                        }

                        /**
                         * Gets the value of the isNonprofitOrganization property.
                         * 
                         */
                        public boolean isIsNonprofitOrganization() {
                            return isNonprofitOrganization;
                        }

                        /**
                         * Sets the value of the isNonprofitOrganization property.
                         * 
                         */
                        public void setIsNonprofitOrganization(boolean value) {
                            this.isNonprofitOrganization = value;
                        }

                        /**
                         * Gets the value of the isOtherNotForProfitOrganization property.
                         * 
                         */
                        public boolean isIsOtherNotForProfitOrganization() {
                            return isOtherNotForProfitOrganization;
                        }

                        /**
                         * Sets the value of the isOtherNotForProfitOrganization property.
                         * 
                         */
                        public void setIsOtherNotForProfitOrganization(boolean value) {
                            this.isOtherNotForProfitOrganization = value;
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
                 *         &lt;element name="receivesContracts" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *         &lt;element name="receivesGrants" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *         &lt;element name="receivesContractsAndGrants" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
                    "receivesContracts",
                    "receivesGrants",
                    "receivesContractsAndGrants"
                })
                public static class VendorRelationshipWithFederalGovernment {

                    protected boolean receivesContracts;
                    protected boolean receivesGrants;
                    protected boolean receivesContractsAndGrants;

                    /**
                     * Gets the value of the receivesContracts property.
                     * 
                     */
                    public boolean isReceivesContracts() {
                        return receivesContracts;
                    }

                    /**
                     * Sets the value of the receivesContracts property.
                     * 
                     */
                    public void setReceivesContracts(boolean value) {
                        this.receivesContracts = value;
                    }

                    /**
                     * Gets the value of the receivesGrants property.
                     * 
                     */
                    public boolean isReceivesGrants() {
                        return receivesGrants;
                    }

                    /**
                     * Sets the value of the receivesGrants property.
                     * 
                     */
                    public void setReceivesGrants(boolean value) {
                        this.receivesGrants = value;
                    }

                    /**
                     * Gets the value of the receivesContractsAndGrants property.
                     * 
                     */
                    public boolean isReceivesContractsAndGrants() {
                        return receivesContractsAndGrants;
                    }

                    /**
                     * Sets the value of the receivesContractsAndGrants property.
                     * 
                     */
                    public void setReceivesContractsAndGrants(boolean value) {
                        this.receivesContractsAndGrants = value;
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
                 *         &lt;element name="isEconomicallyDisadvantagedWomenOwnedSmallBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *         &lt;element name="isJointVentureEconomicallyDisadvantagedWomenOwnedSmallBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *         &lt;element name="isJointVentureWomenOwnedSmallBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *         &lt;element name="isWomenOwnedSmallBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *         &lt;element name="isAlaskanNativeOwnedCorporationOrFirm" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *         &lt;element name="isAmericanIndianOwned" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *         &lt;element name="isIndianTribe" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *         &lt;element name="isNativeHawaiianOwnedOrganizationOrFirm" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *         &lt;element name="isTriballyOwnedFirm" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *         &lt;element name="isVeteranOwned" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *         &lt;element name="isServiceRelatedDisabledVeteranOwnedBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *         &lt;element name="isWomenOwned" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *         &lt;element name="minorityOwned">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="isMinorityOwned" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *                   &lt;element name="isSubContinentAsianAmericanOwnedBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *                   &lt;element name="isAsianPacificAmericanOwnedBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *                   &lt;element name="isBlackAmericanOwnedBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *                   &lt;element name="isHispanicAmericanOwnedBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *                   &lt;element name="isNativeAmericanOwnedBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *                   &lt;element name="isOtherMinorityOwned" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="isVerySmallBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
                    "isEconomicallyDisadvantagedWomenOwnedSmallBusiness",
                    "isJointVentureEconomicallyDisadvantagedWomenOwnedSmallBusiness",
                    "isJointVentureWomenOwnedSmallBusiness",
                    "isWomenOwnedSmallBusiness",
                    "isAlaskanNativeOwnedCorporationOrFirm",
                    "isAmericanIndianOwned",
                    "isIndianTribe",
                    "isNativeHawaiianOwnedOrganizationOrFirm",
                    "isTriballyOwnedFirm",
                    "isVeteranOwned",
                    "isServiceRelatedDisabledVeteranOwnedBusiness",
                    "isWomenOwned",
                    "minorityOwned",
                    "isVerySmallBusiness"
                })
                public static class VendorSocioEconomicIndicators {

                    protected boolean isEconomicallyDisadvantagedWomenOwnedSmallBusiness;
                    protected boolean isJointVentureEconomicallyDisadvantagedWomenOwnedSmallBusiness;
                    protected boolean isJointVentureWomenOwnedSmallBusiness;
                    protected boolean isWomenOwnedSmallBusiness;
                    protected boolean isAlaskanNativeOwnedCorporationOrFirm;
                    protected boolean isAmericanIndianOwned;
                    protected boolean isIndianTribe;
                    protected boolean isNativeHawaiianOwnedOrganizationOrFirm;
                    protected boolean isTriballyOwnedFirm;
                    protected boolean isVeteranOwned;
                    protected boolean isServiceRelatedDisabledVeteranOwnedBusiness;
                    protected boolean isWomenOwned;
                    @XmlElement(required = true)
                    protected ListOfAwards.Award.Vendor.VendorSiteDetails.VendorSocioEconomicIndicators.MinorityOwned minorityOwned;
                    protected boolean isVerySmallBusiness;

                    /**
                     * Gets the value of the isEconomicallyDisadvantagedWomenOwnedSmallBusiness property.
                     * 
                     */
                    public boolean isIsEconomicallyDisadvantagedWomenOwnedSmallBusiness() {
                        return isEconomicallyDisadvantagedWomenOwnedSmallBusiness;
                    }

                    /**
                     * Sets the value of the isEconomicallyDisadvantagedWomenOwnedSmallBusiness property.
                     * 
                     */
                    public void setIsEconomicallyDisadvantagedWomenOwnedSmallBusiness(boolean value) {
                        this.isEconomicallyDisadvantagedWomenOwnedSmallBusiness = value;
                    }

                    /**
                     * Gets the value of the isJointVentureEconomicallyDisadvantagedWomenOwnedSmallBusiness property.
                     * 
                     */
                    public boolean isIsJointVentureEconomicallyDisadvantagedWomenOwnedSmallBusiness() {
                        return isJointVentureEconomicallyDisadvantagedWomenOwnedSmallBusiness;
                    }

                    /**
                     * Sets the value of the isJointVentureEconomicallyDisadvantagedWomenOwnedSmallBusiness property.
                     * 
                     */
                    public void setIsJointVentureEconomicallyDisadvantagedWomenOwnedSmallBusiness(boolean value) {
                        this.isJointVentureEconomicallyDisadvantagedWomenOwnedSmallBusiness = value;
                    }

                    /**
                     * Gets the value of the isJointVentureWomenOwnedSmallBusiness property.
                     * 
                     */
                    public boolean isIsJointVentureWomenOwnedSmallBusiness() {
                        return isJointVentureWomenOwnedSmallBusiness;
                    }

                    /**
                     * Sets the value of the isJointVentureWomenOwnedSmallBusiness property.
                     * 
                     */
                    public void setIsJointVentureWomenOwnedSmallBusiness(boolean value) {
                        this.isJointVentureWomenOwnedSmallBusiness = value;
                    }

                    /**
                     * Gets the value of the isWomenOwnedSmallBusiness property.
                     * 
                     */
                    public boolean isIsWomenOwnedSmallBusiness() {
                        return isWomenOwnedSmallBusiness;
                    }

                    /**
                     * Sets the value of the isWomenOwnedSmallBusiness property.
                     * 
                     */
                    public void setIsWomenOwnedSmallBusiness(boolean value) {
                        this.isWomenOwnedSmallBusiness = value;
                    }

                    /**
                     * Gets the value of the isAlaskanNativeOwnedCorporationOrFirm property.
                     * 
                     */
                    public boolean isIsAlaskanNativeOwnedCorporationOrFirm() {
                        return isAlaskanNativeOwnedCorporationOrFirm;
                    }

                    /**
                     * Sets the value of the isAlaskanNativeOwnedCorporationOrFirm property.
                     * 
                     */
                    public void setIsAlaskanNativeOwnedCorporationOrFirm(boolean value) {
                        this.isAlaskanNativeOwnedCorporationOrFirm = value;
                    }

                    /**
                     * Gets the value of the isAmericanIndianOwned property.
                     * 
                     */
                    public boolean isIsAmericanIndianOwned() {
                        return isAmericanIndianOwned;
                    }

                    /**
                     * Sets the value of the isAmericanIndianOwned property.
                     * 
                     */
                    public void setIsAmericanIndianOwned(boolean value) {
                        this.isAmericanIndianOwned = value;
                    }

                    /**
                     * Gets the value of the isIndianTribe property.
                     * 
                     */
                    public boolean isIsIndianTribe() {
                        return isIndianTribe;
                    }

                    /**
                     * Sets the value of the isIndianTribe property.
                     * 
                     */
                    public void setIsIndianTribe(boolean value) {
                        this.isIndianTribe = value;
                    }

                    /**
                     * Gets the value of the isNativeHawaiianOwnedOrganizationOrFirm property.
                     * 
                     */
                    public boolean isIsNativeHawaiianOwnedOrganizationOrFirm() {
                        return isNativeHawaiianOwnedOrganizationOrFirm;
                    }

                    /**
                     * Sets the value of the isNativeHawaiianOwnedOrganizationOrFirm property.
                     * 
                     */
                    public void setIsNativeHawaiianOwnedOrganizationOrFirm(boolean value) {
                        this.isNativeHawaiianOwnedOrganizationOrFirm = value;
                    }

                    /**
                     * Gets the value of the isTriballyOwnedFirm property.
                     * 
                     */
                    public boolean isIsTriballyOwnedFirm() {
                        return isTriballyOwnedFirm;
                    }

                    /**
                     * Sets the value of the isTriballyOwnedFirm property.
                     * 
                     */
                    public void setIsTriballyOwnedFirm(boolean value) {
                        this.isTriballyOwnedFirm = value;
                    }

                    /**
                     * Gets the value of the isVeteranOwned property.
                     * 
                     */
                    public boolean isIsVeteranOwned() {
                        return isVeteranOwned;
                    }

                    /**
                     * Sets the value of the isVeteranOwned property.
                     * 
                     */
                    public void setIsVeteranOwned(boolean value) {
                        this.isVeteranOwned = value;
                    }

                    /**
                     * Gets the value of the isServiceRelatedDisabledVeteranOwnedBusiness property.
                     * 
                     */
                    public boolean isIsServiceRelatedDisabledVeteranOwnedBusiness() {
                        return isServiceRelatedDisabledVeteranOwnedBusiness;
                    }

                    /**
                     * Sets the value of the isServiceRelatedDisabledVeteranOwnedBusiness property.
                     * 
                     */
                    public void setIsServiceRelatedDisabledVeteranOwnedBusiness(boolean value) {
                        this.isServiceRelatedDisabledVeteranOwnedBusiness = value;
                    }

                    /**
                     * Gets the value of the isWomenOwned property.
                     * 
                     */
                    public boolean isIsWomenOwned() {
                        return isWomenOwned;
                    }

                    /**
                     * Sets the value of the isWomenOwned property.
                     * 
                     */
                    public void setIsWomenOwned(boolean value) {
                        this.isWomenOwned = value;
                    }

                    /**
                     * Gets the value of the minorityOwned property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ListOfAwards.Award.Vendor.VendorSiteDetails.VendorSocioEconomicIndicators.MinorityOwned }
                     *     
                     */
                    public ListOfAwards.Award.Vendor.VendorSiteDetails.VendorSocioEconomicIndicators.MinorityOwned getMinorityOwned() {
                        return minorityOwned;
                    }

                    /**
                     * Sets the value of the minorityOwned property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ListOfAwards.Award.Vendor.VendorSiteDetails.VendorSocioEconomicIndicators.MinorityOwned }
                     *     
                     */
                    public void setMinorityOwned(ListOfAwards.Award.Vendor.VendorSiteDetails.VendorSocioEconomicIndicators.MinorityOwned value) {
                        this.minorityOwned = value;
                    }

                    /**
                     * Gets the value of the isVerySmallBusiness property.
                     * 
                     */
                    public boolean isIsVerySmallBusiness() {
                        return isVerySmallBusiness;
                    }

                    /**
                     * Sets the value of the isVerySmallBusiness property.
                     * 
                     */
                    public void setIsVerySmallBusiness(boolean value) {
                        this.isVerySmallBusiness = value;
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
                     *         &lt;element name="isMinorityOwned" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                     *         &lt;element name="isSubContinentAsianAmericanOwnedBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                     *         &lt;element name="isAsianPacificAmericanOwnedBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                     *         &lt;element name="isBlackAmericanOwnedBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                     *         &lt;element name="isHispanicAmericanOwnedBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                     *         &lt;element name="isNativeAmericanOwnedBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                     *         &lt;element name="isOtherMinorityOwned" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
                        "isMinorityOwned",
                        "isSubContinentAsianAmericanOwnedBusiness",
                        "isAsianPacificAmericanOwnedBusiness",
                        "isBlackAmericanOwnedBusiness",
                        "isHispanicAmericanOwnedBusiness",
                        "isNativeAmericanOwnedBusiness",
                        "isOtherMinorityOwned"
                    })
                    public static class MinorityOwned {

                        protected boolean isMinorityOwned;
                        protected boolean isSubContinentAsianAmericanOwnedBusiness;
                        protected boolean isAsianPacificAmericanOwnedBusiness;
                        protected boolean isBlackAmericanOwnedBusiness;
                        protected boolean isHispanicAmericanOwnedBusiness;
                        protected boolean isNativeAmericanOwnedBusiness;
                        protected boolean isOtherMinorityOwned;

                        /**
                         * Gets the value of the isMinorityOwned property.
                         * 
                         */
                        public boolean isIsMinorityOwned() {
                            return isMinorityOwned;
                        }

                        /**
                         * Sets the value of the isMinorityOwned property.
                         * 
                         */
                        public void setIsMinorityOwned(boolean value) {
                            this.isMinorityOwned = value;
                        }

                        /**
                         * Gets the value of the isSubContinentAsianAmericanOwnedBusiness property.
                         * 
                         */
                        public boolean isIsSubContinentAsianAmericanOwnedBusiness() {
                            return isSubContinentAsianAmericanOwnedBusiness;
                        }

                        /**
                         * Sets the value of the isSubContinentAsianAmericanOwnedBusiness property.
                         * 
                         */
                        public void setIsSubContinentAsianAmericanOwnedBusiness(boolean value) {
                            this.isSubContinentAsianAmericanOwnedBusiness = value;
                        }

                        /**
                         * Gets the value of the isAsianPacificAmericanOwnedBusiness property.
                         * 
                         */
                        public boolean isIsAsianPacificAmericanOwnedBusiness() {
                            return isAsianPacificAmericanOwnedBusiness;
                        }

                        /**
                         * Sets the value of the isAsianPacificAmericanOwnedBusiness property.
                         * 
                         */
                        public void setIsAsianPacificAmericanOwnedBusiness(boolean value) {
                            this.isAsianPacificAmericanOwnedBusiness = value;
                        }

                        /**
                         * Gets the value of the isBlackAmericanOwnedBusiness property.
                         * 
                         */
                        public boolean isIsBlackAmericanOwnedBusiness() {
                            return isBlackAmericanOwnedBusiness;
                        }

                        /**
                         * Sets the value of the isBlackAmericanOwnedBusiness property.
                         * 
                         */
                        public void setIsBlackAmericanOwnedBusiness(boolean value) {
                            this.isBlackAmericanOwnedBusiness = value;
                        }

                        /**
                         * Gets the value of the isHispanicAmericanOwnedBusiness property.
                         * 
                         */
                        public boolean isIsHispanicAmericanOwnedBusiness() {
                            return isHispanicAmericanOwnedBusiness;
                        }

                        /**
                         * Sets the value of the isHispanicAmericanOwnedBusiness property.
                         * 
                         */
                        public void setIsHispanicAmericanOwnedBusiness(boolean value) {
                            this.isHispanicAmericanOwnedBusiness = value;
                        }

                        /**
                         * Gets the value of the isNativeAmericanOwnedBusiness property.
                         * 
                         */
                        public boolean isIsNativeAmericanOwnedBusiness() {
                            return isNativeAmericanOwnedBusiness;
                        }

                        /**
                         * Sets the value of the isNativeAmericanOwnedBusiness property.
                         * 
                         */
                        public void setIsNativeAmericanOwnedBusiness(boolean value) {
                            this.isNativeAmericanOwnedBusiness = value;
                        }

                        /**
                         * Gets the value of the isOtherMinorityOwned property.
                         * 
                         */
                        public boolean isIsOtherMinorityOwned() {
                            return isOtherMinorityOwned;
                        }

                        /**
                         * Sets the value of the isOtherMinorityOwned property.
                         * 
                         */
                        public void setIsOtherMinorityOwned(boolean value) {
                            this.isOtherMinorityOwned = value;
                        }

                    }

                }

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
     *         &lt;element name="total" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
     *         &lt;element name="fetched" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
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
        "total",
        "fetched"
    })
    public static class Count {

        @XmlSchemaType(name = "unsignedShort")
        protected int total;
        @XmlSchemaType(name = "unsignedShort")
        protected int fetched;

        /**
         * Gets the value of the total property.
         * 
         */
        public int getTotal() {
            return total;
        }

        /**
         * Sets the value of the total property.
         * 
         */
        public void setTotal(int value) {
            this.total = value;
        }

        /**
         * Gets the value of the fetched property.
         * 
         */
        public int getFetched() {
            return fetched;
        }

        /**
         * Sets the value of the fetched property.
         * 
         */
        public void setFetched(int value) {
            this.fetched = value;
        }

    }

}
