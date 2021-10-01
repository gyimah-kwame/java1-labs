package com.company.lab1;

public class Question5 {

    public static void generateTables() {
        for (int i = 1; i<=12; i++) {
            generateMultiplicationTable(i);
        }
    }

    private static void generateMultiplicationTable(int number) {
        for (int i=1; i<=12; i++) {
            //System.out.println(i + " x " + number + " = " + (i*number));
            System.out.printf("%d x %d = %d", i, number, (i*number));
            System.out.println();
        }
        System.out.println();
    }

}
