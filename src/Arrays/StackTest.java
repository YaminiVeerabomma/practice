package Arrays;
import java.util.*; 

public class StackTest { 
	public static void main(String[] args) 
	{ 
       Stack<String> STACK = new Stack<String>();
       STACK.push("hello");
       STACK.push("hi");
       STACK.push("namaste");
       STACK.push("onakam");
       STACK.push("adhabarese");
       System.out.println(STACK);
       STACK.pop();
       System.out.println(STACK);
       System.out.println(STACK.search("2"));
       System.out.println(STACK.peek());
       

	} 
} 
