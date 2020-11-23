package com.company;

// the purpose of this program is to help a company manage their process of selling burgers
// our application will help bill to select types of burgers, some of the additional items tobe added to
// the burgers and pricing.
// We want to create a base hamburger but also two other types of hamburgers that are popular in Bill's Store
// The basic hamburger should have the following items.
// bread roll type, meat and up to 4 additional additions (things like lettuce, tomato, carrot, etc) that the
// customer can select to be added to the hamburger. Each of these items gets charged an additional price
// so you need some ay to track how many items got added and to calculate the price (for the base burger and
// all the additions)
// This burger has a base price and the additions are all separately priced
// Create a hamburger class to deal with all the above
// The constructor should only include the roll type, name, meat and price
// Also create two extra varieties of burgers (classes) to cater for
// a) Healthy Burger (on a brown rye bread roll), plus two additional items can be added.
// The healthy burger can have a total of 6 items (Additions) in total
// hint: you probably want to process the 2 additional items in this class and not the base class,
// since 2 additions are only appropriate for this new class
// b) Deluxe Burger -comes with chips and drinks as additions, but no extra additions are allowed,
// hint: you have to find a way to automatically add these new additions at the time hte deluxe burger object
// is created, and then prevent other additions from being made.
// All 3 classes should have a method that can be called anytime to show the base price of the hamburger
// plus all additional items, each showing the addition name nad the addition price and a grand total
// for the price of the burger
// for the two additional classes, this may require you to be looking at the base class for pricing
// and then adding totals onto that.


public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.13);
        System.out.println("Total burger price is " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHamburgerAddition1("Egg", 5.68);
        healthyBurger.addHealthyAddition1("Egg", 5.68);
        System.out.println("The total healthy burger price is " + healthyBurger.itemizeHamburger());

        DeluxeBurger deluxeBurger =  new DeluxeBurger();
        deluxeBurger.addHamburgerAddition3("koko", 5.89);
        deluxeBurger.addHamburgerAddition2("koko", 5.89);
        System.out.println("The total price for a deluxe burger is " + deluxeBurger.itemizeHamburger());
    }
}
















