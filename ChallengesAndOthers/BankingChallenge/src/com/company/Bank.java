package com.company;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String bankName) {
        this.name = bankName;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName) {

        Branch newBranch = this.findBranch(branchName);
        if (newBranch == null) {
            this.branches.add(new Branch(branchName));
            return true;
        } else {
//            System.out.println("The branch " + branchName
//                    + " already exists, and so the new bank branch has not been added.");
            return false;
        }
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
        Branch branch = this.findBranch(branchName);
        if(branch == null) {
            return false;
        } else {
            return branch.newCustomer(customerName, initialTransaction);
        }
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        Branch branch = this.findBranch(branchName);
        if(branch == null) {
            return false;
        } else {
            return branch.addCustomerTransaction(customerName, transaction);
        }
    }

    public boolean listCustomers(String branchName, boolean printTransactions){
        Branch branch = this.findBranch(branchName);
        if(branch == null) {
            return false;
        } else {
            System.out.println("Customer details for branch " + branch.getName());
            branch.listCustomers(printTransactions);
            return true;
        }
    }

    private Branch findBranch(String branchName) {
        for (int i = 0; i < this.branches.size(); i++) {
            Branch checkedBranch = this.branches.get(i);
            if (checkedBranch.getName().equals(branchName)) {
                return checkedBranch;
            }
        }
        return null;
    }
}
