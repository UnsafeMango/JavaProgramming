package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
	    List<String> someBingoNumbers = Arrays.asList(
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
//        gNumbers.sort((String s1, String s2) -> s1.compareTo(s2));
//        gNumbers.forEach((String s) -> System.out.println(s));
        someBingoNumbers
                .stream()
                .map(String::toUpperCase)// the map method will return a stream of the uppercase bingo numbers
                .filter(s->s.startsWith("G"))// Predicate needed here to return true or false
                .sorted()// sort the stream by natural sorting
                .forEach(System.out::println);// Stream forEach method..this is a terminal operation

        Stream<String> ioNumberStream = Stream.of("I26", "I17", "I29", "O71");// Creating a Stream of String Objects
        Stream<String> inNumberStream = Stream.of("N40", "N36", "I26", "I17", "I29", "O71");
        Stream<String> concatStream = Stream.concat(ioNumberStream, inNumberStream);//concat method is static so we cannot use it in a chain but we can use the result as the source for a chain
        System.out.println("-----------------------");
        System.out.println(concatStream
                .distinct() // removes the duplicates
                .peek(System.out::println) //accepts a consumer argument
                .count());//count returns a long value..it is a terminal operation

    }
}
