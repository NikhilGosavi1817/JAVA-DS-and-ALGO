package linkedLists;

public class MainLinkedList {

	public static void main(String[] args) {

		MyLinkedList<String> myll = new MyLinkedList();
		for (int i = 0; i < 10; i++) {
			myll.add(i + " added  ");
		}

		myll.print();

//		List<Integer> ll = new LinkedList<>();
//		List<Integer> al = new ArrayList<>();
//		ll.add(12);
//		ll.add(2);
//		ll.add(1);
//		getTimeDiff(al);
//		getTimeDiff(ll);
	}

//	static void getTimeDiff(List<Integer> list) {
//
//		long start = System.currentTimeMillis();
//
//		for (int i = 0; i < 100000; i++) {
//			list.add(0, i);
//		}
//
//		long end = System.currentTimeMillis();
//
//		System.out.println(list.getClass().getName() + " -->" + (end - start));
//	}

}
