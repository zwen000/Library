package com.assignmentTHREE;

import java.util.Date;

public class Video extends MultiMediaItem {
    private String director;

    // Constructor
    public Video(String id, String title, Date addedOn, int playingTime, String director) {
        super(id, title, addedOn, playingTime);
        this.director = director;
    }

    public Video(String id, String title, int playingTime, String director) {
        super(id, title, playingTime);
        this.director = director;
    }

    // getter
    public String getCreator() {
        return director;
    }

//    @Override
//    public int compareTo(Item o) {
//        return super.compareTo(o);
//    }
}
