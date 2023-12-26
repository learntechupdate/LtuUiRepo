package javaIQ;

import java.util.Scanner;

public class FibonacciSeries {
	public static void fibonacciSeries(int count) {
		int a[] = new int[count - 1];

		a[0] = 0;
		a[1] = 1;

		for (int i = 2; i <= count - 2; i++) {
			a[i] = a[i - 1] + a[i - 2];

		}

		for (int i = 0; i < a.length; i++) {
			System.out.print( a[i] +" ");
		}

	}

	public static void main(String[] args) {
		System.out.println("Please enter the squ of fibonacci to be printed");
		Scanner scn = new Scanner(System.in);
		int input = scn.nextInt();

		FibonacciSeries.fibonacciSeries(input);

		scn.close();
	}
}
