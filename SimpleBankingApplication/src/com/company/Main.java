package com.company;
// Create a Simple Banking Application
// There should be a bank class
// It should have an array list of branches
// each branch should have an array list of customers
// The customer class should have an array list of transactions
// Customer: Name and array list of doubles
// Branch: Need to be able to add a new customer and initial transaction amount
// Also needs to add additional transactions for the customer/branch
// Bank: Add a new branch
// Add a customer to that branch with initial transactions
// Add a transaction for an existing customer for that branch
// Show a list of customers for a particular branch and optimally a list of their transactions
// Demonstrate autoboxing and unboxing in the code
// Hint: Transaction
// e.g check if it exist or does not exist

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("FIRST BANK");

        bank.addBranch("Lagos");

        bank.addCustomer("Lagos", "Yray", 200.02);
        bank.addCustomer("Lagos", "Mango", 420.22);
        bank.addCustomer("Lagos", "Percy", 600.02);

        bank.addBranch("Warri");
        bank.addCustomer("Warri", "Bob", 900.02);

        bank.addCustomerTransactions("Lagos", "Yray", 300.21);
        bank.addCustomerTransactions("Lagos", "Mango", 100.21);
        bank.addCustomerTransactions("Warri", "Bob", 50.21);

        bank.listCustomer("Lagos", true);

    }
}



















