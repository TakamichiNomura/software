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
    static TreeSet<String> setname;
    Library library;
    Book book;
    public Borrower(String name){
        this.name = name;
    }
    public String BorrowerAdd(String name){
        this.name = name;
        int i = 0;
        Iterator<String> iterator = setname.iterator();
        while(iterator.hasNext()){
            String user = iterator.next();
            if(this.name.equals(user)){
                System.out.println("이 이용자는 이미 등록되고 있습니다.");
                break;
            }
        }
        if(iterator.hasNext() == false){
            System.out.println(this.name +"님을등록겠습니다.");
            setname.add(this.name);
            return this.name;
        }
    }
    public void RequestBook(Book book){
        library = new Library(book);
        library.RequestOneBook(book);
    }
    public void SearchBook(int catalognumber){
        library = new Library();
        library.FindBook(catalognumber);
    }
    public void BorrowBook(int catalogNumber,String title,String auther){
        library = new Library();
        book = new Book(catalogNumber,auther,title);
        library.LendOneBook(catalogNumber,title,auther);
    }
    public void RetrunBook(int catalogNumber,String title,String auther){
        library = new Library(); 
        book = new Book(catalogNumber,auther,title);
        library.RetrunOneBook(catalogNumber,title,auther);
    }
}
