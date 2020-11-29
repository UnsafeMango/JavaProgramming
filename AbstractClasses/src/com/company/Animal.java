package com.company;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    // didn't implement the abstract methods..they would be implemented in other classes that extend the
    // abstract Animal class
    public abstract void eat();
    public abstract void breathe();

    public String getName() {
        return name;
    }
}
