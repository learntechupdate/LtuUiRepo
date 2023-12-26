package javaconcept.exceptionhandling;

public class TryCatch {
	
	public static void main(String[] args) {
		try{
			int a[] = new int[6];
			a[7]=7;
			int i=4;
		
			int j=i/0;
		
			//System.out.println("J Value is " +j);
			}
		
		catch(ArithmeticException e)
			{
				System.out.println("ArithmeticException is " +e);
			}
		catch(ArrayIndexOutOfBoundsException ai)
		{
			System.out.println("ArrayIndexOutOfBoundsException is " +ai);
		}
		
		catch(Exception ex)
		{
			System.out.println("Exception is " +ex);
		}
		
		finally
			{
			System.out.println(" Finally Block Statements ");
			}
}
	
	
}
