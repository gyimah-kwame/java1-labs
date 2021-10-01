package com.company.lab1;

import java.util.Random;

public class Question4 {

    public static void generateNumbers() {
        Random random = new Random();
        int number = random.nextInt(-3, 4);

        do {
            System.out.println("number is "+number);
            number = random.nextInt(-3, 4);
        }while (number != 0);
    }

    public static void generateNumbersV2() {
        Random random = new Random();
        int number = random.nextInt(-3, 4);

        while(number != 0 ) {
            System.out.println("number is "+number);
            number = random.nextInt(-3, 4);
        }
    }



}
