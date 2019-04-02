package com.assignmentTHREE;
import java.util.Date;
import java.util.Collections;
import java.util.Calendar;

public class Main {

    public static void main(String[] args) {

//        Calendar d = Calendar.getInstance();
//        System.out.println(d);
//        String a = "123";
//        String b = "456";
//        Date c = new Date();
//        System.out.println(a.compareTo(b));
//        System.out.println(b.compareTo(a));
//        System.out.println(c.compareTo(c));

        Date d = new Date();

        Calendar c =  Calendar.getInstance();
        c.set(2000,Calendar.AUGUST,10);
        Date d2 = (Date) c.getTime();
        c.set(1900,Calendar.MAY,20);
        Date d3 = (Date) c.getTime();
        c.set(1888,Calendar.MAY,20);
        Date d4 = (Date) c.getTime();

        Database library = new Database();
        library.addItem(new Textbook("TB01", "Book1", d2, "Author1" ));
        library.addItem(new Textbook("TB02", "Book2",  "Author2" ));
        library.addItem(new Video("VD01", "Video1", d3, 7000 ,"Drector1" ));
        library.addItem(new Video("VD02", "Video2", d, 700 ,"Drector2" ));
        library.addItem(new CD("CD01", "CD1", d2 ,321,"Artist1" ));
        library.addItem(new CD("CD11", "CD2", d4,233,"Artist1" ));

        //sortById (default)
        System.out.println("By ID");
        library.list();

        //sortByTilte
        System.out.println("By Title");
        Collections.sort( library.getItem(), Item.sortByTitle);
        library.list();

        //sortByCreator
        System.out.println("By Creator");
        Collections.sort( library.getItem(), Item.sortByCreator);
        library.list();

        //sortByAddedOn
        System.out.println("By AddedOn");
        Collections.sort( library.getItem(), Item.sortByAddedOn);
        library.list();
    }
}
