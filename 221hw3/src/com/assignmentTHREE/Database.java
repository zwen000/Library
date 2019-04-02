package com.assignmentTHREE;

import java.util.ArrayList;

public class Database {
    private ArrayList<Item> item;

    // Constructor
    public Database() {
        this.item = new ArrayList<Item>();
    }

    public ArrayList<Item> getItem() {
        return item;
    }

    void addItem(Item i){
        this.item.add(i);
    }



    void list(){
        if(item.isEmpty()){
            System.out.println("The database is Empty.");
            return;
        }
        System.out.println("---------title, addedOn, creator---------------------");
        for(int i =0;i< item.size(); i++){
            Item temp = item.get(i);
            System.out.printf( "         "+ temp.getTitle() + ", " + temp.getAddedOn() +  ", " + temp.getCreator()+ "          \n");
        }
        System.out.println("-------------------------------------------------------");
    }

}
