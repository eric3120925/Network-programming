import java.util.*;
public class Eric {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		//push a thing into the stack
		stack.push("bottom");
		printStack(stack);
		stack.push("second");
		printStack(stack);
		stack.push("third");
		printStack(stack);
		
		//pop out a thing of the stack
		stack.pop();
		printStack(stack);
		stack.pop();
		printStack(stack);
		stack.pop();
		printStack(stack);
		
	}
	private static void printStack(Stack<String> s) {
		if(s.isEmpty())
			System.out.println("There is nothing in the stack!");
		else
			System.out.printf("%s TOP\n",s);
	}
}
