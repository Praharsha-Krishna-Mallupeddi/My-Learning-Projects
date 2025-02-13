class MyGen<T>{  
T obj;  
void add(T obj){this.obj=obj;}  
T get(){return obj;}  
} 
class Sum
{  int x,y;
  Sum(int x, int y){this.x=x;this.y=y;}
   int find()
   { return (x+y);}
}
class TestGeneric{  
public static void main(String args[]){  
MyGen<Integer> m=new MyGen<Integer>();  
m.add(2);  

System.out.println(m.get()); 

MyGen<String> S=new MyGen<String>();
S.add("RVRJC");
String st=S.get();
System.out.println(st); 

Sum s=new Sum(23,45);
MyGen<Sum> A=new MyGen<Sum>();
A.add(s);
Sum ss=A.get();
System.out.println(ss.find()); 

}}   