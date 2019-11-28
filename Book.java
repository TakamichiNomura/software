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
    public Book(int catalogueNumber,String auther,String title){
        this.auther = auther;
        this.title = title;
        this.catalogueNumber = catalogueNumber;
    }
    public String toString(){
        return catalogueNumber +","+auther+","+title;
    }
    public void attachBorrower(String name,Book book){
        Loan loan = new Loan(name,book);
        loan.LendOneBook(name,book);
    }
    public void detachBorrower(String name,Book book){
        Loan loan = new Loan(name,book);
        loan.ReturnOneBook(name,book);
    }
    public boolean equals(Object obj){
        return true;
    }
}
