package com.company.lab1;

import java.util.Random;

public class Question2 {

    private int number;

    public Question2() {
        number = 0;
    }

    public void generateNumber() {
        number = new Random().nextInt(0, 101);
    }

    public int getNumber() {
        return number;
    }

    public boolean isEven() {
        return number % 2 == 0;
    }

    public void getScale() {

        String status = null;

        if (number == 0) {
            status = "frozen";
        }else if (isNumberInRange(1, 14)) {
            status = "cold";
        }else if (isNumberInRange(15, 24)) {
            status = "cool";
        }else if (isNumberInRange(25, 40)) {
            status = "warm";
        }else if (isNumberInRange(41, 60)) {
            status = "hot";
        }else if (isNumberInRange(61, 80)) {
            status = "very hot";
        }else if (isNumberInRange(81, 99)) {
            status = "extremely hot";
        }else {
            status = "boiling";
        }

        System.out.println("scale is "+status);
    }

    private boolean isNumberInRange(int start, int end) {
        return (number >= start && number <= end);
    }
}
