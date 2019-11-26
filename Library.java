
/**
 * Write a description of class Library here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Library
{
    private String name;
    private int catalogueNumber;
    private String auther;
    private String title;
    private 
    public String RegisterOneBorrower(String name){
        this.name = name;
        return this.name;
    }
    public void requestOneBorrower(String name){
        this.name = name;
    }
    public void RegisterOneBook(String title,String auther,int catalogNumber){
        this.title = title;
        this.auther =auther;
        this.catalogueNumber = catalogNumber;
    }
    public void DisplayBooksForLoan(){
        
    }
    public void DisplayBooksOnLoan(){
        
    }
    public void LendOneBook(String name,int catalogNumber){
        this.name = name;
        this.catalogueNumber = catalogNumber;
    }
    public void ReturnOneBook(int catalogNumber){
        this.catalogueNumber = catalogNumber;
    }
    public void FindBook(Book catalogNumber){
        this.catalogueNumber = catalogNumber;
    }
}
