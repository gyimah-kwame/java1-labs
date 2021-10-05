package com.company.lab3;

import com.company.exceptions.TradeIDException;

public class FundTrade extends Trade{


    public FundTrade(String id, String symbol, int quantity, double price) throws TradeIDException {
        super(id, symbol, quantity, price);
    }


}
