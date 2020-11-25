package com.company;

import java.util.ArrayList;
// ArrayList is actually a class
public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {
        groceryList.add(item); //automatically adds the item to the array list
    }

    public void printGroceryList() {
        //.size() tells you the number of items in your array
        System.out.println("You have "+ groceryList.size() + " items in your grocery list");
        for (int i = 0; i< groceryList.size(); i++) {
            System.out.println((i + 1) + ". " +groceryList.get(i));//.get to access the grocery list
        }
    }

    public  void modifyGroceryItem(String currentItem, String newItem) {
        int position = findItem(currentItem);
        if (position >= 0) {
            modifyGroceryItem(position, newItem);
        }
    }

    private void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("GroceryItem " + (position+1) + " has been modified");
    }

    public void removeGroceryItem(String item) {
        int position = findItem(item);
        if (position >= 0) {
            removeGroceryItem(position);
        }
    }

    private void removeGroceryItem(int position) {
        groceryList.remove(position);
    }

    public int findItem(String searchItem) {
//        boolean exists = groceryList.contains(searchItem); // .contains checks the list and returns true if
        // search item is found

        return groceryList.indexOf(searchItem); // finds the item and returns the index of the element
        // returns -1 if item is not found

//        if (position >= 0) {
//            return groceryList.get(position);
//        }
//        return null;
    }
}























