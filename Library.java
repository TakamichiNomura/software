import java.util.*;
/**
 * Write a description of class Library here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Library
{
    private String name;
    static TreeSet<Book> books;
    static HashSet<Borrower> borrowers;
    Book book;
    public Library(String name){
        this.name = name;
    }

    public Library(int catalogNumber,String title,String auther){
        book = new Book(catalogNumber,auther,title);
        books = new TreeSet<Book>();
    }

    public void RegisterOneBorrower(String name){
        this.name = name;
        borrowers = new HashSet<Borrower>();
        Iterator<Borrower> iterator = borrowers.iterator();
        while(iterator.hasNext()){
            Borrower dish = iterator.next();
            if(this.name.equals(dish)){
                System.out.println("이 이용자는 이미 등록되고 있습니다.");
                break;
            }
        }   
        if(iterator.hasNext() == false){
            Borrower user = new Borrower(this.name);
            borrowers.add(user);
            System.out.println("등록되었습니다");
        }
    }

    public void RequestOneBook(){
        Iterator<Book> iterator = books.iterator();
        while(iterator.hasNext()){
            Book dish = iterator.next();
            if(book.equals(dish)){
                System.out.println("이미 등록되어 있는 책입니다.");
                break;
            }
        }
        if(iterator.hasNext() == false){
            books.add(book);
            System.out.println("신청되었습니다.");
        }
    }

    public void DisplayBooksForLoan(){
        
    }

    public void DisplayBooksOnLoan(){

    }

    public void LendOneBook(int catalogNumber,String auther,String title){
        book.attachBorrower(catalogNumber,auther,title);
    }

    public void RetrunOneBook(int catalogNumber,String auther,String title){
        book.detachBorrower(catalogNumber,auther,title);
    }

    public void FindBook(){
        Iterator<Book> iterator = books.iterator();
        while(true){
            Book dish = iterator.next();
            if(book.equals(dish)){
                System.out.println("catalogNumber,title,auther"+
                    book);
                break;
            }
        }
        if(iterator.hasNext() == false){
            System.out.println("찾으신 책이 없습니다.");
        }
    }
}
