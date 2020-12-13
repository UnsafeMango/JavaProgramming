package com.company;

import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customers = new ArrayList<Customer>();

    public Branch(String branchName) {
        this.name = branchName;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {  // MAY NOT NEED
        return customers;
    }

    public boolean newCustomer(String customerName, double firstDeposite) {

        Customer foundCustomer = findCustomer(customerName);
        if (foundCustomer == null) {
            this.customers.add(new Customer(customerName, firstDeposite));
            return true;
        } else {
//            System.out.println("The customer " + customerName
//                    + " already exists, and so the new customer has not been added.");
            return false;
        }
    }

    public boolean addCustomerTransaction(String customerName, double transaction) {

        Customer foundCustomer = findCustomer(customerName);
        if (foundCustomer == null) {
//            System.out.println("The customer " + customerName
//                    + " was not found in this branch.");
            return false;
        } else {
            foundCustomer.addTransaction(transaction);
            return true;
        }
    }

    private Customer findCustomer(String customerName) {
        for(int i = 0; i < this.customers.size(); i++) {
            Customer foundCustomer = this.customers.get(i);
            if(foundCustomer.getName().equals(customerName)) {
                return foundCustomer;
            }
        }
        return null;
    }

    public void listCustomers(boolean listTransactions) {
        if (this.customers.size() > 0) {
            for (int i = 0; i < customers.size(); i++) {
                System.out.println("Customer: " + customers.get(i).getName() + "[" + (i + 1) + "]");
                if (listTransactions) {
                    customers.get(i).listTransactions();
                }
            }
        } else {
//            System.out.println("There are currently no customers for this branch.");
        }
    }
}