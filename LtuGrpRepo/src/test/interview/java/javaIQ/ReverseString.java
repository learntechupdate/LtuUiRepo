package javaIQ;


import java.util.Scanner;

class ReverseStringLogic {

	public static String reverseString(String inputData) {

		String outputData = "";
		for (int i = inputData.length() - 1; i >= 0; i--) {
			outputData = outputData + inputData.charAt(i);
		}
		return outputData;
	}

}

public class ReverseString {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter the String Data");
		String inputData = scn.nextLine();
		String outputData = ReverseStringLogic.reverseString(inputData);
		System.out.println("Reverse String is : " + outputData);
		scn.close();
	}

}
