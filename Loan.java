import java.util.*;
/**
 * Loan class
 *
 * @author (노무라 타카미치,카리야 노부타카,유제훈,오타 오아키)
 * @version (2019/11/29)
 */
public class Loan
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
        Iterator<Book> bookit = this.book.bklist.iterator();
        Iterator<Book> loanit = booklist.iterator();
        while(bookit.hasNext()){
            Book bkit = bookit.next();
            while(loanit.hasNext()){
                Book lnit = loanit.next();
                if(bkit.equals(lnit)){
                    break;
                }
                checklist.add(lnit);
            }
        }
        Library lb = new Library();
        lb.DisplayBooksForLoan();
    }
    public void RefarenceBook(int catalogueNumber,String author,String title){
        checklist = new LinkedList<Book>();
        Iterator<Book> bookit = this.book.bklist.iterator();
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
        lb.DisplayBooksOnLoan();
    }
}
