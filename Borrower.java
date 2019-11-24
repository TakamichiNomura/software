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
    private String title;
    private String auther;
    public String RequestBook(String title,String auther){
        this.title = title;
        this.auther = auther;
        
    }
    public String SearchBook(String title){
        this.title = title;
    }
    public void BorrowBook(Book book){
        
    }
    public void RetrunBook(Book book){
        return;
    }
}
