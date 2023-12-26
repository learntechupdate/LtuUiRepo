package practicejava.riyaz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionsDemo {

	public static void main(String[] args) {
		Collection c = new ArrayList();
		
		c.add(10.99);
		c.add(10);
		c.add("AUTOMATION");
		System.out.println(c);
		
		Iterator i = c.iterator();
		while(i.hasNext())
		{
			
			System.out.println(i.next());
			
		}
		
		
		//List as it works with index number
		System.out.println("List");
        List l = new ArrayList();
		
		l.add(11.99);
		l.add(11);
		l.add("AUTOMATIONList");
		l.add(1, "New");
		
		System.out.println(l.get(1));
		
		for (Object o : l) {
			System.out.println(o);
		}
		
		System.out.println("Tradiation for loop");
		for (int j = 0; j < l.size(); j++) {
			
			System.out.println(l.get(j));
		}
		
		
		
		
		
		
		
		
		
		
	} 
}
