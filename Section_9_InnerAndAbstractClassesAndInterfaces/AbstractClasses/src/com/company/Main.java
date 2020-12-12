package com.company;

/**
 * Abstraction is when you define the required functionality for something without actually
 * implementing the details.
 *
 * Interfaces are purely abstract.. the implementation is left to the class that implements the
 * interface hence the word 'implements' when implementing an interface
 *
 * Abstract classes are classes that define methods but do not provide an implementation for those methods,
 * the implementation is left for the classes that inherit from the abstract class..it is different from
 * inheriting from an interface
 *
 * Abstract classes cannot be instantiated
 */
public class Main {


    public static void main(String[] args) {
        Dog dog = new Dog("Yorkie");
        dog.eat();
        dog.breathe();

        Parrot parrot = new Parrot("Australian Ringneck");
        parrot.eat();
        parrot.breathe();
        parrot.fly();

        Penguin penguin = new Penguin("Emperor");
        penguin.fly();




    }
}
