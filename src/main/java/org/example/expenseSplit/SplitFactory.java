package org.example.expenseSplit;

import org.example.entities.SplitType;

public class SplitFactory {


    public static IExpenseSplit getSplitObj(SplitType splitType){

        switch (splitType){
            case PERCENTAGE:
                return new ExpenseSplitPercentage();

        }

        return null;
    }
}
