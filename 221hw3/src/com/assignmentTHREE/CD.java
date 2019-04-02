package com.assignmentTHREE;

import java.util.Date;

public class CD extends MultiMediaItem {

    private String artist;
    // Constructor
    public CD(String id, String title, Date addedOn, int playingTime, String artist) {
        super(id, title, addedOn, playingTime);
        this.artist = artist;
    }

    public CD(String id, String title, int playingTime, String artist) {
        super(id, title, playingTime);
        this.artist = artist;
    }


    // getter
    public String getCreator() {
        return artist;
    }

}