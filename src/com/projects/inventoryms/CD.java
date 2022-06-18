package com.projects.inventoryms;

import java.util.Date;

public class CD extends Item{

    /***
     *
     * @param title
     * @param price
     * @param quantity
     * @param artist
     * @param releaseDate
     */
    public CD(String title, double price, int quantity, Artist artist, Date releaseDate) {
        super(title, price, quantity);
        this.artist = artist;
        this.releaseDate = releaseDate;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    private Artist artist;
    private Date releaseDate;

}
