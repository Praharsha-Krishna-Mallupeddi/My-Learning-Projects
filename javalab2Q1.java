import java.util.Scanner;
import java.io.*;
class Stack{
private int array[],size,top;
public Stack(int size){
this.top=-1;
this.size=size;
array=new int[size];
}
public int peak(){
if(top==-1){
System.out.println("\nStack Empty!\n");
return 0;
}
else
return array[top];
}
public void push(int x){
if(top==size-1)
System.out.println("\nStack Full\n");
else
array[++top]=x;
}
public int pop(){
if(top==-1){
System.out.print("\nStack Empty\n");
return 0;
}
else
return array[top--];
}
public void display(){
if(top==-1)
System.out.println("\nStack Empty\n");
else{
int i;
System.out.print("\nThe Stack is: \n");
for(i=0;i<=top;i++)
System.out.println(array[i]+" ");
}
}
}
class javalab2Q1{
public static void main(String[] args){
int size,choice,x;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the size of stack: ");
size=sc.nextInt();
Stack obj=new Stack(size);
while(true){
System.out.println("\n1. Push\n2. Pop\n3. Peek\n4. Display\n5.Exit\n");
choice=sc.nextInt();
switch(choice){
case 1:
System.out.println("\nEnter the value to Push: ");
x=sc.nextInt();
obj.push(x);
System.out.println(x+" is Pushed onto the Stack\n");
break;
case 2:
System.out.println("\nPopped value is: "+obj.pop());
break;
case 3:
System.out.println("\nPeak value is: "+obj.peak());
break;
case 4:
obj.display();
break;
case 5:
System.exit(0);
}
}
}
}