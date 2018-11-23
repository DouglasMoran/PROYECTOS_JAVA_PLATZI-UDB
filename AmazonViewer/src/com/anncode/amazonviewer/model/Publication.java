
package com.anncode.amazonviewer.model;

import java.util.ArrayList;
import java.util.Date;

public class Publication {
    
    private String title;
    private Date editionDate;
    private String editorial;
    private ArrayList<Book> authors;

    public Publication(String title, Date editionDate, String editorial, ArrayList<Book> authors) {
        super();
        this.title = title;
        this.editionDate = editionDate;
        this.editorial = editorial;
        this.authors = authors;
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date geteditionDate() {
        return editionDate;
    }

    public void setDate(Date date) {
        this.editionDate = editionDate;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public ArrayList getAuthors() {
        return authors;
    }

    public void setAuthors(ArrayList authors) {
        this.authors = authors;
    }
     
}
