package javaconcept.collectionss;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashTableDemo {

	public static void main(String[] args) {
		
		
		Map aa = new Hashtable<>();
		
		aa.put("Name", "Ravi");
		aa.put("Address", "Bangalore");
		aa.put("state", "karnataka");
		
//		System.out.println(aa);
		
		 Set<String> bb = aa.keySet();
		 
		
		for (String i : bb) {
			System.out.println(i  +  " : "+ aa.get(i));
		}
		
		/*
		 * Exception in thread "main" java.lang.ClassCastException: 
		 * class java.util.HashMap$Values cannot be cast to class java.util.Set (java.util.HashMap$Values and java.util.Set are in module java.base of loader 'bootstrap')
	      at javaconcept.collectionss.Mapdemo.main(Mapdemo.java:28)
	
		Set<String> bb = (Set<String>) aa.values();
		
		for (String j : bb) {
			
			System.out.println(j);
			
		}
		*/
	}
}
