
package com.anncode.amazonviewer.model;

import java.util.ArrayList;
import java.util.Date;

public class Movie extends Film implements IVisualizable{
    
    private int id;
    private int timeViewed;

    public Movie(String title, String genre, String creator, int duration, short year) {
        super(title, genre, creator, duration);
        setYear(year);
    }

    public void showDate(){
        //System.out.println("Title: " + this.title + "\nGenre: " + this.genre + "\nYear: " + this.year );
        
    }

    public int getId() {
        return id;
    }
    
    public int getTimeViewed() {
        return timeViewed;
    }

    public void setTimeViewed(int timeViewed) {
        this.timeViewed = timeViewed;
    } 

    @Override
    public String toString() {
        return  "\n\t::MOVIE::" +
                "\nTitle: " + getTitle() + 
                "\nGenre: " + getGenre() +
                "\nCreator: " + getCreator() +
                "\nDuration: " + getDuration() +
                "\nYear: " + getYear() +
                "\nViewed: " + getViewed(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Date startToSee(Date dateI) {
        return dateI;
    }

    @Override
    public void stopToSee(Date dateI, Date dateF) {
        if(dateF.getTime() > dateI.getTime()){
            setTimeViewed((int)(dateF.getTime() - dateI.getTime()));
        }else{
            setTimeViewed(0);
        }
        
    }
    
    public static ArrayList<Movie> makeListMovie(){
        ArrayList<Movie> movies = new ArrayList();
        
        for (int i = 1; i <= 7; i++) {
          movies.add(new Movie("Movie " + i , "Genre " + i, "Creator " + i, 120+i, (short)(2017+i)));  
        }
        return movies;
    }
    
}
