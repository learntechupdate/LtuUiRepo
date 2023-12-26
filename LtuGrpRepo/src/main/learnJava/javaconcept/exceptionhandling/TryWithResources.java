package javaconcept.exceptionhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResources {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int n = 0;
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			
			
			System.out.println("Read Input ");
			n = Integer.parseInt(br.readLine());
			System.out.println("Try With Resources - Value of n is:  "+n);
		} 
		
		
	}
	
}
