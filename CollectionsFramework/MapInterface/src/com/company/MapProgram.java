package com.company;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {
        Map<String,String> languages = new HashMap<>();
        //Map<key, value(definition)>
        if (languages.containsKey("Java")) {
            System.out.println("Java already exists");
        } else {
            languages.put("Java", "a compiled high level, object-oriented, platform independent language");
            System.out.println("Java added successfully");
        }
//        languages.put("Java", "a compiled high level, object-oriented, platform independent language");
        //adding to the map
        languages.put("Python", "an interpreted, object-oriented, high level programming language with dynamic semantics");
        languages.put("Algol", "an algorithmic language");
        System.out.println(languages.put("BASIC", "Beginners All Purpose Symbolic Instruction Code"));
        System.out.println(languages.put("Lisp", "Therein lies madness"));

        if (languages.containsKey("Java")){ //prevents adding a key multiple times
            System.out.println("Java is already in the map");
        } else {
            languages.put("Java", "this course is about java");
        }
//        System.out.println(languages.get("Java")); //print out a map using the key
//        System.out.println(languages.put("Java", "this course is about java"));
//        System.out.println(languages.get("Java"));

        System.out.println("===========================================================================");
        //looping through the contents of the set of keys
        for (String key: languages.keySet()) {
            System.out.println(key + ": " + languages.get(key));
        }
    }
}
