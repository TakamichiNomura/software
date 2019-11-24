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
    public void LendOneBook(int catalogNumber,Book book){
        booklist.add(catalogNumber,book);
    }
    public void ReturnOneBook(int catalogNumber,Book book){
        Iterator<Book> iterator = booklist.iterator();
        while(iterator.hasNext()){
            if(book == iterator.next()){
                booklist.remove(catalogNumber);
                break;
            }
        }
    }
}
