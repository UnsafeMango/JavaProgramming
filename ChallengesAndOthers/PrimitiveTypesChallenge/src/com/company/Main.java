package com.company;

public class Main {

    public static void main(String[] args) {
        //PRIMITIVE TYPES CHALLENGE
        byte newByteVariable = 10;

        short newShortVariable = 20;

        int newIntVariable = 50;

        long newLongVariable = 50000L + (10L *(newByteVariable + newShortVariable + newIntVariable));
        System.out.println(newLongVariable);

        short shortTotal = (short) (1000 + 10 * (newByteVariable + newShortVariable + newIntVariable));
    }
}
