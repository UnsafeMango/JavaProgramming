package com.company;

public class Main {

    public static void main(String[] args) {
        String string = "I am a string. Yes, I am.";
        System.out.println(string);
        String yourString = string.replaceAll("I", "You");
        System.out.println(yourString);

        String alphanumeric = "abcDeeeF12Ghhiiiijkl99z"; // . is a character class that matches every character..its basically a wild card for every character
        System.out.println(alphanumeric.replaceAll(".","Y"));

        System.out.println(alphanumeric.replaceAll("^abcDeee", "YYY"));// carrot boundary matcher

        String secondString = "abcDeeeF12GhhabcDeeeiiiijkl99z";
        System.out.println(secondString.replaceAll("^abcDeee", "YYY"));

        System.out.println(alphanumeric.matches("^hello")); // the .matches method expects a regex as the parameter and returns true if the string matches and false otherwise
        System.out.println(alphanumeric.matches("^abcDeee"));
        System.out.println(alphanumeric.matches("abcDeeeF12Ghhiiiijkl99z"));

        System.out.println(alphanumeric.replaceAll("ijkl99z$", "THE END"));// $ is the boundary matcher for the end of a string
        System.out.println(alphanumeric.replaceAll("[aei]", "X")); // replace the occurrences of a set of letters
        System.out.println(alphanumeric.replaceAll("[aei]", "I replaced a letter here"));
        System.out.println(alphanumeric.replaceAll("[aei][Fj]", "X")); // replace 'aei' if they are followed by 'Fj'




    }
}
