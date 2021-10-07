package com.company.functions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> add = operate("add");
        BiFunction<Integer, Integer, Integer> subtract = operate("subtract");
        BiFunction<Integer, Integer, Integer> power = operate("power");


        System.out.println(add.apply(10,20));
        System.out.println(subtract.apply(20,20));
        System.out.println(power.apply(2,5));

        Function<Integer, Integer> testAdd = curryAdd(2);
        Function<Integer, Integer> anotherAdd = curryAdd(4);

        Function<Integer, Integer> now = anotherAdd.compose(testAdd);

        System.out.println(now.apply(10));

        List<Integer> list1 = List.of(1, 2, 3);
        List<Integer> list2 = List.of(4, 5, 6);

        List<String> str1 = List.of("hello", "word");
        List<String> str2 = List.of("aa", "bb");

        System.out.println(zip(list1, list2));
        System.out.println(zip(str1, str2));

        BiFunction<List, List, List<List>> func = ((first, second)-> {
            List<List> result = new ArrayList<>();

            for (int i=0; i<Math.min(first.size(), second.size()); i++) {
                result.add(List.of(first.get(i), second.get(i)));
            }
            return result;
        });

        System.out.println(func.apply(str1, str2));

    }

    private static BiFunction<Integer, Integer, Integer> operate(String operation) {
        return (integer, integer2) -> {
            switch (operation) {
                case "add": return integer + integer2;
                case "subtract": return integer - integer2;
                case "power": return (int) Math.pow(integer, integer2);
                default: return 0;
            }
        };

    }

    private static Function<Integer, Integer> curryAdd(int a) {
       return integer -> integer + a;
    }

    private static <T> List<List<T>> zip(List<T> list1, List<T> list2) {
        List<List<T>> result = new ArrayList<>();

        for (int i=0; i<Math.min(list1.size(), list2.size()); i++) {

           result.add(List.of(list1.get(i), list2.get(i)));

        }

        return result;


    }

}
