package com.company;

import java.util.ArrayList;

public class Customer {

    private String name;
    private ArrayList<Double> transactions = new ArrayList<Double>();

    public Customer(String customerName, double initialDeposit) {
        this.name = customerName;
        this.transactions = new ArrayList<Double>(); // To initialize the array list.
        addTransaction(initialDeposit);
    }

    public void addTransaction(double amount) {
        transactions.add(amount);
//        System.out.println("Amount " + amount + " has been added to the account.");  //TEMP
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void listTransactions() {
        if (this.transactions.size() > 0) {
            System.out.println("Transactions");
            for (int i = 0; i < transactions.size(); i++) {
                System.out.println("[" + (i + 1) + "]  Amount " + transactions.get(i));
            }
        } else {
//            System.out.println("There are currently no transactions for this customer.");
        }
    }
}
