package org.example;

public class CurrencyConverter {
    public double convertToBaseCurrency(double amount, double exchangeRate) {
        if (exchangeRate <= 0) {
            return amount;
        }
        return amount * exchangeRate;
    }
}
