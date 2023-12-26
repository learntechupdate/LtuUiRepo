package javaIQ.sekhar;

/*
  Numeric Pattern
 1 2 3 4  
 2 3 4 5 
 3 4 5 6
 4 5 6 7
 
 234
 
 
 ****
 ****
 *
 
 */

public class DiamondPattern {
	
	public static void main(String[] args) {
		
		int n=5;
		
		
		for (int i = 1; i < n; i++) {
								
				 int p=i;//3
				  
                 int n1=1;                
                 while (n1<=5) {
                	
               	 System.out.print(p);
               	 p++;
               	 n1++;
			}   System.out.println(" ");
     
		
	}

}
}
