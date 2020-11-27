package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>(); //creating a LinkedList
        addInOrder("Sydney", placesToVisit);
        addInOrder("Melbourne", placesToVisit);
        addInOrder("Brisbane", placesToVisit);
        addInOrder("Perth", placesToVisit);
        addInOrder("Canberra", placesToVisit);
        addInOrder("Adelaide", placesToVisit);
        addInOrder("Darwin", placesToVisit);
        printList(placesToVisit);

        addInOrder("Alice Springs", placesToVisit);
        addInOrder("Darwin", placesToVisit);
        printList(placesToVisit);

        visit(placesToVisit);
//        placesToVisit.add("Sydney"); //adding is similar to an ArrayList
//        placesToVisit.add("Melbourne");
//        placesToVisit.add("Brisbane");
//        placesToVisit.add("Perth");
//        placesToVisit.add("Canberra");
//        placesToVisit.add("Adelaide");
//        placesToVisit.add("Darwin");

//        printList(placesToVisit);
//
//        placesToVisit.add(1, "Alice Springs"); //now sydney is linked to aliceSprings
//        // and aliceSprings is linked to melbourne
//        printList(placesToVisit);
//
//        placesToVisit.remove(4);
//        printList(placesToVisit);
    }
    private  static void printList(LinkedList<String> linkedList) {
        // using an Iterator which is another way of going through all entries in an array,
        // ArrayList or LinkedList
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()) {
            System.out.println("Now visiting "+ i.next()); //.next() gives the current record and then
            // moves on to the next record
        }
        System.out.println("===========================");
    }

    // making the LinkedList to be in alphabetical order
    private static boolean addInOrder(String newCity, LinkedList<String> linkedList) {
        // ListIterator gives you more features than the iterator like going back to a previous element on the list
        // as seen on line 54
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while (stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity); // returns a number..if its 0 it means
            // that stringListIterator.next() variable is equal to the newCity variable
            if (comparison == 0) {
                // equal, do not add
                System.out.println(newCity + " is already included as a destination");
                return false;
            } else if (comparison > 0) {
                // newCity should appear before this one
                // if we are looking at Brisbane --> and Adelaide was passed as newCity
                // then comparison will pass a number greater than 0
                stringListIterator.previous(); // we go back to the previous element because on line 44
                // we have already moved to the next element using .next
                stringListIterator.add(newCity);
                return true;
            } else if (comparison < 0) {
                //move on to next city
            }
        }
        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();
        //************************************************************************
        //**** .getFirst way to retrieve the very first entry in a LinkedList ****
        //************************************************************************
        if (cities.isEmpty()) { // to check if the List is empty
            System.out.println("No cities in the itenerary");
            return;
        } else{
            System.out.println("Now visiting " + listIterator.next()); //moving to the first entry with .next which
            // then moves to the next element in the List
            printMenu();
        }

        while (!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Holiday (Vacation) over");
                    quit = true;
                    break;
                case 1:
                    if (!goingForward) {
                        //if we were not going forward we change direction using the code below to go point forward
                        if (listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now visiting " + listIterator.next());
                    }else{
                        System.out.println("Reached the end of the list");
                        goingForward = false; // from here we are going backwards
                    }
                    break;
                case 2:
                    if (goingForward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now visiting " + listIterator.previous());
                    } else{
                        System.out.println("We are at the start of the index");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available actions: \npress ");
        System.out.println("0 - to quit\n" +
                "1 - go to next city\n" +
                "2 - go to previous city\n" +
                "3 - print menu options\n");
    }












}
