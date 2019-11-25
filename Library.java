import java.util.*;
/**
 * Write a description of class Library here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Library
{
    private String name;
    static TreeSet<Book> books;
    static HashSet<Borrower> borrowers;
    Book book;
    public Library(String name){
        this.name = name;
        books = new TreeSet<Book>();
        borrowers = new HashSet<Borrower>();
    }
    public void RegisterOneBorrower(String name){
        Borrower borrower = new Borrower(name);
        borrower.BorrowerAdd(name);
        borrowers.add(borrower);
    }
    public void RequestOneBook(int catalogNumber,String title,String auther){
        book = new Book(catalogNumber,auther,title);
        book.compareTo(book);
        book.Add();
    }
    public void DisplayBooksForLoan(){
        
    }
    public void DisplayBooksOnLoan(){
        
    }
    public void LendOneBook(int catalogNumber,String auther,String title){
        book = new Book(catalogNumber,auther,title);
        Loan loan = new Loan();
        loan.LendOneBook(catalogNumber,book);
    }
    public void RetrunOneBook(int catalogNumber,String auther,String title){
        book = new Book(catalogNumber,auther,title);
        Loan loan = new Loan();
        loan.ReturnOneBook(catalogNumber,book);
    }
    public void FindBook(int catalogNumber,String auther,String title){
        book = new Book(catalogNumber,auther,title); 
        Iterator<Integer> catalog = book.number.iterator();
        Iterator<Book> tit = book.booklist.iterator();
        while(true){
            if(catalogNumber == catalog.next()){
                System.out.println("catalogNumber,title,auther"+
                                    catalogNumber+" "+tit.next());
                break;
            }
            tit.next();
        }
        System.out.println("찾으신 책이 없습니다.");
    }
}
