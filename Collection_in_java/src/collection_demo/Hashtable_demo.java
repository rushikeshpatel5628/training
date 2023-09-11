package collection_demo;

import java.util.Enumeration;
import java.util.Hashtable;

public class Hashtable_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<String, String> hashtable = new Hashtable<String, String>();
		hashtable.put("Nitin", "nitin123@gmail.com");
		hashtable.put("Deepak", "deepak123@gmail.comss");
		
		System.out.println(hashtable);
		
		Enumeration em = hashtable.keys();
		while (em.hasMoreElements()) {
			String nm = em.nextElement().toString();
			System.out.println(nm + " : " + hashtable.get(nm));
			
		}

	}

}
