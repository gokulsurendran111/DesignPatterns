package org.oops;

public class Main {
    public static void main(String[] args) {

        int priceChangeThreshold = 1;
        StockMarket stockMarket = new StockMarket(priceChangeThreshold);

        InvestorA investorA = new InvestorA();
        InvestorB investorB = new InvestorB();

        // TODO: Register Investor A as an observer to receive stock updates.
        stockMarket.addSubscriber(investorA);
        // TODO: Register Investor B as an observer to receive stock updates.
        stockMarket.addSubscriber(investorB);

        String[] stockSymbols = {"ABS", "FDS", "KER"};
        int[] oldPrices = {1, 4, 9};
        int[] newPrices = {2, 4, 7};

        for (int i = 0; i <3; i++) {

            if(i == 2) {
                // TODO: Remove Investor B from receiving notifications after the 4th update.
                stockMarket.removeSubscriber(investorB);
            }

            String stockSymbol = stockSymbols[i];
            int newPrice = newPrices[i];
            int oldPrice = oldPrices[i];

            // TODO: Update the stock price
            stockMarket.setStockPrice(stockSymbol, oldPrice, newPrice);

        }
    }
}