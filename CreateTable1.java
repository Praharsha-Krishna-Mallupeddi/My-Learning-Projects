import java.awt.*;
import javax.swing.*;

public class CreateTable1 extends JFrame
{	public CreateTable1()
	{	super("Student TABLE");
		String col[]={"NAME","STDID","ADDRESS"};
		String[][] data={ {"AAAA1","10001","ADDRESS1"},
                                  {"AAAA2","10002","ADDRESS2"},
                                   {"AAAA3","10003","ADDRESS3"},
                                    {"AAAA4","10004","ADDRESS4"}
                                    };
		
		
               JTable tab=new JTable(data,col);
		
		JScrollPane jsp=new JScrollPane(tab);
		
	        add(jsp);
		setSize(600,100);
		setVisible(true);
	}
	public static void main(String st[])
	{	new CreateTable1();
	}
}