
package com.anncode.amazonviewer.model;

import java.util.ArrayList;
import java.util.Date;

public class Magazine extends Publication{
    
 private   int id;

    public Magazine(String title, Date date, String editorial, ArrayList authors) {
        super(title, date, editorial, authors);
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return  "\n::MAGAZINE::" + 
                "\nTitle: " + getTitle() +
                "\nDate: " + geteditionDate() +
                "\nEditorial: " + getEditorial() +
                "\nAuthors: " + getAuthors(); //To change body of generated methods, choose Tools | Templates.
    }
    
    

}
