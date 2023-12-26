package javaIQ;

import java.util.HashSet;
import java.util.Set;

public class DuplicateNumberInArray {

	public static Set<Integer> findDuplicates(int[] input) {
		
		Set<Integer> duplicates = new HashSet<Integer>(); 
		
		for (int i = 0; i < input.length; i++)
		{
			for (int j = 1; j < input.length; j++)
			{ 
				if (input[i] == input[j] && i != j) 
				{ 
					// duplicate element found 
					duplicates.add(input[i]); 
					break; 
					
				}
			}
			}
		return duplicates;
		}
				
	
	public static void main(String[] args) {
		int arr[] = new int[] {1,3,3,3,2,2,2,2,5,5};
		
		System.out.println("Duplicate Elements"+findDuplicates(arr));
	}

}
