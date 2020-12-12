package com.company;

public class Contacts {
    private String name;
    private String PhoneNumber;

    public Contacts(String name, String phoneNumber) {
        this.name = name;
        PhoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public static Contacts createContacts(String name, String phoneNumber) {
        return new Contacts(name, phoneNumber); //calling the constructor to create a new contact record
    }
}
