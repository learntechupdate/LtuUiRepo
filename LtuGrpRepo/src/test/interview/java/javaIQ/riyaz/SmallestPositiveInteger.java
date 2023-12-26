package javaIQ.riyaz;

import java.util.Arrays;
import java.util.Scanner;

class FindSmallestPositiveInteger {

	public static int smallestpositiveint(int[] array){
		
		Arrays.sort(array);
		for (int k = 0; k < array.length; k++) {
			
			System.out.println(array[k]);
		}
		
		int i=1;
		int j;
		for (j = 0; j < array.length; j++) {
			
			if(array[j]==i) {
				
				i++;
				}
			}	
		return i;
		}
	
}


public class SmallestPositiveInteger{
	
	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter arrary size");
		int arraysize=scn.nextInt();
		System.out.println("arraysize is"+arraysize);
		
		int[] array=new int[arraysize];
		
		System.out.println("Enter the Interfer iar");
		
		for (int i = 0; i < array.length; i++) {
			array[i]=scn.nextInt();
		}
         
		for (int n=0; n < array.length; n++) {
			System.err.println(array[n]);
		}
		
		int smallestPostiveinter = FindSmallestPositiveInteger.smallestpositiveint(array);
		System.out.println("SmallestPostiveinter is : "+smallestPostiveinter);
		
		scn.close();
		
	}
}