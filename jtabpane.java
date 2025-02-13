import java.awt.*;
import javax.swing.*;
public class jtabpane extends JFrame{
    public jtabpane(){
        JPanel p1=new JPanel();
        JPanel p2=new JPanel();
        JPanel p3=new JPanel();
        JCheckBox c1=new JCheckBox("M-1");
        JCheckBox c2=new JCheckBox("chemistry");
        JCheckBox c3=new JCheckBox("fcs");
        JCheckBox c4=new JCheckBox("ecs");
        p1.add(c1);p1.add(c2);p1.add(c3);p1.add(c4);
        JRadioButton r1=new JRadioButton("M-2");
        JRadioButton r2=new JRadioButton("physics");
        JRadioButton r3=new JRadioButton("python");
        JRadioButton r4=new JRadioButton("ds");
        p2.add(r1);p2.add(r2);p2.add(r3);p2.add(r4);
        String li[]={"p&s","m-3","co","dbms","oops"};
        JList<String> l=new JList<>(li);
        p3.add(l);
        JTabbedPane tp=new JTabbedPane();
        JScrollPane jsp=new JScrollPane(tp);
        tp.setBounds(50,50,200,200);
        tp.add("I YEAR I SEM COURSES",p1);
        tp.add("I YEAR II SEM COURSES",p2);
        tp.add("II YEAR I SEM COURSES",p3);
        add(jsp);
        setSize(200,200);
        setVisible(true);
    }
    public static void main(String args[]){
        new jtabpane();
    }
}