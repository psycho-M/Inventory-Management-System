package com.projects.inventoryms.drivers;

import com.projects.inventoryms.*;

import java.util.Date;

public class InventoryDriver {
    public static void main(String[] args) {
        Item[] myInventory = new Item[50];
        myInventory[0] = new Book("Percy Jackson and the Olympians: The Lightening Thief", 249, 5, "Rick Riordan", "Disney", "YA fantasy");
        myInventory[1] = new Book("Percy Jackson and the Olympians: The Sea of Monsters", 249, 5, "Rick Riordan", "Disney", "YA fantasy");
        myInventory[2] = new Book("Percy Jackson and the Olympians: The Titan's Curse", 249, 5, "Rick Riordan", "Disney", "YA fantasy");
        myInventory[3] = new Book("Percy Jackson and the Olympians: The Battle of Labyrinth", 249, 5, "Rick Riordan", "Disney", "YA fantasy");
        myInventory[4] = new Book("Percy Jackson and the Olympians: The Last Olympian", 249, 5, "Rick Riordan", "Disney", "YA fantasy");
        myInventory[5] = new CD("1989", 1000, 5, new Artist("Taylor Swift"), new Date("10/27/2014"));
        myInventory[6] = new CD("Reputation", 1000, 5, new Artist("Taylor Swift"), new Date("11/10/2017"));
        myInventory[7] = new CD("Lover", 1000, 5, new Artist("Taylor Swift"), new Date("08/23/2014"));
        String[] performers = {"Taylor Swift", "Calvin Harris", "Antoff"};
        myInventory[8] = new ClassicalCD("Taylor Swift", 2000, 5, "Taylor Swift", "Big Machine records - USA", performers, new Date("10/24/2006"));
        myInventory[9] = new ClassicalCD("Fearless", 2000, 5, "Taylor Swift", "Big Machine records - USA", performers, new Date("11/11/2008"));

        Inventory.produceReport(myInventory);
    }
}
