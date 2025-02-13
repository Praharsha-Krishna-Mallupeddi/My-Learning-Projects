import java.awt.*;
import java.awt.event.*;
public class calsopr extends Frame implements ActionListener
{
String val,op;
Button b1[]=new Button[16];
TextField tx1;
Panel p1;
int F,S,R,P,C;
public calsopr()
{
val="0";
op="";
F=S=R=P=C=0;
p1=new Panel();
tx1=new TextField("0",15);
tx1.setEditable(false);
p1.setLayout(new GridLayout(4,4,5,5));
for(int i=0;i<10;i++)
{
b1[i]=new Button(""+i);
b1[i].addActionListener(this);
}
b1[10]=new Button("+");
b1[10].addActionListener(this);
b1[11]=new Button("-");
b1[11].addActionListener(this);
b1[12]=new Button("*");
b1[12].addActionListener(this);
b1[13]=new Button("/");
b1[13].addActionListener(this);
b1[14]=new Button("=");
b1[14].addActionListener(this);
b1[15]=new Button("C");
b1[15].addActionListener(this);
for(int i=0;i<16;i++)
{
p1.add(b1[i]);
}
add(tx1,BorderLayout.NORTH);
add(p1,BorderLayout.CENTER);
setSize(200,200);
setVisible(true);
}
public void actionPerformed(ActionEvent ae)
{
String type=ae.getActionCommand();
if((type.equals("*"))||(type.equals("+"))||(type.equals("-"))||(type.equals("/")))
 op=type;
if((type.equals("0"))||(type.equals("1"))||(type.equals("2"))||(type.equals("3"))||(type.equals("4"))||(type.equals("5"))||(type.equals("6"))||(type.equals("7"))||(type.equals("8"))||(type.equals("9")))
{
tx1.setText(type);
if(C==0)
{
F=Integer.parseInt(tx1.getText());
C=1;
}
else
{
S=Integer.parseInt(tx1.getText());
C=0;
}
}
if(type.equals("="))
{
if(op.equals("+"))
{ R=F+S;
}
else if(op.equals("-"))
{ R=F-S;
}
else if(op.equals("*"))
{ R=F*S;
}
else if(op.equals("/"))
{ R=F/S;
}
tx1.setText(""+R);
}
if(type.equals("C"))
{
F=S=R=0;
tx1.setText("0");
}
}
public static void main(String s[])
{
new calsopr();
}
}



