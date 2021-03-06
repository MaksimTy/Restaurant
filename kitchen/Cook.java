package com.javarush.task.task27.task2712.kitchen;

import com.javarush.task.task27.task2712.ConsoleHelper;

import java.util.Observable;
import java.util.Observer;

public class Cook  extends Observable implements Observer{
    private String name;


    public Cook(String name) {
        this.name = name;
    }


    @Override
    public void update(Observable o, Object order) {
        ConsoleHelper.writeMessage("Start cooking - " + order.toString() +
                ", cooking time " + ((Order)order).getTotalCookingTime() + "min");
        this.setChanged();
        this.notifyObservers(order);
    }


    @Override
    public synchronized void addObserver(Observer o) {
        super.addObserver(o);
    }

    @Override
    public String toString() {
        return name;
    }
}
