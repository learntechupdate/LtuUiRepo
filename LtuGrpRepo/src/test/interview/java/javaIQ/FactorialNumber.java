package javaIQ;

import java.util.Scanner;

class FactorialLogic {

	public static void factorialOfNumber(int input) {
		int num = input;
		int fact = 1;

		for (int i = num; i > 0; i--) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + input + "! : " + fact);
	}
}

public class FactorialNumber {
	public static void main(String[] args) {

		System.out.println("Please enter any Number");
		Scanner scn = new Scanner(System.in);
		int input = scn.nextInt();

		FactorialLogic.factorialOfNumber(input);

		scn.close();
	}

}
