package deque;

public class MyDeque<E> {

	public Node<E> head, tail;

	public void addToHead(E data) {
		Node<E> toAdd = new Node<>(data);

		if (head == null) {
			head = tail = toAdd;
			return;
		}

		head.next = toAdd;
		toAdd.prev = head;
		head = toAdd;
	}

	public void addToLast(E data) {
		Node<E> toAdd = new Node<>(data);

		if (tail == null) {
			head = tail = toAdd;
			return;
		}

		tail.prev = toAdd;
		toAdd.next = tail;
		tail = toAdd;
	}

	public E removeLast() {
		if (head == null) {
			return null;
		}

		Node<E> toRemove = tail;
		tail = tail.next;
		tail.prev = null;

		if (tail == null) {
			head = null;
		}

		return toRemove.data;
	}

	public E removeHead() {
		if (tail == null) {
			return null;
		}

		Node<E> toRemove = head;
		head = head.prev;
		head.next = null;

		if (head == null) {
			tail = null;
		}

		return toRemove.data;
	}

	public static class Node<E> {
		E data;
		Node<E> next, prev;

		public Node(E data) {
			this.data = data;
			this.next = this.prev = null;
		}
	}

	public E peekHead() {
		if (head == null) {
			return null;
		}
		return head.data;
	}

	public E peekLast() {
		if (tail == null) {
			return null;
		}
		return tail.data;
	}

}
