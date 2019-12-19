package ua.javawebinar.topjava.dao;

import ua.javawebinar.topjava.model.Meal;
import ua.javawebinar.topjava.model.MealTo;

import java.time.LocalDateTime;
import java.util.List;

public interface MealDao {
    List<Meal> getList();
    Meal getById(int mealId);
    MealTo getMealToByDate(LocalDateTime date);
    Meal insert(Meal meal, boolean updateTotal);
    Meal update(Meal meal);
    void delete(int mealId);
}
