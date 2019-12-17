package ru.javawebinar.topjava.util;

import ru.javawebinar.topjava.model.Meal;
import ru.javawebinar.topjava.model.MealTo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.toList;


public class MealsUtil {

   public static void main(String[] args) {
       List<Meal> meals = Arrays.asList(
               new Meal(LocalDateTime.of(2019, Month.MAY, 30, 10, 0),
                       "Breakfast", 500),
               new Meal(LocalDateTime.of(2019, Month.MAY, 30, 13, 0),
                       "Lunch", 1000),
               new Meal(LocalDateTime.of(2019, Month.MAY, 30, 20, 0),
                       "Dinner", 500),
               new Meal(LocalDateTime.of(2019, Month.MAY, 31, 10, 0),
                       "Breakfast", 1000),
               new Meal(LocalDateTime.of(2019, Month.MAY, 31, 13, 0),
                       "Lunch", 500),
               new Meal(LocalDateTime.of(2019, Month.MAY, 31, 20, 0),
                       "Dinner", 510)
       );

        }
}
