import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.io.*;
import java.awt.event.*;
import javax.swing.text.*;
import javax.swing.plaf.metal.*;
public class JAVAp extends JFrame implements ActionListener { 
	
	public JComboBox jcb  = new JComboBox();
	public JComboBox jcbFontSize = new JComboBox<String>(new String[] {"1","2", "4", "6",
	"8", "10","12","14","16","18","20","22","24","26","28","30","32","34","36","38","40","44","48","52","56","60","64","68","72","76","80","84","88","92","96","100"});
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
	public int SIZE = 10;
	public String FONT = "Dialog";
	
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
       
       jcbFontSize.addActionListener(new ActionListener() {
    	   @Override
    	   public void actionPerformed(ActionEvent e3) {
    		   String s4 = jcbFontSize.getSelectedItem().toString();
    		   int size = Integer.parseInt(s4);
    		   Action fontAction = new StyledEditorKit.FontSizeAction(String.valueOf(size), size);
    		   fontAction.actionPerformed(e3);
    	   }
       });
       
       jcb.addActionListener(new ActionListener() {
    	   @Override
    	   public void actionPerformed(ActionEvent e2) {
    		   String name = jcb.getSelectedItem().toString();
    		   new StyledEditorKit.FontFamilyAction("font-family-" + name, name).actionPerformed(e2);
    	   }
       });
       
       
       JMenuItem i1= new JMenuItem("New");
       JMenuItem i2= new JMenuItem("Open");
       JMenuItem i3= new JMenuItem("Save");
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
       JMenuItem i16= new JMenuItem("Count words & charachters");
       
       bold.addActionListener(e ->changeStyle());
       Italic.addActionListener(e ->changeStyle2());
       UL.addActionListener(e ->changeStyle3());
       
       i1.addActionListener(this);
       i2.addActionListener(this); 
       i3.addActionListener(this);
       i4.addActionListener(new ActionListener()
	   {
   public void actionPerformed(ActionEvent e1)
   {
	   jtf.cut();
   }
	   });
	i5.addActionListener(new ActionListener()
	{
	public void actionPerformed(ActionEvent e1)
	{
	jtf.copy();
	}
	});
	i6.addActionListener(new ActionListener()
	{
	public void actionPerformed(ActionEvent e1)
	{
	jtf.paste();
	}
	});
	
	i16.addActionListener(new ActionListener()
	   {
	public void actionPerformed(ActionEvent e1)
	{
		   String s1 =jtf.getSelectedText();
	int length=0,words=1;
	int i;
	for(i=0;i<s1.length()-1;i++)
	{
	if (((s1.charAt(i) == ' ') && (s1.charAt(i + 1) != ' '))||((s1.charAt(i) == ',') && (s1.charAt(i + 1) != ','))||((s1.charAt(i) == '.') && (s1.charAt(i + 1) != '.')))
		{
			words++;
		}   
	}
	tf.setText(String.valueOf(words));
	tf2.setText(String.valueOf(s1.length()));
	}

	   });
       
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
       menu2.add(i16);
       String arr[] = new String[20];
       
       GraphicsEnvironment e = GraphicsEnvironment.getLocalGraphicsEnvironment();
	   String[] fontnames = e.getAvailableFontFamilyNames();
	   for (int i = 0; i < fontnames.length; i++) {
		   jcb.addItem(fontnames[i]);
	   }
				
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
           @Override
            public void actionPerformed(ActionEvent e) {
               String s = e.getActionCommand();
               if (s.equals("New")) { 
                   jtf.setText(""); 
               }      
               
         if (s.equals("Save")) { 
            // Create an object of JFileChooser class 
            JFileChooser j = new JFileChooser("f:"); 
  
            // Invoke the showsSaveDialog function to show the save dialog 
            int r = j.showSaveDialog(null); 
  
            if (r == JFileChooser.APPROVE_OPTION) { 
  
                // Set the label to the path of the selected directory 
                File fi = new File(j.getSelectedFile().getAbsolutePath()); 
  
                  try{
                    // Create a file writer 
                    FileWriter wr = new FileWriter(fi, false); 
  
                    // Create buffered writer to write 
                    BufferedWriter w = new BufferedWriter(wr); 
  
                    // Write 
                    w.write(jtf.getText()); 
  
                    w.flush(); 
                    w.close(); 
                  }
                 catch(Exception evt)
                  {
                     }
            } 
            
        }  
       if (s.equals("Open")) { 
            // Create an object of JFileChooser class 
            JFileChooser j = new JFileChooser("f:"); 
  
            // Invoke the showsOpenDialog function to show the save dialog 
            int r = j.showOpenDialog(null); 
  
            // If the user selects a file 
            if (r == JFileChooser.APPROVE_OPTION) { 
                // Set the label to the path of the selected directory 
                File fi = new File(j.getSelectedFile().getAbsolutePath()); 
  
                try { 
                    // String 
                    String s1 = "", sl = ""; 
  
                    // File reader 
                    FileReader fr = new FileReader(fi); 
  
                    // Buffered reader 
                    BufferedReader br = new BufferedReader(fr); 
  
                    // Initilize sl 
                    sl = br.readLine(); 
  
                    // Take the input from the file 
                    while ((s1 = br.readLine()) != null) { 
                        sl = sl + "\n" + s1; 
                    } 
  
                    // Set the text 
                    jtf.setText(sl); 
                } 
                catch (Exception evt) { 
                    
                } 
            } 
     }
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
  
  public void changeStyle() {
	    StyledDocument doc = (StyledDocument) jtf.getDocument();
	    int selectionEnd = jtf.getSelectionEnd();
	    int selectionStart = jtf.getSelectionStart();
	    if (selectionStart == selectionEnd) {
	      return;
	    }
	    Element element = doc.getCharacterElement(selectionStart);
	    AttributeSet as = element.getAttributes();

	    MutableAttributeSet asNew = new SimpleAttributeSet(as.copyAttributes());
	    StyleConstants.setBold(asNew, !StyleConstants.isBold(as));
	    doc.setCharacterAttributes(selectionStart, jtf.getSelectedText()
	        .length(), asNew, true);
	  }
	public void changeStyle2() {
	    StyledDocument doc = (StyledDocument) jtf.getDocument();
	    int selectionEnd = jtf.getSelectionEnd();
	    int selectionStart = jtf.getSelectionStart();
	    if (selectionStart == selectionEnd) {
	      return;
	    }
	    Element element = doc.getCharacterElement(selectionStart);
	    AttributeSet as = element.getAttributes();

	    MutableAttributeSet asNew = new SimpleAttributeSet(as.copyAttributes());
	    StyleConstants.setItalic(asNew, !StyleConstants.isItalic(as));
	    doc.setCharacterAttributes(selectionStart, jtf.getSelectedText()
	        .length(), asNew, true);
	  }
	public void changeStyle3() {
	    StyledDocument doc = (StyledDocument) jtf.getDocument();
	    int selectionEnd = jtf.getSelectionEnd();
	    int selectionStart = jtf.getSelectionStart();
	    if (selectionStart == selectionEnd) {
	      return;
	    }
	    Element element = doc.getCharacterElement(selectionStart);
	    AttributeSet as = element.getAttributes();

	    MutableAttributeSet asNew = new SimpleAttributeSet(as.copyAttributes());
	    StyleConstants.setUnderline(asNew, !StyleConstants.isUnderline(as));
	    doc.setCharacterAttributes(selectionStart, jtf.getSelectedText()
	        .length(), asNew, true);
	  }
}
