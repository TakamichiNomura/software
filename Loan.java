import java.util.*;
/**
 * Write a description of class Loan here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Loan
{
    private String name;
    private String book;
    static LinkedList<HashMap> link;
    public String LendOneBook(String name, String book){
        this.name = name;
        this.book = book;
        link = new LinkedList<HashMap>();
        HashMap<String, String> hmap = new HashMap<String,String>();
        hmap.put(name,book);
        link.add(hmap);
    }
    public String ReturnOneBook(String name,String book){
        this.name = name;
        this.book = book;
        
    }
}
