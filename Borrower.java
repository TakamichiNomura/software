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
    public void RequestBook(int catalogueNumber,String auther,String title){
        library = new Library(catalogueNumber,auther,title);
        library.RequestOneBook();
    }
    public void SearchBook(int catalogueNumber,String auther,String title){
        library = new Library(catalogueNumber,auther,title);
        library.FindBook();
    }
    public void BorrowBook(String name,int catalogueNumber,String auther,String title){
        library = new Library(catalogueNumber,auther,title);
        this.name = name;
        library.LendOneBook(name,catalogueNumber,auther,title);
    }
    public void RetrunBook(int catalogueNumber,String auther,String title){
        library = new Library(catalogueNumber,auther,title); 
        library.RetrunOneBook(catalogueNumber,title,auther);
    }
    public String toString(){
        return name;
    }
}
