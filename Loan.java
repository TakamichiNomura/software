import java.util.*;
/**
 * Write a description of class Loan here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Loan
{
    private Book book;
    static LinkedList<Book> booklist = new LinkedList<Book>();
    public void LendOneBook(Book book){
        booklist.add(book);
    }
    public void ReturnOneBook(Book book){
        
    }
}
