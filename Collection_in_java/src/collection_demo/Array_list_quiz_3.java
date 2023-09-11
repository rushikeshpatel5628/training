package collection_demo;

import java.util.ArrayList;
import java.util.Collections;

public class Array_list_quiz_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> aList = new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++) {
			aList.add(i);
		}
		
//		aList.forEach((k)->System.out.println(k));
		System.out.println("Original list : " + aList);
		
		Collections.reverse(aList);
		
		System.out.println("Reverse list : " + aList);
		

	}

}
