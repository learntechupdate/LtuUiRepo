package javaconcept.collectionss;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
	
	public static void main(String[] args) {
		
		Collection c = new ArrayList();
		c.add(20);
		c.add(35);
		c.add("Test");
		
		System.out.println(c);
		
		Iterator i = c.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());			
		}
		
		
		
	}

}
