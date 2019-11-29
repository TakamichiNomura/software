import java.util.*;
/**
 * Write a description of class Library here.
 *
 * @author (노무라 타카미치,카리야 노부타카,이 제훈,오타 오아키)
 * @version (2019/11/29)
 */
public class Library
{
    private String name;
    TreeSet<Book> books;
    static TreeSet<Borrower> borrowers;
    Book book;
    public Library(){}
    public Library(String name){
        this.name = name;
    }

    public Library(int catalogueNumber,String title,String auther){
        book = new Book(catalogueNumber,auther,title);
        books = new TreeSet<Book>();
    }

    public void RegisterOneBorrower(String name){
        this.name = name;
        borrowers = new TreeSet<Borrower>();
        Iterator<Borrower> iterator = borrowers.iterator();
        while(iterator.hasNext()){
            String dish = iterator.next().toString();
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

    public String RequestOneBook(){
        books = new TreeSet<Book>();
        Iterator<Book> iterator = books.iterator();
        while(iterator.hasNext()){
            Book dish = iterator.next();
            if(book.equals(dish)){
                System.out.println("이미 등록되어 있는 책입니다.");
                return " ";
            }
        }
        books.add(book);
        System.out.println("신청되었습니다.");
        return " ";
    }

    public void DisplayBooksForLoan(){
        Loan loan = new Loan();
        Iterator it = loan.checklist.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    
    public void DisplayBooksOnLoan(){
        Loan loan = new Loan();
        Iterator it = loan.checklist.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

    public void LendOneBook(String name,int catalogueNumber,String author,String title){
        Book book = new Book(catalogueNumber,author,title);
        book.FindBook(catalogueNumber, author, title);
        if(book.FindBook(catalogueNumber, author, title) == 0){
            Borrower borrower = new Borrower(name);
            borrower.getBorrower();
            if(borrower.getBorrower().equals("1")){
                System.out.println("등록되어 있지않은 사람입니다.");
            }else if(borrower.getBorrower().equals("0")){
                Book bk = new Book(author,title);
                bk.attachBorrower(catalogueNumber,bk);
            }
        }else if(book.FindBook(catalogueNumber, author, title) == 1){
            System.out.println("이 책은 대출할수없습니다.");
        }
    }

    public void RetrunOneBook(int catalogueNumber,String author,String title){
        Book book = new Book(catalogueNumber,author,title);
        book.FindBook(catalogueNumber, author, title);
        if(book.FindBook(catalogueNumber, author, title) == 1){
            Borrower borrower = new Borrower(name);
            borrower.getBorrower();
            if(borrower.getBorrower().equals("1")){
                System.out.println("등록되어 있지않은 사람입니다.");
            }else if(borrower.getBorrower().equals("0")){
                Book bk = new Book(author,title);
                book.detachBorrower(catalogueNumber,bk);
            }
        }else if(book.FindBook(catalogueNumber, author, title) == 0){
            System.out.println("이 책은 없습니다.");
        }
    }
    
    public void RegisterOneBook(String title, String author, int catalogueNumber){
        book = new Book(catalogueNumber, author, title);
        book.BookList(catalogueNumber, author, title);
    }
}
