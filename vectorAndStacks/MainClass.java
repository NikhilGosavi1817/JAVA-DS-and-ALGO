package vectorAndStacks;

import java.util.*;

public class MainClass {

	public static void main(String[] args) throws Exception {

//		Vector<Integer> v = new Vector();
//		v.add(18);
//		v.add(17);
//		System.out.println(v);

//		Stack<Integer> stack = new Stack();
//		stack.push(18);
//		stack.push(17);
//		stack.push(32);
//		System.out.println(stack);
//		stack.pop();
//
//		System.out.println(stack);
//		System.out.println(stack.peek());
		
		MyStack<Integer> stack = new MyStack<>();
		stack.push(18);
		stack.push(17);
		stack.push(32);
		int popped=stack.pop();

		System.out.println(popped);
		System.out.println(stack.peek());
	}

}
