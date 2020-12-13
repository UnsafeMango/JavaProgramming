package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Integer integer = new Integer(54); //Integer here is a class
        Double newDouble = new Double(12.25);// so is the Double

        //this is how you make an Integer class ArrayList
        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
        for (int i =0; i<=10; i++) {
            integerArrayList.add(Integer.valueOf(i)); //AUTOBOXING!!!
            //.valueOf coverts the value of i to the Integer class..it converts int to Integer
        }
        for (int i =0; i<=10; i++) {
//            System.out.println(i + " --> " + integerArrayList.get(i).intValue()); //UNBOXING
            //.intValue converts it back from the Integer class to an int
        }

        //SHORTCUT
        Integer myIntValue = 56; //gets converted to this at compile time: Integer.valueOf(56)
        int myInt = myIntValue; // myInt.intValue() gets put in automatically at compile time

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for (double dbl = 0.0; dbl<=10.0; dbl+= 0.5) {
            myDoubleValues.add(dbl); //autoboxing will occur at compile time -- Integer.valueOf(i)
        }
        for (int i = 0; i<myDoubleValues.size(); i++){
            double value = myDoubleValues.get(i); //unboxing will occur at compile time -- .intValue()
            System.out.println(i + " --> " + value);
        }
    }









}
