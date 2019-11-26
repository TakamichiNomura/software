import java.util.*;
/**
 * Write a description of class Loan here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Loan<Book>
{
    private String name;
    private Book book;
    LinkedList<Book> booklist = new LinkedList<Book>();
    public Loan(String name,Book book){
        this.name = name;
        this.book = book;
    }
    public void LendOneBook(String name,Book book){
        booklist.add(this.name,this.book);
    }
    public String ReturnOneBook(String name,Book book){
        Iterator<Book> iterator = booklist.iterator();
        while(iterator.hasNext()){
            if(book == iterator.next()){
                booklist.remove(this.name);
                return " ";
            }
        }
        return " ";
    }
}
