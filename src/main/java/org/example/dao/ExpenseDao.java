package org.example.dao;

import org.example.entities.Expense;

import java.util.HashMap;

public class ExpenseDao {

    private static HashMap<String, Expense> expenseMap;

    private static ExpenseDao instance;

    public static HashMap<String, Expense> getExpenseMap() {
        return expenseMap;
    }

    public static void setExpenseMap(HashMap<String, Expense> expenseMap) {
        ExpenseDao.expenseMap = expenseMap;
    }

    public static ExpenseDao getInstance(){
        if(instance == null){
            expenseMap = new HashMap<>();
            instance = new ExpenseDao();
        }

        return instance;
    }
}
