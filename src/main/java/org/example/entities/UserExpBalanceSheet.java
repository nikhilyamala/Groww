package org.example.entities;

import java.util.HashMap;

public class UserExpBalanceSheet {

    private HashMap<String,Balance> userBalance;

    private double totalPayment;
    private double totalYourExp;
    private double totalYouGetback;
    private double totalYouOwe;


    public UserExpBalanceSheet() {
        this.userBalance = new HashMap<>();
        this.totalPayment = 0;
        this.totalYourExp = 0;
        this.totalYouOwe = 0;
        this.totalYouGetback = 0;
    }

    public HashMap<String, Balance> getUserBalance() {
        return userBalance;
    }

    public void setUserBalance(HashMap<String, Balance> userBalance) {
        this.userBalance = userBalance;
    }

    public double getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(double totalPayment) {
        this.totalPayment = totalPayment;
    }

    public double getTotalYourExp() {
        return totalYourExp;
    }

    public void setTotalYourExp(double totalYourExp) {
        this.totalYourExp = totalYourExp;
    }

    public double getTotalYouGetback() {
        return totalYouGetback;
    }

    public void setTotalYouGetback(double totalYouGetback) {
        this.totalYouGetback = totalYouGetback;
    }

    public double getTotalYouOwe() {
        return totalYouOwe;
    }

    public void setTotalYouOwe(double totalYouOwe) {
        this.totalYouOwe = totalYouOwe;
    }
}
