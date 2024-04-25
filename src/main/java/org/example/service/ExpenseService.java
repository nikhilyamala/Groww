package org.example.service;

import org.example.dao.ExpenseDao;
import org.example.entities.Expense;
import org.example.entities.*;

import java.util.List;

public class ExpenseService {

    private ExpenseDao expenseDao;

    private UserService userService;

    private ExpBalanceSheetService expBalanceSheetService;

    public ExpenseService() {
        this.expenseDao = ExpenseDao.getInstance();
        this.userService = new UserService();
        this.expBalanceSheetService = new ExpBalanceSheetService();
    }


    public Expense createExpense(String desc, double amount, String user, SplitType splitType, List<Split> splits){

        User paidUsr= userService.getUser(user);

        Expense expense = new Expense(desc,amount,paidUsr,splits, splitType);

        expBalanceSheetService.updateUserExpBalanceSheet(paidUsr,splits,amount);

        this.expenseDao.getExpenseMap().put(expense.getId(),expense);

        System.out.println("Expense created successfully " + expense.getId());

        return expense;
    }
}
