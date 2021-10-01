package com.company.lab1;

import java.util.Random;

public class Question6 {

    public static void generateNumbers() {
        Random random = new Random();
        for (int i=0; i<6; i++) {
            System.out.println("number is "+random.nextInt(1, 50));
        }
    }

    public static void generateNumbers(int n) {
        Random random = new Random();
        for (int i=0; i<6; i++) {
            System.out.println("number is "+random.nextInt(1, n+1));
        }
    }

}
