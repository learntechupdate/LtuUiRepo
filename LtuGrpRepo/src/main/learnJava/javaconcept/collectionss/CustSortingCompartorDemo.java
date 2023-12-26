package javaconcept.collectionss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustSortingCompartorDemo {
	
	public static void main(String[] args) {
		
		List<Integer> values = new ArrayList<>();
		values.add(9298);
		values.add(5367);
		values.add(5879);
		values.add(3572);
		
		
		Comparator <Integer> comp = new Comparator<Integer>() {
			
			public int compare(Integer i, Integer j) {
				return i%10>j%10?1:-1;
				
			}
		};
		
		
		/*
		System.out.println("Lamda expression");
		Comparator <Integer> comp = (i,j)-> i%10>j%10?1:-1;
		*/
			
		
		Collections.sort(values,comp);
		
		for (Integer a : values) {
			System.out.println(a);	
		}
		
		
	}

}