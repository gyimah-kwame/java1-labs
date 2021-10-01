package com.company.lab1;

import java.util.Random;

public class Question3 {

    String[] texts = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

    private int number;

    public void generateNumber() {
        number = new Random().nextInt(1, 10);
    }

    public void getText() {
        System.out.println(number + " in words is "+ texts[number-1]);
    }
}
