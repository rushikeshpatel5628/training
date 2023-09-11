package collection_demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Collection_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> list1= new ArrayList();
		list1.add("AAA");
		list1.add("BBB");
		list1.add("CCC");
		list1.add("DDD");
		
//		Using Iterator
		Iterator itr = list1.iterator();
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}
		
		
//		Using forEach (Lamda function)
		list1.forEach((k)-> System.out.println(k));
		
//		Generilized arraylist
		ArrayList list2 = new ArrayList<>();
		list2.add("AAA");
		list2.add(true);
		list2.add(12);
		
		list2.forEach((k)-> System.out.println(k));
		
//		LinkedList
		LinkedList l1 = new LinkedList<String>();
		l1.add("GGG");
		l1.add("LL add method");
		l1.add(2, "at 2nd index"); //at specified index
		
		l1.forEach((k)-> System.out.println(k));
		
		
	}

}
