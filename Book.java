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
    static TreeSet<Book> books;
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

    public String toString(){
        return catalogueNumber +","+author+","+title;
    }

    public void attachBorrower(String name,Book book){
        Loan loan = new Loan(name,book);
        loan.LendOneBook(name,book);
    }

    public void detachBorrower(String name,Book book){
        Loan loan = new Loan(name,book);
        loan.ReturnOneBook(name,book);
    }

    public String BookList(int catalogueNumber,String author,String title){
        this.title = title;
        this.author = author;
        this.catalogueNumber = catalogueNumber;
        books = new TreeSet<Book>();
        Iterator<Book> iterator = books.iterator();
        while(iterator.hasNext()){
            String dish = iterator.next().toString();
            if(this.title.equals(dish)){
                System.out.println("이 책은 이미 등록되고 있습니다.");
                return " ";
            }
        }   
    }

    public void BookAdd(int catalogueNumber,String author,String title){
        Book book = new Book(catalogueNumber,author,title);
        books.add(book);
        System.out.println("등록되었습니다");
    }
}
