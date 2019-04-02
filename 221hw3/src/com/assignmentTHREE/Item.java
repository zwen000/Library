package com.assignmentTHREE;
import java.util.Date;
import java.util.Comparator;

public abstract class Item implements Comparable<Item>{
    private String id;
    private String title;
    private Date AddedOn;

    // Constructor
    public Item(String id, String title, Date addedOn) {
        this.id = id;
        this.title = title;
        AddedOn = addedOn;
    }

    public Item(String id, String title) {
        this(id,title,new Date());
    }

    // getter
    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Date getAddedOn() {
        return AddedOn;
    }

    public abstract String getCreator();

    ///////////Override sorting orders////////////////////////////////////////////////////////////
    @Override
    public int compareTo(Item o) {
        return this.getId().compareTo(o.getId());
    }

//    @Override
//    public int compareTo(Item o) {
//        return this.getTitle().compareTo(o.getTitle());
//    }


//    @Override
//    public int compareTo(Item o) {
//        return this.getCreator().compareTo(o.getCreator() );
//    }


    @Override
    public String toString() {
        return "id: " + this.id + ", "+  "Title: " + this.title + ", "+  "AddedOn: "+ this.AddedOn;
    }

    public static Comparator<Item> sortByTitle = new Comparator<Item>(){
        @Override
        public int compare(Item i1, Item i2) {
            return i1.getTitle().compareTo(i2.getTitle());
        }
    };

    public static Comparator<Item> sortByCreator = new Comparator<Item>(){
        @Override
        public int compare(Item i1, Item i2) {
            return i1.getCreator().compareTo(i2.getCreator() );
        }
    };

    public static Comparator<Item> sortByAddedOn = new Comparator<Item>(){
        @Override
        public int compare(Item i1, Item i2) {
            return i1.getAddedOn().compareTo(i2.getAddedOn());
        }
    };



}
