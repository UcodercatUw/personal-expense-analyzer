package org.example;

public class BudgetService {
    public boolean isBudgetExceeded (double currentSpending, double amountToAdd, double budgetLimit) {
        return (currentSpending + amountToAdd) > budgetLimit;
    }
}
