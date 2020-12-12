package com.company;

interface Accessible { // package private

    int SOME_CONSTANT = 100; // public static final (all interface variables are so)

    public void methodA(); // public

    void methodB(); // public (all interface methods are public)

    boolean methodC(); // public (all interface methods are public)
}
