package com.company;

public class Main {

    public static void main(String[] args) {
        Car porsche = new Car(); // created an object car based on the class Car
        Car holden= new Car();
        porsche.setModel("911");
        System.out.println("model is " + porsche.getModel());
    }
}
