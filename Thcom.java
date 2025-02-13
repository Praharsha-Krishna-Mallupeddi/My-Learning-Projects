class Q
{
    int n;
    boolean status=false;
    synchronized int get()
    {
        if(status==false)
        {
            try{
                wait();
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
            System.out.println("GOT"+n);
            status=false;
            notify();
           return n;
    }
    synchronized void put(int n)
    {
        if(status==true){
            try{
                wait();
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
            this.n =n;
            status=true;
            System.out.println("Put"+n);
            notify();
        
    }
}
class Producer extends Thread{
    Q buffer;
    Producer(Q q)
    {
        buffer=q;
    }
    public void run(){
        int i=0;
        while(true){
            buffer.put(i++);
        }
    }
}
class Consumer extends Thread{
    Q buffer;
    Consumer(Q q)
    {
        buffer=q;
    }
    public void run(){
        while(true){
            buffer.get();
        }
    }
}
class Thcom{
    public static void main(String[] args){
        Q q=new Q();
        Consumer c=new Consumer(q);
        Producer p=new Producer(q);
        c.start();
        p.start();
    }
}


