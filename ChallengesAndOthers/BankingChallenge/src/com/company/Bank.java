package com.company;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String name) {
        if (findBranch(name) == null) {
            Branch branch = new Branch(name);
            this.branches.add(branch);
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.newCustomer(customerName, initialTransaction);
        } else {
            Branch newBranch = new Branch(branchName);
            newBranch.newCustomer(customerName,initialTransaction);
            this.branches.add(newBranch);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addCustomerTransaction(customerName, transaction);
        }
        return false;
    }

    private Branch findBranch(String name) {
        for (Branch branch : this.branches) {
            String searchName = branch.getName();
            if (name.equals(searchName)) {
                return branch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean printTransactions) {
        Branch branch = findBranch(branchName);
        if(branch == null){
            return false;
        }
        ArrayList<Customer> customers = branch.getCustomers();
        if(customers.size() == 0) {
            return false;
        }
        System.out.println("Customer details for branch " + branch.getName());
        for(Customer customer : customers) {
            System.out.println("Customer: " + customer.getName() + "[" + (customers.indexOf(customer)+1) + "]");
            if(!(printTransactions)) {
                continue;
            }
            System.out.println("Transactions");
            ArrayList<Double> transactions = customer.getTransactions();
            for (Double transaction : transactions) {
                String toString = String.format("%,.2f", transaction);
                System.out.println("[" + (transactions.indexOf(transaction)+1) + "]  Amount " + toString);
            }
        }
        return true;
    }
}