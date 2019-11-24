import java.util.*;
/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book
{
    private int catalogueNumber;
    private String auther;
    private String title;
    public void Add(String title,String auther,int catalogNumber){
        this.title = title;
        this.auther = auther;
        this.catalogueNumber = catalogNumber;
        Set<String> settitle = new TreeSet<>();
        settitle.add(title);
        
    }
    public void Display(){
        
    }
    public void getBorrower(){
        
    }
    public void attachBorrower(){
        
    }
    public void detachBorrower(){
        
    }
    public int compareTo(Object obj){
        
    }
    public boolean equals(Object obj){
        
    }
}
