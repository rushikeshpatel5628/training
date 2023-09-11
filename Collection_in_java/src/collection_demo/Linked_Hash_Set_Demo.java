package collection_demo;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linked_Hash_Set_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> lHashSet = new LinkedHashSet<>();
		
		lHashSet.add("Monday");
		lHashSet.add("Tuesday");
		lHashSet.add("Wednesday");
		lHashSet.add("Thursday");
		lHashSet.add("Friday");
		lHashSet.add("Saturday");
		lHashSet.add("Sunday");
		
		System.out.println("Weekdays : " + lHashSet);
		
		Iterator<String> itr = lHashSet.iterator();
		 while (itr.hasNext()) {
	            String element = itr.next();
	            System.out.println(element);
	     }
		

	}

}
