package org.example.service;

import org.example.entities.Balance;
import org.example.entities.Split;
import org.example.entities.User;
import org.example.entities.UserExpBalanceSheet;

import java.util.List;

public class ExpBalanceSheetService {

    public void updateUserExpBalanceSheet(User expensePaidBy, List<Split> splits, double totalExpAmount){


        UserExpBalanceSheet paidUserBalanceSheet = expensePaidBy.getUserExpBalanceSheet();
        paidUserBalanceSheet.setTotalPayment(paidUserBalanceSheet.getTotalPayment() + totalExpAmount);

        for (Split split : splits){

            User splitUser = split.getUser();
            double oweAmount = split.getAmount();
            if(splitUser.getName().equalsIgnoreCase(expensePaidBy.getName())){
                paidUserBalanceSheet.setTotalYourExp(paidUserBalanceSheet.getTotalYourExp() + oweAmount);
            } else {
                paidUserBalanceSheet.setTotalYouGetback(paidUserBalanceSheet.getTotalYouGetback() + oweAmount);

                Balance userOweBalance;

                if(paidUserBalanceSheet.getUserBalance().containsKey(splitUser.getName())){
                    userOweBalance = paidUserBalanceSheet.getUserBalance().get(splitUser.getName());
                } else {
                    userOweBalance = new Balance();
                }
                userOweBalance.setAmountGetBack(userOweBalance.getAmountGetBack() + oweAmount);
                paidUserBalanceSheet.getUserBalance().put(splitUser.getName(),userOweBalance);

                UserExpBalanceSheet oweUserExpBalanceSheet = splitUser.getUserExpBalanceSheet();


                oweUserExpBalanceSheet.setTotalYourExp(oweUserExpBalanceSheet.getTotalYourExp() + oweAmount);
                oweUserExpBalanceSheet.setTotalYouOwe(oweUserExpBalanceSheet.getTotalYouOwe() + oweAmount);


                Balance paidUserBalance;

                if(oweUserExpBalanceSheet.getUserBalance().containsKey(expensePaidBy.getName())){

                    paidUserBalance = oweUserExpBalanceSheet.getUserBalance().get(expensePaidBy.getName());

                } else {
                    paidUserBalance = new Balance();
                }

                paidUserBalance.setAmountOwe(paidUserBalance.getAmountOwe() + oweAmount);
                oweUserExpBalanceSheet.getUserBalance().put(expensePaidBy.getName(), paidUserBalance);

            }
        }

        System.out.println("hello");
    }
}
