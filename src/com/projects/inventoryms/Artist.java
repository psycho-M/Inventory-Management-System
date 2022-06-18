package com.projects.inventoryms;

public class Artist {
    /***]
     *
     * @param name
     */
    public Artist(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    private String[] memberNames, memberInstruments;
}
