package org.oops;

public interface Subject {
    void addSubscriber(Observer observer);
    void removeSubscriber(Observer observer);
    void setStockPrice(String stockSymbol, int oldPrice, int newPrice);
    void notifyAllObservers(String stockSymbol, int newPrice);
}
