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
    private int compareTo;
    private 
    public void Add(String title,String auther,int catalogNumber){
        this.title = title;
        this.auther = auther;
        this.catalogueNumber = catalogNumber;
        Set<String> settitle = new TreeSet<>();
        settitle.add(title);
        //List<String> lList = new ArrayList<String>();
        
    }
    public void Display(){
        
        
    }
    public void getBorrower(){
        return borrower;
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
