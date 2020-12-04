package com.company;

public class Password {
    private static final int key = 795616582;
    private final int encryptedPassword;

    public Password(int password) {
        this.encryptedPassword = encryptDecrypt(password);
    }

    private int encryptDecrypt(int password){
        return password ^ key;
    }

    public final void storePassword(){ //final methods cannot be overridden
        System.out.println("Saving password as " + this.encryptedPassword);
    }

    public boolean letMeIn(int password) {
        if (encryptDecrypt(password) == encryptedPassword) {
            System.out.println("Welcome");
            return true;
        } else {
            System.out.println("No you cannot come in");
            return false;
        }
    }
}
