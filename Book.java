import java.util.*;
/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book
{
    private int catalogNumber;
    private String auther;
    private String title;
    public Book(String auther,String title){
        this.auther = auther;
        this.title = title;
    }
    public Book(int catalogNumber,String auther,String title){
        this.auther = auther;
        this.title = title;
        this.catalogNumber = catalogNumber;
    }
    public String toString(){
        return catalogNumber+","+auther+","+title;
    }
    public void attachBorrower(int catalogNumber,String auther,String title){
        Book book = new Book(auther,title);
        Loan loan = new Loan();
        loan.LendOneBook(catalogNumber,book);
    }
    public void detachBorrower(int catalogNumber,String auther,String title){
        Book book = new Book(auther,title);
        Loan loan = new Loan();
        loan.ReturnOneBook(catalogNumber,book);
    }
    public boolean equals(Object obj){
        return true;
    }
}
