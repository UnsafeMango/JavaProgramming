package com.company;

// READ BULK OPERATIONS
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
        Set<Integer> squares = new HashSet<>();
        Set<Integer> cubes = new HashSet<>();

        for (int i = 1; i <= 100; i++) {
            squares.add(i*i);
            cubes.add(i*i*i);
        }

        System.out.println("There are " + squares.size() + " squares and " + cubes.size() + " cubes");
        Set<Integer> union = new HashSet<>(squares);
        union.addAll(cubes);//union of a set
        System.out.println("Union contains " + union.size() + " elements");

        Set<Integer> intersection = new HashSet<>(squares);
        intersection.retainAll(cubes);//intersection of a set
        System.out.println("Intersection contains " + intersection.size() + " elements");

        for (int i : intersection) {
            System.out.println(i + " is a square of " + Math.sqrt(i) + " and a cube of " + Math.cbrt(i));
        }

        Set<String> words = new HashSet<>();
        String sentence = "one day in the year of the fox";
        String[] arrayWords = sentence.split(" ");
        words.addAll(Arrays.asList(arrayWords)); //what does Arrays.asList() do?
        for (String s: words) {
            System.out.println(s);
        }

        Set<String> nature = new HashSet<>();
        Set<String> divine = new HashSet<>();
        String[] natureWords = {"all", "nature", "is", "but", "art", "unknown", "to", "thee"};
        nature.addAll(Arrays.asList(natureWords));

        String[] divineWords = {"to", "err", "is", "human", "to", "forgive", "divine"};
        divine.addAll(Arrays.asList(divineWords));

        System.out.println("nature - divine: ");
        Set<String> diff1 = new HashSet<>(nature);
        diff1.removeAll(divine); //this is the asymmetric difference..symmetric is (union - intersection)
        printSet(diff1);

        System.out.println("\ndivine - nature: ");
        Set<String> diff2 =  new HashSet<>(divine);
        diff2.removeAll(nature);
        printSet(diff2);

        Set<String> unionTest = new HashSet<>(nature);
        unionTest.addAll(divine);

        Set<String> intersectionTest = new HashSet<>(nature);
        intersectionTest.retainAll(divine);

        System.out.println("\nSymmetric difference");
        unionTest.removeAll(intersectionTest);

        printSet(unionTest);

        if (nature.containsAll(divine)) { // used to test if one set is a superset of another..returns a true or false
            System.out.println("\ndivine is a subset of nature");
        }
        if (nature.containsAll(intersectionTest)) {
            System.out.println("\nintersectionTest is a subset of nature");
        }
        if (divine.containsAll(intersectionTest)) {
            System.out.println("\nintersectionTest is a subset of divine");
        }

    }
    private static void printSet(Set<String> set) {
        System.out.print("\t");
        for (String s: set) {
            System.out.print(s + " ");
        }
    }














}
