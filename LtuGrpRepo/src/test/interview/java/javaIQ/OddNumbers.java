package javaIQ;

import java.util.Scanner;

class OddOrEvenLogic {
	
	public static void oddOrEvenCheck(int n) {
		if(n%2!=0)
		{
			System.out.println(n+" is an Odd Number");
		}
		
		else
		{
			System.out.println(n+" is an Even Number");
		}
		
	}
	
}


public class OddNumbers {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter the number");
		int n= scn.nextInt();
		OddOrEvenLogic.oddOrEvenCheck(n);
		
	}
}
