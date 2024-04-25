package org.example.entities;

public class Balance {
    private double totalOwe;
    private double totalGetBack;

    public Balance(){

    }

    public Balance(double totalOwe, double totalGetBack) {
        this.totalOwe = totalOwe;
        this.totalGetBack = totalGetBack;
    }

    public double getTotalOwe() {
        return totalOwe;
    }

    public void setTotalOwe(double totalOwe) {
        this.totalOwe = totalOwe;
    }

    public double getTotalGetBack() {
        return totalGetBack;
    }

    public void setTotalGetBack(double totalGetBack) {
        this.totalGetBack = totalGetBack;
    }
}
