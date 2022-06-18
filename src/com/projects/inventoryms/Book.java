package com.projects.inventoryms;

public class Book extends Item {

    public Book(String title, double price, int quantity, String author, String publisher, String category) {
        super(title, price, quantity);
        setAuthor(author);
        setCategory(category);
        setPublisher(publisher);
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getCategory() {
        return category;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    private String author, publisher, category;
}
