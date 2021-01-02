package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    List<String> someBingoNumbers = Arrays.asList( //converting it to a list of string items
	            "N40", "N36",
                "B12", "B6",
                "G53", "G49", "G60", "G50", "g64",
                "I26", "I17", "I29",
                "O71");

        List<String> gNumbers = new ArrayList<>();

//        someBingoNumbers.forEach(number -> {
//            if(number.toUpperCase().startsWith("G")) {
//                gNumbers.add(number);
////                System.out.println(number);
//            }
//        });
//
//        gNumbers.sort((String s1, String s2) -> s1.compareTo(s2)); // sorting the list
//        gNumbers.forEach((String s) -> System.out.println(s));
        someBingoNumbers
                .stream()// Stream is a set of object references
                .map(String::toUpperCase)//(::) - called a method reference..used when all the lambda does is call an existing method //the map method accepts a function and in this case we are mapping a string. toUpperCase method to function
                .filter(s->s.startsWith("G"))
                .sorted()
                .forEach(System.out::println);


    }
}
