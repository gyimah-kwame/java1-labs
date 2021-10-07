package com.company.lab3;

import com.company.contracts.MallonExchange;
import com.company.exceptions.TradeIDException;

import java.util.HashMap;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class Trade1 {

    private String symbol;
    private String date, timestamp;
    private int quantity;
    private double price;

    public Trade1(String symbol, String date, String timestamp, int quantity, double price) {
        this.symbol = symbol;
        this.date = date;
        this.timestamp = timestamp;
        this.quantity = quantity;
        this.price = price;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
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

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Trade1 (" +
                "symbol='" + symbol + '\'' +
                ", date='" + date + '\'' +
                ", timestamp='" + timestamp + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ')';
    }
}
