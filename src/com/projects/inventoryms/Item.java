package com.projects.inventoryms;

public class Item {
    private String title;
    private double price;
    private int quantity;

    /***
     *
     */
    public Item() {

    }

    /***
     * @param title
     * @param price
     * @param quantity
     */
    public Item(String title, double price, int quantity) {
        setTitle(title);
        setPrice(price);
        setQuantity(quantity);
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
