package org.example.entities;


public class User {
    private String name;
    private String mobileNumber;

    private UserExpBalanceSheet userExpBalanceSheet;

    public User(String name, String mobileNumber) {
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.userExpBalanceSheet = new UserExpBalanceSheet();
    }

    public UserExpBalanceSheet getUserExpBalanceSheet() {
        return userExpBalanceSheet;
    }

    public void setUserExpBalanceSheet(UserExpBalanceSheet userExpBalanceSheet) {
        this.userExpBalanceSheet = userExpBalanceSheet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
}
