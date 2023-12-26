package javaIQ.riyaz;


public class DemoHypen {
	static final int SIZE = 26;

	public static void main(String[] args) {

		 

		 String str="BCD";
	      
		    // function to print the character and its
		    // frequency in order of its occurrence
		    
		         // size of the string 'str'
		        int n = str.length();
		 
		        // 'freq[]' implemented as hash table
		        int[] freq = new int[SIZE];
		 
		        // accumulate freqeuncy of each character
		        // in 'str'
		        for (int i = 0; i < n; i++)
		        {
		            
					freq[str.charAt(i) - 'a']++;
		            System.out.println(freq[str.charAt(i) - 'a']);
		        }
		        
	}        

	
}
