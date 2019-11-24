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
    static TreeSet<String> setname;
    Library library;
    public void BorrowerAdd(String name){
        this.name = name;
        library = new Library();
        library.RegisterOneBorrower(this.name);
        setname.add(this.name);
    }
    public void RequestBook(String title,String auther){
        library = new Library();
        library.RequestOneBook(title,auther);
    }
    public void SearchBook(int catalognumber){
        library = new Library();
        library.FindBook(catalognumber);
    }
    public void BorrowBook(Book book){
        library = new Library();
        library.LendOneBook(book);
    }
    public void RetrunBook(Book book){
        
    }
}
