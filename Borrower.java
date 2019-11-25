import java.util.*;
/**
 * Write a description of class Borrower here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Borrower
{
    private String name;
    Library library;
    public Borrower(String name){
        this.name = name;
    }
    public void BorrowerAdd(String name){
        this.name = name;
        library = new Library(name);
        library.RegisterOneBorrower(name);
    }
    public void RequestBook(int catalogNumber,String auther,String title){
        library = new Library(catalogNumber,auther,title);
        library.RequestOneBook();
    }
    public void SearchBook(int catalogNumber,String auther,String title){
        library = new Library(catalogNumber,auther,title);
        library.FindBook();
    }
    public void BorrowBook(int catalogNumber,String auther,String title){
        library = new Library(catalogNumber,auther,title);
        library.LendOneBook(catalogNumber,auther,title);
    }
    public void RetrunBook(int catalogNumber,String auther,String title){
        library = new Library(catalogNumber,auther,title); 
        library.RetrunOneBook(catalogNumber,title,auther);
    }
    public String toString(){
        return name;
    }
}
