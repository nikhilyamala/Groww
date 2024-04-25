package org.example.service;

import org.example.entities.Balance;
import org.example.entities.Split;
import org.example.entities.User;
import org.example.entities.UserExpBalanceSheet;

import java.util.List;

public class ExpBalanceSheetService {

    public void updateUserExpBalanceSheet(User expensePaidBy, List<Split> splits, double totalExpAmount){

        UserExpBalanceSheet paidExpSheet = expensePaidBy.getUserExpBalanceSheet();
        paidExpSheet.setTotalExp(totalExpAmount);
        for(Split split: splits){
            User userOwe = split.getUser();
            UserExpBalanceSheet oweUserExp = userOwe.getUserExpBalanceSheet();
            double oweAmount = split.getAmount();

            if(expensePaidBy.getName().equalsIgnoreCase(userOwe.getName())){
                paidExpSheet.setTotalExp(paidExpSheet.getTotalExp() + totalExpAmount);
            } else {

                paidExpSheet.setTotalGetback(paidExpSheet.getTotalGetback() + oweAmount);
                Balance userOweBalance;

                if(paidExpSheet.getUserBalance().containsKey(userOwe.getName())){
                    userOweBalance = paidExpSheet.getUserBalance().get(userOwe.getName());
                } else {
                    userOweBalance = new Balance();
                    paidExpSheet.getUserBalance().put(userOwe.getName(),userOweBalance);
                }
                userOweBalance.setTotalGetBack(userOweBalance.getTotalGetBack() + oweAmount);
                oweUserExp.setTotalOwe(oweUserExp.getTotalOwe() + oweAmount);

                Balance userPaidBalance;


            }
        }
    }
}
