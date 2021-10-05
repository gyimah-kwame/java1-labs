package com.company.tut;

import java.util.HashMap;
import java.util.Map;

public class MosesTut {
    static char[] suits = {'S', 'D', 'C', 'H'};
    static char[] values = {'2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K', 'A'};
    static Map<Character, Character> cards = new HashMap<>();

    public static void main(String[] args) {


        for (char i : suits) {

            for (char j : values) {
//                cards.put(i,j);
                System.out.println("i => "+i +" j => "+j);
            }

        }

        System.out.println(cards.toString());

}


}