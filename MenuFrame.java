import java.awt.*;
import java.awt.event.*; 
class MenuFrame extends Frame implements ActionListener
{  
          Menu menu, submenu, edit;  
          MenuItem i1, i2, i3; CheckboxMenuItem c1, c2; 
          MenuItem e1, e2, e3, e4, e5;
          TextArea ta=new TextArea("RVR JC", 400,300);  
          MenuFrame (){  
          super("Menu and MenuItems");  
          MenuBar mbr=new MenuBar();  
          menu=new Menu("File");  
          submenu=new Menu("Font");  
          i1=new MenuItem("Open");  
          i2=new MenuItem("Save");  
          i3=new MenuItem("Close");  
          c1=new CheckboxMenuItem ("Arial",true);  
          c2=new CheckboxMenuItem ("Impact");  
          menu.add(i1); menu.add(i2); menu.add(i3);  
          submenu.add(c1); submenu.add(c2);  
          
            mbr.add(menu); 
	   edit=new Menu("Edit");
          e1=new MenuItem("Cut"); e1.setEnabled(false);  
          e2=new MenuItem("Copy");  
          e3=new MenuItem("Paste");  
          e4=new MenuItem("Select");  
          e5=new MenuItem("Undo");
           edit.add(e1); edit.add(e2);edit.add(e3);edit.add(e4);edit.add(e5);
	  edit.add(submenu);  mbr.add(edit);  
          setMenuBar(mbr);  

          i1.addActionListener(this);
	  i2.addActionListener(this);
	  i3.addActionListener(this);
           
         
           this.add(ta);
          setSize(400,400);  
          //setLayout(null);  
          setVisible(true);  

   
} 
public void actionPerformed(ActionEvent ae) {
	String ops=ae.getActionCommand();
         if(ops.equals("Open"))
	  {   FileDialog fo=new FileDialog(this, "Open", FileDialog.LOAD);
			fo.setVisible(true);
	  }
	 else if(ops.equals("Save"))
	  {   FileDialog fs=new FileDialog(this, "SAVE", FileDialog.SAVE);
			fs.setVisible(true);
	  }
	else if(ops.equals("Close"))
	  {   this.dispose();
	  }


} 
public static void main(String args[])  
{  
new MenuFrame();  
}}  