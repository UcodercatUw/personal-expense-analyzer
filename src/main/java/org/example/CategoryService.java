package org.example;

public class CategoryService {
    public String detectCategory(String description) {
        if (description == null) {
            return "Other";
        }
        String lowerDesc = description.toLowerCase();
        if (lowerDesc.contains("uber") || lowerDesc.contains("taxi") || lowerDesc.contains("gas")) {
            return "Transport";
        }
        if (lowerDesc.contains("restaurant") || lowerDesc.contains("mcdonalds") || lowerDesc.contains("grocery")) {
            return "Food";
        }
        return "Other";
    }
}
