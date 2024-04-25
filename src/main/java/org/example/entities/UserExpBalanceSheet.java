package org.example.entities;

import java.util.HashMap;

public class UserExpBalanceSheet {

    private HashMap<String,Balance> userBalance;
    private double totalExp;
    private double totalGetback;
    private double totalOwe;


    public UserExpBalanceSheet() {
        this.userBalance = new HashMap<>();
        this.totalExp = 0;
        this.totalGetback = 0;
        this.totalOwe = 0;
    }

    public HashMap<String, Balance> getUserBalance() {
        return userBalance;
    }

    public void setUserBalance(HashMap<String, Balance> userBalance) {
        this.userBalance = userBalance;
    }

    public double getTotalExp() {
        return totalExp;
    }

    public void setTotalExp(double totalExp) {
        this.totalExp = totalExp;
    }

    public double getTotalGetback() {
        return totalGetback;
    }

    public void setTotalGetback(double totalGetback) {
        this.totalGetback = totalGetback;
    }

    public double getTotalOwe() {
        return totalOwe;
    }

    public void setTotalOwe(double totalOwe) {
        this.totalOwe = totalOwe;
    }
}
