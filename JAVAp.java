import javax.swing.*;
import java.awt.*;
public class JAVAp extends JFrame{
  public JAVAp(){
       setLayout(new FlowLayout());
       JMenu menu1 =new JMenu("File");
       JMenu menu2 =new JMenu("Edit");
       JMenu menu3 =new JMenu("Font");
       JMenu submenu1 =new JMenu("Type");
       JMenuBar mb = new JMenuBar();
       JMenuItem i1= new JMenuItem("Open");
       JMenuItem i2= new JMenuItem("Save");
       JMenuItem i3= new JMenuItem("SaveAs");
       JMenuItem i4= new JMenuItem("Cut");
       JMenuItem i5= new JMenuItem("Copy");
       JMenuItem i6= new JMenuItem("Paste");
       JMenuItem i7= new JMenuItem("Replace");
       JMenuItem i8= new JMenuItem("Replace All");
       menu1.add(i1);
       menu1.add(i2);
       menu1.add(i3);
       menu2.add(i4);
       menu2.add(i5);
       menu2.add(i6);
       menu2.add(i7);
       menu2.add(i8);
       mb.add(menu1);
       mb.add(menu2);
       add(mb);
       }
  public static void main(String[] args)
    {
     JAVAp w =new JAVAp();
     w.setSize(300,300);
     w.setTitle("Text Editor");
     w.setLocationRelativeTo(null);
     w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     w.setVisible(true);
  }
}
