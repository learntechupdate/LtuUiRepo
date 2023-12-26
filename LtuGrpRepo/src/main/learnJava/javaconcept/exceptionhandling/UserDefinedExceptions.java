package javaconcept.exceptionhandling;

public class UserDefinedExceptions {

	public static void main(String[] args) {

		int i=8;
		int j=9;
		
		try {
		int k= i/j;
		
		if(k==0)
		
			throw new LTUException("This is not possible");
			System.out.println("Value of k is:  "+k);
		}
		
		catch (LTUException e) {
			System.out.println("Error Message is :"+e.getMessage());
			
		}
	}

}
