package com.assignmentTHREE;

import java.util.Date;

public class Textbook extends Item {
    private String author;

    // Constructor
    public Textbook(String id, String title, Date addedOn, String author) {
        super(id, title, addedOn);
        this.author = author;
    }

    public Textbook(String id, String title, String author) {
        super(id, title);
        this.author = author;
    }


    // getter
    public String getCreator() {
        return author;
    }



}
