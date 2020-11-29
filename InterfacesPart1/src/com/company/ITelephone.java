package com.company;

// Interface to define the behaviour of a telephone

public interface ITelephone {
     void powerOn(); // we are just defining the methods that form the interface
     void dial(int phoneNumber);
     void answer();
     boolean callPhone( int phoneNumber);
     boolean isRinging();
    // any class that implements this interface will implement these methods
}
