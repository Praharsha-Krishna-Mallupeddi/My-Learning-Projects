class MyThread2 implements Runnable{
 String name;
 MyThread2(String name){
 this.name=name;
 }
 public void run(){
 for(int i=0;i<1000;i++){
 System.out.println(name+" "+i+"¥n");
 try{
 Thread.sleep(500);
 }
 catch(InterruptedException e){
 System.out.print(e);
 }
 }
 }
}
class Myth{
 public static void main(String[] args){
 System.out.println("¥nMain Start Point¥n");
 MyThread2 m1=new MyThread2("Thread 1");
 MyThread2 m2=new MyThread2("Thread 2");
 MyThread2 m3=new MyThread2("Thread 3");
 Thread t1=new Thread(m1);
 Thread t2=new Thread(m2);
 Thread t3=new Thread(m3);
 t1.start();
 t2.start();
 t3.start();
 System.out.println("¥nMain End Point¥n");
 }
}
