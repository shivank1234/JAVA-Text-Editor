import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
public class JAVAp extends JFrame implements ActionListener { 
	
	public JComboBox jcb  = new JComboBox();
	public JComboBox jcbFontSize = new JComboBox();
	public static JTextPane jtf = new JTextPane();
	public JTextField tf = new JTextField(10);
	public JTextField tf2 = new JTextField(10);
	public JPanel panel1 = new JPanel();
	public JPanel panel2 = new JPanel(new GridLayout());
	public JButton bold = new JButton("B");
	public JButton Italic = new JButton("I");
	public JButton UL = new JButton("U");
	public static JMenuBar mb = new JMenuBar();
	public static JMenuBar mb2 = new JMenuBar();
	
  public JAVAp(){
	  
       setLayout(new FlowLayout());
       JMenu menu1 =new JMenu("File");
       JMenu menu2 =new JMenu("Edit");
       JMenu menu3 =new JMenu("Insert");
       panel1.setLayout(new BorderLayout());
       
       JScrollPane sc = new JScrollPane(jtf);
       sc.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
       sc.setPreferredSize(new Dimension(20,20));
       panel1.add(sc,BorderLayout.EAST);
       jtf.setEditable(true);
       
       mb2.add(new JLabel("Words"));
       mb2.add(tf);
       mb2.add(new JLabel("Characters"));
       mb2.add(tf2);
       tf.setBorder(new LineBorder(Color.BLACK,1));
       tf2.setBorder(new LineBorder(Color.BLACK,1));
       
       JMenu submenu1 =new JMenu("Type");
       jtf.setBorder(new LineBorder(Color.BLACK,1));
       menu1.setBorder(new LineBorder(Color.GRAY,1));
       menu2.setBorder(new LineBorder(Color.GRAY,1));
       menu3.setBorder(new LineBorder(Color.GRAY,1));
       jcb.setBackground(Color.WHITE);
       jcbFontSize.setBackground(Color.WHITE);
       
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
       JMenuItem i14= new JMenuItem("Case Upper");
       JMenuItem i15= new JMenuItem("Case Lower");
       
       bold.setFont(new Font("Arial Black",Font.BOLD,14));
       Italic.setFont(new Font("Times New Roman",Font.ITALIC,16));
       UL.setFont(new Font("Times New Roman",Font.BOLD,16));
       
       menu1.add(i1);
       menu1.add(i2);
       menu1.add(i3);
       menu2.add(i4);
       menu2.add(i5);
       menu2.add(i6);
       menu2.add(i7);
       menu2.add(i8);
       menu2.add(i14);
       menu2.add(i15);
       menu3.add(i9);
       menu3.add(i10);
       menu3.add(i11);
       menu3.add(i12);
       menu3.add(i13);
       
       for(int i=6;i<=50;i+=2)
    	   jcbFontSize.addItem(i);
       GraphicsEnvironment e = GraphicsEnvironment.getLocalGraphicsEnvironment();
				String[] fontnames = e.getAvailableFontFamilyNames();
				for (int i = 0; i < fontnames.length; i++)
				jcb.addItem(fontnames[i]);
				
       mb.add(menu1);
       mb.add(menu2);
       mb.add(menu3);
       mb.add(jcb);
       mb.add(jcbFontSize);
       mb.add(bold);
       mb.add(Italic);
       mb.add(UL);
       panel1.add(mb,BorderLayout.NORTH);
       panel1.add(jtf,BorderLayout.CENTER);
       panel1.add(mb2,BorderLayout.SOUTH);
       add(panel1);
       //add(panel2);
       }
  public static void main(String[] args)
    {
     JAVAp w =new JAVAp();
     w.setJMenuBar(mb);
     w.setLayout(new GridLayout());
     w.setSize(900,600);
     w.setTitle("Text Editor");
     w.setLocationRelativeTo(null);
     w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     w.setVisible(true);
  }
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
}
