import java.awt.*;
import javax.swing.*;
public class CreateTable extends JFrame{
    public CreateTable(){
        String h[]={"sl.no","emp.id","name","sal"};
        String d[][]={{"1","e001","thunish","1 lakh"},{"2","e002","monnish","10 lakh"},{"3","e003","thu","100 lakh"}};
        JTable tab=new JTable(d,h);
        JScrollPane jsp=new JScrollPane(tab);
        add(jsp);
        setSize(200,200);
        setVisible(true);
    }
    public static void main(String args[]){
        new CreateTable();
    }
}