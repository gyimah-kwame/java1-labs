package com.company;

import com.company.exceptions.TradeIDException;
import com.company.lab1.*;
import com.company.lab3.MyStack;
import com.company.lab3.Trade;

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

        try {
            new Trade("1", "aa", 1, 1);
            new Trade("2", "aa", 2, 4);
        }catch (TradeIDException e) {
            System.out.println(e.getMessage());
        }




        MyStack<Integer> myStack = new MyStack<>();

        myStack.push(1);
        myStack.push(2);

        System.out.println("size of stack "+myStack.size());

        System.out.println(myStack);
        System.out.println("top of stack "+ myStack.top());

        myStack.pop();

        System.out.println(myStack);
        System.out.println("top of stack "+ myStack.top());

        System.out.println("size of stack "+myStack.size());

        System.out.println();

        try {
            Trade trade = new Trade("10", "", 1);

            System.out.println("trade "+trade.getPrice());

        }catch (TradeIDException e) {
            System.out.println(e.getMessage());
        }





    }
}
