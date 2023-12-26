package library;

public class Temp3 {


		
		 /* Function Name : Returns Numeric Value Out Of A String(AlphaNumeric or With Any Special Characters)
	   	 * Description   : 
	   	 * Parameters    :  
	   	 * Author & Date : LTU & 20-June-2021
	   	 * Modified Date :*/
	     
		public static void main(String[] args) {
			String alphaNumData="ABD1F363.45gs";
			returnFloatPrice(alphaNumData);
			
			System.out.println("Actual Float Result  "+returnFloatPrice(alphaNumData));
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

			return Float.parseFloat(returnString);

	     }

}
