
/**
 * Write a description of class Library here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Library
{
    private String name;
    public String RegisterOneBorrower(String name){
        this.name = name;
        return this.name;
    }
    public void requestOneBorrower(String name){
        this.name = name;
    }
    public void RegisterOneBook(String title,String auther,int catalogNumber){
        
    }
    public void DisplayBooksForLoan(){
        
    }
    public void DisplayBooksOnLoan(){
        
    }
    public void LendOneBook(String name,int catalogNumber){
        
    }
    public void ReturnOneBook(int catalogNumber){
        
    }
    public void FindBook(Book catalogNumber){
        
    }
}
