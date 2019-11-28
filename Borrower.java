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
    public void RequestBook(int catalogueNumber,String author,String title){
        library = new Library(catalogueNumber,author,title);
        library.RequestOneBook();
    }
    public void SearchBook(int catalogueNumber,String author,String title){
        Book book = new Book(author,title);
        Loan loan = new Loan(catalogueNumber, book);
        loan.CheckBook();
    }
    public void BorrowBook(String name,int catalogueNumber,String author,String title){
        library = new Library(catalogueNumber,author,title);
        this.name = name;
        library.LendOneBook(name,catalogueNumber,author,title);
    }
    public void RetrunBook(int catalogueNumber,String author,String title){
        library = new Library(catalogueNumber,author,title); 
        library.RetrunOneBook(catalogueNumber,title,author);
    }
    public String getBorrower(){
        library = new Library(this.name);
        Iterator<Borrower> it = library.borrowers.iterator();
        while(it.hasNext()){
            Borrower user = it.next();
            if(this.name.equals(user)){
                return "0";
            }
        }
        return "1";
    }
    public String toString(){
        return name;
    }
}
