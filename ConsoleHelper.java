package com.javarush.task.task27.task2712;

import com.javarush.task.task27.task2712.kitchen.Dish;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConsoleHelper {

    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    /**
     * для вывода message в консольдля вывода message в консоль
     *
     * @param message сообщение для вывода
     */
    public static void writeMessage(String message) {
        System.out.println(message);
    }

    /**
     * для чтения строки с консоли
     *
     * @return строку из консоли
     * @throws IOException
     */
    public static String readString() throws IOException {
        return bufferedReader.readLine();
    }

    /**
     * Просит пользователя выбрать блюдо и добавляет его в список.
     * Выводит список всех блюд и попросит пользователя ввести строку - название блюда.
     * Введенное 'exit' означает завершение заказа.
     * В случае, если введенное блюдо не представлено в меню, выведит сообщение о том,
     * что такого блюда нет и продолжает формирование заказа.
     *
     * @return
     */
    public static List<Dish> getAllDishesForOrder() throws IOException {
        List<Dish> dishes = new ArrayList<>();
        String exit = "exit";
        String warning = "Такое блюдо отсутствует в меню...";
        String delimiter = "============================================================";
        writeMessage("Меню:");
        writeMessage(delimiter);
        writeMessage(Dish.allDishesToString());
        writeMessage(delimiter);
        writeMessage("Пожалуйста, выбирите блюда из меню:");
        writeMessage("\"exit\" - для выхода из режима выбора блюд.");
        String dish;
        while (!(dish = readString()).equals(exit)) {
            try {
                dishes.add(Dish.valueOf(dish));
            } catch (IllegalArgumentException e) {
                writeMessage(warning);
            }
        }
        return dishes;
    }

}
