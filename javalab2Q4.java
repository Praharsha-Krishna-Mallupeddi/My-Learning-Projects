import java.util.Scanner;
import java.io.*;
class MathOperations{
 public final double PI=3.141592;
 public final double PI_2=0.31818181818;
 public final double SQRT2=1.41421356237;
 public final double SQRT2_2= 0.70710678118;
 
 public static int max(int a,int b){
 return (a>b)?a:b;
 }
 public static int max(int a,int b,int c){
 return (a>b && a>c)?a:b>c?b:c;
 }
 public static int min(int a,int b){
 return (a<b)?a:b;
 }
 public static int min(int a,int b,int c){
 return (a<b && a<c)?a:b<c?b:c;
 }
 public static int factorial(int n){
 int f=1;
 while(n>0){
 f*=n--;
 }
 return f;
 }
 
}
public class javalab2Q4{
 public static void main (String[] args) {
 Scanner sc=new Scanner(System.in);
 int choice,n,x,y,z;
 MathOperations obj=new MathOperations();
 System.out.println("1.Max of two no's\n2.Max of three no's\n3.Min of two no's\n4.Min of three no's\n5.Factorial\n6.Accessing constants\n7.Exit");
 while(true){
 System.out.println("Enter your choice: ");
 choice=sc.nextInt();
 switch(choice){
 case 1:
 System.out.println("Enter two numbers: ");
 x=sc.nextInt();
 y=sc.nextInt();
 System.out.println("Max of two numbers is: "+obj.max(x,y));
 break;
 case 2:
 System.out.println("Enter three numbers: ");
 x=sc.nextInt();
 y=sc.nextInt();
 z=sc.nextInt();
 System.out.println("Max of three numbers is: "+obj.max(x,y,z));
 break;
 case 3:
 System.out.println("Enter two numbers: ");
 x=sc.nextInt();
 y=sc.nextInt();
 System.out.println("Min of two numbers is: "+obj.min(x,y));
 break;
 case 4:
 System.out.println("Enter three numbers: ");
 x=sc.nextInt();
 y=sc.nextInt();
 z=sc.nextInt();
 System.out.println("Min of three numbers is: "+obj.min(x,y,z));
 break;
 case 5:
 System.out.println("Enter a number to find factorial: ");
 x=sc.nextInt();
 System.out.println("Factorial of the number is:"+obj.factorial(x));
 break;
 case 6:
 System.out.println("PI value is:"+obj.PI);
 System.out.println("PI/2 value is:"+obj.PI_2);
 System.out.println("Sqrt of 2 value is:"+obj.SQRT2);
 System.out.println("Sqrt(2)/2 value is:"+obj.SQRT2_2);
break;
 case 7:
System.exit(0);
 }
 }
 }
}