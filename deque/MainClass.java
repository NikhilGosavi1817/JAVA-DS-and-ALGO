package deque;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
//		ArrayDeque<Integer> ad = new ArrayDeque<>();

//		ad.addFirst(12);
//		ad.addFirst(187);
//
//		ad.pop();
//
//		System.out.println(ad.peek());
		
//		ad.push(18);
//		ad.push(17);
//		ad.push(32);
//		
//		System.out.println(ad.pop());
//		System.out.println(ad.pop());
		
		MyDeque<Integer> md = new MyDeque<>();
		md.addToHead(11);
		md.addToHead(66);
		
		md.addToLast(88);
		md.addToLast(77);
		
		System.out.println(md.removeLast());
		System.out.println(md.removeHead());
		
		System.out.println(md.peekHead());
		System.out.println(md.peekLast());

	}

}
