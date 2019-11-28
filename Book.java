import java.util.*;
/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book
{
    private int catalogueNumber;
    private String author;
    private String title;
    TreeSet<Book> books;
    LinkedList<Book> bklist;
    public Book(String author,String title){
        this.author = author;
        this.title = title;
    }

    public Book(int catalogueNumber,String author,String title){
        this.author = author;
        this.title = title;
        this.catalogueNumber = catalogueNumber;
        books = new TreeSet<Book>();
    }

    public int FindBook(int catalogueNumber,String author,String title){
        Book book = new Book(catalogueNumber,author,title);
        Iterator<Book> iterator = books.iterator();
        while(iterator.hasNext()){
            Book dish = iterator.next();
            if(book.equals(dish)){
                return 1;
            }
        }
        return 0;
    }

    public String toString(){
        return catalogueNumber +","+author+","+title;
    }

    public void attachBorrower(int catalogueNumber,Book book){
        Loan loan = new Loan(catalogueNumber,book);
        loan.LendOneBook(catalogueNumber,book);
    }

    public void detachBorrower(int catalogueNumber,Book book){
        Loan loan = new Loan(catalogueNumber,book);
        loan.ReturnOneBook(catalogueNumber,book);
    }

    public void BookList(int catalogueNumber,String author,String title){
        this.title = title;
        this.author = author;
        this.catalogueNumber = catalogueNumber;
        books = new TreeSet<Book>();
        Iterator<Book> iterator = books.iterator();
        while(iterator.hasNext()){
            String dish = iterator.next().toString();
            if(this.title.equals(dish)){
                System.out.println("이 책은 이미 등록되고 있습니다.");
                break;
            }
        }   
        BookAdd(catalogueNumber, author, title);
    }

    public void BookAdd(int catalogueNumber,String author,String title){
        Book book = new Book(catalogueNumber,author,title);
        books.add(book);
        Book bk = new Book(author,title);
        bklist.add(catalogueNumber,bk);
        System.out.println("등록되었습니다");
    }
}
