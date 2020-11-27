package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    Customer customer = new Customer("Tim", 54.96);
	    Customer anotherCustomer;
	    anotherCustomer = customer;
	    anotherCustomer.setBalance(12.10);
        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());


		ArrayList<Integer> intList = new ArrayList<Integer>();

		intList.add(1); //.add to add elements in an ArrayList
		intList.add(3);
		intList.add(4);

		for (int i = 0; i < intList.size(); i++) {
			System.out.println(i + ": " + intList.get(i));
		}

		intList.add(1, 2); //adding the element 2 to the index position 1
		for (int i = 0; i < intList.size(); i++) {
			System.out.println(i + ": " + intList.get(i));
		}

		// LinkedList is an alternative for an array..each element in the list holds the link the the item that
		// follows it as well as the actual value you want to store as well.
    }
}
