
package com.anncode.amazonviewer.model;

import java.util.ArrayList;
import java.util.Date;

public class Book extends Publication implements IVisualizable{
    
  private  int id;
  private  String isbn;
  private  boolean readed;
  private  int timeReaded;
  
  /* private String title;
    private Date editionDate;
    private String editorial;
    private String[] authors;*/

    public Book(String title, Date editionDate, String editorial, ArrayList authors, String isbn, boolean readed, int timeReaded) {
        super(title, editionDate, editorial, authors);
        this.isbn = isbn;
        this.readed = readed;
        this.timeReaded = timeReaded;
    }

    public int getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isReaded() {
        return readed;
    }

    public void setReaded(boolean readed) {
        this.readed = readed;
    }

    public int getTimeReaded() {
        return timeReaded;
    }

    public void setTimeReaded(int timeReaded) {
        this.timeReaded = timeReaded;
    }

    @Override
    public String toString() {
        return "\n::BOOKS::" +
                "\nTitle: " + getTitle() +
                "\nDate: " + geteditionDate() +
                "\nEditorial: " + getEditorial() +
                "\nAuthors: " + getAuthors() +
                "\nIsbn: " + getIsbn() +
                "\nReaded: " + this.readed +
                "\nTime readed: " + this.timeReaded; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Date startToSee(Date dateI) {
        return dateI;
    }

    @Override
    public void stopToSee(Date dateI, Date dateF) {
        if(dateF.getSeconds() > dateI.getSeconds()){
            setTimeReaded(dateF.getSeconds() - dateI.getSeconds());
        }else{
            setTimeReaded(0);
        }
    }
    
    public static ArrayList<Book> makeListBook(){
       
        ArrayList<Book> book = new ArrayList();
        
        return book;
    }

}
