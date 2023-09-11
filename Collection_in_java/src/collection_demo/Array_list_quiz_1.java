package collection_demo;

import java.util.ArrayList;

public class Array_list_quiz_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> aList = new ArrayList<Integer>();
		aList.add(1);
		aList.add(10);
		aList.add(15);
		aList.add(13);
		aList.add(20);
		
		aList.forEach((k)->System.out.println(k));
		
		int max = max(aList);
		System.out.println("MAX number : " + max);

	}
	
	public static int max(ArrayList<Integer> aList) {
		int max = aList.get(0);
		for (int i = 0; i < aList.size(); i++) {
			if (aList.get(i) > max) {
				max = aList.get(i);
			}
		}
		return max;
	}

}
