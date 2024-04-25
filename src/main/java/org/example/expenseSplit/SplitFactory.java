package org.example.expenseSplit;

public class SplitFactory {


    public IExpenseSplit getSplitObj(String splitType){

        switch (splitType){
            case "percent":
                return new ExpenseSplitPercentage();

        }

        return null;
    }
}
