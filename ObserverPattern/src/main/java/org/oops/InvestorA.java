package org.oops;

public class InvestorA implements  Observer{
    @Override
    public void update(String stockSymbol, int newPrice) {
        System.out.println("InvestorA Stock: " + stockSymbol + " Price: " + newPrice);
    }
}
