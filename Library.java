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
    Borrower borrower;
    Book book;
    public String RegisterOneBorrower(String name){
        this.name = name;
        borrower = new Borrower();
        Iterator<String> iterator = borrower.setname.iterator();
        while(iterator.hasNext()){
            if(this.name.equals(iterator.next())){
                System.out.println("이 이용자는 이미 등록되고 있습니다.");
                break;
            }
        }
        return this.name;
    }
    public void RequestOneBook(String title,String auther){
        book = new Book(title,auther);
        book.compareTo(book);
        book.Add();
    }
    public void DisplayBooksForLoan(){
        
    }
    public void DisplayBooksOnLoan(){
        
    }
    public void LendOneBook(int catalogNumber,Book book){
        book = new Book();
        Loan loan = new Loan();
        loan.LendOneBook(catalogNumber,book);
    }
    public void RetrunOneBook(int catalogNumber,Book book){
        book = new Book();
        Loan loan = new Loan();
        loan.ReturnOneBook(catalogNumber,book);
    }
    public void FindBook(int catalogNumber){
        book = new Book(); 
        Iterator<Integer> catalog = book.number.iterator();
        Iterator<Book> title = book.booklist.iterator();
        while(true){
            if(catalogNumber == catalog.next()){
                System.out.println("catalogNumber,title,auther"+
                                    catalogNumber+" "+title.next());
                break;
            }
            title.next();
        }
        System.out.println("찾으신 책이 없습니다.");
    }
}
