package com.javarush.task.task27.task2712.kitchen;

import com.javarush.task.task27.task2712.ConsoleHelper;
import com.javarush.task.task27.task2712.Tablet;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * Класс содержит информацию,
 * относящуюся к списку выбранных пользователем блюд.
 */
public class Order {

    private final Tablet tablet;
    protected List<Dish> dishes;

    public Order(Tablet tablet) throws IOException {
        this.tablet = tablet;
        this.dishes = ConsoleHelper.getAllDishesForOrder();
    }

    @Override
    public String toString() {
        if (this.dishes.size() == 0) {
            return "";
        }
        return "Your order: " +
                Arrays.toString(dishes.toArray()) +
                  tablet;  }
}
