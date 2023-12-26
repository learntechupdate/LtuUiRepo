package javaconcept.array;

public class Array2d {
	
	public static void main(String[] args) {
		
	System.out.println("Jagged Array");
	int a[][]= {
		    {1,2,3},
		    {4,5,6},
		    {7,8,9,10,15},
		    {16,17},
		    {12}
		        };
	
	for (int i = 0; i < a.length; i++) {
		
		for (int j = 0; j < a[i].length; j++) {
			System.out.print(" "+a[i][j]);
		}
		System.out.println();
	}
 
	//
	System.out.println("Enhanced loop");
	for (int[] ip : a) 
	{		
	  for (int ip2 : ip) {
		
		System.out.print(ip2);
	   }
	System.out.println();
	}
	
		//test
	
	}
	
}
