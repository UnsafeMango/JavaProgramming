package com.company;

public class ExtendedPassword extends Password{
    private int decryptedPassword;

    public ExtendedPassword(int password) {
        super(password);
        this.decryptedPassword = password;
    }

//    @Override
//    public void storePassword() { //cannot override a final method
//        System.out.println("Saving password as " + this.decryptedPassword);
//    }
}
