import javax.swing.*; 
import java.awt.*; 
public class JtabPane1 extends JFrame
{  
	  
 	JtabPane1(){
    
    JTextArea ta=new JTextArea("ENTER TEXT "); ta.setForeground(Color.red); 
    JPanel p1=new JPanel();  p1.setLayout(new BorderLayout());  
    	p1.add(ta);  
    JPanel p2=new JPanel(); 
	JTextField tf1=new JTextField("RVR JC CE");
            p2.add(tf1); 
    JPanel p3=new JPanel();  
      JTextField tf2=new JTextField("IT DEPT");
            p3.add(tf2);
            p2.setBackground(Color.red); p3.setBackground(Color.yellow);
    JTabbedPane tp=new JTabbedPane();  
    tp.setBounds(50,50,200,200);  
    tp.add("main",p1);  
    tp.add("visit",p2);  
    tp.add("help",p3);    
    add(tp);  
    setSize(400,400);  
      
    setVisible(true);  
	}  
	public static void main(String[] args) {  
    		new  JtabPane1();  
	}
}  