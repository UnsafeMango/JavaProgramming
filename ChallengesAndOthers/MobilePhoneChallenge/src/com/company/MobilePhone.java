package com.company;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String phoneNumber) {
        this.myNumber = phoneNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {
        for(Contact c : myContacts) {
            if(c.getName().equals(contact.getName())) {
                return false;
            }
        }

        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        for(Contact c : myContacts) {
            if(c.getName().equals(oldContact.getName()) &&
                    !newContact.getName().equals(oldContact.getName())) {
                myContacts.add(myContacts.indexOf(c), newContact);
                myContacts.remove(c);
                return true;
            }
        }
        return false;
    }

    public boolean removeContact(Contact contact) {
        for(Contact c : myContacts) {
            if(c.getName().equals(contact.getName()))
                return myContacts.remove(c);
        }
        return false;
    }

    private int findContact(Contact contact) {
        for(Contact c : myContacts) {
            if(c.getName().equals(contact.getName()))
                return myContacts.indexOf(c);
        }
        return -1;
    }

    private int findContact(String name) {
        for(Contact c : myContacts) {
            if(c.getName().equals(name))
                return myContacts.indexOf(c);
        }
        return -1;
    }

    public Contact queryContact(String name) {
        for(Contact c : myContacts) {
            if(c.getName().equals(name))
                return c;
        }
        return null;
    }

    public void printContacts() {
        StringBuilder msg = new StringBuilder("Contact List:\n");
        int i = 1;
        for(Contact c : myContacts) {
            msg.append(String.format("%d. %s -> %s\n", i++, c.getName(), c.getPhoneNumber()));
        }
        System.out.println(msg.toString());
    }
}
