package com.javarush.task.task27.task2712.kitchen;

public enum Dish {
    Fish,
    Steak,
    Soup,
    Juice,
    Water;

    public static String allDishesToString() {
        StringBuilder stringBuilder = new StringBuilder();
        String delimiter = ", ";
        for (Dish dish : Dish.values()
        ) {
            stringBuilder
                    .append(dish.name())
                    .append(delimiter);
        }
        int index = stringBuilder.lastIndexOf(delimiter);
        stringBuilder.delete(index, stringBuilder.length());
        return stringBuilder.toString();
    }
}
