package library;

public class InterviewUtility {
	
	 /* Function Name : Returns Numeric Value Out Of A String(AlphaNumeric or With Any Special Characters)
   	 * Description   : 
   	 * Parameters    :  
   	 * Author & Date : LTU & 20-June-2021
   	 * Modified Date :*/
     
     public static int returnIntPrice(String alphaNumData) {
 		
		 String returnString = "";
		 char dot='.';
		  
	    // Creating array of string length
	        char[] ch = new char[alphaNumData.length()];

	    // Copy character by character into array
        for (int i = 0; i < alphaNumData.length(); i++) {
            ch[i] = alphaNumData.charAt(i);
        }
		
        //Fetching only integers
		for (int j = 0; j < ch.length; j++) {
			
			if (Character.valueOf(ch[j])==(Character.valueOf(dot)) ) {
				break;
			}
			
			if(Character.isDigit(ch[j])==true) {
				
				returnString = returnString + ch[j];
			}
			
			 
		}
		
		//Returning the Numeric String to Integer
		return Integer.parseInt(returnString);

     }
     
     
     public static float returnFloatPrice(String alphaNumData) {
 	  	
    	 String returnString = "";
    	 char dot='.';
	 
	    // Creating array of string length
	    char[] ch = new char[alphaNumData.length()];

	    // Copy character by character into array
        for (int i = 0; i < alphaNumData.length(); i++) {
            ch[i] = alphaNumData.charAt(i);
        }
		
        //Fetching only integers
		for (int j = 0; j < ch.length; j++) {
			
			
			if(Character.isDigit(ch[j])==true || (Character.valueOf(ch[j])==(Character.valueOf(dot)) )) {
				
				returnString = returnString + ch[j];
				//System.out.println("returnString "+returnString);
				
			}
			 
		}
		//Returning the Numeric String to Float
		return Float.parseFloat(returnString);

     }


     
     
     
}
