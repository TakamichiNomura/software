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
    LinkedList<Book> booklist = new LinkedList<Book>();
    public Loan(int catalogueNumber,Book book){
        this.catalogueNumber = catalogueNumber;
        this.book = book;
    }
    public void LendOneBook(int catalogueNumber,Book book){
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
    public void CheckBook(String author,String title){
        book = new Book(author,title);
        Iterator<Book> bookit = book.bklist.iterator();
        Iterator<Book> loanit = booklist.iterator();
        while(bookit.hasNext()){
            Book bkit = bookit.next();
            Book lnit = loanit.next();
            if(lnit.equals(bkit)){
                
            }
        }
    }
}
