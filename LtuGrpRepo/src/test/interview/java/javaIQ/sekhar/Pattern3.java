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

public class Pattern3 {
	
	public static void main(String[] args) {
		int c = 5;
		for (int i=1; i<=c+1;i++) {
			
//			if( k>4) {
//				k-=3;
//			}
			
			int d = 6;
			
			
			for (int j=i;j<=6;j++) {
				System.out.print(j);
//				System.out.print(" ");
				d++;
			}
			System.out.println();
			
		}
		
	}

}

