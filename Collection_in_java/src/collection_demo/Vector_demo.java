package collection_demo;

import java.util.Enumeration;
import java.util.Vector;

public class Vector_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	     Vector<Integer>   numbers = new Vector<>(5);
	     
	     numbers.add(12);
	     numbers.add(23);
	     numbers.add(1);
	     numbers.add(20);
	     numbers.add(11);

	     Enumeration<Integer> em = numbers.elements();
	        while(em.hasMoreElements()) {
	        	 System.out.println(em.nextElement());
	        }
	        
	        System.out.println("Odd numbers are : ");
	        for (int number : numbers) {
	            if (number % 2 != 0) {
	                System.out.print(number + " ");
	            }
	        }


	}

}
