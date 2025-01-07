package com.sil.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

@Document(indexName = "feedback")
public class Feedback  {

    @Id
    private String id;

    @NotBlank
    private String bankName;

    @NotBlank
    private String branchName;

    @NotBlank
    private String personName;

    @NotBlank
    private String personMobileNo;

    @NotBlank
    private String designation;

    private FeedbackSection coreBanking;
    private FeedbackSection atm;
    private FeedbackSection mobileBanking;
    private FeedbackSection internetBanking;
    private FeedbackSection corporateInternetBanking;
    private FeedbackSection agencyBanking;
    private FeedbackSection upi;
    private FeedbackSection dem;
    private FeedbackSection nach;
    private FeedbackSection otherProducts;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getPersonMobileNo() {
		return personMobileNo;
	}
	public void setPersonMobileNo(String personMobileNo) {
		this.personMobileNo = personMobileNo;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public FeedbackSection getCoreBanking() {
		return coreBanking;
	}
	public void setCoreBanking(FeedbackSection coreBanking) {
		this.coreBanking = coreBanking;
	}
	public FeedbackSection getAtm() {
		return atm;
	}
	public void setAtm(FeedbackSection atm) {
		this.atm = atm;
	}
	public FeedbackSection getMobileBanking() {
		return mobileBanking;
	}
	public void setMobileBanking(FeedbackSection mobileBanking) {
		this.mobileBanking = mobileBanking;
	}
	public FeedbackSection getInternetBanking() {
		return internetBanking;
	}
	public void setInternetBanking(FeedbackSection internetBanking) {
		this.internetBanking = internetBanking;
	}
	public FeedbackSection getCorporateInternetBanking() {
		return corporateInternetBanking;
	}
	public void setCorporateInternetBanking(FeedbackSection corporateInternetBanking) {
		this.corporateInternetBanking = corporateInternetBanking;
	}
	public FeedbackSection getAgencyBanking() {
		return agencyBanking;
	}
	public void setAgencyBanking(FeedbackSection agencyBanking) {
		this.agencyBanking = agencyBanking;
	}
	public FeedbackSection getUpi() {
		return upi;
	}
	public void setUpi(FeedbackSection upi) {
		this.upi = upi;
	}
	public FeedbackSection getDem() {
		return dem;
	}
	public void setDem(FeedbackSection dem) {
		this.dem = dem;
	}
	public FeedbackSection getNach() {
		return nach;
	}
	public void setNach(FeedbackSection nach) {
		this.nach = nach;
	}
	public FeedbackSection getOtherProducts() {
		return otherProducts;
	}
	public void setOtherProducts(FeedbackSection otherProducts) {
		this.otherProducts = otherProducts;
	}

    // Getters and Setters
    
}

