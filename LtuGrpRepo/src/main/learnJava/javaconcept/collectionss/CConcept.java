package javaconcept.collectionss;

import java.util.ArrayList;
import java.util.Collection;

public class CConcept {
	
	public static void main(String[] args) {
		
		//object type
		Collection c=new ArrayList();
		c.add(1);
		c.add("String");
		
		//generic
		Collection<Integer> g=new ArrayList<Integer>();
		g.add(1);
		g.add(2);
		
          System.out.println(g);		
		
		//index no we go for list
		
	}

}
