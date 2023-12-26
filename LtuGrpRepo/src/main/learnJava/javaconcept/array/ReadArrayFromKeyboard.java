package javaconcept.array;

import java.util.Scanner;

public class ReadArrayFromKeyboard {
	
	public static void main(String[] args) {
		
//		int arraySize;
		Scanner scn= new Scanner(System.in);
		
//		System.out.println("Enter the Array Size");
//		arraySize=scn.nextInt();
		
//		System.out.println("you have entered arrary size" + arraySize);
		
		
		int[] a= new int[5];
		
//		for (int i : a) {
//			
//			a[i]=scn.nextInt();
//		}
//		
//		for (int j : a) {
//			System.out.println(j);
//		}
		
		
		System.out.println("enter array value");
		for (int i = 0; i < a.length; i++) {
			
			a[i]=scn.nextInt();
//			System.out.println("array index : "+i);
			
		}
		
		System.out.println("your Array have entered");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		
	
		
		
	}

}
