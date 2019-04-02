package com.assignmentTHREE;

import java.util.Date;

public abstract class MultiMediaItem extends Item{
    private int playingTime;

    // Constructor
    public MultiMediaItem(String id, String title, Date addedOn, int playingTime) {
        super(id, title, addedOn);
        this.playingTime = playingTime;
    }

    public MultiMediaItem(String id, String title, int playingTime) {
        super(id, title);
        this.playingTime = playingTime;
    }

    // getter
    public int getPlayingTime() {
        return playingTime;
    }
}
