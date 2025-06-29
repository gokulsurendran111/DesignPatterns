package org.oops;

public class InvestorB implements Observer{
    @Override
    public void update(String stockSymbol, int newPrice) {
        System.out.println("InvestorB Stock: " + stockSymbol + " Price: " + newPrice);
    }
}
