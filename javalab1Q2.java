import java.util.Scanner;
import java.io.*;
class Circle
{
 private double radius;
 public Circle(){
 this.radius=0;
 }
 public Circle(double radius){
 this.radius=radius;
 }
 public void setRadius(double radius)
 {
 this.radius=radius;
 }
 public double getRadius()
 {
 return radius;
 }
 public double area()
 {
 return Math.PI*radius*radius;
 }
 public double circumference()
 {
 return 2*Math.PI*radius;
 }
}
public class javalab1Q2{
 public static void main(String[] args) {
 double radius;
 int choice;
 Scanner sc=new Scanner(System.in);
 Circle obj1=new Circle();
 System.out.println("Enter the radius: ");
 radius=sc.nextDouble();
 Circle obj=new Circle(radius);
 System.out.println("1.Set Radius\n2.Get Radius\n3.Area of Circle\n4.Circumference of Circle\n5.Exit\n");
 while(true)
 {
 System.out.println("Enter your choice: ");
 choice=sc.nextInt();
 switch(choice)
 {
 case 1:
 System.out.println("Enter new radius: ");
 radius=sc.nextDouble();
obj.setRadius(radius);
System.out.println("Radius is setted");
break;
 case 2:
 System.out.println("radius is:"+obj.getRadius());
break;
 case 3:
 System.out.println("Area of the Circle: "+obj.area());
break;
 case 4:
 System.out.println("Circumference of the Circle: "+obj.circumference());
 break;
 case 5: 
 System.exit(0);
 break;
 }
 }
 }
}