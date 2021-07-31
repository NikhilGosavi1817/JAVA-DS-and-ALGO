package queue;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		
//		Queue<Integer> q =new LinkedList<>();
//		
//		q.add(18);
//		q.add(17);
//		q.add(32);
//		
//		System.out.println(q);
//		
//		System.out.println(q.remove());
//		System.out.println(q.remove());

		MyQueue<Integer> mq = new MyQueue<>();
		
		mq.enqueue(18);
		mq.enqueue(17);
		mq.enqueue(32);		
		
		System.out.println(mq.dequeue());
		System.out.println(mq.peek());
		
	}

}
