import java.awt.*;
import javax.swing.*;
import javax.swing.tree.*;
public class Mtree_Frame extends JFrame
{	public Mtree_Frame()
	{
		DefaultMutableTreeNode root=new DefaultMutableTreeNode("r1");
		DefaultMutableTreeNode B7=new DefaultMutableTreeNode("AIML-B");
		DefaultMutableTreeNode B8=new DefaultMutableTreeNode("AIML-A");
	 DefaultMutableTreeNode B8_1=new DefaultMutableTreeNode("Batch8_sub");
		DefaultMutableTreeNode f1=new DefaultMutableTreeNode("file1");
		DefaultMutableTreeNode f2=new DefaultMutableTreeNode("file2");
		DefaultMutableTreeNode f3=new DefaultMutableTreeNode("file3");
		DefaultMutableTreeNode f21=new DefaultMutableTreeNode("file21");
		DefaultMutableTreeNode f22=new DefaultMutableTreeNode("file22");
		DefaultMutableTreeNode ff=new DefaultMutableTreeNode("oracle");
		root.add(B7);root.add(B8);root.add(ff);
		B7.add(f1);
		B8_1.add(f21);B8_1.add(f22);
		B8.add(f2);B8.add(B8_1);B8.add(f3);
		JTree tree=new JTree(root);
		
		add(tree);
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String a[])
	{
		new Mtree_Frame();
	}
}