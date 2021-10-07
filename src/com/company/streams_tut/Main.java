package com.company.streams_tut;

import com.company.lab3.Trade;
import com.company.lab3.Trade1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        try {
            List<String> lines = readFile("C:\\Users\\User\\Documents\\Trades.txt");

            lines.forEach(System.out::println);

            List<Trade1> trades = lines.stream()
                    .map(s -> s.split(","))
                    .filter(s -> s.length > 4)
                    .map(s -> new Trade1(s[0], s[1], s[2], Integer.parseInt(s[3]), Double.parseDouble(s[4])))
                    .collect(Collectors.toList());

            System.out.println(trades);

            trades.stream()
                    .sorted(Comparator.comparing(Trade1::getTimestamp).reversed())
                    .limit(10)
                    .forEach(System.out::println);

            System.out.println("\n\n\ntrades with quantity greater than 200");

            trades.stream()
                    .filter(t -> t.getQuantity() > 200)
                    .limit(1)
                    .forEach(System.out::println);

            System.out.println("\n\nTotal value of a give symbol");

            double total = trades.stream()
                    .filter(s -> s.getSymbol().equalsIgnoreCase("NTAP"))
                    .map(s -> s.getQuantity() * s.getPrice())
                    .reduce(0.0, (a,b) -> a+b);

            System.out.println("total "+total);

            trades.stream()
                    .filter(x -> x.getSymbol().startsWith("A"))
                    .forEach(System.out::println);

            Optional<Trade1> results = trades.stream().filter(x -> x.getSymbol().equalsIgnoreCase("1AKAM")).findFirst();

            System.out.println(results.stream().findFirst());

            System.out.println(results.stream().map(Trade1::getSymbol).findFirst().orElse("Trade not found"));


        }catch (IOException e) {
            System.err.println("error reading from file");
        }



    }

     private static List<String> readFile(String path) throws IOException {
         return Files.readAllLines(Path.of(path));
     }
}
