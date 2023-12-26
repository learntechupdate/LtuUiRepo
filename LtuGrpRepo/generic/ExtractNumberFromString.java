package library.generic;

public class ExtractNumberFromString {
	
	private static String ConvertToNumericString(String inputString) 
	
	{
		
		String outputString= "";

		for(char ch : inputString.toCharArray() )
		{
			if (Character.isDigit(ch)) {
				
				outputString=outputString+ch;
			}
		}
		
		return outputString;
		
	}
	
	public static int  AlpaNumericToInteger(String inputString) {
		
		return Integer.parseInt(ExtractNumberFromString.ConvertToNumericString(inputString));
	
	}

}
