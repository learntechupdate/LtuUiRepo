package library;

public class Temp2 {


		
		 /* Function Name : Returns Numeric Value Out Of A String(AlphaNumeric or With Any Special Characters)
	   	 * Description   : 
	   	 * Parameters    :  
	   	 * Author & Date : LTU & 20-June-2021
	   	 * Modified Date :*/
	     
		public static void main(String[] args) {
			String alphaNumData="ABD1F363.45";
			returnFloatPrice(alphaNumData);
			
			System.out.println("Actual Float Result  "+returnFloatPrice(alphaNumData));
		}
	     
	     public static float returnFloatPrice(String alphaNumData) {
	  	
	    	 String returnString2 = "";
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
					//System.out.println("returnString "+returnString);
					
				}
				
				 
			}
			
			//To get the value after dot(.)
				for (int k = ch.length-2; k < ch.length; k++) {
				
				if(Character.isDigit(ch[k])==true) {
					
					returnString2 = returnString2 + ch[k];
					//System.out.println("returnString2 "+returnString2);
					
				}
				
			}
			
			
			String resultReturnString = "";
			resultReturnString = returnString + '.'+ returnString2;
			
			//System.out.println("resultReturnString "+resultReturnString);
			
			//Returning the Numeric String to Integer
			//return Integer.parseInt(returnString);
			return Float.parseFloat(resultReturnString);

	     }

}
