package practicejava.riyaz;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

	public static void main(String[] args) {
		
		Set<Integer> values = new HashSet<>();
		System.out.println("Hash Set Values");	
		System.out.println(values.add(87));
		System.out.println(values.add(98));
		System.out.println(values.add(99));
		System.out.println(values.add(77));
		System.out.println(values.add(87));//This will not get added
		
		for (Integer integer : values) {
			System.out.println(integer);//This will not be in sequence
			
		}
		
Set<Integer> values2 = new TreeSet<>();
	System.out.println("Tree Set Values");	
		System.out.println(values2.add(87));
		System.out.println(values2.add(98));
		System.out.println(values2.add(99));
		System.out.println(values2.add(77));
		System.out.println(values2.add(87));
		
		for (Integer integer : values2) {
			System.out.println(integer);
			
		}
	}
	
}
