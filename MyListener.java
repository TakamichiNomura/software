import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * MyListener class
 *
 * @author (노무라 타카미치,카리야 노부타카,유제훈,오타 오아키)
 * @version (2019/12/3)
 */
public class MyListener extends MouseAdapter
{
    JButton button;
    public MyListener(JButton bt){
        this.button = bt;
    }
    public void mouseClicked(MouseEvent e){
        JButton bb = (JButton)e.getSource();
    }
}
