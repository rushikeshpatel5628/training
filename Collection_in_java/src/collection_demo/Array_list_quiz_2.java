package collection_demo;

import java.util.ArrayList;
import java.util.List;

public class Array_list_quiz_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> aList = new ArrayList<String>();
		aList.add("Hello");
		aList.add("World");
		
		aList.forEach((k)->System.out.println(k));
		String ele = firstElement(aList);
		System.out.println(ele);
		
	}
	
	public static String firstElement(ArrayList<String> aList) {
		
		if (aList.size() > 0) {
			String element = aList.get(0);
			return element;
		}else{
			return "";
		}
	}

}









