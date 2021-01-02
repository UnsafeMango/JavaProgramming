package com.company;

public class Main {

    public static void main(String[] args) {
        String string = "I am a string. Yes, I am.";
        System.out.println(string);
        String yourString = string.replaceAll("I", "You");
        System.out.println(yourString);

        String alphanumeric = "abcDeeeF12Ghhiiiijkl99z";
        System.out.println(alphanumeric.replaceAll(".","Y"));

        System.out.println(alphanumeric.replaceAll("^abcDeee", "YYY"));

        String secondString = "abcDeeeF12GhhabcDeeeiiiijkl99z";
        System.out.println(secondString.replaceAll("^abcDeee", "YYY"));

        System.out.println(alphanumeric.matches("^hello"));
        System.out.println(alphanumeric.matches("^abcDeee"));
        System.out.println(alphanumeric.matches("abcDeeeF12Ghhiiiijkl99z"));

        System.out.println(alphanumeric.replaceAll("ijkl99z$", "THE END"));
        System.out.println(alphanumeric.replaceAll("[aei]", "X"));
        System.out.println(alphanumeric.replaceAll("[aei]", "I replaced a letter here"));
        System.out.println(alphanumeric.replaceAll("[aei][Fj]", "X"));

        System.out.println("harry".replaceAll("[Hh]arry", "Harry"));

        String newAlphanumeric = "abcDeeeF12Ghhiiiijkl99z";
        System.out.println(newAlphanumeric.replaceAll("[^ej]", "X"));// replacing all except 'ej'..[^] here the carrot class is a character class and would match any occurrences that are not e and j
        System.out.println(newAlphanumeric.replaceAll("[abcdef345678]", "X")); // replacing abcdef345678 with an X
        System.out.println(newAlphanumeric.replaceAll("[a-fA-F3-8]", "X")); // the dash character is specifying a range
        System.out.println(newAlphanumeric.replaceAll("(?i)[a-f3-8]", "X")); // (?i) is a special construct for case insensitivity
        System.out.println(newAlphanumeric.replaceAll("[0-9]", "X")); // replace all the digits in a string with an X
        System.out.println(newAlphanumeric.replaceAll("\\d", "X")); // replace all the digits in a string with an X
        System.out.println(newAlphanumeric.replaceAll("\\D", "X")); // replace all the non-digits in a string with an X

        String hasWhitespace = "I have blanks and\ta tab, and also a newline\n";
        System.out.println(hasWhitespace);
        System.out.println(hasWhitespace.replaceAll("\\s", ""));// replaces all whitespace
        System.out.println(hasWhitespace.replaceAll("\t", "X"));// replaces the tab character
        System.out.println(hasWhitespace.replaceAll("\\S", ""));// replaces the non-white space characters
        System.out.println(newAlphanumeric.replaceAll("\\w", "X")); //the //w matches a-z upper and lower case and 0-9 and _
        System.out.println(hasWhitespace.replaceAll("\\w", "X"));
        System.out.println(hasWhitespace.replaceAll("\\b", "X"));// the \\b matches word boundaries



    }
}









