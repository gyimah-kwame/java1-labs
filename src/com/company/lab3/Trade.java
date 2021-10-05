package com.company.lab3;

import com.company.contracts.MallonExchange;
import com.company.exceptions.TradeIDException;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Comparator;
import java.util.HashMap;

public class Trade {

    private String id, symbol;
    private int quantity;
    private double price;

    private static final HashMap<String, String> trades = new HashMap<>();

    public Trade(String id, String symbol, int quantity, double price) throws TradeIDException {

        this(id, symbol, quantity);

       this.price = price;

    }

    public Trade(String id, String symbol, int quantity) throws TradeIDException {

        if (trades.containsKey(id)) {
            throw new TradeIDException("Trade with id "+id+" already exists");
        }else  {
            this.id = id;
            this.symbol = symbol;
            this.quantity = quantity;

            trades.put(id, id);


            MallonExchange mallonExchange = mock(MallonExchange.class);

            when(mallonExchange.getPrice(symbol, quantity)).thenReturn(100.00);

            this.price = mallonExchange.getPrice(symbol, quantity);



        }

    }

    public void setPrice(double price) {
        this.price = Math.abs(price);
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }


    public void recordTrade(Trade trade) {

    }


    @Override
    public String toString() {
        return "Trade{" +
                "id='" + id + '\'' +
                ", symbol='" + symbol + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }


}
