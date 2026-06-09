package org.example;

public class AnalyticsService {
    public double calculatePercentage(double categorySpent, double totalSpent) {
        if (totalSpent <= 0) {
            return 0.0;
        }
        return (categorySpent / totalSpent) * 100;
    }
}
