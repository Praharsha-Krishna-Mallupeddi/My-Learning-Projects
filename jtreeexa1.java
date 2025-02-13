import java.awt.*;
import javax.swing.*;
import javax.swing.tree.*;
public class jtreeexa1 extends JFrame{
      public jtreeexa1(){
        DefaultMutableTreeNode rv=new DefaultMutableTreeNode("rvrjc");
        DefaultMutableTreeNode cb=new DefaultMutableTreeNode("circuit branches");
        DefaultMutableTreeNode cs=new DefaultMutableTreeNode("computer science");
        DefaultMutableTreeNode cse=new DefaultMutableTreeNode("cse");
        DefaultMutableTreeNode csm=new DefaultMutableTreeNode("cse(ai&ml)");
        DefaultMutableTreeNode csd=new DefaultMutableTreeNode("cse(ds)");
        DefaultMutableTreeNode cso=new DefaultMutableTreeNode("cse(iot)");
        DefaultMutableTreeNode it=new DefaultMutableTreeNode("it");
        DefaultMutableTreeNode nc=new DefaultMutableTreeNode("non computers");
        DefaultMutableTreeNode ece=new DefaultMutableTreeNode("ece");
        DefaultMutableTreeNode eee=new DefaultMutableTreeNode("eee");
        DefaultMutableTreeNode ncb=new DefaultMutableTreeNode("non circuit branches");
        DefaultMutableTreeNode me=new DefaultMutableTreeNode("me");
        DefaultMutableTreeNode ce=new DefaultMutableTreeNode("ce");
        DefaultMutableTreeNode che=new DefaultMutableTreeNode("che");
        rv.add(cb);rv.add(ncb);
        cb.add(cs);cb.add(nc);
        cs.add(cse);cs.add(csm);cs.add(csd);cs.add(cso);cs.add(it);nc.add(ece);nc.add(eee);
        ncb.add(me);ncb.add(ce);ncb.add(che);
        JTree tree=new JTree(rv);      
        add(tree);
        setSize(200,200);
        setVisible(true);
            }
            public static void main(String args[]){
                new jtreeexa1();
            }
}