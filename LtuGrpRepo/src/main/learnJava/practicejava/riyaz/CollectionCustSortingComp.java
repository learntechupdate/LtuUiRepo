package practicejava.riyaz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionCustSortingComp {
	
	public static void main(String[] args) {
		
		List<Integer> l=new ArrayList<>();
		l.add(7891);
		l.add(1234);
		l.add(64820);
		l.add(479000);
		
		
		
		Comparator<Integer> comp = new Comparator<Integer>() {

			@Override
			public int compare(Integer i, Integer j) {
				
				return i%10>j%10?1:-1;
			}

		};
			
//			Collections.sort(l);
			Collections.sort(l, comp);
			System.out.println(l);
			
			
			
		
		
	}

}
