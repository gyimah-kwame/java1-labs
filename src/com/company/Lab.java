package com.company;

import com.company.lab1.*;

public class Lab {

    public static void main(String[] args) {

        Question2 question2 = new Question2();

        question2.generateNumber();

        System.out.println("Number is "+question2.getNumber());

        System.out.println(question2.isEven() ? "Number is even" : "Number is odd");

        question2.getScale();

        Question3 question3 = new Question3();

        question3.generateNumber();

        question3.getText();

        Question4.generateNumbers();

        Question4.generateNumbersV2();

        Question5.generateTables();

        Question6.generateNumbers();

        Question6.generateNumbers(49);
    }
}
