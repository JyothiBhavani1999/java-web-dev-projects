package org.launchcode;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        MenuItem item1 = new MenuItem("Naan", 12.0, "Appetizer", new Date());
        MenuItem item2 = new MenuItem("Biryani", 18.0, "Main Course", new Date());
        MenuItem item3 = new MenuItem("Rasamalai", 10.0, "Dessert", new Date());

        Menu menu = new Menu();
        menu.addMenuItem(item1);
        menu.addMenuItem(item2);
        menu.addMenuItem(item3);

        for (MenuItem item : menu.getMenuItems()) {
            System.out.println("Name: " + item.getItem());
            System.out.println("Price: $" + item.getPrice());
            System.out.println("Category: " + item.getCategory());
            System.out.println("Date Added: " + item.getDateAdded());
            System.out.println();
        }

        System.out.println("Menu last updated:" + menu.getLastUpdated());
    }
}
