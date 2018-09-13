package gov.gsa.fas.AutoChoice.DTO;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table (name="contract")
public class ContractDTO {
	@Id
	@Length(max=5)
	@NotNull
	@NotEmpty(message="Contract cannot be empty")
	@Column(name="contract")
	protected String contract = "";
	
	@Length(max=5)
	@NotNull
	@Column(name="Sol_No_1")
	protected String solNo1 = "";
	
	@Length(max=6)
	@NotNull
	@Column(name="Sol_No_2")
	protected String solNo2 = "";
	
	@Length(max=2)
	@NotNull
	@Column(name="Sol_No_3")
	protected String solNo3 = "";
	
	@Length(max=9)
	@NotNull
	@Column(name="Contr_DUNS")
	protected String contrDUNS = "";
	
	@Length(max=1)
	@NotNull
	@Column(name="Acquisition_Type")
	protected String acqType = "";
	
	@Length(max=9)
	@NotNull
	@Column(name="Pri_Prod_Point")
	protected String priProdPoint = "";
	
	@Length(max=1)
	@NotNull
	@Column(name="Contract_Status")
	protected String contractStatus = "";

	@NotNull
	@Column(name="Def_Shipment_Time")
	protected int defShipTime = 0;
	
	@Length(max=8)
	@NotNull
	@Column(name="Discount_Amount")
	protected String discountAmt = "";
	
	@Length(max=3)
	@NotNull
	@Column(name="Discount_Days")
	protected String discountDays = "";
	
	@NotNull
	@Column(name="Increase_Option")
	protected double incOption = 0.00;
	
	@Length(max=2)
	@NotNull
	@Column(name="Buyer_Code")
	protected String buyerCode = "";
	
	@Length(max=5)
	@NotNull
	@Column(name="Contract_Sc")
	protected String contractSc = "";
	
	@NotNull
	@Column(name="Contract_Units")
	protected double contractUnits = 0.00;
	
	@NotNull
	@Column(name="Contract_Amount")
	protected double contractAmt = 0.00;
	
	@NotNull
	@Column(name="Computed_Units")
	protected int computedUnits = 0;
	
	@NotNull
	@Column(name="Computed_Amount")
	protected double computedAmt = 0.00;
	
	@NotNull
	@Column(name="Award_Date")
	protected Timestamp awardDate;
	
	@Column(name="Effective_Date")
	protected Timestamp effectiveDate;
	
	@Column(name="Expire_Date")
	protected Timestamp expireDate;
	
	@Column(name="Date_Initiated")
	protected Timestamp initiatedDate;
	
	@NotNull
	@Column(name="Date_Last_Updated")
	protected Timestamp lastUpdatedDate;
	
	@Column(name="Date_Canceled")
	protected Timestamp canceledDate;
	
	@Length(max=20)
	@NotNull
	@Column(name="User_Updated")
	protected String userUpdated = "";
	
	@Column(name="Order_Date")
	protected Timestamp orderDate;
	
	@Length(max=1)
	@Column(name="Family_Type")
	protected String familyType = "";
	
	@Length(max=1)
	@Column(name="Insp_Point")
	protected String insPoint = "";
	
	@Length(max=1)
	@Column(name="Ins_Region")
	protected String insRegion = "";
	
	@Length(max=1)
	@Column(name="FOB")
	protected String fob = "";
	
	@Length(max=1)
	@Column(name="Ship_Del")
	protected String shipDel = "";
	
	@Length(max=1)
	@Column(name="Plant_F_Rep")
	protected String plantFRep = "";
	
	@Length(max=1)
	@Column(name="Number_Offers")
	protected String numberOffers = "";
	
	@Length(max=1)
	@Column(name="Sypnopsis")
	protected String synopsis = "";
	
	@Column(name="From_Buyer_to_Offer")
	protected int fromBuyerToOffer = 0;
	
	@Length(max=10)
	@Column(name="Cont_Off_Warrant_No")
	protected String contOffWarrantNo = "";
	
	@Length(max=1)
	@Column(name="Contr_Adm")
	protected String contrAdm = "";
	
	@Length(max=1)
	@Column(name="Subcontract_Plan")
	protected String subconPlan = "";
	
	@Length(max=1)
	@Column(name="xFer_FSS19")
	protected String xferFSS19 = "";
	
	@Length(max=1)
	@Column(name="Proc_Method")
	protected String procMethod = "";
	
	@Length(max=1)
	@Column(name="Type_Contract_Mod")
	protected String typeContractMod = "";
	
	@Column(name="Lines")
	protected int lines = 0;
	
	@Length(max=1)
	@Column(name="Buying_Program")
	protected String buyingProgram = "";
	
	@Length(max=1)
	@Column(name="Statutory")
	protected String statutory = "";
	
	@Length(max=1)
	@Column(name="Most_Favored")
	protected String mostFavored = "";
	
	@Length(max=1)
	@Column(name="Compety")
	protected String compety = "";
	
	@Length(max=1)
	@Column(name="Auth_Oth_F_Comp")
	protected String authOthFComp = "";
	
	@Length(max=1)
	@Column(name="Solic_Method")
	protected String solicMethod = "";
	
	@Length(max=1)
	@Column(name="On_Time")
	protected String onTime = "";
	
	@Length(max=2)
	@Column(name="FSC")
	protected String fsc = "";
	
	@Length(max=1)
	@Column(name="Bus_Size")
	protected String busSize = "";
	
	@Column(name="Orig_Amount")
	protected double origAmt = 0;
	
	@Length(max=4)
	@Column(name="SubCont_Exp_Date")
	protected String subContExpDate = "";
	
	@Length(max=13)
	@Column(name="Fax_Number")
	protected String faxNumber = "";
	
	@Length(max=2)
	@Column(name="MOP")
	protected String mop = "";
	
	@Length(max=7)
	@Column(name="Sch_No_1")
	protected String schNumber1 = "";
	
	@Length(max=7)
	@Column(name="Sch_No_2")
	protected String schNumber2 = "";
	
	@Length(max=7)
	@Column(name="Sch_No_3")
	protected String schNumber3 = "";
	
	@Column(name="Min_Order")
	protected double minOrder = 0;
	
	@Column(name="Max_Orders_Per_Line")
	protected double maxOrderPerLine = 0;
	
	@Column(name="Max_Orders")
	protected double maxOrders = 0;
	
	@Length(max=2)
	@Column(name="Perc_Improvment")
	protected String percImprove = "";
	
	@Length(max=2)
	@Column(name="Disc_Int_1")
	protected String discInt1 = "";
	
	@Length(max=3)
	@Column(name="Disc_Dec_1")
	protected String discDec1 = "";
	
	@Length(max=2)
	@Column(name="Disc_Days_1")
	protected String discDays1 = "";
	
	@Length(max=2)
	@Column(name="Disc_Int_2")
	protected String discInt2 = "";
	
	@Length(max=3)
	@Column(name="Disc_Dec_2")
	protected String discDec2 = "";
	
	@Length(max=2)
	@Column(name="Disc_Days_2")
	protected String discDays2 = "";
	
	@Length(max=30)
	@Column(name="Common_Parent")
	protected String commonParent = "";
	
	@Length(max=9)
	@Column(name="Parent_Tin")
	protected String parentTin = "";
	
	@Length(max=9)
	@Column(name="DUNS")
	protected String duns = "";
	
	@Length(max=9)
	@Column(name="DUNS_PPP")
	protected String dunsPPP = "";
	
	@Length(max=1)
	@Column(name="Updt_Status")
	protected String updateStatus = "";
	
	@Length(max=4)
	@Column(name="FSC_2")
	protected String fsc2 = "";
	
	@Column(name="Ship_Days")
	protected int shipDays = 0;
	
	@Length(max=1)
	@Column(name="For_Public_Flt")
	protected String forPublicFlt = "";
	
	@Column(name="Date_Ope_For_Public")
	protected Timestamp openPublicDate;
	
	@Column(name="Date_Close_To_Public")
	protected Timestamp closedPublicDate;
	
	@Length(max=12)
	@Column(name="User_Modified_Public")
	protected String userModPublic = "";
	
	@Length(max=1)
	@Column(name="For_Public_Internet")
	protected String forPublicInter = "";
	
	@Length(max=1)
	@Column(name="Contr_Ind")
	protected String contrInd = "";
	
	@Length(max=1)
	@Column(name="Koca")
	protected String koca = "";
	
	@Length(max=4)
	@Column(name="SIC")
	protected String sic = "";
	
	@Length(max=6)
	@Column(name="NAICS")
	protected String naics = "";
	
	@Length(max=100)
	@Column(name="Shipment_Comment")
	protected String shipComment = "";
	
	@Length(max=1)
	@Column(name="Renewal_Status")
	protected String renewalStatus = "";
	
	@Column(name="NewMYDR")
	protected Timestamp newMYDR;
	
	@Length(max=5)
	@Column(name="Contract_Base")
	protected String contractBase = "";

	public String getContract() {
		return contract;
	}

	public void setContract(String contract) {
		this.contract = contract;
	}

	public String getSolNo1() {
		return solNo1;
	}

	public void setSolNo1(String solNo1) {
		this.solNo1 = solNo1;
	}

	public String getSolNo2() {
		return solNo2;
	}

	public void setSolNo2(String solNo2) {
		this.solNo2 = solNo2;
	}

	public String getSolNo3() {
		return solNo3;
	}

	public void setSolNo3(String solNo3) {
		this.solNo3 = solNo3;
	}

	public String getContrDUNS() {
		return contrDUNS;
	}

	public void setContrDUNS(String contrDUNS) {
		this.contrDUNS = contrDUNS;
	}

	public String getAcqType() {
		return acqType;
	}

	public void setAcqType(String acqType) {
		this.acqType = acqType;
	}

	public String getPriProdPoint() {
		return priProdPoint;
	}

	public void setPriProdPoint(String priProdPoint) {
		this.priProdPoint = priProdPoint;
	}

	public String getContractStatus() {
		return contractStatus;
	}

	public void setContractStatus(String contractStatus) {
		this.contractStatus = contractStatus;
	}

	public int getDefShipTime() {
		return defShipTime;
	}

	public void setDefShipTime(int defShipTime) {
		this.defShipTime = defShipTime;
	}

	public String getDiscountAmt() {
		return discountAmt;
	}

	public void setDiscountAmt(String discountAmt) {
		this.discountAmt = discountAmt;
	}

	public String getDiscountDays() {
		return discountDays;
	}

	public void setDiscountDays(String discountDays) {
		this.discountDays = discountDays;
	}

	public double getIncOption() {
		return incOption;
	}

	public void setIncOption(double incOption) {
		this.incOption = incOption;
	}

	public String getBuyerCode() {
		return buyerCode;
	}

	public void setBuyerCode(String buyerCode) {
		this.buyerCode = buyerCode;
	}

	public String getContractSc() {
		return contractSc;
	}

	public void setContractSc(String contractSc) {
		this.contractSc = contractSc;
	}

	public double getContractUnits() {
		return contractUnits;
	}

	public void setContractUnits(double contractUnits) {
		this.contractUnits = contractUnits;
	}

	public double getContractAmt() {
		return contractAmt;
	}

	public void setContractAmt(double contractAmt) {
		this.contractAmt = contractAmt;
	}

	public int getComputedUnits() {
		return computedUnits;
	}

	public void setComputedUnits(int computedUnits) {
		this.computedUnits = computedUnits;
	}

	public double getComputedAmt() {
		return computedAmt;
	}

	public void setComputedAmt(double computedAmt) {
		this.computedAmt = computedAmt;
	}

	public Timestamp getAwardDate() {
		return awardDate;
	}

	public void setAwardDate(Timestamp awardDate) {
		this.awardDate = awardDate;
	}

	public Timestamp getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(Timestamp effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public Timestamp getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(Timestamp expireDate) {
		this.expireDate = expireDate;
	}

	public Timestamp getInitiatedDate() {
		return initiatedDate;
	}

	public void setInitiatedDate(Timestamp initiatedDate) {
		this.initiatedDate = initiatedDate;
	}

	public Timestamp getLastUpdatedDate() {
		return lastUpdatedDate;
	}

	public void setLastUpdatedDate(Timestamp lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

	public Timestamp getCanceledDate() {
		return canceledDate;
	}

	public void setCanceledDate(Timestamp canceledDate) {
		this.canceledDate = canceledDate;
	}

	public String getUserUpdated() {
		return userUpdated;
	}

	public void setUserUpdated(String userUpdated) {
		this.userUpdated = userUpdated;
	}

	public Timestamp getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Timestamp orderDate) {
		this.orderDate = orderDate;
	}

	public String getFamilyType() {
		return familyType;
	}

	public void setFamilyType(String familyType) {
		this.familyType = familyType;
	}

	public String getInsPoint() {
		return insPoint;
	}

	public void setInsPoint(String insPoint) {
		this.insPoint = insPoint;
	}

	public String getInsRegion() {
		return insRegion;
	}

	public void setInsRegion(String insRegion) {
		this.insRegion = insRegion;
	}

	public String getFob() {
		return fob;
	}

	public void setFob(String fob) {
		this.fob = fob;
	}

	public String getShipDel() {
		return shipDel;
	}

	public void setShipDel(String shipDel) {
		this.shipDel = shipDel;
	}

	public String getPlantFRep() {
		return plantFRep;
	}

	public void setPlantFRep(String plantFRep) {
		this.plantFRep = plantFRep;
	}

	public String getNumberOffers() {
		return numberOffers;
	}

	public void setNumberOffers(String numberOffers) {
		this.numberOffers = numberOffers;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	public int getFromBuyerToOffer() {
		return fromBuyerToOffer;
	}

	public void setFromBuyerToOffer(int fromBuyerToOffer) {
		this.fromBuyerToOffer = fromBuyerToOffer;
	}

	public String getContOffWarrantNo() {
		return contOffWarrantNo;
	}

	public void setContOffWarrantNo(String contOffWarrantNo) {
		this.contOffWarrantNo = contOffWarrantNo;
	}

	public String getContrAdm() {
		return contrAdm;
	}

	public void setContrAdm(String contrAdm) {
		this.contrAdm = contrAdm;
	}

	public String getSubconPlan() {
		return subconPlan;
	}

	public void setSubconPlan(String subconPlan) {
		this.subconPlan = subconPlan;
	}

	public String getXferFSS19() {
		return xferFSS19;
	}

	public void setXferFSS19(String xferFSS19) {
		this.xferFSS19 = xferFSS19;
	}

	public String getProcMethod() {
		return procMethod;
	}

	public void setProcMethod(String procMethod) {
		this.procMethod = procMethod;
	}

	public String getTypeContractMod() {
		return typeContractMod;
	}

	public void setTypeContractMod(String typeContractMod) {
		this.typeContractMod = typeContractMod;
	}

	public int getLines() {
		return lines;
	}

	public void setLines(int lines) {
		this.lines = lines;
	}

	public String getBuyingProgram() {
		return buyingProgram;
	}

	public void setBuyingProgram(String buyingProgram) {
		this.buyingProgram = buyingProgram;
	}

	public String getStatutory() {
		return statutory;
	}

	public void setStatutory(String statutory) {
		this.statutory = statutory;
	}

	public String getMostFavored() {
		return mostFavored;
	}

	public void setMostFavored(String mostFavored) {
		this.mostFavored = mostFavored;
	}

	public String getCompety() {
		return compety;
	}

	public void setCompety(String compety) {
		this.compety = compety;
	}

	public String getAuthOthFComp() {
		return authOthFComp;
	}

	public void setAuthOthFComp(String authOthFComp) {
		this.authOthFComp = authOthFComp;
	}

	public String getSolicMethod() {
		return solicMethod;
	}

	public void setSolicMethod(String solicMethod) {
		this.solicMethod = solicMethod;
	}

	public String getOnTime() {
		return onTime;
	}

	public void setOnTime(String onTime) {
		this.onTime = onTime;
	}

	public String getFsc() {
		return fsc;
	}

	public void setFsc(String fsc) {
		this.fsc = fsc;
	}

	public String getBusSize() {
		return busSize;
	}

	public void setBusSize(String busSize) {
		this.busSize = busSize;
	}

	public double getOrigAmt() {
		return origAmt;
	}

	public void setOrigAmt(double origAmt) {
		this.origAmt = origAmt;
	}

	public String getSubContExpDate() {
		return subContExpDate;
	}

	public void setSubContExpDate(String subContExpDate) {
		this.subContExpDate = subContExpDate;
	}

	public String getFaxNumber() {
		return faxNumber;
	}

	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}

	public String getMop() {
		return mop;
	}

	public void setMop(String mop) {
		this.mop = mop;
	}

	public String getSchNumber1() {
		return schNumber1;
	}

	public void setSchNumber1(String schNumber1) {
		this.schNumber1 = schNumber1;
	}

	public String getSchNumber2() {
		return schNumber2;
	}

	public void setSchNumber2(String schNumber2) {
		this.schNumber2 = schNumber2;
	}

	public String getSchNumber3() {
		return schNumber3;
	}

	public void setSchNumber3(String schNumber3) {
		this.schNumber3 = schNumber3;
	}

	public double getMinOrder() {
		return minOrder;
	}

	public void setMinOrder(double minOrder) {
		this.minOrder = minOrder;
	}

	public double getMaxOrderPerLine() {
		return maxOrderPerLine;
	}

	public void setMaxOrderPerLine(double maxOrderPerLine) {
		this.maxOrderPerLine = maxOrderPerLine;
	}

	public double getMaxOrders() {
		return maxOrders;
	}

	public void setMaxOrders(double maxOrders) {
		this.maxOrders = maxOrders;
	}

	public String getPercImprove() {
		return percImprove;
	}

	public void setPercImprove(String percImprove) {
		this.percImprove = percImprove;
	}

	public String getDiscInt1() {
		return discInt1;
	}

	public void setDiscInt1(String discInt1) {
		this.discInt1 = discInt1;
	}

	public String getDiscDec1() {
		return discDec1;
	}

	public void setDiscDec1(String discDec1) {
		this.discDec1 = discDec1;
	}

	public String getDiscDays1() {
		return discDays1;
	}

	public void setDiscDays1(String discDays1) {
		this.discDays1 = discDays1;
	}

	public String getDiscInt2() {
		return discInt2;
	}

	public void setDiscInt2(String discInt2) {
		this.discInt2 = discInt2;
	}

	public String getDiscDec2() {
		return discDec2;
	}

	public void setDiscDec2(String discDec2) {
		this.discDec2 = discDec2;
	}

	public String getDiscDays2() {
		return discDays2;
	}

	public void setDiscDays2(String discDays2) {
		this.discDays2 = discDays2;
	}

	public String getCommonParent() {
		return commonParent;
	}

	public void setCommonParent(String commonParent) {
		this.commonParent = commonParent;
	}

	public String getParentTin() {
		return parentTin;
	}

	public void setParentTin(String parentTin) {
		this.parentTin = parentTin;
	}

	public String getDuns() {
		return duns;
	}

	public void setDuns(String duns) {
		this.duns = duns;
	}

	public String getDunsPPP() {
		return dunsPPP;
	}

	public void setDunsPPP(String dunsPPP) {
		this.dunsPPP = dunsPPP;
	}

	public String getUpdateStatus() {
		return updateStatus;
	}

	public void setUpdateStatus(String updateStatus) {
		this.updateStatus = updateStatus;
	}

	public String getFsc2() {
		return fsc2;
	}

	public void setFsc2(String fsc2) {
		this.fsc2 = fsc2;
	}

	public int getShipDays() {
		return shipDays;
	}

	public void setShipDays(int shipDays) {
		this.shipDays = shipDays;
	}

	public String getForPublicFlt() {
		return forPublicFlt;
	}

	public void setForPublicFlt(String forPublicFlt) {
		this.forPublicFlt = forPublicFlt;
	}

	public Timestamp getOpenPublicDate() {
		return openPublicDate;
	}

	public void setOpenPublicDate(Timestamp openPublicDate) {
		this.openPublicDate = openPublicDate;
	}

	public Timestamp getClosedPublicDate() {
		return closedPublicDate;
	}

	public void setClosedPublicDate(Timestamp closedPublicDate) {
		this.closedPublicDate = closedPublicDate;
	}

	public String getUserModPublic() {
		return userModPublic;
	}

	public void setUserModPublic(String userModPublic) {
		this.userModPublic = userModPublic;
	}

	public String getForPublicInter() {
		return forPublicInter;
	}

	public void setForPublicInter(String forPublicInter) {
		this.forPublicInter = forPublicInter;
	}

	public String getContrInd() {
		return contrInd;
	}

	public void setContrInd(String contrInd) {
		this.contrInd = contrInd;
	}

	public String getKoca() {
		return koca;
	}

	public void setKoca(String koca) {
		this.koca = koca;
	}

	public String getSic() {
		return sic;
	}

	public void setSic(String sic) {
		this.sic = sic;
	}

	public String getNaics() {
		return naics;
	}

	public void setNaics(String naics) {
		this.naics = naics;
	}

	public String getShipComment() {
		return shipComment;
	}

	public void setShipComment(String shipComment) {
		this.shipComment = shipComment;
	}

	public String getRenewalStatus() {
		return renewalStatus;
	}

	public void setRenewalStatus(String renewalStatus) {
		this.renewalStatus = renewalStatus;
	}

	public Timestamp getNewMYDR() {
		return newMYDR;
	}

	public void setNewMYDR(Timestamp newMYDR) {
		this.newMYDR = newMYDR;
	}

	public String getContractBase() {
		return contractBase;
	}

	public void setContractBase(String contractBase) {
		this.contractBase = contractBase;
	}
}
