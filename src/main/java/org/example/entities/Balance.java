package org.example.entities;

public class Balance {
    private double amountOwe;
    private double amountGetBack;

    public Balance(){

    }

    public Balance(double totalOwe, double totalGetBack) {
        this.amountOwe = totalOwe;
        this.amountGetBack = totalGetBack;
    }

    public double getAmountOwe() {
        return amountOwe;
    }

    public void setAmountOwe(double amountOwe) {
        this.amountOwe = amountOwe;
    }

    public double getAmountGetBack() {
        return amountGetBack;
    }

    public void setAmountGetBack(double amountGetBack) {
        this.amountGetBack = amountGetBack;
    }
}
