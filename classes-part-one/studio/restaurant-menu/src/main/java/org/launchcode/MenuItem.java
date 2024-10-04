package org.launchcode;

import java.util.Date;

public class MenuItem {

    private String item;
    private double price;
    private String category;
    private Date dateAdded;

    public MenuItem(String item, double price, String category, Date dateAdded) {
        this.item = item;
        this.price = price;
        this.category = category;
        this.dateAdded = dateAdded;
    }

    public String getItem() {
        return item;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public Date getDateAdded() {
        return dateAdded;
    }
}
