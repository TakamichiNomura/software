import java.util.*;
/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book
{
    private int catalogNumber;
    private String auther;
    private String title;
    static TreeSet<Integer> number = new TreeSet<Integer>();
    static LinkedList<Book> booklist = new LinkedList<Book>();
    public Book(){}
    public Book(String auther,String title){
        this.auther = auther;
        this.title = title;
    }
    public void Add(){
        booklist.add(this.catalogNumber,new Book(this.auther,this.title));
        System.out.println("정상적으로 등록되었습니다.");
    }
    public void Display(){
        
    }
    public void getBorrower(){
        
    }
    public void attachBorrower(){
        
    }
    public void detachBorrower(){
        
    }
    public Book compareTo(Book book){
        Iterator<Book> iterator = booklist.iterator();
        while(iterator.hasNext()){
            if(book.equals(iterator.next())){
                System.out.println("이미 등록되어 있는 책입니다.");
                break;
            }
        }
        return book;
    }
    public boolean equals(Object obj){
        
    }
}
