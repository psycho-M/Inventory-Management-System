package com.projects.inventoryms;

import java.util.Date;

public class ClassicalCD extends Item {

    /***
     *
     * @param title
     * @param price
     * @param quantity
     * @param composer
     * @param recordingLocation
     * @param performers
     * @param releaseDate
     */
    public ClassicalCD(String title, double price, int quantity, String composer, String recordingLocation, String[] performers, Date releaseDate) {
        super(title, price, quantity);
        setComposer(composer);
        setRecordingLocation(recordingLocation);
        for(int i = 0; i < Math.min(this.performers.length, performers.length); i++) {
            addPerformer(performers[i]);
        }
        setReleaseDate(releaseDate);
    }

    public String getComposer() {
        return composer;
    }

    public void setComposer(String composer) {
        this.composer = composer;
    }

    public String getRecordingLocation() {
        return recordingLocation;
    }

    public void setRecordingLocation(String recordingLocation) {
        this.recordingLocation = recordingLocation;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    private String composer, recordingLocation;
    private String[] performers = new String[5];
    private Date releaseDate;
    private int performerCount = 0;

    void addPerformer(String name) {
        if(performerCount == performers.length) {
            System.out.println("No more room left!");
        } else {
            performers[performerCount] = name;
            performerCount++;
        }
    }

    void showPerformers() {
        for(int i = 0; i < performerCount; i++) {
            System.out.println(performers[i]);
        }
    }


}
