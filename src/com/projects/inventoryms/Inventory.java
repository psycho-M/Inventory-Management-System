package com.projects.inventoryms;

public class Inventory {
    public static void produceReport(Item[] items) {
        System.out.println("\t\tProduce Report");
//        System.out.println("\tTitle\tPrice\tQuantity");
        double totalValue = 0;
        int totalCount = 0, i = 0;
//        Formatter fmt = new Formatter();
//        fmt.format("%60s %15s %15s\n", "Title", "Price", "Quantity");
        System.out.printf("%-70s%-15s%-7s\n", "Title", "Price", "Quantity");
        while(items[i] != null) {
//            System.out.println("\t" + items[i].getTitle() + "\t" + items[i].getPrice() + "\t" + items[i].getQuantity());
//            fmt.format("%60s %15s %15s\n", items[i].getTitle(), items[i].getPrice(), items[i].getQuantity());
            System.out.printf("%-70s%10.2f%5d\n", items[i].getTitle(), items[i].getPrice(), items[i].getQuantity());
            totalValue += items[i].getPrice() * items[i].getQuantity();
            totalCount += items[i].getQuantity();
            i++;
        }
//        System.out.println(fmt);
//        System.out.println("\nTotal item count: " + items.length);
//        System.out.println("\nTotal items value: " + totalValue);
        System.out.printf("%-70s%10.2f%5d\n", "", totalValue, totalCount);
    }
}
