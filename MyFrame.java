import javax.swing.*;
import java.awt.*;
/**
 * MyFrame class
 *
 * @author (노무라 타카미치,카리야 노부타카,유제훈,오타 오아키)
 * @version (2019/12/3)
 */
public class MyFrame extends JFrame
{
    JButton borrowerre,bookre,loanbook,returnbook,InLoan,LoanAva;
    public MyFrame(){
        super("LIbrary Management System");
        this.setSize(400,400);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.add(new MyPanel());
        this.add(panel); 
    }
    public class MyPanel extends JPanel{
        public MyPanel(){
            this.setLayout(new FlowLayout());
            borrowerre = new JButton("사용자 등록");
            borrowerre.addMouseListener(new MyListener(borrowerre));
            bookre = new JButton("책 등록");
            loanbook = new JButton("대출");
            returnbook = new JButton("반납");
            InLoan = new JButton("대출중");
            LoanAva = new JButton("대출 가능");
            this.add(borrowerre);
            this.add(bookre);
            this.add(loanbook);
            this.add(returnbook);
            this.add(InLoan);
            this.add(LoanAva);
        }
    }
}
