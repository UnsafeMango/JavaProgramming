package com.company;

import java.util.ArrayList;
import java.util.Scanner;

/** Create a simple interface (name it ISaveable)
 * That interface allows an object to be saved to some sort of storage medium. (use arrayList)
 * The exact type of medium is not known to the interface (nor the classes that implement it).
 * The interface will just specify two methods, one to return an arraylist of values to be saved
 * and the other to populate object's fields from an ArrayList (parameter)
 *
 * Create a few sample classes that implement your Saveable interface (we've used the idea of a game,
 * with players and monsters, but you can create your own type of class that you want).
 *
 * Override the toString() method for each of your classes so that they can be easily printed to enable
 * the program to be tested easier.
 *
 * In Main, write a method that takes an object that implements the interface as a parameter and 'saves'
 * the values e.g calls the method defined in the interface.
 *
 * We haven't covered I/O yet, so your method should just print the values to the screen.
 * Also in the main class, write a method that restores the values to the Saveable object
 * e.g calls the method from the interface for population fields (see above)
 *
 * Again, we are not going to use Java file I/O; instead use the readValues() method below the
 * main method to simulate getting values from a file -  this allows you to type as many values as your class
 * requires, and returns an ArrayList.
 */

public class Main {

    public static void main(String[] args) {
        Player tim = new Player("Tim", 10, 15);
        System.out.println(tim.toString());
        saveObject(tim);

        tim.setHitPoints(8);
        System.out.println(tim);
        tim.setWeapon("Stormbringer");
        saveObject(tim);
        loadObject(tim);
        System.out.println(tim);
    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject(ISaveable objectToSave) {
        for(int i=0; i<objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }
    }

    public static void loadObject(ISaveable objectToLoad) {
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }
}
