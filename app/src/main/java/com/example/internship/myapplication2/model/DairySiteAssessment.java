package com.example.internship.myapplication2.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DairySiteAssessment {
    @SerializedName("Id")
    @Expose
    private Integer id;
    @SerializedName("ReferenceId")
    @Expose
    private Integer referenceId;
    @SerializedName("ReferenceType")
    @Expose
    private String referenceType;
    @SerializedName("AssessmentDate")
    @Expose
    private String assessmentDate;
    @SerializedName("FieldOfficer")
    @Expose
    private String fieldOfficer;
    @SerializedName("CBONo")
    @Expose
    private String cBONo;
    @SerializedName("CrossMilchCowQty")
    @Expose
    private Integer crossMilchCowQty;
    @SerializedName("CrossCalfCowQty")
    @Expose
    private Integer crossCalfCowQty;
    @SerializedName("CrossMaleCowQty")
    @Expose
    private Integer crossMaleCowQty;
    @SerializedName("CrossMilchCowPrice")
    @Expose
    private Integer crossMilchCowPrice;
    @SerializedName("CrossCalfCowPrice")
    @Expose
    private Integer crossCalfCowPrice;
    @SerializedName("CrossMaleCowPrice")
    @Expose
    private Integer crossMaleCowPrice;
    @SerializedName("CrossMilchCowAge")
    @Expose
    private Double crossMilchCowAge;
    @SerializedName("CrossCalfCowAge")
    @Expose
    private Double crossCalfCowAge;
    @SerializedName("CrossMaleCowAge")
    @Expose
    private Double crossMaleCowAge;
    @SerializedName("LocalMilchCowQty")
    @Expose
    private Integer localMilchCowQty;
    @SerializedName("LocalCalfCowQty")
    @Expose
    private Integer localCalfCowQty;
    @SerializedName("LocalMaleCowQty")
    @Expose
    private Integer localMaleCowQty;
    @SerializedName("LocalMilchCowPrice")
    @Expose
    private Integer localMilchCowPrice;
    @SerializedName("LocalCalfCowPrice")
    @Expose
    private Integer localCalfCowPrice;
    @SerializedName("LocalMaleCowPrice")
    @Expose
    private Integer localMaleCowPrice;
    @SerializedName("LocalMilchCowAge")
    @Expose
    private Double localMilchCowAge;
    @SerializedName("LocalCalfCowAge")
    @Expose
    private Double localCalfCowAge;
    @SerializedName("LocalMaleCowAge")
    @Expose
    private Double localMaleCowAge;
    @SerializedName("HasOwnerCowshed")
    @Expose
    private Boolean hasOwnerCowshed;
    @SerializedName("HasCowshedPaccaFloor")
    @Expose
    private Boolean hasCowshedPaccaFloor;
    @SerializedName("HasOwnerOtherBusiness")
    @Expose
    private Boolean hasOwnerOtherBusiness;
    @SerializedName("OtherBusinessName")
    @Expose
    private String otherBusinessName;
    @SerializedName("HasOwnerCurrentLoan")
    @Expose
    private Boolean hasOwnerCurrentLoan;
    @SerializedName("LoanInstitutionName")
    @Expose
    private String loanInstitutionName;
    @SerializedName("HasTrainingFrom")
    @Expose
    private Boolean hasTrainingFrom;
    @SerializedName("SuitableLoanType")
    @Expose
    private String suitableLoanType;
    @SerializedName("EntryBy")
    @Expose
    private Integer entryBy;
    @SerializedName("EntryTime")
    @Expose
    private String entryTime;
    @SerializedName("UpdateBy")
    @Expose
    private Integer updateBy;
    @SerializedName("UpdateTime")
    @Expose
    private String updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(Integer referenceId) {
        this.referenceId = referenceId;
    }

    public String getReferenceType() {
        return referenceType;
    }

    public void setReferenceType(String referenceType) {
        this.referenceType = referenceType;
    }

    public String getAssessmentDate() {
        return assessmentDate;
    }

    public void setAssessmentDate(String assessmentDate) {
        this.assessmentDate = assessmentDate;
    }

    public String getFieldOfficer() {
        return fieldOfficer;
    }

    public void setFieldOfficer(String fieldOfficer) {
        this.fieldOfficer = fieldOfficer;
    }

    public String getCBONo() {
        return cBONo;
    }

    public void setCBONo(String cBONo) {
        this.cBONo = cBONo;
    }

    public Integer getCrossMilchCowQty() {
        return crossMilchCowQty;
    }

    public void setCrossMilchCowQty(Integer crossMilchCowQty) {
        this.crossMilchCowQty = crossMilchCowQty;
    }

    public Integer getCrossCalfCowQty() {
        return crossCalfCowQty;
    }

    public void setCrossCalfCowQty(Integer crossCalfCowQty) {
        this.crossCalfCowQty = crossCalfCowQty;
    }

    public Integer getCrossMaleCowQty() {
        return crossMaleCowQty;
    }

    public void setCrossMaleCowQty(Integer crossMaleCowQty) {
        this.crossMaleCowQty = crossMaleCowQty;
    }

    public Integer getCrossMilchCowPrice() {
        return crossMilchCowPrice;
    }

    public void setCrossMilchCowPrice(Integer crossMilchCowPrice) {
        this.crossMilchCowPrice = crossMilchCowPrice;
    }

    public Integer getCrossCalfCowPrice() {
        return crossCalfCowPrice;
    }

    public void setCrossCalfCowPrice(Integer crossCalfCowPrice) {
        this.crossCalfCowPrice = crossCalfCowPrice;
    }

    public Integer getCrossMaleCowPrice() {
        return crossMaleCowPrice;
    }

    public void setCrossMaleCowPrice(Integer crossMaleCowPrice) {
        this.crossMaleCowPrice = crossMaleCowPrice;
    }

    public Double getCrossMilchCowAge() {
        return crossMilchCowAge;
    }

    public void setCrossMilchCowAge(Double crossMilchCowAge) {
        this.crossMilchCowAge = crossMilchCowAge;
    }

    public Double getCrossCalfCowAge() {
        return crossCalfCowAge;
    }

    public void setCrossCalfCowAge(Double crossCalfCowAge) {
        this.crossCalfCowAge = crossCalfCowAge;
    }

    public Double getCrossMaleCowAge() {
        return crossMaleCowAge;
    }

    public void setCrossMaleCowAge(Double crossMaleCowAge) {
        this.crossMaleCowAge = crossMaleCowAge;
    }

    public Integer getLocalMilchCowQty() {
        return localMilchCowQty;
    }

    public void setLocalMilchCowQty(Integer localMilchCowQty) {
        this.localMilchCowQty = localMilchCowQty;
    }

    public Integer getLocalCalfCowQty() {
        return localCalfCowQty;
    }

    public void setLocalCalfCowQty(Integer localCalfCowQty) {
        this.localCalfCowQty = localCalfCowQty;
    }

    public Integer getLocalMaleCowQty() {
        return localMaleCowQty;
    }

    public void setLocalMaleCowQty(Integer localMaleCowQty) {
        this.localMaleCowQty = localMaleCowQty;
    }

    public Integer getLocalMilchCowPrice() {
        return localMilchCowPrice;
    }

    public void setLocalMilchCowPrice(Integer localMilchCowPrice) {
        this.localMilchCowPrice = localMilchCowPrice;
    }

    public Integer getLocalCalfCowPrice() {
        return localCalfCowPrice;
    }

    public void setLocalCalfCowPrice(Integer localCalfCowPrice) {
        this.localCalfCowPrice = localCalfCowPrice;
    }

    public Integer getLocalMaleCowPrice() {
        return localMaleCowPrice;
    }

    public void setLocalMaleCowPrice(Integer localMaleCowPrice) {
        this.localMaleCowPrice = localMaleCowPrice;
    }

    public Double getLocalMilchCowAge() {
        return localMilchCowAge;
    }

    public void setLocalMilchCowAge(Double localMilchCowAge) {
        this.localMilchCowAge = localMilchCowAge;
    }

    public Double getLocalCalfCowAge() {
        return localCalfCowAge;
    }

    public void setLocalCalfCowAge(Double localCalfCowAge) {
        this.localCalfCowAge = localCalfCowAge;
    }

    public Double getLocalMaleCowAge() {
        return localMaleCowAge;
    }

    public void setLocalMaleCowAge(Double localMaleCowAge) {
        this.localMaleCowAge = localMaleCowAge;
    }

    public Boolean getHasOwnerCowshed() {
        return hasOwnerCowshed;
    }

    public void setHasOwnerCowshed(Boolean hasOwnerCowshed) {
        this.hasOwnerCowshed = hasOwnerCowshed;
    }

    public Boolean getHasCowshedPaccaFloor() {
        return hasCowshedPaccaFloor;
    }

    public void setHasCowshedPaccaFloor(Boolean hasCowshedPaccaFloor) {
        this.hasCowshedPaccaFloor = hasCowshedPaccaFloor;
    }

    public Boolean getHasOwnerOtherBusiness() {
        return hasOwnerOtherBusiness;
    }

    public void setHasOwnerOtherBusiness(Boolean hasOwnerOtherBusiness) {
        this.hasOwnerOtherBusiness = hasOwnerOtherBusiness;
    }

    public String getOtherBusinessName() {
        return otherBusinessName;
    }

    public void setOtherBusinessName(String otherBusinessName) {
        this.otherBusinessName = otherBusinessName;
    }

    public Boolean getHasOwnerCurrentLoan() {
        return hasOwnerCurrentLoan;
    }

    public void setHasOwnerCurrentLoan(Boolean hasOwnerCurrentLoan) {
        this.hasOwnerCurrentLoan = hasOwnerCurrentLoan;
    }

    public String getLoanInstitutionName() {
        return loanInstitutionName;
    }

    public void setLoanInstitutionName(String loanInstitutionName) {
        this.loanInstitutionName = loanInstitutionName;
    }

    public Boolean getHasTrainingFrom() {
        return hasTrainingFrom;
    }

    public void setHasTrainingFrom(Boolean hasTrainingFrom) {
        this.hasTrainingFrom = hasTrainingFrom;
    }

    public String getSuitableLoanType() {
        return suitableLoanType;
    }

    public void setSuitableLoanType(String suitableLoanType) {
        this.suitableLoanType = suitableLoanType;
    }

    public Integer getEntryBy() {
        return entryBy;
    }

    public void setEntryBy(Integer entryBy) {
        this.entryBy = entryBy;
    }

    public String getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(String entryTime) {
        this.entryTime = entryTime;
    }

    public Integer getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }
}
