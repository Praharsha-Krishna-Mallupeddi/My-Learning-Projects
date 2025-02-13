import java.util.*;

class StackException extends Exception {
     private String msg;

    StackException(String msg) {
        this.msg = msg;
    }

    public String toString() {
        return msg;
    }
}

class stackimp {
    int top;
    int A[];
    int size;

    stackimp(int size) {
        this.size = size;
        top = -1;
        A = new int[size];
    }

    void push(int v) throws StackException {
        if (top == (size - 1)) {
            StackException e1 = new StackException("Overflow");
            throw e1;
        } else {
            top++;
            A[top] = v;
        }
    }

    int pop() throws StackException {
        if (top == -1) {
            StackException e1 = new StackException("Underflow");
            throw e1;
        } else {
            int poppedValue = A[top];
            top--;
            return poppedValue;
        }
    }

    void display() {
        for (int i = 0; i <= top; i++) {
            System.out.println(A[i]);
        }
    }
}

public class Stackdemo1 
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        stackimp st = new stackimp(5);
        int ch = 0;
        boolean flag = true;
        while (flag) {
            System.out.println("Enter your option from\n1. Push\n2. Pop\n3. Display\n4. Exit");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter element");
                    int v = sc.nextInt();
                    try {
                        st.push(v);
                        System.out.println(v + " pushed");
                    } catch (StackException e) {
                        System.out.println(e);
                    }
                    break;
                case 2:
                    try {
                        int e = st.pop();
                        System.out.println(e + " popped");
                    } catch (StackException e) {
                        System.out.println(e);
                    }
                    break;
                case 3:
                    st.display();
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid option");
                }
            }
        }
}