package javaconcept.collectionss;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		
		Set s = new HashSet<>();		
		s.add(800);
		s.add(200);
		s.add(400);
		s.add(200);
		s.add("Shekar");
		
		
		
		
		
		System.out.println(s);
		
		
		Set m = new TreeSet();	
		m.add("850");
		m.add("220");
		m.add("430");
		m.add("220");
//		m.add(630);//ClassCastException: class java.lang.String cannot be cast to class java.lang.Integer 
		m.add("Shekar");
		
		System.out.println(m);
		
		
	}

}
