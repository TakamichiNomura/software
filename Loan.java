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
    public void CheckBook(int catalogueNumber,Book book){
        Iterator<Book> it = booklist.iterator();
        while(it.hasNext()){
            Book bk = it.next();
            if(book.equals(bk)){
                
            }
        }
    }
}
