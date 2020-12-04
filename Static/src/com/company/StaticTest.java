package com.company;

public class StaticTest {
    private static int numInstances = 0;
    // static makes it the class to share the instance of 'numInstances' making the increment to actually happen
    private String name;

    public StaticTest(String name) {
        this.name = name;
        numInstances++;
    }

    public static int getNumInstances() {
        return numInstances;
    }

    public String getName() {
        return name;
    }
}
