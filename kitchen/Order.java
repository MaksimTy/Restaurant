package com.javarush.task.task27.task2712.kitchen;

import com.javarush.task.task27.task2712.Tablet;

import java.util.List;

/**
 * Класс содержит информацию,
 * относящуюся к списку выбранных пользователем блюд.
 */
public class Order {

    private final Tablet tablet;
    protected List<Dish> dishes;

    public Order(Tablet tablet) {
        this.tablet = tablet;
    }
}
