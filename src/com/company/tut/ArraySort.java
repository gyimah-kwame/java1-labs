package com.company.tut;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class ArraySort {

    public static void main(String[] args) {


        int length = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        Integer[] values = new Integer[6];

        Random random = new Random();

        while(length < 6) {

            int number = random.nextInt(1, 50);

            if (!hashMap.containsKey(number)) {
                hashMap.put(number, number);
                values[length++] = number;
            }
        }


        System.out.println(Arrays.toString(values));
        Arrays.sort(values, new MyComparator());
        System.out.println(Arrays.toString(values));

    }
}
