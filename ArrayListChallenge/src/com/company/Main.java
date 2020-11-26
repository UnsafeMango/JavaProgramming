package com.company;
// Create a program that implements a simple mobile phone with the following capabilities.
// Able to store, modify, remove and query contact names
// You will want to create a separate class for contacts(names and numbers)
// Create a masterclass (MobilePhone) that holds the ArrayList of contacts
// The MobilePhone class has the functionality listed above
// Add a menu of options that are available
// Options: Quit, print list of contacts, adda new contact, update existing contact, remove contact and
// Search/find contacts.
// When adding or updating be sure to check if the contact already exists (use name)
// Be sure to not expose the inner workings of the ArrayList to MobilePhone
// e.g no ints, no .get(i) etc
// MobilePhone should do everything with Contact objects only.


import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("090 7973 8042");

    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        printActions();
        while (!quit) {
            System.out.println("\nEnter action: (6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("\nShutting down");
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }
    }
    private static void addNewContact() {
        System.out.println("Enter new Contact Name");
        String name = scanner.nextLine();
        System.out.println("Enter phone number");
        String phone = scanner.nextLine();
        //referencing in a different way .. static is what helps here(check the contact class)
        Contacts newContacts = Contacts.createContacts(name, phone);
        if (mobilePhone.addNewContact(newContacts)) {
            System.out.println("New contact added: " + name + ", " + phone);
        } else {
            System.out.println("Can't add " + name + " already on file");
        }
    }

    private static void updateContact() {
        System.out.println("Enter existing contact name:");
        String name = scanner.nextLine();
        Contacts existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact phone number");
        String newNumber = scanner.nextLine();
        Contacts newContact = Contacts.createContacts(newName, newNumber);
        if (mobilePhone.updateContact(existingContactRecord,newContact)){
            System.out.println("Successfully Updated Record");
        } else {
            System.out.println("Error updating record");
        }
    }
    private static void removeContact() {
        System.out.println("Enter existing contact name:");
        String name = scanner.nextLine();
        Contacts existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }
        if (mobilePhone.removeContact(existingContactRecord)) {
            System.out.println("Successfully deleted");
        } else {
            System.out.println("Error deleting contact");
        }
    }

    private static void queryContact() {
        System.out.println("Enter existing contact name:");
        String name = scanner.nextLine();
        Contacts existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Name: " + existingContactRecord.getName() +
                " phone Number is " + existingContactRecord.getPhoneNumber());
    }
    private static void startPhone() {
        System.out.println("Starting Phone");
    }

    private static void printActions() {
        System.out.println("\n Available actions:\npress");
        System.out.println("0 - to shutdown\n" +
                "1 - to print contacts\n" +
                "2 - to add  a new contact\n" +
                "3 - to update an existing contact\n" +
                "4 - to remove an existing contact\n" +
                "5 - query uf an existing contact exists\n" +
                "6 - to print a list of available actions");
        System.out.println("Choose your action: ");
    }



















}
