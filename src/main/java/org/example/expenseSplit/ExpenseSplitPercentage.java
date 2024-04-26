package org.example.expenseSplit;

import org.example.entities.Expense;
import org.example.entities.Split;

import java.util.List;

public class ExpenseSplitPercentage implements IExpenseSplit{


    @Override
    public void computeAmount(Expense expense) {

        double totalAmount = expense.getAmount();

        List<Split> allSplits = expense.getAllSplits();
        validate(totalAmount,allSplits);

    }

    public void validate(double totalAmount, List<Split> allSplits){

        double totalPercentage = 0;
        for(Split split: allSplits){

            totalPercentage += split.getPercentage();
        }

        if(totalPercentage != 100){

            // throw exception
        }
    }
}
