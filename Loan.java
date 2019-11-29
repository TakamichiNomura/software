import java.util.*;
/**
 * Write a description of class Loan here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Loan<Book>
{
    int catalogueNumber;
    private Book book;
    LinkedList<Book> checklist;
    LinkedList<Book> booklist;
    public Loan(){}
    public Loan(int catalogueNumber,Book book){
        this.catalogueNumber = catalogueNumber;
        this.book = book;
    }
    public void LendOneBook(int catalogueNumber,Book book){
        booklist = new LinkedList<Book>();
        booklist.add(this.catalogueNumber,this.book);
    }
    public String ReturnOneBook(int catalogueNumber,Book book){
        Iterator<Book> iterator = booklist.iterator();
        while(iterator.hasNext()){
            Book bk = iterator.next();
            if(book.equals(bk)){
                booklist.remove(this.catalogueNumber);
                return " ";
            }
        }
        return " ";
    }
    public void CheckBook(int catalogueNumber,String author,String title){
        checklist = new LinkedList<Book>();
        book = new Book(author,title);
        Iterator<Book> bookit = book.bklist.iterator();
        Iterator<Book> loanit = booklist.iterator();
        while(bookit.hasNext()){
            Book bkit = bookit.next();
            while(loanit.hasNext()){
                Book lnit = loanit.next();
                if(bkit.equals(lnit)){
                    checklist.add(lnit);
                }
            }
        }
        Library lb = new Library();
        lb.DisplayBooksForLoan();
    }
    
}
