public class StackException extends Exception { 
 
private String exceptionMessage; 
 
public StackException() { 
super();
} 
 
public StackException(String exceptionMessage) 
 
{ 
super(exceptionMessage);
 this.exceptionMessage = exceptionMessage; 
} 
 
public String getExceptionMessage() 
 
{ 
return exceptionMessage; 
} 
 
public 
 
void 
 
setExceptionMessage(String exceptionMessage) 
 
{ 
this.exceptionMessage = exceptionMessage; 
}  
 
 
public String toString() { 
return "StackException: " + exceptionMessage; 
} 
} 
 
public class Stack { 
private int[] stack; 
private int top; 
 
public Stack(int size) 
 
{ 
stack = new int[size]; 
top = -1; 
} 
 
public void push(int element) throws StackException { 
if (top == stack.length - 1) { 
throw new StackException("Stack is full"); 
} 
stack[++top] = element; 
} 
 
public int pop() throws StackException { 
if (top == -1) { 
throw new StackException("Stack is empty"); 
} 
return stack[top--]; 
} 
} 
 
 
public class StackDemo { 
 
public static void main(String[] args) { 
Stack stack = new Stack(5); 
 
try { 
stack.push(10); 
stack.push(20); 
stack.push(30); 
 
System.out.println("Popped element: " + stack.pop()); 
System.out.println("Popped element: " + stack.pop()); 
 
stack.push(40); 
stack.push(50); 
 
System.out.println("Popped element: " + stack.pop()); 
} catch (StackException e) { 
System.out.println(e.toString()); 
} 
} 
} 
 