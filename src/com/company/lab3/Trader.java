package com.company.lab3;

public class Trader {

    private String name;
    private Account account;

    public void addTrade(Trade trade) {
        account.setTotalTrades(account.getTotalTrades() + trade.getPrice() * trade.getQuantity());
    }
}
