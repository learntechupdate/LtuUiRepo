/**
 * 
 */
package javaconcept.array;

/**
 * @author 
 * 14 April 21
 */
public class Array1d {
	

	public static void main(String[] args) 
{
	
		String s[]= {"S0","S1","S2"};
		
		
		
//		System.out.println(s[1]);
		
		for (int i = s.length-1; i>=0 ; i--) {
			
			System.out.println(s[i]);
			
		}
		
		//enhanced for loop
		System.out.println("enchaned for loop");
		
		for (String e : s){
			
			System.out.println(e);
		}
		
}

}
