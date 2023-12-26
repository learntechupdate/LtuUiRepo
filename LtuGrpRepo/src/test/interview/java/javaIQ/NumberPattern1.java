package javaIQ;

/*
  Numeric Pattern
 1 2 3 4  
 2 3 4 5 
 3 4 5 6
 4 5 6 7
 
 */

public class NumberPattern1 {
	
	public static void main(String[] args) {
		
		int row=8;
		
		
		for (int i = 1; i < row; i++) {
								
				 int p=i;
					
//				 for (int n1 = 1; n1 <= 5; n1++) {
//					 
//					 System.out.print(p); 
//					 p++; 
//					
//				}
				 
				  int n1=1;                
                 while (n1<=5) {
                	
               	 System.out.print(p+",");
               	 p++;
               	 n1++;
			} 
//				  
				 
				 System.out.println(" ");
     
		
	}

}
}
