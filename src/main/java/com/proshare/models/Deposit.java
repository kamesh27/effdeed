package com.proshare.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Deposit {

    @Id
    public ObjectId _id;

    public String depositAmount;
    public String rateOfInterest;
    public String branchOfBank;
    public String depositNumber;
    public String startDate;
    public String endDate;
    public  String depositTime;
    public String expectedReturn;

    public Deposit(){}
    public Deposit(String depositAmount, String rateOfInterest, String branchOfBank, String depositNumber, String startDate, String endDate, String depositTime, String expectedReturn) {
        this.depositAmount = depositAmount;
        this.rateOfInterest = rateOfInterest;
        this.branchOfBank = branchOfBank;
        this.depositNumber = depositNumber;
        this.startDate = startDate;
        this.endDate = endDate;
        this.depositTime = depositTime;
        this.expectedReturn = expectedReturn;
    }

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public String getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(String depositAmount) {
        this.depositAmount = depositAmount;
    }

    public String getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(String rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    public String getBranchOfBank() {
        return branchOfBank;
    }

    public void setBranchOfBank(String branchOfBank) {
        this.branchOfBank = branchOfBank;
    }

    public String getDepositNumber() {
        return depositNumber;
    }

    public void setDepositNumber(String depositNumber) {
        this.depositNumber = depositNumber;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getDepositTime() {
        return depositTime;
    }

    public void setDepositTime(String depositTime) {
        this.depositTime = depositTime;
    }

    public String getExpectedReturn() {
        return expectedReturn;
    }

    public void setExpectedReturn(String expectedReturn) {
        this.expectedReturn = expectedReturn;
    }

    @Override
    public String toString() {
        return "Deposit{" +
                "_id=" + _id +
                ", depositAmount='" + depositAmount + '\'' +
                ", rateOfInterest='" + rateOfInterest + '\'' +
                ", branchOfBank='" + branchOfBank + '\'' +
                ", depositNumber='" + depositNumber + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", depositTime='" + depositTime + '\'' +
                ", expectedReturn='" + expectedReturn + '\'' +
                '}';
    }
}
