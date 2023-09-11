package collection_demo;

import java.util.ArrayDeque;
import java.util.Iterator;

public class Array_Dequeue_DEmo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<Integer> aDeque = new ArrayDeque<>(5);
		
		aDeque.add(1);
		aDeque.add(2);
		aDeque.add(3);
		aDeque.add(4);
		aDeque.add(5);
		
		Iterator<Integer> itr = aDeque.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("First element : " + aDeque.pollFirst());
		System.out.println("Last element : " + aDeque.pollLast());

		System.out.println(aDeque);
	}

}
