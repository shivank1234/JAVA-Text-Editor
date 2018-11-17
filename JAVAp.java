import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
public class JAVAp extends JFrame{
	 JComboBox jcb  = new JComboBox();
	 JComboBox jcbFontSize  = new JComboBox();
  public JAVAp(){
       JPanel j1 =new JPanel(new GridLayout(1,4));
       JMenu menu1 =new JMenu("File");
       JMenu menu2 =new JMenu("Edit");
       JMenu menu3 =new JMenu("Insert");
       JMenu submenu1 =new JMenu("Type");
       JMenu submenu2 =new JMenu("Case");
       JMenuBar mb = new JMenuBar();       
       JMenuItem i1= new JMenuItem("Open");
       JMenuItem i2= new JMenuItem("Save");
       JMenuItem i3= new JMenuItem("SaveAs");
       JMenuItem i4= new JMenuItem("Cut");
       JMenuItem i5= new JMenuItem("Copy");
       JMenuItem i6= new JMenuItem("Paste");
       JMenuItem i7= new JMenuItem("Replace");
       JMenuItem i8= new JMenuItem("Replace All");
       JMenuItem i9= new JMenuItem("Square");
       JMenuItem i10= new JMenuItem("Rectangle");
       JMenuItem i11= new JMenuItem("Circle");
       JMenuItem i12= new JMenuItem("Triangle");
       JMenuItem i13= new JMenuItem("Octagon");
       JMenuItem i14= new JMenuItem("Upper");
       JMenuItem i15= new JMenuItem("Lower");       
       menu1.add(i1);
       menu1.add(i2);
       menu1.add(i3);
       menu2.add(i4);
       menu2.add(i5);
       menu2.add(i6);
       menu2.add(i7);
       menu2.add(i8);
       menu3.add(i9);
       menu3.add(i10);
       menu3.add(i11);
       menu3.add(i12);
       menu3.add(i13);
       menu2.add(i14);
       menu2.add(i15);
       mb.add(jcb);
       mb.add(jcbFontSize);
       for(int i=6;i<=50;i+=2)
    	   jcbFontSize.addItem(i);
       GraphicsEnvironment e =GraphicsEnvironment.getLocalGraphicsEnvironment();
       String[] fontnames = e.getAvailableFontFamilyNames();
	for (int i = 0; i < fontnames.length; i++)
	   jcb.addItem(fontnames[i]);
				
       mb.add(menu1);
       mb.add(menu2);
       mb.add(menu3);
       j1.add(mb);
       add(j1,BorderLayout.NORTH);
       }
  public static void main(String[] args)
    {
     JAVAp w =new JAVAp();
     w.setSize(900,600);
     w.setTitle("Text Editor");
     w.setLocationRelativeTo(null);
     w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     w.setVisible(true);
  }
}
