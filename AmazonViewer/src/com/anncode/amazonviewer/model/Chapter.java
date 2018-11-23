
package com.anncode.amazonviewer.model;

import java.util.ArrayList;

public class Chapter extends Movie{
    
  private  int id;
  private  int sessionNumber;
  
    public Chapter(String title, String genre, String creator, int duration, short year, int sessionNumber) {
        super(title, genre, creator, duration, year);
        this.sessionNumber = sessionNumber;
    }

    @Override
    public int getId() {
        return this.id;
    }
    
    public int getSessionNumber() {
        return sessionNumber;
    }

    public void setSessionNumber(int sessionNumber) {
        this.sessionNumber = sessionNumber;
    }

    @Override
    public String toString() {
        return "\n::CHAPTER::" +
                "\nTitle: " + getTitle() +
                "\nYear: " + getCreator() +
                "\nCreator: " + getCreator() +
                "\nDuration: " + getDuration(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static ArrayList<Chapter> makeChaptersList(){
        
        ArrayList<Chapter> chapters = new ArrayList();
        
        for(int i = 0; i <=5; i++){
            chapters.add(new Chapter("chapter " + i, "Genre " + i, "Creator " + i, 240, (short)2017, i));
        }
        
        return chapters;
    }
    
    
}
