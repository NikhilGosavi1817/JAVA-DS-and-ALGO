package vectorAndStacks;

import linkedLists.MyLinkedList;

public class MyStack<E> {

	private MyLinkedList<E> ll = new MyLinkedList<>();

	void push(E e) {
		ll.add(e);
	}

	E pop() throws Exception {
		if (ll.isEmpty()) {
			throw new Exception("Popping from an empty stack is not possible");
		}
		return ll.removeLast();
	}

	E peek() throws Exception {
		if (ll.isEmpty()) {
			throw new Exception("Peeking from an empty stack is not possible");
		}
		return ll.getLast();
	}

}
