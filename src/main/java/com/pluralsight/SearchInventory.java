package com.pluralsight;

import java.util.ArrayList;

// Starter for Search Inventory (Workbook 3a, Section 3-2 Using an ArrayList, Exercise 1).
// main is done: it asks getInventory() for the list and prints every product.
// Your job is getInventory(): fill the list with at least 5 products.
public class SearchInventory {
    public static void main(String[] args) {
        ArrayList<Product> inventory = getInventory();

        for (Product product : inventory) {
            System.out.println(product);
        }

    }

    public static ArrayList<Product> getInventory() {
        ArrayList<Product> inventory = new ArrayList<>();

        inventory.add(new Product(87, "Spaghetti squash", 3.75 ));
        inventory.add(new Product(21, "Family meal kit", 15.49 ));
        inventory.add(new Product(402, "Smoked sausage", 3.99 ));
        inventory.add(new Product(19, "Chili oil", 6.49 ));
        inventory.add(new Product(78, "Butternut squash", 10.29 ));

        return inventory;
    }
}
