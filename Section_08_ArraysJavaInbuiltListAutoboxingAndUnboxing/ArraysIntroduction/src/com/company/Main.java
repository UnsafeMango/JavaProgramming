package com.company;

import java.util.Scanner;

public class Main {

//    Accept some input, sum up the numbers and then find the average

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        for (int i =0; i< myIntegers.length; i++) {
            System.out.println("Element " + i + " , value is " + myIntegers[i]);


        }System.out.println("The average value is " + getAverage(myIntegers));
    }
    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number+ " integer values.\r");
        int[] values = new int[number];
        for (int i=0; i< values.length; i++) {
            values[i] = scanner.nextInt(); // scanner.nextInt automatically accepts an integer from the console and that then returns an integer and its gonna be stored in the array
        } return values;
    }
    public static double getAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i< array.length; i++){
            sum += array[i];
        }
        return (double) sum / (double)array.length;
    }



//    public static void main(String[] args) {
//        int[] myIntArray = {1,2,3,4,5,6,7,8,9,10}; //assigning ten elements
//        myIntArray[5] = 50; // saving it at element 6
//        double[] myDoubleArray = new double[10]; //assigning ten elements
//        System.out.println(myIntArray[5]); // retrieving the value of your array

//        int[] myIntArray = new int[20];
//        for (int i =0;  i< myIntArray.length; i++) {
//            myIntArray[i] = i*10;
//        }
//        printArray(myIntArray);

//    }

//    public static void printArray(int[] array) {
//        for (int i = 0; i< array.length; i++) {
//            System.out.println("Element " + i + " , value is " + array[i]);
//        }
//    }
}
