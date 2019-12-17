package ru.javawebinar.topjava.model;

import java.time.LocalDateTime;

public class MealTo {

    private final LocalDateTime dateTime;
    private final String description;
    private final int calories;
    private final boolean excess;

    @Override
    public String toString() {
        return "UserMealWithExcess{" +
                "dateTime=" + dateTime +
                ", description='" + description + '\'' +
                ", categories=" + calories +
                ", excess=" + excess +
                '}';
    }

    public MealTo(LocalDateTime dateTime, String description, int categories, boolean excess) {
        this.dateTime = dateTime;
        this.description = description;
        this.calories = categories;
        this.excess = excess;


    }
}
