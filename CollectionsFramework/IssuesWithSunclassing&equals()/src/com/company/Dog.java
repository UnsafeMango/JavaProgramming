package com.company;

public class Dog {
    private final String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) { // test if the object is being compared to itself
            return true;
        }
        if (obj instanceof Dog) { //is it the Dog class?
            String objName = ((Dog)obj).getName(); // casting the object to the Dog
            return this.name.equals(objName);
        }
        return false;
    }
}
