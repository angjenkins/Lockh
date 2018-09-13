
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
 * <p>Java class for ListOfIDVs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfIDVs">
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
 *         &lt;element name="IDV" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="contractID">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="IDVID">
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
 *                             &lt;element name="lastDateToOrder" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *                           &lt;all>
 *                             &lt;element name="websiteURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="whoCanUse" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="maximumOrderLimit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="typeOfFeeForUseOfService">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="emailAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="orderingProcedure" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="fixedFeeValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="feeRangeLowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="feeRangeUpperValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                           &lt;/all>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="contractData">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element ref="{http://www.fpdsng.com/FPDS}multiYearContract"/>
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
 *                             &lt;element name="solicitationID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="costAccountingStandardsClause">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="descriptionOfContractRequirement" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *                             &lt;element name="listOfTreasuryAccounts">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="treasuryAccount">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="treasuryAccountSymbol">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="agencyIdentifier" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *                                                           &lt;element name="mainAccountCode" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *                                                           &lt;element name="subAccountCode" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="initiative">
 *                                                   &lt;complexType>
 *                                                     &lt;simpleContent>
 *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                                         &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/extension>
 *                                                     &lt;/simpleContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
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
 *                             &lt;element name="contingencyHumanitarianPeacekeepingOperation">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="multipleOrSingleAwardIDC">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="typeOfIDC">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="programAcronym" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="costOrPricingData">
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
 *                             &lt;element name="majorProgramCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *                             &lt;element name="otherStatutoryAuthority" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *                             &lt;element name="recoveredMaterialClauses">
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
 *                           &lt;/all>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="vendor">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="vendorHeader">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;all>
 *                                       &lt;element name="vendorName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="vendorAlternateName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="vendorLegalOrganizationName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="vendorDoingAsBusinessName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/all>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="vendorSiteDetails">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;all>
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
 *                                               &lt;sequence>
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
 *                                                 &lt;element name="numberOfEmployees" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *                                                 &lt;element name="annualRevenue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="typeOfEducationalEntity">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
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
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="vendorCertifications">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="isDOTCertifiedDisadvantagedBusinessEnterprise" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                 &lt;element name="isSelfCertifiedSmallDisadvantagedBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                 &lt;element name="isSBACertifiedSmallDisadvantagedBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                 &lt;element name="isSBACertified8AProgramParticipant" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                 &lt;element name="isSBACertifiedHUBZone" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                 &lt;element name="isSBACertified8AJointVenture" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="vendorLocation">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
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
 *                                                         &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/extension>
 *                                                     &lt;/simpleContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="phoneNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="faxNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="congressionalDistrictCode" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *                                               &lt;/sequence>
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
 *                                     &lt;/all>
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
 *                           &lt;/all>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="competition">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="extentCompeted">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
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
 *                             &lt;element name="statutoryExceptionToFairOpportunity">
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
 *                             &lt;element name="numberOfOffersReceived" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
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
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="preferencePrograms">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="subcontractPlan">
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
 *                   &lt;element name="transactionInformation">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
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
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="agencySpecificIDVElements">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="agencyID" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *                             &lt;element name="NASASpecificIDVElements">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;all>
 *                                       &lt;element name="offerorsProposalNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="PRNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="procurementPlacementCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="solicitationIssueDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="listOfContractAdministrationsDelegated">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;all>
 *                                                 &lt;element name="contractAdministrationDelegated" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                               &lt;/all>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="advisoryOrAssistanceServicesContract" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                       &lt;element name="supportServicesTypeContract" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                       &lt;element name="newTechnologyOrPatentRightsClause" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                       &lt;element name="managementReportingRequirements" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="propertyFinancialReporting" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                       &lt;element name="valueEngineeringClause" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                       &lt;element name="securityCode" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                       &lt;element name="administratorCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="contractingOfficerCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="negotiatorCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="COTRName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="alternateCOTRName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="organizationCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="isPhysicallyComplete" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                       &lt;element name="physicalCompletionDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="cancellationDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="finalInvoicePaidDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="destroyDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="installationUnique" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *                                       &lt;element name="accessionNumber" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *                                       &lt;element name="accountingInstallationNumber" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *                                     &lt;/all>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
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
@XmlType(name = "ListOfIDVs", propOrder = {
    "count",
    "idv"
})
public class ListOfIDVs {

    @XmlElement(required = true)
    protected ListOfIDVs.Count count;
    @XmlElement(name = "IDV", required = true)
    protected List<ListOfIDVs.IDV> idv;

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfIDVs.Count }
     *     
     */
    public ListOfIDVs.Count getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfIDVs.Count }
     *     
     */
    public void setCount(ListOfIDVs.Count value) {
        this.count = value;
    }

    /**
     * Gets the value of the idv property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the idv property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIDV().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListOfIDVs.IDV }
     * 
     * 
     */
    public List<ListOfIDVs.IDV> getIDV() {
        if (idv == null) {
            idv = new ArrayList<ListOfIDVs.IDV>();
        }
        return this.idv;
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
     *         &lt;element name="contractID">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="IDVID">
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
     *                   &lt;element name="lastDateToOrder" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
     *                 &lt;all>
     *                   &lt;element name="websiteURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="whoCanUse" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="maximumOrderLimit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                   &lt;element name="typeOfFeeForUseOfService">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="emailAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="orderingProcedure" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="fixedFeeValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                   &lt;element name="feeRangeLowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                   &lt;element name="feeRangeUpperValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                 &lt;/all>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="contractData">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element ref="{http://www.fpdsng.com/FPDS}multiYearContract"/>
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
     *                   &lt;element name="solicitationID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="costAccountingStandardsClause">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="descriptionOfContractRequirement" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
     *                   &lt;element name="listOfTreasuryAccounts">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="treasuryAccount">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="treasuryAccountSymbol">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="agencyIdentifier" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
     *                                                 &lt;element name="mainAccountCode" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
     *                                                 &lt;element name="subAccountCode" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="initiative">
     *                                         &lt;complexType>
     *                                           &lt;simpleContent>
     *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                               &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/extension>
     *                                           &lt;/simpleContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
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
     *                   &lt;element name="contingencyHumanitarianPeacekeepingOperation">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="multipleOrSingleAwardIDC">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="typeOfIDC">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="programAcronym" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="costOrPricingData">
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
     *                   &lt;element name="majorProgramCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
     *                   &lt;element name="otherStatutoryAuthority" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
     *                   &lt;element name="recoveredMaterialClauses">
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
     *                 &lt;/all>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="vendor">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="vendorHeader">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;all>
     *                             &lt;element name="vendorName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="vendorAlternateName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="vendorLegalOrganizationName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="vendorDoingAsBusinessName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/all>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="vendorSiteDetails">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;all>
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
     *                                     &lt;sequence>
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
     *                                       &lt;element name="numberOfEmployees" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
     *                                       &lt;element name="annualRevenue" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="typeOfEducationalEntity">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
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
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="vendorCertifications">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="isDOTCertifiedDisadvantagedBusinessEnterprise" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                       &lt;element name="isSelfCertifiedSmallDisadvantagedBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                       &lt;element name="isSBACertifiedSmallDisadvantagedBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                       &lt;element name="isSBACertified8AProgramParticipant" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                       &lt;element name="isSBACertifiedHUBZone" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                       &lt;element name="isSBACertified8AJointVenture" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="vendorLocation">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
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
     *                                               &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/extension>
     *                                           &lt;/simpleContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="phoneNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="faxNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="congressionalDistrictCode" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
     *                                     &lt;/sequence>
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
     *                           &lt;/all>
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
     *                 &lt;/all>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="competition">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="extentCompeted">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
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
     *                   &lt;element name="statutoryExceptionToFairOpportunity">
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
     *                   &lt;element name="numberOfOffersReceived" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
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
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="preferencePrograms">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="subcontractPlan">
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
     *         &lt;element name="transactionInformation">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
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
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="agencySpecificIDVElements">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="agencyID" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
     *                   &lt;element name="NASASpecificIDVElements">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;all>
     *                             &lt;element name="offerorsProposalNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="PRNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="procurementPlacementCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="solicitationIssueDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="listOfContractAdministrationsDelegated">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;all>
     *                                       &lt;element name="contractAdministrationDelegated" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                     &lt;/all>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="advisoryOrAssistanceServicesContract" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                             &lt;element name="supportServicesTypeContract" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                             &lt;element name="newTechnologyOrPatentRightsClause" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                             &lt;element name="managementReportingRequirements" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="propertyFinancialReporting" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                             &lt;element name="valueEngineeringClause" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                             &lt;element name="securityCode" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                             &lt;element name="administratorCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="contractingOfficerCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="negotiatorCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="COTRName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="alternateCOTRName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="organizationCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="isPhysicallyComplete" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                             &lt;element name="physicalCompletionDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="cancellationDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="finalInvoicePaidDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="destroyDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="installationUnique" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
     *                             &lt;element name="accessionNumber" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
     *                             &lt;element name="accountingInstallationNumber" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
     *                           &lt;/all>
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
        "contractID",
        "relevantContractDates",
        "dollarValues",
        "totalDollarValues",
        "purchaserInformation",
        "contractMarketingData",
        "contractData",
        "legislativeMandates",
        "productOrServiceInformation",
        "vendor",
        "competition",
        "preferencePrograms",
        "transactionInformation",
        "agencySpecificIDVElements"
    })
    public static class IDV {

        @XmlElement(required = true)
        protected ListOfIDVs.IDV.ContractID contractID;
        @XmlElement(required = true)
        protected ListOfIDVs.IDV.RelevantContractDates relevantContractDates;
        @XmlElement(required = true)
        protected ListOfIDVs.IDV.DollarValues dollarValues;
        @XmlElement(required = true)
        protected ListOfIDVs.IDV.TotalDollarValues totalDollarValues;
        @XmlElement(required = true)
        protected ListOfIDVs.IDV.PurchaserInformation purchaserInformation;
        @XmlElement(required = true)
        protected ListOfIDVs.IDV.ContractMarketingData contractMarketingData;
        @XmlElement(required = true)
        protected ListOfIDVs.IDV.ContractData contractData;
        @XmlElement(required = true)
        protected ListOfIDVs.IDV.LegislativeMandates legislativeMandates;
        @XmlElement(required = true)
        protected ListOfIDVs.IDV.ProductOrServiceInformation productOrServiceInformation;
        @XmlElement(required = true)
        protected ListOfIDVs.IDV.Vendor vendor;
        @XmlElement(required = true)
        protected ListOfIDVs.IDV.Competition competition;
        @XmlElement(required = true)
        protected ListOfIDVs.IDV.PreferencePrograms preferencePrograms;
        @XmlElement(required = true)
        protected ListOfIDVs.IDV.TransactionInformation transactionInformation;
        @XmlElement(required = true)
        protected ListOfIDVs.IDV.AgencySpecificIDVElements agencySpecificIDVElements;

        /**
         * Gets the value of the contractID property.
         * 
         * @return
         *     possible object is
         *     {@link ListOfIDVs.IDV.ContractID }
         *     
         */
        public ListOfIDVs.IDV.ContractID getContractID() {
            return contractID;
        }

        /**
         * Sets the value of the contractID property.
         * 
         * @param value
         *     allowed object is
         *     {@link ListOfIDVs.IDV.ContractID }
         *     
         */
        public void setContractID(ListOfIDVs.IDV.ContractID value) {
            this.contractID = value;
        }

        /**
         * Gets the value of the relevantContractDates property.
         * 
         * @return
         *     possible object is
         *     {@link ListOfIDVs.IDV.RelevantContractDates }
         *     
         */
        public ListOfIDVs.IDV.RelevantContractDates getRelevantContractDates() {
            return relevantContractDates;
        }

        /**
         * Sets the value of the relevantContractDates property.
         * 
         * @param value
         *     allowed object is
         *     {@link ListOfIDVs.IDV.RelevantContractDates }
         *     
         */
        public void setRelevantContractDates(ListOfIDVs.IDV.RelevantContractDates value) {
            this.relevantContractDates = value;
        }

        /**
         * Gets the value of the dollarValues property.
         * 
         * @return
         *     possible object is
         *     {@link ListOfIDVs.IDV.DollarValues }
         *     
         */
        public ListOfIDVs.IDV.DollarValues getDollarValues() {
            return dollarValues;
        }

        /**
         * Sets the value of the dollarValues property.
         * 
         * @param value
         *     allowed object is
         *     {@link ListOfIDVs.IDV.DollarValues }
         *     
         */
        public void setDollarValues(ListOfIDVs.IDV.DollarValues value) {
            this.dollarValues = value;
        }

        /**
         * Gets the value of the totalDollarValues property.
         * 
         * @return
         *     possible object is
         *     {@link ListOfIDVs.IDV.TotalDollarValues }
         *     
         */
        public ListOfIDVs.IDV.TotalDollarValues getTotalDollarValues() {
            return totalDollarValues;
        }

        /**
         * Sets the value of the totalDollarValues property.
         * 
         * @param value
         *     allowed object is
         *     {@link ListOfIDVs.IDV.TotalDollarValues }
         *     
         */
        public void setTotalDollarValues(ListOfIDVs.IDV.TotalDollarValues value) {
            this.totalDollarValues = value;
        }

        /**
         * Gets the value of the purchaserInformation property.
         * 
         * @return
         *     possible object is
         *     {@link ListOfIDVs.IDV.PurchaserInformation }
         *     
         */
        public ListOfIDVs.IDV.PurchaserInformation getPurchaserInformation() {
            return purchaserInformation;
        }

        /**
         * Sets the value of the purchaserInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link ListOfIDVs.IDV.PurchaserInformation }
         *     
         */
        public void setPurchaserInformation(ListOfIDVs.IDV.PurchaserInformation value) {
            this.purchaserInformation = value;
        }

        /**
         * Gets the value of the contractMarketingData property.
         * 
         * @return
         *     possible object is
         *     {@link ListOfIDVs.IDV.ContractMarketingData }
         *     
         */
        public ListOfIDVs.IDV.ContractMarketingData getContractMarketingData() {
            return contractMarketingData;
        }

        /**
         * Sets the value of the contractMarketingData property.
         * 
         * @param value
         *     allowed object is
         *     {@link ListOfIDVs.IDV.ContractMarketingData }
         *     
         */
        public void setContractMarketingData(ListOfIDVs.IDV.ContractMarketingData value) {
            this.contractMarketingData = value;
        }

        /**
         * Gets the value of the contractData property.
         * 
         * @return
         *     possible object is
         *     {@link ListOfIDVs.IDV.ContractData }
         *     
         */
        public ListOfIDVs.IDV.ContractData getContractData() {
            return contractData;
        }

        /**
         * Sets the value of the contractData property.
         * 
         * @param value
         *     allowed object is
         *     {@link ListOfIDVs.IDV.ContractData }
         *     
         */
        public void setContractData(ListOfIDVs.IDV.ContractData value) {
            this.contractData = value;
        }

        /**
         * Gets the value of the legislativeMandates property.
         * 
         * @return
         *     possible object is
         *     {@link ListOfIDVs.IDV.LegislativeMandates }
         *     
         */
        public ListOfIDVs.IDV.LegislativeMandates getLegislativeMandates() {
            return legislativeMandates;
        }

        /**
         * Sets the value of the legislativeMandates property.
         * 
         * @param value
         *     allowed object is
         *     {@link ListOfIDVs.IDV.LegislativeMandates }
         *     
         */
        public void setLegislativeMandates(ListOfIDVs.IDV.LegislativeMandates value) {
            this.legislativeMandates = value;
        }

        /**
         * Gets the value of the productOrServiceInformation property.
         * 
         * @return
         *     possible object is
         *     {@link ListOfIDVs.IDV.ProductOrServiceInformation }
         *     
         */
        public ListOfIDVs.IDV.ProductOrServiceInformation getProductOrServiceInformation() {
            return productOrServiceInformation;
        }

        /**
         * Sets the value of the productOrServiceInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link ListOfIDVs.IDV.ProductOrServiceInformation }
         *     
         */
        public void setProductOrServiceInformation(ListOfIDVs.IDV.ProductOrServiceInformation value) {
            this.productOrServiceInformation = value;
        }

        /**
         * Gets the value of the vendor property.
         * 
         * @return
         *     possible object is
         *     {@link ListOfIDVs.IDV.Vendor }
         *     
         */
        public ListOfIDVs.IDV.Vendor getVendor() {
            return vendor;
        }

        /**
         * Sets the value of the vendor property.
         * 
         * @param value
         *     allowed object is
         *     {@link ListOfIDVs.IDV.Vendor }
         *     
         */
        public void setVendor(ListOfIDVs.IDV.Vendor value) {
            this.vendor = value;
        }

        /**
         * Gets the value of the competition property.
         * 
         * @return
         *     possible object is
         *     {@link ListOfIDVs.IDV.Competition }
         *     
         */
        public ListOfIDVs.IDV.Competition getCompetition() {
            return competition;
        }

        /**
         * Sets the value of the competition property.
         * 
         * @param value
         *     allowed object is
         *     {@link ListOfIDVs.IDV.Competition }
         *     
         */
        public void setCompetition(ListOfIDVs.IDV.Competition value) {
            this.competition = value;
        }

        /**
         * Gets the value of the preferencePrograms property.
         * 
         * @return
         *     possible object is
         *     {@link ListOfIDVs.IDV.PreferencePrograms }
         *     
         */
        public ListOfIDVs.IDV.PreferencePrograms getPreferencePrograms() {
            return preferencePrograms;
        }

        /**
         * Sets the value of the preferencePrograms property.
         * 
         * @param value
         *     allowed object is
         *     {@link ListOfIDVs.IDV.PreferencePrograms }
         *     
         */
        public void setPreferencePrograms(ListOfIDVs.IDV.PreferencePrograms value) {
            this.preferencePrograms = value;
        }

        /**
         * Gets the value of the transactionInformation property.
         * 
         * @return
         *     possible object is
         *     {@link ListOfIDVs.IDV.TransactionInformation }
         *     
         */
        public ListOfIDVs.IDV.TransactionInformation getTransactionInformation() {
            return transactionInformation;
        }

        /**
         * Sets the value of the transactionInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link ListOfIDVs.IDV.TransactionInformation }
         *     
         */
        public void setTransactionInformation(ListOfIDVs.IDV.TransactionInformation value) {
            this.transactionInformation = value;
        }

        /**
         * Gets the value of the agencySpecificIDVElements property.
         * 
         * @return
         *     possible object is
         *     {@link ListOfIDVs.IDV.AgencySpecificIDVElements }
         *     
         */
        public ListOfIDVs.IDV.AgencySpecificIDVElements getAgencySpecificIDVElements() {
            return agencySpecificIDVElements;
        }

        /**
         * Sets the value of the agencySpecificIDVElements property.
         * 
         * @param value
         *     allowed object is
         *     {@link ListOfIDVs.IDV.AgencySpecificIDVElements }
         *     
         */
        public void setAgencySpecificIDVElements(ListOfIDVs.IDV.AgencySpecificIDVElements value) {
            this.agencySpecificIDVElements = value;
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
         *         &lt;element name="agencyID" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
         *         &lt;element name="NASASpecificIDVElements">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;all>
         *                   &lt;element name="offerorsProposalNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="PRNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="procurementPlacementCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="solicitationIssueDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="listOfContractAdministrationsDelegated">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;all>
         *                             &lt;element name="contractAdministrationDelegated" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                           &lt;/all>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="advisoryOrAssistanceServicesContract" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                   &lt;element name="supportServicesTypeContract" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                   &lt;element name="newTechnologyOrPatentRightsClause" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                   &lt;element name="managementReportingRequirements" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="propertyFinancialReporting" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                   &lt;element name="valueEngineeringClause" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                   &lt;element name="securityCode" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                   &lt;element name="administratorCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="contractingOfficerCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="negotiatorCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="COTRName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="alternateCOTRName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="organizationCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="isPhysicallyComplete" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                   &lt;element name="physicalCompletionDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="cancellationDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="finalInvoicePaidDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="destroyDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="installationUnique" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
         *                   &lt;element name="accessionNumber" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
         *                   &lt;element name="accountingInstallationNumber" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
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
        @XmlType(name = "", propOrder = {
            "agencyID",
            "nasaSpecificIDVElements"
        })
        public static class AgencySpecificIDVElements {

            @XmlSchemaType(name = "unsignedShort")
            protected int agencyID;
            @XmlElement(name = "NASASpecificIDVElements", required = true)
            protected ListOfIDVs.IDV.AgencySpecificIDVElements.NASASpecificIDVElements nasaSpecificIDVElements;

            /**
             * Gets the value of the agencyID property.
             * 
             */
            public int getAgencyID() {
                return agencyID;
            }

            /**
             * Sets the value of the agencyID property.
             * 
             */
            public void setAgencyID(int value) {
                this.agencyID = value;
            }

            /**
             * Gets the value of the nasaSpecificIDVElements property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfIDVs.IDV.AgencySpecificIDVElements.NASASpecificIDVElements }
             *     
             */
            public ListOfIDVs.IDV.AgencySpecificIDVElements.NASASpecificIDVElements getNASASpecificIDVElements() {
                return nasaSpecificIDVElements;
            }

            /**
             * Sets the value of the nasaSpecificIDVElements property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfIDVs.IDV.AgencySpecificIDVElements.NASASpecificIDVElements }
             *     
             */
            public void setNASASpecificIDVElements(ListOfIDVs.IDV.AgencySpecificIDVElements.NASASpecificIDVElements value) {
                this.nasaSpecificIDVElements = value;
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
             *         &lt;element name="offerorsProposalNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="PRNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="procurementPlacementCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="solicitationIssueDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="listOfContractAdministrationsDelegated">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;all>
             *                   &lt;element name="contractAdministrationDelegated" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                 &lt;/all>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="advisoryOrAssistanceServicesContract" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *         &lt;element name="supportServicesTypeContract" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *         &lt;element name="newTechnologyOrPatentRightsClause" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *         &lt;element name="managementReportingRequirements" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="propertyFinancialReporting" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *         &lt;element name="valueEngineeringClause" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *         &lt;element name="securityCode" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *         &lt;element name="administratorCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="contractingOfficerCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="negotiatorCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="COTRName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="alternateCOTRName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="organizationCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="isPhysicallyComplete" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *         &lt;element name="physicalCompletionDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="cancellationDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="finalInvoicePaidDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="destroyDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="installationUnique" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
             *         &lt;element name="accessionNumber" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
             *         &lt;element name="accountingInstallationNumber" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
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
            public static class NASASpecificIDVElements {

                @XmlElement(required = true)
                protected String offerorsProposalNumber;
                @XmlElement(name = "PRNumber", required = true)
                protected String prNumber;
                @XmlElement(required = true)
                protected String procurementPlacementCode;
                @XmlElement(required = true)
                protected String solicitationIssueDate;
                @XmlElement(required = true)
                protected ListOfIDVs.IDV.AgencySpecificIDVElements.NASASpecificIDVElements.ListOfContractAdministrationsDelegated listOfContractAdministrationsDelegated;
                protected boolean advisoryOrAssistanceServicesContract;
                protected boolean supportServicesTypeContract;
                protected boolean newTechnologyOrPatentRightsClause;
                @XmlElement(required = true)
                protected String managementReportingRequirements;
                protected boolean propertyFinancialReporting;
                protected boolean valueEngineeringClause;
                protected boolean securityCode;
                @XmlElement(required = true)
                protected String administratorCode;
                @XmlElement(required = true)
                protected String contractingOfficerCode;
                @XmlElement(required = true)
                protected String negotiatorCode;
                @XmlElement(name = "COTRName", required = true)
                protected String cotrName;
                @XmlElement(required = true)
                protected String alternateCOTRName;
                @XmlElement(required = true)
                protected String organizationCode;
                protected boolean isPhysicallyComplete;
                @XmlElement(required = true)
                protected String physicalCompletionDate;
                @XmlElement(required = true)
                protected String cancellationDate;
                @XmlElement(required = true)
                protected String finalInvoicePaidDate;
                @XmlElement(required = true)
                protected String destroyDate;
                @XmlSchemaType(name = "unsignedByte")
                protected short installationUnique;
                @XmlSchemaType(name = "unsignedByte")
                protected short accessionNumber;
                @XmlSchemaType(name = "unsignedByte")
                protected short accountingInstallationNumber;

                /**
                 * Gets the value of the offerorsProposalNumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOfferorsProposalNumber() {
                    return offerorsProposalNumber;
                }

                /**
                 * Sets the value of the offerorsProposalNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOfferorsProposalNumber(String value) {
                    this.offerorsProposalNumber = value;
                }

                /**
                 * Gets the value of the prNumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPRNumber() {
                    return prNumber;
                }

                /**
                 * Sets the value of the prNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPRNumber(String value) {
                    this.prNumber = value;
                }

                /**
                 * Gets the value of the procurementPlacementCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getProcurementPlacementCode() {
                    return procurementPlacementCode;
                }

                /**
                 * Sets the value of the procurementPlacementCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setProcurementPlacementCode(String value) {
                    this.procurementPlacementCode = value;
                }

                /**
                 * Gets the value of the solicitationIssueDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSolicitationIssueDate() {
                    return solicitationIssueDate;
                }

                /**
                 * Sets the value of the solicitationIssueDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSolicitationIssueDate(String value) {
                    this.solicitationIssueDate = value;
                }

                /**
                 * Gets the value of the listOfContractAdministrationsDelegated property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ListOfIDVs.IDV.AgencySpecificIDVElements.NASASpecificIDVElements.ListOfContractAdministrationsDelegated }
                 *     
                 */
                public ListOfIDVs.IDV.AgencySpecificIDVElements.NASASpecificIDVElements.ListOfContractAdministrationsDelegated getListOfContractAdministrationsDelegated() {
                    return listOfContractAdministrationsDelegated;
                }

                /**
                 * Sets the value of the listOfContractAdministrationsDelegated property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ListOfIDVs.IDV.AgencySpecificIDVElements.NASASpecificIDVElements.ListOfContractAdministrationsDelegated }
                 *     
                 */
                public void setListOfContractAdministrationsDelegated(ListOfIDVs.IDV.AgencySpecificIDVElements.NASASpecificIDVElements.ListOfContractAdministrationsDelegated value) {
                    this.listOfContractAdministrationsDelegated = value;
                }

                /**
                 * Gets the value of the advisoryOrAssistanceServicesContract property.
                 * 
                 */
                public boolean isAdvisoryOrAssistanceServicesContract() {
                    return advisoryOrAssistanceServicesContract;
                }

                /**
                 * Sets the value of the advisoryOrAssistanceServicesContract property.
                 * 
                 */
                public void setAdvisoryOrAssistanceServicesContract(boolean value) {
                    this.advisoryOrAssistanceServicesContract = value;
                }

                /**
                 * Gets the value of the supportServicesTypeContract property.
                 * 
                 */
                public boolean isSupportServicesTypeContract() {
                    return supportServicesTypeContract;
                }

                /**
                 * Sets the value of the supportServicesTypeContract property.
                 * 
                 */
                public void setSupportServicesTypeContract(boolean value) {
                    this.supportServicesTypeContract = value;
                }

                /**
                 * Gets the value of the newTechnologyOrPatentRightsClause property.
                 * 
                 */
                public boolean isNewTechnologyOrPatentRightsClause() {
                    return newTechnologyOrPatentRightsClause;
                }

                /**
                 * Sets the value of the newTechnologyOrPatentRightsClause property.
                 * 
                 */
                public void setNewTechnologyOrPatentRightsClause(boolean value) {
                    this.newTechnologyOrPatentRightsClause = value;
                }

                /**
                 * Gets the value of the managementReportingRequirements property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getManagementReportingRequirements() {
                    return managementReportingRequirements;
                }

                /**
                 * Sets the value of the managementReportingRequirements property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setManagementReportingRequirements(String value) {
                    this.managementReportingRequirements = value;
                }

                /**
                 * Gets the value of the propertyFinancialReporting property.
                 * 
                 */
                public boolean isPropertyFinancialReporting() {
                    return propertyFinancialReporting;
                }

                /**
                 * Sets the value of the propertyFinancialReporting property.
                 * 
                 */
                public void setPropertyFinancialReporting(boolean value) {
                    this.propertyFinancialReporting = value;
                }

                /**
                 * Gets the value of the valueEngineeringClause property.
                 * 
                 */
                public boolean isValueEngineeringClause() {
                    return valueEngineeringClause;
                }

                /**
                 * Sets the value of the valueEngineeringClause property.
                 * 
                 */
                public void setValueEngineeringClause(boolean value) {
                    this.valueEngineeringClause = value;
                }

                /**
                 * Gets the value of the securityCode property.
                 * 
                 */
                public boolean isSecurityCode() {
                    return securityCode;
                }

                /**
                 * Sets the value of the securityCode property.
                 * 
                 */
                public void setSecurityCode(boolean value) {
                    this.securityCode = value;
                }

                /**
                 * Gets the value of the administratorCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAdministratorCode() {
                    return administratorCode;
                }

                /**
                 * Sets the value of the administratorCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAdministratorCode(String value) {
                    this.administratorCode = value;
                }

                /**
                 * Gets the value of the contractingOfficerCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getContractingOfficerCode() {
                    return contractingOfficerCode;
                }

                /**
                 * Sets the value of the contractingOfficerCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setContractingOfficerCode(String value) {
                    this.contractingOfficerCode = value;
                }

                /**
                 * Gets the value of the negotiatorCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNegotiatorCode() {
                    return negotiatorCode;
                }

                /**
                 * Sets the value of the negotiatorCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNegotiatorCode(String value) {
                    this.negotiatorCode = value;
                }

                /**
                 * Gets the value of the cotrName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCOTRName() {
                    return cotrName;
                }

                /**
                 * Sets the value of the cotrName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCOTRName(String value) {
                    this.cotrName = value;
                }

                /**
                 * Gets the value of the alternateCOTRName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAlternateCOTRName() {
                    return alternateCOTRName;
                }

                /**
                 * Sets the value of the alternateCOTRName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAlternateCOTRName(String value) {
                    this.alternateCOTRName = value;
                }

                /**
                 * Gets the value of the organizationCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOrganizationCode() {
                    return organizationCode;
                }

                /**
                 * Sets the value of the organizationCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOrganizationCode(String value) {
                    this.organizationCode = value;
                }

                /**
                 * Gets the value of the isPhysicallyComplete property.
                 * 
                 */
                public boolean isIsPhysicallyComplete() {
                    return isPhysicallyComplete;
                }

                /**
                 * Sets the value of the isPhysicallyComplete property.
                 * 
                 */
                public void setIsPhysicallyComplete(boolean value) {
                    this.isPhysicallyComplete = value;
                }

                /**
                 * Gets the value of the physicalCompletionDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPhysicalCompletionDate() {
                    return physicalCompletionDate;
                }

                /**
                 * Sets the value of the physicalCompletionDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPhysicalCompletionDate(String value) {
                    this.physicalCompletionDate = value;
                }

                /**
                 * Gets the value of the cancellationDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCancellationDate() {
                    return cancellationDate;
                }

                /**
                 * Sets the value of the cancellationDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCancellationDate(String value) {
                    this.cancellationDate = value;
                }

                /**
                 * Gets the value of the finalInvoicePaidDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFinalInvoicePaidDate() {
                    return finalInvoicePaidDate;
                }

                /**
                 * Sets the value of the finalInvoicePaidDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFinalInvoicePaidDate(String value) {
                    this.finalInvoicePaidDate = value;
                }

                /**
                 * Gets the value of the destroyDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDestroyDate() {
                    return destroyDate;
                }

                /**
                 * Sets the value of the destroyDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDestroyDate(String value) {
                    this.destroyDate = value;
                }

                /**
                 * Gets the value of the installationUnique property.
                 * 
                 */
                public short getInstallationUnique() {
                    return installationUnique;
                }

                /**
                 * Sets the value of the installationUnique property.
                 * 
                 */
                public void setInstallationUnique(short value) {
                    this.installationUnique = value;
                }

                /**
                 * Gets the value of the accessionNumber property.
                 * 
                 */
                public short getAccessionNumber() {
                    return accessionNumber;
                }

                /**
                 * Sets the value of the accessionNumber property.
                 * 
                 */
                public void setAccessionNumber(short value) {
                    this.accessionNumber = value;
                }

                /**
                 * Gets the value of the accountingInstallationNumber property.
                 * 
                 */
                public short getAccountingInstallationNumber() {
                    return accountingInstallationNumber;
                }

                /**
                 * Sets the value of the accountingInstallationNumber property.
                 * 
                 */
                public void setAccountingInstallationNumber(short value) {
                    this.accountingInstallationNumber = value;
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
                 *         &lt;element name="contractAdministrationDelegated" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                public static class ListOfContractAdministrationsDelegated {

                    @XmlElement(required = true)
                    protected String contractAdministrationDelegated;

                    /**
                     * Gets the value of the contractAdministrationDelegated property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getContractAdministrationDelegated() {
                        return contractAdministrationDelegated;
                    }

                    /**
                     * Sets the value of the contractAdministrationDelegated property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setContractAdministrationDelegated(String value) {
                        this.contractAdministrationDelegated = value;
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
         *         &lt;element name="extentCompeted">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
         *         &lt;element name="statutoryExceptionToFairOpportunity">
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
         *         &lt;element name="numberOfOffersReceived" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
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
            "extentCompeted",
            "solicitationProcedures",
            "typeOfSetAside",
            "evaluatedPreference",
            "research",
            "statutoryExceptionToFairOpportunity",
            "reasonNotCompeted",
            "numberOfOffersReceived",
            "commercialItemAcquisitionProcedures",
            "commercialItemTestProgram",
            "smallBusinessCompetitivenessDemonstrationProgram",
            "a76Action",
            "fedBizOpps",
            "localAreaSetAside"
        })
        public static class Competition {

            @XmlElement(required = true)
            protected ListOfIDVs.IDV.Competition.ExtentCompeted extentCompeted;
            @XmlElement(required = true)
            protected ListOfIDVs.IDV.Competition.SolicitationProcedures solicitationProcedures;
            @XmlElement(required = true)
            protected ListOfIDVs.IDV.Competition.TypeOfSetAside typeOfSetAside;
            @XmlElement(required = true)
            protected ListOfIDVs.IDV.Competition.EvaluatedPreference evaluatedPreference;
            @XmlElement(required = true)
            protected ListOfIDVs.IDV.Competition.Research research;
            @XmlElement(required = true)
            protected ListOfIDVs.IDV.Competition.StatutoryExceptionToFairOpportunity statutoryExceptionToFairOpportunity;
            @XmlElement(required = true)
            protected ListOfIDVs.IDV.Competition.ReasonNotCompeted reasonNotCompeted;
            @XmlSchemaType(name = "unsignedShort")
            protected int numberOfOffersReceived;
            @XmlElement(required = true)
            protected ListOfIDVs.IDV.Competition.CommercialItemAcquisitionProcedures commercialItemAcquisitionProcedures;
            @XmlElement(required = true)
            protected ListOfIDVs.IDV.Competition.CommercialItemTestProgram commercialItemTestProgram;
            protected boolean smallBusinessCompetitivenessDemonstrationProgram;
            @XmlElement(name = "A76Action", required = true)
            protected ListOfIDVs.IDV.Competition.A76Action a76Action;
            @XmlElement(required = true)
            protected ListOfIDVs.IDV.Competition.FedBizOpps fedBizOpps;
            @XmlElement(required = true)
            protected ListOfIDVs.IDV.Competition.LocalAreaSetAside localAreaSetAside;

            /**
             * Gets the value of the extentCompeted property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfIDVs.IDV.Competition.ExtentCompeted }
             *     
             */
            public ListOfIDVs.IDV.Competition.ExtentCompeted getExtentCompeted() {
                return extentCompeted;
            }

            /**
             * Sets the value of the extentCompeted property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfIDVs.IDV.Competition.ExtentCompeted }
             *     
             */
            public void setExtentCompeted(ListOfIDVs.IDV.Competition.ExtentCompeted value) {
                this.extentCompeted = value;
            }

            /**
             * Gets the value of the solicitationProcedures property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfIDVs.IDV.Competition.SolicitationProcedures }
             *     
             */
            public ListOfIDVs.IDV.Competition.SolicitationProcedures getSolicitationProcedures() {
                return solicitationProcedures;
            }

            /**
             * Sets the value of the solicitationProcedures property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfIDVs.IDV.Competition.SolicitationProcedures }
             *     
             */
            public void setSolicitationProcedures(ListOfIDVs.IDV.Competition.SolicitationProcedures value) {
                this.solicitationProcedures = value;
            }

            /**
             * Gets the value of the typeOfSetAside property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfIDVs.IDV.Competition.TypeOfSetAside }
             *     
             */
            public ListOfIDVs.IDV.Competition.TypeOfSetAside getTypeOfSetAside() {
                return typeOfSetAside;
            }

            /**
             * Sets the value of the typeOfSetAside property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfIDVs.IDV.Competition.TypeOfSetAside }
             *     
             */
            public void setTypeOfSetAside(ListOfIDVs.IDV.Competition.TypeOfSetAside value) {
                this.typeOfSetAside = value;
            }

            /**
             * Gets the value of the evaluatedPreference property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfIDVs.IDV.Competition.EvaluatedPreference }
             *     
             */
            public ListOfIDVs.IDV.Competition.EvaluatedPreference getEvaluatedPreference() {
                return evaluatedPreference;
            }

            /**
             * Sets the value of the evaluatedPreference property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfIDVs.IDV.Competition.EvaluatedPreference }
             *     
             */
            public void setEvaluatedPreference(ListOfIDVs.IDV.Competition.EvaluatedPreference value) {
                this.evaluatedPreference = value;
            }

            /**
             * Gets the value of the research property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfIDVs.IDV.Competition.Research }
             *     
             */
            public ListOfIDVs.IDV.Competition.Research getResearch() {
                return research;
            }

            /**
             * Sets the value of the research property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfIDVs.IDV.Competition.Research }
             *     
             */
            public void setResearch(ListOfIDVs.IDV.Competition.Research value) {
                this.research = value;
            }

            /**
             * Gets the value of the statutoryExceptionToFairOpportunity property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfIDVs.IDV.Competition.StatutoryExceptionToFairOpportunity }
             *     
             */
            public ListOfIDVs.IDV.Competition.StatutoryExceptionToFairOpportunity getStatutoryExceptionToFairOpportunity() {
                return statutoryExceptionToFairOpportunity;
            }

            /**
             * Sets the value of the statutoryExceptionToFairOpportunity property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfIDVs.IDV.Competition.StatutoryExceptionToFairOpportunity }
             *     
             */
            public void setStatutoryExceptionToFairOpportunity(ListOfIDVs.IDV.Competition.StatutoryExceptionToFairOpportunity value) {
                this.statutoryExceptionToFairOpportunity = value;
            }

            /**
             * Gets the value of the reasonNotCompeted property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfIDVs.IDV.Competition.ReasonNotCompeted }
             *     
             */
            public ListOfIDVs.IDV.Competition.ReasonNotCompeted getReasonNotCompeted() {
                return reasonNotCompeted;
            }

            /**
             * Sets the value of the reasonNotCompeted property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfIDVs.IDV.Competition.ReasonNotCompeted }
             *     
             */
            public void setReasonNotCompeted(ListOfIDVs.IDV.Competition.ReasonNotCompeted value) {
                this.reasonNotCompeted = value;
            }

            /**
             * Gets the value of the numberOfOffersReceived property.
             * 
             */
            public int getNumberOfOffersReceived() {
                return numberOfOffersReceived;
            }

            /**
             * Sets the value of the numberOfOffersReceived property.
             * 
             */
            public void setNumberOfOffersReceived(int value) {
                this.numberOfOffersReceived = value;
            }

            /**
             * Gets the value of the commercialItemAcquisitionProcedures property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfIDVs.IDV.Competition.CommercialItemAcquisitionProcedures }
             *     
             */
            public ListOfIDVs.IDV.Competition.CommercialItemAcquisitionProcedures getCommercialItemAcquisitionProcedures() {
                return commercialItemAcquisitionProcedures;
            }

            /**
             * Sets the value of the commercialItemAcquisitionProcedures property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfIDVs.IDV.Competition.CommercialItemAcquisitionProcedures }
             *     
             */
            public void setCommercialItemAcquisitionProcedures(ListOfIDVs.IDV.Competition.CommercialItemAcquisitionProcedures value) {
                this.commercialItemAcquisitionProcedures = value;
            }

            /**
             * Gets the value of the commercialItemTestProgram property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfIDVs.IDV.Competition.CommercialItemTestProgram }
             *     
             */
            public ListOfIDVs.IDV.Competition.CommercialItemTestProgram getCommercialItemTestProgram() {
                return commercialItemTestProgram;
            }

            /**
             * Sets the value of the commercialItemTestProgram property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfIDVs.IDV.Competition.CommercialItemTestProgram }
             *     
             */
            public void setCommercialItemTestProgram(ListOfIDVs.IDV.Competition.CommercialItemTestProgram value) {
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
             *     {@link ListOfIDVs.IDV.Competition.A76Action }
             *     
             */
            public ListOfIDVs.IDV.Competition.A76Action getA76Action() {
                return a76Action;
            }

            /**
             * Sets the value of the a76Action property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfIDVs.IDV.Competition.A76Action }
             *     
             */
            public void setA76Action(ListOfIDVs.IDV.Competition.A76Action value) {
                this.a76Action = value;
            }

            /**
             * Gets the value of the fedBizOpps property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfIDVs.IDV.Competition.FedBizOpps }
             *     
             */
            public ListOfIDVs.IDV.Competition.FedBizOpps getFedBizOpps() {
                return fedBizOpps;
            }

            /**
             * Sets the value of the fedBizOpps property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfIDVs.IDV.Competition.FedBizOpps }
             *     
             */
            public void setFedBizOpps(ListOfIDVs.IDV.Competition.FedBizOpps value) {
                this.fedBizOpps = value;
            }

            /**
             * Gets the value of the localAreaSetAside property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfIDVs.IDV.Competition.LocalAreaSetAside }
             *     
             */
            public ListOfIDVs.IDV.Competition.LocalAreaSetAside getLocalAreaSetAside() {
                return localAreaSetAside;
            }

            /**
             * Sets the value of the localAreaSetAside property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfIDVs.IDV.Competition.LocalAreaSetAside }
             *     
             */
            public void setLocalAreaSetAside(ListOfIDVs.IDV.Competition.LocalAreaSetAside value) {
                this.localAreaSetAside = value;
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
         *         &lt;element ref="{http://www.fpdsng.com/FPDS}multiYearContract"/>
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
         *         &lt;element name="solicitationID" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="costAccountingStandardsClause">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="descriptionOfContractRequirement" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
         *         &lt;element name="listOfTreasuryAccounts">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="treasuryAccount">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="treasuryAccountSymbol">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="agencyIdentifier" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
         *                                       &lt;element name="mainAccountCode" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
         *                                       &lt;element name="subAccountCode" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="initiative">
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
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
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
         *         &lt;element name="multipleOrSingleAwardIDC">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="typeOfIDC">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="programAcronym" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="costOrPricingData">
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
         *         &lt;element name="majorProgramCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            protected MultiYearContract multiYearContract;
            @XmlElement(required = true)
            protected ListOfIDVs.IDV.ContractData.ContractActionType contractActionType;
            @XmlElement(required = true)
            protected ListOfIDVs.IDV.ContractData.TypeOfContractPricing typeOfContractPricing;
            @XmlElement(required = true)
            protected ListOfIDVs.IDV.ContractData.ReasonForModification reasonForModification;
            @XmlElement(required = true)
            protected ListOfIDVs.IDV.ContractData.NationalInterestActionCode nationalInterestActionCode;
            @XmlElement(required = true)
            protected String solicitationID;
            @XmlElement(required = true)
            protected ListOfIDVs.IDV.ContractData.CostAccountingStandardsClause costAccountingStandardsClause;
            @XmlElement(required = true)
            protected String descriptionOfContractRequirement;
            @XmlElement(required = true)
            protected ListOfIDVs.IDV.ContractData.InherentlyGovernmentalFunction inherentlyGovernmentalFunction;
            @XmlElement(name = "GFE-GFP", required = true)
            protected ListOfIDVs.IDV.ContractData.GFEGFP gfegfp;
            @XmlElement(required = true)
            protected ListOfIDVs.IDV.ContractData.UndefinitizedAction undefinitizedAction;
            @XmlElement(required = true)
            protected ListOfIDVs.IDV.ContractData.ConsolidatedContract consolidatedContract;
            @XmlElement(required = true)
            protected ListOfIDVs.IDV.ContractData.PerformanceBasedServiceContract performanceBasedServiceContract;
            @XmlElement(required = true)
            protected ListOfIDVs.IDV.ContractData.ListOfTreasuryAccounts listOfTreasuryAccounts;
            @XmlElement(required = true)
            protected ListOfIDVs.IDV.ContractData.ContingencyHumanitarianPeacekeepingOperation contingencyHumanitarianPeacekeepingOperation;
            @XmlElement(required = true)
            protected ListOfIDVs.IDV.ContractData.MultipleOrSingleAwardIDC multipleOrSingleAwardIDC;
            @XmlElement(required = true)
            protected ListOfIDVs.IDV.ContractData.TypeOfIDC typeOfIDC;
            @XmlElement(required = true)
            protected String programAcronym;
            @XmlElement(required = true)
            protected ListOfIDVs.IDV.ContractData.CostOrPricingData costOrPricingData;
            @XmlElement(required = true)
            protected ListOfIDVs.IDV.ContractData.SeaTransportation seaTransportation;
            @XmlElement(required = true)
            protected String majorProgramCode;

            /**
             * Gets the value of the multiYearContract property.
             * 
             * @return
             *     possible object is
             *     {@link MultiYearContract }
             *     
             */
            public MultiYearContract getMultiYearContract() {
                return multiYearContract;
            }

            /**
             * Sets the value of the multiYearContract property.
             * 
             * @param value
             *     allowed object is
             *     {@link MultiYearContract }
             *     
             */
            public void setMultiYearContract(MultiYearContract value) {
                this.multiYearContract = value;
            }

            /**
             * Gets the value of the contractActionType property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfIDVs.IDV.ContractData.ContractActionType }
             *     
             */
            public ListOfIDVs.IDV.ContractData.ContractActionType getContractActionType() {
                return contractActionType;
            }

            /**
             * Sets the value of the contractActionType property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfIDVs.IDV.ContractData.ContractActionType }
             *     
             */
            public void setContractActionType(ListOfIDVs.IDV.ContractData.ContractActionType value) {
                this.contractActionType = value;
            }

            /**
             * Gets the value of the typeOfContractPricing property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfIDVs.IDV.ContractData.TypeOfContractPricing }
             *     
             */
            public ListOfIDVs.IDV.ContractData.TypeOfContractPricing getTypeOfContractPricing() {
                return typeOfContractPricing;
            }

            /**
             * Sets the value of the typeOfContractPricing property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfIDVs.IDV.ContractData.TypeOfContractPricing }
             *     
             */
            public void setTypeOfContractPricing(ListOfIDVs.IDV.ContractData.TypeOfContractPricing value) {
                this.typeOfContractPricing = value;
            }

            /**
             * Gets the value of the reasonForModification property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfIDVs.IDV.ContractData.ReasonForModification }
             *     
             */
            public ListOfIDVs.IDV.ContractData.ReasonForModification getReasonForModification() {
                return reasonForModification;
            }

            /**
             * Sets the value of the reasonForModification property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfIDVs.IDV.ContractData.ReasonForModification }
             *     
             */
            public void setReasonForModification(ListOfIDVs.IDV.ContractData.ReasonForModification value) {
                this.reasonForModification = value;
            }

            /**
             * Gets the value of the nationalInterestActionCode property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfIDVs.IDV.ContractData.NationalInterestActionCode }
             *     
             */
            public ListOfIDVs.IDV.ContractData.NationalInterestActionCode getNationalInterestActionCode() {
                return nationalInterestActionCode;
            }

            /**
             * Sets the value of the nationalInterestActionCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfIDVs.IDV.ContractData.NationalInterestActionCode }
             *     
             */
            public void setNationalInterestActionCode(ListOfIDVs.IDV.ContractData.NationalInterestActionCode value) {
                this.nationalInterestActionCode = value;
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
             * Gets the value of the costAccountingStandardsClause property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfIDVs.IDV.ContractData.CostAccountingStandardsClause }
             *     
             */
            public ListOfIDVs.IDV.ContractData.CostAccountingStandardsClause getCostAccountingStandardsClause() {
                return costAccountingStandardsClause;
            }

            /**
             * Sets the value of the costAccountingStandardsClause property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfIDVs.IDV.ContractData.CostAccountingStandardsClause }
             *     
             */
            public void setCostAccountingStandardsClause(ListOfIDVs.IDV.ContractData.CostAccountingStandardsClause value) {
                this.costAccountingStandardsClause = value;
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
             * Gets the value of the inherentlyGovernmentalFunction property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfIDVs.IDV.ContractData.InherentlyGovernmentalFunction }
             *     
             */
            public ListOfIDVs.IDV.ContractData.InherentlyGovernmentalFunction getInherentlyGovernmentalFunction() {
                return inherentlyGovernmentalFunction;
            }

            /**
             * Sets the value of the inherentlyGovernmentalFunction property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfIDVs.IDV.ContractData.InherentlyGovernmentalFunction }
             *     
             */
            public void setInherentlyGovernmentalFunction(ListOfIDVs.IDV.ContractData.InherentlyGovernmentalFunction value) {
                this.inherentlyGovernmentalFunction = value;
            }

            /**
             * Gets the value of the gfegfp property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfIDVs.IDV.ContractData.GFEGFP }
             *     
             */
            public ListOfIDVs.IDV.ContractData.GFEGFP getGFEGFP() {
                return gfegfp;
            }

            /**
             * Sets the value of the gfegfp property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfIDVs.IDV.ContractData.GFEGFP }
             *     
             */
            public void setGFEGFP(ListOfIDVs.IDV.ContractData.GFEGFP value) {
                this.gfegfp = value;
            }

            /**
             * Gets the value of the undefinitizedAction property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfIDVs.IDV.ContractData.UndefinitizedAction }
             *     
             */
            public ListOfIDVs.IDV.ContractData.UndefinitizedAction getUndefinitizedAction() {
                return undefinitizedAction;
            }

            /**
             * Sets the value of the undefinitizedAction property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfIDVs.IDV.ContractData.UndefinitizedAction }
             *     
             */
            public void setUndefinitizedAction(ListOfIDVs.IDV.ContractData.UndefinitizedAction value) {
                this.undefinitizedAction = value;
            }

            /**
             * Gets the value of the consolidatedContract property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfIDVs.IDV.ContractData.ConsolidatedContract }
             *     
             */
            public ListOfIDVs.IDV.ContractData.ConsolidatedContract getConsolidatedContract() {
                return consolidatedContract;
            }

            /**
             * Sets the value of the consolidatedContract property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfIDVs.IDV.ContractData.ConsolidatedContract }
             *     
             */
            public void setConsolidatedContract(ListOfIDVs.IDV.ContractData.ConsolidatedContract value) {
                this.consolidatedContract = value;
            }

            /**
             * Gets the value of the performanceBasedServiceContract property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfIDVs.IDV.ContractData.PerformanceBasedServiceContract }
             *     
             */
            public ListOfIDVs.IDV.ContractData.PerformanceBasedServiceContract getPerformanceBasedServiceContract() {
                return performanceBasedServiceContract;
            }

            /**
             * Sets the value of the performanceBasedServiceContract property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfIDVs.IDV.ContractData.PerformanceBasedServiceContract }
             *     
             */
            public void setPerformanceBasedServiceContract(ListOfIDVs.IDV.ContractData.PerformanceBasedServiceContract value) {
                this.performanceBasedServiceContract = value;
            }

            /**
             * Gets the value of the listOfTreasuryAccounts property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfIDVs.IDV.ContractData.ListOfTreasuryAccounts }
             *     
             */
            public ListOfIDVs.IDV.ContractData.ListOfTreasuryAccounts getListOfTreasuryAccounts() {
                return listOfTreasuryAccounts;
            }

            /**
             * Sets the value of the listOfTreasuryAccounts property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfIDVs.IDV.ContractData.ListOfTreasuryAccounts }
             *     
             */
            public void setListOfTreasuryAccounts(ListOfIDVs.IDV.ContractData.ListOfTreasuryAccounts value) {
                this.listOfTreasuryAccounts = value;
            }

            /**
             * Gets the value of the contingencyHumanitarianPeacekeepingOperation property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfIDVs.IDV.ContractData.ContingencyHumanitarianPeacekeepingOperation }
             *     
             */
            public ListOfIDVs.IDV.ContractData.ContingencyHumanitarianPeacekeepingOperation getContingencyHumanitarianPeacekeepingOperation() {
                return contingencyHumanitarianPeacekeepingOperation;
            }

            /**
             * Sets the value of the contingencyHumanitarianPeacekeepingOperation property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfIDVs.IDV.ContractData.ContingencyHumanitarianPeacekeepingOperation }
             *     
             */
            public void setContingencyHumanitarianPeacekeepingOperation(ListOfIDVs.IDV.ContractData.ContingencyHumanitarianPeacekeepingOperation value) {
                this.contingencyHumanitarianPeacekeepingOperation = value;
            }

            /**
             * Gets the value of the multipleOrSingleAwardIDC property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfIDVs.IDV.ContractData.MultipleOrSingleAwardIDC }
             *     
             */
            public ListOfIDVs.IDV.ContractData.MultipleOrSingleAwardIDC getMultipleOrSingleAwardIDC() {
                return multipleOrSingleAwardIDC;
            }

            /**
             * Sets the value of the multipleOrSingleAwardIDC property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfIDVs.IDV.ContractData.MultipleOrSingleAwardIDC }
             *     
             */
            public void setMultipleOrSingleAwardIDC(ListOfIDVs.IDV.ContractData.MultipleOrSingleAwardIDC value) {
                this.multipleOrSingleAwardIDC = value;
            }

            /**
             * Gets the value of the typeOfIDC property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfIDVs.IDV.ContractData.TypeOfIDC }
             *     
             */
            public ListOfIDVs.IDV.ContractData.TypeOfIDC getTypeOfIDC() {
                return typeOfIDC;
            }

            /**
             * Sets the value of the typeOfIDC property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfIDVs.IDV.ContractData.TypeOfIDC }
             *     
             */
            public void setTypeOfIDC(ListOfIDVs.IDV.ContractData.TypeOfIDC value) {
                this.typeOfIDC = value;
            }

            /**
             * Gets the value of the programAcronym property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProgramAcronym() {
                return programAcronym;
            }

            /**
             * Sets the value of the programAcronym property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProgramAcronym(String value) {
                this.programAcronym = value;
            }

            /**
             * Gets the value of the costOrPricingData property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfIDVs.IDV.ContractData.CostOrPricingData }
             *     
             */
            public ListOfIDVs.IDV.ContractData.CostOrPricingData getCostOrPricingData() {
                return costOrPricingData;
            }

            /**
             * Sets the value of the costOrPricingData property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfIDVs.IDV.ContractData.CostOrPricingData }
             *     
             */
            public void setCostOrPricingData(ListOfIDVs.IDV.ContractData.CostOrPricingData value) {
                this.costOrPricingData = value;
            }

            /**
             * Gets the value of the seaTransportation property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfIDVs.IDV.ContractData.SeaTransportation }
             *     
             */
            public ListOfIDVs.IDV.ContractData.SeaTransportation getSeaTransportation() {
                return seaTransportation;
            }

            /**
             * Sets the value of the seaTransportation property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfIDVs.IDV.ContractData.SeaTransportation }
             *     
             */
            public void setSeaTransportation(ListOfIDVs.IDV.ContractData.SeaTransportation value) {
                this.seaTransportation = value;
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
             *       &lt;sequence>
             *         &lt;element name="treasuryAccount">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="treasuryAccountSymbol">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="agencyIdentifier" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
             *                             &lt;element name="mainAccountCode" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
             *                             &lt;element name="subAccountCode" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="initiative">
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
                "treasuryAccount"
            })
            public static class ListOfTreasuryAccounts {

                @XmlElement(required = true)
                protected ListOfIDVs.IDV.ContractData.ListOfTreasuryAccounts.TreasuryAccount treasuryAccount;

                /**
                 * Gets the value of the treasuryAccount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ListOfIDVs.IDV.ContractData.ListOfTreasuryAccounts.TreasuryAccount }
                 *     
                 */
                public ListOfIDVs.IDV.ContractData.ListOfTreasuryAccounts.TreasuryAccount getTreasuryAccount() {
                    return treasuryAccount;
                }

                /**
                 * Sets the value of the treasuryAccount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ListOfIDVs.IDV.ContractData.ListOfTreasuryAccounts.TreasuryAccount }
                 *     
                 */
                public void setTreasuryAccount(ListOfIDVs.IDV.ContractData.ListOfTreasuryAccounts.TreasuryAccount value) {
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
                 *       &lt;sequence>
                 *         &lt;element name="treasuryAccountSymbol">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="agencyIdentifier" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
                 *                   &lt;element name="mainAccountCode" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
                 *                   &lt;element name="subAccountCode" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="initiative">
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
                    "treasuryAccountSymbol",
                    "initiative"
                })
                public static class TreasuryAccount {

                    @XmlElement(required = true)
                    protected ListOfIDVs.IDV.ContractData.ListOfTreasuryAccounts.TreasuryAccount.TreasuryAccountSymbol treasuryAccountSymbol;
                    @XmlElement(required = true)
                    protected ListOfIDVs.IDV.ContractData.ListOfTreasuryAccounts.TreasuryAccount.Initiative initiative;

                    /**
                     * Gets the value of the treasuryAccountSymbol property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ListOfIDVs.IDV.ContractData.ListOfTreasuryAccounts.TreasuryAccount.TreasuryAccountSymbol }
                     *     
                     */
                    public ListOfIDVs.IDV.ContractData.ListOfTreasuryAccounts.TreasuryAccount.TreasuryAccountSymbol getTreasuryAccountSymbol() {
                        return treasuryAccountSymbol;
                    }

                    /**
                     * Sets the value of the treasuryAccountSymbol property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ListOfIDVs.IDV.ContractData.ListOfTreasuryAccounts.TreasuryAccount.TreasuryAccountSymbol }
                     *     
                     */
                    public void setTreasuryAccountSymbol(ListOfIDVs.IDV.ContractData.ListOfTreasuryAccounts.TreasuryAccount.TreasuryAccountSymbol value) {
                        this.treasuryAccountSymbol = value;
                    }

                    /**
                     * Gets the value of the initiative property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ListOfIDVs.IDV.ContractData.ListOfTreasuryAccounts.TreasuryAccount.Initiative }
                     *     
                     */
                    public ListOfIDVs.IDV.ContractData.ListOfTreasuryAccounts.TreasuryAccount.Initiative getInitiative() {
                        return initiative;
                    }

                    /**
                     * Sets the value of the initiative property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ListOfIDVs.IDV.ContractData.ListOfTreasuryAccounts.TreasuryAccount.Initiative }
                     *     
                     */
                    public void setInitiative(ListOfIDVs.IDV.ContractData.ListOfTreasuryAccounts.TreasuryAccount.Initiative value) {
                        this.initiative = value;
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
                    public static class Initiative {

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
                     *         &lt;element name="agencyIdentifier" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
                     *         &lt;element name="mainAccountCode" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
                     *         &lt;element name="subAccountCode" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
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
                        "agencyIdentifier",
                        "mainAccountCode",
                        "subAccountCode"
                    })
                    public static class TreasuryAccountSymbol {

                        @XmlSchemaType(name = "unsignedByte")
                        protected short agencyIdentifier;
                        @XmlSchemaType(name = "unsignedShort")
                        protected int mainAccountCode;
                        @XmlSchemaType(name = "unsignedByte")
                        protected short subAccountCode;

                        /**
                         * Gets the value of the agencyIdentifier property.
                         * 
                         */
                        public short getAgencyIdentifier() {
                            return agencyIdentifier;
                        }

                        /**
                         * Sets the value of the agencyIdentifier property.
                         * 
                         */
                        public void setAgencyIdentifier(short value) {
                            this.agencyIdentifier = value;
                        }

                        /**
                         * Gets the value of the mainAccountCode property.
                         * 
                         */
                        public int getMainAccountCode() {
                            return mainAccountCode;
                        }

                        /**
                         * Sets the value of the mainAccountCode property.
                         * 
                         */
                        public void setMainAccountCode(int value) {
                            this.mainAccountCode = value;
                        }

                        /**
                         * Gets the value of the subAccountCode property.
                         * 
                         */
                        public short getSubAccountCode() {
                            return subAccountCode;
                        }

                        /**
                         * Sets the value of the subAccountCode property.
                         * 
                         */
                        public void setSubAccountCode(short value) {
                            this.subAccountCode = value;
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
            public static class MultipleOrSingleAwardIDC {

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
            public static class TypeOfIDC {

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
         *         &lt;element name="IDVID">
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
            "idvid",
            "referencedIDVID"
        })
        public static class ContractID {

            @XmlElement(name = "IDVID", required = true)
            protected ListOfIDVs.IDV.ContractID.IDVID idvid;
            @XmlElement(required = true)
            protected ListOfIDVs.IDV.ContractID.ReferencedIDVID referencedIDVID;

            /**
             * Gets the value of the idvid property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfIDVs.IDV.ContractID.IDVID }
             *     
             */
            public ListOfIDVs.IDV.ContractID.IDVID getIDVID() {
                return idvid;
            }

            /**
             * Sets the value of the idvid property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfIDVs.IDV.ContractID.IDVID }
             *     
             */
            public void setIDVID(ListOfIDVs.IDV.ContractID.IDVID value) {
                this.idvid = value;
            }

            /**
             * Gets the value of the referencedIDVID property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfIDVs.IDV.ContractID.ReferencedIDVID }
             *     
             */
            public ListOfIDVs.IDV.ContractID.ReferencedIDVID getReferencedIDVID() {
                return referencedIDVID;
            }

            /**
             * Sets the value of the referencedIDVID property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfIDVs.IDV.ContractID.ReferencedIDVID }
             *     
             */
            public void setReferencedIDVID(ListOfIDVs.IDV.ContractID.ReferencedIDVID value) {
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
            public static class IDVID {

                @XmlElement(required = true)
                protected ListOfIDVs.IDV.ContractID.IDVID.AgencyID agencyID;
                @XmlElement(name = "PIID", required = true)
                protected String piid;
                @XmlElement(required = true)
                protected String modNumber;

                /**
                 * Gets the value of the agencyID property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ListOfIDVs.IDV.ContractID.IDVID.AgencyID }
                 *     
                 */
                public ListOfIDVs.IDV.ContractID.IDVID.AgencyID getAgencyID() {
                    return agencyID;
                }

                /**
                 * Sets the value of the agencyID property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ListOfIDVs.IDV.ContractID.IDVID.AgencyID }
                 *     
                 */
                public void setAgencyID(ListOfIDVs.IDV.ContractID.IDVID.AgencyID value) {
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
                protected ListOfIDVs.IDV.ContractID.ReferencedIDVID.AgencyID agencyID;
                @XmlElement(name = "PIID", required = true)
                protected String piid;
                @XmlElement(required = true)
                protected String modNumber;

                /**
                 * Gets the value of the agencyID property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ListOfIDVs.IDV.ContractID.ReferencedIDVID.AgencyID }
                 *     
                 */
                public ListOfIDVs.IDV.ContractID.ReferencedIDVID.AgencyID getAgencyID() {
                    return agencyID;
                }

                /**
                 * Sets the value of the agencyID property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ListOfIDVs.IDV.ContractID.ReferencedIDVID.AgencyID }
                 *     
                 */
                public void setAgencyID(ListOfIDVs.IDV.ContractID.ReferencedIDVID.AgencyID value) {
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
         *         &lt;element name="websiteURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="whoCanUse" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="maximumOrderLimit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *         &lt;element name="typeOfFeeForUseOfService">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="emailAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="orderingProcedure" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="fixedFeeValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *         &lt;element name="feeRangeLowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *         &lt;element name="feeRangeUpperValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
        public static class ContractMarketingData {

            @XmlElement(required = true)
            protected String websiteURL;
            @XmlElement(required = true)
            protected String whoCanUse;
            @XmlElement(required = true)
            protected BigDecimal maximumOrderLimit;
            @XmlElement(required = true)
            protected ListOfIDVs.IDV.ContractMarketingData.TypeOfFeeForUseOfService typeOfFeeForUseOfService;
            @XmlElement(required = true)
            protected String emailAddress;
            @XmlElement(required = true)
            protected String orderingProcedure;
            @XmlElement(required = true)
            protected BigDecimal fixedFeeValue;
            @XmlElement(required = true)
            protected BigDecimal feeRangeLowerValue;
            @XmlElement(required = true)
            protected BigDecimal feeRangeUpperValue;

            /**
             * Gets the value of the websiteURL property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWebsiteURL() {
                return websiteURL;
            }

            /**
             * Sets the value of the websiteURL property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWebsiteURL(String value) {
                this.websiteURL = value;
            }

            /**
             * Gets the value of the whoCanUse property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWhoCanUse() {
                return whoCanUse;
            }

            /**
             * Sets the value of the whoCanUse property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWhoCanUse(String value) {
                this.whoCanUse = value;
            }

            /**
             * Gets the value of the maximumOrderLimit property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getMaximumOrderLimit() {
                return maximumOrderLimit;
            }

            /**
             * Sets the value of the maximumOrderLimit property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setMaximumOrderLimit(BigDecimal value) {
                this.maximumOrderLimit = value;
            }

            /**
             * Gets the value of the typeOfFeeForUseOfService property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfIDVs.IDV.ContractMarketingData.TypeOfFeeForUseOfService }
             *     
             */
            public ListOfIDVs.IDV.ContractMarketingData.TypeOfFeeForUseOfService getTypeOfFeeForUseOfService() {
                return typeOfFeeForUseOfService;
            }

            /**
             * Sets the value of the typeOfFeeForUseOfService property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfIDVs.IDV.ContractMarketingData.TypeOfFeeForUseOfService }
             *     
             */
            public void setTypeOfFeeForUseOfService(ListOfIDVs.IDV.ContractMarketingData.TypeOfFeeForUseOfService value) {
                this.typeOfFeeForUseOfService = value;
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
             * Gets the value of the orderingProcedure property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOrderingProcedure() {
                return orderingProcedure;
            }

            /**
             * Sets the value of the orderingProcedure property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOrderingProcedure(String value) {
                this.orderingProcedure = value;
            }

            /**
             * Gets the value of the fixedFeeValue property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getFixedFeeValue() {
                return fixedFeeValue;
            }

            /**
             * Sets the value of the fixedFeeValue property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setFixedFeeValue(BigDecimal value) {
                this.fixedFeeValue = value;
            }

            /**
             * Gets the value of the feeRangeLowerValue property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getFeeRangeLowerValue() {
                return feeRangeLowerValue;
            }

            /**
             * Sets the value of the feeRangeLowerValue property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setFeeRangeLowerValue(BigDecimal value) {
                this.feeRangeLowerValue = value;
            }

            /**
             * Gets the value of the feeRangeUpperValue property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getFeeRangeUpperValue() {
                return feeRangeUpperValue;
            }

            /**
             * Sets the value of the feeRangeUpperValue property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setFeeRangeUpperValue(BigDecimal value) {
                this.feeRangeUpperValue = value;
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
            public static class TypeOfFeeForUseOfService {

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
         *         &lt;element name="obligatedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
            "baseAndAllOptionsValue"
        })
        public static class DollarValues {

            @XmlElement(required = true)
            protected BigDecimal obligatedAmount;
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
         *         &lt;element name="otherStatutoryAuthority" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            protected ListOfIDVs.IDV.LegislativeMandates.ClingerCohenAct clingerCohenAct;
            @XmlElement(name = "WalshHealyAct", required = true)
            protected ListOfIDVs.IDV.LegislativeMandates.WalshHealyAct walshHealyAct;
            @XmlElement(required = true)
            protected ListOfIDVs.IDV.LegislativeMandates.ServiceContractAct serviceContractAct;
            @XmlElement(name = "DavisBaconAct", required = true)
            protected ListOfIDVs.IDV.LegislativeMandates.DavisBaconAct davisBaconAct;
            @XmlElement(required = true)
            protected ListOfIDVs.IDV.LegislativeMandates.InteragencyContractingAuthority interagencyContractingAuthority;
            @XmlElement(required = true)
            protected String otherStatutoryAuthority;

            /**
             * Gets the value of the clingerCohenAct property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfIDVs.IDV.LegislativeMandates.ClingerCohenAct }
             *     
             */
            public ListOfIDVs.IDV.LegislativeMandates.ClingerCohenAct getClingerCohenAct() {
                return clingerCohenAct;
            }

            /**
             * Sets the value of the clingerCohenAct property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfIDVs.IDV.LegislativeMandates.ClingerCohenAct }
             *     
             */
            public void setClingerCohenAct(ListOfIDVs.IDV.LegislativeMandates.ClingerCohenAct value) {
                this.clingerCohenAct = value;
            }

            /**
             * Gets the value of the walshHealyAct property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfIDVs.IDV.LegislativeMandates.WalshHealyAct }
             *     
             */
            public ListOfIDVs.IDV.LegislativeMandates.WalshHealyAct getWalshHealyAct() {
                return walshHealyAct;
            }

            /**
             * Sets the value of the walshHealyAct property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfIDVs.IDV.LegislativeMandates.WalshHealyAct }
             *     
             */
            public void setWalshHealyAct(ListOfIDVs.IDV.LegislativeMandates.WalshHealyAct value) {
                this.walshHealyAct = value;
            }

            /**
             * Gets the value of the serviceContractAct property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfIDVs.IDV.LegislativeMandates.ServiceContractAct }
             *     
             */
            public ListOfIDVs.IDV.LegislativeMandates.ServiceContractAct getServiceContractAct() {
                return serviceContractAct;
            }

            /**
             * Sets the value of the serviceContractAct property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfIDVs.IDV.LegislativeMandates.ServiceContractAct }
             *     
             */
            public void setServiceContractAct(ListOfIDVs.IDV.LegislativeMandates.ServiceContractAct value) {
                this.serviceContractAct = value;
            }

            /**
             * Gets the value of the davisBaconAct property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfIDVs.IDV.LegislativeMandates.DavisBaconAct }
             *     
             */
            public ListOfIDVs.IDV.LegislativeMandates.DavisBaconAct getDavisBaconAct() {
                return davisBaconAct;
            }

            /**
             * Sets the value of the davisBaconAct property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfIDVs.IDV.LegislativeMandates.DavisBaconAct }
             *     
             */
            public void setDavisBaconAct(ListOfIDVs.IDV.LegislativeMandates.DavisBaconAct value) {
                this.davisBaconAct = value;
            }

            /**
             * Gets the value of the interagencyContractingAuthority property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfIDVs.IDV.LegislativeMandates.InteragencyContractingAuthority }
             *     
             */
            public ListOfIDVs.IDV.LegislativeMandates.InteragencyContractingAuthority getInteragencyContractingAuthority() {
                return interagencyContractingAuthority;
            }

            /**
             * Sets the value of the interagencyContractingAuthority property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfIDVs.IDV.LegislativeMandates.InteragencyContractingAuthority }
             *     
             */
            public void setInteragencyContractingAuthority(ListOfIDVs.IDV.LegislativeMandates.InteragencyContractingAuthority value) {
                this.interagencyContractingAuthority = value;
            }

            /**
             * Gets the value of the otherStatutoryAuthority property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOtherStatutoryAuthority() {
                return otherStatutoryAuthority;
            }

            /**
             * Sets the value of the otherStatutoryAuthority property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOtherStatutoryAuthority(String value) {
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
         *         &lt;element name="subcontractPlan">
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
            "subcontractPlan"
        })
        public static class PreferencePrograms {

            @XmlElement(required = true)
            protected ListOfIDVs.IDV.PreferencePrograms.SubcontractPlan subcontractPlan;

            /**
             * Gets the value of the subcontractPlan property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfIDVs.IDV.PreferencePrograms.SubcontractPlan }
             *     
             */
            public ListOfIDVs.IDV.PreferencePrograms.SubcontractPlan getSubcontractPlan() {
                return subcontractPlan;
            }

            /**
             * Sets the value of the subcontractPlan property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfIDVs.IDV.PreferencePrograms.SubcontractPlan }
             *     
             */
            public void setSubcontractPlan(ListOfIDVs.IDV.PreferencePrograms.SubcontractPlan value) {
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
         *         &lt;element name="recoveredMaterialClauses">
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
            protected ListOfIDVs.IDV.ProductOrServiceInformation.ProductOrServiceCode productOrServiceCode;
            @XmlElement(required = true)
            protected ListOfIDVs.IDV.ProductOrServiceInformation.ContractBundling contractBundling;
            @XmlElement(required = true)
            protected ListOfIDVs.IDV.ProductOrServiceInformation.ClaimantProgramCode claimantProgramCode;
            @XmlElement(required = true)
            protected ListOfIDVs.IDV.ProductOrServiceInformation.PrincipalNAICSCode principalNAICSCode;
            @XmlElement(required = true)
            protected ListOfIDVs.IDV.ProductOrServiceInformation.RecoveredMaterialClauses recoveredMaterialClauses;
            @XmlElement(required = true)
            protected ListOfIDVs.IDV.ProductOrServiceInformation.ManufacturingOrganizationType manufacturingOrganizationType;

            /**
             * Gets the value of the productOrServiceCode property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfIDVs.IDV.ProductOrServiceInformation.ProductOrServiceCode }
             *     
             */
            public ListOfIDVs.IDV.ProductOrServiceInformation.ProductOrServiceCode getProductOrServiceCode() {
                return productOrServiceCode;
            }

            /**
             * Sets the value of the productOrServiceCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfIDVs.IDV.ProductOrServiceInformation.ProductOrServiceCode }
             *     
             */
            public void setProductOrServiceCode(ListOfIDVs.IDV.ProductOrServiceInformation.ProductOrServiceCode value) {
                this.productOrServiceCode = value;
            }

            /**
             * Gets the value of the contractBundling property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfIDVs.IDV.ProductOrServiceInformation.ContractBundling }
             *     
             */
            public ListOfIDVs.IDV.ProductOrServiceInformation.ContractBundling getContractBundling() {
                return contractBundling;
            }

            /**
             * Sets the value of the contractBundling property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfIDVs.IDV.ProductOrServiceInformation.ContractBundling }
             *     
             */
            public void setContractBundling(ListOfIDVs.IDV.ProductOrServiceInformation.ContractBundling value) {
                this.contractBundling = value;
            }

            /**
             * Gets the value of the claimantProgramCode property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfIDVs.IDV.ProductOrServiceInformation.ClaimantProgramCode }
             *     
             */
            public ListOfIDVs.IDV.ProductOrServiceInformation.ClaimantProgramCode getClaimantProgramCode() {
                return claimantProgramCode;
            }

            /**
             * Sets the value of the claimantProgramCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfIDVs.IDV.ProductOrServiceInformation.ClaimantProgramCode }
             *     
             */
            public void setClaimantProgramCode(ListOfIDVs.IDV.ProductOrServiceInformation.ClaimantProgramCode value) {
                this.claimantProgramCode = value;
            }

            /**
             * Gets the value of the principalNAICSCode property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfIDVs.IDV.ProductOrServiceInformation.PrincipalNAICSCode }
             *     
             */
            public ListOfIDVs.IDV.ProductOrServiceInformation.PrincipalNAICSCode getPrincipalNAICSCode() {
                return principalNAICSCode;
            }

            /**
             * Sets the value of the principalNAICSCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfIDVs.IDV.ProductOrServiceInformation.PrincipalNAICSCode }
             *     
             */
            public void setPrincipalNAICSCode(ListOfIDVs.IDV.ProductOrServiceInformation.PrincipalNAICSCode value) {
                this.principalNAICSCode = value;
            }

            /**
             * Gets the value of the recoveredMaterialClauses property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfIDVs.IDV.ProductOrServiceInformation.RecoveredMaterialClauses }
             *     
             */
            public ListOfIDVs.IDV.ProductOrServiceInformation.RecoveredMaterialClauses getRecoveredMaterialClauses() {
                return recoveredMaterialClauses;
            }

            /**
             * Sets the value of the recoveredMaterialClauses property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfIDVs.IDV.ProductOrServiceInformation.RecoveredMaterialClauses }
             *     
             */
            public void setRecoveredMaterialClauses(ListOfIDVs.IDV.ProductOrServiceInformation.RecoveredMaterialClauses value) {
                this.recoveredMaterialClauses = value;
            }

            /**
             * Gets the value of the manufacturingOrganizationType property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfIDVs.IDV.ProductOrServiceInformation.ManufacturingOrganizationType }
             *     
             */
            public ListOfIDVs.IDV.ProductOrServiceInformation.ManufacturingOrganizationType getManufacturingOrganizationType() {
                return manufacturingOrganizationType;
            }

            /**
             * Sets the value of the manufacturingOrganizationType property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfIDVs.IDV.ProductOrServiceInformation.ManufacturingOrganizationType }
             *     
             */
            public void setManufacturingOrganizationType(ListOfIDVs.IDV.ProductOrServiceInformation.ManufacturingOrganizationType value) {
                this.manufacturingOrganizationType = value;
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
            protected ListOfIDVs.IDV.PurchaserInformation.ContractingOfficeAgencyID contractingOfficeAgencyID;
            @XmlElement(required = true)
            protected ListOfIDVs.IDV.PurchaserInformation.ContractingOfficeID contractingOfficeID;
            @XmlElement(required = true)
            protected ListOfIDVs.IDV.PurchaserInformation.ForeignFunding foreignFunding;
            @XmlElement(required = true)
            protected ListOfIDVs.IDV.PurchaserInformation.FundingRequestingAgencyID fundingRequestingAgencyID;
            @XmlElement(required = true)
            protected ListOfIDVs.IDV.PurchaserInformation.FundingRequestingOfficeID fundingRequestingOfficeID;

            /**
             * Gets the value of the contractingOfficeAgencyID property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfIDVs.IDV.PurchaserInformation.ContractingOfficeAgencyID }
             *     
             */
            public ListOfIDVs.IDV.PurchaserInformation.ContractingOfficeAgencyID getContractingOfficeAgencyID() {
                return contractingOfficeAgencyID;
            }

            /**
             * Sets the value of the contractingOfficeAgencyID property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfIDVs.IDV.PurchaserInformation.ContractingOfficeAgencyID }
             *     
             */
            public void setContractingOfficeAgencyID(ListOfIDVs.IDV.PurchaserInformation.ContractingOfficeAgencyID value) {
                this.contractingOfficeAgencyID = value;
            }

            /**
             * Gets the value of the contractingOfficeID property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfIDVs.IDV.PurchaserInformation.ContractingOfficeID }
             *     
             */
            public ListOfIDVs.IDV.PurchaserInformation.ContractingOfficeID getContractingOfficeID() {
                return contractingOfficeID;
            }

            /**
             * Sets the value of the contractingOfficeID property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfIDVs.IDV.PurchaserInformation.ContractingOfficeID }
             *     
             */
            public void setContractingOfficeID(ListOfIDVs.IDV.PurchaserInformation.ContractingOfficeID value) {
                this.contractingOfficeID = value;
            }

            /**
             * Gets the value of the foreignFunding property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfIDVs.IDV.PurchaserInformation.ForeignFunding }
             *     
             */
            public ListOfIDVs.IDV.PurchaserInformation.ForeignFunding getForeignFunding() {
                return foreignFunding;
            }

            /**
             * Sets the value of the foreignFunding property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfIDVs.IDV.PurchaserInformation.ForeignFunding }
             *     
             */
            public void setForeignFunding(ListOfIDVs.IDV.PurchaserInformation.ForeignFunding value) {
                this.foreignFunding = value;
            }

            /**
             * Gets the value of the fundingRequestingAgencyID property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfIDVs.IDV.PurchaserInformation.FundingRequestingAgencyID }
             *     
             */
            public ListOfIDVs.IDV.PurchaserInformation.FundingRequestingAgencyID getFundingRequestingAgencyID() {
                return fundingRequestingAgencyID;
            }

            /**
             * Sets the value of the fundingRequestingAgencyID property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfIDVs.IDV.PurchaserInformation.FundingRequestingAgencyID }
             *     
             */
            public void setFundingRequestingAgencyID(ListOfIDVs.IDV.PurchaserInformation.FundingRequestingAgencyID value) {
                this.fundingRequestingAgencyID = value;
            }

            /**
             * Gets the value of the fundingRequestingOfficeID property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfIDVs.IDV.PurchaserInformation.FundingRequestingOfficeID }
             *     
             */
            public ListOfIDVs.IDV.PurchaserInformation.FundingRequestingOfficeID getFundingRequestingOfficeID() {
                return fundingRequestingOfficeID;
            }

            /**
             * Sets the value of the fundingRequestingOfficeID property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfIDVs.IDV.PurchaserInformation.FundingRequestingOfficeID }
             *     
             */
            public void setFundingRequestingOfficeID(ListOfIDVs.IDV.PurchaserInformation.FundingRequestingOfficeID value) {
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
         *         &lt;element name="lastDateToOrder" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "lastDateToOrder"
        })
        public static class RelevantContractDates {

            @XmlElement(required = true)
            protected String signedDate;
            @XmlElement(required = true)
            protected String effectiveDate;
            @XmlElement(required = true)
            protected String lastDateToOrder;

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
             * Gets the value of the lastDateToOrder property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLastDateToOrder() {
                return lastDateToOrder;
            }

            /**
             * Sets the value of the lastDateToOrder property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLastDateToOrder(String value) {
                this.lastDateToOrder = value;
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
         *       &lt;sequence>
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
            "createdBy",
            "createdDate",
            "lastModifiedBy",
            "lastModifiedDate",
            "status"
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
            protected ListOfIDVs.IDV.TransactionInformation.Status status;

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
             *     {@link ListOfIDVs.IDV.TransactionInformation.Status }
             *     
             */
            public ListOfIDVs.IDV.TransactionInformation.Status getStatus() {
                return status;
            }

            /**
             * Sets the value of the status property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfIDVs.IDV.TransactionInformation.Status }
             *     
             */
            public void setStatus(ListOfIDVs.IDV.TransactionInformation.Status value) {
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
         *       &lt;all>
         *         &lt;element name="vendorHeader">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;all>
         *                   &lt;element name="vendorName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="vendorAlternateName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="vendorLegalOrganizationName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="vendorDoingAsBusinessName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/all>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="vendorSiteDetails">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;all>
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
         *                           &lt;sequence>
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
         *                             &lt;element name="numberOfEmployees" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
         *                             &lt;element name="annualRevenue" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="typeOfEducationalEntity">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
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
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="vendorCertifications">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="isDOTCertifiedDisadvantagedBusinessEnterprise" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                             &lt;element name="isSelfCertifiedSmallDisadvantagedBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                             &lt;element name="isSBACertifiedSmallDisadvantagedBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                             &lt;element name="isSBACertified8AProgramParticipant" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                             &lt;element name="isSBACertifiedHUBZone" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                             &lt;element name="isSBACertified8AJointVenture" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="vendorLocation">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
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
         *                                     &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/extension>
         *                                 &lt;/simpleContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="phoneNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="faxNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="congressionalDistrictCode" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
         *                           &lt;/sequence>
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
         *                 &lt;/all>
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
        public static class Vendor {

            @XmlElement(required = true)
            protected ListOfIDVs.IDV.Vendor.VendorHeader vendorHeader;
            @XmlElement(required = true)
            protected ListOfIDVs.IDV.Vendor.VendorSiteDetails vendorSiteDetails;
            @XmlElement(name = "CCRException", required = true)
            protected ListOfIDVs.IDV.Vendor.CCRException ccrException;
            @XmlElement(required = true)
            protected ListOfIDVs.IDV.Vendor.ContractingOfficerBusinessSizeDetermination contractingOfficerBusinessSizeDetermination;

            /**
             * Gets the value of the vendorHeader property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfIDVs.IDV.Vendor.VendorHeader }
             *     
             */
            public ListOfIDVs.IDV.Vendor.VendorHeader getVendorHeader() {
                return vendorHeader;
            }

            /**
             * Sets the value of the vendorHeader property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfIDVs.IDV.Vendor.VendorHeader }
             *     
             */
            public void setVendorHeader(ListOfIDVs.IDV.Vendor.VendorHeader value) {
                this.vendorHeader = value;
            }

            /**
             * Gets the value of the vendorSiteDetails property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfIDVs.IDV.Vendor.VendorSiteDetails }
             *     
             */
            public ListOfIDVs.IDV.Vendor.VendorSiteDetails getVendorSiteDetails() {
                return vendorSiteDetails;
            }

            /**
             * Sets the value of the vendorSiteDetails property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfIDVs.IDV.Vendor.VendorSiteDetails }
             *     
             */
            public void setVendorSiteDetails(ListOfIDVs.IDV.Vendor.VendorSiteDetails value) {
                this.vendorSiteDetails = value;
            }

            /**
             * Gets the value of the ccrException property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfIDVs.IDV.Vendor.CCRException }
             *     
             */
            public ListOfIDVs.IDV.Vendor.CCRException getCCRException() {
                return ccrException;
            }

            /**
             * Sets the value of the ccrException property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfIDVs.IDV.Vendor.CCRException }
             *     
             */
            public void setCCRException(ListOfIDVs.IDV.Vendor.CCRException value) {
                this.ccrException = value;
            }

            /**
             * Gets the value of the contractingOfficerBusinessSizeDetermination property.
             * 
             * @return
             *     possible object is
             *     {@link ListOfIDVs.IDV.Vendor.ContractingOfficerBusinessSizeDetermination }
             *     
             */
            public ListOfIDVs.IDV.Vendor.ContractingOfficerBusinessSizeDetermination getContractingOfficerBusinessSizeDetermination() {
                return contractingOfficerBusinessSizeDetermination;
            }

            /**
             * Sets the value of the contractingOfficerBusinessSizeDetermination property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfIDVs.IDV.Vendor.ContractingOfficerBusinessSizeDetermination }
             *     
             */
            public void setContractingOfficerBusinessSizeDetermination(ListOfIDVs.IDV.Vendor.ContractingOfficerBusinessSizeDetermination value) {
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
             *       &lt;all>
             *         &lt;element name="vendorName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="vendorAlternateName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="vendorLegalOrganizationName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="vendorDoingAsBusinessName" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
             *       &lt;all>
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
             *                 &lt;sequence>
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
             *                   &lt;element name="numberOfEmployees" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
             *                   &lt;element name="annualRevenue" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="typeOfEducationalEntity">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
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
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="vendorCertifications">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="isDOTCertifiedDisadvantagedBusinessEnterprise" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                   &lt;element name="isSelfCertifiedSmallDisadvantagedBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                   &lt;element name="isSBACertifiedSmallDisadvantagedBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                   &lt;element name="isSBACertified8AProgramParticipant" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                   &lt;element name="isSBACertifiedHUBZone" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                   &lt;element name="isSBACertified8AJointVenture" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="vendorLocation">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
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
             *                           &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/extension>
             *                       &lt;/simpleContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="phoneNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="faxNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="congressionalDistrictCode" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
             *                 &lt;/sequence>
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
            public static class VendorSiteDetails {

                @XmlElement(required = true)
                protected ListOfIDVs.IDV.Vendor.VendorSiteDetails.VendorSocioEconomicIndicators vendorSocioEconomicIndicators;
                @XmlElement(required = true)
                protected ListOfIDVs.IDV.Vendor.VendorSiteDetails.VendorBusinessTypes vendorBusinessTypes;
                @XmlElement(required = true)
                protected ListOfIDVs.IDV.Vendor.VendorSiteDetails.VendorLineOfBusiness vendorLineOfBusiness;
                @XmlElement(required = true)
                protected ListOfIDVs.IDV.Vendor.VendorSiteDetails.VendorRelationshipWithFederalGovernment vendorRelationshipWithFederalGovernment;
                @XmlElement(required = true)
                protected ListOfIDVs.IDV.Vendor.VendorSiteDetails.TypeOfGovernmentEntity typeOfGovernmentEntity;
                @XmlElement(required = true)
                protected ListOfIDVs.IDV.Vendor.VendorSiteDetails.VendorOrganizationFactors vendorOrganizationFactors;
                @XmlElement(required = true)
                protected ListOfIDVs.IDV.Vendor.VendorSiteDetails.TypeOfEducationalEntity typeOfEducationalEntity;
                @XmlElement(required = true)
                protected ListOfIDVs.IDV.Vendor.VendorSiteDetails.VendorCertifications vendorCertifications;
                @XmlElement(required = true)
                protected ListOfIDVs.IDV.Vendor.VendorSiteDetails.VendorLocation vendorLocation;
                @XmlElement(required = true)
                protected String vendorSiteCode;
                @XmlElement(required = true)
                protected String vendorAlternateSiteCode;
                @XmlElement(required = true)
                protected ListOfIDVs.IDV.Vendor.VendorSiteDetails.VendorDUNSInformation vendorDUNSInformation;
                @XmlElement(required = true)
                protected String divisionName;
                @XmlElement(required = true)
                protected ListOfIDVs.IDV.Vendor.VendorSiteDetails.CcrRegistrationDetails ccrRegistrationDetails;

                /**
                 * Gets the value of the vendorSocioEconomicIndicators property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ListOfIDVs.IDV.Vendor.VendorSiteDetails.VendorSocioEconomicIndicators }
                 *     
                 */
                public ListOfIDVs.IDV.Vendor.VendorSiteDetails.VendorSocioEconomicIndicators getVendorSocioEconomicIndicators() {
                    return vendorSocioEconomicIndicators;
                }

                /**
                 * Sets the value of the vendorSocioEconomicIndicators property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ListOfIDVs.IDV.Vendor.VendorSiteDetails.VendorSocioEconomicIndicators }
                 *     
                 */
                public void setVendorSocioEconomicIndicators(ListOfIDVs.IDV.Vendor.VendorSiteDetails.VendorSocioEconomicIndicators value) {
                    this.vendorSocioEconomicIndicators = value;
                }

                /**
                 * Gets the value of the vendorBusinessTypes property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ListOfIDVs.IDV.Vendor.VendorSiteDetails.VendorBusinessTypes }
                 *     
                 */
                public ListOfIDVs.IDV.Vendor.VendorSiteDetails.VendorBusinessTypes getVendorBusinessTypes() {
                    return vendorBusinessTypes;
                }

                /**
                 * Sets the value of the vendorBusinessTypes property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ListOfIDVs.IDV.Vendor.VendorSiteDetails.VendorBusinessTypes }
                 *     
                 */
                public void setVendorBusinessTypes(ListOfIDVs.IDV.Vendor.VendorSiteDetails.VendorBusinessTypes value) {
                    this.vendorBusinessTypes = value;
                }

                /**
                 * Gets the value of the vendorLineOfBusiness property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ListOfIDVs.IDV.Vendor.VendorSiteDetails.VendorLineOfBusiness }
                 *     
                 */
                public ListOfIDVs.IDV.Vendor.VendorSiteDetails.VendorLineOfBusiness getVendorLineOfBusiness() {
                    return vendorLineOfBusiness;
                }

                /**
                 * Sets the value of the vendorLineOfBusiness property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ListOfIDVs.IDV.Vendor.VendorSiteDetails.VendorLineOfBusiness }
                 *     
                 */
                public void setVendorLineOfBusiness(ListOfIDVs.IDV.Vendor.VendorSiteDetails.VendorLineOfBusiness value) {
                    this.vendorLineOfBusiness = value;
                }

                /**
                 * Gets the value of the vendorRelationshipWithFederalGovernment property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ListOfIDVs.IDV.Vendor.VendorSiteDetails.VendorRelationshipWithFederalGovernment }
                 *     
                 */
                public ListOfIDVs.IDV.Vendor.VendorSiteDetails.VendorRelationshipWithFederalGovernment getVendorRelationshipWithFederalGovernment() {
                    return vendorRelationshipWithFederalGovernment;
                }

                /**
                 * Sets the value of the vendorRelationshipWithFederalGovernment property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ListOfIDVs.IDV.Vendor.VendorSiteDetails.VendorRelationshipWithFederalGovernment }
                 *     
                 */
                public void setVendorRelationshipWithFederalGovernment(ListOfIDVs.IDV.Vendor.VendorSiteDetails.VendorRelationshipWithFederalGovernment value) {
                    this.vendorRelationshipWithFederalGovernment = value;
                }

                /**
                 * Gets the value of the typeOfGovernmentEntity property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ListOfIDVs.IDV.Vendor.VendorSiteDetails.TypeOfGovernmentEntity }
                 *     
                 */
                public ListOfIDVs.IDV.Vendor.VendorSiteDetails.TypeOfGovernmentEntity getTypeOfGovernmentEntity() {
                    return typeOfGovernmentEntity;
                }

                /**
                 * Sets the value of the typeOfGovernmentEntity property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ListOfIDVs.IDV.Vendor.VendorSiteDetails.TypeOfGovernmentEntity }
                 *     
                 */
                public void setTypeOfGovernmentEntity(ListOfIDVs.IDV.Vendor.VendorSiteDetails.TypeOfGovernmentEntity value) {
                    this.typeOfGovernmentEntity = value;
                }

                /**
                 * Gets the value of the vendorOrganizationFactors property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ListOfIDVs.IDV.Vendor.VendorSiteDetails.VendorOrganizationFactors }
                 *     
                 */
                public ListOfIDVs.IDV.Vendor.VendorSiteDetails.VendorOrganizationFactors getVendorOrganizationFactors() {
                    return vendorOrganizationFactors;
                }

                /**
                 * Sets the value of the vendorOrganizationFactors property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ListOfIDVs.IDV.Vendor.VendorSiteDetails.VendorOrganizationFactors }
                 *     
                 */
                public void setVendorOrganizationFactors(ListOfIDVs.IDV.Vendor.VendorSiteDetails.VendorOrganizationFactors value) {
                    this.vendorOrganizationFactors = value;
                }

                /**
                 * Gets the value of the typeOfEducationalEntity property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ListOfIDVs.IDV.Vendor.VendorSiteDetails.TypeOfEducationalEntity }
                 *     
                 */
                public ListOfIDVs.IDV.Vendor.VendorSiteDetails.TypeOfEducationalEntity getTypeOfEducationalEntity() {
                    return typeOfEducationalEntity;
                }

                /**
                 * Sets the value of the typeOfEducationalEntity property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ListOfIDVs.IDV.Vendor.VendorSiteDetails.TypeOfEducationalEntity }
                 *     
                 */
                public void setTypeOfEducationalEntity(ListOfIDVs.IDV.Vendor.VendorSiteDetails.TypeOfEducationalEntity value) {
                    this.typeOfEducationalEntity = value;
                }

                /**
                 * Gets the value of the vendorCertifications property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ListOfIDVs.IDV.Vendor.VendorSiteDetails.VendorCertifications }
                 *     
                 */
                public ListOfIDVs.IDV.Vendor.VendorSiteDetails.VendorCertifications getVendorCertifications() {
                    return vendorCertifications;
                }

                /**
                 * Sets the value of the vendorCertifications property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ListOfIDVs.IDV.Vendor.VendorSiteDetails.VendorCertifications }
                 *     
                 */
                public void setVendorCertifications(ListOfIDVs.IDV.Vendor.VendorSiteDetails.VendorCertifications value) {
                    this.vendorCertifications = value;
                }

                /**
                 * Gets the value of the vendorLocation property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ListOfIDVs.IDV.Vendor.VendorSiteDetails.VendorLocation }
                 *     
                 */
                public ListOfIDVs.IDV.Vendor.VendorSiteDetails.VendorLocation getVendorLocation() {
                    return vendorLocation;
                }

                /**
                 * Sets the value of the vendorLocation property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ListOfIDVs.IDV.Vendor.VendorSiteDetails.VendorLocation }
                 *     
                 */
                public void setVendorLocation(ListOfIDVs.IDV.Vendor.VendorSiteDetails.VendorLocation value) {
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
                 *     {@link ListOfIDVs.IDV.Vendor.VendorSiteDetails.VendorDUNSInformation }
                 *     
                 */
                public ListOfIDVs.IDV.Vendor.VendorSiteDetails.VendorDUNSInformation getVendorDUNSInformation() {
                    return vendorDUNSInformation;
                }

                /**
                 * Sets the value of the vendorDUNSInformation property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ListOfIDVs.IDV.Vendor.VendorSiteDetails.VendorDUNSInformation }
                 *     
                 */
                public void setVendorDUNSInformation(ListOfIDVs.IDV.Vendor.VendorSiteDetails.VendorDUNSInformation value) {
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
                 * Gets the value of the ccrRegistrationDetails property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ListOfIDVs.IDV.Vendor.VendorSiteDetails.CcrRegistrationDetails }
                 *     
                 */
                public ListOfIDVs.IDV.Vendor.VendorSiteDetails.CcrRegistrationDetails getCcrRegistrationDetails() {
                    return ccrRegistrationDetails;
                }

                /**
                 * Sets the value of the ccrRegistrationDetails property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ListOfIDVs.IDV.Vendor.VendorSiteDetails.CcrRegistrationDetails }
                 *     
                 */
                public void setCcrRegistrationDetails(ListOfIDVs.IDV.Vendor.VendorSiteDetails.CcrRegistrationDetails value) {
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
                 *       &lt;sequence>
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
                    "is1862LandGrantCollege",
                    "is1890LandGrantCollege",
                    "is1994LandGrantCollege",
                    "isHistoricallyBlackCollegeOrUniversity",
                    "isMinorityInstitution",
                    "isPrivateUniversityOrCollege",
                    "isSchoolOfForestry",
                    "isStateControlledInstitutionofHigherLearning",
                    "isTribalCollege",
                    "isVeterinaryCollege",
                    "isAlaskanNativeServicingInstitution",
                    "isNativeHawaiianServicingInstitution"
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
                    protected ListOfIDVs.IDV.Vendor.VendorSiteDetails.VendorBusinessTypes.FederalGovernment federalGovernment;
                    protected boolean isStateGovernment;
                    @XmlElement(required = true)
                    protected ListOfIDVs.IDV.Vendor.VendorSiteDetails.VendorBusinessTypes.LocalGovernment localGovernment;
                    protected boolean isTribalGovernment;
                    protected boolean isForeignGovernment;
                    @XmlElement(required = true)
                    protected ListOfIDVs.IDV.Vendor.VendorSiteDetails.VendorBusinessTypes.BusinessOrOrganizationType businessOrOrganizationType;

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
                     *     {@link ListOfIDVs.IDV.Vendor.VendorSiteDetails.VendorBusinessTypes.FederalGovernment }
                     *     
                     */
                    public ListOfIDVs.IDV.Vendor.VendorSiteDetails.VendorBusinessTypes.FederalGovernment getFederalGovernment() {
                        return federalGovernment;
                    }

                    /**
                     * Sets the value of the federalGovernment property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ListOfIDVs.IDV.Vendor.VendorSiteDetails.VendorBusinessTypes.FederalGovernment }
                     *     
                     */
                    public void setFederalGovernment(ListOfIDVs.IDV.Vendor.VendorSiteDetails.VendorBusinessTypes.FederalGovernment value) {
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
                     *     {@link ListOfIDVs.IDV.Vendor.VendorSiteDetails.VendorBusinessTypes.LocalGovernment }
                     *     
                     */
                    public ListOfIDVs.IDV.Vendor.VendorSiteDetails.VendorBusinessTypes.LocalGovernment getLocalGovernment() {
                        return localGovernment;
                    }

                    /**
                     * Sets the value of the localGovernment property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ListOfIDVs.IDV.Vendor.VendorSiteDetails.VendorBusinessTypes.LocalGovernment }
                     *     
                     */
                    public void setLocalGovernment(ListOfIDVs.IDV.Vendor.VendorSiteDetails.VendorBusinessTypes.LocalGovernment value) {
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
                     *     {@link ListOfIDVs.IDV.Vendor.VendorSiteDetails.VendorBusinessTypes.BusinessOrOrganizationType }
                     *     
                     */
                    public ListOfIDVs.IDV.Vendor.VendorSiteDetails.VendorBusinessTypes.BusinessOrOrganizationType getBusinessOrOrganizationType() {
                        return businessOrOrganizationType;
                    }

                    /**
                     * Sets the value of the businessOrOrganizationType property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ListOfIDVs.IDV.Vendor.VendorSiteDetails.VendorBusinessTypes.BusinessOrOrganizationType }
                     *     
                     */
                    public void setBusinessOrOrganizationType(ListOfIDVs.IDV.Vendor.VendorSiteDetails.VendorBusinessTypes.BusinessOrOrganizationType value) {
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
                 *       &lt;sequence>
                 *         &lt;element name="isDOTCertifiedDisadvantagedBusinessEnterprise" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *         &lt;element name="isSelfCertifiedSmallDisadvantagedBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *         &lt;element name="isSBACertifiedSmallDisadvantagedBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *         &lt;element name="isSBACertified8AProgramParticipant" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *         &lt;element name="isSBACertifiedHUBZone" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *         &lt;element name="isSBACertified8AJointVenture" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
                    "isDOTCertifiedDisadvantagedBusinessEnterprise",
                    "isSelfCertifiedSmallDisadvantagedBusiness",
                    "isSBACertifiedSmallDisadvantagedBusiness",
                    "isSBACertified8AProgramParticipant",
                    "isSBACertifiedHUBZone",
                    "isSBACertified8AJointVenture"
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
                 *       &lt;sequence>
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
                 *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/extension>
                 *             &lt;/simpleContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="phoneNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="faxNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="congressionalDistrictCode" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
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
                    "streetAddress",
                    "streetAddress2",
                    "streetAddress3",
                    "city",
                    "state",
                    "zipCode",
                    "countryCode",
                    "phoneNo",
                    "faxNo",
                    "congressionalDistrictCode"
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
                    protected ListOfIDVs.IDV.Vendor.VendorSiteDetails.VendorLocation.State state;
                    @XmlElement(name = "ZIPCode", required = true)
                    protected String zipCode;
                    @XmlElement(required = true)
                    protected ListOfIDVs.IDV.Vendor.VendorSiteDetails.VendorLocation.CountryCode countryCode;
                    @XmlElement(required = true)
                    protected String phoneNo;
                    @XmlElement(required = true)
                    protected String faxNo;
                    @XmlSchemaType(name = "unsignedByte")
                    protected short congressionalDistrictCode;

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
                     *     {@link ListOfIDVs.IDV.Vendor.VendorSiteDetails.VendorLocation.State }
                     *     
                     */
                    public ListOfIDVs.IDV.Vendor.VendorSiteDetails.VendorLocation.State getState() {
                        return state;
                    }

                    /**
                     * Sets the value of the state property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ListOfIDVs.IDV.Vendor.VendorSiteDetails.VendorLocation.State }
                     *     
                     */
                    public void setState(ListOfIDVs.IDV.Vendor.VendorSiteDetails.VendorLocation.State value) {
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
                     *     {@link ListOfIDVs.IDV.Vendor.VendorSiteDetails.VendorLocation.CountryCode }
                     *     
                     */
                    public ListOfIDVs.IDV.Vendor.VendorSiteDetails.VendorLocation.CountryCode getCountryCode() {
                        return countryCode;
                    }

                    /**
                     * Sets the value of the countryCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ListOfIDVs.IDV.Vendor.VendorSiteDetails.VendorLocation.CountryCode }
                     *     
                     */
                    public void setCountryCode(ListOfIDVs.IDV.Vendor.VendorSiteDetails.VendorLocation.CountryCode value) {
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
                     */
                    public short getCongressionalDistrictCode() {
                        return congressionalDistrictCode;
                    }

                    /**
                     * Sets the value of the congressionalDistrictCode property.
                     * 
                     */
                    public void setCongressionalDistrictCode(short value) {
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
                 *       &lt;sequence>
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
                 *         &lt;element name="numberOfEmployees" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
                 *         &lt;element name="annualRevenue" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                    "isSubchapterSCorporation",
                    "isLimitedLiabilityCorporation",
                    "isForeignOwnedAndLocated",
                    "profitStructure",
                    "isShelteredWorkshop",
                    "stateOfIncorporation",
                    "countryOfIncorporation",
                    "organizationalType",
                    "numberOfEmployees",
                    "annualRevenue"
                })
                public static class VendorOrganizationFactors {

                    protected boolean isSubchapterSCorporation;
                    protected boolean isLimitedLiabilityCorporation;
                    protected boolean isForeignOwnedAndLocated;
                    @XmlElement(required = true)
                    protected ListOfIDVs.IDV.Vendor.VendorSiteDetails.VendorOrganizationFactors.ProfitStructure profitStructure;
                    protected boolean isShelteredWorkshop;
                    @XmlElement(required = true)
                    protected String stateOfIncorporation;
                    @XmlElement(required = true)
                    protected String countryOfIncorporation;
                    @XmlElement(required = true)
                    protected String organizationalType;
                    @XmlSchemaType(name = "unsignedInt")
                    protected long numberOfEmployees;
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
                     *     {@link ListOfIDVs.IDV.Vendor.VendorSiteDetails.VendorOrganizationFactors.ProfitStructure }
                     *     
                     */
                    public ListOfIDVs.IDV.Vendor.VendorSiteDetails.VendorOrganizationFactors.ProfitStructure getProfitStructure() {
                        return profitStructure;
                    }

                    /**
                     * Sets the value of the profitStructure property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ListOfIDVs.IDV.Vendor.VendorSiteDetails.VendorOrganizationFactors.ProfitStructure }
                     *     
                     */
                    public void setProfitStructure(ListOfIDVs.IDV.Vendor.VendorSiteDetails.VendorOrganizationFactors.ProfitStructure value) {
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
                     */
                    public long getNumberOfEmployees() {
                        return numberOfEmployees;
                    }

                    /**
                     * Sets the value of the numberOfEmployees property.
                     * 
                     */
                    public void setNumberOfEmployees(long value) {
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
                    protected ListOfIDVs.IDV.Vendor.VendorSiteDetails.VendorSocioEconomicIndicators.MinorityOwned minorityOwned;
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
                     *     {@link ListOfIDVs.IDV.Vendor.VendorSiteDetails.VendorSocioEconomicIndicators.MinorityOwned }
                     *     
                     */
                    public ListOfIDVs.IDV.Vendor.VendorSiteDetails.VendorSocioEconomicIndicators.MinorityOwned getMinorityOwned() {
                        return minorityOwned;
                    }

                    /**
                     * Sets the value of the minorityOwned property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ListOfIDVs.IDV.Vendor.VendorSiteDetails.VendorSocioEconomicIndicators.MinorityOwned }
                     *     
                     */
                    public void setMinorityOwned(ListOfIDVs.IDV.Vendor.VendorSiteDetails.VendorSocioEconomicIndicators.MinorityOwned value) {
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

}
