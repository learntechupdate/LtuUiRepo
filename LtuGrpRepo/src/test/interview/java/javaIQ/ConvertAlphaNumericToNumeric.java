package javaIQ;

import java.util.Iterator;
import java.util.Scanner;

public class ConvertAlphaNumericToNumeric {
	public static void main(String[] args) {
		String data1, data2;
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Please Enter your Data 1");
		data1 = scn.nextLine();
		
		//data2 = "1234";
		
	   
		System.out.println("Output Data1:  " + ConvertAlphaNumericToNumeric.returnNumericString(data1));
	    
	    
	    //System.out.println("Data2:  " + ConvertAlphaNumericToNumeric.returnNumericString(data2));
		
		
	}
	public static int returnNumericString(String alphaNumData) {
		
		 String returnString = "";
		  
	    // Creating array of string length
	        char[] ch = new char[alphaNumData.length()];
	        
	        //System.out.println("Lenght  "+ch.length);
	        
	    // Copy character by character into array
        for (int i = 0; i < alphaNumData.length(); i++) {
            ch[i] = alphaNumData.charAt(i);
            
            //System.out.println("Copy character by character into array: "+ch[i]);
            
        }
		
        //Fetching only integers
		for (int j = 0; j < ch.length; j++) {
			if(Character.isDigit(ch[j])==true) {
				  //if it's a number add it to the string.
				returnString = returnString + ch[j];
				
				//System.out.println("Fetching only integers  "+returnString);
			}
		}
		
		
		//Returning the Numeric String to Integer
		return Integer.parseInt(returnString);
		 
			
			
		}
}
