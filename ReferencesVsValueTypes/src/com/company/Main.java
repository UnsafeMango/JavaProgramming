package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //Value Types
        int myIntValue = 10;
        int myOtherIntValue = myIntValue;

        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyOtherIntValue = " + myOtherIntValue);

        myOtherIntValue++;
        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyOtherIntValue = " + myOtherIntValue);

        //Arrays are reference types..reference types represent the address of the variable rather than the data itself
        int[] myIntArray = new int[5];
        int [] anotherArray = myIntArray; // 2 references to the same array(new int[5]) in memory now

        System.out.println("MyIntArray = " + Arrays.toString(myIntArray)); //print out the contents of an entire array
        System.out.println("AnotherArray = " + Arrays.toString(anotherArray));

        anotherArray[0] = 1;
        System.out.println("AFTER CHANGE MyIntArray = " + Arrays.toString(myIntArray)); //print out the contents of an entire array
        System.out.println("AFTER CHANGE AnotherArray = " + Arrays.toString(anotherArray));

        anotherArray = new int[] {4, 5, 6, 7, 8}; //new keyword here de-referenced anotherArray and gave a new array to reference from
        modifyArray(myIntArray);
        System.out.println("AFTER modify MyIntArray = " + Arrays.toString(myIntArray)); //print out the contents of an entire array
        System.out.println("AFTER modify AnotherArray = " + Arrays.toString(anotherArray));
    }

    private static void modifyArray(int[] array) {
        array[0] = 2;
        array = new int[] {1,2,3,4,5}; //initializing the new int
    }
}
