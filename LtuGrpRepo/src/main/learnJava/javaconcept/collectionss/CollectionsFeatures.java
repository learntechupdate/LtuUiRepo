package javaconcept.collectionss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsFeatures {
	
	
	public static void main(String[] args) {
		
		
		List<Integer> a = new ArrayList<Integer>();
		a.add(341);
		a.add(852);
		a.add(453);
		a.add(753);
//		a.add("Sss");
		
		Collections.sort(a);
		Collections.reverse(a);
		Collections.shuffle(a);
		Collections.swap(a, 0, 1);
        
		
		System.out.println(a);
		
	}

}
