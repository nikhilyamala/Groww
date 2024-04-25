package org.example.entities;

import java.util.List;
import java.util.UUID;

public class Expense {
    private String id;
    private String desc;
    private double amount;
    private User paidBy;
    private List<Split> allSplits;
    private SplitType splitType;

    public Expense(String desc, double amount, User paidBy, List<Split> allSplits, SplitType splitType) {
        this.id = UUID.randomUUID().toString();
        this.desc = desc;
        this.amount = amount;
        this.paidBy = paidBy;
        this.allSplits = allSplits;
        this.splitType = splitType;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public User getPaidBy() {
        return paidBy;
    }

    public void setPaidBy(User paidBy) {
        this.paidBy = paidBy;
    }

    public List<Split> getAllSplits() {
        return allSplits;
    }

    public void setAllSplits(List<Split> allSplits) {
        this.allSplits = allSplits;
    }

    public SplitType getSplitType() {
        return splitType;
    }

    public void setSplitType(SplitType splitType) {
        this.splitType = splitType;
    }
}
