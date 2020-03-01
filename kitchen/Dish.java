package com.javarush.task.task27.task2712.kitchen;

import java.util.Arrays;

public enum Dish {
    Fish,
    Steak,
    Soup,
    Juice,
    Water;

    public static String allDishesToString() {
        StringBuilder result = new StringBuilder(Arrays.toString(Dish.values()));
        return result.substring(1, result.length() - 1);
    }
}
