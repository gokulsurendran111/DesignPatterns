package org.oops;

import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Subject{
    private List<Observer> observers;
    private int priceThreshold;

    public StockMarket(int priceThreshold) {
        this.observers = new ArrayList<>();
        this.priceThreshold = priceThreshold;
    }

    @Override
    public void addSubscriber(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeSubscriber(Observer observer) {
    observers.remove(observer);
    }

    @Override
    public void setStockPrice(String stockSymbol, int oldPrice, int newPrice) {
        if (Math.abs(newPrice-oldPrice)>=priceThreshold) {
            notifyAllObservers(stockSymbol, newPrice);
        }
    }

    @Override
    public void notifyAllObservers(String stockSymbol, int newPrice) {
        for (Observer o : observers) {
            o.update(stockSymbol, newPrice);
        }
    }
}
