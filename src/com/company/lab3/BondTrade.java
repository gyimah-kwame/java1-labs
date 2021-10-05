package com.company.lab3;

import com.company.exceptions.TradeIDException;

public class BondTrade extends Trade{


    public BondTrade(String id, String symbol, int quantity, double price) throws TradeIDException {
        super(id, symbol, quantity, price);
    }
//
//    @Override
//    public void calcDividend() {
//
//    }
}
