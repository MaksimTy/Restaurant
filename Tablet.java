package com.javarush.task.task27.task2712;

import com.javarush.task.task27.task2712.kitchen.Cook;
import com.javarush.task.task27.task2712.kitchen.Order;

import java.io.IOException;
import java.util.Observable;
import java.util.Observer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Tablet extends Observable {

    private final int number;
    private static Logger logger = Logger.getLogger(Tablet.class.getName());

    public Tablet(int number) {
        this.number = number;
    }

    /**
     * Создаёт заказ из тех блюд, которые выберет пользователь.
     */
    public Order createOrder() {
        Order order = null;
        try {
            order = new Order(this);

        } catch (IOException e) {
            logger.log(Level.SEVERE, "Console is unavailable.");
        }
        ConsoleHelper.writeMessage(order.toString());
        this.setChanged();
        this.notifyObservers(order);
        return order;
    }


    @Override
    public synchronized void addObserver(Observer o) {
        super.addObserver(o);
    }

    @Override
    public String toString() {
        return "Tablet{" +
                "number=" + number +
                '}';
    }
}
